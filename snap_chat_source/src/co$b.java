// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class d
{

    public float a;
    public float b;
    public float c;
    public float d;

    public final void a(float f, float f1)
    {
        f -= a;
        f1 -= b;
        double d1 = Math.sqrt(f * f + f1 * f1);
        if (d1 != 0.0D)
        {
            float f2 = c;
            c = (float)((double)f / d1) + f2;
            d = d + (float)((double)f1 / d1);
        }
    }

    public final void a(d d1)
    {
        c = c + d1.c;
        d = d + d1.d;
    }

    public final String toString()
    {
        return (new StringBuilder("(")).append(a).append(",").append(b).append(" ").append(c).append(",").append(d).append(")").toString();
    }

    public >(float f, float f1, float f2, float f3)
    {
        c = 0.0F;
        d = 0.0F;
        a = f;
        b = f1;
        double d1 = Math.sqrt(f2 * f2 + f3 * f3);
        if (d1 != 0.0D)
        {
            c = (float)((double)f2 / d1);
            d = (float)((double)f3 / d1);
        }
    }
}
