// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.util.Arrays;

// Referenced classes of package com.google.b.b:
//            a

public final class b
    implements Cloneable
{

    private final int a;
    private final int b;
    private final int c;
    private final int d[];

    public b(int i)
    {
        this(i, i);
    }

    public b(int i, int j)
    {
        if (i < 1 || j < 1)
        {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        } else
        {
            a = i;
            b = j;
            c = (i + 31) / 32;
            d = new int[c * j];
            return;
        }
    }

    private b(int i, int j, int k, int ai[])
    {
        a = i;
        b = j;
        c = k;
        d = ai;
    }

    public a a(int i, a a1)
    {
        int k;
        if (a1 == null || a1.a() < a)
        {
            a1 = new a(a);
        } else
        {
            a1.c();
        }
        k = c;
        for (int j = 0; j < c; j++)
        {
            a1.a(j * 32, d[i * k + j]);
        }

        return a1;
    }

    public String a(String s, String s1)
    {
        return a(s, s1, System.lineSeparator());
    }

    public String a(String s, String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder(b * (a + 1));
        for (int i = 0; i < b; i++)
        {
            int j = 0;
            while (j < a) 
            {
                String s3;
                if (a(j, i))
                {
                    s3 = s;
                } else
                {
                    s3 = s1;
                }
                stringbuilder.append(s3);
                j++;
            }
            stringbuilder.append(s2);
        }

        return stringbuilder.toString();
    }

    public void a()
    {
        int j = d.length;
        for (int i = 0; i < j; i++)
        {
            d[i] = 0;
        }

    }

    public void a(int i, int j, int k, int l)
    {
        int i1;
        if (j < 0 || i < 0)
        {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (l < 1 || k < 1)
        {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        i1 = i + k;
        l = j + l;
        if (l > b || i1 > a)
        {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
_L3:
        if (j < l)
        {
            int j1 = c;
            k = i;
            while (k < i1) 
            {
                int ai[] = d;
                int k1 = k / 32 + j * j1;
                ai[k1] = ai[k1] | 1 << (k & 0x1f);
                k++;
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        j++;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public boolean a(int i, int j)
    {
        int k = c;
        int l = i / 32;
        return (d[k * j + l] >>> (i & 0x1f) & 1) != 0;
    }

    public void b()
    {
        int i = f();
        int k = g();
        a a2 = new a(i);
        a a1 = new a(i);
        for (int j = 0; j < (k + 1) / 2; j++)
        {
            a2 = a(j, a2);
            a1 = a(k - 1 - j, a1);
            a2.e();
            a1.e();
            b(j, a1);
            b(k - 1 - j, a2);
        }

    }

    public void b(int i, int j)
    {
        j = c * j + i / 32;
        int ai[] = d;
        ai[j] = ai[j] | 1 << (i & 0x1f);
    }

    public void b(int i, a a1)
    {
        System.arraycopy(a1.d(), 0, d, c * i, c);
    }

    public void c(int i, int j)
    {
        j = c * j + i / 32;
        int ai[] = d;
        ai[j] = ai[j] ^ 1 << (i & 0x1f);
    }

    public int[] c()
    {
        int i;
        int k;
        int l;
        int i1;
        int l1;
        i1 = a;
        l = b;
        k = -1;
        l1 = -1;
        i = 0;
_L12:
        if (i >= b) goto _L2; else goto _L1
_L1:
        int i2 = 0;
_L11:
        if (i2 >= c) goto _L4; else goto _L3
_L3:
        int j1;
        int j2;
        j2 = d[c * i + i2];
        if (j2 == 0)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        j1 = l;
        if (i < l)
        {
            j1 = i;
        }
        l = l1;
        if (i > l1)
        {
            l = i;
        }
        if (i2 * 32 >= i1) goto _L6; else goto _L5
_L5:
        for (l1 = 0; j2 << 31 - l1 == 0; l1++) { }
        if (i2 * 32 + l1 >= i1) goto _L6; else goto _L7
_L7:
        l1 = i2 * 32 + l1;
_L14:
        if (i2 * 32 + 31 <= k) goto _L9; else goto _L8
_L8:
        for (i1 = 31; j2 >>> i1 == 0; i1--) { }
        if (i2 * 32 + i1 <= k) goto _L9; else goto _L10
_L10:
        int k2 = i2 * 32 + i1;
        k = l;
        i1 = j1;
        l = k2;
_L13:
        i2++;
        j1 = l1;
        l1 = k;
        k = l;
        l = i1;
        i1 = j1;
          goto _L11
_L4:
        i++;
          goto _L12
_L2:
        int j = k - i1;
        k = l1 - l;
        if (j < 0 || k < 0)
        {
            return null;
        } else
        {
            return (new int[] {
                i1, l, j, k
            });
        }
_L9:
        i1 = j1;
        j1 = k;
        k = l;
        l = j1;
          goto _L13
_L6:
        l1 = i1;
          goto _L14
        int k1 = i1;
        i1 = l;
        l = k;
        k = l1;
        l1 = k1;
          goto _L13
    }

    public Object clone()
    {
        return h();
    }

    public int[] d()
    {
        int i;
        for (i = 0; i < d.length && d[i] == 0; i++) { }
        if (i == d.length)
        {
            return null;
        }
        int k = i / c;
        int l = c;
        int i1 = d[i];
        int j;
        for (j = 0; i1 << 31 - j == 0; j++) { }
        return (new int[] {
            (i % l) * 32 + j, k
        });
    }

    public int[] e()
    {
        int i;
        for (i = d.length - 1; i >= 0 && d[i] == 0; i--) { }
        if (i < 0)
        {
            return null;
        }
        int k = i / c;
        int l = c;
        int i1 = d[i];
        int j;
        for (j = 31; i1 >>> j == 0; j--) { }
        return (new int[] {
            (i % l) * 32 + j, k
        });
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (a == ((b) (obj = (b)obj)).a && b == ((b) (obj)).b && c == ((b) (obj)).c && Arrays.equals(d, ((b) (obj)).d))
            {
                return true;
            }
        }
        return false;
    }

    public int f()
    {
        return a;
    }

    public int g()
    {
        return b;
    }

    public b h()
    {
        return new b(a, b, c, (int[])d.clone());
    }

    public int hashCode()
    {
        return (((a * 31 + a) * 31 + b) * 31 + c) * 31 + Arrays.hashCode(d);
    }

    public String toString()
    {
        return a("X ", "  ");
    }
}
