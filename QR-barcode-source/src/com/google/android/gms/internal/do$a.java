// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            do, gr

private static final class cj
{

    private final Runnable mk;
    private volatile boolean sc;

    static boolean a(cj cj1)
    {
        return cj1.sc;
    }

    public void cancel()
    {
        sc = true;
        gr.wC.removeCallbacks(mk);
    }

    public void cj()
    {
        gr.wC.postDelayed(mk, 250L);
    }

    public _cls1.se(do do1)
    {
        sc = false;
        mk = new Runnable(do1) {

            private final WeakReference sd;
            final do se;
            final do.a sf;

            public void run()
            {
                do do2 = (do)sd.get();
                if (!do.a.a(sf) && do2 != null)
                {
                    do2.ci();
                    sf.cj();
                }
            }

            
            {
                sf = do.a.this;
                se = do1;
                super();
                sd = new WeakReference(se);
            }
        };
    }
}
