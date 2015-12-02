// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.util.MpegAudioHeader;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

final class XingSeeker
    implements Mp3Extractor.Seeker
{

    private final long a[];
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    private XingSeeker(long al[], long l, long l1, long l2, 
            long l3)
    {
        a = al;
        b = l;
        c = l1;
        d = l2;
        e = l3;
    }

    private long a(int i)
    {
        return (d * (long)(i + 1)) / 100L;
    }

    public static XingSeeker a(MpegAudioHeader mpegaudioheader, ParsableByteArray parsablebytearray, long l, long l1)
    {
        int i = mpegaudioheader.g;
        int k = mpegaudioheader.d;
        long l2 = mpegaudioheader.c;
        if ((parsablebytearray.j() & 7) != 7)
        {
            return null;
        }
        int i1 = parsablebytearray.m();
        if (i1 == 0)
        {
            return null;
        }
        long l3 = Util.a(i1, (long)i * 0xf4240L, k);
        long l4 = parsablebytearray.m();
        parsablebytearray.c(1);
        mpegaudioheader = new long[99];
        for (int j = 0; j < 99; j++)
        {
            mpegaudioheader[j] = parsablebytearray.f();
        }

        return new XingSeeker(mpegaudioheader, l + l2, l4, l3, l1);
    }

    public final long a(long l)
    {
        long l1 = (256L * (l - b)) / c;
        int i = Util.a(a, l1, true, false);
        long l2 = a(i);
        if (i == 98)
        {
            return l2;
        }
        long l3;
        if (i == -1)
        {
            l = 0L;
        } else
        {
            l = a[i];
        }
        l3 = a[i + 1];
        return ((l1 - l) * (a(i + 1) - l2)) / (l3 - l) + l2;
    }

    public final boolean a()
    {
        return true;
    }

    public final long b()
    {
        return d;
    }

    public final long b(long l)
    {
        float f1;
        float f2;
        float f3;
        f1 = 256F;
        f2 = 0.0F;
        f3 = ((float)l * 100F) / (float)d;
        if (f3 > 0.0F) goto _L2; else goto _L1
_L1:
        float f = 0.0F;
_L4:
        long l1 = (long)(f * 0.00390625F * (float)c) + b;
        l = l1;
        if (e != -1L)
        {
            l = Math.min(l1, e - 1L);
        }
        return l;
_L2:
        f = f1;
        if (f3 < 100F)
        {
            int i = (int)f3;
            if (i == 0)
            {
                f = f2;
            } else
            {
                f = a[i - 1];
            }
            if (i < 99)
            {
                f1 = a[i];
            }
            f = (f1 - f) * (f3 - (float)i) + f;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
