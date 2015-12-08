// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            g

public final class d
{

    final g a;

    d(g g1)
    {
        a = g1;
    }

    public final double a()
    {
        g g1 = a;
        double d1 = 0.0D;
        for (int i = 0; i < g1.a() + 1; i++)
        {
            d1 += g1.i(i);
        }

        return d1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof d))
        {
            return false;
        } else
        {
            return ((d)obj).a.equals(a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{");
        stringbuilder.append(a.toString());
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
