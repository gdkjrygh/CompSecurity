// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.format.e;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p

public abstract class o extends p
{
    protected class a
    {

        public Drawable a;
        public Drawable b;
        final o c;

        public a(int i1, int j1)
        {
            c = o.this;
            super();
            a = i().getResources().getDrawable(i1);
            b = i().getResources().getDrawable(j1);
        }
    }


    static final int d = 0;
    static final int e = 1;
    static final int f = -1;
    static final int g = -2;
    protected a h[];
    protected int i;
    protected TextView j;
    protected TextView k;
    protected TextView l;
    protected ProgressBar m;
    protected double n;
    protected double o;
    protected Handler p;
    protected Runnable q;

    public o()
    {
        i = -2;
        p = new Handler();
        q = new Runnable() {

            final o a;

            public void run()
            {
                a.n();
            }

            
            {
                a = o.this;
                super();
            }
        };
    }

    private boolean l()
    {
        return UISavedState.b(e());
    }

    private void m()
    {
        UISavedState.a(e());
    }

    protected int P_()
    {
        return 0x7f040198;
    }

    protected void R_()
    {
        double d1 = j();
        double d2 = k();
        n = o;
        k.setText(b(Double.valueOf(d1)));
        String s;
        if (d1 == 0.0D)
        {
            d1 = 0.0D;
        } else
        {
            d1 = d2 / d1;
        }
        o = d1;
        s = a(Double.valueOf(d2));
        j.setText(s);
        l.setText(a(s));
        if (n <= 0.0D)
        {
            a(o);
            return;
        } else
        {
            n();
            return;
        }
    }

    protected String a(Double double1)
    {
        return com.fitbit.util.format.e.a(double1.doubleValue());
    }

    protected abstract String a(String s);

    protected void a(double d1)
    {
        double d2 = 0.0D;
        a(m, x, d1);
        m.setProgress((int)((double)m.getMax() * d1));
        ProgressBar progressbar = m;
        if (d1 != 0.0D)
        {
            d2 = 0.016D;
        }
        progressbar.setSecondaryProgress((int)((d2 + d1) * (double)m.getMax()));
    }

    protected void a(View view)
    {
        super.a(view);
        h = a();
        j = (TextView)view.findViewById(0x7f11043e);
        k = (TextView)view.findViewById(0x7f11043f);
        l = (TextView)view.findViewById(0x7f110440);
        m = (ProgressBar)view.findViewById(0x7f110441);
    }

    protected void a(ProgressBar progressbar, FlipImageView flipimageview, double d1)
    {
label0:
        {
            int k1 = (int)(((double)Math.round(100D * d1) / 100D) * (double)(h.length - 1));
            int i1 = k1;
            if (k1 >= h.length)
            {
                i1 = h.length - 1;
            }
            k1 = i1;
            if (i1 < 0)
            {
                k1 = 0;
            }
            if (a(flipimageview, d1))
            {
                k1 = -1;
            }
            if (k1 != i)
            {
                i = k1;
                int j1 = k1;
                if (k1 == -1)
                {
                    j1 = h.length - 1;
                    m();
                }
                android.graphics.Rect rect = progressbar.getProgressDrawable().getBounds();
                progressbar.setProgressDrawable(h[j1].b);
                progressbar.getProgressDrawable().setBounds(rect);
                flipimageview.a(h[j1].a);
                if (i != -1 || flipimageview.b())
                {
                    break label0;
                }
                flipimageview.c();
            }
            return;
        }
        flipimageview.a();
    }

    protected boolean a(FlipImageView flipimageview, double d1)
    {
        return r() && d1 >= 1.0D && (!l() || flipimageview.b());
    }

    protected abstract a[] a();

    protected CharSequence b(Double double1)
    {
        if (Double.isNaN(double1.doubleValue()))
        {
            return i().getString(0x7f080426);
        } else
        {
            return com.fitbit.util.format.e.g(double1.doubleValue());
        }
    }

    protected abstract int d();

    protected abstract com.fitbit.savedstate.UISavedState.AnimatedGoalType e();

    protected abstract double j();

    protected abstract double k();

    protected void n()
    {
        n = n + 0.019999999552965164D;
        boolean flag = false;
        if (n >= o)
        {
            n = o;
            flag = true;
        }
        a(n);
        p.removeCallbacks(q);
        if (!flag)
        {
            p.postDelayed(q, 10L);
        }
    }

    protected void o()
    {
        super.o();
        i = -2;
    }
}
