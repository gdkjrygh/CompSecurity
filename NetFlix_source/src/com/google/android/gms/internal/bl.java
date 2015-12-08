// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bk

public final class bl extends bs.a
{

    private final Object li = new Object();
    private bn.a nl;
    private bk nm;

    public bl()
    {
    }

    public void P()
    {
        synchronized (li)
        {
            if (nm != null)
            {
                nm.X();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(bk bk1)
    {
        synchronized (li)
        {
            nm = bk1;
        }
        return;
        bk1;
        obj;
        JVM INSTR monitorexit ;
        throw bk1;
    }

    public void a(bn.a a1)
    {
        synchronized (li)
        {
            nl = a1;
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onAdClosed()
    {
        synchronized (li)
        {
            if (nm != null)
            {
                nm.Y();
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
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        if (nl == null)
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
        nl.f(i);
        nl = null;
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
        synchronized (li)
        {
            if (nm != null)
            {
                nm.Z();
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
            synchronized (li)
            {
                if (nl == null)
                {
                    break label0;
                }
                nl.f(0);
                nl = null;
            }
            return;
        }
        if (nm != null)
        {
            nm.ab();
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
        synchronized (li)
        {
            if (nm != null)
            {
                nm.aa();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
