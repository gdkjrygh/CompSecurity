// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import com.google.android.exoplayer.MediaFormat;

// Referenced classes of package com.google.android.exoplayer.util:
//            ParsableBitArray, ParsableByteArray

public final class Ac3Util
{

    private static final int a[] = {
        48000, 44100, 32000
    };
    private static final int b[] = {
        2, 1, 2, 3, 3, 4, 4, 5
    };
    private static final int c[] = {
        32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
        192, 224, 256, 320, 384, 448, 512, 576, 640
    };
    private static final int d[] = {
        69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 
        417, 487, 557, 696, 835, 975, 1114, 1253, 1393
    };

    private Ac3Util()
    {
    }

    public static int a(int i, int j)
    {
        return (i * 8 * j + 0xbb800) / 0x177000;
    }

    public static MediaFormat a(ParsableBitArray parsablebitarray)
    {
        int i = 1;
        parsablebitarray.b(32);
        int j = parsablebitarray.c(2);
        parsablebitarray.b(14);
        int k = parsablebitarray.c(3);
        if ((k & 1) != 0 && k != 1)
        {
            parsablebitarray.b(2);
        }
        if ((k & 4) != 0)
        {
            parsablebitarray.b(2);
        }
        if (k == 2)
        {
            parsablebitarray.b(2);
        }
        boolean flag = parsablebitarray.b();
        k = b[k];
        if (!flag)
        {
            i = 0;
        }
        return MediaFormat.b("audio/ac3", -1, i + k, a[j], null);
    }

    public static MediaFormat a(ParsableByteArray parsablebytearray)
    {
        int i = parsablebytearray.f();
        int k = a[(i & 0xc0) >> 6];
        int l = parsablebytearray.f();
        int j = b[(l & 0x38) >> 3];
        i = j;
        if ((l & 4) != 0)
        {
            i = j + 1;
        }
        return MediaFormat.b("audio/ac3", -1, i, k, null);
    }

    public static int b(ParsableBitArray parsablebitarray)
    {
        parsablebitarray.b(32);
        int j = parsablebitarray.c(2);
        int i = parsablebitarray.c(6);
        j = a[j];
        int k = c[i / 2];
        if (j == 32000)
        {
            return k * 6;
        }
        if (j == 44100)
        {
            return (d[i / 2] + i % 2) * 2;
        } else
        {
            return k * 4;
        }
    }

    public static MediaFormat b(ParsableByteArray parsablebytearray)
    {
        parsablebytearray.c(2);
        int i = parsablebytearray.f();
        int k = a[(i & 0xc0) >> 6];
        int l = parsablebytearray.f();
        int j = b[(l & 0xe) >> 1];
        i = j;
        if ((l & 1) != 0)
        {
            i = j + 1;
        }
        return MediaFormat.b("audio/eac3", -1, i, k, null);
    }

}
