// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.at;


// Referenced classes of package com.google.android.m4b.maps.at:
//            a, b

public final class c
{

    private static final byte a[][] = {
        {
            16, 11, 12, 14, 12, 10, 16, 14, 13, 14, 
            18, 17, 16, 19, 24, 40, 26, 24, 22, 22, 
            24, 49, 35, 37, 29, 40, 58, 51, 61, 60, 
            57, 51, 56, 55, 64, 72, 92, 78, 64, 68, 
            87, 69, 55, 56, 80, 109, 81, 87, 95, 98, 
            103, 104, 103, 62, 77, 113, 121, 112, 100, 120, 
            92, 101, 103, 99
        }, {
            17, 18, 18, 24, 21, 24, 47, 26, 26, 47, 
            99, 66, 56, 66, 99, 99, 99, 99, 99, 99, 
            99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 
            99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 
            99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 
            99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 
            99, 99, 99, 99
        }
    };
    private static final int b[] = {
        -1, 0x64000001, 0x32000001, 0x21555581, 0x19000001, 0x14000001, 0x10aaaac1, 0xe492491, 0xc800001, 0xb1c71c1, 
        0xa000001, 0x91745d1, 0x8555561, 0x7b13b19, 0x7249249, 0x6aaaaa9, 0x6400001, 0x5e1e1e1, 0x58e38e1, 0x5435e51, 
        0x5000001, 0x4c30c31, 0x48ba2e9, 0x4590b21, 0x42aaab1, 0x4000001, 0x3d89d8d, 0x3b425ed, 0x3924925, 0x372c239, 
        0x3555555, 0x339ce75, 0x3200001, 0x307c1f1, 0x2f0f0f1, 0x2db6db9, 0x2c71c71, 0x2b3e455, 0x2a1af29, 0x2906909, 
        0x2800001, 0x27063e9, 0x2618619, 0x253594d, 0x245d175, 0x238e391, 0x22c8591, 0x220ae4d, 0x2155559, 0x20a72f1, 
        0x2000001, 0x1f5c291, 0x1eb8521, 0x1e147b1, 0x1d70a3d, 0x1cccccd, 0x1c28f5d, 0x1b851ed, 0x1ae147d, 0x1a3d70d, 
        0x1999999, 0x18f5c29, 0x1851eb9, 0x17ae149, 0x170a3d9, 0x1666669, 0x15c28f5, 0x151eb85, 0x147ae15, 0x13d70a5, 
        0x1333335, 0x128f5c5, 0x11eb851, 0x1147ae1, 0x10a3d71, 0x1000001, 0xf5c291, 0xeb8521, 0xe147b1, 0xd70a3d, 
        0xcccccd, 0xc28f5d, 0xb851ed, 0xae147d, 0xa3d70d, 0x999999, 0x8f5c29, 0x851eb9, 0x7ae149, 0x70a3d9, 
        0x666669, 0x5c28f5, 0x51eb85, 0x47ae15, 0x3d70a5, 0x333335, 0x28f5c5, 0x1eb851, 0x147ae1, 0xa3d71, 
        1
    };

    public static byte[] a(int i, int j, int k)
    {
        com/google/android/m4b/maps/at/c;
        JVM INSTR monitorenter ;
        Object obj;
        byte abyte0[];
        obj = new byte[64];
        abyte0 = a[i];
        int i1 = 0;
          goto _L1
_L8:
        throw new IllegalArgumentException("qualityAlgorithm");
        obj;
        com/google/android/m4b/maps/at/c;
        JVM INSTR monitorexit ;
        throw obj;
_L9:
        int l;
        if (l != 99 || j != 36) goto _L3; else goto _L2
_L2:
        i = 138;
_L4:
        byte byte0;
        if (i <= 0)
        {
            l = 1;
        } else
        {
            l = i;
            if (i > 255)
            {
                l = 255;
            }
        }
        byte0 = (byte)l;
        obj[i1] = byte0;
        i1++;
          goto _L1
_L3:
        i = (int)((((long)l * (long)b[j]) / 0x1000000L + 1L) / 2L);
          goto _L4
_L10:
        if (j >= 50)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        i = Math.min(5000 / j, 5000);
_L5:
        i = (i * l + 50) / 100;
          goto _L4
        i = Math.max(200 - j * 2, 0);
          goto _L5
_L7:
        return ((byte []) (obj));
          goto _L4
_L1:
        if (i1 >= 64) goto _L7; else goto _L6
_L6:
        l = abyte0[i1] & 0xff;
        k;
        JVM INSTR tableswitch 0 1: default 220
    //                   0 40
    //                   1 108;
           goto _L8 _L9 _L10
    }

    public static byte[] a(byte abyte0[])
    {
        return a(abyte0, abyte0.length);
    }

    private static byte[] a(byte abyte0[], int i)
    {
        if (abyte0[0] == -1 && abyte0[1] == -40)
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 0, abyte1, 0, i);
            return abyte1;
        }
        if (abyte0[0] != 67 || abyte0[1] != 74 || abyte0[2] != 80 || abyte0[3] != 71)
        {
            throw new IllegalArgumentException("Input is not in compact JPEG format");
        }
        int j = abyte0[4] & 0xff;
        int k = abyte0[5];
        int l = abyte0[6];
        int i1 = abyte0[7];
        int j1 = abyte0[8];
        byte byte0 = abyte0[9];
        byte byte1 = abyte0[10];
        byte abyte2[];
        b b1;
        try
        {
            com.google.android.m4b.maps.at.a.a(j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException((new StringBuilder(27)).append("Unknown variant ").append(j).toString());
        }
        abyte2 = new byte[(i + 623) - 11];
        b1 = new b(j, l & 0xff | (k & 0xff) << 8, j1 & 0xff | (i1 & 0xff) << 8, byte0 & 0xff, byte1 & 0xff);
        j = b1.a;
        k = b1.b;
        l = b1.c;
        i1 = b1.d;
        j1 = b1.e;
        if (j != 0)
        {
            throw new IllegalArgumentException("variant");
        } else
        {
            com.google.android.m4b.maps.at.a.a(j);
            System.arraycopy(abyte0, 11, abyte2, 623, i - 11);
            com.google.android.m4b.maps.at.a.a(abyte2, j, k, l, i1, j1);
            return abyte2;
        }
    }

}
