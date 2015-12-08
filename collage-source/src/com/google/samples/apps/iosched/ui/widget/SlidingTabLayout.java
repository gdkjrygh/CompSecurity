// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.samples.apps.iosched.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.view.a.l;

// Referenced classes of package com.google.samples.apps.iosched.ui.widget:
//            a

public class SlidingTabLayout extends HorizontalScrollView
{

    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private ViewPager f;
    private SparseArray g;
    private android.support.v4.view.ViewPager.OnPageChangeListener h;
    private final a i;

    public SlidingTabLayout(Context context)
    {
        this(context, null);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        g = new SparseArray();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        a = (int)(24F * getResources().getDisplayMetrics().density);
        i = new a(context);
        addView(i, -1, -2);
    }

    static a a(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.i;
    }

    private void a()
    {
        PagerAdapter pageradapter = f.getAdapter();
    /* block-local class not found */
    class b {}

        b b1 = new b(null);
        int j = 0;
        while (j < pageradapter.getCount()) 
        {
            Object obj;
            Object obj1;
            ImageView imageview;
            Object obj2;
            if (b != 0)
            {
                obj1 = LayoutInflater.from(getContext()).inflate(b, i, false);
                obj = (TextView)((View) (obj1)).findViewById(c);
                imageview = (ImageView)((View) (obj1)).findViewById(d);
            } else
            {
                imageview = null;
                obj = null;
                obj1 = null;
            }
            obj2 = obj1;
            if (obj1 == null)
            {
                obj2 = a(getContext());
            }
            if (obj == null && android/widget/TextView.isInstance(obj2))
            {
                obj = (TextView)obj2;
            }
            if (e)
            {
                obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj2)).getLayoutParams();
                obj1.width = 0;
                obj1.weight = 1.0F;
            }
            if (obj != null)
            {
                ((TextView) (obj)).setText(pageradapter.getPageTitle(j));
            }
            if (imageview != null && (pageradapter instanceof l))
            {
                imageview.setImageResource(((l)pageradapter).b(j));
            }
            ((View) (obj2)).setOnClickListener(b1);
            obj = (String)g.get(j, null);
            if (obj != null)
            {
                ((View) (obj2)).setContentDescription(((CharSequence) (obj)));
            }
            i.addView(((View) (obj2)));
            if (j == f.getCurrentItem())
            {
                ((View) (obj2)).setSelected(true);
            }
            j++;
        }
    }

    private void a(int j, int k)
    {
        int i1 = i.getChildCount();
        View view;
        if (i1 != 0 && j >= 0 && j < i1)
        {
            if ((view = i.getChildAt(j)) != null)
            {
label0:
                {
                    int j1 = view.getLeft() + k;
                    if (j <= 0)
                    {
                        j = j1;
                        if (k <= 0)
                        {
                            break label0;
                        }
                    }
                    j = j1 - a;
                }
                scrollTo(j, 0);
                return;
            }
        }
    }

    static void a(SlidingTabLayout slidingtablayout, int j, int k)
    {
        slidingtablayout.a(j, k);
    }

    static android.support.v4.view.ViewPager.OnPageChangeListener b(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.h;
    }

    static ViewPager c(SlidingTabLayout slidingtablayout)
    {
        return slidingtablayout.f;
    }

    protected TextView a(Context context)
    {
        context = new TextView(context);
        context.setGravity(17);
        context.setTextSize(2, 12F);
        context.setTypeface(Typeface.DEFAULT_BOLD);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        TypedValue typedvalue = new TypedValue();
        getContext().getTheme().resolveAttribute(0x101030e, typedvalue, true);
        context.setBackgroundResource(typedvalue.resourceId);
        context.setAllCaps(true);
        int j = (int)(16F * getResources().getDisplayMetrics().density);
        context.setPadding(j, j, j, j);
        return context;
    }

    public void a(int j, int k, int i1)
    {
        b = j;
        c = k;
        d = i1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (f != null)
        {
            a(f.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(c c1)
    {
        i.a(c1);
    }

    public void setDistributeEvenly(boolean flag)
    {
        e = flag;
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        h = onpagechangelistener;
    }

    public transient void setSelectedIndicatorColors(int ai[])
    {
        i.a(ai);
    }

    public void setViewPager(ViewPager viewpager)
    {
        i.removeAllViews();
        f = viewpager;
        if (viewpager != null)
        {
    /* block-local class not found */
    class a {}

            viewpager.setOnPageChangeListener(new a(null));
            a();
        }
    }

    // Unreferenced inner class com/google/samples/apps/iosched/ui/widget/SlidingTabLayout$c
    /* block-local class not found */
    class c {}

}
