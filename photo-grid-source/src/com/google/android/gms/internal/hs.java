// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.internal:
//            rr, hv, rp, ho, 
//            ht, hu, hm

public final class hs extends rr
{

    private final Object d = new Object();
    private hm e;
    private boolean f;
    private int g;

    public hs(hm hm)
    {
        e = hm;
        f = false;
        g = 0;
    }

    static hm a(hs hs1)
    {
        return hs1.e;
    }

    private void f()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (g >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag);
        if (!f || g != 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        zzb.v("No reference is left (including root). Cleaning up engine.");
        a(new hv(this), new rp());
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        zzb.v("There are still references to the engine. Not destroying.");
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ho a()
    {
        ho ho1 = new ho(this);
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        a(((rq) (new ht(this, ho1))), ((ro) (new hu(this, ho1))));
        Exception exception;
        boolean flag;
        if (g >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag);
        g = g + 1;
        obj;
        JVM INSTR monitorexit ;
        return ho1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (g > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag);
        zzb.v("Releasing 1 reference for JS Engine");
        g = g - 1;
        f();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        boolean flag = true;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (g < 0)
        {
            flag = false;
        }
        bl.a(flag);
        zzb.v("Releasing root reference. JS Engine will be destroyed once other references are released.");
        f = true;
        f();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
