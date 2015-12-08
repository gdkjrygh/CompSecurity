// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            aq

public final class ar extends ay.a
{

    private final Object eJ = new Object();
    private at.a fb;
    private aq fc;

    public ar()
    {
    }

    public void a(aq aq1)
    {
        synchronized (eJ)
        {
            fc = aq1;
        }
        return;
        aq1;
        obj;
        JVM INSTR monitorexit ;
        throw aq1;
    }

    public void a(at.a a1)
    {
        synchronized (eJ)
        {
            fb = a1;
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onAdClosed()
    {
        synchronized (eJ)
        {
            if (fc != null)
            {
                fc.E();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdFailedToLoad(int i)
    {
        Object obj = eJ;
        obj;
        JVM INSTR monitorenter ;
        if (fb == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Exception exception;
        if (i == 3)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        fb.d(i);
        fb = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdLeftApplication()
    {
        synchronized (eJ)
        {
            if (fc != null)
            {
                fc.F();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdLoaded()
    {
label0:
        {
            synchronized (eJ)
            {
                if (fb == null)
                {
                    break label0;
                }
                fb.d(0);
                fb = null;
            }
            return;
        }
        if (fc != null)
        {
            fc.H();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdOpened()
    {
        synchronized (eJ)
        {
            if (fc != null)
            {
                fc.G();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void y()
    {
        synchronized (eJ)
        {
            if (fc != null)
            {
                fc.D();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
