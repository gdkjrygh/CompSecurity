// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.fips;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.apache.http.impl.io.AbstractSessionInputBuffer;
import org.apache.http.params.BasicHttpParams;

// Referenced classes of package com.worklight.wlclient.fips:
//            FipsHttpClient

class  extends AbstractSessionInputBuffer
{

    final FipsHttpClient this$0;
    final byte val$curlRetBytes[];

    public boolean isDataAvailable(int i)
        throws IOException
    {
        throw new RuntimeException("SessionInputBuffer.isDataAvailable was unexpectedly called.");
    }

    uffer()
    {
        this$0 = final_fipshttpclient;
        val$curlRetBytes = _5B_B.this;
        super();
        init(new ByteArrayInputStream(val$curlRetBytes), 10, new BasicHttpParams());
    }
}
