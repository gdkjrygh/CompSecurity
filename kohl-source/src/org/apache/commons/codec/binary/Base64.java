// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.math.BigInteger;

// Referenced classes of package org.apache.commons.codec.binary:
//            BaseNCodec, StringUtils

public class Base64 extends BaseNCodec
{

    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    static final byte CHUNK_SEPARATOR[] = {
        13, 10
    };
    private static final byte DECODE_TABLE[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51
    };
    private static final int MASK_6BITS = 63;
    private static final byte STANDARD_ENCODE_TABLE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte URL_SAFE_ENCODE_TABLE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private final int decodeSize;
    private final byte decodeTable[];
    private final int encodeSize;
    private final byte encodeTable[];
    private final byte lineSeparator[];

    public Base64()
    {
        this(0);
    }

    public Base64(int i)
    {
        this(i, CHUNK_SEPARATOR);
    }

    public Base64(int i, byte abyte0[])
    {
        this(i, abyte0, false);
    }

    public Base64(int i, byte abyte0[], boolean flag)
    {
        int j;
        if (abyte0 == null)
        {
            j = 0;
        } else
        {
            j = abyte0.length;
        }
        super(3, 4, i, j);
        decodeTable = DECODE_TABLE;
        if (abyte0 != null)
        {
            if (containsAlphabetOrPad(abyte0))
            {
                abyte0 = StringUtils.newStringUtf8(abyte0);
                throw new IllegalArgumentException((new StringBuilder()).append("lineSeparator must not contain base64 characters: [").append(abyte0).append("]").toString());
            }
            if (i > 0)
            {
                encodeSize = abyte0.length + 4;
                lineSeparator = new byte[abyte0.length];
                System.arraycopy(abyte0, 0, lineSeparator, 0, abyte0.length);
            } else
            {
                encodeSize = 4;
                lineSeparator = null;
            }
        } else
        {
            encodeSize = 4;
            lineSeparator = null;
        }
        decodeSize = encodeSize - 1;
        if (flag)
        {
            abyte0 = URL_SAFE_ENCODE_TABLE;
        } else
        {
            abyte0 = STANDARD_ENCODE_TABLE;
        }
        encodeTable = abyte0;
    }

    public Base64(boolean flag)
    {
        this(76, CHUNK_SEPARATOR, flag);
    }

    public static byte[] decodeBase64(String s)
    {
        return (new Base64()).decode(s);
    }

    public static byte[] decodeBase64(byte abyte0[])
    {
        return (new Base64()).decode(abyte0);
    }

    public static BigInteger decodeInteger(byte abyte0[])
    {
        return new BigInteger(1, decodeBase64(abyte0));
    }

    public static byte[] encodeBase64(byte abyte0[])
    {
        return encodeBase64(abyte0, false);
    }

    public static byte[] encodeBase64(byte abyte0[], boolean flag)
    {
        return encodeBase64(abyte0, flag, false);
    }

    public static byte[] encodeBase64(byte abyte0[], boolean flag, boolean flag1)
    {
        return encodeBase64(abyte0, flag, flag1, 0x7fffffff);
    }

    public static byte[] encodeBase64(byte abyte0[], boolean flag, boolean flag1, int i)
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        }
        Base64 base64;
        long l;
        if (flag)
        {
            base64 = new Base64(flag1);
        } else
        {
            base64 = new Base64(0, CHUNK_SEPARATOR, flag1);
        }
        l = base64.getEncodedLength(abyte0);
        if (l > (long)i)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Input array too big, the output array would be bigger (").append(l).append(") than the specified maximum size of ").append(i).toString());
        } else
        {
            return base64.encode(abyte0);
        }
    }

    public static byte[] encodeBase64Chunked(byte abyte0[])
    {
        return encodeBase64(abyte0, true);
    }

    public static String encodeBase64String(byte abyte0[])
    {
        return StringUtils.newStringUtf8(encodeBase64(abyte0, false));
    }

    public static byte[] encodeBase64URLSafe(byte abyte0[])
    {
        return encodeBase64(abyte0, false, true);
    }

    public static String encodeBase64URLSafeString(byte abyte0[])
    {
        return StringUtils.newStringUtf8(encodeBase64(abyte0, false, true));
    }

    public static byte[] encodeInteger(BigInteger biginteger)
    {
        if (biginteger == null)
        {
            throw new NullPointerException("encodeInteger called with null parameter");
        } else
        {
            return encodeBase64(toIntegerBytes(biginteger), false);
        }
    }

    public static boolean isArrayByteBase64(byte abyte0[])
    {
        return isBase64(abyte0);
    }

    public static boolean isBase64(byte byte0)
    {
        return byte0 == 61 || byte0 >= 0 && byte0 < DECODE_TABLE.length && DECODE_TABLE[byte0] != -1;
    }

    public static boolean isBase64(String s)
    {
        return isBase64(StringUtils.getBytesUtf8(s));
    }

    public static boolean isBase64(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            if (!isBase64(abyte0[i]) && !isWhiteSpace(abyte0[i]))
            {
                return false;
            }
        }

        return true;
    }

    static byte[] toIntegerBytes(BigInteger biginteger)
    {
        int l = (biginteger.bitLength() + 7 >> 3) << 3;
        byte abyte0[] = biginteger.toByteArray();
        if (biginteger.bitLength() % 8 != 0 && biginteger.bitLength() / 8 + 1 == l / 8)
        {
            return abyte0;
        }
        int j = 0;
        int k = abyte0.length;
        int i = k;
        if (biginteger.bitLength() % 8 == 0)
        {
            j = 1;
            i = k - 1;
        }
        k = l / 8;
        biginteger = new byte[l / 8];
        System.arraycopy(abyte0, j, biginteger, k - i, i);
        return biginteger;
    }

    void decode(byte abyte0[], int i, int j, BaseNCodec.Context context)
    {
        if (!context.eof) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        if (j < 0)
        {
            context.eof = true;
        }
        k = 0;
_L4:
        byte abyte1[];
        int l;
        if (k >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte1 = ensureBufferSize(decodeSize, context);
        l = abyte0[i];
        if (l != 61)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        context.eof = true;
        if (!context.eof || context.modulus == 0) goto _L1; else goto _L3
_L3:
        abyte0 = ensureBufferSize(decodeSize, context);
        switch (context.modulus)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Impossible modulus ").append(context.modulus).toString());

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            context.ibitWorkArea = context.ibitWorkArea >> 4;
            i = context.pos;
            context.pos = i + 1;
            abyte0[i] = (byte)(context.ibitWorkArea & 0xff);
            return;

        case 3: // '\003'
            context.ibitWorkArea = context.ibitWorkArea >> 2;
            break;
        }
        break; /* Loop/switch isn't completed */
        if (l >= 0 && l < DECODE_TABLE.length)
        {
            l = DECODE_TABLE[l];
            if (l >= 0)
            {
                context.modulus = (context.modulus + 1) % 4;
                context.ibitWorkArea = (context.ibitWorkArea << 6) + l;
                if (context.modulus == 0)
                {
                    l = context.pos;
                    context.pos = l + 1;
                    abyte1[l] = (byte)(context.ibitWorkArea >> 16 & 0xff);
                    l = context.pos;
                    context.pos = l + 1;
                    abyte1[l] = (byte)(context.ibitWorkArea >> 8 & 0xff);
                    l = context.pos;
                    context.pos = l + 1;
                    abyte1[l] = (byte)(context.ibitWorkArea & 0xff);
                }
            }
        }
        k++;
        i++;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
        i = context.pos;
        context.pos = i + 1;
        abyte0[i] = (byte)(context.ibitWorkArea >> 8 & 0xff);
        i = context.pos;
        context.pos = i + 1;
        abyte0[i] = (byte)(context.ibitWorkArea & 0xff);
        return;
    }

    void encode(byte abyte0[], int i, int j, BaseNCodec.Context context)
    {
        if (!context.eof) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (j >= 0) goto _L4; else goto _L3
_L3:
        context.eof = true;
        if (context.modulus == 0 && lineLength == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = ensureBufferSize(encodeSize, context);
        i = context.pos;
        context.modulus;
        JVM INSTR tableswitch 0 2: default 84
    //                   0 228
    //                   1 116
    //                   2 297;
           goto _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L5:
        throw new IllegalStateException((new StringBuilder()).append("Impossible modulus ").append(context.modulus).toString());
_L7:
        j = context.pos;
        context.pos = j + 1;
        abyte0[j] = encodeTable[context.ibitWorkArea >> 2 & 0x3f];
        j = context.pos;
        context.pos = j + 1;
        abyte0[j] = encodeTable[context.ibitWorkArea << 4 & 0x3f];
        if (encodeTable == STANDARD_ENCODE_TABLE)
        {
            j = context.pos;
            context.pos = j + 1;
            abyte0[j] = 61;
            j = context.pos;
            context.pos = j + 1;
            abyte0[j] = 61;
        }
_L9:
        context.currentLinePos = context.currentLinePos + (context.pos - i);
        if (lineLength > 0 && context.currentLinePos > 0)
        {
            System.arraycopy(lineSeparator, 0, abyte0, context.pos, lineSeparator.length);
            context.pos = context.pos + lineSeparator.length;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        j = context.pos;
        context.pos = j + 1;
        abyte0[j] = encodeTable[context.ibitWorkArea >> 10 & 0x3f];
        j = context.pos;
        context.pos = j + 1;
        abyte0[j] = encodeTable[context.ibitWorkArea >> 4 & 0x3f];
        j = context.pos;
        context.pos = j + 1;
        abyte0[j] = encodeTable[context.ibitWorkArea << 2 & 0x3f];
        if (encodeTable == STANDARD_ENCODE_TABLE)
        {
            j = context.pos;
            context.pos = j + 1;
            abyte0[j] = 61;
        }
        if (true) goto _L9; else goto _L4
_L4:
        for (int k = 0; k < j;)
        {
            byte abyte1[] = ensureBufferSize(encodeSize, context);
            context.modulus = (context.modulus + 1) % 3;
            byte byte0 = abyte0[i];
            int l = byte0;
            if (byte0 < 0)
            {
                l = byte0 + 256;
            }
            context.ibitWorkArea = (context.ibitWorkArea << 8) + l;
            if (context.modulus == 0)
            {
                int i1 = context.pos;
                context.pos = i1 + 1;
                abyte1[i1] = encodeTable[context.ibitWorkArea >> 18 & 0x3f];
                i1 = context.pos;
                context.pos = i1 + 1;
                abyte1[i1] = encodeTable[context.ibitWorkArea >> 12 & 0x3f];
                i1 = context.pos;
                context.pos = i1 + 1;
                abyte1[i1] = encodeTable[context.ibitWorkArea >> 6 & 0x3f];
                i1 = context.pos;
                context.pos = i1 + 1;
                abyte1[i1] = encodeTable[context.ibitWorkArea & 0x3f];
                context.currentLinePos = context.currentLinePos + 4;
                if (lineLength > 0 && lineLength <= context.currentLinePos)
                {
                    System.arraycopy(lineSeparator, 0, abyte1, context.pos, lineSeparator.length);
                    context.pos = context.pos + lineSeparator.length;
                    context.currentLinePos = 0;
                }
            }
            k++;
            i++;
        }

        return;
        if (true) goto _L1; else goto _L10
_L10:
    }

    protected boolean isInAlphabet(byte byte0)
    {
        return byte0 >= 0 && byte0 < decodeTable.length && decodeTable[byte0] != -1;
    }

    public boolean isUrlSafe()
    {
        return encodeTable == URL_SAFE_ENCODE_TABLE;
    }

}
