// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

public final class xx extends HorizontalScrollView
    implements android.widget.AdapterView.OnItemSelectedListener
{

    Runnable a;
    public boolean b;
    int c;
    public ob d;
    private ya e;
    private adg f;
    private Spinner g;
    private int h;
    private int i;
    private int j;

    public xx(Context context)
    {
        super(context);
        new yc(this);
        setHorizontalScrollBarEnabled(false);
        context = vb.a(context);
        c(context.b());
        h = context.c();
        context = new adg(getContext(), null, b.j);
        context.h = true;
        context.b(17);
        context.setLayoutParams(new adh(-2, -1));
        f = context;
        addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    static adg a(xx xx1)
    {
        return xx1.f;
    }

    static yb a(xx xx1, ry ry1, boolean flag)
    {
        ry1 = new yb(xx1, xx1.getContext(), ry1, true);
        ry1.setBackgroundDrawable(null);
        ry1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, xx1.i));
        return ry1;
    }

    private boolean a()
    {
        return g != null && g.getParent() == this;
    }

    private boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(g);
            addView(f, new android.view.ViewGroup.LayoutParams(-2, -1));
            a(g.getSelectedItemPosition());
            return false;
        }
    }

    private void c(int k)
    {
        i = k;
        requestLayout();
    }

    public final void a(int k)
    {
        j = k;
        int i1 = f.getChildCount();
        int l = 0;
        while (l < i1) 
        {
            View view = f.getChildAt(l);
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
                b(k);
            }
            l++;
        }
        if (g != null && k >= 0)
        {
            g.setSelection(k);
        }
    }

    public final void b(int k)
    {
        View view = f.getChildAt(k);
        if (a != null)
        {
            removeCallbacks(a);
        }
        a = new xy(this, view);
        post(a);
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected final void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = vb.a(getContext());
        c(configuration.b());
        h = configuration.c();
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public final void onItemSelected(AdapterView adapterview, View view, int k, long l)
    {
        ((yb)view).a.e();
    }

    public final void onMeasure(int k, int l)
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
        k1 = f.getChildCount();
        if (k1 > 1 && (i1 == 0x40000000 || i1 == 0x80000000))
        {
            abx abx1;
            int j1;
            if (k1 > 2)
            {
                c = (int)((float)android.view.View.MeasureSpec.getSize(k) * 0.4F);
            } else
            {
                c = android.view.View.MeasureSpec.getSize(k) / 2;
            }
            c = Math.min(c, h);
        } else
        {
            c = -1;
        }
        j1 = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        if (flag || !b)
        {
            l = 0;
        }
        if (l != 0)
        {
            f.measure(0, j1);
            if (f.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(k))
            {
                if (!a())
                {
                    if (g == null)
                    {
                        abx1 = new abx(getContext(), null, b.o);
                        abx1.setLayoutParams(new adh(-2, -1));
                        abx1.setOnItemSelectedListener(this);
                        g = abx1;
                    }
                    removeView(f);
                    addView(g, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (g.getAdapter() == null)
                    {
                        g.setAdapter(new xz(this));
                    }
                    if (a != null)
                    {
                        removeCallbacks(a);
                        a = null;
                    }
                    g.setSelection(j);
                }
            } else
            {
                b();
            }
        } else
        {
            b();
        }
        l = getMeasuredWidth();
        super.onMeasure(k, j1);
        k = getMeasuredWidth();
        if (flag && l != k)
        {
            a(j);
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    static 
    {
        new DecelerateInterpolator();
    }
}
