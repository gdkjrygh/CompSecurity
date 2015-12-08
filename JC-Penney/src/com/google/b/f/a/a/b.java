// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a.a;


// Referenced classes of package com.google.b.f.a.a:
//            c

public final class b
{

    public static final b a = new b(929, 3);
    private final int b[];
    private final int c[];
    private final c d = new c(this, new int[] {
        0
    });
    private final c e = new c(this, new int[] {
        1
    });
    private final int f;

    private b(int i, int j)
    {
        f = i;
        b = new int[i];
        c = new int[i];
        int k = 0;
        int l = 1;
        for (; k < i; k++)
        {
            b[k] = l;
            l = (l * j) % i;
        }

        for (j = 0; j < i - 1; j++)
        {
            c[b[j]] = j;
        }

    }

    int a(int i)
    {
        return b[i];
    }

    c a()
    {
        return d;
    }

    c a(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j == 0)
        {
            return d;
        } else
        {
            int ai[] = new int[i + 1];
            ai[0] = j;
            return new c(this, ai);
        }
    }

    int b(int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            return c[i];
        }
    }

    int b(int i, int j)
    {
        return (i + j) % f;
    }

    c b()
    {
        return e;
    }

    int c()
    {
        return f;
    }

    int c(int i)
    {
        if (i == 0)
        {
            throw new ArithmeticException();
        } else
        {
            return b[f - c[i] - 1];
        }
    }

    int c(int i, int j)
    {
        return ((f + i) - j) % f;
    }

    int d(int i, int j)
    {
        if (i == 0 || j == 0)
        {
            return 0;
        } else
        {
            return b[(c[i] + c[j]) % (f - 1)];
        }
    }

}
