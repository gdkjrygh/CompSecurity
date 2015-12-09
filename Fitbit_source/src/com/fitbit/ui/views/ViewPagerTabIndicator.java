// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.util.bq;
import com.fitbit.util.fonts.FitbitFont;

public class ViewPagerTabIndicator extends HorizontalScrollView
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    private class a extends TextView
    {

        final ViewPagerTabIndicator a;
        private int b;

        static int a(a a1, int i)
        {
            a1.b = i;
            return i;
        }

        public int a()
        {
            return b;
        }

        public void onMeasure(int i, int j)
        {
            super.onMeasure(i, j);
            if (ViewPagerTabIndicator.b(a) > 0 && getMeasuredWidth() > ViewPagerTabIndicator.b(a))
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(ViewPagerTabIndicator.b(a), 0x40000000), j);
            }
        }

        public a(Context context)
        {
            this(context, null);
        }

        public a(Context context, AttributeSet attributeset)
        {
            this(context, attributeset, 0x7f01002a);
        }

        public a(Context context, AttributeSet attributeset, int i)
        {
            ViewPagerTabIndicator viewpagertabindicator1;
            a = ViewPagerTabIndicator.this;
            super(context, attributeset, i);
            viewpagertabindicator1 = null;
            viewpagertabindicator = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.TextView, 0x1010084, 0);
            viewpagertabindicator1 = ViewPagerTabIndicator.this;
            attributeset = FitbitFont.a(ViewPagerTabIndicator.this);
            if (attributeset == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            viewpagertabindicator1 = ViewPagerTabIndicator.this;
            com.fitbit.util.fonts.a.a(context, this, attributeset);
            if (ViewPagerTabIndicator.this != null)
            {
                recycle();
            }
_L2:
            return;
            viewpagertabindicator;
            if (viewpagertabindicator1 == null) goto _L2; else goto _L1
_L1:
            viewpagertabindicator1.recycle();
            return;
            viewpagertabindicator;
            attributeset = null;
            context = ViewPagerTabIndicator.this;
_L4:
            if (attributeset != null)
            {
                attributeset.recycle();
            }
            throw context;
            context;
            attributeset = ViewPagerTabIndicator.this;
            if (true) goto _L4; else goto _L3
_L3:
        }
    }


    private final android.view.View.OnClickListener a;
    private ViewPager b;
    private android.support.v4.view.ViewPager.OnPageChangeListener c;
    private LinearLayout d;
    private Runnable e;
    private int f;
    private int g;

    public ViewPagerTabIndicator(Context context)
    {
        this(context, null);
    }

    public ViewPagerTabIndicator(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010029);
    }

    public ViewPagerTabIndicator(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new android.view.View.OnClickListener() {

            final ViewPagerTabIndicator a;

            public void onClick(View view)
            {
                view = (a)view;
                ViewPagerTabIndicator.a(a).setCurrentItem(view.a());
            }

            
            {
                a = ViewPagerTabIndicator.this;
                super();
            }
        };
        setHorizontalScrollBarEnabled(false);
        ViewCompat.setElevation(this, context.getResources().getDimension(0x7f0a00ab));
        d = new LinearLayout(context, attributeset);
        d.setId(bq.a());
        addView(d, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    static ViewPager a(ViewPagerTabIndicator viewpagertabindicator)
    {
        return viewpagertabindicator.b;
    }

    static Runnable a(ViewPagerTabIndicator viewpagertabindicator, Runnable runnable)
    {
        viewpagertabindicator.e = runnable;
        return runnable;
    }

    private void a(int i, CharSequence charsequence)
    {
        a a1 = new a(getContext());
        a.a(a1, i);
        a1.setFocusable(true);
        a1.setOnClickListener(a);
        a1.setText(charsequence);
        a1.setId(bq.a());
        d.addView(a1, new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F));
    }

    static int b(ViewPagerTabIndicator viewpagertabindicator)
    {
        return viewpagertabindicator.f;
    }

    private void b(int i)
    {
        View view = d.getChildAt(i);
        if (e != null)
        {
            removeCallbacks(e);
        }
        e = new Runnable(view) {

            final View a;
            final ViewPagerTabIndicator b;

            public void run()
            {
                int j = a.getLeft();
                int k = (b.getWidth() - a.getWidth()) / 2;
                b.smoothScrollTo(j - k, 0);
                ViewPagerTabIndicator.a(b, null);
            }

            
            {
                b = ViewPagerTabIndicator.this;
                a = view;
                super();
            }
        };
        post(e);
    }

    public void a()
    {
        d.removeAllViews();
        PagerAdapter pageradapter = b.getAdapter();
        int j = pageradapter.getCount();
        for (int i = 0; i < j; i++)
        {
            CharSequence charsequence = pageradapter.getPageTitle(i);
            Object obj = charsequence;
            if (charsequence == null)
            {
                obj = "";
            }
            a(i, ((CharSequence) (obj)));
        }

        if (g > j)
        {
            g = j - 1;
        }
        a(g);
        requestLayout();
    }

    public void a(int i)
    {
        if (b == null)
        {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        g = i;
        b.setCurrentItem(i);
        int k = d.getChildCount();
        int j = 0;
        while (j < k) 
        {
            View view = d.getChildAt(j);
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (flag)
            {
                b(i);
            }
            j++;
        }
    }

    public void a(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        c = onpagechangelistener;
    }

    public void a(ViewPager viewpager)
    {
        if (b == viewpager)
        {
            return;
        }
        if (b != null)
        {
            b.setOnPageChangeListener(null);
        }
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            b = viewpager;
            viewpager.setOnPageChangeListener(this);
            a();
            return;
        }
    }

    public void a(ViewPager viewpager, int i)
    {
        a(viewpager);
        a(i);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (e != null)
        {
            post(e);
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (e != null)
        {
            removeCallbacks(e);
        }
    }

    public void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        int l;
        boolean flag;
        if (k == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        l = d.getChildCount();
        if (l > 1 && (k == 0x40000000 || k == 0x80000000))
        {
            if (l > 2)
            {
                f = (int)((float)android.view.View.MeasureSpec.getSize(i) * 0.4F);
            } else
            {
                f = android.view.View.MeasureSpec.getSize(i) / 2;
            }
        } else
        {
            f = -1;
        }
        k = getMeasuredWidth();
        super.onMeasure(i, j);
        i = getMeasuredWidth();
        if (flag && k != i && b != null)
        {
            a(g);
        }
    }

    public void onPageScrollStateChanged(int i)
    {
        if (c != null)
        {
            c.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f1, int j)
    {
        if (c != null)
        {
            c.onPageScrolled(i, f1, j);
        }
    }

    public void onPageSelected(int i)
    {
        a(i);
        if (c != null)
        {
            c.onPageSelected(i);
        }
    }
}
