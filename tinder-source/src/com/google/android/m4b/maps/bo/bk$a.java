// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            bk, d, t

public static final class g
{

    public final int a;
    public final String b;
    public final float c;
    public final String d;
    public final t e;
    final String f;
    public final float g;
    private final int h;
    private final int i;

    public static boolean a(int j)
    {
        return com.google.android.m4b.maps.bo.d.a(j, 2) && !com.google.android.m4b.maps.bo.d.a(j, 1);
    }

    public final boolean a()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 1);
    }

    public final boolean b()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 2);
    }

    public final boolean c()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 16);
    }

    public final boolean d()
    {
        return com.google.android.m4b.maps.bo.d.a(a, 8);
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
            if (a != ((a) (obj)).a)
            {
                return false;
            }
            if (Float.floatToIntBits(g) != Float.floatToIntBits(((g) (obj)).g))
            {
                return false;
            }
            if (b == null)
            {
                if (((b) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((b) (obj)).b))
            {
                return false;
            }
            if (e == null)
            {
                if (((e) (obj)).e != null)
                {
                    return false;
                }
            } else
            if (!e.equals(((als) (obj)).e))
            {
                return false;
            }
            if (f == null)
            {
                if (((f) (obj)).f != null)
                {
                    return false;
                }
            } else
            if (!f.equals(((f) (obj)).f))
            {
                return false;
            }
            if (Float.floatToIntBits(h) != Float.floatToIntBits(((h) (obj)).h))
            {
                return false;
            }
            if (d == null)
            {
                if (((d) (obj)).d != null)
                {
                    return false;
                }
            } else
            {
                return d.equals(((d) (obj)).d);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j1 = a;
        int k1 = Float.floatToIntBits(g);
        int j;
        int k;
        int l;
        int l1;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (e == null)
        {
            k = 0;
        } else
        {
            k = e.hashCode();
        }
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.hashCode();
        }
        l1 = Float.floatToIntBits(h);
        if (d != null)
        {
            i1 = d.hashCode();
        }
        return ((l + (k + (j + ((j1 + 31) * 31 + k1) * 31) * 31) * 31) * 31 + l1) * 31 + i1;
    }

    public (int j, String s, int k, String s1, t t1, int l, String s2, 
            float f1)
    {
        a = j;
        b = s;
        h = k;
        c = 1.0F / (float)k;
        d = s1;
        e = t1;
        i = l;
        f = s2;
        g = f1;
    }
}
