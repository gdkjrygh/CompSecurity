// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.b:
//            aB, aK, aJ, aA, 
//            aF

public static final class n extends aB
{

    public String a[];
    public String b[];
    public int c[];
    public long d[];

    protected final int a()
    {
        boolean flag = false;
        int l2 = super.a();
        int i;
        int k;
        if (a != null && a.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int l1;
            for (l = 0; i < a.length; l = l1)
            {
                String s = a[i];
                int j2 = j;
                l1 = l;
                if (s != null)
                {
                    l1 = l + 1;
                    j2 = j + aA.a(s);
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
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                k = 0;
                int i1 = 0;
                int i2;
                int k2;
                for (i2 = 0; k < b.length; i2 = k2)
                {
                    String s1 = b[k];
                    l2 = i1;
                    k2 = i2;
                    if (s1 != null)
                    {
                        k2 = i2 + 1;
                        l2 = i1 + aA.a(s1);
                    }
                    k++;
                    i1 = l2;
                }

                k = i + i1 + i2 * 1;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < c.length; i++)
                {
                    j1 += aA.a(c[i]);
                }

                i = k + j1 + c.length * 1;
            }
        }
        k = i;
        if (d != null)
        {
            k = i;
            if (d.length > 0)
            {
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < d.length; k++)
                {
                    k1 += aA.b(d[k]);
                }

                k = i + k1 + d.length * 1;
            }
        }
        return k;
    }

    public final void a(aA aa)
        throws IOException
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    aa.a(1, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                String s1 = b[j];
                if (s1 != null)
                {
                    aa.a(2, s1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = 0; k < c.length; k++)
            {
                aa.a(3, c[k]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < d.length; l++)
            {
                aa.a(4, d[l]);
            }

        }
        super.a(aa);
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
            if (obj instanceof d)
            {
                obj = (d)obj;
                flag = flag1;
                if (aF.a(a, ((a) (obj)).a))
                {
                    flag = flag1;
                    if (aF.a(b, ((b) (obj)).b))
                    {
                        flag = flag1;
                        if (aF.a(c, ((c) (obj)).c))
                        {
                            flag = flag1;
                            if (aF.a(d, ((d) (obj)).d))
                            {
                                return a(((aB) (obj)));
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
        return ((((aF.a(a) + 527) * 31 + aF.a(b)) * 31 + aF.a(c)) * 31 + aF.a(d)) * 31 + b();
    }

    public ()
    {
        a = aJ.f;
        b = aJ.f;
        c = aJ.a;
        d = aJ.b;
        m = null;
        n = -1;
    }
}
