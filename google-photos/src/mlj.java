// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class mlj
{

    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    public mlj()
    {
    }

    private mlj(mlj mlj1)
    {
        a = mlj1.a;
        b = mlj1.b;
        c = mlj1.c;
        d = mlj1.d;
        e = mlj1.e;
        f = mlj1.f;
        g = mlj1.g;
        h = mlj1.h;
    }

    public final float a(float f1)
    {
        if (f1 == 0.0F)
        {
            return a;
        }
        if (f1 == 1.0F)
        {
            return g;
        } else
        {
            float f2 = a;
            f2 += (c - f2) * f1;
            float f3 = c;
            f3 += (e - f3) * f1;
            float f4 = e;
            float f5 = g;
            f2 += (f3 - f2) * f1;
            return f2 + ((f3 + ((f4 + (f5 - f4) * f1) - f3) * f1) - f2) * f1;
        }
    }

    public Object clone()
    {
        return new mlj(this);
    }
}
