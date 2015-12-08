// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            bj, cm

private static final class ab
{

    private final Runnable el;
    private volatile boolean gg;

    static boolean a(ab ab1)
    {
        return ab1.gg;
    }

    public void ab()
    {
        cm.hO.postDelayed(el, 250L);
    }

    public void cancel()
    {
        gg = true;
        cm.hO.removeCallbacks(el);
    }

    public _cls1.gi(bj bj1)
    {
        gg = false;
        el = new Runnable(bj1) {

            private final WeakReference gh;
            final bj gi;
            final bj.a gj;

            public void run()
            {
                bj bj2 = (bj)gh.get();
                if (!bj.a.a(gj) && bj2 != null)
                {
                    bj2.aa();
                    gj.ab();
                }
            }

            
            {
                gj = bj.a.this;
                gi = bj1;
                super();
                gh = new WeakReference(gi);
            }
        };
    }
}
