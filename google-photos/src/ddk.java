// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class ddk
{

    public long a[];
    public int b[];
    public int c;

    public ddk()
    {
        this(8);
    }

    private ddk(int i)
    {
        b.a(8, "capacity");
        a = new long[8];
        b = new int[8];
        c = 0;
    }

    public final int a(long l, int i)
    {
        i = Arrays.binarySearch(a, 0, c, l);
        if (i >= 0)
        {
            return b[i];
        } else
        {
            return 0x80000000;
        }
    }
}
