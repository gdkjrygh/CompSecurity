// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            JPlayer2, MediaDecoderBase

public class this._cls0
    implements tener
{

    final JPlayer2 this$0;

    public void onDecoderReady(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        Log.d("NF_JPlayer2", "AUDIO init'd");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("NF_JPlayer2", "VIDEO init'd");
        JPlayer2.access$200(JPlayer2.this);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onDecoderStarted(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        Log.d("NF_JPlayer2", "AUDIO ready");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("NF_JPlayer2", "VIDEO ready");
        JPlayer2.access$300(JPlayer2.this).unpause();
        JPlayer2.access$400(JPlayer2.this).unpause();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onEndOfStream(boolean flag)
    {
        JPlayer2.access$600(JPlayer2.this, flag);
        if (flag)
        {
            Log.d("NF_JPlayer2", "AUDIO END_OF_STREAM");
            return;
        } else
        {
            Log.d("NF_JPlayer2", "VIDEO END_OF_STREAM");
            return;
        }
    }

    public void onFlushed(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        Log.d("NF_JPlayer2", "AUDIO flushed");
        JPlayer2.access$200(JPlayer2.this);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("NF_JPlayer2", "VIDEO flushed");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onPasued(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        Log.d("NF_JPlayer2", "AUDIO paused");
        JPlayer2.access$200(JPlayer2.this);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("NF_JPlayer2", "VIDEO paused");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onSampleRendered(boolean flag, long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        JPlayer2.access$500(JPlayer2.this, flag, l1);
        if (!flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public tener()
    {
        this$0 = JPlayer2.this;
        super();
    }
}
