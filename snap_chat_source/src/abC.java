// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class abC
{

    final abB a[];
    final aeC b;

    public abC(abB aabb[])
    {
        a = (abB[])aabb.clone();
        b = new aeC(aabb.length);
        for (int i = 0; i < aabb.length; i++)
        {
            b.a(i, aabb[i].l);
        }

    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof abC) && Arrays.equals(((abC)obj).a, a);
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(a[i]);
        }

        return stringbuilder.toString();
    }
}
