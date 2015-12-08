// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class ouw
    implements Comparable, Iterable
{

    private int a;
    private int b;
    private final int c;
    private ouv d;

    public ouw(ouv ouv1, int i, int j, int k)
    {
        d = ouv1;
        super();
        a = p.a(i, ouv.a(ouv1).length);
        boolean flag;
        if (j > 0 && i + j <= ouv.a(ouv1).length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        b = j;
        c = k;
    }

    private long a()
    {
        long l = ouv.d(d).b(ouv.a(d)[a]);
        long l2 = ouv.d(d).b(ouv.a(d)[(a + b) - 1]);
        boolean flag;
        if (ouv.c(d) > l && ouv.b(d) < l2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            long l1 = ouv.b(d);
            long l3 = (ouv.c(d) - ouv.b(d)) / 2L;
            long l4 = ouv.d(d).b(ouv.a(d)[a]);
            return Math.abs((l1 + l3) - (l4 + (ouv.d(d).b(ouv.a(d)[(a + b) - 1]) - l4) / 2L)) - 0x8000000000000000L;
        } else
        {
            return (long)c;
        }
    }

    public final int compareTo(Object obj)
    {
        long l;
        long l1;
        obj = (ouw)obj;
        l = a();
        l1 = ((ouw) (obj)).a();
        if (l == l1) goto _L2; else goto _L1
_L1:
        if (l >= l1) goto _L4; else goto _L3
_L3:
        return 1;
_L4:
        return -1;
_L2:
        if (a >= ((ouw) (obj)).a)
        {
            return a != ((ouw) (obj)).a ? -1 : 0;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final Iterator iterator()
    {
        return new ore(ouv.a(d), a, b);
    }
}
