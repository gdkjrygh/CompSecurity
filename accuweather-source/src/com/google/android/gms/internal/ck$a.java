// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ck, eu

private static final class aX
{

    private final Runnable le;
    private volatile boolean oL;

    static boolean a(aX ax)
    {
        return ax.oL;
    }

    public void aX()
    {
        eu.ss.postDelayed(le, 250L);
    }

    public void cancel()
    {
        oL = true;
        eu.ss.removeCallbacks(le);
    }

    public _cls1.oN(ck ck1)
    {
        oL = false;
        le = new Runnable(ck1) {

            private final WeakReference oM;
            final ck oN;
            final ck.a oO;

            public void run()
            {
                ck ck2 = (ck)oM.get();
                if (!ck.a.a(oO) && ck2 != null)
                {
                    ck2.aW();
                    oO.aX();
                }
            }

            
            {
                oO = ck.a.this;
                oN = ck1;
                super();
                oM = new WeakReference(oN);
            }
        };
    }
}
