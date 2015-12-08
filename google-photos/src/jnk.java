// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jnk
{

    public byte a[];
    public int b;
    public int c;
    public int d;

    public jnk()
    {
    }

    public jnk(byte abyte0[])
    {
        this(abyte0, abyte0.length);
    }

    private jnk(byte abyte0[], int i)
    {
        a = abyte0;
        d = i;
    }

    private void f()
    {
        boolean flag;
        if (b >= 0 && c >= 0 && c < 8 && (b < d || b == d && c == 0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
    }

    public final int a()
    {
        return (d - b << 3) - c;
    }

    public final void a(int i)
    {
        b = i / 8;
        c = i - (b << 3);
        f();
    }

    public final void b(int i)
    {
        b = b + i / 8;
        c = c + i % 8;
        if (c > 7)
        {
            b = b + 1;
            c = c - 8;
        }
        f();
    }

    public final boolean b()
    {
        return c(1) == 1;
    }

    public final int c()
    {
        boolean flag = false;
        int j = b;
        int k = c;
        int i;
        for (i = 0; b < d && !b(); i++) { }
        if (b == d)
        {
            flag = true;
        }
        b = j;
        c = k;
        if (flag)
        {
            return -1;
        } else
        {
            return (i << 1) + 1;
        }
    }

    public final int c(int i)
    {
        int l;
        if (i == 0)
        {
            return 0;
        }
        int k1 = i / 8;
        int j = 0;
        boolean flag = false;
        l = i;
        i = ((flag) ? 1 : 0);
        while (j < k1) 
        {
            int i1;
            if (c != 0)
            {
                i1 = (a[b] & 0xff) << c | (a[b + 1] & 0xff) >>> 8 - c;
            } else
            {
                i1 = a[b];
            }
            l -= 8;
            i |= (i1 & 0xff) << l;
            b = b + 1;
            j++;
        }
        if (l <= 0) goto _L2; else goto _L1
_L1:
        int k;
        int j1;
        j1 = c + l;
        k = (byte)(255 >> 8 - l);
        if (j1 <= 8) goto _L4; else goto _L3
_L3:
        i = k & ((a[b] & 0xff) << j1 - 8 | (a[b + 1] & 0xff) >> 16 - j1) | i;
        b = b + 1;
_L6:
        c = j1 % 8;
_L2:
        f();
        return i;
_L4:
        k = k & (a[b] & 0xff) >> 8 - j1 | i;
        i = k;
        if (j1 == 8)
        {
            b = b + 1;
            i = k;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int d()
    {
        int i = e();
        byte byte0;
        if (i % 2 == 0)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        return byte0 * ((i + 1) / 2);
    }

    public int e()
    {
        int j = 0;
        int i;
        for (i = 0; !b(); i++) { }
        if (i > 0)
        {
            j = c(i);
        }
        return ((1 << i) - 1) + j;
    }
}
