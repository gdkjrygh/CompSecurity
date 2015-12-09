// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.zzfl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

private static final class b
{

    private final Runnable a;
    private volatile boolean b;

    static boolean a(b b1)
    {
        return b1.b;
    }

    public void a()
    {
        b = true;
        zzfl.zzCr.removeCallbacks(a);
    }

    public void b()
    {
        zzfl.zzCr.postDelayed(a, 250L);
    }

    public _cls1.a(zzg zzg1)
    {
        b = false;
        a = new Runnable(zzg1) {

            final zzg a;
            final zzg.a b;
            private final WeakReference c;

            public void run()
            {
                zzg zzg2 = (zzg)c.get();
                if (!zzg.a.a(b) && zzg2 != null)
                {
                    zzg2.zzdI();
                    b.b();
                }
            }

            
            {
                b = zzg.a.this;
                a = zzg1;
                super();
                c = new WeakReference(a);
            }
        };
    }
}
