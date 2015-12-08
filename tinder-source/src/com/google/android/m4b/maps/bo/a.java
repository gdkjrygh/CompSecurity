// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            d, g

public final class a
{

    public final g a;
    public final float b;
    final g c;
    private final int d;
    private final float e;
    private final float f;
    private final float g;

    public a(g g1, int i, float f1, g g2, float f2, float f3, float f4)
    {
        a = g1;
        d = i;
        b = f1;
        c = g2;
        e = f2;
        f = f3;
        g = f4;
    }

    public final boolean a()
    {
        return com.google.android.m4b.maps.bo.d.a(d, 1);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (c == null)
            {
                if (((a) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((a) (obj)).c))
            {
                return false;
            }
            if (Float.floatToIntBits(f) != Float.floatToIntBits(((a) (obj)).f))
            {
                return false;
            }
            if (Float.floatToIntBits(e) != Float.floatToIntBits(((a) (obj)).e))
            {
                return false;
            }
            if (Float.floatToIntBits(g) != Float.floatToIntBits(((a) (obj)).g))
            {
                return false;
            }
            if (d != ((a) (obj)).d)
            {
                return false;
            }
            if (a == null)
            {
                if (((a) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((a) (obj)).a))
            {
                return false;
            }
            if (Float.floatToIntBits(b) != Float.floatToIntBits(((a) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        int k;
        int l;
        int i1;
        int j1;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        k = Float.floatToIntBits(f);
        l = Float.floatToIntBits(e);
        i1 = Float.floatToIntBits(g);
        j1 = d;
        if (a != null)
        {
            j = a.hashCode();
        }
        return ((((((i + 31) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + j) * 31 + Float.floatToIntBits(b);
    }
}
