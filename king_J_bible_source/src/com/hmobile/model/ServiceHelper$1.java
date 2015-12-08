// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import java.io.IOException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.hmobile.model:
//            ServiceHelper

class this._cls0
    implements HttpRequestRetryHandler
{

    final ServiceHelper this$0;

    public boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext)
    {
        if (i < 2)
        {
            if (ioexception instanceof NoHttpResponseException)
            {
                return true;
            }
            if (ioexception instanceof ClientProtocolException)
            {
                return true;
            }
        }
        return false;
    }

    xt()
    {
        this$0 = ServiceHelper.this;
        super();
    }
}
