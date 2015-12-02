// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            c, b

class e
    implements HttpResponseInterceptor
{

    private e()
    {
    }

    e(b b)
    {
        this();
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
    {
        httpcontext = httpresponse.getEntity().getContentEncoding();
        if (httpcontext == null) goto _L2; else goto _L1
_L1:
        int i;
        httpcontext = httpcontext.getElements();
        i = 0;
_L7:
        if (i >= httpcontext.length) goto _L2; else goto _L3
_L3:
        if (!httpcontext[i].getName().equalsIgnoreCase("gzip")) goto _L5; else goto _L4
_L4:
        httpresponse.setEntity(new c(httpresponse.getEntity()));
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
