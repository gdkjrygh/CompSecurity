// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, ErrorCode

class val.errorCode extends NamedRunnable
{

    final SpdyConnection this$0;
    final ErrorCode val$errorCode;
    final int val$streamId;

    public void execute()
    {
        try
        {
            writeSynReset(val$streamId, val$errorCode);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (int i, ErrorCode errorcode)
    {
        this$0 = final_spdyconnection;
        val$streamId = i;
        val$errorCode = errorcode;
        super(final_s, _5B_Ljava.lang.Object_3B_.this);
    }
}
