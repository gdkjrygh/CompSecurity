// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


// Referenced classes of package com.google.b.g.a:
//            o

final class p
{

    private static final int a[][];
    private static final int b[] = {
        0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 
        2, 3, 2, 3, 3, 4
    };
    private final o c;
    private final byte d;

    private p(int i)
    {
        c = o.a(i >> 3 & 3);
        d = (byte)(i & 7);
    }

    static int a(int i, int j)
    {
        i ^= j;
        j = b[i & 0xf];
        int k = b[i >>> 4 & 0xf];
        int l = b[i >>> 8 & 0xf];
        int i1 = b[i >>> 12 & 0xf];
        int j1 = b[i >>> 16 & 0xf];
        int k1 = b[i >>> 20 & 0xf];
        int l1 = b[i >>> 24 & 0xf];
        return b[i >>> 28 & 0xf] + (j + k + l + i1 + j1 + k1 + l1);
    }

    static p b(int i, int j)
    {
        p p1 = c(i, j);
        if (p1 != null)
        {
            return p1;
        } else
        {
            return c(i ^ 0x5412, j ^ 0x5412);
        }
    }

    private static p c(int i, int j)
    {
        int l = 0x7fffffff;
        int ai[][] = a;
        int k1 = ai.length;
        int i1 = 0;
        int k = 0;
        for (; i1 < k1; i1++)
        {
            int ai1[] = ai[i1];
            int l1 = ai1[0];
            if (l1 == i || l1 == j)
            {
                return new p(ai1[1]);
            }
            int j1 = a(i, l1);
            if (j1 < l)
            {
                k = ai1[1];
                l = j1;
            }
            if (i == j)
            {
                continue;
            }
            j1 = a(j, l1);
            if (j1 < l)
            {
                k = ai1[1];
                l = j1;
            }
        }

        if (l <= 3)
        {
            return new p(k);
        } else
        {
            return null;
        }
    }

    o a()
    {
        return c;
    }

    byte b()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof p)
        {
            if (c == ((p) (obj = (p)obj)).c && d == ((p) (obj)).d)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return c.ordinal() << 3 | d;
    }

    static 
    {
        int ai[] = {
            21522, 0
        };
        int ai1[] = {
            20773, 1
        };
        int ai2[] = {
            23371, 3
        };
        int ai3[] = {
            17913, 4
        };
        int ai4[] = {
            16590, 5
        };
        int ai5[] = {
            30877, 11
        };
        int ai6[] = {
            26159, 12
        };
        int ai7[] = {
            5769, 16
        };
        int ai8[] = {
            5054, 17
        };
        int ai9[] = {
            597, 21
        };
        int ai10[] = {
            13663, 24
        };
        int ai11[] = {
            16177, 26
        };
        int ai12[] = {
            14854, 27
        };
        int ai13[] = {
            8579, 29
        };
        int ai14[] = {
            11994, 30
        };
        int ai15[] = {
            11245, 31
        };
        a = (new int[][] {
            ai, ai1, new int[] {
                24188, 2
            }, ai2, ai3, ai4, new int[] {
                20375, 6
            }, new int[] {
                19104, 7
            }, new int[] {
                30660, 8
            }, new int[] {
                29427, 9
            }, 
            new int[] {
                32170, 10
            }, ai5, ai6, new int[] {
                25368, 13
            }, new int[] {
                27713, 14
            }, new int[] {
                26998, 15
            }, ai7, ai8, new int[] {
                7399, 18
            }, new int[] {
                6608, 19
            }, 
            new int[] {
                1890, 20
            }, ai9, new int[] {
                3340, 22
            }, new int[] {
                2107, 23
            }, ai10, new int[] {
                12392, 25
            }, ai11, ai12, new int[] {
                9396, 28
            }, ai13, 
            ai14, ai15
        });
    }
}
