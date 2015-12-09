// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.a;
import java.io.IOException;
import java.net.SocketTimeoutException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            ErrorCode, FramedStream

class this._cls0 extends a
{

    final FramedStream this$0;

    public void exitAndThrowIfTimedOut()
    {
        if (exit())
        {
            throw newTimeoutException(null);
        } else
        {
            return;
        }
    }

    protected IOException newTimeoutException(IOException ioexception)
    {
        SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
        if (ioexception != null)
        {
            sockettimeoutexception.initCause(ioexception);
        }
        return sockettimeoutexception;
    }

    protected void timedOut()
    {
        closeLater(ErrorCode.CANCEL);
    }

    ()
    {
        this$0 = FramedStream.this;
        super();
    }
}
