// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.wave;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui.wave:
//            Wave

private class <init>
    implements Runnable
{

    final Wave a;

    public void run()
    {
        long l = 0L;
        Wave wave = a;
        wave;
        JVM INSTR monitorenter ;
        Wave wave1;
        long l1;
        l1 = System.currentTimeMillis();
        Wave.a(a);
        a.invalidate();
        l1 = 16L - System.currentTimeMillis() - l1;
        wave1 = a;
        Exception exception;
        if (l1 >= 0L)
        {
            l = l1;
        }
        wave1.postDelayed(this, l);
        wave;
        JVM INSTR monitorexit ;
        return;
        exception;
        wave;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private (Wave wave)
    {
        a = wave;
        super();
    }

    a(Wave wave, a a1)
    {
        this(wave);
    }
}
