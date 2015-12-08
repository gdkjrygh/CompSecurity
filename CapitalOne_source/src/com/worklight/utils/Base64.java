// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.utils;

import java.io.UnsupportedEncodingException;

public class Base64
{

    private static final byte map[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };

    public Base64()
    {
    }

    public static byte[] decode(byte abyte0[])
    {
        return decode(abyte0, abyte0.length);
    }

    public static byte[] decode(byte abyte0[], int i)
    {
        byte abyte1[];
        int l;
        int i1;
        int j = (i / 4) * 3;
        if (j == 0)
        {
            return new byte[0];
        }
        abyte1 = new byte[j];
        l = 0;
        i1 = i;
_L2:
        int k;
        k = abyte0[i1 - 1];
        i = l;
        if (k != 10)
        {
            i = l;
            if (k != 13)
            {
                i = l;
                if (k != 32)
                {
                    if (k != 9)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    i = l;
                }
            }
        }
_L3:
        i1--;
        l = i;
        if (true) goto _L2; else goto _L1
_L1:
label0:
        {
            if (k != 61)
            {
                break label0;
            }
            i = l + 1;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        int k1;
        int l1;
        int i2;
        l1 = 0;
        i2 = 0;
        k1 = 0;
        i = 0;
_L6:
label1:
        {
label2:
            {
                if (k1 < i1)
                {
                    break label1;
                }
                k = i;
                if (l > 0)
                {
                    int j1 = i2 << l * 6;
                    k = i + 1;
                    abyte1[i] = (byte)((0xff0000 & j1) >> 16);
                    i = k;
                    if (l != 1)
                    {
                        break label2;
                    }
                    i = k + 1;
                    abyte1[k] = (byte)((0xff00 & j1) >> 8);
                    k = i;
                }
                i = k;
            }
            abyte0 = new byte[i];
            System.arraycopy(abyte1, 0, abyte0, 0, i);
            return abyte0;
        }
        k = abyte0[k1];
        if (k != 10 && k != 13 && k != 32 && k != 9)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        k1++;
        if (true) goto _L6; else goto _L5
_L5:
        if (k >= 65 && k <= 90)
        {
            k -= 65;
        } else
        if (k >= 97 && k <= 122)
        {
            k -= 71;
        } else
        if (k >= 48 && k <= 57)
        {
            k += 4;
        } else
        if (k == 43)
        {
            k = 62;
        } else
        if (k == 47)
        {
            k = 63;
        } else
        {
            return null;
        }
        i2 = i2 << 6 | (byte)k;
        if (l1 % 4 == 3)
        {
            k = i + 1;
            abyte1[i] = (byte)((0xff0000 & i2) >> 16);
            int j2 = k + 1;
            abyte1[k] = (byte)((0xff00 & i2) >> 8);
            i = j2 + 1;
            abyte1[j2] = (byte)(i2 & 0xff);
        }
        l1++;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public static String encode(byte abyte0[], String s)
        throws UnsupportedEncodingException
    {
        byte abyte1[];
        int i;
        int j;
        int i1;
        i = (abyte0.length * 4) / 3;
        abyte1 = new byte[i + (i / 76 + 3)];
        i1 = abyte0.length - abyte0.length % 3;
        j = 0;
        i = 0;
_L6:
        if (j < i1) goto _L2; else goto _L1
_L1:
        abyte0.length % 3;
        JVM INSTR tableswitch 1 2: default 64
    //                   1 209
    //                   2 276;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_276;
_L7:
        return new String(abyte1, 0, i, s);
_L2:
        int j1 = i + 1;
        abyte1[i] = map[(abyte0[j] & 0xff) >> 2];
        i = j1 + 1;
        abyte1[j1] = map[(abyte0[j] & 3) << 4 | (abyte0[j + 1] & 0xff) >> 4];
        j1 = i + 1;
        abyte1[i] = map[(abyte0[j + 1] & 0xf) << 2 | (abyte0[j + 2] & 0xff) >> 6];
        i = j1 + 1;
        abyte1[j1] = map[abyte0[j + 2] & 0x3f];
        if ((i - 0) % 76 != 0);
        j += 3;
          goto _L6
_L4:
        int k = i + 1;
        abyte1[i] = map[(abyte0[i1] & 0xff) >> 2];
        i = k + 1;
        abyte1[k] = map[(abyte0[i1] & 3) << 4];
        k = i + 1;
        abyte1[i] = 61;
        abyte1[k] = 61;
        i = k + 1;
          goto _L7
        int l = i + 1;
        abyte1[i] = map[(abyte0[i1] & 0xff) >> 2];
        i = l + 1;
        abyte1[l] = map[(abyte0[i1] & 3) << 4 | (abyte0[i1 + 1] & 0xff) >> 4];
        l = i + 1;
        abyte1[i] = map[(abyte0[i1 + 1] & 0xf) << 2];
        i = l + 1;
        abyte1[l] = 61;
          goto _L7
    }

    public static String encodeUrlSafe(byte abyte0[], String s)
        throws UnsupportedEncodingException
    {
        return encode(abyte0, s).replace('+', '-').replace('/', '_');
    }

}
