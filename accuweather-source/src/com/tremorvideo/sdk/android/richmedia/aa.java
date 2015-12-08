// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Canvas;
import com.tremorvideo.sdk.android.videoad.ct;

public class aa
{

    Canvas a;
    n.a b;
    float c;
    float d;
    float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;

    public aa()
    {
        f = 1.0F;
        g = true;
        h = 1.0F;
        i = 1.0F;
    }

    public float a()
    {
        return f;
    }

    public float a(ab.b b1)
    {
        if (b1 == ab.b.b)
        {
            return Math.min(h, i);
        }
        if (b1 == ab.b.c)
        {
            return Math.max(h, i);
        } else
        {
            return c;
        }
    }

    public void a(float f1, float f2, float f3, float f4, ab.b b1, b.b b2)
    {
        if (b2 != b.b.b && b2 != b.b.e && b2 != b.b.h) goto _L2; else goto _L1
_L1:
        float f5 = f1 + f3 / 2.0F;
_L7:
        if (b2 != b.b.d && b2 != b.b.e && b2 != b.b.f) goto _L4; else goto _L3
_L3:
        f1 = f2 + f4 / 2.0F;
_L10:
        f2 = f();
        float f6 = g();
        f3 = a(b1) * f3;
        f4 = a(b1) * f4;
        l = f2 * f5;
        m = f6 * f1;
        if (b2 == b.b.b || b2 == b.b.e || b2 == b.b.h)
        {
            l = l - f3 / 2.0F;
        } else
        if (b2 == b.b.c || b2 == b.b.f || b2 == b.b.i)
        {
            l = l - f3;
        }
        if (b2 == b.b.d || b2 == b.b.e || b2 == b.b.f)
        {
            m = m - f4 / 2.0F;
        } else
        if (b2 == b.b.g || b2 == b.b.h || b2 == b.b.i)
        {
            m = m - f4;
        }
        n = f3;
        o = f4;
        return;
_L2:
        if (b2 == b.b.c || b2 == b.b.f) goto _L6; else goto _L5
_L5:
        f5 = f1;
        if (b2 != b.b.i) goto _L7; else goto _L6
_L6:
        f5 = f1 + f3;
          goto _L7
_L4:
        if (b2 == b.b.g || b2 == b.b.h) goto _L9; else goto _L8
_L8:
        f1 = f2;
        if (b2 != b.b.i) goto _L10; else goto _L9
_L9:
        f1 = f2 + f4;
          goto _L10
    }

    public void a(Canvas canvas)
    {
        try
        {
            a = canvas;
            j = canvas.getWidth();
            k = canvas.getHeight();
            d = 1.0F;
            e = 1.0F;
            c = 1.0F;
            h = 1.0F;
            i = 1.0F;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            ct.a(canvas);
        }
    }

    public void a(n.a a1, Canvas canvas, int i1, int j1)
    {
        b = a1;
        a = canvas;
        j = canvas.getWidth();
        k = canvas.getHeight();
        d = (float)canvas.getWidth() / (float)i1;
        e = (float)canvas.getHeight() / (float)j1;
        int k1 = Math.max(canvas.getWidth(), canvas.getHeight());
        int l1 = Math.min(canvas.getWidth(), canvas.getHeight());
        h = (float)k1 / (float)i1;
        i = (float)l1 / (float)j1;
        c = Math.min(d, e);
    }

    public n.a b()
    {
        return b;
    }

    public Canvas c()
    {
        return a;
    }

    public float d()
    {
        return j;
    }

    public float e()
    {
        return k;
    }

    public float f()
    {
        return d;
    }

    public float g()
    {
        return e;
    }

    public float h()
    {
        return l;
    }

    public float i()
    {
        return m;
    }

    public float j()
    {
        return Math.max(1.0F, n);
    }

    public float k()
    {
        return Math.max(1.0F, o);
    }
}
