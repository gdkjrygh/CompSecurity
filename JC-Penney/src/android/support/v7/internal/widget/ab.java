// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.support.v7.a.c;
import android.support.v7.b.b;
import android.support.v7.internal.view.a;
import android.support.v7.widget.aa;
import android.support.v7.widget.r;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

// Referenced classes of package android.support.v7.internal.widget:
//            af, ae, ad, ac

public class ab extends HorizontalScrollView
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private static final Interpolator j = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private ae d;
    private aa e;
    private Spinner f;
    private boolean g;
    private int h;
    private int i;

    private af a(c c1, boolean flag)
    {
        c1 = new af(this, getContext(), c1, flag);
        if (flag)
        {
            c1.setBackgroundDrawable(null);
            c1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, h));
            return c1;
        }
        c1.setFocusable(true);
        if (d == null)
        {
            d = new ae(this, null);
        }
        c1.setOnClickListener(d);
        return c1;
    }

    static af a(ab ab1, c c1, boolean flag)
    {
        return ab1.a(c1, flag);
    }

    static aa a(ab ab1)
    {
        return ab1.e;
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
        if (f.getAdapter() == null)
        {
            f.setAdapter(new ad(this, null));
        }
        if (a != null)
        {
            removeCallbacks(a);
            a = null;
        }
        f.setSelection(i);
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
            setTabSelected(f.getSelectedItemPosition());
            return false;
        }
    }

    private Spinner d()
    {
        r r1 = new r(getContext(), null, b.actionDropDownStyle);
        r1.setLayoutParams(new android.support.v7.widget.ab(-2, -1));
        r1.setOnItemSelectedListener(this);
        return r1;
    }

    public void a(int k)
    {
        View view = e.getChildAt(k);
        if (a != null)
        {
            removeCallbacks(a);
        }
        a = new ac(this, view);
        post(a);
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
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = android.support.v7.internal.view.a.a(getContext());
        setContentHeight(configuration.e());
        c = configuration.f();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int k, long l)
    {
        ((af)view).b().d();
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
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000);
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
            setTabSelected(i);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void setAllowCollapse(boolean flag)
    {
        g = flag;
    }

    public void setContentHeight(int k)
    {
        h = k;
        requestLayout();
    }

    public void setTabSelected(int k)
    {
        i = k;
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
            f.setSelection(k);
        }
    }

}
