// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;


// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerApiImpl

private static final class <init>
{

    private int mSize;

    public final void decrement()
    {
        this;
        JVM INSTR monitorenter ;
        if (mSize == 0)
        {
            throw new RuntimeException("too many decrements");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        mSize = mSize - 1;
        if (mSize == 0)
        {
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
    }

    public final void increment()
    {
        this;
        JVM INSTR monitorenter ;
        mSize = mSize + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private ()
    {
        mSize = 0;
    }

    mSize(byte byte0)
    {
        this();
    }
}
