// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.selfbraille;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.googlecode.eyesfree.braille.selfbraille:
//            SelfBrailleClient

private class <init> extends Handler
{

    private static final int MSG_REBIND_SERVICE = 1;
    private static final int MSG_UNBIND_SERVICE = 2;
    final SelfBrailleClient this$0;

    private void handleRebindService()
    {
        if (SelfBrailleClient.access$700(SelfBrailleClient.this))
        {
            return;
        }
        if (SelfBrailleClient.access$800(SelfBrailleClient.this) != null)
        {
            SelfBrailleClient.access$900(SelfBrailleClient.this);
        }
        SelfBrailleClient.access$1000(SelfBrailleClient.this);
    }

    private void handleUnbindService()
    {
        SelfBrailleClient.access$900(SelfBrailleClient.this);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            handleRebindService();
            return;

        case 2: // '\002'
            handleUnbindService();
            break;
        }
    }

    public void scheduleRebind()
    {
        this;
        JVM INSTR monitorenter ;
        if (SelfBrailleClient.access$600(SelfBrailleClient.this) < 5)
        {
            sendEmptyMessageDelayed(1, 500 << SelfBrailleClient.access$600(SelfBrailleClient.this));
            SelfBrailleClient.access$604(SelfBrailleClient.this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void unbindService()
    {
        sendEmptyMessage(2);
    }

    private ()
    {
        this$0 = SelfBrailleClient.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
