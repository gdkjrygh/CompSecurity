// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bn

public final class bo extends bv.a
{

    private final Object ls = new Object();
    private bq.a nA;
    private bn nB;

    public bo()
    {
    }

    public void a(bn bn1)
    {
        synchronized (ls)
        {
            nB = bn1;
        }
        return;
        bn1;
        obj;
        JVM INSTR monitorexit ;
        throw bn1;
    }

    public void a(bq.a a1)
    {
        synchronized (ls)
        {
            nA = a1;
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onAdClicked()
    {
        synchronized (ls)
        {
            if (nB != null)
            {
                nB.ab();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdClosed()
    {
        synchronized (ls)
        {
            if (nB != null)
            {
                nB.ac();
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
        Object obj = ls;
        obj;
        JVM INSTR monitorenter ;
        if (nA == null)
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
        nA.g(i);
        nA = null;
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
        synchronized (ls)
        {
            if (nB != null)
            {
                nB.ad();
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
            synchronized (ls)
            {
                if (nA == null)
                {
                    break label0;
                }
                nA.g(0);
                nA = null;
            }
            return;
        }
        if (nB != null)
        {
            nB.af();
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
        synchronized (ls)
        {
            if (nB != null)
            {
                nB.ae();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
