// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;

import com.google.b.f;

// Referenced classes of package com.google.b.c.c:
//            d, l

public class k
{

    static final k a[] = {
        new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), 
        new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), 
        new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d()
    };
    private static k d[] = a;
    public final int b;
    public final int c;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    public k(boolean flag, int i1, int j1, int k1, int l1, int i2)
    {
        this(flag, i1, j1, k1, l1, i2, i1, j1);
    }

    k(boolean flag, int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2)
    {
        e = flag;
        f = i1;
        g = j1;
        b = k1;
        c = l1;
        h = i2;
        i = j2;
        j = k2;
    }

    public static k a(int i1, l l1, f f1, f f2, boolean flag)
    {
        k ak[];
        int j1;
        int i2;
        ak = d;
        i2 = ak.length;
        j1 = 0;
_L3:
        k k1;
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = ak[j1];
          goto _L1
_L5:
        j1++;
        if (true) goto _L3; else goto _L2
_L1:
        if (l1 == l.b && k1.e || l1 == l.c && !k1.e || f1 != null && (k1.f() < f1.a() || k1.g() < f1.b()) || f2 != null && (k1.f() > f2.a() || k1.g() > f2.b()) || i1 > k1.f) goto _L5; else goto _L4
_L4:
        return k1;
_L2:
        if (flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can't find a symbol arrangement that matches the message. Data codewords: ").append(i1).toString());
        } else
        {
            return null;
        }
    }

    public int a()
    {
        return f / i;
    }

    public int a(int i1)
    {
        return i;
    }

    final int b()
    {
        byte byte0 = 2;
        switch (h)
        {
        default:
            throw new IllegalStateException("Cannot handle this number of data regions");

        case 1: // '\001'
            byte0 = 1;
            // fall through

        case 2: // '\002'
        case 4: // '\004'
            return byte0;

        case 16: // '\020'
            return 4;

        case 36: // '$'
            return 6;
        }
    }

    public final int b(int i1)
    {
        return j;
    }

    final int c()
    {
        byte byte0 = 1;
        switch (h)
        {
        default:
            throw new IllegalStateException("Cannot handle this number of data regions");

        case 4: // '\004'
            byte0 = 2;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return byte0;

        case 16: // '\020'
            return 4;

        case 36: // '$'
            return 6;
        }
    }

    public final int d()
    {
        return b() * b;
    }

    public final int e()
    {
        return c() * c;
    }

    public final int f()
    {
        return d() + b() * 2;
    }

    public final int g()
    {
        return e() + c() * 2;
    }

    public final int h()
    {
        return f;
    }

    public final int i()
    {
        return g;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (e)
        {
            s = "Rectangular Symbol:";
        } else
        {
            s = "Square Symbol:";
        }
        stringbuilder.append(s);
        stringbuilder.append(" data region ").append(b).append('x').append(c);
        stringbuilder.append(", symbol size ").append(f()).append('x').append(g());
        stringbuilder.append(", symbol data size ").append(d()).append('x').append(e());
        stringbuilder.append(", codewords ").append(f).append('+').append(g);
        return stringbuilder.toString();
    }

}
