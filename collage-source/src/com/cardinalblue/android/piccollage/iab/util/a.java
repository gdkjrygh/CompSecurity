// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;


// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            b

public class a
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

    private a()
    {
    }

    private static int a(byte abyte0[], int i, byte abyte1[], int j, byte abyte2[])
    {
        if (abyte0[i + 2] == 61)
        {
            abyte1[j] = (byte)(((abyte2[abyte0[i]] << 24) >>> 6 | (abyte2[abyte0[i + 1]] << 24) >>> 12) >>> 16);
            return 1;
        }
        if (abyte0[i + 3] == 61)
        {
            i = (abyte2[abyte0[i]] << 24) >>> 6 | (abyte2[abyte0[i + 1]] << 24) >>> 12 | (abyte2[abyte0[i + 2]] << 24) >>> 18;
            abyte1[j] = (byte)(i >>> 16);
            abyte1[j + 1] = (byte)(i >>> 8);
            return 2;
        } else
        {
            i = (abyte2[abyte0[i]] << 24) >>> 6 | (abyte2[abyte0[i + 1]] << 24) >>> 12 | (abyte2[abyte0[i + 2]] << 24) >>> 18 | (abyte2[abyte0[i + 3]] << 24) >>> 24;
            abyte1[j] = (byte)(i >> 16);
            abyte1[j + 1] = (byte)(i >> 8);
            abyte1[j + 2] = (byte)i;
            return 3;
        }
    }

    public static String a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length, a, true);
    }

    public static String a(byte abyte0[], int i, int j, byte abyte1[], boolean flag)
    {
        abyte0 = a(abyte0, i, j, abyte1, 0x7fffffff);
        i = abyte0.length;
        do
        {
            if (flag || i <= 0 || abyte0[i - 1] != 61)
            {
                return new String(abyte0, 0, i);
            }
            i--;
        } while (true);
    }

    public static byte[] a(String s)
        throws b
    {
        s = s.getBytes();
        return a(((byte []) (s)), 0, s.length);
    }

    public static byte[] a(byte abyte0[], int i, int j)
        throws b
    {
        return a(abyte0, i, j, c);
    }

    public static byte[] a(byte abyte0[], int i, int j, byte abyte1[])
        throws b
    {
        byte abyte2[];
        byte abyte3[];
        int k;
        int l;
        int i1;
        abyte2 = new byte[(j * 3) / 4 + 2];
        abyte3 = new byte[4];
        i1 = 0;
        l = 0;
        k = 0;
_L7:
        if (i1 >= j) goto _L2; else goto _L1
_L1:
        byte byte0;
        byte byte1;
        byte0 = (byte)(abyte0[i1 + i] & 0x7f);
        byte1 = abyte1[byte0];
        if (byte1 < -5) goto _L4; else goto _L3
_L3:
        if (byte1 < -1)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        if (byte0 != 61) goto _L6; else goto _L5
_L5:
        int j1 = j - i1;
        i = (byte)(abyte0[(j - 1) + i] & 0x7f);
        if (l == 0 || l == 1)
        {
            throw new b((new StringBuilder()).append("invalid padding byte '=' at byte offset ").append(i1).toString());
        }
        if (l == 3 && j1 > 2 || l == 4 && j1 > 1)
        {
            throw new b((new StringBuilder()).append("padding byte '=' falsely signals end of encoded value at offset ").append(i1).toString());
        }
        if (i != 61 && i != 10)
        {
            throw new b("encoded value has invalid trailing byte");
        }
          goto _L2
_L6:
        int k1 = l + 1;
        abyte3[l] = byte0;
        if (k1 == 4)
        {
            l = a(abyte3, 0, abyte2, k, abyte1) + k;
            k = 0;
        } else
        {
            l = k;
            k = k1;
        }
_L8:
        k1 = i1 + 1;
        i1 = l;
        l = k;
        k = i1;
        i1 = k1;
          goto _L7
_L4:
        throw new b((new StringBuilder()).append("Bad Base64 input character at ").append(i1).append(": ").append(abyte0[i1 + i]).append("(decimal)").toString());
_L2:
        i = k;
        if (l != 0)
        {
            if (l == 1)
            {
                throw new b((new StringBuilder()).append("single trailing character at offset ").append(j - 1).toString());
            }
            abyte3[l] = 61;
            i = k + a(abyte3, 0, abyte2, k, abyte1);
        }
        abyte0 = new byte[i];
        System.arraycopy(abyte2, 0, abyte0, 0, i);
        return abyte0;
        int l1 = k;
        k = l;
        l = l1;
          goto _L8
    }

    public static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int l = ((j + 2) / 3) * 4;
        byte abyte2[] = new byte[l + l / k];
        int i1 = 0;
        l = 0;
        int j1;
        for (j1 = 0; j1 < j - 2;)
        {
            int k1 = (abyte0[j1 + i] << 24) >>> 8 | (abyte0[j1 + 1 + i] << 24) >>> 16 | (abyte0[j1 + 2 + i] << 24) >>> 24;
            abyte2[l] = abyte1[k1 >>> 18];
            abyte2[l + 1] = abyte1[k1 >>> 12 & 0x3f];
            abyte2[l + 2] = abyte1[k1 >>> 6 & 0x3f];
            abyte2[l + 3] = abyte1[k1 & 0x3f];
            int l1 = i1 + 4;
            i1 = l1;
            k1 = l;
            if (l1 == k)
            {
                abyte2[l + 4] = 10;
                k1 = l + 1;
                i1 = 0;
            }
            j1 += 3;
            l = k1 + 4;
        }

        if (j1 < j)
        {
            a(abyte0, j1 + i, j - j1, abyte2, l, abyte1);
            i = l;
            if (i1 + 4 == k)
            {
                abyte2[l + 4] = 10;
                i = l + 1;
            }
        }
        return abyte2;
    }

    private static byte[] a(byte abyte0[], int i, int j, byte abyte1[], int k, byte abyte2[])
    {
        int j1 = 0;
        int l;
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = j1 | (i1 | l);
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = abyte2[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

}
