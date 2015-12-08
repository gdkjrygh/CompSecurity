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

    public static byte[] decode(String s)
    {
        byte abyte0[];
        int j;
        int k;
        int l;
        int j1;
        int k1;
        j1 = s.length();
        do
        {
            if (j1 <= 0)
            {
                break;
            }
            char c = s.charAt(j1 - 1);
            if (c != '=' && c != '\n' && c != '\r' && c != ' ' && c != '\t')
            {
                break;
            }
            j1--;
        } while (true);
        abyte0 = new byte[(int)(((long)j1 * 6L) / 8L)];
        l = 0;
        k = 0;
        k1 = 0;
        j = 0;
_L2:
        int i;
        int i1;
        char c1;
        if (k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = s.charAt(k1);
        if (c1 >= 'A' && c1 <= 'Z')
        {
            i = c1 - 65;
        } else
        if (c1 >= 'a' && c1 <= 'z')
        {
            i = c1 - 71;
        } else
        if (c1 >= '0' && c1 <= '9')
        {
            i = c1 + 4;
        } else
        if (c1 == '+')
        {
            i = 62;
        } else
        {
label0:
            {
                if (c1 != '/')
                {
                    break label0;
                }
                i = 63;
            }
        }
        k = k << 6 | (byte)i;
        l++;
        i1 = l;
        i = k;
        if (l % 4 != 0)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        i = j + 1;
        abyte0[j] = (byte)(k >> 16);
        i1 = i + 1;
        abyte0[i] = (byte)(k >> 8);
        j = i1 + 1;
        abyte0[i1] = (byte)k;
        i = k;
_L7:
        k1++;
        k = i;
        if (true) goto _L2; else goto _L1
        i1 = l;
        i = k;
        if (c1 == '\n')
        {
            break MISSING_BLOCK_LABEL_440;
        }
        i1 = l;
        i = k;
        if (c1 == '\r')
        {
            break MISSING_BLOCK_LABEL_440;
        }
        i1 = l;
        i = k;
        if (c1 == ' ')
        {
            break MISSING_BLOCK_LABEL_440;
        }
        i1 = l;
        i = k;
        if (c1 == '\t')
        {
            break MISSING_BLOCK_LABEL_440;
        }
        s = null;
_L4:
        return s;
_L1:
        l %= 4;
        if (l == 1)
        {
            return null;
        }
        if (l != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j + 1;
        abyte0[j] = (byte)((k << 12) >> 16);
_L5:
        s = abyte0;
        if (i != abyte0.length)
        {
            s = new byte[i];
            System.arraycopy(abyte0, 0, s, 0, i);
            return s;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = j;
        if (l == 3)
        {
            k <<= 6;
            l = j + 1;
            abyte0[j] = (byte)(k >> 16);
            i = l + 1;
            abyte0[l] = (byte)(k >> 8);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        l = i1;
          goto _L7
    }

    public static String encode(byte abyte0[])
    {
        byte abyte1[];
        int i;
        int l;
        abyte1 = new byte[(abyte0.length + 2 << 2) / 3];
        l = abyte0.length - abyte0.length % 3;
        int j = 0;
        i = 0;
        for (; j < l; j += 3)
        {
            int i1 = i + 1;
            abyte1[i] = MAP[(abyte0[j] & 0xff) >> 2];
            i = i1 + 1;
            abyte1[i1] = MAP[(abyte0[j] & 3) << 4 | (abyte0[j + 1] & 0xff) >> 4];
            i1 = i + 1;
            abyte1[i] = MAP[(abyte0[j + 1] & 0xf) << 2 | (abyte0[j + 2] & 0xff) >> 6];
            i = i1 + 1;
            abyte1[i1] = MAP[abyte0[j + 2] & 0x3f];
        }

        abyte0.length % 3;
        JVM INSTR tableswitch 1 2: default 172
    //                   1 187
    //                   2 248;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_248;
_L4:
        int k;
        try
        {
            abyte0 = new String(abyte1, 0, i, "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
_L2:
        k = i + 1;
        abyte1[i] = MAP[(abyte0[l] & 0xff) >> 2];
        i = k + 1;
        abyte1[k] = MAP[(abyte0[l] & 3) << 4];
        k = i + 1;
        abyte1[i] = 61;
        abyte1[k] = 61;
        i = k + 1;
          goto _L4
        k = i + 1;
        abyte1[i] = MAP[(abyte0[l] & 0xff) >> 2];
        i = k + 1;
        abyte1[k] = MAP[(abyte0[l] & 3) << 4 | (abyte0[l + 1] & 0xff) >> 4];
        k = i + 1;
        abyte1[i] = MAP[(abyte0[l + 1] & 0xf) << 2];
        i = k + 1;
        abyte1[k] = 61;
          goto _L4
    }

}
