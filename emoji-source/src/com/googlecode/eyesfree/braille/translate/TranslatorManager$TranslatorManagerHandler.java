// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.translate;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.googlecode.eyesfree.braille.translate:
//            TranslatorManager

private class <init> extends Handler
{

    private static final int MSG_ON_INIT = 1;
    private static final int MSG_REBIND_SERVICE = 2;
    final TranslatorManager this$0;

    private void handleOnInit(int i)
    {
        if (TranslatorManager.access$900(TranslatorManager.this) != null)
        {
            TranslatorManager.access$900(TranslatorManager.this)._mth0(i);
            TranslatorManager.access$902(TranslatorManager.this, null);
        }
    }

    private void handleRebindService()
    {
        if (TranslatorManager.access$1000(TranslatorManager.this) != null)
        {
            TranslatorManager.access$1100(TranslatorManager.this);
        }
        TranslatorManager.access$1200(TranslatorManager.this);
    }

    public void destroy()
    {
        TranslatorManager.access$902(TranslatorManager.this, null);
        removeCallbacksAndMessages(null);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            handleOnInit(message.arg1);
            return;

        case 2: // '\002'
            handleRebindService();
            break;
        }
    }

    public void onInit(int i)
    {
        obtainMessage(1, i, 0).sendToTarget();
    }

    public void scheduleRebind()
    {
        this;
        JVM INSTR monitorenter ;
        if (TranslatorManager.access$700(TranslatorManager.this) >= 5)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        sendEmptyMessageDelayed(2, 500 << TranslatorManager.access$700(TranslatorManager.this));
        TranslatorManager.access$704(TranslatorManager.this);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        onInit(-1);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private ()
    {
        this$0 = TranslatorManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
