// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.InterruptedIOException;
import okio.AsyncTimeout;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyStream, ErrorCode

class this._cls0 extends AsyncTimeout
{

    final SpdyStream this$0;

    public void exitAndThrowIfTimedOut()
        throws InterruptedIOException
    {
        if (exit())
        {
            throw new InterruptedIOException("timeout");
        } else
        {
            return;
        }
    }

    protected void timedOut()
    {
        closeLater(ErrorCode.CANCEL);
    }

    ()
    {
        this$0 = SpdyStream.this;
        super();
    }
}
