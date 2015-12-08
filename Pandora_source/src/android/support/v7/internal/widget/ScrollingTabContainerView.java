// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p.g.a;

// Referenced classes of package android.support.v7.internal.widget:
//            d, c, CompatTextView

public class ScrollingTabContainerView extends HorizontalScrollView
    implements c.b
{
    public static class TabView extends LinearLayout
    {

        private android.support.v7.app.ActionBar.c a;
        private TextView b;
        private ImageView c;
        private View d;
        private ScrollingTabContainerView e;

        public void a()
        {
            Object obj = a;
            View view = ((android.support.v7.app.ActionBar.c) (obj)).c();
            if (view != null)
            {
                obj = view.getParent();
                if (obj != this)
                {
                    if (obj != null)
                    {
                        ((ViewGroup)obj).removeView(view);
                    }
                    addView(view);
                }
                d = view;
                if (b != null)
                {
                    b.setVisibility(8);
                }
                if (c != null)
                {
                    c.setVisibility(8);
                    c.setImageDrawable(null);
                }
            } else
            {
                if (d != null)
                {
                    removeView(d);
                    d = null;
                }
                android.graphics.drawable.Drawable drawable = ((android.support.v7.app.ActionBar.c) (obj)).a();
                CharSequence charsequence = ((android.support.v7.app.ActionBar.c) (obj)).b();
                if (drawable != null)
                {
                    if (c == null)
                    {
                        ImageView imageview = new ImageView(getContext());
                        android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutparams1.gravity = 16;
                        imageview.setLayoutParams(layoutparams1);
                        addView(imageview, 0);
                        c = imageview;
                    }
                    c.setImageDrawable(drawable);
                    c.setVisibility(0);
                } else
                if (c != null)
                {
                    c.setVisibility(8);
                    c.setImageDrawable(null);
                }
                if (charsequence != null)
                {
                    if (b == null)
                    {
                        CompatTextView compattextview = new CompatTextView(getContext(), null, android.support.v7.appcompat.R.attr.actionBarTabTextStyle);
                        compattextview.setEllipsize(android.text.TextUtils.TruncateAt.END);
                        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutparams.gravity = 16;
                        compattextview.setLayoutParams(layoutparams);
                        addView(compattextview);
                        b = compattextview;
                    }
                    b.setText(charsequence);
                    b.setVisibility(0);
                } else
                if (b != null)
                {
                    b.setVisibility(8);
                    b.setText(null);
                }
                if (c != null)
                {
                    c.setContentDescription(((android.support.v7.app.ActionBar.c) (obj)).e());
                    return;
                }
            }
        }

        public void a(android.support.v7.app.ActionBar.c c1)
        {
            a = c1;
            a();
        }

        void a(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.ActionBar.c c1, boolean flag)
        {
            e = scrollingtabcontainerview;
            a = c1;
            if (flag)
            {
                setGravity(19);
            }
            a();
        }

        public android.support.v7.app.ActionBar.c getTab()
        {
            return a;
        }

        public void onMeasure(int k, int l)
        {
            super.onMeasure(k, l);
            if (e != null)
            {
                k = e.b;
            } else
            {
                k = 0;
            }
            if (k > 0 && getMeasuredWidth() > k)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), l);
            }
        }

        public TabView(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

    private class a extends BaseAdapter
    {

        final ScrollingTabContainerView a;

        public int getCount()
        {
            return android.support.v7.internal.widget.ScrollingTabContainerView.a(a).getChildCount();
        }

        public Object getItem(int k)
        {
            return ((TabView)android.support.v7.internal.widget.ScrollingTabContainerView.a(a).getChildAt(k)).getTab();
        }

        public long getItemId(int k)
        {
            return (long)k;
        }

        public View getView(int k, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                return android.support.v7.internal.widget.ScrollingTabContainerView.a(a, (android.support.v7.app.ActionBar.c)getItem(k), true);
            } else
            {
                ((TabView)view).a((android.support.v7.app.ActionBar.c)getItem(k));
                return view;
            }
        }

        private a()
        {
            a = ScrollingTabContainerView.this;
            super();
        }

    }

    private class b
        implements android.view.View.OnClickListener
    {

        final ScrollingTabContainerView a;

        public void onClick(View view)
        {
            ((TabView)view).getTab().d();
            int l = android.support.v7.internal.widget.ScrollingTabContainerView.a(a).getChildCount();
            int k = 0;
            while (k < l) 
            {
                View view1 = android.support.v7.internal.widget.ScrollingTabContainerView.a(a).getChildAt(k);
                boolean flag;
                if (view1 == view)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view1.setSelected(flag);
                k++;
            }
        }

        private b()
        {
            a = ScrollingTabContainerView.this;
            super();
        }

    }


    Runnable a;
    int b;
    int c;
    private b d;
    private LinearLayout e;
    private d f;
    private boolean g;
    private final LayoutInflater h;
    private int i;
    private int j;

    public ScrollingTabContainerView(Context context)
    {
        super(context);
        h = LayoutInflater.from(context);
        setHorizontalScrollBarEnabled(false);
        context = p.g.a.a(context);
        setContentHeight(context.e());
        c = context.g();
        e = (LinearLayout)h.inflate(android.support.v7.appcompat.R.layout.abc_action_bar_tabbar, this, false);
        addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    private TabView a(android.support.v7.app.ActionBar.c c1, boolean flag)
    {
        TabView tabview = (TabView)h.inflate(android.support.v7.appcompat.R.layout.abc_action_bar_tab, e, false);
        tabview.a(this, c1, flag);
        if (flag)
        {
            tabview.setBackgroundDrawable(null);
            tabview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i));
            return tabview;
        }
        tabview.setFocusable(true);
        if (d == null)
        {
            d = new b();
        }
        tabview.setOnClickListener(d);
        return tabview;
    }

    static TabView a(ScrollingTabContainerView scrollingtabcontainerview, android.support.v7.app.ActionBar.c c1, boolean flag)
    {
        return scrollingtabcontainerview.a(c1, flag);
    }

    static LinearLayout a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        return scrollingtabcontainerview.e;
    }

    private boolean a()
    {
        return f != null && f.getParent() == this;
    }

    private void b()
    {
        if (a())
        {
            return;
        }
        if (f == null)
        {
            f = d();
        }
        removeView(e);
        addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (f.d() == null)
        {
            f.a(new a());
        }
        if (a != null)
        {
            removeCallbacks(a);
            a = null;
        }
        f.a(j);
    }

    private boolean c()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(f);
            addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(f.f());
            return false;
        }
    }

    private d d()
    {
        d d1 = new d(getContext(), null, android.support.v7.appcompat.R.attr.actionDropDownStyle);
        d1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -1));
        d1.b(this);
        return d1;
    }

    public void a(int k)
    {
        View view = e.getChildAt(k);
        if (a != null)
        {
            removeCallbacks(a);
        }
        a = new Runnable(view) {

            final View a;
            final ScrollingTabContainerView b;

            public void run()
            {
                int l = a.getLeft();
                int i1 = (b.getWidth() - a.getWidth()) / 2;
                b.smoothScrollTo(l - i1, 0);
                b.a = null;
            }

            
            {
                b = ScrollingTabContainerView.this;
                a = view;
                super();
            }
        };
        post(a);
    }

    public void a(c c1, View view, int k, long l)
    {
        ((TabView)view).getTab().d();
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        configuration = p.g.a.a(getContext());
        setContentHeight(configuration.e());
        c = configuration.g();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onMeasure(int k, int l)
    {
        l = 1;
        int i1 = android.view.View.MeasureSpec.getMode(k);
        int k1;
        boolean flag;
        if (i1 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        k1 = e.getChildCount();
        if (k1 > 1 && (i1 == 0x40000000 || i1 == 0x80000000))
        {
            int j1;
            if (k1 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(k) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(k) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        if (flag || !g)
        {
            l = 0;
        }
        if (l != 0)
        {
            e.measure(0, j1);
            if (e.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(k))
            {
                b();
            } else
            {
                c();
            }
        } else
        {
            c();
        }
        l = getMeasuredWidth();
        super.onMeasure(k, j1);
        k = getMeasuredWidth();
        if (flag && l != k)
        {
            setTabSelected(j);
        }
    }

    public void setAllowCollapse(boolean flag)
    {
        g = flag;
    }

    public void setContentHeight(int k)
    {
        i = k;
        requestLayout();
    }

    public void setTabSelected(int k)
    {
        j = k;
        int i1 = e.getChildCount();
        int l = 0;
        while (l < i1) 
        {
            View view = e.getChildAt(l);
            boolean flag;
            if (l == k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (flag)
            {
                a(k);
            }
            l++;
        }
        if (f != null && k >= 0)
        {
            f.a(k);
        }
    }
}
