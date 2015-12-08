// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package com.roidapp.baselib.view:
//            m, FixedDrawerLayout

final class l extends android.support.v4.widget.ViewDragHelper.Callback
{

    final FixedDrawerLayout a;
    private final int b;
    private ViewDragHelper c;
    private final Runnable d = new m(this);

    public l(FixedDrawerLayout fixeddrawerlayout, int i)
    {
        a = fixeddrawerlayout;
        super();
        b = i;
    }

    static void a(l l1)
    {
        int i = 0;
        int j = l1.c.getEdgeSize();
        View view;
        boolean flag;
        if (l1.b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = l1.a.b(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = l1.a.b(5);
            i = l1.a.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && l1.a.a(view) == 0)
        {
            FixedDrawerLayout.LayoutParams layoutparams = (FixedDrawerLayout.LayoutParams)view.getLayoutParams();
            l1.c.smoothSlideViewTo(view, i, view.getTop());
            layoutparams.c = true;
            l1.a.invalidate();
            l1.b();
            l1.a.a();
        }
    }

    private void b()
    {
        byte byte0 = 3;
        if (b == 3)
        {
            byte0 = 5;
        }
        View view = a.b(byte0);
        if (view != null)
        {
            a.f(view);
        }
    }

    public final void a()
    {
        a.removeCallbacks(d);
    }

    public final void a(ViewDragHelper viewdraghelper)
    {
        c = viewdraghelper;
    }

    public final int clampViewPositionHorizontal(View view, int i, int j)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            j = a.getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public final int clampViewPositionVertical(View view, int i, int j)
    {
        return view.getTop();
    }

    public final int getViewHorizontalDragRange(View view)
    {
        return view.getWidth();
    }

    public final void onEdgeDragStarted(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = a.b(3);
        } else
        {
            view = a.b(5);
        }
        if (view != null && a.a(view) == 0)
        {
            c.captureChildView(view, j);
        }
    }

    public final boolean onEdgeLock(int i)
    {
        return false;
    }

    public final void onEdgeTouched(int i, int j)
    {
        a.postDelayed(d, 160L);
    }

    public final void onViewCaptured(View view, int i)
    {
        ((FixedDrawerLayout.LayoutParams)view.getLayoutParams()).c = false;
        b();
    }

    public final void onViewDragStateChanged(int i)
    {
        a.a(i, c.getCapturedView());
    }

    public final void onViewPositionChanged(View view, int i, int j, int k, int i1)
    {
        j = view.getWidth();
        float f;
        if (a.a(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(a.getWidth() - i) / (float)j;
        }
        a.a(view, f);
        if (f == 0.0F)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        a.invalidate();
    }

    public final void onViewReleased(View view, float f, float f1)
    {
        int k;
        f1 = FixedDrawerLayout.b(view);
        k = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -k;
        }
_L4:
        c.settleCapturedViewAt(i, view.getTop());
        a.invalidate();
        return;
_L2:
        int j = a.getWidth();
        if (f >= 0.0F)
        {
            i = j;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (f1 <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = j - k;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean tryCaptureView(View view, int i)
    {
        return FixedDrawerLayout.d(view) && a.a(view, b) && a.a(view) == 0;
    }
}
