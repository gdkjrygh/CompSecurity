// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.jcp.util.ae;
import com.jcp.views.ScrollViewWithStopMonitor;

// Referenced classes of package com.jcp.widget:
//            d, b, c

public class BackToTopButton extends LinearLayout
    implements android.view.ViewTreeObserver.OnScrollChangedListener, android.widget.AbsListView.OnScrollListener
{

    private static final String a = com/jcp/widget/BackToTopButton.getSimpleName();
    private ListView b;
    protected FloatingActionButton backToTopButton;
    private ScrollViewWithStopMonitor c;
    private Integer d;
    private Handler e;
    private Runnable f;
    private boolean g;
    private boolean h;
    private boolean i;

    public BackToTopButton(Context context)
    {
        super(context);
        a(context);
    }

    public BackToTopButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public BackToTopButton(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(context);
    }

    private void a(Context context)
    {
        ButterKnife.inject(this, inflate(context, 0x7f0300f2, this));
    }

    static void a(BackToTopButton backtotopbutton, boolean flag)
    {
        backtotopbutton.a(flag);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            backToTopButton.setVisibility(0);
            d();
            return;
        } else
        {
            backToTopButton.setVisibility(8);
            return;
        }
    }

    static boolean a(BackToTopButton backtotopbutton)
    {
        return backtotopbutton.h;
    }

    private void c()
    {
        if (!i)
        {
            ae.b(a, "TriggerHeight not set: This must be set or button will never show.");
            i = true;
        }
    }

    private void d()
    {
        if (f == null)
        {
            f = new d(this);
        }
        e();
        e = new Handler();
        e.postDelayed(f, 3000L);
    }

    private void e()
    {
        if (e != null && f != null)
        {
            e.removeCallbacks(f);
        }
    }

    public void a()
    {
        if (c != null)
        {
            c.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }

    public boolean b()
    {
        return d != null;
    }

    public void onBackToTopClick()
    {
        a(false);
        if (c != null)
        {
            c.smoothScrollTo(0, 0);
            return;
        }
        if (b != null)
        {
            b.setSelectionAfterHeaderView();
            return;
        } else
        {
            ae.a(a, "listView and scrollView are null: one must be set or back to top functionality won't work");
            return;
        }
    }

    public void onScroll(AbsListView abslistview, int j, int k, int l)
    {
        if (b())
        {
            boolean flag;
            if (j + k >= d.intValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = flag;
            return;
        } else
        {
            c();
            return;
        }
    }

    public void onScrollChanged()
    {
        if (b() && c != null)
        {
            boolean flag;
            if (d.intValue() - (c.getHeight() + c.getScrollY()) <= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h = flag;
            return;
        } else
        {
            c();
            return;
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int j)
    {
        if (j == 0)
        {
            a(g);
        }
    }

    public void setListView(ListView listview)
    {
        if (listview != null)
        {
            b = listview;
            return;
        } else
        {
            ae.a(a, "setListView given a null ListView");
            return;
        }
    }

    public void setScrollView(ScrollViewWithStopMonitor scrollviewwithstopmonitor)
    {
        if (scrollviewwithstopmonitor != null)
        {
            c = scrollviewwithstopmonitor;
            c.getViewTreeObserver().addOnScrollChangedListener(this);
            c.setOnTouchListener(new b(this, scrollviewwithstopmonitor));
            c.setOnScrollStoppedListener(new c(this));
            return;
        } else
        {
            ae.a(a, "setScrollView given a null ScrollView");
            return;
        }
    }

    public void setTriggerHeight(int j)
    {
        ae.d(a, (new StringBuilder()).append("Trigger height set to ").append(j).toString());
        d = Integer.valueOf(j);
    }

}
