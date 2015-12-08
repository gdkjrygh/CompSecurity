// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

// Referenced classes of package com.roidapp.baselib.view:
//            f

public final class e extends FrameLayout
{

    private final Random a = new Random();
    private boolean b;
    private int c;
    private int d;
    private float e;
    private Drawable f[];
    private int g[];
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final Interpolator l = new LinearInterpolator();
    private final List m = new ArrayList();
    private final Runnable n = new f(this);

    public e(Context context)
    {
        super(context);
        b = true;
        e = 1.0F;
        h = 100;
        i = false;
        j = true;
        k = false;
        setClickable(false);
        setVisibility(8);
    }

    private void a(boolean flag)
    {
        Runnable runnable = n;
        long l1;
        if (flag)
        {
            l1 = a.nextInt(4) * 1000;
        } else
        {
            l1 = 0L;
        }
        postDelayed(runnable, l1);
    }

    static boolean a(e e1)
    {
        return e1.b;
    }

    static int b(e e1)
    {
        return e1.c;
    }

    static int c(e e1)
    {
        return e1.d;
    }

    static Random d(e e1)
    {
        return e1.a;
    }

    static float e(e e1)
    {
        return e1.e;
    }

    static Drawable[] f(e e1)
    {
        return e1.f;
    }

    static int[] g(e e1)
    {
        return e1.g;
    }

    static boolean h(e e1)
    {
        return e1.i;
    }

    static boolean i(e e1)
    {
        return e1.j;
    }

    static boolean j(e e1)
    {
        return e1.k;
    }

    static int k(e e1)
    {
        return e1.h;
    }

    static Interpolator l(e e1)
    {
        return e1.l;
    }

    static List m(e e1)
    {
        return e1.m;
    }

    static void n(e e1)
    {
        e1.a(true);
    }

    public final e a(float f1)
    {
        e = f1;
        return this;
    }

    public final e a(int i1)
    {
        c = i1;
        return this;
    }

    public final transient e a(int ai[])
    {
        if (ai.length > 0)
        {
            f = new Drawable[ai.length];
        }
        for (int i1 = 0; i1 < ai.length; i1++)
        {
            f[i1] = getResources().getDrawable(ai[i1]);
        }

        return this;
    }

    public final boolean a()
    {
        return !b;
    }

    public final e b(int i1)
    {
        d = i1;
        return this;
    }

    public final void b()
    {
        if (f != null)
        {
            b = false;
            setVisibility(0);
            a(false);
        }
    }

    public final e c(int i1)
    {
        h = i1;
        return this;
    }

    public final void c()
    {
        b = true;
        removeCallbacks(n);
        setVisibility(8);
        AnimatorSet animatorset;
        for (Iterator iterator = m.iterator(); iterator.hasNext(); animatorset.setTarget(null))
        {
            animatorset = (AnimatorSet)iterator.next();
            animatorset.cancel();
        }

        m.clear();
    }

    public final e d()
    {
        i = true;
        return this;
    }

    public final e e()
    {
        j = true;
        return this;
    }

    public final e f()
    {
        k = true;
        return this;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    protected final void onMeasure(int i1, int j1)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)getLayoutParams();
        if (layoutparams.width == -2 || layoutparams.height == -2)
        {
            layoutparams.width = -1;
            layoutparams.height = -1;
        }
        super.onMeasure(i1, j1);
    }
}
