// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            TokenResponse, TokenResponseException

public class TokenRequest extends GenericData
{

    HttpExecuteInterceptor clientAuthentication;
    private String grantType;
    private final JsonFactory jsonFactory;
    HttpRequestInitializer requestInitializer;
    private String scopes;
    private GenericUrl tokenServerUrl;
    private final HttpTransport transport;

    public TokenRequest(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        transport = (HttpTransport)Preconditions.checkNotNull(httptransport);
        jsonFactory = (JsonFactory)Preconditions.checkNotNull(jsonfactory);
        setTokenServerUrl(genericurl);
        setGrantType(s);
    }

    public TokenResponse execute()
        throws IOException
    {
        return (TokenResponse)executeUnparsed().parseAs(com/google/api/client/auth/oauth2/TokenResponse);
    }

    public final HttpResponse executeUnparsed()
        throws IOException
    {
        Object obj = transport.createRequestFactory(new HttpRequestInitializer() {

            final TokenRequest this$0;

            public void initialize(HttpRequest httprequest)
                throws IOException
            {
                if (requestInitializer != null)
                {
                    requestInitializer.initialize(httprequest);
                }
                httprequest.setInterceptor(httprequest.getInterceptor(). new HttpExecuteInterceptor() {

                    final _cls1 this$1;
                    final HttpExecuteInterceptor val$interceptor;

                    public void intercept(HttpRequest httprequest)
                        throws IOException
                    {
                        if (interceptor != null)
                        {
                            interceptor.intercept(httprequest);
                        }
                        if (clientAuthentication != null)
                        {
                            clientAuthentication.intercept(httprequest);
                        }
                    }

            
            {
                this$1 = final__pcls1;
                interceptor = HttpExecuteInterceptor.this;
                super();
            }
                });
            }

            
            {
                this$0 = TokenRequest.this;
                super();
            }
        }).buildPostRequest(tokenServerUrl, new UrlEncodedContent(this));
        ((HttpRequest) (obj)).setParser(new JsonObjectParser(jsonFactory));
        ((HttpRequest) (obj)).setThrowExceptionOnExecuteError(false);
        obj = ((HttpRequest) (obj)).execute();
        if (((HttpResponse) (obj)).isSuccessStatusCode())
        {
            return ((HttpResponse) (obj));
        } else
        {
            throw TokenResponseException.from(jsonFactory, ((HttpResponse) (obj)));
        }
    }

    public final HttpExecuteInterceptor getClientAuthentication()
    {
        return clientAuthentication;
    }

    public final String getGrantType()
    {
        return grantType;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final HttpRequestInitializer getRequestInitializer()
    {
        return requestInitializer;
    }

    public final String getScopes()
    {
        return scopes;
    }

    public final GenericUrl getTokenServerUrl()
    {
        return tokenServerUrl;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public TokenRequest set(String s, Object obj)
    {
        return (TokenRequest)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public TokenRequest setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        clientAuthentication = httpexecuteinterceptor;
        return this;
    }

    public TokenRequest setGrantType(String s)
    {
        grantType = (String)Preconditions.checkNotNull(s);
        return this;
    }

    public TokenRequest setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        requestInitializer = httprequestinitializer;
        return this;
    }

    public TokenRequest setScopes(Collection collection)
    {
        if (collection == null)
        {
            collection = null;
        } else
        {
            collection = Joiner.on(' ').join(collection);
        }
        scopes = collection;
        return this;
    }

    public TokenRequest setTokenServerUrl(GenericUrl genericurl)
    {
        tokenServerUrl = genericurl;
        boolean flag;
        if (genericurl.getFragment() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return this;
    }
}
