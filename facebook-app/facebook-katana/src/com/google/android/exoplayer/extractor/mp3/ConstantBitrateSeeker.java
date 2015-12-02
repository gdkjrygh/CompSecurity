// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp3;


final class ConstantBitrateSeeker
    implements Mp3Extractor.Seeker
{

    private final long a;
    private final int b;
    private final long c;

    public ConstantBitrateSeeker(long l, int i, long l1)
    {
        long l2 = -1L;
        super();
        a = l;
        b = i;
        if (l1 == -1L)
        {
            l = l2;
        } else
        {
            l = a(l1);
        }
        c = l;
    }

    public final long a(long l)
    {
        return ((l - a) * 0xf4240L * 8L) / (long)b;
    }

    public final boolean a()
    {
        return c != -1L;
    }

    public final long b()
    {
        return c;
    }

    public final long b(long l)
    {
        if (c == -1L)
        {
            return 0L;
        } else
        {
            return a + ((long)b * l) / 0x7a1200L;
        }
    }
}
