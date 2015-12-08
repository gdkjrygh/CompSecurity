// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.Configuration;
import android.support.v7.a.b;
import android.support.v7.internal.view.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;

// Referenced classes of package android.support.v7.internal.widget:
//            w, ak, ai, SpinnerCompat, 
//            u, AbsSpinnerCompat, aj

public final class ah extends HorizontalScrollView
    implements w
{

    private static final Interpolator i = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private LinearLayoutCompat d;
    private SpinnerCompat e;
    private boolean f;
    private int g;
    private int h;

    static ak a(ah ah1, android.support.v7.app.a a1)
    {
        a1 = new ak(ah1, ah1.getContext(), a1);
        a1.setBackgroundDrawable(null);
        a1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, ah1.g));
        return a1;
    }

    static LinearLayoutCompat a(ah ah1)
    {
        return ah1.d;
    }

    private void a(int j)
    {
        h = j;
        int l = d.getChildCount();
        int k = 0;
        while (k < l) 
        {
            View view = d.getChildAt(k);
            boolean flag;
            if (k == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (!flag)
            {
                continue;
            }
            view = d.getChildAt(j);
            if (a != null)
            {
                removeCallbacks(a);
            }
            a = new ai(this, view);
            post(a);
            k++;
        }
        if (e != null && j >= 0)
        {
            e.a(j);
        }
    }

    private boolean a()
    {
        return e != null && e.getParent() == this;
    }

    private boolean b()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(e);
            addView(d, new android.view.ViewGroup.LayoutParams(-2, -1));
            a(((u) (e)).u);
            return false;
        }
    }

    public final void a(boolean flag)
    {
        f = flag;
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
        configuration = android.support.v7.internal.view.a.a(getContext());
        g = configuration.e();
        requestLayout();
        c = configuration.g();
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public final void onMeasure(int j, int k)
    {
        k = 1;
        int l = android.view.View.MeasureSpec.getMode(j);
        int j1;
        boolean flag;
        if (l == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        j1 = d.getChildCount();
        if (j1 > 1 && (l == 0x40000000 || l == 0x80000000))
        {
            SpinnerCompat spinnercompat;
            int i1;
            if (j1 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(j) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(j) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
        if (flag || !f)
        {
            k = 0;
        }
        if (k != 0)
        {
            d.measure(0, i1);
            if (d.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(j))
            {
                if (!a())
                {
                    if (e == null)
                    {
                        spinnercompat = new SpinnerCompat(getContext(), b.h);
                        spinnercompat.setLayoutParams(new android.support.v7.widget.LinearLayoutCompat.LayoutParams(-2, -1));
                        spinnercompat.b(this);
                        e = spinnercompat;
                    }
                    removeView(d);
                    addView(e, new android.view.ViewGroup.LayoutParams(-2, -1));
                    if (((AbsSpinnerCompat) (e)).a == null)
                    {
                        e.a(new aj(this, (byte)0));
                    }
                    if (a != null)
                    {
                        removeCallbacks(a);
                        a = null;
                    }
                    e.a(h);
                }
            } else
            {
                b();
            }
        } else
        {
            b();
        }
        k = getMeasuredWidth();
        super.onMeasure(j, i1);
        j = getMeasuredWidth();
        if (flag && k != j)
        {
            a(h);
        }
    }

}
