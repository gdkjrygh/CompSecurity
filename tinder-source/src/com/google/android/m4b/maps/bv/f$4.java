// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ay;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            f

final class g
    implements Runnable
{

    private long a;
    private Interpolator b;
    private long c;
    private ay d;
    private float e;
    private float f;
    private float g;
    private f h;

    public final void run()
    {
        long l = SystemClock.uptimeMillis() - a;
        float f1 = b.getInterpolation((float)l / (float)c);
        float f2 = ar.d(d.b + e * f1);
        float f3 = ar.b(d.a + f * f1);
        float f4 = d.c;
        ay ay1 = new ay(f3, f2, f1 * g + f4);
        h.a(ay1);
        if (l < c)
        {
            com.google.android.m4b.maps.bv.f.d(h).postDelayed(this, 16L);
            return;
        } else
        {
            com.google.android.m4b.maps.bv.f.d(h).removeCallbacks(com.google.android.m4b.maps.bv.f.e(h));
            com.google.android.m4b.maps.bv.f.f(h);
            return;
        }
    }

    (f f1, long l, Interpolator interpolator, long l1, ay ay1, 
            float f2, float f3, float f4)
    {
        h = f1;
        a = l;
        b = interpolator;
        c = l1;
        d = ay1;
        e = f2;
        f = f3;
        g = f4;
        super();
    }
}
