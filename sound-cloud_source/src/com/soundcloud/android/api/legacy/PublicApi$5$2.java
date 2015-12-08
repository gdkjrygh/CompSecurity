// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            GzipDecompressingEntity

class this._cls1
    implements HttpResponseInterceptor
{

    final ingEntity this$1;

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

    ingEntity()
    {
        this$1 = this._cls1.this;
        super();
    }
}
