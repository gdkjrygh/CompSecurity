// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.util.Arrays;

public final class a
    implements Cloneable
{

    private int a[];
    private int b;

    public a()
    {
        b = 0;
        a = new int[1];
    }

    public a(int i)
    {
        b = i;
        a = f(i);
    }

    a(int ai[], int i)
    {
        a = ai;
        b = i;
    }

    private void e(int i)
    {
        if (i > a.length * 32)
        {
            int ai[] = f(i);
            System.arraycopy(a, 0, ai, 0, a.length);
            a = ai;
        }
    }

    private static int[] f(int i)
    {
        return new int[(i + 31) / 32];
    }

    public int a()
    {
        return b;
    }

    public void a(int i, int j)
    {
        a[i / 32] = j;
    }

    public void a(int i, byte abyte0[], int j, int k)
    {
        for (int l = 0; l < k; l++)
        {
            int i1 = 0;
            int j1;
            int k1;
            for (j1 = 0; i1 < 8; j1 = k1)
            {
                k1 = j1;
                if (a(i))
                {
                    k1 = j1 | 1 << 7 - i1;
                }
                i++;
                i1++;
            }

            abyte0[j + l] = (byte)j1;
        }

    }

    public void a(a a1)
    {
        int j = a1.b;
        e(b + j);
        for (int i = 0; i < j; i++)
        {
            a(a1.a(i));
        }

    }

    public void a(boolean flag)
    {
        e(b + 1);
        if (flag)
        {
            int ai[] = a;
            int i = b / 32;
            ai[i] = ai[i] | 1 << (b & 0x1f);
        }
        b = b + 1;
    }

    public boolean a(int i)
    {
        return (a[i / 32] & 1 << (i & 0x1f)) != 0;
    }

    public boolean a(int i, int j, boolean flag)
    {
        int l;
        int j1;
        int l1;
        int i2;
        if (j < i)
        {
            throw new IllegalArgumentException();
        }
        if (j == i)
        {
            return true;
        }
        l1 = j - 1;
        j1 = i / 32;
        i2 = l1 / 32;
        l = j1;
_L6:
        int i1;
        if (l > i2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l > j1)
        {
            j = 0;
        } else
        {
            j = i & 0x1f;
        }
        if (l < i2)
        {
            i1 = 31;
        } else
        {
            i1 = l1 & 0x1f;
        }
        if (j != 0 || i1 != 31) goto _L2; else goto _L1
_L1:
        j = -1;
_L4:
        i1 = a[l];
        int k;
        int k1;
        if (flag)
        {
            k = j;
        } else
        {
            k = 0;
        }
        if ((i1 & j) != k)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_166;
_L2:
        k = 0;
        do
        {
            k1 = j;
            j = k;
            if (k1 > i1)
            {
                break;
            }
            j = k1 + 1;
            k = 1 << k1 | k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        l++;
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    public int b()
    {
        return (b + 7) / 8;
    }

    public void b(int i)
    {
        int ai[] = a;
        int j = i / 32;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public void b(int i, int j)
    {
        if (j < 0 || j > 32)
        {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(b + j);
        while (j > 0) 
        {
            boolean flag;
            if ((i >> j - 1 & 1) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            j--;
        }
    }

    public void b(a a1)
    {
        if (a.length != a1.a.length)
        {
            throw new IllegalArgumentException("Sizes don't match");
        }
        for (int i = 0; i < a.length; i++)
        {
            int ai[] = a;
            ai[i] = ai[i] ^ a1.a[i];
        }

    }

    public int c(int i)
    {
        if (i >= b)
        {
            i = b;
        } else
        {
            int j = i / 32;
            for (i = a[j] & ~((1 << (i & 0x1f)) - 1); i == 0; i = a[j])
            {
                j++;
                if (j == a.length)
                {
                    return b;
                }
            }

            j = Integer.numberOfTrailingZeros(i) + j * 32;
            i = j;
            if (j > b)
            {
                return b;
            }
        }
        return i;
    }

    public void c()
    {
        int j = a.length;
        for (int i = 0; i < j; i++)
        {
            a[i] = 0;
        }

    }

    public Object clone()
    {
        return f();
    }

    public int d(int i)
    {
        if (i >= b)
        {
            i = b;
        } else
        {
            int j = i / 32;
            for (i = ~a[j] & ~((1 << (i & 0x1f)) - 1); i == 0; i = ~a[j])
            {
                j++;
                if (j == a.length)
                {
                    return b;
                }
            }

            j = Integer.numberOfTrailingZeros(i) + j * 32;
            i = j;
            if (j > b)
            {
                return b;
            }
        }
        return i;
    }

    public int[] d()
    {
        return a;
    }

    public void e()
    {
        boolean flag = true;
        int ai[] = new int[a.length];
        int k = (b - 1) / 32;
        int l1 = k + 1;
        for (int i = 0; i < l1; i++)
        {
            long l2 = a[i];
            l2 = (l2 & 0x55555555L) << 1 | l2 >> 1 & 0x55555555L;
            l2 = (l2 & 0x33333333L) << 2 | l2 >> 2 & 0x33333333L;
            l2 = (l2 & 0xf0f0f0fL) << 4 | l2 >> 4 & 0xf0f0f0fL;
            l2 = (l2 & 0xff00ffL) << 8 | l2 >> 8 & 0xff00ffL;
            ai[k - i] = (int)((l2 & 65535L) << 16 | l2 >> 16 & 65535L);
        }

        if (b != l1 * 32)
        {
            int i2 = l1 * 32 - b;
            int l = 0;
            int j = 1;
            for (; l < 31 - i2; l++)
            {
                j = j << 1 | 1;
            }

            int j1 = ai[0] >> i2 & j;
            for (int i1 = ((flag) ? 1 : 0); i1 < l1; i1++)
            {
                int k1 = ai[i1];
                ai[i1 - 1] = j1 | k1 << 32 - i2;
                j1 = k1 >> i2 & j;
            }

            ai[l1 - 1] = j1;
        }
        a = ai;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            if (b == ((a) (obj = (a)obj)).b && Arrays.equals(a, ((a) (obj)).a))
            {
                return true;
            }
        }
        return false;
    }

    public a f()
    {
        return new a((int[])a.clone(), b);
    }

    public int hashCode()
    {
        return b * 31 + Arrays.hashCode(a);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(b);
        int i = 0;
        while (i < b) 
        {
            if ((i & 7) == 0)
            {
                stringbuilder.append(' ');
            }
            char c1;
            if (a(i))
            {
                c1 = 'X';
            } else
            {
                c1 = '.';
            }
            stringbuilder.append(c1);
            i++;
        }
        return stringbuilder.toString();
    }
}
