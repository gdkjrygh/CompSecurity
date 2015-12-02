// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout, j

private class <init> extends <init>
{

    final SlidingPaneLayout a;

    public int a(View view)
    {
        return SlidingPaneLayout.f(a);
    }

    public int a(View view, int i, int k)
    {
        view = (youtParams)SlidingPaneLayout.d(a).getLayoutParams();
        if (SlidingPaneLayout.e(a))
        {
            k = a.getWidth();
            int l = a.getPaddingRight();
            k -= ((youtParams) (view)).rightMargin + l + SlidingPaneLayout.d(a).getWidth();
            l = SlidingPaneLayout.f(a);
            return Math.max(Math.min(i, k), k - l);
        } else
        {
            k = a.getPaddingLeft();
            k = ((youtParams) (view)).leftMargin + k;
            int i1 = SlidingPaneLayout.f(a);
            return Math.min(Math.max(i, k), i1 + k);
        }
    }

    public void a(int i)
    {
label0:
        {
            if (SlidingPaneLayout.b(a).a() == 0)
            {
                if (SlidingPaneLayout.c(a) != 0.0F)
                {
                    break label0;
                }
                a.d(SlidingPaneLayout.d(a));
                a.c(SlidingPaneLayout.d(a));
                SlidingPaneLayout.a(a, false);
            }
            return;
        }
        a.b(SlidingPaneLayout.d(a));
        SlidingPaneLayout.a(a, true);
    }

    public void a(View view, float f, float f1)
    {
        youtParams youtparams = (youtParams)view.getLayoutParams();
        if (!SlidingPaneLayout.e(a)) goto _L2; else goto _L1
_L1:
        int i;
label0:
        {
            i = a.getPaddingRight();
            int k = youtparams.rightMargin + i;
            if (f >= 0.0F)
            {
                i = k;
                if (f != 0.0F)
                {
                    break label0;
                }
                i = k;
                if (SlidingPaneLayout.c(a) <= 0.5F)
                {
                    break label0;
                }
            }
            i = k + SlidingPaneLayout.f(a);
        }
        int l = SlidingPaneLayout.d(a).getWidth();
        i = a.getWidth() - i - l;
_L4:
        SlidingPaneLayout.b(a).a(i, view.getTop());
        a.invalidate();
        return;
_L2:
        i = a.getPaddingLeft();
        int i1 = youtparams.leftMargin + i;
        if (f <= 0.0F)
        {
            i = i1;
            if (f != 0.0F)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = i1;
            if (SlidingPaneLayout.c(a) <= 0.5F)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = i1 + SlidingPaneLayout.f(a);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, int i, int k, int l, int i1)
    {
        SlidingPaneLayout.a(a, i);
        a.invalidate();
    }

    public boolean a(View view, int i)
    {
        if (SlidingPaneLayout.a(a))
        {
            return false;
        } else
        {
            return ((youtParams)view.getLayoutParams()).b;
        }
    }

    public int b(View view, int i, int k)
    {
        return view.getTop();
    }

    public void b(int i, int k)
    {
        SlidingPaneLayout.b(a).a(SlidingPaneLayout.d(a), k);
    }

    public void b(View view, int i)
    {
        a.a();
    }

    private youtParams(SlidingPaneLayout slidingpanelayout)
    {
        a = slidingpanelayout;
        super();
    }

    a(SlidingPaneLayout slidingpanelayout, a a1)
    {
        this(slidingpanelayout);
    }
}
