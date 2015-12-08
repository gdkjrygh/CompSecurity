// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            cj, et

private static final class bc
{

    private final Runnable lg;
    private volatile boolean oN;

    static boolean a(bc bc1)
    {
        return bc1.oN;
    }

    public void bc()
    {
        et.sv.postDelayed(lg, 250L);
    }

    public void cancel()
    {
        oN = true;
        et.sv.removeCallbacks(lg);
    }

    public _cls1.oP(cj cj1)
    {
        oN = false;
        lg = new Runnable(cj1) {

            private final WeakReference oO;
            final cj oP;
            final cj.a oQ;

            public void run()
            {
                cj cj2 = (cj)oO.get();
                if (!cj.a.a(oQ) && cj2 != null)
                {
                    cj2.bb();
                    oQ.bc();
                }
            }

            
            {
                oQ = cj.a.this;
                oP = cj1;
                super();
                oO = new WeakReference(oP);
            }
        };
    }
}
