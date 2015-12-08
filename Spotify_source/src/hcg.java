// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;

public final class hcg
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
        abyte2 = new byte[(abyte0.length + 2 << 2) / 3];
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

    public static byte[] a(String s)
    {
        byte abyte0[];
        int i;
        int k;
        int l;
        int i1;
        int j1;
        i1 = s.length();
        do
        {
            if (i1 <= 0)
            {
                break;
            }
            char c = s.charAt(i1 - 1);
            if (c != '=' && c != '\n' && c != '\r' && c != ' ' && c != '\t')
            {
                break;
            }
            i1--;
        } while (true);
        abyte0 = new byte[(int)(((long)i1 * 6L) / 8L)];
        j1 = 0;
        k = 0;
        l = 0;
        i = 0;
_L2:
        int j;
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = s.charAt(j1);
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
        if (j == 47 || j == 95)
        {
            j = 63;
        } else
        {
            if (j != 10 && j != 13 && j != 32 && j != 9)
            {
                return null;
            }
            break MISSING_BLOCK_LABEL_402;
        }
        j = (byte)j | k << 6;
        k = l + 1;
        if (k % 4 == 0)
        {
            l = i + 1;
            abyte0[i] = (byte)(j >> 16);
            int k1 = l + 1;
            abyte0[l] = (byte)(j >> 8);
            i = k1 + 1;
            abyte0[k1] = (byte)j;
        }
_L3:
        j1++;
        l = k;
        k = j;
        if (true) goto _L2; else goto _L1
_L1:
        l %= 4;
        if (l == 1)
        {
            return null;
        }
        if (l == 2)
        {
            abyte0[i] = (byte)((k << 12) >> 16);
            j = i + 1;
        } else
        {
            j = i;
            if (l == 3)
            {
                k <<= 6;
                l = i + 1;
                abyte0[i] = (byte)(k >> 16);
                j = l + 1;
                abyte0[l] = (byte)(k >> 8);
            }
        }
        if (j == abyte0.length)
        {
            return abyte0;
        } else
        {
            s = new byte[j];
            System.arraycopy(abyte0, 0, s, 0, j);
            return s;
        }
        j = k;
        k = l;
          goto _L3
    }

}
