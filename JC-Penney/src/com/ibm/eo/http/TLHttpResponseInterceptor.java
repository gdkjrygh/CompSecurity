// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.http;

import com.ibm.eo.util.HTTPUtil;
import com.ibm.eo.util.LogInternal;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.ibm.eo.http:
//            TLHttpRequestInterceptor

public class TLHttpResponseInterceptor
    implements HttpResponseInterceptor
{

    private final TLHttpRequestInterceptor tlHttpRequestInterceptor;

    public TLHttpResponseInterceptor(TLHttpRequestInterceptor tlhttprequestinterceptor)
    {
        tlHttpRequestInterceptor = tlhttprequestinterceptor;
    }

    public final void process(HttpResponse httpresponse, HttpContext httpcontext)
    {
        try
        {
            LogInternal.log("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
            LogInternal.log("Headers from response:");
            LogInternal.log(HTTPUtil.getHeaders(httpresponse.getAllHeaders()));
            LogInternal.log("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            LogInternal.logException(httpresponse);
        }
    }
}
