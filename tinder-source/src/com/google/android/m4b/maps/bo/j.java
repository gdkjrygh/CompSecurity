// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            n, m, i, g

public final class j extends n
{

    private g a[];
    private volatile m b;

    public j(g ag[])
    {
        a = ag;
    }

    public final g a(int k)
    {
        return a[k];
    }

    public final m a()
    {
        if (b == null)
        {
            b = m.a(a);
        }
        return b;
    }

    public final boolean a(g g)
    {
        if (!a().a(g))
        {
            return false;
        }
        int j1 = a.length;
        g g1 = a[j1 - 1];
        int k = 0;
        int l;
        int i1;
        for (l = 0; k < j1; l = i1)
        {
            g g2 = a[k];
            i1 = l;
            if (i.b(g1, g2, g))
            {
                i1 = l + 1;
            }
            k++;
            g1 = g2;
        }

        return (l & 1) == 1;
    }

    public final int b()
    {
        return a.length;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof j)
        {
            obj = (j)obj;
            return Arrays.equals(a, ((j) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }
}
