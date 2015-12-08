// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FlipImageView extends ImageView
{

    private static final int a = 1;
    private static final int b = 2;
    private static int c = 1000;
    private static int d = 2000;
    private static int e = 1;
    private boolean f;
    private boolean g;
    private Drawable h;
    private Drawable i;
    private a j;
    private boolean k;
    private boolean l;
    private int m;
    private android.view.animation.Animation.AnimationListener n;

    public FlipImageView(Context context)
    {
        super(context);
        f = false;
        g = false;
        n = new _cls1();
        a(context, null, 0);
    }

    public FlipImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
        g = false;
        n = new _cls1();
        a(context, attributeset, 0);
    }

    public FlipImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = false;
        g = false;
        n = new _cls1();
        a(context, attributeset, i1);
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag1 = true;
        context = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.R.styleable.FlipImageView, i1, 0);
        i = context.getDrawable(0);
        i1 = context.getInt(1, c);
        int j1 = context.getInteger(3, e);
    /* block-local class not found */
    class a {}

        boolean flag;
        if ((j1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if ((j1 & 2) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        l = flag;
        m = context.getInt(2, d);
        h = getDrawable();
        j = new a();
        j.setAnimationListener(n);
        j.setDuration(i1);
        context.recycle();
    }

    static boolean a(FlipImageView flipimageview)
    {
        return flipimageview.f;
    }

    static boolean a(FlipImageView flipimageview, boolean flag)
    {
        flipimageview.g = flag;
        return flag;
    }

    static boolean b(FlipImageView flipimageview)
    {
        return flipimageview.g;
    }

    static int c(FlipImageView flipimageview)
    {
        return flipimageview.m;
    }

    static Drawable d(FlipImageView flipimageview)
    {
        return flipimageview.i;
    }

    static Drawable e(FlipImageView flipimageview)
    {
        return flipimageview.h;
    }

    static boolean f(FlipImageView flipimageview)
    {
        return flipimageview.k;
    }

    static boolean g(FlipImageView flipimageview)
    {
        return flipimageview.l;
    }

    public void a()
    {
        if (g)
        {
            f = false;
            g = false;
            clearAnimation();
            setImageDrawable(h);
        }
    }

    public void a(Drawable drawable)
    {
        h = drawable;
        setImageDrawable(drawable);
    }

    public boolean b()
    {
        return g;
    }

    public void c()
    {
        Drawable drawable;
        a a1;
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        g = true;
        a1 = j;
        if (f)
        {
            drawable = i;
        } else
        {
            drawable = h;
        }
        a1.a(drawable);
        startAnimation(j);
    }


    /* member class not found */
    class _cls1 {}

}
