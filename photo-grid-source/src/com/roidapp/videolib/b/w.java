// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.opengl.Matrix;
import jp.co.cyberagent.android.a.h;

public final class w
{

    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private long F;
    private long G;
    private long H;
    private long I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private h i;
    private float j;
    private float k;
    private float l;
    private long m;
    private long n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private long v;
    private long w;
    private long x;
    private long y;
    private float z;

    public w()
    {
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = 0L;
        h = 0L;
        j = 0.0F;
        k = 0.0F;
        o = 0.0F;
        p = 0.0F;
        q = 0.0F;
        r = 1.0F;
        s = 1.0F;
        t = 1.0F;
        u = 1.0F;
        B = 0.0F;
        C = 0.0F;
        D = 0.0F;
        E = 0.0F;
        L = 1.0F;
        M = 1.0F;
    }

    public final void a()
    {
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        if (i != null)
        {
            i.e(1.0F);
        }
    }

    public final void a(float f1, float f2, long l1, long l2)
    {
        a = true;
        r = f1;
        s = f2;
        z = (f2 - f1) / (float)(l2 - l1);
        v = l1;
        w = l2;
    }

    public final void a(float f1, float f2, long l1, long l2, float f3, 
            float f4, float f5)
    {
        e = true;
        j = f1;
        k = f2;
        m = l1;
        n = l2;
        l = (f2 - f1) / (float)(n - m);
        o = f3;
        p = f4;
        q = f5;
    }

    public final void a(long l1)
    {
        if (i == null)
        {
            return;
        }
        Matrix.setIdentityM(i.n(), 0);
        float af[] = new float[16];
        float af1[] = new float[16];
        Matrix.setIdentityM(af, 0);
        Matrix.setIdentityM(af1, 0);
        Matrix.setIdentityM(i.n, 0);
        float f1;
        float f2;
        if (f)
        {
            float f3;
            if ((float)l1 <= O)
            {
                f1 = L;
            } else
            if ((float)l1 >= P)
            {
                f1 = M;
            } else
            {
                f1 = L + N * ((float)l1 - O);
            }
            f2 = f1;
            if (f1 < 1E-05F)
            {
                f2 = 0.0F;
            }
            i.e(f2);
        }
        if (e)
        {
            if (l1 <= m)
            {
                f1 = B;
            } else
            if (l1 >= n)
            {
                f1 = C;
            } else
            {
                f1 = j;
                f1 = l * (float)(l1 - m) + f1;
            }
            Matrix.rotateM(i.n, 0, f1, o, p, 1.0F);
        }
        if (a)
        {
            if (l1 <= v)
            {
                f1 = r;
            } else
            if (l1 >= w)
            {
                f1 = s;
            } else
            {
                f1 = r + z * (float)(l1 - v);
            }
        } else
        {
            f1 = 1.0F;
        }
        if (c)
        {
            if (l1 <= x)
            {
                f2 = t;
            } else
            if (l1 >= y)
            {
                f2 = u;
            } else
            {
                f2 = t + A * (float)(l1 - x);
            }
        } else
        {
            f2 = 1.0F;
        }
        f1 = i.o() * f1;
        f3 = i.o() * f2;
        if (f1 < 1E-05F)
        {
            f1 = 0.0F;
        }
        f2 = f3;
        if (f3 < 1E-05F)
        {
            f2 = 0.0F;
        }
        Matrix.scaleM(i.n, 0, f1, f2, 1.0F);
        if (b)
        {
            if (l1 <= F)
            {
                f1 = B;
            } else
            if (l1 >= G)
            {
                f1 = C;
            } else
            {
                f1 = B + J * (float)(l1 - F);
            }
        } else
        {
            f1 = 0.0F;
        }
        if (d)
        {
            if (l1 <= H)
            {
                f2 = D;
            } else
            if (l1 >= I)
            {
                f2 = E;
            } else
            {
                f2 = D + K * (float)(l1 - H);
            }
        } else
        {
            f2 = 0.0F;
        }
        Matrix.translateM(af, 0, f1, f2, 0.0F);
        Matrix.multiplyMM(i.n, 0, af, 0, i.n, 0);
        Matrix.multiplyMM(i.n(), 0, i.m, 0, i.n, 0);
        Matrix.multiplyMM(i.n(), 0, i.l, 0, i.n(), 0);
    }

    public final void a(h h1)
    {
        i = h1;
    }

    public final void b(float f1, float f2, long l1, long l2)
    {
        a = true;
        t = f1;
        u = f2;
        x = l1;
        y = l2;
        A = (f2 - f1) / (float)(l2 - l1);
    }

    public final void c(float f1, float f2, long l1, long l2)
    {
        c = true;
        t = f1;
        u = f2;
        x = l1;
        y = l2;
        A = (f2 - f1) / (float)(l2 - l1);
        a = true;
        r = f1;
        s = f2;
        z = A;
        v = l1;
        w = l2;
    }

    public final void d(float f1, float f2, long l1, long l2)
    {
        b = true;
        B = f1;
        C = f2;
        F = l1;
        G = l2;
        J = (f2 - f1) / (float)(l2 - l1);
    }

    public final void e(float f1, float f2, long l1, long l2)
    {
        b = true;
        B = f1;
        C = f2;
        F = l1;
        G = l2;
        J = (f2 - f1) / (float)(l2 - l1);
        d = true;
        D = f1;
        E = f2;
        H = l1;
        I = l2;
        K = J;
    }

    public final void f(float f1, float f2, long l1, long l2)
    {
        d = true;
        D = f1;
        E = f2;
        H = l1;
        I = l2;
        K = (f2 - f1) / (float)(l2 - l1);
    }

    public final void g(float f1, float f2, long l1, long l2)
    {
        f = true;
        L = f1;
        M = f2;
        O = l1;
        P = l2;
        N = (f2 - f1) / (P - O);
    }
}
