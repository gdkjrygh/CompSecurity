// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import java.util.Arrays;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            PublicApi, OAuth2HttpRequestInterceptor, GzipDecompressingEntity

class _cls2 extends DefaultHttpClient
{

    final PublicApi this$0;

    protected RequestDirector createClientRequestDirector(HttpRequestExecutor httprequestexecutor, ClientConnectionManager clientconnectionmanager, ConnectionReuseStrategy connectionreusestrategy, ConnectionKeepAliveStrategy connectionkeepalivestrategy, HttpRoutePlanner httprouteplanner, HttpProcessor httpprocessor, HttpRequestRetryHandler httprequestretryhandler, 
            RedirectHandler redirecthandler, AuthenticationHandler authenticationhandler, AuthenticationHandler authenticationhandler1, UserTokenHandler usertokenhandler, HttpParams httpparams)
    {
        return getRequestDirector(httprequestexecutor, clientconnectionmanager, connectionreusestrategy, connectionkeepalivestrategy, httprouteplanner, httpprocessor, httprequestretryhandler, redirecthandler, authenticationhandler, authenticationhandler1, usertokenhandler, httpparams);
    }

    protected CookieStore createCookieStore()
    {
        return PublicApi.access$000();
    }

    protected HttpContext createHttpContext()
    {
        HttpContext httpcontext = super.createHttpContext();
        httpcontext.setAttribute("http.auth.scheme-pref", Arrays.asList(new String[] {
            "oauth", "digest", "basic"
        }));
        return httpcontext;
    }

    protected BasicHttpProcessor createHttpProcessor()
    {
        BasicHttpProcessor basichttpprocessor = super.createHttpProcessor();
        basichttpprocessor.addInterceptor(new OAuth2HttpRequestInterceptor());
        return basichttpprocessor;
    }

    gy(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        this$0 = PublicApi.this;
        super(clientconnectionmanager, httpparams);
        class _cls1
            implements ConnectionKeepAliveStrategy
        {

            final PublicApi._cls5 this$1;

            public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
            {
                return 20000L;
            }

            _cls1()
            {
                this$1 = PublicApi._cls5.this;
                super();
            }
        }

        setKeepAliveStrategy(new _cls1());
        getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, -1, "SoundCloud", "oauth"), .EmptyCredentials.INSTANCE);
        getAuthSchemes().register("oauth", new .Factory(PublicApi.this));
        class _cls2
            implements HttpResponseInterceptor
        {

            final PublicApi._cls5 this$1;

            public void process(HttpResponse httpresponse, HttpContext httpcontext)
                throws HttpException, IOException
            {
                if (httpresponse != null && httpresponse.getEntity() != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                httpcontext = httpresponse.getEntity();
                Header header = httpcontext.getContentEncoding();
                if (header != null)
                {
                    HeaderElement aheaderelement[] = header.getElements();
                    int j = aheaderelement.length;
                    int i = 0;
                    while (i < j) 
                    {
                        if (aheaderelement[i].getName().equalsIgnoreCase("gzip"))
                        {
                            httpresponse.setEntity(new GzipDecompressingEntity(httpcontext));
                            return;
                        }
                        i++;
                    }
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            _cls2()
            {
                this$1 = PublicApi._cls5.this;
                super();
            }
        }

        addResponseInterceptor(new _cls2());
    }
}
