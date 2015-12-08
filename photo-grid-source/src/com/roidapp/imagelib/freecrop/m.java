// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.graphics.Matrix;

public abstract class m
{

    protected float A;
    protected float B;
    protected float C;
    public float D;
    public float E;
    protected float F;
    protected float n;
    protected float o;
    protected float p;
    protected int q;
    protected int r;
    protected float s;
    protected Matrix t;
    protected Matrix u;
    protected Matrix v;
    protected Matrix w;
    protected Matrix x;
    protected Matrix y;
    protected float z;

    public m()
    {
        s = 1.0F;
        u = new Matrix();
        w = new Matrix();
        x = new Matrix();
        y = new Matrix();
        D = 1.0F;
        E = 1.0F;
        F = 0.0F;
    }

    public final void a(float f, float f1, float f2)
    {
        o = f;
        p = f1;
        s = f2;
        n = 0.0F;
        t = new Matrix();
        f = g();
        t.postScale(s, s);
        t.postRotate(f);
        t.postTranslate(o, p);
        t.invert(u);
    }

    public final void b(float f, float f1)
    {
        float af[] = new float[2];
        af[0] = f;
        af[1] = f1;
        x.postTranslate(af[0], af[1]);
    }

    public final void b(float f, float f1, float f2)
    {
        z = f;
        A = f1;
        C = f2;
        B = 0.0F;
        v = new Matrix();
        f = (float)Math.toDegrees(B);
        v.postScale(C, C);
        v.postRotate(f);
        v.postTranslate(z, A);
        v.invert(w);
    }

    public final void b(float f, float f1, float f2, float f3)
    {
        D = D * f;
        E = E * f1;
        x.postScale(f, f1, f2, f3);
    }

    public final void c(float f, float f1, float f2)
    {
        x.postRotate(f, f1, f2);
        F = F + f;
    }

    public final boolean c(float f, float f1)
    {
        return f >= 0.0F && f < (float)r && f1 >= 0.0F && f1 < (float)q;
    }

    public final float g()
    {
        return (float)Math.toDegrees(n);
    }

    public final Matrix h()
    {
        return t;
    }

    public final Matrix i()
    {
        return u;
    }

    public final Matrix j()
    {
        return v;
    }

    public final Matrix k()
    {
        return x;
    }

    public final float l()
    {
        return o;
    }

    public final float m()
    {
        return p;
    }

    public final float n()
    {
        return s;
    }
}
