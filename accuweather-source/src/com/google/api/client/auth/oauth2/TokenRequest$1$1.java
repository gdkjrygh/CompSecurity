// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            TokenRequest

class val.interceptor
    implements HttpExecuteInterceptor
{

    final ntercept this$1;
    final HttpExecuteInterceptor val$interceptor;

    public void intercept(HttpRequest httprequest)
        throws IOException
    {
        if (val$interceptor != null)
        {
            val$interceptor.intercept(httprequest);
        }
        if (clientAuthentication != null)
        {
            clientAuthentication.intercept(httprequest);
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$interceptor = HttpExecuteInterceptor.this;
        super();
    }

    // Unreferenced inner class com/google/api/client/auth/oauth2/TokenRequest$1

/* anonymous class */
    class TokenRequest._cls1
        implements HttpRequestInitializer
    {

        final TokenRequest this$0;

        public void initialize(HttpRequest httprequest)
            throws IOException
        {
            if (requestInitializer != null)
            {
                requestInitializer.initialize(httprequest);
            }
            httprequest.setInterceptor(httprequest.getInterceptor(). new TokenRequest._cls1._cls1());
        }

            
            {
                this$0 = TokenRequest.this;
                super();
            }
    }

}
