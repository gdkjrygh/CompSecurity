// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            gr, bv

public class bt extends bw.a
    implements bv.a
{

    private final Object mH = new Object();
    private final String pB;
    private final Drawable pC;
    private final String pD;
    private final Drawable pE;
    private final String pF;
    private final double pG;
    private final String pH;
    private final String pI;
    private bv pJ;

    public bt(String s, Drawable drawable, String s1, Drawable drawable1, String s2, double d, 
            String s3, String s4)
    {
        pB = s;
        pC = drawable;
        pD = s1;
        pE = drawable1;
        pF = s2;
        pG = d;
        pH = s3;
        pI = s4;
    }

    public void a(bv bv1)
    {
        synchronized (mH)
        {
            pJ = bv1;
        }
        return;
        bv1;
        obj;
        JVM INSTR monitorexit ;
        throw bv1;
    }

    public void aw()
    {
label0:
        {
            synchronized (mH)
            {
                if (pJ != null)
                {
                    break label0;
                }
                gr.T("Attempt to record impression before app install ad initialized.");
            }
            return;
        }
        pJ.aw();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String bB()
    {
        return pB;
    }

    public d bC()
    {
        return e.k(pC);
    }

    public d bD()
    {
        return e.k(pE);
    }

    public String bE()
    {
        return pF;
    }

    public double bF()
    {
        return pG;
    }

    public String bG()
    {
        return pH;
    }

    public String bH()
    {
        return pI;
    }

    public String getBody()
    {
        return pD;
    }

    public void j(int i)
    {
label0:
        {
            synchronized (mH)
            {
                if (pJ != null)
                {
                    break label0;
                }
                gr.T("Attempt to perform click before app install ad initialized.");
            }
            return;
        }
        pJ.b("2", i);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
