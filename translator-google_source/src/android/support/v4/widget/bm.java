// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            ci, SlidingPaneLayout, cf, bn

final class bm extends ci
{

    final SlidingPaneLayout a;

    bm(SlidingPaneLayout slidingpanelayout)
    {
        a = slidingpanelayout;
        super();
    }

    public final void a(int i)
    {
label0:
        {
            if (SlidingPaneLayout.b(a).a == 0)
            {
                if (SlidingPaneLayout.c(a) != 0.0F)
                {
                    break label0;
                }
                a.a(SlidingPaneLayout.d(a));
                SlidingPaneLayout slidingpanelayout = a;
                SlidingPaneLayout.d(a);
                slidingpanelayout.sendAccessibilityEvent(32);
                SlidingPaneLayout.a(a, false);
            }
            return;
        }
        SlidingPaneLayout slidingpanelayout1 = a;
        SlidingPaneLayout.d(a);
        slidingpanelayout1.sendAccessibilityEvent(32);
        SlidingPaneLayout.a(a, true);
    }

    public final void a(int i, int j)
    {
        SlidingPaneLayout.b(a).a(SlidingPaneLayout.d(a), j);
    }

    public final void a(View view, float f)
    {
        bn bn1 = (bn)view.getLayoutParams();
        if (!SlidingPaneLayout.e(a)) goto _L2; else goto _L1
_L1:
        int i;
label0:
        {
            i = a.getPaddingRight();
            int j = bn1.rightMargin + i;
            if (f >= 0.0F)
            {
                i = j;
                if (f != 0.0F)
                {
                    break label0;
                }
                i = j;
                if (SlidingPaneLayout.c(a) <= 0.5F)
                {
                    break label0;
                }
            }
            i = j + SlidingPaneLayout.f(a);
        }
        int k = SlidingPaneLayout.d(a).getWidth();
        i = a.getWidth() - i - k;
_L4:
        SlidingPaneLayout.b(a).a(i, view.getTop());
        a.invalidate();
        return;
_L2:
        i = a.getPaddingLeft();
        int l = bn1.leftMargin + i;
        if (f <= 0.0F)
        {
            i = l;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = l;
            if (SlidingPaneLayout.c(a) <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = l + SlidingPaneLayout.f(a);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, int i)
    {
        SlidingPaneLayout.a(a, i);
        a.invalidate();
    }

    public final boolean a(View view)
    {
        if (SlidingPaneLayout.a(a))
        {
            return false;
        } else
        {
            return ((bn)view.getLayoutParams()).b;
        }
    }

    public final int b(View view, int i)
    {
        view = (bn)SlidingPaneLayout.d(a).getLayoutParams();
        if (SlidingPaneLayout.e(a))
        {
            int j = a.getWidth();
            int l = a.getPaddingRight();
            j -= ((bn) (view)).rightMargin + l + SlidingPaneLayout.d(a).getWidth();
            l = SlidingPaneLayout.f(a);
            return Math.max(Math.min(i, j), j - l);
        } else
        {
            int k = a.getPaddingLeft();
            k = ((bn) (view)).leftMargin + k;
            int i1 = SlidingPaneLayout.f(a);
            return Math.min(Math.max(i, k), i1 + k);
        }
    }

    public final void b(View view)
    {
        a.a();
    }

    public final int c(View view)
    {
        return SlidingPaneLayout.f(a);
    }

    public final int d(View view)
    {
        return view.getTop();
    }
}
