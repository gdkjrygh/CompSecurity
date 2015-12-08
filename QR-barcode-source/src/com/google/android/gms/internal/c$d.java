// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, c, pg, pf, 
//            pq, pl, pn

public static final class h extends ph
{

    public qz fA[];
    public qz fB[];
    public qz fC[];

    public void a(pg pg1)
        throws IOException
    {
        boolean flag = false;
        if (fA != null && fA.length > 0)
        {
            for (int i = 0; i < fA.length; i++)
            {
                h h1 = fA[i];
                if (h1 != null)
                {
                    pg1.a(1, h1);
                }
            }

        }
        if (fB != null && fB.length > 0)
        {
            for (int j = 0; j < fB.length; j++)
            {
                h h2 = fB[j];
                if (h2 != null)
                {
                    pg1.a(2, h2);
                }
            }

        }
        if (fC != null && fC.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < fC.length; k++)
            {
                h h3 = fC[k];
                if (h3 != null)
                {
                    pg1.a(3, h3);
                }
            }

        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return e(pf1);
    }

    protected int c()
    {
        boolean flag = false;
        int i = super.c();
        int j = i;
        if (fA != null)
        {
            j = i;
            if (fA.length > 0)
            {
                for (j = 0; j < fA.length;)
                {
                    e e1 = fA[j];
                    int i1 = i;
                    if (e1 != null)
                    {
                        i1 = i + pg.c(1, e1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (fB != null)
        {
            i = j;
            if (fB.length > 0)
            {
                i = j;
                for (int k = 0; k < fB.length;)
                {
                    e e2 = fB[k];
                    int j1 = i;
                    if (e2 != null)
                    {
                        j1 = i + pg.c(2, e2);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (fC != null)
        {
            k1 = i;
            if (fC.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= fC.length)
                    {
                        break;
                    }
                    e e3 = fC[l];
                    k1 = i;
                    if (e3 != null)
                    {
                        k1 = i + pg.c(3, e3);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public  e(pf pf1)
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
                int i1 = pq.b(pf1, 10);
                 a1[];
                int j;
                if (fA == null)
                {
                    j = 0;
                } else
                {
                    j = fA.length;
                }
                a1 = new fA[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(fA, 0, a1, 0, j);
                    i1 = j;
                }
                for (; i1 < a1.length - 1; i1++)
                {
                    a1[i1] = new <init>();
                    pf1.a(a1[i1]);
                    pf1.qi();
                }

                a1[i1] = new <init>();
                pf1.a(a1[i1]);
                fA = a1;
                break;

            case 18: // '\022'
                int j1 = pq.b(pf1, 18);
                 a2[];
                int k;
                if (fB == null)
                {
                    k = 0;
                } else
                {
                    k = fB.length;
                }
                a2 = new fB[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(fB, 0, a2, 0, k);
                    j1 = k;
                }
                for (; j1 < a2.length - 1; j1++)
                {
                    a2[j1] = new <init>();
                    pf1.a(a2[j1]);
                    pf1.qi();
                }

                a2[j1] = new <init>();
                pf1.a(a2[j1]);
                fB = a2;
                break;

            case 26: // '\032'
                int k1 = pq.b(pf1, 26);
                 a3[];
                int l;
                if (fC == null)
                {
                    l = 0;
                } else
                {
                    l = fC.length;
                }
                a3 = new fC[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(fC, 0, a3, 0, l);
                    k1 = l;
                }
                for (; k1 < a3.length - 1; k1++)
                {
                    a3[k1] = new <init>();
                    pf1.a(a3[k1]);
                    pf1.qi();
                }

                a3[k1] = new <init>();
                pf1.a(a3[k1]);
                fC = a3;
                break;
            }
        } while (true);
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
            if (obj instanceof fC)
            {
                obj = (fC)obj;
                flag = flag1;
                if (pl.equals(fA, ((fA) (obj)).fA))
                {
                    flag = flag1;
                    if (pl.equals(fB, ((fB) (obj)).fB))
                    {
                        flag = flag1;
                        if (pl.equals(fC, ((fC) (obj)).fC))
                        {
                            return a(((ph) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public a h()
    {
        fA = r();
        fB = r();
        fC = f();
        awJ = null;
        awU = -1;
        return this;
    }

    public int hashCode()
    {
        return (((pl.hashCode(fA) + 527) * 31 + pl.hashCode(fB)) * 31 + pl.hashCode(fC)) * 31 + qz();
    }

    public ()
    {
        h();
    }
}
