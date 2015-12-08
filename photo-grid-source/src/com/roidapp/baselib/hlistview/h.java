// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.view.VelocityTracker;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            g, AbsHListView, ad

final class h
    implements Runnable
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void run()
    {
        int i = AbsHListView.d(a.a);
        VelocityTracker velocitytracker = AbsHListView.e(a.a);
        ad ad1 = g.a(a);
        if (velocitytracker == null || i == -1)
        {
            return;
        }
        velocitytracker.computeCurrentVelocity(1000, AbsHListView.f(a.a));
        float f = -velocitytracker.getXVelocity(i);
        if (Math.abs(f) >= (float)AbsHListView.g(a.a) && ad1.a(f))
        {
            a.a.postDelayed(this, 40L);
            return;
        } else
        {
            a.b();
            a.a.F = 3;
            a.a.b(1);
            return;
        }
    }
}
