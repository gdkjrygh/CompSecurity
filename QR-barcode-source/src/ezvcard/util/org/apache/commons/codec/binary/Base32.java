// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util.org.apache.commons.codec.binary;


// Referenced classes of package ezvcard.util.org.apache.commons.codec.binary:
//            BaseNCodec, StringUtils

public class Base32 extends BaseNCodec
{

    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte CHUNK_SEPARATOR[] = {
        13, 10
    };
    private static final byte DECODE_TABLE[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, 
        26, 27, 28, 29, 30, 31, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25
    };
    private static final byte ENCODE_TABLE[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 
        54, 55
    };
    private static final byte HEX_DECODE_TABLE[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, 63, 0, 1, 
        2, 3, 4, 5, 6, 7, 8, 9, -1, -1, 
        -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, 26, 27, 28, 29, 30, 31, 32
    };
    private static final byte HEX_ENCODE_TABLE[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86
    };
    private static final int MASK_5BITS = 31;
    private long bitWorkArea;
    private final int decodeSize;
    private final byte decodeTable[];
    private final int encodeSize;
    private final byte encodeTable[];
    private final byte lineSeparator[];

    public Base32()
    {
        this(false);
    }

    public Base32(int i)
    {
        this(i, CHUNK_SEPARATOR);
    }

    public Base32(int i, byte abyte0[])
    {
        this(i, abyte0, false);
    }

    public Base32(int i, byte abyte0[], boolean flag)
    {
        int j;
        if (abyte0 == null)
        {
            j = 0;
        } else
        {
            j = abyte0.length;
        }
        super(5, 8, i, j);
        if (flag)
        {
            encodeTable = HEX_ENCODE_TABLE;
            decodeTable = HEX_DECODE_TABLE;
        } else
        {
            encodeTable = ENCODE_TABLE;
            decodeTable = DECODE_TABLE;
        }
        if (i > 0)
        {
            if (abyte0 == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("lineLength ").append(i).append(" > 0, but lineSeparator is null").toString());
            }
            if (containsAlphabetOrPad(abyte0))
            {
                abyte0 = StringUtils.newStringUtf8(abyte0);
                throw new IllegalArgumentException((new StringBuilder()).append("lineSeparator must not contain Base32 characters: [").append(abyte0).append("]").toString());
            }
            encodeSize = abyte0.length + 8;
            lineSeparator = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, lineSeparator, 0, abyte0.length);
        } else
        {
            encodeSize = 8;
            lineSeparator = null;
        }
        decodeSize = encodeSize - 1;
    }

    public Base32(boolean flag)
    {
        this(0, null, flag);
    }

    void decode(byte abyte0[], int i, int j)
    {
        if (!eof) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
        if (j < 0)
        {
            eof = true;
        }
        k = 0;
_L4:
        int l;
        if (k >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = abyte0[i];
        if (l != 61)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        eof = true;
        if (!eof || modulus < 2) goto _L1; else goto _L3
_L3:
        ensureBufferSize(decodeSize);
        byte abyte1[];
        switch (modulus)
        {
        default:
            return;

        case 2: // '\002'
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 2 & 255L);
            return;

        case 3: // '\003'
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 7 & 255L);
            return;

        case 4: // '\004'
            bitWorkArea = bitWorkArea >> 4;
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 8 & 255L);
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea & 255L);
            return;

        case 5: // '\005'
            bitWorkArea = bitWorkArea >> 1;
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 16 & 255L);
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 8 & 255L);
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea & 255L);
            return;

        case 6: // '\006'
            bitWorkArea = bitWorkArea >> 6;
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 16 & 255L);
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea >> 8 & 255L);
            abyte0 = buffer;
            i = pos;
            pos = i + 1;
            abyte0[i] = (byte)(int)(bitWorkArea & 255L);
            return;

        case 7: // '\007'
            bitWorkArea = bitWorkArea >> 3;
            break;
        }
        break MISSING_BLOCK_LABEL_746;
        ensureBufferSize(decodeSize);
        if (l >= 0 && l < decodeTable.length)
        {
            l = decodeTable[l];
            if (l >= 0)
            {
                modulus = (modulus + 1) % 8;
                bitWorkArea = (bitWorkArea << 5) + (long)l;
                if (modulus == 0)
                {
                    abyte1 = buffer;
                    l = pos;
                    pos = l + 1;
                    abyte1[l] = (byte)(int)(bitWorkArea >> 32 & 255L);
                    abyte1 = buffer;
                    l = pos;
                    pos = l + 1;
                    abyte1[l] = (byte)(int)(bitWorkArea >> 24 & 255L);
                    abyte1 = buffer;
                    l = pos;
                    pos = l + 1;
                    abyte1[l] = (byte)(int)(bitWorkArea >> 16 & 255L);
                    abyte1 = buffer;
                    l = pos;
                    pos = l + 1;
                    abyte1[l] = (byte)(int)(bitWorkArea >> 8 & 255L);
                    abyte1 = buffer;
                    l = pos;
                    pos = l + 1;
                    abyte1[l] = (byte)(int)(bitWorkArea & 255L);
                }
            }
        }
        k++;
        i++;
          goto _L4
        abyte0 = buffer;
        i = pos;
        pos = i + 1;
        abyte0[i] = (byte)(int)(bitWorkArea >> 24 & 255L);
        abyte0 = buffer;
        i = pos;
        pos = i + 1;
        abyte0[i] = (byte)(int)(bitWorkArea >> 16 & 255L);
        abyte0 = buffer;
        i = pos;
        pos = i + 1;
        abyte0[i] = (byte)(int)(bitWorkArea >> 8 & 255L);
        abyte0 = buffer;
        i = pos;
        pos = i + 1;
        abyte0[i] = (byte)(int)(bitWorkArea & 255L);
        return;
    }

    void encode(byte abyte0[], int i, int j)
    {
        if (!eof) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_1105;
        }
        eof = true;
        if (modulus == 0 && lineLength == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ensureBufferSize(encodeSize);
        i = pos;
        modulus;
        JVM INSTR tableswitch 1 4: default 80
    //                   1 145
    //                   2 350
    //                   3 583
    //                   4 830;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_830;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L9:
        currentLinePos = currentLinePos + (pos - i);
        if (lineLength > 0 && currentLinePos > 0)
        {
            System.arraycopy(lineSeparator, 0, buffer, pos, lineSeparator.length);
            pos = pos + lineSeparator.length;
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 3) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea << 2) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
          goto _L9
_L5:
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 11) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 6) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 1) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea << 4) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
          goto _L9
_L6:
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 19) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 14) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 9) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 4) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea << 1) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
          goto _L9
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 27) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 22) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 17) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 12) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 7) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea >> 2) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = encodeTable[(int)(bitWorkArea << 3) & 0x1f];
        abyte0 = buffer;
        j = pos;
        pos = j + 1;
        abyte0[j] = 61;
          goto _L9
        for (int k = 0; k < j;)
        {
            ensureBufferSize(encodeSize);
            modulus = (modulus + 1) % 5;
            byte byte0 = abyte0[i];
            int l = byte0;
            if (byte0 < 0)
            {
                l = byte0 + 256;
            }
            bitWorkArea = (bitWorkArea << 8) + (long)l;
            if (modulus == 0)
            {
                byte abyte1[] = buffer;
                int i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 35) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 30) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 25) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 20) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 15) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 10) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)(bitWorkArea >> 5) & 0x1f];
                abyte1 = buffer;
                i1 = pos;
                pos = i1 + 1;
                abyte1[i1] = encodeTable[(int)bitWorkArea & 0x1f];
                currentLinePos = currentLinePos + 8;
                if (lineLength > 0 && lineLength <= currentLinePos)
                {
                    System.arraycopy(lineSeparator, 0, buffer, pos, lineSeparator.length);
                    pos = pos + lineSeparator.length;
                    currentLinePos = 0;
                }
            }
            k++;
            i++;
        }

        return;
    }

    public boolean isInAlphabet(byte byte0)
    {
        return byte0 >= 0 && byte0 < decodeTable.length && decodeTable[byte0] != -1;
    }

}
