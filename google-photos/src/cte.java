// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class cte
{

    public final long a[];
    final float b[];

    public cte(long al[], float af[])
    {
        boolean flag;
        if (al.length == af.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Array length should match");
        a = al;
        b = af;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof cte))
            {
                return false;
            }
            obj = (cte)obj;
            if (!Arrays.equals(b, ((cte) (obj)).b) || !Arrays.equals(a, ((cte) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = b.length;
        for (int i = 0; i < b.length; i++)
        {
            j = b.a(b[i], j);
            j = b.a(a[i], j);
        }

        return j;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < a.length; i++)
        {
            long l = a[i];
            float f = b[i];
            stringbuilder.append((new StringBuilder(37)).append(l).append(" ").append(f).append("\n").toString());
        }

        return stringbuilder.toString();
    }
}
