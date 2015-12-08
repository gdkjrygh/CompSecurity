// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.b;


// Referenced classes of package com.google.b.b.b:
//            b

public final class a
{

    public static final a a = new a(4201, 4096, 1);
    public static final a b = new a(1033, 1024, 1);
    public static final a c;
    public static final a d = new a(19, 16, 1);
    public static final a e = new a(285, 256, 0);
    public static final a f;
    public static final a g;
    public static final a h;
    private final int i[];
    private final int j[];
    private final b k = new b(this, new int[] {
        0
    });
    private final b l = new b(this, new int[] {
        1
    });
    private final int m;
    private final int n;
    private final int o;

    public a(int i1, int j1, int k1)
    {
        n = i1;
        m = j1;
        o = k1;
        i = new int[j1];
        j = new int[j1];
        int l1 = 0;
        k1 = 1;
        for (; l1 < j1; l1++)
        {
            i[l1] = k1;
            int i2 = k1 * 2;
            k1 = i2;
            if (i2 >= j1)
            {
                k1 = (i2 ^ i1) & j1 - 1;
            }
        }

        for (i1 = 0; i1 < j1 - 1; i1++)
        {
            j[i[i1]] = i1;
        }

    }

    static int b(int i1, int j1)
    {
        return i1 ^ j1;
    }

    int a(int i1)
    {
        return i[i1];
    }

    b a()
    {
        return k;
    }

    b a(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j1 == 0)
        {
            return k;
        } else
        {
            int ai[] = new int[i1 + 1];
            ai[0] = j1;
            return new b(this, ai);
        }
    }

    int b(int i1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return j[i1];
        }
    }

    b b()
    {
        return l;
    }

    public int c()
    {
        return m;
    }

    int c(int i1)
    {
        if (i1 == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return i[m - j[i1] - 1];
        }
    }

    int c(int i1, int j1)
    {
        if (i1 == 0 || j1 == 0)
        {
            return 0;
        } else
        {
            return i[(j[i1] + j[j1]) % (m - 1)];
        }
    }

    public int d()
    {
        return o;
    }

    public String toString()
    {
        return (new StringBuilder()).append("GF(0x").append(Integer.toHexString(n)).append(',').append(m).append(')').toString();
    }

    static 
    {
        c = new a(67, 64, 1);
        f = new a(301, 256, 1);
        g = f;
        h = c;
    }
}
