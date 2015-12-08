// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class krz extends krs
{

    private String c[];
    private String d[];
    private int e[];
    private long f[];

    public krz()
    {
        c = kry.c;
        d = kry.c;
        e = kry.a;
        f = kry.b;
        a = null;
        b = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l2 = super.a();
        int i;
        int k;
        if (c != null && c.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int l1;
            for (l = 0; i < c.length; l = l1)
            {
                String s = c[i];
                int j2 = j;
                l1 = l;
                if (s != null)
                {
                    l1 = l + 1;
                    j2 = j + krr.a(s);
                }
                i++;
                j = j2;
            }

            i = l2 + j + l * 1;
        } else
        {
            i = l2;
        }
        k = i;
        if (d != null)
        {
            k = i;
            if (d.length > 0)
            {
                k = 0;
                int i1 = 0;
                int i2;
                int k2;
                for (i2 = 0; k < d.length; i2 = k2)
                {
                    String s1 = d[k];
                    l2 = i1;
                    k2 = i2;
                    if (s1 != null)
                    {
                        k2 = i2 + 1;
                        l2 = i1 + krr.a(s1);
                    }
                    k++;
                    i1 = l2;
                }

                k = i + i1 + i2 * 1;
            }
        }
        i = k;
        if (e != null)
        {
            i = k;
            if (e.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < e.length; i++)
                {
                    j1 += krr.a(e[i]);
                }

                i = k + j1 + e.length * 1;
            }
        }
        k = i;
        if (f != null)
        {
            k = i;
            if (f.length > 0)
            {
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < f.length; k++)
                {
                    k1 += krr.b(f[k]);
                }

                k = i + k1 + f.length * 1;
            }
        }
        return k;
    }

    public final void a(krr krr1)
    {
        boolean flag = false;
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    krr1.a(1, s);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                String s1 = d[j];
                if (s1 != null)
                {
                    krr1.a(2, s1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k = 0; k < e.length; k++)
            {
                krr1.a(3, e[k]);
            }

        }
        if (f != null && f.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < f.length; l++)
            {
                krr1.a(4, f[l]);
            }

        }
        super.a(krr1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof krz)
            {
                obj = (krz)obj;
                flag = flag1;
                if (krv.a(c, ((krz) (obj)).c))
                {
                    flag = flag1;
                    if (krv.a(d, ((krz) (obj)).d))
                    {
                        flag = flag1;
                        if (krv.a(e, ((krz) (obj)).e))
                        {
                            flag = flag1;
                            if (krv.a(f, ((krz) (obj)).f))
                            {
                                return a(((krs) (obj)));
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return ((((krv.a(c) + 527) * 31 + krv.a(d)) * 31 + krv.a(e)) * 31 + krv.a(f)) * 31 + b();
    }
}
