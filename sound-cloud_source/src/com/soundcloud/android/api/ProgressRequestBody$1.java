// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import c.e;
import c.k;
import c.x;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.api:
//            ProgressRequestBody

class val.totalBytes extends k
{

    private long bytesWritten;
    final ProgressRequestBody this$0;
    final long val$totalBytes;

    public void write(e e, long l)
        throws IOException
    {
        bytesWritten = bytesWritten + l;
        ProgressRequestBody.access$000(ProgressRequestBody.this).update(bytesWritten, val$totalBytes);
        super.write(e, l);
    }

    tener(long l)
    {
        this$0 = final_progressrequestbody;
        val$totalBytes = l;
        super(x.this);
    }
}
