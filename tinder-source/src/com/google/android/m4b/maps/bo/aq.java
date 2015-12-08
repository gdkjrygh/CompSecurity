// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.lang.reflect.Array;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            as, g, bc, ar, 
//            i, n, m

public final class aq extends as
{

    public final g a[] = new g[4];
    public final bc b;
    public final ar c;
    public final m d;
    private final g f[];
    private g g[][];

    private aq(g ag[])
    {
        for (int j = 0; j < 4; j++)
        {
            a[j] = new g();
            ag[j].h(a[j]);
        }

        f = ag;
        b = new bc(ag);
        d = b.b;
        c = ar.a(d);
        e = c.e;
        if (e)
        {
            g = (g[][])Array.newInstance(com/google/android/m4b/maps/bo/g, new int[] {
                6, 2
            });
            int l = 0;
            int k = 0;
            boolean flag = false;
            while (l < 4) 
            {
                boolean flag1;
                int i1;
                if (!a[l].equals(f[l]))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1 != flag)
                {
                    i1 = k;
                    flag = flag1;
                    if (l > 0)
                    {
                        i1 = k;
                        flag = flag1;
                        if (k < 5)
                        {
                            a(f[l - 1], f[l], k);
                            i1 = k + 1;
                            flag = flag1;
                        }
                    }
                } else
                {
                    i1 = k;
                }
                if (l > 0)
                {
                    g[i1 - 1][1] = a[l];
                }
                g[i1][0] = a[l];
                l++;
                k = i1 + 1;
            }
            if (k < 6)
            {
                a(f[3], f[0], k);
            }
            g[5][1] = a[0];
        }
    }

    public static aq a(g g1, g g2, g g3, g g4)
    {
        return new aq(new g[] {
            g1, g2, g4, g3
        });
    }

    private void a(g g1, g g2, int j)
    {
        int k;
        if (g2.a > 0)
        {
            k = 0x20000001;
        } else
        {
            k = 0xdfffffff;
        }
        k = (int)(((double)(k - g1.a) / (double)(g2.a - g1.a)) * (double)(g2.b - g1.b) + (double)g1.b);
        if (g1.a > g2.a)
        {
            g[j - 1][1] = new g(0xdfffffff, k);
            g[j][0] = new g(0x20000001, k);
            return;
        } else
        {
            g[j - 1][1] = new g(0x20000001, k);
            g[j][0] = new g(0xdfffffff, k);
            return;
        }
    }

    public final ar a()
    {
        return c;
    }

    public final g a(int j)
    {
        return a[j];
    }

    public final void a(int j, g ag[])
    {
        if (e)
        {
            ag[0] = g[j][0];
            ag[1] = g[j][1];
            return;
        } else
        {
            ag[0] = a[j];
            ag[1] = a[(j + 1) % 4];
            return;
        }
    }

    public final boolean a(g g1)
    {
        if (!e)
        {
            return b.a(g1);
        }
        int j = 0;
        int k;
        int l;
        for (k = 0; j < 6; k = l)
        {
            l = k;
            if (i.b(g[j][0], g[j][1], g1))
            {
                l = k + 1;
            }
            j++;
        }

        return k == 1;
    }

    public final boolean a(n n1)
    {
        if (c.b(n1.a())) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= n1.b())
                {
                    break label1;
                }
                if (!a(n1.a(j)))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final n b()
    {
        return b;
    }

    public final int c()
    {
        return !e ? 4 : 6;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof aq)
        {
            obj = (aq)obj;
            return Arrays.equals(f, ((aq) (obj)).f);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(f);
    }

    public final String toString()
    {
        String s = String.valueOf(f[0]);
        String s1 = String.valueOf(f[1]);
        String s2 = String.valueOf(f[2]);
        String s3 = String.valueOf(f[3]);
        return (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("[").append(s).append(",").append(s1).append(",").append(s2).append(",").append(s3).append("]").toString();
    }
}
