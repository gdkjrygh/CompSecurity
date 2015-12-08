// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class BearerToken
{
    static final class AuthorizationHeaderAccessMethod
        implements Credential.AccessMethod
    {

        static final String HEADER_PREFIX = "Bearer ";

        public String getAccessTokenFromRequest(HttpRequest httprequest)
        {
label0:
            {
                httprequest = httprequest.getHeaders().getAuthorizationAsList();
                if (httprequest == null)
                {
                    break label0;
                }
                httprequest = httprequest.iterator();
                String s;
                do
                {
                    if (!httprequest.hasNext())
                    {
                        break label0;
                    }
                    s = (String)httprequest.next();
                } while (!s.startsWith("Bearer "));
                return s.substring("Bearer ".length());
            }
            return null;
        }

        public void intercept(HttpRequest httprequest, String s)
            throws IOException
        {
            HttpHeaders httpheaders = httprequest.getHeaders();
            httprequest = String.valueOf("Bearer ");
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                httprequest = httprequest.concat(s);
            } else
            {
                httprequest = new String(httprequest);
            }
            httpheaders.setAuthorization(httprequest);
        }

        AuthorizationHeaderAccessMethod()
        {
        }
    }

    static final class FormEncodedBodyAccessMethod
        implements Credential.AccessMethod
    {

        private static Map getData(HttpRequest httprequest)
        {
            return Data.mapOf(UrlEncodedContent.getContent(httprequest).getData());
        }

        public String getAccessTokenFromRequest(HttpRequest httprequest)
        {
            httprequest = ((HttpRequest) (getData(httprequest).get("access_token")));
            if (httprequest == null)
            {
                return null;
            } else
            {
                return httprequest.toString();
            }
        }

        public void intercept(HttpRequest httprequest, String s)
            throws IOException
        {
            boolean flag;
            if (!"GET".equals(httprequest.getRequestMethod()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "HTTP GET method is not supported");
            getData(httprequest).put("access_token", s);
        }

        FormEncodedBodyAccessMethod()
        {
        }
    }

    static final class QueryParameterAccessMethod
        implements Credential.AccessMethod
    {

        public String getAccessTokenFromRequest(HttpRequest httprequest)
        {
            httprequest = ((HttpRequest) (httprequest.getUrl().get("access_token")));
            if (httprequest == null)
            {
                return null;
            } else
            {
                return httprequest.toString();
            }
        }

        public void intercept(HttpRequest httprequest, String s)
            throws IOException
        {
            httprequest.getUrl().set("access_token", s);
        }

        QueryParameterAccessMethod()
        {
        }
    }


    static final Pattern INVALID_TOKEN_ERROR = Pattern.compile("\\s*error\\s*=\\s*\"?invalid_token\"?");
    static final String PARAM_NAME = "access_token";

    public BearerToken()
    {
    }

    public static Credential.AccessMethod authorizationHeaderAccessMethod()
    {
        return new AuthorizationHeaderAccessMethod();
    }

    public static Credential.AccessMethod formEncodedBodyAccessMethod()
    {
        return new FormEncodedBodyAccessMethod();
    }

    public static Credential.AccessMethod queryParameterAccessMethod()
    {
        return new QueryParameterAccessMethod();
    }

}
