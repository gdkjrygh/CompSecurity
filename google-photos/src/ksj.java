// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ksj extends krs
{

    private ksp c[];
    private ksp d[];
    private ksi e[];

    public ksj()
    {
        c = ksp.f();
        d = ksp.f();
        e = ksi.f();
        a = null;
        b = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i = super.a();
        int j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    ksp ksp1 = c[j];
                    int i1 = i;
                    if (ksp1 != null)
                    {
                        i1 = i + krr.b(1, ksp1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    ksp ksp2 = d[k];
                    int j1 = i;
                    if (ksp2 != null)
                    {
                        j1 = i + krr.b(2, ksp2);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (e != null)
        {
            k1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    ksi ksi1 = e[l];
                    k1 = i;
                    if (ksi1 != null)
                    {
                        k1 = i + krr.b(3, ksi1);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public final void a(krr krr1)
    {
        boolean flag = false;
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ksp ksp1 = c[i];
                if (ksp1 != null)
                {
                    krr1.a(1, ksp1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = 0; j < d.length; j++)
            {
                ksp ksp2 = d[j];
                if (ksp2 != null)
                {
                    krr1.a(2, ksp2);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                ksi ksi1 = e[k];
                if (ksi1 != null)
                {
                    krr1.a(3, ksi1);
                }
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
            if (obj instanceof ksj)
            {
                obj = (ksj)obj;
                flag = flag1;
                if (krv.a(c, ((ksj) (obj)).c))
                {
                    flag = flag1;
                    if (krv.a(d, ((ksj) (obj)).d))
                    {
                        flag = flag1;
                        if (krv.a(e, ((ksj) (obj)).e))
                        {
                            return a(((krs) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((krv.a(c) + 527) * 31 + krv.a(d)) * 31 + krv.a(e)) * 31 + b();
    }
}
