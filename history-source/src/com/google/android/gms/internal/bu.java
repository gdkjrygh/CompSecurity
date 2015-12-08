// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            gr, bv

public class bu extends bx.a
    implements bv.a
{

    private final Object mH = new Object();
    private final String pB;
    private final Drawable pC;
    private final String pD;
    private final String pF;
    private bv pJ;
    private final Drawable pK;
    private final String pL;

    public bu(String s, Drawable drawable, String s1, Drawable drawable1, String s2, String s3)
    {
        pB = s;
        pC = drawable;
        pD = s1;
        pK = drawable1;
        pF = s2;
        pL = s3;
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
                gr.T("Attempt to record impression before content ad initialized.");
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

    public String bE()
    {
        return pF;
    }

    public d bI()
    {
        return e.k(pK);
    }

    public String bJ()
    {
        return pL;
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
                gr.T("Attempt to perform click before content ad initialized.");
            }
            return;
        }
        pJ.b("1", i);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
