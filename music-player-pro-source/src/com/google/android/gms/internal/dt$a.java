// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            dt, gq

private static final class cs
{

    private final Runnable mv;
    private volatile boolean st;

    static boolean a(cs cs1)
    {
        return cs1.st;
    }

    public void cancel()
    {
        st = true;
        gq.wR.removeCallbacks(mv);
    }

    public void cs()
    {
        gq.wR.postDelayed(mv, 250L);
    }

    public _cls1.sv(dt dt1)
    {
        st = false;
        mv = new Runnable(dt1) {

            private final WeakReference su;
            final dt sv;
            final dt.a sw;

            public void run()
            {
                dt dt2 = (dt)su.get();
                if (!dt.a.a(sw) && dt2 != null)
                {
                    dt2.cr();
                    sw.cs();
                }
            }

            
            {
                sw = dt.a.this;
                sv = dt1;
                super();
                su = new WeakReference(sv);
            }
        };
    }
}
