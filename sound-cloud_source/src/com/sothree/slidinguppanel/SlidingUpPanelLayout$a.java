// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.support.v4.view.VelocityTrackerCompat;
import android.view.View;

// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout, d

private final class <init> extends <init>
{

    final SlidingUpPanelLayout a;

    public final void a()
    {
        if (SlidingUpPanelLayout.d(a).a != 0) goto _L2; else goto _L1
_L1:
        SlidingUpPanelLayout.a(a, SlidingUpPanelLayout.a(a, SlidingUpPanelLayout.c(a).getTop()));
        if (SlidingUpPanelLayout.e(a) != 1.0F) goto _L4; else goto _L3
_L3:
        if (SlidingUpPanelLayout.f(a) != a)
        {
            a.a();
            SlidingUpPanelLayout.a(a, a);
            SlidingUpPanelLayout slidinguppanellayout = a;
            View view = SlidingUpPanelLayout.c(a);
            if (slidinguppanellayout.f != null)
            {
                slidinguppanellayout.f.onPanelExpanded(view);
            }
            slidinguppanellayout.sendAccessibilityEvent(32);
        }
_L2:
        return;
_L4:
        if (SlidingUpPanelLayout.e(a) != 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        if (SlidingUpPanelLayout.f(a) != b)
        {
            SlidingUpPanelLayout.a(a, b);
            SlidingUpPanelLayout slidinguppanellayout1 = a;
            View view1 = SlidingUpPanelLayout.c(a);
            if (slidinguppanellayout1.f != null)
            {
                slidinguppanellayout1.f.onPanelCollapsed(view1);
            }
            slidinguppanellayout1.sendAccessibilityEvent(32);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (SlidingUpPanelLayout.e(a) < 0.0F)
        {
            SlidingUpPanelLayout.a(a, d);
            SlidingUpPanelLayout.c(a).setVisibility(8);
            SlidingUpPanelLayout slidinguppanellayout2 = a;
            View view2 = SlidingUpPanelLayout.c(a);
            if (slidinguppanellayout2.f != null)
            {
                slidinguppanellayout2.f.onPanelHidden(view2);
            }
            slidinguppanellayout2.sendAccessibilityEvent(32);
            return;
        }
        if (SlidingUpPanelLayout.f(a) != c)
        {
            a.a();
            SlidingUpPanelLayout.a(a, c);
            SlidingUpPanelLayout slidinguppanellayout3 = a;
            View view3 = SlidingUpPanelLayout.c(a);
            if (slidinguppanellayout3.f != null)
            {
                slidinguppanellayout3.f.onPanelAnchored(view3);
            }
            slidinguppanellayout3.sendAccessibilityEvent(32);
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void a(int i)
    {
        SlidingUpPanelLayout.b(a, i);
        a.invalidate();
    }

    public final void a(View view, float f)
    {
        d d1;
        int i;
        int j;
        float f1 = f;
        if (SlidingUpPanelLayout.g(a))
        {
            f1 = -f;
        }
        if (f1 > 0.0F)
        {
            i = SlidingUpPanelLayout.b(a, 1.0F);
        } else
        {
label0:
            {
                if (f1 < 0.0F)
                {
                    break label0;
                }
                if (SlidingUpPanelLayout.a(a) != 1.0F && SlidingUpPanelLayout.e(a) >= (SlidingUpPanelLayout.a(a) + 1.0F) / 2.0F)
                {
                    i = SlidingUpPanelLayout.b(a, 1.0F);
                } else
                if (SlidingUpPanelLayout.a(a) == 1.0F && SlidingUpPanelLayout.e(a) >= 0.5F)
                {
                    i = SlidingUpPanelLayout.b(a, 1.0F);
                } else
                if (SlidingUpPanelLayout.a(a) != 1.0F && SlidingUpPanelLayout.e(a) >= SlidingUpPanelLayout.a(a))
                {
                    i = SlidingUpPanelLayout.b(a, SlidingUpPanelLayout.a(a));
                } else
                {
                    if (SlidingUpPanelLayout.a(a) == 1.0F || SlidingUpPanelLayout.e(a) < SlidingUpPanelLayout.a(a) / 2.0F)
                    {
                        break label0;
                    }
                    i = SlidingUpPanelLayout.b(a, SlidingUpPanelLayout.a(a));
                }
            }
        }
_L1:
        d1 = SlidingUpPanelLayout.d(a);
        j = view.getLeft();
        if (!d1.o)
        {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        } else
        {
            d1.a(j, i, (int)VelocityTrackerCompat.getXVelocity(d1.i, d1.c), (int)VelocityTrackerCompat.getYVelocity(d1.i, d1.c));
            a.invalidate();
            return;
        }
        i = SlidingUpPanelLayout.b(a, 0.0F);
          goto _L1
    }

    public final boolean a(View view)
    {
        while (SlidingUpPanelLayout.b(a) || view != SlidingUpPanelLayout.c(a)) 
        {
            return false;
        }
        return true;
    }

    public final int b(int i)
    {
        int j = SlidingUpPanelLayout.b(a, 0.0F);
        int k = SlidingUpPanelLayout.b(a, 1.0F);
        if (SlidingUpPanelLayout.g(a))
        {
            return Math.min(Math.max(i, k), j);
        } else
        {
            return Math.min(Math.max(i, j), k);
        }
    }

    public final void b()
    {
        a.b();
    }

    public final int c()
    {
        return SlidingUpPanelLayout.h(a);
    }

    private (SlidingUpPanelLayout slidinguppanellayout)
    {
        a = slidinguppanellayout;
        super();
    }

    a(SlidingUpPanelLayout slidinguppanellayout, byte byte0)
    {
        this(slidinguppanellayout);
    }
}
