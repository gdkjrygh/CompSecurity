// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


public final class BASE64Encoder
{

    private static final char encodeTable[] = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
        'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
        '8', '9', '+', '/'
    };
    private static final char last2byte = (char)Integer.parseInt("00000011", 2);
    private static final char last4byte = (char)Integer.parseInt("00001111", 2);
    private static final char last6byte = (char)Integer.parseInt("00111111", 2);
    private static final char lead2byte = (char)Integer.parseInt("11000000", 2);
    private static final char lead4byte = (char)Integer.parseInt("11110000", 2);
    private static final char lead6byte = (char)Integer.parseInt("11111100", 2);

    private BASE64Encoder()
    {
    }

    public static String encode(byte abyte0[])
    {
        StringBuilder stringbuilder;
        char c;
        int j;
        int k;
        k = 0;
        stringbuilder = new StringBuilder((int)((double)abyte0.length * 1.3400000000000001D) + 3);
        c = '\0';
        j = 0;
_L11:
        char c1;
        if (k >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j %= 8;
        c1 = c;
_L8:
        if (j >= 8)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        c = c1;
        j;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 116
    //                   1 95
    //                   2 132
    //                   3 95
    //                   4 145
    //                   5 95
    //                   6 192;
           goto _L1 _L2 _L3 _L4 _L3 _L5 _L3 _L6
_L6:
        break MISSING_BLOCK_LABEL_192;
_L2:
        break; /* Loop/switch isn't completed */
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        c = c1;
_L9:
        stringbuilder.append(encodeTable[c]);
        j += 6;
        c1 = c;
        if (true) goto _L8; else goto _L7
_L7:
        c = (char)((char)(abyte0[k] & lead6byte) >>> 2);
          goto _L9
_L4:
        c = (char)(abyte0[k] & last6byte);
          goto _L9
_L5:
        c1 = (char)((char)(abyte0[k] & last4byte) << 2);
        c = c1;
        if (k + 1 < abyte0.length)
        {
            c = (char)(c1 | (abyte0[k + 1] & lead2byte) >>> 6);
        }
          goto _L9
        c1 = (char)((char)(abyte0[k] & last2byte) << 4);
        c = c1;
        if (k + 1 < abyte0.length)
        {
            c = (char)(c1 | (abyte0[k + 1] & lead4byte) >>> 4);
        }
          goto _L9
        k++;
        c = c1;
        if (true) goto _L11; else goto _L10
_L10:
        if (stringbuilder.length() % 4 != 0)
        {
            for (int i = 4 - stringbuilder.length() % 4; i > 0; i--)
            {
                stringbuilder.append("=");
            }

        }
        return stringbuilder.toString();
    }

}
