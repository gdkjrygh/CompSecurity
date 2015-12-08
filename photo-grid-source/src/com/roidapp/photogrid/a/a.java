// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;


// Referenced classes of package com.roidapp.photogrid.a:
//            b

public class a
{

    static final boolean a;
    private static final byte b[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte c[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte d[] = {
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
    private static final byte e[] = {
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

    private static int a(byte abyte0[], byte abyte1[], int i, byte abyte2[])
    {
        if (abyte0[2] == 61)
        {
            abyte1[i] = (byte)(((abyte2[abyte0[0]] << 24) >>> 6 | (abyte2[abyte0[1]] << 24) >>> 12) >>> 16);
            return 1;
        }
        if (abyte0[3] == 61)
        {
            int j = abyte2[abyte0[0]];
            j = (abyte2[abyte0[1]] << 24) >>> 12 | (j << 24) >>> 6 | (abyte2[abyte0[2]] << 24) >>> 18;
            abyte1[i] = (byte)(j >>> 16);
            abyte1[i + 1] = (byte)(j >>> 8);
            return 2;
        } else
        {
            int k = abyte2[abyte0[0]];
            k = (abyte2[abyte0[1]] << 24) >>> 12 | (k << 24) >>> 6 | (abyte2[abyte0[2]] << 24) >>> 18 | (abyte2[abyte0[3]] << 24) >>> 24;
            abyte1[i] = (byte)(k >> 16);
            abyte1[i + 1] = (byte)(k >> 8);
            abyte1[i + 2] = (byte)k;
            return 3;
        }
    }

    public static byte[] a(String s)
    {
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        int i;
        int j;
        int k;
        int k1;
        abyte0 = s.getBytes();
        k1 = abyte0.length;
        abyte1 = d;
        s = new byte[(k1 * 3) / 4 + 2];
        abyte2 = new byte[4];
        k = 0;
        j = 0;
        i = 0;
_L7:
        if (k >= k1) goto _L2; else goto _L1
_L1:
        byte byte0;
        byte byte1;
        byte0 = (byte)(abyte0[k + 0] & 0x7f);
        byte1 = abyte1[byte0];
        if (byte1 < -5) goto _L4; else goto _L3
_L3:
        if (byte1 < -1)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        if (byte0 != 61) goto _L6; else goto _L5
_L5:
        int l = k1 - k;
        byte byte2 = (byte)(abyte0[(k1 - 1) + 0] & 0x7f);
        if (j == 0 || j == 1)
        {
            throw new b((new StringBuilder("invalid padding byte '=' at byte offset ")).append(k).toString());
        }
        if (j == 3 && l > 2 || j == 4 && l > 1)
        {
            throw new b((new StringBuilder("padding byte '=' falsely signals end of encoded value at offset ")).append(k).toString());
        }
        if (byte2 != 61 && byte2 != 10)
        {
            throw new b("encoded value has invalid trailing byte");
        }
          goto _L2
_L6:
        int i1 = j + 1;
        abyte2[j] = byte0;
        if (i1 == 4)
        {
            j = a(abyte2, ((byte []) (s)), i, abyte1) + i;
            i = 0;
        } else
        {
            j = i;
            i = i1;
        }
_L8:
        i1 = k + 1;
        k = j;
        j = i;
        i = k;
        k = i1;
          goto _L7
_L4:
        throw new b((new StringBuilder("Bad Base64 input character at ")).append(k).append(": ").append(abyte0[k + 0]).append("(decimal)").toString());
_L2:
        k = i;
        if (j != 0)
        {
            if (j == 1)
            {
                throw new b((new StringBuilder("single trailing character at offset ")).append(k1 - 1).toString());
            }
            abyte2[j] = 61;
            k = i + a(abyte2, ((byte []) (s)), i, abyte1);
        }
        abyte0 = new byte[k];
        System.arraycopy(s, 0, abyte0, 0, k);
        return abyte0;
        int j1 = i;
        i = j;
        j = j1;
          goto _L8
    }

    static 
    {
        boolean flag;
        if (!com/roidapp/photogrid/a/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
