// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.animation.Interpolator;

// Referenced classes of package kik.android.widget:
//            PullToRevealView

final class f
    implements Runnable
{

    final PullToRevealView a;
    private final Interpolator b;
    private final int c;
    private final int d;
    private final long e;
    private a f;
    private boolean g;
    private long h;
    private int i;

    public final void a()
    {
        g = false;
    }

    public final void run()
    {
        boolean flag;
        flag = false;
        if (h == -1L)
        {
            h = System.currentTimeMillis();
        } else
        {
            long l = Math.max(Math.min(((System.currentTimeMillis() - h) * 1000L) / e, 1000L), 0L);
            int j = Math.round((float)(d - c) * b.getInterpolation((float)l / 1000F));
            i = d - j;
            a.scrollTo(0, i);
            float f1 = (float)(-i) / (float)PullToRevealView.f();
            a.a(f1);
        }
        if (!g || c == i) goto _L2; else goto _L1
_L1:
        if (android.os.NT < 16) goto _L4; else goto _L3
_L3:
        a.postOnAnimation(this);
_L6:
        return;
_L4:
        a.postDelayed(this, 16L);
        return;
_L2:
        if (f != null)
        {
            g g1 = f;
            if (!g)
            {
                flag = true;
            }
            g1.a(flag);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public (PullToRevealView pulltorevealview, int j, int k, long l,  )
    {
        a = pulltorevealview;
        super();
        g = true;
        h = -1L;
        i = -1;
        d = j;
        c = k;
        b = PullToRevealView.c(pulltorevealview);
        e = l;
        f = ;
    }
}
