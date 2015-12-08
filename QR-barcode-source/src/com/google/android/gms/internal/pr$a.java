// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, pr, pg, pl, 
//            pq, pf, pn

public static final class qJ extends ph
{

    public String axe[];
    public String axf[];
    public int axg[];

    public void a(pg pg1)
        throws IOException
    {
        boolean flag = false;
        if (axe != null && axe.length > 0)
        {
            for (int i = 0; i < axe.length; i++)
            {
                String s = axe[i];
                if (s != null)
                {
                    pg1.b(1, s);
                }
            }

        }
        if (axf != null && axf.length > 0)
        {
            for (int j = 0; j < axf.length; j++)
            {
                String s1 = axf[j];
                if (s1 != null)
                {
                    pg1.b(2, s1);
                }
            }

        }
        if (axg != null && axg.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < axg.length; k++)
            {
                pg1.s(3, axg[k]);
            }

        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return v(pf1);
    }

    protected int c()
    {
        boolean flag = false;
        int k2 = super.c();
        int i;
        int k;
        if (axe != null && axe.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int k1;
            for (l = 0; i < axe.length; l = k1)
            {
                String s = axe[i];
                int i2 = j;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = j + pg.di(s);
                }
                i++;
                j = i2;
            }

            i = k2 + j + l * 1;
        } else
        {
            i = k2;
        }
        k = i;
        if (axf != null)
        {
            k = i;
            if (axf.length > 0)
            {
                k = 0;
                int i1 = 0;
                int l1;
                int j2;
                for (l1 = 0; k < axf.length; l1 = j2)
                {
                    String s1 = axf[k];
                    k2 = i1;
                    j2 = l1;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        k2 = i1 + pg.di(s1);
                    }
                    k++;
                    i1 = k2;
                }

                k = i + i1 + l1 * 1;
            }
        }
        i = k;
        if (axg != null)
        {
            i = k;
            if (axg.length > 0)
            {
                int j1 = 0;
                for (i = ((flag) ? 1 : 0); i < axg.length; i++)
                {
                    j1 += pg.gw(axg[i]);
                }

                i = k + j1 + axg.length * 1;
            }
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof axg)
            {
                obj = (axg)obj;
                flag = flag1;
                if (pl.equals(axe, ((axe) (obj)).axe))
                {
                    flag = flag1;
                    if (pl.equals(axf, ((axf) (obj)).axf))
                    {
                        flag = flag1;
                        if (pl.equals(axg, ((axg) (obj)).axg))
                        {
                            return a(((ph) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((pl.hashCode(axe) + 527) * 31 + pl.hashCode(axf)) * 31 + pl.hashCode(axg)) * 31 + qz();
    }

    public qz qJ()
    {
        axe = pq.axb;
        axf = pq.axb;
        axg = pq.awW;
        awJ = null;
        awU = -1;
        return this;
    }

    public awU v(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int j1 = pq.b(pf1, 10);
                String as[];
                int j;
                if (axe == null)
                {
                    j = 0;
                } else
                {
                    j = axe.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(axe, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = pf1.readString();
                    pf1.qi();
                }

                as[j1] = pf1.readString();
                axe = as;
                break;

            case 18: // '\022'
                int k1 = pq.b(pf1, 18);
                String as1[];
                int k;
                if (axf == null)
                {
                    k = 0;
                } else
                {
                    k = axf.length;
                }
                as1 = new String[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(axf, 0, as1, 0, k);
                    k1 = k;
                }
                for (; k1 < as1.length - 1; k1++)
                {
                    as1[k1] = pf1.readString();
                    pf1.qi();
                }

                as1[k1] = pf1.readString();
                axf = as1;
                break;

            case 24: // '\030'
                int l1 = pq.b(pf1, 24);
                int ai[];
                int l;
                if (axg == null)
                {
                    l = 0;
                } else
                {
                    l = axg.length;
                }
                ai = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(axg, 0, ai, 0, l);
                    l1 = l;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = pf1.ql();
                    pf1.qi();
                }

                ai[l1] = pf1.ql();
                axg = ai;
                break;

            case 26: // '\032'
                int j2 = pf1.gp(pf1.qp());
                int i1 = pf1.getPosition();
                int i2;
                for (i2 = 0; pf1.qu() > 0; i2++)
                {
                    pf1.ql();
                }

                pf1.gr(i1);
                int ai1[];
                if (axg == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = axg.length;
                }
                ai1 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(axg, 0, ai1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = pf1.ql();
                }

                axg = ai1;
                pf1.gq(j2);
                break;
            }
        } while (true);
    }

    public ()
    {
        qJ();
    }
}
