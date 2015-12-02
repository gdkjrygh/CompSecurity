// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.util.MpegAudioHeader;
import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;

final class VbriSeeker
    implements Mp3Extractor.Seeker
{

    private final long a[];
    private final long b[];
    private final long c;
    private final long d;

    private VbriSeeker(long al[], long al1[], long l, long l1)
    {
        a = al;
        b = al1;
        c = l;
        d = l1;
    }

    public static VbriSeeker a(MpegAudioHeader mpegaudioheader, ParsableByteArray parsablebytearray, long l)
    {
        long al[];
        long al1[];
        int k;
        int j1;
        long l1;
        long l2;
        long l3;
        parsablebytearray.c(10);
        int i = parsablebytearray.j();
        if (i <= 0)
        {
            return null;
        }
        k = mpegaudioheader.d;
        l1 = i;
        int i1;
        int k1;
        if (k >= 32000)
        {
            i = 1152;
        } else
        {
            i = 576;
        }
        l2 = Util.a(l1, (long)i * 0xf4240L, k);
        i1 = parsablebytearray.g();
        j1 = parsablebytearray.g();
        k1 = parsablebytearray.g();
        al = new long[i1];
        al1 = new long[i1];
        l3 = l2 / (long)i1;
        l1 = 0L;
        k = 0;
_L7:
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        k1;
        JVM INSTR tableswitch 1 4: default 144
    //                   1 154
    //                   2 198
    //                   3 207
    //                   4 216;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_216;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        return null;
_L2:
        int j = parsablebytearray.f();
_L8:
        l1 += l3;
        al[k] = l1;
        l += j * j1;
        al1[k] = l;
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        j = parsablebytearray.g();
          goto _L8
_L4:
        j = parsablebytearray.h();
          goto _L8
        j = parsablebytearray.m();
          goto _L8
        return new VbriSeeker(al, al1, (long)mpegaudioheader.c + l, l2);
    }

    public final long a(long l)
    {
        return a[Util.a(b, l, true, true)];
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
        int i = Util.a(a, l, false, false);
        long l1 = c;
        if (i == -1)
        {
            l = 0L;
        } else
        {
            l = b[i];
        }
        return l + l1;
    }
}
