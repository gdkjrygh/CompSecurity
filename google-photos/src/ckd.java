// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ckd
{

    final byte a[];
    int b;

    public ckd(int i)
    {
        a = new byte[i];
    }

    static int a(byte abyte0[], int i, int j)
    {
        b.a(i, "offset", abyte0);
        b.a((i + j) - 1, "offset + length - 1", abyte0);
        int l = abyte0[i] & 0xff;
        for (int k = i + 1; k < i + j; k++)
        {
            l = l << 8 | abyte0[k] & 0xff;
        }

        return l;
    }

    private static long b(byte abyte0[], int i, int j)
    {
        b.a(i, "offset", abyte0);
        b.a((i + 8) - 1, "offset + length - 1", abyte0);
        long l = abyte0[i] & 0xff;
        for (j = i + 1; j < i + 8; j++)
        {
            l = l << 8 | (long)(abyte0[j] & 0xff);
        }

        return l;
    }

    public final int a()
    {
        int i = a(a, b, 1);
        b(1);
        return i;
    }

    public final void a(int i)
    {
        if (i != a.length)
        {
            b.a(i, "position", a);
        }
        b = i;
    }

    public final int b()
    {
        int i = a(a, b, 2);
        b(2);
        return i;
    }

    public final void b(int i)
    {
        a(b + i);
    }

    public final int c()
    {
        int i = a(a, b, 4);
        b(4);
        return i;
    }

    public final long d()
    {
        long l = b(a, b, 8);
        b(8);
        return l;
    }

    public final int e()
    {
        long l = b(a, b, 8);
        b(8);
        b.a(l, "result", 0L, 0x7fffffffL);
        return (int)l;
    }
}
