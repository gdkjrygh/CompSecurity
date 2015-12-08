// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            g

public final class an
{

    public float a;
    public float b;

    public an()
    {
        a = 0.0F;
        b = 0.0F;
    }

    public static g a(g g1, an an1, g g2)
    {
        g2.d(g1.a + Math.round(an1.a), g1.b + Math.round(an1.b));
        return g2;
    }

    public final float a()
    {
        return (float)Math.sqrt(b(this));
    }

    public final an a(float f)
    {
        a = a * f;
        b = b * f;
        return this;
    }

    public final an a(an an1)
    {
        a = an1.a;
        b = an1.b;
        return this;
    }

    public final an a(g g1, g g2)
    {
        a = g2.a - g1.a;
        b = g2.b - g1.b;
        return this;
    }

    public final float b(an an1)
    {
        return a * an1.a + b * an1.b;
    }

    public final an b()
    {
        float f = a();
        if (f == 0.0F)
        {
            a = 0.0F;
            b = 0.0F;
            return this;
        } else
        {
            a = a / f;
            b = b / f;
            return this;
        }
    }

    public final an c()
    {
        float f = a;
        a = -b;
        b = f;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (an)obj;
            if (a != ((an) (obj)).a || b != ((an) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(a) ^ Float.floatToIntBits(b);
    }

    public final String toString()
    {
        float f = a;
        float f1 = b;
        return (new StringBuilder(33)).append("(").append(f).append(",").append(f1).append(")").toString();
    }
}
