// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cmb
{

    public final long a;
    public final long b;
    public final long c;
    final cea d;
    public final boolean e;

    public cmb(long l, long l1, long l2, cea cea, 
            boolean flag)
    {
        a = l;
        b = l1;
        c = l2;
        d = cea;
        e = flag;
    }

    static long a(cwb cwb1)
    {
        long l2;
        if (!cwb1.f)
        {
            l2 = 0L;
        } else
        {
            int i = 0;
            long l1 = -1L;
            long l = -1L;
            while (i < cwb1.c.length) 
            {
                cwc cwc1 = cwb1.c[i];
                long l4 = cwc1.a;
                long l3 = l1;
                l2 = l;
                if (l < l4)
                {
                    boolean flag;
                    if (cwc1.A != null || cwc1.b != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    l3 = l1;
                    l2 = l;
                    if (flag)
                    {
                        l2 = l4;
                        l3 = l;
                    }
                }
                i++;
                l1 = l3;
                l = l2;
            }
            if (l == -1L)
            {
                return 0L;
            }
            l2 = l;
            if (l1 != -1L)
            {
                return l + (l - l1);
            }
        }
        return l2;
    }
}
