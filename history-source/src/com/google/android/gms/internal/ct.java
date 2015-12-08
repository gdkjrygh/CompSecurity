// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cs

public final class ct extends da.a
{

    private final Object mH = new Object();
    private cv.a qD;
    private cs qE;

    public ct()
    {
    }

    public void a(cs cs1)
    {
        synchronized (mH)
        {
            qE = cs1;
        }
        return;
        cs1;
        obj;
        JVM INSTR monitorexit ;
        throw cs1;
    }

    public void a(cv.a a1)
    {
        synchronized (mH)
        {
            qD = a1;
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onAdClicked()
    {
        synchronized (mH)
        {
            if (qE != null)
            {
                qE.ai();
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
        synchronized (mH)
        {
            if (qE != null)
            {
                qE.aj();
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
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (qD == null)
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
        qD.k(i);
        qD = null;
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
        synchronized (mH)
        {
            if (qE != null)
            {
                qE.ak();
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
            synchronized (mH)
            {
                if (qD == null)
                {
                    break label0;
                }
                qD.k(0);
                qD = null;
            }
            return;
        }
        if (qE != null)
        {
            qE.am();
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
        synchronized (mH)
        {
            if (qE != null)
            {
                qE.al();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
