// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.net.Uri;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.utils.UriUtils;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.MultiMap;
import com.soundcloud.java.objects.MoreObjects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.api:
//            ApiObjectContentRequest, ApiMultipartRequest, StringPart, FormPart

public class ApiRequest
{
    public static class Builder
    {

        private Object content;
        private int endpointVersion;
        private List formParts;
        private final Map headers = new HashMap();
        private final String httpMethod;
        private Boolean isPrivate;
        private final MultiMap parameters;
        private ProgressListener progressListener;
        private final Uri uri;

        public transient Builder addQueryParam(Param param, Object aobj[])
        {
            return addQueryParam(param.parameter, aobj);
        }

        public transient Builder addQueryParam(String s, Object aobj[])
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = aobj[i];
                parameters.put(s, obj.toString());
            }

            return this;
        }

        public ApiRequest build()
        {
            Preconditions.checkNotNull(isPrivate, "Must specify api mode");
            if (isPrivate.booleanValue())
            {
                boolean flag;
                if (endpointVersion > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, (new StringBuilder("Not a valid api version: ")).append(endpointVersion).toString());
            }
            if (content != null)
            {
                return new ApiObjectContentRequest(uri, httpMethod, endpointVersion, isPrivate, parameters, headers, content);
            }
            if (formParts != null)
            {
                return new ApiMultipartRequest(uri, httpMethod, endpointVersion, isPrivate, parameters, headers, formParts, progressListener);
            } else
            {
                return new ApiRequest(uri, httpMethod, endpointVersion, isPrivate, parameters, headers);
            }
        }

        public Builder forPrivateApi(int i)
        {
            isPrivate = Boolean.valueOf(true);
            endpointVersion = i;
            return this;
        }

        public Builder forPublicApi()
        {
            isPrivate = Boolean.valueOf(false);
            return this;
        }

        public Builder withContent(Object obj)
        {
            content = obj;
            return this;
        }

        public Builder withFormMap(Map map)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); withFormPart(StringPart.from((String)entry.getKey(), (String)entry.getValue())))
            {
                entry = (java.util.Map.Entry)map.next();
            }

            return this;
        }

        public Builder withFormPart(FormPart formpart)
        {
            if (formParts == null)
            {
                formParts = new ArrayList();
            }
            formParts.add(formpart);
            return this;
        }

        public Builder withHeader(String s, String s1)
        {
            headers.put(s, s1);
            return this;
        }

        public Builder withProgressListener(ProgressListener progresslistener)
        {
            progressListener = progresslistener;
            return this;
        }

        public Builder withToken(Token token)
        {
            withHeader("Authorization", OAuth.createOAuthHeaderValue(token));
            return this;
        }

        public Builder(String s, String s1)
        {
            parameters = UriUtils.getQueryParameters(s);
            uri = UriUtils.clearQueryParams(Uri.parse(s));
            httpMethod = s1;
        }
    }

    public static final class Param extends Enum
    {

        private static final Param $VALUES[];
        public static final Param LOCALE;
        public static final Param OAUTH_TOKEN;
        public static final Param PAGE_SIZE;
        private final String parameter;

        public static Param valueOf(String s)
        {
            return (Param)Enum.valueOf(com/soundcloud/android/api/ApiRequest$Param, s);
        }

        public static Param[] values()
        {
            return (Param[])$VALUES.clone();
        }

        public final String toString()
        {
            return parameter;
        }

        static 
        {
            PAGE_SIZE = new Param("PAGE_SIZE", 0, "limit");
            OAUTH_TOKEN = new Param("OAUTH_TOKEN", 1, "oauth_token");
            LOCALE = new Param("LOCALE", 2, "locale");
            $VALUES = (new Param[] {
                PAGE_SIZE, OAUTH_TOKEN, LOCALE
            });
        }


        private Param(String s, int i, String s1)
        {
            super(s, i);
            parameter = s1;
        }
    }

    public static interface ProgressListener
    {

        public abstract void update(long l, long l1)
            throws IOException;
    }


    static final String HTTP_DELETE = "DELETE";
    static final String HTTP_GET = "GET";
    static final String HTTP_POST = "POST";
    static final String HTTP_PUT = "PUT";
    private static final String PRIVATE_API_ACCEPT_CONTENT_TYPE = "application/vnd.com.soundcloud.mobile.v%d+json; charset=utf-8";
    private static final String PUBLIC_API_ACCEPT_CONTENT_TYPE = "application/json";
    private final int endpointVersion;
    private final Map headers;
    private final String httpMethod;
    private final Boolean isPrivate;
    private final MultiMap queryParams;
    private final Uri uri;

    ApiRequest(Uri uri1, String s, int i, Boolean boolean1, MultiMap multimap, Map map)
    {
        uri = uri1;
        httpMethod = s;
        endpointVersion = i;
        isPrivate = boolean1;
        queryParams = multimap;
        headers = map;
    }

    public static Builder delete(String s)
    {
        return new Builder(s, "DELETE");
    }

    public static Builder get(String s)
    {
        return new Builder(s, "GET");
    }

    public static Builder post(String s)
    {
        return new Builder(s, "POST");
    }

    public static Builder put(String s)
    {
        return new Builder(s, "PUT");
    }

    public String getAcceptMediaType()
    {
        if (isPrivate.booleanValue())
        {
            return String.format(Locale.US, "application/vnd.com.soundcloud.mobile.v%d+json; charset=utf-8", new Object[] {
                Integer.valueOf(endpointVersion)
            });
        } else
        {
            return "application/json";
        }
    }

    public String getEncodedPath()
    {
        return uri.getEncodedPath();
    }

    public Map getHeaders()
    {
        return Collections.unmodifiableMap(headers);
    }

    public String getMethod()
    {
        return httpMethod;
    }

    public MultiMap getQueryParameters()
    {
        return queryParams;
    }

    public Uri getUri()
    {
        return uri;
    }

    public int getVersion()
    {
        return endpointVersion;
    }

    public boolean isPrivate()
    {
        return isPrivate.booleanValue();
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).omitNullValues().add("uri", uri.toString()).add("httpMethod", httpMethod).add("endPointVersion", endpointVersion).add("isPrivate", isPrivate).toString();
    }
}
