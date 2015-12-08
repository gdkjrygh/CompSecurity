// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;


// Referenced classes of package com.google.android.m4b.maps.cv:
//            a

static final class <init>
{

    private int a;

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = a + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == 0)
        {
            throw new RuntimeException("too many decrements");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a = a - 1;
        if (a == 0)
        {
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
    }

    private ()
    {
        a = 0;
    }

    a(byte byte0)
    {
        this();
    }
}
