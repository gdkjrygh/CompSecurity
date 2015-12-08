// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ae;


public final class a
{

    private static final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte b[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte c[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9
    };
    private static final byte d[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9
    };

    public static String a(byte abyte0[])
    {
        byte abyte1[];
        byte abyte2[];
        int i;
        int j;
        int k;
        int l1;
        l1 = abyte0.length;
        abyte1 = a;
        i = ((l1 + 2) / 3) * 4;
        abyte2 = new byte[i + i / 0x7fffffff];
        j = 0;
        i = 0;
        for (k = 0; k < l1 - 2;)
        {
            int l = (abyte0[k + 0] << 24) >>> 8 | (abyte0[k + 1 + 0] << 24) >>> 16 | (abyte0[k + 2 + 0] << 24) >>> 24;
            abyte2[i] = abyte1[l >>> 18];
            abyte2[i + 1] = abyte1[l >>> 12 & 0x3f];
            abyte2[i + 2] = abyte1[l >>> 6 & 0x3f];
            abyte2[i + 3] = abyte1[l & 0x3f];
            int j1 = j + 4;
            j = j1;
            l = i;
            if (j1 == 0x7fffffff)
            {
                abyte2[i + 4] = 10;
                l = i + 1;
                j = 0;
            }
            k += 3;
            i = l + 4;
        }

        if (k >= l1) goto _L2; else goto _L1
_L1:
        int k1 = k + 0;
        l1 -= k;
        int i1;
        if (l1 > 0)
        {
            k = (abyte0[k1] << 24) >>> 8;
        } else
        {
            k = 0;
        }
        if (l1 > 1)
        {
            i1 = (abyte0[k1 + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (l1 > 2)
        {
            k1 = (abyte0[k1 + 2] << 24) >>> 24;
        } else
        {
            k1 = 0;
        }
        k = k1 | (k | i1);
        l1;
        JVM INSTR tableswitch 1 3: default 304
    //                   1 455
    //                   2 405
    //                   3 350;
           goto _L3 _L4 _L5 _L6
_L3:
        if (j + 4 == 0x7fffffff)
        {
            abyte2[i + 4] = 10;
        }
_L2:
        return new String(abyte2, 0, abyte2.length);
_L6:
        abyte2[i] = abyte1[k >>> 18];
        abyte2[i + 1] = abyte1[k >>> 12 & 0x3f];
        abyte2[i + 2] = abyte1[k >>> 6 & 0x3f];
        abyte2[i + 3] = abyte1[k & 0x3f];
        continue; /* Loop/switch isn't completed */
_L5:
        abyte2[i] = abyte1[k >>> 18];
        abyte2[i + 1] = abyte1[k >>> 12 & 0x3f];
        abyte2[i + 2] = abyte1[k >>> 6 & 0x3f];
        abyte2[i + 3] = 61;
        continue; /* Loop/switch isn't completed */
_L4:
        abyte2[i] = abyte1[k >>> 18];
        abyte2[i + 1] = abyte1[k >>> 12 & 0x3f];
        abyte2[i + 2] = 61;
        abyte2[i + 3] = 61;
        if (true) goto _L3; else goto _L7
_L7:
    }

}
