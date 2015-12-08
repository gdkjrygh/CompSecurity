// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util

public final class Base64
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

    private Base64()
    {
    }

    public static byte[] decode(byte abyte0[])
    {
        return decode(abyte0, abyte0.length);
    }

    public static byte[] decode(byte abyte0[], int i)
    {
        byte abyte1[];
        int i1;
        int j1;
        int j = (i / 4) * 3;
        if (j == 0)
        {
            return Util.EMPTY_BYTE_ARRAY;
        }
        abyte1 = new byte[j];
        i1 = 0;
        j1 = i;
_L2:
        byte byte0;
        byte0 = abyte0[j1 - 1];
        i = i1;
        if (byte0 != 10)
        {
            i = i1;
            if (byte0 != 13)
            {
                i = i1;
                if (byte0 != 32)
                {
                    if (byte0 != 9)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    i = i1;
                }
            }
        }
_L3:
        j1--;
        i1 = i;
        if (true) goto _L2; else goto _L1
_L1:
        if (byte0 == 61)
        {
            i = i1 + 1;
        } else
        {
label0:
            {
                int i2 = 0;
                int j2 = 0;
                int l1 = 0;
                i = 0;
                while (l1 < j1) 
                {
                    int k = abyte0[l1];
                    if (k != 10 && k != 13 && k != 32 && k != 9)
                    {
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
                        j2 = j2 << 6 | (byte)k;
                        if (i2 % 4 == 3)
                        {
                            k = i + 1;
                            abyte1[i] = (byte)(j2 >> 16);
                            int k2 = k + 1;
                            abyte1[k] = (byte)(j2 >> 8);
                            i = k2 + 1;
                            abyte1[k2] = (byte)j2;
                        }
                        i2++;
                    }
                    l1++;
                }
                int l = i;
                if (i1 > 0)
                {
                    int k1 = j2 << i1 * 6;
                    l = i + 1;
                    abyte1[i] = (byte)(k1 >> 16);
                    i = l;
                    if (i1 != 1)
                    {
                        break label0;
                    }
                    i = l + 1;
                    abyte1[l] = (byte)(k1 >> 8);
                    l = i;
                }
                i = l;
            }
            abyte0 = new byte[i];
            System.arraycopy(abyte1, 0, abyte0, 0, i);
            return abyte0;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static String encode(byte abyte0[])
    {
        byte abyte1[];
        int i;
        int l;
        abyte1 = new byte[((abyte0.length + 2) * 4) / 3];
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
