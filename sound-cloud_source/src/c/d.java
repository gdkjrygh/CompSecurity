// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.UnsupportedEncodingException;

public final class d
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

    public static String a(byte abyte0[])
    {
        return a(abyte0, a);
    }

    private static String a(byte abyte0[], byte abyte1[])
    {
        byte abyte2[];
        int i;
        int l;
        i = 0;
        abyte2 = new byte[((abyte0.length + 2) * 4) / 3];
        l = abyte0.length - abyte0.length % 3;
        for (int j = 0; j < l;)
        {
            int i1 = i + 1;
            abyte2[i] = abyte1[(abyte0[j] & 0xff) >> 2];
            i = i1 + 1;
            abyte2[i1] = abyte1[(abyte0[j] & 3) << 4 | (abyte0[j + 1] & 0xff) >> 4];
            i1 = i + 1;
            abyte2[i] = abyte1[(abyte0[j + 1] & 0xf) << 2 | (abyte0[j + 2] & 0xff) >> 6];
            abyte2[i1] = abyte1[abyte0[j + 2] & 0x3f];
            j += 3;
            i = i1 + 1;
        }

        abyte0.length % 3;
        JVM INSTR tableswitch 1 2: default 176
    //                   1 191
    //                   2 254;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_254;
_L4:
        int k;
        try
        {
            abyte0 = new String(abyte2, 0, i, "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
_L2:
        k = i + 1;
        abyte2[i] = abyte1[(abyte0[l] & 0xff) >> 2];
        i = k + 1;
        abyte2[k] = abyte1[(abyte0[l] & 3) << 4];
        k = i + 1;
        abyte2[i] = 61;
        i = k + 1;
        abyte2[k] = 61;
          goto _L4
        k = i + 1;
        abyte2[i] = abyte1[(abyte0[l] & 0xff) >> 2];
        i = k + 1;
        abyte2[k] = abyte1[(abyte0[l] & 3) << 4 | (abyte0[l + 1] & 0xff) >> 4];
        k = i + 1;
        abyte2[i] = abyte1[(abyte0[l + 1] & 0xf) << 2];
        i = k + 1;
        abyte2[k] = 61;
          goto _L4
    }

}
