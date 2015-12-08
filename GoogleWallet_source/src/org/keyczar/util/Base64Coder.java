// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.util;

import org.keyczar.exceptions.Base64DecodingException;
import org.keyczar.i18n.Messages;

public final class Base64Coder
{

    private static final char ALPHABET[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
        'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
        '8', '9', '-', '_'
    };
    private static final byte DECODE[];
    private static final char WHITESPACE[] = {
        '\t', '\n', '\r', ' ', '\f'
    };

    public static byte[] decodeWebSafe(String s)
        throws Base64DecodingException
    {
        int i;
        int i2;
        int k2;
        s = s.toCharArray();
        int j = s.length;
        i = j;
        if (s[j - 1] == '=')
        {
            i = j - 1;
        }
        j = i;
        if (s[i - 1] == '=')
        {
            j = i - 1;
        }
        i2 = 0;
        int j1 = s.length;
        for (i = 0; i < j1;)
        {
            int l = i2;
            if (isWhiteSpace(s[i]))
            {
                l = i2 + 1;
            }
            i++;
            i2 = l;
        }

        k2 = j - i2;
        i = (k2 / 4) * 3;
        k2 % 4;
        JVM INSTR tableswitch 1 3: default 128
    //                   1 252
    //                   2 277
    //                   3 284;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_284;
_L5:
        byte abyte0[] = new byte[i];
        int k1 = 0;
        int i1 = 0;
        int j2 = 0;
        i = 0;
        while (j2 < k2 + i2) 
        {
            int l1 = i1;
            int k = k1;
            if (!isWhiteSpace(s[j2]))
            {
                k = k1 << 6 | getByte(s[j2]);
                l1 = i1 + 1;
            }
            if (l1 == 4)
            {
                i1 = i + 1;
                abyte0[i] = (byte)(k >> 16);
                k1 = i1 + 1;
                abyte0[i1] = (byte)(k >> 8);
                i = k1 + 1;
                abyte0[k1] = (byte)k;
                k = 0;
                i1 = 0;
            } else
            {
                i1 = l1;
            }
            j2++;
            k1 = k;
        }
        break MISSING_BLOCK_LABEL_291;
_L2:
        throw new Base64DecodingException(Messages.getString("Base64Coder.IllegalLength", new Object[] {
            Integer.valueOf(k2)
        }));
_L3:
        i++;
          goto _L5
        i += 2;
          goto _L5
        switch (i1)
        {
        default:
            return abyte0;

        case 2: // '\002'
            abyte0[i] = (byte)(k1 >> 4);
            return abyte0;

        case 3: // '\003'
            abyte0[i] = (byte)(k1 >> 10);
            break;
        }
        abyte0[i + 1] = (byte)(k1 >> 2);
        return abyte0;
    }

    public static String encodeWebSafe(byte abyte0[])
    {
        int i;
        int i1;
        int k1;
        i1 = abyte0.length / 3;
        k1 = abyte0.length % 3;
        i = i1 << 2;
        k1;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 199
    //                   2 206;
           goto _L1 _L2 _L3
_L1:
        char ac[];
        int l;
        ac = new char[i];
        int j = 0;
        l = 0;
        i = 0;
        while (j < i1) 
        {
            int l1 = l + 1;
            int i2 = abyte0[l];
            l = l1 + 1;
            l1 = (i2 & 0xff) << 16 | (abyte0[l1] & 0xff) << 8 | abyte0[l] & 0xff;
            i2 = i + 1;
            ac[i] = ALPHABET[l1 >> 18 & 0x3f];
            i = i2 + 1;
            ac[i2] = ALPHABET[l1 >> 12 & 0x3f];
            i2 = i + 1;
            ac[i] = ALPHABET[l1 >> 6 & 0x3f];
            i = i2 + 1;
            ac[i2] = ALPHABET[l1 & 0x3f];
            j++;
            l++;
        }
        break; /* Loop/switch isn't completed */
_L2:
        i += 2;
        continue; /* Loop/switch isn't completed */
_L3:
        i += 3;
        if (true) goto _L1; else goto _L4
_L4:
        if (k1 > 0)
        {
            int j1 = (abyte0[l] & 0xff) << 16;
            int k = j1;
            if (k1 == 2)
            {
                k = j1 | (abyte0[l + 1] & 0xff) << 8;
            }
            l = i + 1;
            ac[i] = ALPHABET[k >> 18 & 0x3f];
            ac[l] = ALPHABET[k >> 12 & 0x3f];
            if (k1 == 2)
            {
                ac[l + 1] = ALPHABET[k >> 6 & 0x3f];
            }
        }
        return new String(ac);
    }

    private static byte getByte(int i)
        throws Base64DecodingException
    {
        if (i < 0 || i > 127 || DECODE[i] == -1)
        {
            throw new Base64DecodingException(Messages.getString("Base64Coder.IllegalCharacter", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            return DECODE[i];
        }
    }

    private static boolean isWhiteSpace(int i)
    {
        return DECODE[i] == -2;
    }

    static 
    {
        DECODE = new byte[128];
        for (int i = 0; i < DECODE.length; i++)
        {
            DECODE[i] = -1;
        }

        for (int j = 0; j < WHITESPACE.length; j++)
        {
            DECODE[WHITESPACE[j]] = -2;
        }

        for (int k = 0; k < ALPHABET.length; k++)
        {
            DECODE[ALPHABET[k]] = (byte)k;
        }

    }
}
