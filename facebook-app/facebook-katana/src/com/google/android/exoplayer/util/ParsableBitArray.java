// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//            Assertions

public final class ParsableBitArray
{

    public byte a[];
    private int b;
    private int c;
    private int d;

    public ParsableBitArray()
    {
    }

    public ParsableBitArray(byte abyte0[])
    {
        this(abyte0, abyte0.length);
    }

    private ParsableBitArray(byte abyte0[], int i)
    {
        a = abyte0;
        d = i;
    }

    private int f()
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

    private void g()
    {
        boolean flag;
        if (b >= 0 && c >= 0 && c < 8 && (b < d || b == d && c == 0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.b(flag);
    }

    public final int a()
    {
        return (d - b) * 8 - c;
    }

    public final void a(int i)
    {
        b = i / 8;
        c = i - b * 8;
        g();
    }

    public final void a(byte abyte0[], int i)
    {
        a = abyte0;
        b = 0;
        c = 0;
        d = i;
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
        g();
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
            return i * 2 + 1;
        }
    }

    public final int c(int i)
    {
        int j;
        if (i == 0)
        {
            return 0;
        }
        boolean flag = false;
        j = i;
        i = ((flag) ? 1 : 0);
        while (j >= 8) 
        {
            int k;
            if (c != 0)
            {
                k = (a[b] & 0xff) << c | (a[b + 1] & 0xff) >>> 8 - c;
            } else
            {
                k = a[b];
            }
            j -= 8;
            i |= (k & 0xff) << j;
            b = b + 1;
        }
        if (j <= 0) goto _L2; else goto _L1
_L1:
        int l;
        l = c + j;
        j = (byte)(255 >> 8 - j);
        if (l <= 8) goto _L4; else goto _L3
_L3:
        i = j & ((a[b] & 0xff) << l - 8 | (a[b + 1] & 0xff) >> 16 - l) | i;
        b = b + 1;
_L6:
        c = l % 8;
_L2:
        g();
        return i;
_L4:
        j = j & (a[b] & 0xff) >> 8 - l | i;
        i = j;
        if (l == 8)
        {
            b = b + 1;
            i = j;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int d()
    {
        return f();
    }

    public final int e()
    {
        int i = f();
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
}
