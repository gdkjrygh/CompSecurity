// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.widget.Scroller;

// Referenced classes of package com.pandora.android.view:
//            EcoGallery

private class tContext
    implements Runnable
{

    final EcoGallery a;
    private Scroller b;
    private int c;

    static Scroller a(tContext tcontext)
    {
        return tcontext.b;
    }

    private void a()
    {
        a.removeCallbacks(this);
    }

    static void a(moveCallbacks movecallbacks, boolean flag)
    {
        movecallbacks.b(flag);
    }

    private void b(boolean flag)
    {
        b.forceFinished(true);
        if (flag)
        {
            EcoGallery.c(a);
        }
    }

    public void a(int i)
    {
        if (i == 0)
        {
            return;
        }
        a();
        int j;
        if (i < 0)
        {
            j = 0x7fffffff;
        } else
        {
            j = 0;
        }
        c = j;
        b.fling(j, 0, i, 0, 0, 0x7fffffff, 0, 0x7fffffff);
        a.post(this);
    }

    public void a(boolean flag)
    {
        a.removeCallbacks(this);
        b(flag);
    }

    public void b(int i)
    {
        if (i == 0)
        {
            return;
        } else
        {
            a();
            c = 0;
            b.startScroll(0, 0, -i, 0, EcoGallery.b(a));
            a.post(this);
            return;
        }
    }

    public void run()
    {
        if (a.A == 0)
        {
            b(true);
            return;
        }
        EcoGallery.b(a, false);
        Scroller scroller = b;
        boolean flag = scroller.computeScrollOffset();
        int j = scroller.getCurrX();
        int i = c - j;
        if (i > 0)
        {
            EcoGallery.a(a, a.k);
            i = Math.min(a.getWidth() - a.getPaddingLeft() - a.getPaddingRight() - 1, i);
        } else
        {
            int k = a.getChildCount();
            EcoGallery.a(a, (k - 1) + a.k);
            i = Math.max(-(a.getWidth() - a.getPaddingRight() - a.getPaddingLeft() - 1), i);
        }
        a.a(i);
        if (flag && !EcoGallery.d(a))
        {
            c = j;
            a.post(this);
            return;
        } else
        {
            b(true);
            return;
        }
    }

    public (EcoGallery ecogallery)
    {
        a = ecogallery;
        super();
        b = new Scroller(ecogallery.getContext());
    }
}
