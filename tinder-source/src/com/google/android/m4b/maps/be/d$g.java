// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;


// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class a
{

    final byte a[];
    final int b;
    int c;
    private int d;
    private int e;

    final int a()
    {
        if (c == 0)
        {
            return 0;
        }
        if (d < 0)
        {
            a a1 = e(c - 1);
            int i = a1.b;
            int j = a1.d;
            d = a1.e + (i + j);
        }
        return d;
    }

    final void a(int i)
    {
        com.google.android.m4b.maps.be.d.a(a, i * 20 + 8, -1L);
    }

    final void a(a a1)
    {
        a(a1, c);
        c = c + 1;
        d = a1.b + a1.d + a1.e;
        e = -1;
    }

    final void a(e e1, int i)
    {
        byte abyte0[] = a;
        i = i * 20 + 8;
        com.google.android.m4b.maps.be.d.a(abyte0, i, e1.a);
        i += 8;
        int j = e1.b << 5 | e1.c;
        if (j >>> 5 != e1.b)
        {
            i = e1.b;
            throw new IllegalArgumentException((new StringBuilder(41)).append("Could not pack data offset of ").append(i).toString());
        }
        if ((j & 0x1f) != e1.c)
        {
            i = e1.c;
            throw new IllegalArgumentException((new StringBuilder(38)).append("Could not pack refCount of ").append(i).toString());
        } else
        {
            com.google.android.m4b.maps.be.d.a(abyte0, i, j);
            i += 4;
            com.google.android.m4b.maps.be.d.a(abyte0, i, e1.d << 24 | e1.e);
            com.google.android.m4b.maps.be.d.a(abyte0, i + 4, e1.f);
            return;
        }
    }

    final int b()
    {
        int i = 0;
        if (e == -1)
        {
            e = 0;
            for (; i < c; i++)
            {
                if (d(i) > 0)
                {
                    e = e + (c(i) + (com.google.android.m4b.maps.be.d.a(a, i * 20 + 8 + 8 + 4) & 0xffffff));
                }
            }

        }
        return e;
    }

    final long b(int i)
    {
        return com.google.android.m4b.maps.be.d.c(a, i * 20 + 8);
    }

    final int c(int i)
    {
        return com.google.android.m4b.maps.be.d.a(a, i * 20 + 8 + 8 + 4) >>> 24;
    }

    final int d(int i)
    {
        return com.google.android.m4b.maps.be.d.a(a, i * 20 + 8 + 8) & 0x1f;
    }

    final a e(int i)
    {
        byte abyte0[] = a;
        int k = i * 20 + 8;
        int j = b;
        long l1 = com.google.android.m4b.maps.be.d.c(abyte0, k);
        int l = k + 8;
        k = com.google.android.m4b.maps.be.d.a(abyte0, l);
        l += 4;
        int i1 = com.google.android.m4b.maps.be.d.a(abyte0, l);
        return new <init>(l1, k >>> 5, i1 >>> 24, i1 & 0xffffff, k & 0x1f, com.google.android.m4b.maps.be.d.a(abyte0, l + 4), j, i);
    }

    public final String toString()
    {
        int i = b;
        int j = c;
        return (new StringBuilder(31)).append("ID:").append(i).append(" Size:").append(j).toString();
    }

    (int i)
    {
        this(i, new byte[8192]);
    }

    private <init>(int i, byte abyte0[])
    {
        d = -1;
        e = -1;
        a = abyte0;
        b = i;
        c = 0;
    }

    c(byte abyte0[])
    {
        d = -1;
        e = -1;
        a = abyte0;
        b = com.google.android.m4b.maps.be.d.a(a, 0);
        c = com.google.android.m4b.maps.be.d.a(a, 4);
    }
}
