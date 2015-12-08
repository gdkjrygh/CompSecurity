// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, PushObserver, ErrorCode

class val.errorCode extends NamedRunnable
{

    final FramedConnection this$0;
    final ErrorCode val$errorCode;
    final int val$streamId;

    public void execute()
    {
        FramedConnection.access$2500(FramedConnection.this).onReset(val$streamId, val$errorCode);
        synchronized (FramedConnection.this)
        {
            FramedConnection.access$2600(FramedConnection.this).remove(Integer.valueOf(val$streamId));
        }
        return;
        exception;
        framedconnection;
        JVM INSTR monitorexit ;
        throw exception;
    }

    transient (int i, ErrorCode errorcode)
    {
        this$0 = final_framedconnection;
        val$streamId = i;
        val$errorCode = errorcode;
        super(final_s, _5B_Ljava.lang.Object_3B_.this);
    }
}
