// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, ra, qp, qu, 
//            qz, qo, qw

public static final class sa extends qq
{

    public String azr[];
    public String azs[];
    public int azt[];

    public void a(qp qp1)
        throws IOException
    {
        boolean flag = false;
        if (azr != null && azr.length > 0)
        {
            for (int i = 0; i < azr.length; i++)
            {
                String s = azr[i];
                if (s != null)
                {
                    qp1.b(1, s);
                }
            }

        }
        if (azs != null && azs.length > 0)
        {
            for (int j = 0; j < azs.length; j++)
            {
                String s1 = azs[j];
                if (s1 != null)
                {
                    qp1.b(2, s1);
                }
            }

        }
        if (azt != null && azt.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < azt.length; k++)
            {
                qp1.t(3, azt[k]);
            }

        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return y(qo1);
    }

    protected int c()
    {
        boolean flag = false;
        int k2 = super.c();
        int i;
        int k;
        if (azr != null && azr.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int k1;
            for (l = 0; i < azr.length; l = k1)
            {
                String s = azr[i];
                int i2 = j;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = j + qp.dk(s);
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
        if (azs != null)
        {
            k = i;
            if (azs.length > 0)
            {
                k = 0;
                int i1 = 0;
                int l1;
                int j2;
                for (l1 = 0; k < azs.length; l1 = j2)
                {
                    String s1 = azs[k];
                    k2 = i1;
                    j2 = l1;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        k2 = i1 + qp.dk(s1);
                    }
                    k++;
                    i1 = k2;
                }

                k = i + i1 + l1 * 1;
            }
        }
        i = k;
        if (azt != null)
        {
            i = k;
            if (azt.length > 0)
            {
                int j1 = 0;
                for (i = ((flag) ? 1 : 0); i < azt.length; i++)
                {
                    j1 += qp.gZ(azt[i]);
                }

                i = k + j1 + azt.length * 1;
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
            if (obj instanceof azt)
            {
                obj = (azt)obj;
                flag = flag1;
                if (qu.equals(azr, ((azr) (obj)).azr))
                {
                    flag = flag1;
                    if (qu.equals(azs, ((azs) (obj)).azs))
                    {
                        flag = flag1;
                        if (qu.equals(azt, ((azt) (obj)).azt))
                        {
                            return a(((qq) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((qu.hashCode(azr) + 527) * 31 + qu.hashCode(azs)) * 31 + qu.hashCode(azt)) * 31 + rQ();
    }

    public rQ sa()
    {
        azr = qz.azo;
        azs = qz.azo;
        azt = qz.azj;
        ayW = null;
        azh = -1;
        return this;
    }

    public azh y(qo qo1)
        throws IOException
    {
        do
        {
            int i = qo1.rz();
            switch (i)
            {
            default:
                if (a(qo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int j1 = qz.b(qo1, 10);
                String as[];
                int j;
                if (azr == null)
                {
                    j = 0;
                } else
                {
                    j = azr.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(azr, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = qo1.readString();
                    qo1.rz();
                }

                as[j1] = qo1.readString();
                azr = as;
                break;

            case 18: // '\022'
                int k1 = qz.b(qo1, 18);
                String as1[];
                int k;
                if (azs == null)
                {
                    k = 0;
                } else
                {
                    k = azs.length;
                }
                as1 = new String[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(azs, 0, as1, 0, k);
                    k1 = k;
                }
                for (; k1 < as1.length - 1; k1++)
                {
                    as1[k1] = qo1.readString();
                    qo1.rz();
                }

                as1[k1] = qo1.readString();
                azs = as1;
                break;

            case 24: // '\030'
                int l1 = qz.b(qo1, 24);
                int ai[];
                int l;
                if (azt == null)
                {
                    l = 0;
                } else
                {
                    l = azt.length;
                }
                ai = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(azt, 0, ai, 0, l);
                    l1 = l;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = qo1.rC();
                    qo1.rz();
                }

                ai[l1] = qo1.rC();
                azt = ai;
                break;

            case 26: // '\032'
                int j2 = qo1.gS(qo1.rG());
                int i1 = qo1.getPosition();
                int i2;
                for (i2 = 0; qo1.rL() > 0; i2++)
                {
                    qo1.rC();
                }

                qo1.gU(i1);
                int ai1[];
                if (azt == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = azt.length;
                }
                ai1 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(azt, 0, ai1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = qo1.rC();
                }

                azt = ai1;
                qo1.gT(j2);
                break;
            }
        } while (true);
    }

    public ()
    {
        sa();
    }
}
