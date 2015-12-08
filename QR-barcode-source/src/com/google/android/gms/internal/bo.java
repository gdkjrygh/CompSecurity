// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            gs, bq

public class bo extends br.a
    implements bq.a
{

    private final Object mw = new Object();
    private final String pl;
    private final Drawable pm;
    private final String pn;
    private final Drawable po;
    private final String pp;
    private final double pq;
    private final String pr;
    private final String ps;
    private bq pt;

    public bo(String s, Drawable drawable, String s1, Drawable drawable1, String s2, double d, 
            String s3, String s4)
    {
        pl = s;
        pm = drawable;
        pn = s1;
        po = drawable1;
        pp = s2;
        pq = d;
        pr = s3;
        ps = s4;
    }

    public void a(bq bq1)
    {
        synchronized (mw)
        {
            pt = bq1;
        }
        return;
        bq1;
        obj;
        JVM INSTR monitorexit ;
        throw bq1;
    }

    public void as()
    {
label0:
        {
            synchronized (mw)
            {
                if (pt != null)
                {
                    break label0;
                }
                gs.T("Attempt to record impression before app install ad initialized.");
            }
            return;
        }
        pt.as();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String bt()
    {
        return pl;
    }

    public d bu()
    {
        return e.k(pm);
    }

    public d bv()
    {
        return e.k(po);
    }

    public String bw()
    {
        return pp;
    }

    public double bx()
    {
        return pq;
    }

    public String by()
    {
        return pr;
    }

    public String bz()
    {
        return ps;
    }

    public String getBody()
    {
        return pn;
    }

    public void i(int j)
    {
label0:
        {
            synchronized (mw)
            {
                if (pt != null)
                {
                    break label0;
                }
                gs.T("Attempt to perform click before app install ad initialized.");
            }
            return;
        }
        pt.b("2", j);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
