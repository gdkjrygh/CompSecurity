// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;


// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            k

public static class 
{

    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;

    static boolean a( )
    {
        return .g;
    }

    static boolean b(g g1)
    {
        return g1.h;
    }

    static boolean c(h h1)
    {
        return h1.i;
    }

    static float d(i j)
    {
        return j.c;
    }

    static float e(c c1)
    {
        return c1.a;
    }

    static float f(a a1)
    {
        return a1.b;
    }

    static float g(b b1)
    {
        return b1.d;
    }

    static float h(d d1)
    {
        return d1.e;
    }

    static float i(e e1)
    {
        return e1.f;
    }

    public float a()
    {
        return a;
    }

    public void a(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        float f7 = 1.0F;
        a = f1;
        b = f2;
        f1 = f3;
        if (f3 == 0.0F)
        {
            f1 = 1.0F;
        }
        c = f1;
        f1 = f4;
        if (f4 == 0.0F)
        {
            f1 = 1.0F;
        }
        d = f1;
        if (f5 == 0.0F)
        {
            f1 = f7;
        } else
        {
            f1 = f5;
        }
        e = f1;
        f = f6;
    }

    public void a(float f1, float f2, boolean flag, float f3, boolean flag1, float f4, float f5, 
            boolean flag2, float f6)
    {
        float f7 = 1.0F;
        a = f1;
        b = f2;
        g = flag;
        f1 = f3;
        if (f3 == 0.0F)
        {
            f1 = 1.0F;
        }
        c = f1;
        h = flag1;
        f1 = f4;
        if (f4 == 0.0F)
        {
            f1 = 1.0F;
        }
        d = f1;
        if (f5 == 0.0F)
        {
            f1 = f7;
        } else
        {
            f1 = f5;
        }
        e = f1;
        i = flag2;
        f = f6;
    }

    public float b()
    {
        return b;
    }

    public float c()
    {
        if (!g)
        {
            return 1.0F;
        } else
        {
            return c;
        }
    }

    public float d()
    {
        if (!i)
        {
            return 0.0F;
        } else
        {
            return f;
        }
    }

    public ()
    {
    }
}
