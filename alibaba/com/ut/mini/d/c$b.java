// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.d;


// Referenced classes of package com.ut.mini.d:
//            c

static class hD extends hD
{

    private static final int hB[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };
    private static final int hC[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };
    private int e;
    private int hD;
    private final int hE[];

    public boolean b(byte abyte0[], int i, int j, boolean flag)
    {
        byte abyte1[];
        int ai[];
        int k;
        int l;
        int j2;
        if (e == 6)
        {
            return false;
        }
        j2 = j + i;
        l = e;
        j = hD;
        k = 0;
        abyte1 = hA;
        ai = hE;
        break MISSING_BLOCK_LABEL_42;
        j = ai[abyte0[i2] & 0xff];
        l;
        JVM INSTR tableswitch 0 5: default 292
    //                   0 313
    //                   1 342
    //                   2 379
    //                   3 446
    //                   4 556
    //                   5 590;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        i = l;
        j = k1;
        k = i1;
_L8:
        l = i;
        i = i2 + 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (j < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = l + 1;
        k = i1;
          goto _L8
        if (j == -1) goto _L1; else goto _L9
_L9:
        e = 6;
        return false;
_L3:
        if (j < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = k1 << 6 | j;
        i = l + 1;
        k = i1;
          goto _L8
        if (j == -1) goto _L1; else goto _L10
_L10:
        e = 6;
        return false;
_L4:
        if (j >= 0)
        {
            j = k1 << 6 | j;
            i = l + 1;
            k = i1;
        } else
        {
            if (j != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            abyte1[i1] = (byte)(k1 >> 4);
            i = 4;
            k = i1 + 1;
            j = k1;
        }
          goto _L8
        if (j == -1) goto _L1; else goto _L11
_L11:
        e = 6;
        return false;
_L5:
        if (j >= 0)
        {
            j = k1 << 6 | j;
            abyte1[i1 + 2] = (byte)j;
            abyte1[i1 + 1] = (byte)(j >> 8);
            abyte1[i1] = (byte)(j >> 16);
            k = i1 + 3;
            i = 0;
        } else
        {
            if (j != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            abyte1[i1 + 1] = (byte)(k1 >> 2);
            abyte1[i1] = (byte)(k1 >> 10);
            k = i1 + 2;
            i = 5;
            j = k1;
        }
          goto _L8
        if (j == -1) goto _L1; else goto _L12
_L12:
        e = 6;
        return false;
_L6:
        if (j != -2)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = l + 1;
        k = i1;
        j = k1;
          goto _L8
        if (j == -1) goto _L1; else goto _L13
_L13:
        e = 6;
        return false;
_L7:
        if (j == -1) goto _L1; else goto _L14
_L14:
        e = 6;
        return false;
_L23:
        int i1;
        int k1;
        int i2;
        if (i < j2)
        {
            i1 = k;
            k1 = j;
            i2 = i;
            if (l != 0)
            {
                break MISSING_BLOCK_LABEL_238;
            }
            int l1 = i;
            i = j;
            do
            {
                if (l1 + 4 > j2)
                {
                    break;
                }
                j = ai[abyte0[l1] & 0xff] << 18 | ai[abyte0[l1 + 1] & 0xff] << 12 | ai[abyte0[l1 + 2] & 0xff] << 6 | ai[abyte0[l1 + 3] & 0xff];
                i = j;
                if (j < 0)
                {
                    break;
                }
                abyte1[k + 2] = (byte)j;
                abyte1[k + 1] = (byte)(j >> 8);
                abyte1[k] = (byte)(j >> 16);
                k += 3;
                l1 += 4;
                i = j;
            } while (true);
            i1 = k;
            k1 = i;
            i2 = l1;
            if (l1 < j2)
            {
                break MISSING_BLOCK_LABEL_238;
            }
            j = i;
        }
        if (!flag)
        {
            e = l;
            hD = j;
            b = k;
            return true;
        }
        i = k;
        l;
        JVM INSTR tableswitch 0 4: default 644
    //                   0 647
    //                   1 660
    //                   2 668
    //                   3 685
    //                   4 718;
           goto _L15 _L16 _L17 _L18 _L19 _L20
_L16:
        break; /* Loop/switch isn't completed */
_L15:
        i = k;
_L21:
        e = l;
        b = i;
        return true;
_L17:
        e = 6;
        return false;
_L18:
        abyte1[k] = (byte)(j >> 4);
        i = k + 1;
        continue; /* Loop/switch isn't completed */
_L19:
        int j1 = k + 1;
        abyte1[k] = (byte)(j >> 10);
        i = j1 + 1;
        abyte1[j1] = (byte)(j >> 2);
        if (true) goto _L21; else goto _L20
_L20:
        e = 6;
        return false;
        if (true) goto _L23; else goto _L22
_L22:
    }


    public (int i, byte abyte0[])
    {
        hA = abyte0;
        if ((i & 8) == 0)
        {
            abyte0 = hB;
        } else
        {
            abyte0 = hC;
        }
        hE = abyte0;
        e = 0;
        hD = 0;
    }
}
