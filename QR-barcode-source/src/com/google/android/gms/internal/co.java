// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cn

public final class co extends cv.a
{

    private final Object mw = new Object();
    private cq.a qm;
    private cn qn;

    public co()
    {
    }

    public void a(cn cn1)
    {
        synchronized (mw)
        {
            qn = cn1;
        }
        return;
        cn1;
        obj;
        JVM INSTR monitorexit ;
        throw cn1;
    }

    public void a(cq.a a1)
    {
        synchronized (mw)
        {
            qm = a1;
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onAdClicked()
    {
        synchronized (mw)
        {
            if (qn != null)
            {
                qn.ae();
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
        synchronized (mw)
        {
            if (qn != null)
            {
                qn.af();
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
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (qm == null)
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
        qm.j(i);
        qm = null;
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
        synchronized (mw)
        {
            if (qn != null)
            {
                qn.ag();
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
            synchronized (mw)
            {
                if (qm == null)
                {
                    break label0;
                }
                qm.j(0);
                qm = null;
            }
            return;
        }
        if (qn != null)
        {
            qn.ai();
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
        synchronized (mw)
        {
            if (qn != null)
            {
                qn.ah();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
