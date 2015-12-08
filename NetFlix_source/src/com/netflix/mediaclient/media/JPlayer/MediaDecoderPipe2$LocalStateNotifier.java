// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;


// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe2

protected class mState
{

    private static final int STATE_FLUSHED = 5;
    private static final int STATE_FLUSHING = 4;
    private static final int STATE_PAUSED = 1;
    private static final int STATE_PAUSING = 2;
    private static final int STATE_PLAYING = 3;
    private int mState;
    final MediaDecoderPipe2 this$0;

    boolean isFlushed()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mState;
        boolean flag;
        if (i == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean isFlushing()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mState;
        boolean flag;
        if (i == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean isPaused()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        int i = mState;
        if (i != 1)
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean isPausing()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mState;
        boolean flag;
        if (i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    boolean isPlaying()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mState;
        boolean flag;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    void onFlushed()
    {
        this;
        JVM INSTR monitorenter ;
        mState = 5;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void onFlushing()
    {
        this;
        JVM INSTR monitorenter ;
        mState = 4;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void onPaused()
    {
        this;
        JVM INSTR monitorenter ;
        mState = 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void onPausing()
    {
        this;
        JVM INSTR monitorenter ;
        mState = 2;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void onPlaying()
    {
        this;
        JVM INSTR monitorenter ;
        mState = 3;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected ()
    {
        this$0 = MediaDecoderPipe2.this;
        super();
        mState = 1;
    }
}
