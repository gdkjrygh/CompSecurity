// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class jnh
{

    public int a;
    private long b[];

    public jnh()
    {
        this(32);
    }

    private jnh(int i)
    {
        b = new long[32];
    }

    public final long a(int i)
    {
        if (i < 0 || i >= a)
        {
            int j = a;
            throw new IndexOutOfBoundsException((new StringBuilder(45)).append("Invalid size ").append(i).append(", size is ").append(j).toString());
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
