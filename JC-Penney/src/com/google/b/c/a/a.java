// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;

import com.google.b.b.b;
import com.google.b.h;

// Referenced classes of package com.google.b.c.a:
//            g

final class a
{

    private final b a;
    private final b b;
    private final g c;

    a(b b1)
    {
        int i = b1.g();
        if (i < 8 || i > 144 || (i & 1) != 0)
        {
            throw h.a();
        } else
        {
            c = b(b1);
            a = a(b1);
            b = new b(a.f(), a.g());
            return;
        }
    }

    private static g b(b b1)
    {
        return g.a(b1.g(), b1.f());
    }

    int a(int i, int j)
    {
        int k;
        int l;
        if (a(i - 1, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
        k = l;
        if (a(i - 1, 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(i - 1, 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(1, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(2, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(3, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    b a(b b1)
    {
        int k = c.b();
        int i = c.c();
        if (b1.g() != k)
        {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int k1 = c.d();
        int l1 = c.e();
        int i2 = k / k1;
        int j2 = i / l1;
        b b2 = new b(j2 * l1, i2 * k1);
        for (int j = 0; j < i2; j++)
        {
            for (int l = 0; l < j2; l++)
            {
                for (int i1 = 0; i1 < k1; i1++)
                {
                    for (int j1 = 0; j1 < l1; j1++)
                    {
                        if (b1.a((l1 + 2) * l + 1 + j1, (k1 + 2) * j + 1 + i1))
                        {
                            b2.b(l * l1 + j1, j * k1 + i1);
                        }
                    }

                }

            }

        }

        return b2;
    }

    g a()
    {
        return c;
    }

    boolean a(int i, int j, int k, int l)
    {
        if (i < 0)
        {
            i += k;
            j = (4 - (k + 4 & 7)) + j;
        }
        int i1 = j;
        k = i;
        if (j < 0)
        {
            i1 = j + l;
            k = i + (4 - (l + 4 & 7));
        }
        b.b(i1, k);
        return a.a(i1, k);
    }

    int b(int i, int j)
    {
        int k;
        int l;
        if (a(i - 3, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
        k = l;
        if (a(i - 2, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(i - 1, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 4, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 3, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(1, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    int b(int i, int j, int k, int l)
    {
        int i1 = 0;
        if (a(i - 2, j - 2, k, l))
        {
            i1 = 1;
        }
        int j1 = i1 << 1;
        i1 = j1;
        if (a(i - 2, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i - 1, j - 2, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i - 1, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i - 1, j, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i, j - 2, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (a(i, j, k, l))
        {
            i1 = j1 | 1;
        }
        return i1;
    }

    byte[] b()
    {
        byte abyte0[];
        int i;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int j1;
        int k1;
        flag2 = false;
        abyte0 = new byte[c.f()];
        j1 = a.g();
        k1 = a.f();
        flag1 = false;
        flag = false;
        flag3 = false;
        i = 0;
        j = 4;
        k = 0;
_L3:
        if (j != j1 || i != 0 || flag3) goto _L2; else goto _L1
_L1:
        abyte0[k] = (byte)a(j1, k1);
        k++;
        j -= 2;
        i += 2;
        flag3 = true;
_L4:
        if (j >= j1 && i >= k1)
        {
            if (k != c.f())
            {
                throw h.a();
            } else
            {
                return abyte0;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (j == j1 - 2 && i == 0 && (k1 & 3) != 0 && !flag)
        {
            abyte0[k] = (byte)b(j1, k1);
            k++;
            j -= 2;
            i += 2;
            flag = true;
        } else
        if (j == j1 + 4 && i == 2 && (k1 & 7) == 0 && !flag1)
        {
            abyte0[k] = (byte)c(j1, k1);
            k++;
            j -= 2;
            i += 2;
            flag1 = true;
        } else
        {
            if (j != j1 - 2 || i != 0 || (k1 & 7) != 4 || flag2)
            {
                break MISSING_BLOCK_LABEL_472;
            }
            abyte0[k] = (byte)d(j1, k1);
            k++;
            j -= 2;
            i += 2;
            flag2 = true;
        }
          goto _L4
        i1 = i;
        i = k;
        k = j;
        j = i1;
        do
        {
            if (k < j1 && j >= 0 && !b.a(j, k))
            {
                int l = i + 1;
                abyte0[i] = (byte)b(k, j, j1, k1);
                i = l;
            }
            k -= 2;
            j += 2;
        } while (k >= 0 && j < k1);
        i1 = k + 1;
        j += 3;
        if (i1 >= 0 && j < k1 && !b.a(j, i1))
        {
            k = i + 1;
            abyte0[i] = (byte)b(i1, j, j1, k1);
        } else
        {
            k = i;
        }
        i1 += 2;
        i = j - 2;
        if (i1 < j1 && i >= 0)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        j = i1 + 3;
        i++;
          goto _L4
        j = i;
        i = k;
        break MISSING_BLOCK_LABEL_373;
    }

    int c(int i, int j)
    {
        int k;
        int l;
        if (a(i - 1, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
        k = l;
        if (a(i - 1, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 3, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(1, j - 3, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(1, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(1, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    int d(int i, int j)
    {
        int k;
        int l;
        if (a(i - 3, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
        k = l;
        if (a(i - 2, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(i - 1, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(1, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(2, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (a(3, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }
}
