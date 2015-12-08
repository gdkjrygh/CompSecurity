// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class bdv
{

    public int a;
    private long b[];

    public bdv()
    {
        this((byte)0);
    }

    private bdv(byte byte0)
    {
        b = new long[32];
    }

    public final long a(int i)
    {
        if (i < 0 || i >= a)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid size ")).append(i).append(", size is ").append(a).toString());
        } else
        {
            return b[i];
        }
    }

    public final void a(long l)
    {
        if (a == b.length)
        {
            b = Arrays.copyOf(b, a << 1);
        }
        long al[] = b;
        int i = a;
        a = i + 1;
        al[i] = l;
    }
}
