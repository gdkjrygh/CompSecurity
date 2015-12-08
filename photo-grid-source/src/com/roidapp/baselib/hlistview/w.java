// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.roidapp.baselib.e;

public final class w
{

    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int a = 1;
    private final Drawable b;
    private final Drawable c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final int h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private long u;
    private float v;
    private final Interpolator w = new DecelerateInterpolator();
    private int x;
    private float y;
    private final Rect z = new Rect();

    public w(Context context)
    {
        x = 0;
        context = context.getResources();
        b = context.getDrawable(e.bC);
        c = context.getDrawable(e.bD);
        A = b.getIntrinsicHeight();
        B = c.getIntrinsicHeight();
        C = c.getIntrinsicWidth();
        D = (int)(Math.min((((float)B * 4F * (float)B) / (float)C) * 0.6F, (float)B * 4F) + 0.5F);
        h = (int)(context.getDisplayMetrics().density * 300F + 0.5F);
    }

    public final Rect a(boolean flag)
    {
        int i1 = 0;
        z.set(0, 0, d, D);
        Rect rect = z;
        int j1 = f;
        int k1 = g;
        if (flag)
        {
            i1 = D;
        }
        rect.offset(j1, k1 - i1);
        return z;
    }

    public final void a(float f1)
    {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        if (x == 4 && (float)(l1 - u) < v)
        {
            return;
        }
        if (x != 1)
        {
            l = 1.0F;
        }
        x = 1;
        u = l1;
        v = 167F;
        y = y + f1;
        float f2 = Math.abs(y);
        float f3 = Math.max(0.6F, Math.min(f2, 1.0F));
        m = f3;
        i = f3;
        f2 = Math.max(0.5F, Math.min(f2 * 7F, 1.0F));
        o = f2;
        j = f2;
        f2 = Math.min(1.0F, k + Math.abs(f1) * 1.1F);
        q = f2;
        k = f2;
        f3 = Math.abs(f1);
        f2 = f3;
        if (f1 > 0.0F)
        {
            f2 = f3;
            if (y < 0.0F)
            {
                f2 = -f3;
            }
        }
        if (y == 0.0F)
        {
            l = 0.0F;
        }
        f1 = Math.min(4F, Math.max(0.0F, f2 * 7F + l));
        s = f1;
        l = f1;
        n = i;
        p = j;
        r = k;
        t = l;
    }

    public final void a(int i1)
    {
        x = 2;
        i1 = Math.max(100, Math.abs(i1));
        u = AnimationUtils.currentAnimationTimeMillis();
        v = 0.1F + (float)i1 * 0.03F;
        m = 0.0F;
        o = 0.0F;
        j = 0.0F;
        q = 0.5F;
        s = 0.0F;
        n = Math.max(0, Math.min(i1 * 8, 1));
        p = Math.max(0.5F, Math.min(i1 * 8, 1.0F));
        t = Math.min(0.025F + (float)((i1 / 100) * i1) * 0.00015F, 1.75F);
        r = Math.max(q, Math.min((float)(i1 * 16) * 1E-05F, 1.0F));
    }

    public final void a(int i1, int j1)
    {
        d = i1;
        e = j1;
    }

    public final boolean a()
    {
        return x == 0;
    }

    public final boolean a(Canvas canvas)
    {
        float f1;
        float f3;
        f1 = Math.min((float)(AnimationUtils.currentAnimationTimeMillis() - u) / v, 1.0F);
        f3 = w.getInterpolation(f1);
        i = m + (n - m) * f3;
        j = o + (p - o) * f3;
        k = q + (r - q) * f3;
        l = s + (t - s) * f3;
        if (f1 < 0.999F) goto _L2; else goto _L1
_L1:
        x;
        JVM INSTR tableswitch 1 4: default 152
    //                   1 401
    //                   2 328
    //                   3 535
    //                   4 474;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_535;
_L2:
        c.setAlpha((int)(Math.max(0.0F, Math.min(k, 1.0F)) * 255F));
        int i1 = (int)Math.min((((float)B * l * (float)B) / (float)C) * 0.6F, (float)B * 4F);
        c.setBounds(0, 0, d, i1);
        c.draw(canvas);
        b.setAlpha((int)(Math.max(0.0F, Math.min(i, 1.0F)) * 255F));
        int j1 = (int)((float)A * j);
        b.setBounds(0, 0, d, j1);
        b.draw(canvas);
        if (x == 3 && i1 == 0 && j1 == 0)
        {
            x = 0;
        }
        float f2;
        float f4;
        return x != 0;
_L5:
        x = 3;
        u = AnimationUtils.currentAnimationTimeMillis();
        v = 1000F;
        m = i;
        o = j;
        q = k;
        s = l;
        n = 0.0F;
        p = 0.0F;
        r = 0.0F;
        t = 0.0F;
          goto _L2
_L4:
        x = 4;
        u = AnimationUtils.currentAnimationTimeMillis();
        v = 1000F;
        m = i;
        o = j;
        q = k;
        s = l;
        n = 0.0F;
        p = 0.0F;
        r = 0.0F;
        t = 0.0F;
          goto _L2
_L7:
        if (t != 0.0F)
        {
            f2 = 1.0F / (t * t);
        } else
        {
            f2 = 3.402823E+38F;
        }
        f4 = o;
        j = f2 * (f3 * (p - o)) + f4;
        x = 3;
          goto _L2
        x = 0;
          goto _L2
    }

    public final void b()
    {
        x = 0;
    }

    public final void b(int i1, int j1)
    {
        f = i1;
        g = j1;
    }

    public final void c()
    {
        y = 0.0F;
        if (x != 1 && x != 4)
        {
            return;
        } else
        {
            x = 3;
            m = i;
            o = j;
            q = k;
            s = l;
            n = 0.0F;
            p = 0.0F;
            r = 0.0F;
            t = 0.0F;
            u = AnimationUtils.currentAnimationTimeMillis();
            v = 1000F;
            return;
        }
    }
}
