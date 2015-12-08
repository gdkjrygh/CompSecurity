// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qp, qo, 
//            qz, qu, qw

public static final class h extends qq
{

    public rQ fA[];
    public rQ fB[];
    public rQ fC[];

    public void a(qp qp1)
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
                    qp1.a(1, h1);
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
                    qp1.a(2, h2);
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
                    qp1.a(3, h3);
                }
            }

        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return e(qo1);
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
                        i1 = i + qp.c(1, e1);
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
                        j1 = i + qp.c(2, e2);
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
                        k1 = i + qp.c(3, e3);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public  e(qo qo1)
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
                int i1 = qz.b(qo1, 10);
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
                    qo1.a(a1[i1]);
                    qo1.rz();
                }

                a1[i1] = new <init>();
                qo1.a(a1[i1]);
                fA = a1;
                break;

            case 18: // '\022'
                int j1 = qz.b(qo1, 18);
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
                    qo1.a(a2[j1]);
                    qo1.rz();
                }

                a2[j1] = new <init>();
                qo1.a(a2[j1]);
                fB = a2;
                break;

            case 26: // '\032'
                int k1 = qz.b(qo1, 26);
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
                    qo1.a(a3[k1]);
                    qo1.rz();
                }

                a3[k1] = new <init>();
                qo1.a(a3[k1]);
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
                if (qu.equals(fA, ((fA) (obj)).fA))
                {
                    flag = flag1;
                    if (qu.equals(fB, ((fB) (obj)).fB))
                    {
                        flag = flag1;
                        if (qu.equals(fC, ((fC) (obj)).fC))
                        {
                            return a(((qq) (obj)));
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
        ayW = null;
        azh = -1;
        return this;
    }

    public int hashCode()
    {
        return (((qu.hashCode(fA) + 527) * 31 + qu.hashCode(fB)) * 31 + qu.hashCode(fC)) * 31 + rQ();
    }

    public ()
    {
        h();
    }
}
