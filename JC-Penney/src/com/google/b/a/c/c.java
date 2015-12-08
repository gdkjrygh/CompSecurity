// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import com.google.b.b.a;
import com.google.b.b.b;
import com.google.b.b.b.d;

// Referenced classes of package com.google.b.a.c:
//            d, a

public final class c
{

    private static final int a[] = {
        4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 
        10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
        10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 
        12, 12, 12
    };

    private static int a(int i, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 88;
        } else
        {
            byte0 = 112;
        }
        return (byte0 + i * 16) * i;
    }

    public static com.google.b.a.c.a a(byte abyte0[], int i, int j)
    {
        a a2;
        int k2;
        int i3;
        a2 = (new com.google.b.a.c.d(abyte0)).a();
        k2 = (a2.a() * i) / 100 + 11;
        i3 = a2.a();
        if (j == 0) goto _L2; else goto _L1
_L1:
        int k;
        boolean flag;
        int l;
        if (j < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = Math.abs(j);
        if (flag)
        {
            i = 4;
        } else
        {
            i = 32;
        }
        if (l > i)
        {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[] {
                Integer.valueOf(j)
            }));
        }
        k = a(l, flag);
        i = a[l];
        abyte0 = a(a2, i);
        if (abyte0.a() + k2 > k - k % i)
        {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (flag && abyte0.a() > i * 64)
        {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        j = l;
_L11:
        Object obj;
        int ai[];
        int k3;
        obj = a(((a) (abyte0)), k, i);
        k3 = abyte0.a() / i;
        a2 = a(flag, j, k3);
        int i1;
        int l1;
        if (flag)
        {
            i = j * 4 + 11;
        } else
        {
            i = j * 4 + 14;
        }
        ai = new int[i];
        if (!flag) goto _L4; else goto _L3
_L2:
        k = 0;
        abyte0 = null;
        j = 0;
_L7:
        if (j > 32)
        {
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        if (j <= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = j + 1;
        } else
        {
            i1 = j;
        }
        l1 = a(i1, flag);
        if (i3 + k2 <= l1) goto _L6; else goto _L5
_L5:
        obj = abyte0;
_L9:
        j++;
        abyte0 = ((byte []) (obj));
          goto _L7
_L6:
        i = k;
        if (k != a[i1])
        {
            i = a[i1];
            abyte0 = a(a2, i);
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        k = i;
        if (abyte0.a() > i * 64) goto _L9; else goto _L8
_L8:
        obj = abyte0;
        k = i;
        if (abyte0.a() + k2 > l1 - l1 % i) goto _L9; else goto _L10
_L10:
        j = i1;
        k = l1;
          goto _L11
_L3:
        for (k = 0; k < ai.length; k++)
        {
            ai[k] = k;
        }

        k = i;
_L17:
        int j1;
        int i2;
        abyte0 = new b(k);
        i2 = 0;
        j1 = 0;
_L15:
        if (j1 >= j)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        int j3;
        int l3;
        if (flag)
        {
            k2 = (j - j1) * 4 + 9;
        } else
        {
            k2 = (j - j1) * 4 + 12;
        }
        i3 = 0;
_L13:
        if (i3 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        l3 = i3 * 2;
        for (j3 = 0; j3 < 2; j3++)
        {
            if (((a) (obj)).a(i2 + l3 + j3))
            {
                abyte0.b(ai[j1 * 2 + j3], ai[j1 * 2 + i3]);
            }
            if (((a) (obj)).a(k2 * 2 + i2 + l3 + j3))
            {
                abyte0.b(ai[j1 * 2 + i3], ai[i - 1 - j1 * 2 - j3]);
            }
            if (((a) (obj)).a(k2 * 4 + i2 + l3 + j3))
            {
                abyte0.b(ai[i - 1 - j1 * 2 - j3], ai[i - 1 - j1 * 2 - i3]);
            }
            if (((a) (obj)).a(k2 * 6 + i2 + l3 + j3))
            {
                abyte0.b(ai[i - 1 - j1 * 2 - i3], ai[j1 * 2 + j3]);
            }
        }

        i3++;
        continue; /* Loop/switch isn't completed */
_L4:
        i2 = i + 1 + ((i / 2 - 1) / 15) * 2;
        k2 = i / 2;
        i3 = i2 / 2;
        j1 = 0;
        do
        {
            k = i2;
            if (j1 >= k2)
            {
                continue; /* Loop/switch isn't completed */
            }
            k = j1 / 15 + j1;
            ai[k2 - j1 - 1] = i3 - k - 1;
            ai[k2 + j1] = k + i3 + 1;
            j1++;
        } while (true);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L13; else goto _L12
_L12:
        i2 = k2 * 8 + i2;
        j1++;
        if (true) goto _L15; else goto _L14
_L14:
        a(((b) (abyte0)), flag, k, a2);
        com.google.b.a.c.a a1;
        if (flag)
        {
            a(((b) (abyte0)), k / 2, 5);
        } else
        {
            a(((b) (abyte0)), k / 2, 7);
            int j2 = 0;
            int k1 = 0;
            while (j2 < i / 2 - 1) 
            {
                for (int l2 = k / 2 & 1; l2 < k; l2 += 2)
                {
                    abyte0.b(k / 2 - k1, l2);
                    abyte0.b(k / 2 + k1, l2);
                    abyte0.b(l2, k / 2 - k1);
                    abyte0.b(l2, k / 2 + k1);
                }

                j2 += 15;
                k1 += 16;
            }
        }
        a1 = new com.google.b.a.c.a();
        a1.a(flag);
        a1.a(k);
        a1.b(j);
        a1.c(k3);
        a1.a(abyte0);
        return a1;
        if (true) goto _L17; else goto _L16
_L16:
    }

    static a a(a a1, int i)
    {
        a a2 = new a();
        int j1 = a1.a();
        int k1 = (1 << i) - 2;
        int j = 0;
        do
        {
            if (j >= j1)
            {
                break;
            }
            int k = 0;
            int l;
            int i1;
            for (l = 0; k < i; l = i1)
            {
label0:
                {
                    if (j + k < j1)
                    {
                        i1 = l;
                        if (!a1.a(j + k))
                        {
                            break label0;
                        }
                    }
                    i1 = l | 1 << i - 1 - k;
                }
                k++;
            }

            if ((l & k1) == k1)
            {
                a2.b(l & k1, i);
                j--;
            } else
            if ((l & k1) == 0)
            {
                a2.b(l | 1, i);
                j--;
            } else
            {
                a2.b(l, i);
            }
            j += i;
        } while (true);
        return a2;
    }

    private static a a(a a1, int i, int j)
    {
        boolean flag = false;
        int k = a1.a() / j;
        Object obj = new d(a(j));
        int l = i / j;
        a1 = b(a1, j, l);
        ((d) (obj)).a(a1, l - k);
        obj = new a();
        ((a) (obj)).b(0, i % j);
        k = a1.length;
        for (i = ((flag) ? 1 : 0); i < k; i++)
        {
            ((a) (obj)).b(a1[i], j);
        }

        return ((a) (obj));
    }

    static a a(boolean flag, int i, int j)
    {
        a a1 = new a();
        if (flag)
        {
            a1.b(i - 1, 2);
            a1.b(j - 1, 6);
            return a(a1, 28, 4);
        } else
        {
            a1.b(i - 1, 5);
            a1.b(j - 1, 11);
            return a(a1, 40, 4);
        }
    }

    private static com.google.b.b.b.a a(int i)
    {
        switch (i)
        {
        case 5: // '\005'
        case 7: // '\007'
        case 9: // '\t'
        case 11: // '\013'
        default:
            return null;

        case 4: // '\004'
            return com.google.b.b.b.a.d;

        case 6: // '\006'
            return com.google.b.b.b.a.c;

        case 8: // '\b'
            return com.google.b.b.b.a.g;

        case 10: // '\n'
            return com.google.b.b.b.a.b;

        case 12: // '\f'
            return com.google.b.b.b.a.a;
        }
    }

    private static void a(b b1, int i, int j)
    {
        for (int k = 0; k < j; k += 2)
        {
            for (int l = i - k; l <= i + k; l++)
            {
                b1.b(l, i - k);
                b1.b(l, i + k);
                b1.b(i - k, l);
                b1.b(i + k, l);
            }

        }

        b1.b(i - j, i - j);
        b1.b((i - j) + 1, i - j);
        b1.b(i - j, (i - j) + 1);
        b1.b(i + j, i - j);
        b1.b(i + j, (i - j) + 1);
        b1.b(i + j, (i + j) - 1);
    }

    private static void a(b b1, boolean flag, int i, a a1)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        int l = i / 2;
        i = ((flag2) ? 1 : 0);
        if (flag)
        {
            for (i = ((flag1) ? 1 : 0); i < 7; i++)
            {
                int j = (l - 3) + i;
                if (a1.a(i))
                {
                    b1.b(j, l - 5);
                }
                if (a1.a(i + 7))
                {
                    b1.b(l + 5, j);
                }
                if (a1.a(20 - i))
                {
                    b1.b(j, l + 5);
                }
                if (a1.a(27 - i))
                {
                    b1.b(l - 5, j);
                }
            }

        } else
        {
            for (; i < 10; i++)
            {
                int k = (l - 5) + i + i / 5;
                if (a1.a(i))
                {
                    b1.b(k, l - 7);
                }
                if (a1.a(i + 10))
                {
                    b1.b(l + 7, k);
                }
                if (a1.a(29 - i))
                {
                    b1.b(k, l + 7);
                }
                if (a1.a(39 - i))
                {
                    b1.b(l - 7, k);
                }
            }

        }
    }

    private static int[] b(a a1, int i, int j)
    {
        int ai[] = new int[j];
        int j1 = a1.a() / i;
        for (j = 0; j < j1; j++)
        {
            int k = 0;
            int l = 0;
            while (k < i) 
            {
                int i1;
                if (a1.a(j * i + k))
                {
                    i1 = 1 << i - k - 1;
                } else
                {
                    i1 = 0;
                }
                l |= i1;
                k++;
            }
            ai[j] = l;
        }

        return ai;
    }

}
