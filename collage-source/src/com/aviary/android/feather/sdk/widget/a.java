// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

public class a
{

    private final int A;
    private Drawable a;
    private Drawable b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private long r;
    private float s;
    private final Interpolator t;
    private int u;
    private float v;
    private final Rect w;
    private int x;
    private int y;
    private final int z;

    public a(Context context, int i1)
    {
        Object obj;
        d = 255;
        e = 255;
        u = 0;
        w = new Rect();
        TypedArray typedarray = context.obtainStyledAttributes(i1, com.aviary.android.feather.sdk.R.styleable.AviaryEdgeEffect);
        a = typedarray.getDrawable(0);
        b = typedarray.getDrawable(1);
        i1 = typedarray.getColor(2, 0);
        obj = typedarray.getString(3);
        typedarray.recycle();
        if (a == null)
        {
            a = context.getResources().getDrawable(com.aviary.android.feather.sdk.R.drawable.aviary_overscroll_edge);
        }
        if (b == null)
        {
            b = context.getResources().getDrawable(com.aviary.android.feather.sdk.R.drawable.aviary_overscroll_glow);
        }
        if (i1 == 0 || obj == null) goto _L2; else goto _L1
_L1:
        context = android.graphics.PorterDuff.Mode.MULTIPLY;
        obj = android.graphics.PorterDuff.Mode.valueOf(((String) (obj)));
        context = ((Context) (obj));
_L4:
        a(i1, context);
_L2:
        x = a.getIntrinsicHeight();
        y = b.getIntrinsicHeight();
        z = b.getIntrinsicWidth();
        A = (int)(Math.min((((float)y * 1.0F * (float)y) / (float)z) * 0.6F, (float)y * 1.0F) + 0.5F);
        t = new DecelerateInterpolator();
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        float f1;
        float f3;
        f1 = Math.min((float)(AnimationUtils.currentAnimationTimeMillis() - r) / s, 1.0F);
        f3 = t.getInterpolation(f1);
        f = j + (k - j) * f3;
        g = l + (m - l) * f3;
        h = n + (o - n) * f3;
        i = p + (q - p) * f3;
        if (f1 < 0.999F) goto _L2; else goto _L1
_L1:
        u;
        JVM INSTR tableswitch 1 4: default 152
    //                   1 224
    //                   2 153
    //                   3 352
    //                   4 295;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return;
_L4:
        u = 3;
        r = AnimationUtils.currentAnimationTimeMillis();
        s = 1000F;
        j = f;
        l = g;
        n = h;
        p = i;
        k = 0.0F;
        m = 0.0F;
        o = 0.0F;
        q = 0.0F;
        return;
_L3:
        u = 4;
        r = AnimationUtils.currentAnimationTimeMillis();
        s = 1000F;
        j = f;
        l = g;
        n = h;
        p = i;
        k = 0.0F;
        m = 0.0F;
        o = 0.0F;
        q = 0.0F;
        return;
_L6:
        float f2;
        float f4;
        if (q != 0.0F)
        {
            f2 = 1.0F / (q * q);
        } else
        {
            f2 = 3.402823E+38F;
        }
        f4 = l;
        g = f2 * (f3 * (m - l)) + f4;
        u = 3;
        return;
_L5:
        u = 0;
        return;
    }

    public void a(float f1)
    {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        if (u == 4 && (float)(l1 - r) < s)
        {
            return;
        }
        if (u != 1)
        {
            i = 0.1F;
        }
        u = 1;
        r = l1;
        s = 167F;
        v = v + f1;
        float f2 = Math.abs(v);
        float f3 = Math.max(0.6F, Math.min(f2, 1.0F));
        j = f3;
        f = f3;
        f2 = Math.max(0.5F, Math.min(f2 * 7F, 1.0F));
        l = f2;
        g = f2;
        f2 = Math.min(1.0F, h + Math.abs(f1) * 1.1F);
        n = f2;
        h = f2;
        f3 = Math.abs(f1);
        f2 = f3;
        if (f1 > 0.0F)
        {
            f2 = f3;
            if (v < 0.0F)
            {
                f2 = -f3;
            }
        }
        if (v == 0.0F)
        {
            i = 0.0F;
        }
        f1 = Math.min(1.0F, Math.max(0.0F, f2 * 7F + i));
        p = f1;
        i = f1;
        k = f;
        m = g;
        o = h;
        q = i;
    }

    public void a(int i1)
    {
        d = i1;
    }

    public void a(int i1, int j1)
    {
        c = i1;
        y = j1;
        x = j1;
    }

    public void a(int i1, android.graphics.PorterDuff.Mode mode)
    {
        if (a != null)
        {
            a.setColorFilter(i1, mode);
        }
        if (b != null)
        {
            b.setColorFilter(i1, mode);
        }
    }

    public boolean a()
    {
        return u == 0;
    }

    public boolean a(Canvas canvas)
    {
        boolean flag = false;
        c();
        b.setAlpha((int)(Math.max(0.0F, Math.min(h, 1.0F)) * (float)e));
        int i1 = (int)((float)y * i);
        b.setBounds(0, 0, c, i1);
        b.draw(canvas);
        a.setAlpha((int)(Math.max(0.0F, Math.min(f, 1.0F)) * (float)d));
        int j1 = (int)((float)x * g);
        a.setBounds(0, 0, c, j1);
        a.draw(canvas);
        if (u == 3 && i1 == 0 && j1 == 0)
        {
            u = 0;
        }
        if (u != 0)
        {
            flag = true;
        }
        return flag;
    }

    public void b()
    {
        v = 0.0F;
        if (u != 1 && u != 4)
        {
            return;
        } else
        {
            u = 3;
            j = f;
            l = g;
            n = h;
            p = i;
            k = 0.0F;
            m = 0.0F;
            o = 0.0F;
            q = 0.0F;
            r = AnimationUtils.currentAnimationTimeMillis();
            s = 1000F;
            return;
        }
    }

    public void b(int i1)
    {
        u = 2;
        i1 = Math.max(100, Math.abs(i1));
        r = AnimationUtils.currentAnimationTimeMillis();
        s = 0.1F + (float)i1 * 0.03F;
        j = 0.0F;
        l = 0.0F;
        g = 0.0F;
        n = 0.5F;
        p = 0.0F;
        k = Math.max(0, Math.min(i1 * 8, 1));
        m = Math.max(0.5F, Math.min(i1 * 8, 1.0F));
        q = Math.min(0.025F + (float)((i1 / 100) * i1) * 0.00015F, 1.75F);
        o = Math.max(n, Math.min((float)(i1 * 16) * 1E-05F, 1.0F));
    }
}
