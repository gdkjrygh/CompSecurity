// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

public class StickyHeaderView extends LinearLayout
{

    private View a;
    ListView b;
    public ViewGroup c;
    ViewGroup d;
    boolean e;
    public boolean f;
    private FrameLayout g;
    private android.widget.FrameLayout.LayoutParams h;
    private int i;
    private boolean j;
    private Runnable k = new Runnable() {

        private StickyHeaderView a;

        public final void run()
        {
            StickyHeaderView.e(a).width = StickyHeaderView.f(a).getWidth();
            StickyHeaderView.e(a).height = StickyHeaderView.f(a).getHeight();
            StickyHeaderView.g(a).setLayoutParams(StickyHeaderView.e(a));
        }

            
            {
                a = StickyHeaderView.this;
                super();
            }
    };
    private Runnable l = new Runnable() {

        private StickyHeaderView a;

        public final void run()
        {
            a.requestLayout();
            StickyHeaderView.d(a).requestLayout();
        }

            
            {
                a = StickyHeaderView.this;
                super();
            }
    };
    private android.widget.AbsListView.OnScrollListener m = new android.widget.AbsListView.OnScrollListener() {

        private int a[];
        private int b[];
        private StickyHeaderView c;

        public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
        {
            boolean flag1 = true;
            if (!StickyHeaderView.h(c)) goto _L2; else goto _L1
_L1:
            if (i1 != 0 && j1 != 0) goto _L4; else goto _L3
_L3:
            boolean flag;
            if (StickyHeaderView.b(c) == 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
_L6:
            StickyHeaderView.a(c, flag);
_L2:
            return;
_L4:
            flag = flag1;
            if (StickyHeaderView.b(c) >= i1)
            {
                flag = flag1;
                if (StickyHeaderView.b(c) != -1)
                {
                    StickyHeaderView.c(c).getLocationInWindow(a);
                    StickyHeaderView.i(c).getLocationInWindow(b);
                    flag = flag1;
                    if (a[1] >= b[1])
                    {
                        flag = false;
                    }
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void onScrollStateChanged(AbsListView abslistview, int i1)
        {
        }

            
            {
                c = StickyHeaderView.this;
                super();
                a = new int[2];
                b = new int[2];
            }
    };

    public StickyHeaderView(Context context)
    {
        super(context);
        i = -1;
        a(context);
    }

    public StickyHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = -1;
        a(context);
    }

    static int a(StickyHeaderView stickyheaderview, int i1)
    {
        stickyheaderview.i = i1;
        return i1;
    }

    private void a(Context context)
    {
        c = new FrameLayout(context) {

            private StickyHeaderView a;

            protected final void dispatchDraw(Canvas canvas)
            {
                super.dispatchDraw(canvas);
                if (StickyHeaderView.a(a) && StickyHeaderView.b(a) == -1)
                {
                    canvas = StickyHeaderView.c(a);
                    do
                    {
                        if (canvas == null)
                        {
                            break;
                        }
                        View view = (View)canvas.getParent();
                        if (view == StickyHeaderView.d(a))
                        {
                            break;
                        }
                        canvas = view;
                    } while (true);
                    if (canvas != null)
                    {
                        StickyHeaderView.a(a, StickyHeaderView.d(a).getPositionForView(canvas));
                    }
                }
            }

            
            {
                a = StickyHeaderView.this;
                super(context);
            }
        };
        android.widget.AbsListView.LayoutParams layoutparams = new android.widget.AbsListView.LayoutParams(-1, -2);
        c.setLayoutParams(layoutparams);
        g = new FrameLayout(context);
        h = new android.widget.FrameLayout.LayoutParams(0, 0);
        g.setLayoutParams(h);
    }

    static void a(StickyHeaderView stickyheaderview, boolean flag)
    {
        stickyheaderview.c(flag);
    }

    static boolean a(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.e;
    }

    static int b(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.i;
    }

    static ViewGroup c(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.c;
    }

    private void c(boolean flag)
    {
        if (j != flag)
        {
            j = flag;
            if (flag)
            {
                c.removeView(this);
                c.addView(g);
                d.addView(this);
            } else
            {
                c.removeView(g);
                d.removeView(this);
                c.addView(this);
            }
            a(flag);
            post(l);
        }
    }

    static ListView d(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.b;
    }

    static android.widget.FrameLayout.LayoutParams e(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.h;
    }

    static View f(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.a;
    }

    static FrameLayout g(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.g;
    }

    static boolean h(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.f;
    }

    static ViewGroup i(StickyHeaderView stickyheaderview)
    {
        return stickyheaderview.d;
    }

    protected void a(boolean flag)
    {
    }

    public final void b(boolean flag)
    {
        if (!e)
        {
            return;
        }
        if (f != flag)
        {
            f = flag;
            if (!flag)
            {
                c(false);
            }
        }
        ListView listview = b;
        android.widget.AbsListView.OnScrollListener onscrolllistener;
        if (flag)
        {
            onscrolllistener = m;
        } else
        {
            onscrolllistener = null;
        }
        listview.setOnScrollListener(onscrolllistener);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = findViewById(0x7f11032d);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        post(k);
    }
}
