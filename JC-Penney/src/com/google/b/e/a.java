// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.e;
import com.google.b.m;
import com.google.b.q;
import com.google.b.s;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            q

public final class a extends com.google.b.e.q
{

    static final char a[] = "0123456789-$:/.+ABCD".toCharArray();
    static final int b[] = {
        3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 
        12, 24, 69, 81, 84, 21, 26, 41, 11, 14
    };
    private static final char c[] = {
        'A', 'B', 'C', 'D'
    };
    private final StringBuilder d = new StringBuilder(20);
    private int e[];
    private int f;

    public a()
    {
        e = new int[80];
        f = 0;
    }

    private void a(com.google.b.b.a a1)
    {
        f = 0;
        int j = a1.d(0);
        int i1 = a1.a();
        if (j >= i1)
        {
            throw m.a();
        }
        int i = 1;
        int l = 0;
        while (j < i1) 
        {
            int k;
            if ((a1.a(j) ^ i) != 0)
            {
                l++;
                k = i;
                i = l;
            } else
            {
                b(l);
                if (i == 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                k = i;
                i = 1;
            }
            j++;
            l = i;
            i = k;
        }
        b(l);
    }

    static boolean a(char ac[], char c1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ac == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = ac.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (ac[i] != c1) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int b()
    {
        for (int i = 1; i < f; i += 2)
        {
            int j = c(i);
            if (j == -1 || !a(c, a[j]))
            {
                continue;
            }
            int l = 0;
            for (int k = i; k < i + 7; k++)
            {
                l += e[k];
            }

            if (i == 1 || e[i - 1] >= l / 2)
            {
                return i;
            }
        }

        throw m.a();
    }

    private void b(int i)
    {
        e[f] = i;
        f = f + 1;
        if (f >= e.length)
        {
            int ai[] = new int[f * 2];
            System.arraycopy(e, 0, ai, 0, f);
            e = ai;
        }
    }

    private int c(int i)
    {
        int i3;
        int j3;
        i3 = 0x7fffffff;
        j3 = i + 7;
        if (j3 < f) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int ai[] = e;
        k = i;
        int k1 = 0x7fffffff;
        int j = 0;
        while (k < j3) 
        {
            int i2 = ai[k];
            int l = k1;
            if (i2 < k1)
            {
                l = i2;
            }
            if (i2 > j)
            {
                j = i2;
            }
            k += 2;
            k1 = l;
        }
        int l2 = (k1 + j) / 2;
        k = i + 1;
        j = 0;
        int i1;
        for (k1 = i3; k < j3; k1 = i1)
        {
            int j2 = ai[k];
            i1 = k1;
            if (j2 < k1)
            {
                i1 = j2;
            }
            if (j2 > j)
            {
                j = j2;
            }
            k += 2;
        }

        int k2 = (k1 + j) / 2;
        k = 0;
        j = 0;
        int j1 = 128;
        while (k < 7) 
        {
            int l1;
            if ((k & 1) == 0)
            {
                l1 = l2;
            } else
            {
                l1 = k2;
            }
            j1 >>= 1;
            if (ai[i + k] > l1)
            {
                j |= j1;
            }
            k++;
        }
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= b.length)
                {
                    break label1;
                }
                k = i;
                if (b[i] == j)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public q a(int i, com.google.b.b.a a1, Map map)
    {
        int j;
        int k;
        Arrays.fill(e, 0);
        a(a1);
        k = b();
        d.setLength(0);
        j = k;
_L3:
        int l;
        int j1;
        l = c(j);
        if (l == -1)
        {
            throw m.a();
        }
        d.append((char)l);
        j1 = j + 8;
        if (d.length() <= 1 || !a(c, a[l])) goto _L2; else goto _L1
_L2:
        j = j1;
        if (j1 < f) goto _L3; else goto _L1
_L1:
        int k1 = e[j1 - 1];
        j = -8;
        int i1 = 0;
        for (; j < -1; j++)
        {
            i1 += e[j1 + j];
        }

        if (j1 < f && k1 < i1 / 2)
        {
            throw m.a();
        }
        a(k);
        for (j = 0; j < d.length(); j++)
        {
            d.setCharAt(j, a[d.charAt(j)]);
        }

        char c1 = d.charAt(0);
        if (!a(c, c1))
        {
            throw m.a();
        }
        c1 = d.charAt(d.length() - 1);
        if (!a(c, c1))
        {
            throw m.a();
        }
        if (d.length() <= 3)
        {
            throw m.a();
        }
        if (map == null || !map.containsKey(e.i))
        {
            d.deleteCharAt(d.length() - 1);
            d.deleteCharAt(0);
        }
        i1 = 0;
        int l1;
        for (j = 0; i1 < k; j = l1 + j)
        {
            l1 = e[i1];
            i1++;
        }

        float f1 = j;
        for (; k < j1 - 1; k++)
        {
            j += e[k];
        }

        float f2 = j;
        a1 = d.toString();
        map = new s(f1, i);
        s s1 = new s(f2, i);
        com.google.b.a a2 = com.google.b.a.b;
        return new q(a1, null, new s[] {
            map, s1
        }, a2);
    }

    void a(int i)
    {
        int ai[] = new int[4];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int ai1[] = new int[4];
        int[] _tmp1 = ai1;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int i2 = d.length() - 1;
        int j = 0;
        int k = i;
        float af[];
        float af1[];
        do
        {
            int k1 = b[d.charAt(j)];
            for (int i1 = 6; i1 >= 0; i1--)
            {
                int j2 = (i1 & 1) + (k1 & 1) * 2;
                ai[j2] = ai[j2] + e[k + i1];
                ai1[j2] = ai1[j2] + 1;
                k1 >>= 1;
            }

            if (j >= i2)
            {
                af = new float[4];
                af1 = new float[4];
                for (j = 0; j < 2; j++)
                {
                    af1[j] = 0.0F;
                    af1[j + 2] = ((float)ai[j] / (float)ai1[j] + (float)ai[j + 2] / (float)ai1[j + 2]) / 2.0F;
                    af[j] = af1[j + 2];
                    af[j + 2] = ((float)ai[j + 2] * 2.0F + 1.5F) / (float)ai1[j + 2];
                }

                break;
            }
            k += 8;
            j++;
        } while (true);
        k = 0;
        j = i;
        i = k;
        do
        {
            int j1 = b[d.charAt(i)];
            for (int l = 6; l >= 0; l--)
            {
                int l1 = (l & 1) + (j1 & 1) * 2;
                int k2 = e[j + l];
                if ((float)k2 < af1[l1] || (float)k2 > af[l1])
                {
                    throw m.a();
                }
                j1 >>= 1;
            }

            if (i >= i2)
            {
                return;
            }
            j += 8;
            i++;
        } while (true);
    }

}
