// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;


// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            k

public static class e
{

    private int a;
    private float b[];
    private float c[];
    private float d[];
    private int e[];
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private long t;

    private int a(int i1)
    {
        int j1 = 32768;
        int k1 = i1;
        i1 = 15;
        int j2 = 0;
        do
        {
            int k2 = (j2 << 1) + j1 << i1;
            int i2 = j2;
            int l1 = k1;
            if (k1 >= k2)
            {
                i2 = j2 + j1;
                l1 = k1 - k2;
            }
            j1 >>= 1;
            if (j1 <= 0)
            {
                return i2;
            }
            i1--;
            j2 = i2;
            k1 = l1;
        } while (true);
    }

    private void a(int i1, float af[], float af1[], float af2[], int ai[], int j1, boolean flag, 
            long l1)
    {
        t = l1;
        s = j1;
        a = i1;
        for (j1 = 0; j1 < i1; j1++)
        {
            b[j1] = af[j1];
            c[j1] = af1[j1];
            d[j1] = af2[j1];
            e[j1] = ai[j1];
        }

        n = flag;
        if (i1 >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
        if (o)
        {
            f = (af[0] + af[1]) * 0.5F;
            g = (af1[0] + af1[1]) * 0.5F;
            h = (af2[0] + af2[1]) * 0.5F;
            i = Math.abs(af[1] - af[0]);
            j = Math.abs(af1[1] - af1[0]);
        } else
        {
            f = af[0];
            g = af1[0];
            h = af2[0];
            j = 0.0F;
            i = 0.0F;
        }
        r = false;
        q = false;
        p = false;
    }

    static void a(p p1, int i1, float af[], float af1[], float af2[], int ai[], int j1, boolean flag, 
            long l1)
    {
        p1.a(i1, af, af1, af2, ai, j1, flag, l1);
    }

    static long b(a a1)
    {
        return a1.t;
    }

    public void a(t t1)
    {
        a = t1.a;
        for (int i1 = 0; i1 < a; i1++)
        {
            b[i1] = t1.b[i1];
            c[i1] = t1.c[i1];
            d[i1] = t1.d[i1];
            e[i1] = t1.e[i1];
        }

        f = t1.f;
        g = t1.g;
        h = t1.h;
        i = t1.i;
        j = t1.j;
        k = t1.k;
        l = t1.l;
        m = t1.m;
        n = t1.n;
        s = t1.s;
        o = t1.o;
        q = t1.q;
        p = t1.p;
        r = t1.r;
        t = t1.t;
    }

    public boolean a()
    {
        return o;
    }

    public float b()
    {
        if (o)
        {
            return i;
        } else
        {
            return 0.0F;
        }
    }

    public float c()
    {
        if (o)
        {
            return j;
        } else
        {
            return 0.0F;
        }
    }

    public float d()
    {
        if (!p)
        {
            float f1;
            if (o)
            {
                f1 = i * i + j * j;
            } else
            {
                f1 = 0.0F;
            }
            l = f1;
            p = true;
        }
        return l;
    }

    public float e()
    {
        float f1 = 0.0F;
        if (q) goto _L2; else goto _L1
_L1:
        if (o) goto _L4; else goto _L3
_L3:
        k = 0.0F;
_L6:
        q = true;
_L2:
        return k;
_L4:
        float f2 = d();
        if (f2 != 0.0F)
        {
            f1 = (float)a((int)(256F * f2)) / 16F;
        }
        k = f1;
        if (k < i)
        {
            k = i;
        }
        if (k < j)
        {
            k = j;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public float f()
    {
        if (!r)
        {
            if (!o)
            {
                m = 0.0F;
            } else
            {
                m = (float)Math.atan2(c[1] - c[0], b[1] - b[0]);
            }
            r = true;
        }
        return m;
    }

    public float g()
    {
        return f;
    }

    public float h()
    {
        return g;
    }

    public boolean i()
    {
        return n;
    }

    public long j()
    {
        return t;
    }

    public ()
    {
        b = new float[20];
        c = new float[20];
        d = new float[20];
        e = new int[20];
    }
}
