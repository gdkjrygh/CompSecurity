// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.UnsupportedEncodingException;

final class Base64
{

    private static final byte MAP[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte URL_MAP[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };

    private Base64()
    {
    }

    public static byte[] decode(String s)
    {
        int j1 = s.length();
_L7:
        if (j1 <= 0) goto _L2; else goto _L1
_L1:
        int i = s.charAt(j1 - 1);
        if (i == '=' || i == '\n' || i == '\r' || i == ' ' || i == '\t') goto _L3; else goto _L2
_L2:
        byte abyte0[];
        int k;
        int i1;
        int k1;
        abyte0 = new byte[(int)(((long)j1 * 6L) / 8L)];
        k1 = 0;
        i1 = 0;
        k = 0;
        i = 0;
_L6:
        if (k1 >= j1) goto _L5; else goto _L4
_L4:
        int j;
        j = s.charAt(k1);
        if (j >= 65 && j <= 90)
        {
            j -= 65;
        } else
        if (j >= 97 && j <= 122)
        {
            j -= 71;
        } else
        if (j >= 48 && j <= 57)
        {
            j += 4;
        } else
        if (j == 43 || j == 45)
        {
            j = 62;
        } else
        {
label0:
            {
                if (j != 47 && j != 95)
                {
                    break label0;
                }
                j = 63;
            }
        }
        j = (byte)j | i1 << 6;
        k++;
        if (k % 4 == 0)
        {
            i1 = i + 1;
            abyte0[i] = (byte)(j >> 16);
            int l1 = i1 + 1;
            abyte0[i1] = (byte)(j >> 8);
            i = l1 + 1;
            abyte0[l1] = (byte)j;
        }
_L8:
        k1++;
        i1 = j;
          goto _L6
_L3:
        j1--;
          goto _L7
        if (j != 10 && j != 13 && j != 32)
        {
            if (j == 9)
            {
                j = i1;
            } else
            {
                return null;
            }
        } else
        {
            j = i1;
        }
          goto _L8
_L5:
        k %= 4;
        if (k == 1)
        {
            return null;
        }
        if (k != 2) goto _L10; else goto _L9
_L9:
        abyte0[i] = (byte)((i1 << 12) >> 16);
        j = i + 1;
_L12:
        if (j == abyte0.length)
        {
            return abyte0;
        }
        break; /* Loop/switch isn't completed */
_L10:
        j = i;
        if (k == 3)
        {
            int l = i1 << 6;
            i1 = i + 1;
            abyte0[i] = (byte)(l >> 16);
            j = i1 + 1;
            abyte0[i1] = (byte)(l >> 8);
        }
        if (true) goto _L12; else goto _L11
_L11:
        s = new byte[j];
        System.arraycopy(abyte0, 0, s, 0, j);
        return s;
          goto _L6
    }

    public static String encode(byte abyte0[])
    {
        return encode(abyte0, MAP);
    }

    private static String encode(byte abyte0[], byte abyte1[])
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

    public static String encodeUrl(byte abyte0[])
    {
        return encode(abyte0, URL_MAP);
    }

}
