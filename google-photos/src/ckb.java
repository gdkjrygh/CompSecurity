// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ckb
{

    final long a[];
    final int b[];
    final long c[];
    final boolean d[];
    private final int e;

    private ckb(long al[], int ai[], long al1[], boolean aflag[], int i)
    {
        a = al;
        b = ai;
        c = al1;
        d = aflag;
        e = i;
    }

    public static ckb a(cka cka1)
    {
        cjx cjx1 = cka1.b;
        ckd ckd1 = cjx1.a(cjw.u).b;
        Object obj = cjx1.a(cjw.v);
        ckd ckd2;
        ckd ckd3;
        ckd ckd4;
        int ai[];
        long al[];
        long al1[];
        boolean aflag[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        boolean flag;
        int l2;
        int i3;
        boolean flag1;
        int k3;
        int j4;
        int k4;
        int l4;
        long l5;
        if (obj == null)
        {
            obj = cjx1.a(cjw.w);
            flag = true;
        } else
        {
            flag = false;
        }
        ckd2 = ((cjy) (obj)).b;
        ckd3 = cjx1.a(cjw.t).b;
        ckd4 = cjx1.a(cjw.r).b;
        obj = cjx1.a(cjw.s);
        if (obj != null)
        {
            obj = ((cjy) (obj)).b;
        } else
        {
            obj = null;
        }
        ckd1.a(4);
        j4 = ckd1.c();
        k4 = ckd1.c();
        ai = new int[k4];
        al = new long[k4];
        al1 = new long[k4];
        aflag = new boolean[k4];
        ckd2.a(4);
        l4 = ckd2.c();
        ckd3.a(4);
        l1 = ckd3.c() - 1;
        b.a(ckd3.c(), "stsc.readInt()", 1, "stsc first chunk must be 1");
        i1 = ckd3.c();
        ckd3.b(4);
        if (l1 > 0)
        {
            k = ckd3.c() - 1;
        } else
        {
            k = -1;
        }
        ckd4.a(4);
        k1 = ckd4.c();
        j2 = ckd4.c();
        i2 = ckd4.c();
        j = -1;
        i = 0;
        if (obj != null)
        {
            ((ckd) (obj)).a(4);
            l2 = ((ckd) (obj)).c();
            j = ((ckd) (obj)).c() - 1;
            i = l2;
        } else
        {
            l2 = k4;
        }
        if (flag)
        {
            l = ckd2.e();
        } else
        {
            l = ckd2.c();
        }
        i3 = 0;
        l5 = 0L;
        k2 = i1;
        j1 = k;
        k3 = k1 - 1;
        flag1 = false;
        k = i;
        k1 = l;
        i = l1;
        l = j1;
        l1 = k3;
        j1 = ((flag1) ? 1 : 0);
        while (i3 < k4) 
        {
            al1[i3] = k1;
            int j3;
            boolean flag2;
            if (j4 == 0)
            {
                j3 = ckd1.c();
            } else
            {
                j3 = j4;
            }
            ai[i3] = j3;
            al[i3] = Math.round((1000000D * (double)l5) / (double)cka1.a);
            if (obj == null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            aflag[i3] = flag2;
            if (i3 == j)
            {
                aflag[i3] = true;
                k--;
                if (k > 0)
                {
                    j = ((ckd) (obj)).c();
                    j--;
                }
            }
            l5 += i2;
            j3 = j2 - 1;
            if (j3 == 0 && l1 > 0)
            {
                j2 = ckd4.c();
                j3 = ckd4.c();
                i2 = l1 - 1;
                l1 = j2;
                j2 = j3;
            } else
            {
                int i4 = l1;
                j2 = i2;
                l1 = j3;
                i2 = i4;
            }
            j3 = k2 - 1;
            if (j3 == 0)
            {
                int l3 = j1 + 1;
                if (l3 < l4)
                {
                    if (flag)
                    {
                        j1 = ckd2.e();
                    } else
                    {
                        j1 = ckd2.c();
                    }
                } else
                {
                    j1 = k1;
                }
                if (l3 == l)
                {
                    i1 = ckd3.c();
                    ckd3.b(4);
                    k1 = i - 1;
                    i = i1;
                    k2 = k1;
                    if (k1 > 0)
                    {
                        l = ckd3.c() - 1;
                        k2 = k1;
                        i = i1;
                    }
                } else
                {
                    k2 = i;
                    i = i1;
                }
                if (l3 < l4)
                {
                    i1 = l3;
                    k1 = i;
                } else
                {
                    i1 = l3;
                    k1 = i;
                    i = j3;
                }
            } else
            {
                l3 = ai[i3] + k1;
                k1 = i1;
                k2 = i;
                i = j3;
                i1 = j1;
                j1 = l3;
            }
            l3 = i3 + 1;
            i3 = j1;
            j3 = i;
            j1 = i1;
            i = k2;
            i1 = k1;
            k1 = j2;
            k2 = i2;
            j2 = l1;
            i2 = k1;
            l1 = k2;
            k1 = i3;
            i3 = l3;
            k2 = j3;
        }
        if (k == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        b.a(flag2, "Expected no more synchronization samples at end of file.");
        if (j2 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        b.a(flag2, "Expected no more samples at the current timestamp delta at the end of file.");
        if (k2 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        b.a(flag2, "Expected no more samples in the current chunk at the end of file.");
        if (l1 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        b.a(flag2, "Expected no more timestamp delta changes at the end of file.");
        return new ckb(al1, ai, al, aflag, l2);
    }

    public final int a(long l)
    {
        for (int i = c.length - 1; i >= 0; i--)
        {
            if (c[i] < l && d[i])
            {
                return i;
            }
        }

        return -1;
    }

    public final int[] a()
    {
        int i = 0;
        int ai[] = new int[e];
        int k;
        for (int j = 0; i < d.length; j = k)
        {
            k = j;
            if (d[i])
            {
                ai[j] = i;
                k = j + 1;
            }
            i++;
        }

        return ai;
    }

    static 
    {
        ckb.getSimpleName();
    }
}
