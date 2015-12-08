// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            cg, dv

private static final class aW
{

    private final Runnable kW;
    private volatile boolean ox;

    static boolean a(aW aw)
    {
        return aw.ox;
    }

    public void aW()
    {
        dv.rp.postDelayed(kW, 250L);
    }

    public void cancel()
    {
        ox = true;
        dv.rp.removeCallbacks(kW);
    }

    public _cls1.oz(cg cg1)
    {
        ox = false;
        kW = new Runnable(cg1) {

            final cg.a oA;
            private final WeakReference oy;
            final cg oz;

            public void run()
            {
                cg cg2 = (cg)oy.get();
                if (!cg.a.a(oA) && cg2 != null)
                {
                    cg2.aV();
                    oA.aW();
                }
            }

            
            {
                oA = cg.a.this;
                oz = cg1;
                super();
                oy = new WeakReference(oz);
            }
        };
    }
}
