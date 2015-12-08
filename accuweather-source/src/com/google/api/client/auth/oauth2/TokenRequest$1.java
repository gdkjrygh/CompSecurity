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

class this._cls0
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
        httprequest.setInterceptor(new HttpExecuteInterceptor() {

            final TokenRequest._cls1 this$1;
            final HttpExecuteInterceptor val$interceptor;

            public void intercept(HttpRequest httprequest1)
                throws IOException
            {
                if (interceptor != null)
                {
                    interceptor.intercept(httprequest1);
                }
                if (clientAuthentication != null)
                {
                    clientAuthentication.intercept(httprequest1);
                }
            }

            
            {
                this$1 = TokenRequest._cls1.this;
                interceptor = httpexecuteinterceptor;
                super();
            }
        });
    }

    _cls1.val.interceptor()
    {
        this$0 = TokenRequest.this;
        super();
    }
}
