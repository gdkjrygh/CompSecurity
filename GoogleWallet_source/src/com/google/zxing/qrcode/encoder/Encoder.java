// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.encoder;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.encoder:
//            MaskUtil, MatrixUtil, QRCode, ByteMatrix, 
//            BlockPair

public final class Encoder
{

    private static final int ALPHANUMERIC_TABLE[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, 
        -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 
        2, 3, 4, 5, 6, 7, 8, 9, 44, -1, 
        -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 
        35, -1, -1, -1, -1, -1
    };

    private static void append8BitBytes(String s, BitArray bitarray, String s1)
        throws WriterException
    {
        int j;
        try
        {
            s = s.getBytes(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new WriterException(s);
        }
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            bitarray.appendBits(s[i], 8);
        }

    }

    private static void appendAlphanumericBytes(CharSequence charsequence, BitArray bitarray)
        throws WriterException
    {
        int j = charsequence.length();
        for (int i = 0; i < j;)
        {
            int k = getAlphanumericCode(charsequence.charAt(i));
            if (k == -1)
            {
                throw new WriterException();
            }
            if (i + 1 < j)
            {
                int l = getAlphanumericCode(charsequence.charAt(i + 1));
                if (l == -1)
                {
                    throw new WriterException();
                }
                bitarray.appendBits(k * 45 + l, 11);
                i += 2;
            } else
            {
                bitarray.appendBits(k, 6);
                i++;
            }
        }

    }

    private static void appendBytes(String s, Mode mode, BitArray bitarray, String s1)
        throws WriterException
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$google$zxing$qrcode$decoder$Mode[];

            static 
            {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode = new int[Mode.values().length];
                try
                {
                    $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.NUMERIC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.zxing.qrcode.decoder.Mode[mode.ordinal()])
        {
        default:
            throw new WriterException((new StringBuilder("Invalid mode: ")).append(mode).toString());

        case 1: // '\001'
            appendNumericBytes(s, bitarray);
            return;

        case 2: // '\002'
            appendAlphanumericBytes(s, bitarray);
            return;

        case 3: // '\003'
            append8BitBytes(s, bitarray, s1);
            return;

        case 4: // '\004'
            appendKanjiBytes(s, bitarray);
            break;
        }
    }

    private static void appendECI(CharacterSetECI characterseteci, BitArray bitarray)
    {
        bitarray.appendBits(Mode.ECI.getBits(), 4);
        bitarray.appendBits(characterseteci.getValue(), 8);
    }

    private static void appendKanjiBytes(String s, BitArray bitarray)
        throws WriterException
    {
        int i;
        int j;
        byte byte0;
        int l;
        int k;
        try
        {
            s = s.getBytes("Shift_JIS");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new WriterException(s);
        }
        k = s.length;
        j = 0;
_L7:
        if (j >= k) goto _L2; else goto _L1
_L1:
        l = (s[j] & 0xff) << 8 | s[j + 1] & 0xff;
        byte0 = -1;
        if (l < 33088 || l > 40956) goto _L4; else goto _L3
_L3:
        i = l - 33088;
_L6:
        if (i == -1)
        {
            throw new WriterException("Invalid byte sequence");
        }
        break; /* Loop/switch isn't completed */
_L4:
        i = byte0;
        if (l >= 57408)
        {
            i = byte0;
            if (l <= 60351)
            {
                i = l - 49472;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        bitarray.appendBits((i >> 8) * 192 + (i & 0xff), 13);
        j += 2;
          goto _L7
_L2:
    }

    private static void appendLengthInfo(int i, Version version, Mode mode, BitArray bitarray)
        throws WriterException
    {
        int j = mode.getCharacterCountBits(version);
        if (i >= 1 << j)
        {
            throw new WriterException((new StringBuilder()).append(i).append(" is bigger than ").append((1 << j) - 1).toString());
        } else
        {
            bitarray.appendBits(i, j);
            return;
        }
    }

    private static void appendModeInfo(Mode mode, BitArray bitarray)
    {
        bitarray.appendBits(mode.getBits(), 4);
    }

    private static void appendNumericBytes(CharSequence charsequence, BitArray bitarray)
    {
        int j = charsequence.length();
        for (int i = 0; i < j;)
        {
            int k = charsequence.charAt(i) - 48;
            if (i + 2 < j)
            {
                bitarray.appendBits(k * 100 + (charsequence.charAt(i + 1) - 48) * 10 + (charsequence.charAt(i + 2) - 48), 10);
                i += 3;
            } else
            if (i + 1 < j)
            {
                bitarray.appendBits(k * 10 + (charsequence.charAt(i + 1) - 48), 7);
                i += 2;
            } else
            {
                bitarray.appendBits(k, 4);
                i++;
            }
        }

    }

    private static int calculateMaskPenalty(ByteMatrix bytematrix)
    {
        return MaskUtil.applyMaskPenaltyRule1(bytematrix) + MaskUtil.applyMaskPenaltyRule2(bytematrix) + MaskUtil.applyMaskPenaltyRule3(bytematrix) + MaskUtil.applyMaskPenaltyRule4(bytematrix);
    }

    private static int chooseMaskPattern(BitArray bitarray, ErrorCorrectionLevel errorcorrectionlevel, Version version, ByteMatrix bytematrix)
        throws WriterException
    {
        int j = 0x7fffffff;
        int l = -1;
        for (int i = 0; i < 8;)
        {
            MatrixUtil.buildMatrix(bitarray, errorcorrectionlevel, version, i, bytematrix);
            int i1 = calculateMaskPenalty(bytematrix);
            int k = j;
            if (i1 < j)
            {
                k = i1;
                l = i;
            }
            i++;
            j = k;
        }

        return l;
    }

    private static Mode chooseMode(String s, String s1)
    {
        if ("Shift_JIS".equals(s1))
        {
            if (isOnlyDoubleByteKanji(s))
            {
                return Mode.KANJI;
            } else
            {
                return Mode.BYTE;
            }
        }
        boolean flag = false;
        boolean flag1 = false;
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9')
            {
                flag = true;
            } else
            if (getAlphanumericCode(c) != -1)
            {
                flag1 = true;
            } else
            {
                return Mode.BYTE;
            }
            i++;
        }
        if (flag1)
        {
            return Mode.ALPHANUMERIC;
        }
        if (flag)
        {
            return Mode.NUMERIC;
        } else
        {
            return Mode.BYTE;
        }
    }

    private static Version chooseVersion(int i, ErrorCorrectionLevel errorcorrectionlevel)
        throws WriterException
    {
        for (int j = 1; j <= 40; j++)
        {
            Version version = Version.getVersionForNumber(j);
            if (version.getTotalCodewords() - version.getECBlocksForLevel(errorcorrectionlevel).getTotalECCodewords() >= (i + 7) / 8)
            {
                return version;
            }
        }

        throw new WriterException("Data too big");
    }

    public static QRCode encode(String s, ErrorCorrectionLevel errorcorrectionlevel, Map map)
        throws WriterException
    {
        Object obj;
        Object obj1;
        BitArray bitarray;
        BitArray bitarray1;
        int i;
        if (map == null)
        {
            map = null;
        } else
        {
            map = (String)map.get(EncodeHintType.CHARACTER_SET);
        }
        obj = map;
        if (map == null)
        {
            obj = "ISO-8859-1";
        }
        map = chooseMode(s, ((String) (obj)));
        obj1 = new BitArray();
        if (map == Mode.BYTE && !"ISO-8859-1".equals(obj))
        {
            CharacterSetECI characterseteci = CharacterSetECI.getCharacterSetECIByName(((String) (obj)));
            if (characterseteci != null)
            {
                appendECI(characterseteci, ((BitArray) (obj1)));
            }
        }
        appendModeInfo(map, ((BitArray) (obj1)));
        bitarray = new BitArray();
        appendBytes(s, map, bitarray, ((String) (obj)));
        obj = chooseVersion(((BitArray) (obj1)).getSize() + map.getCharacterCountBits(Version.getVersionForNumber(1)) + bitarray.getSize(), errorcorrectionlevel);
        obj = chooseVersion(((BitArray) (obj1)).getSize() + map.getCharacterCountBits(((Version) (obj))) + bitarray.getSize(), errorcorrectionlevel);
        bitarray1 = new BitArray();
        bitarray1.appendBitArray(((BitArray) (obj1)));
        if (map == Mode.BYTE)
        {
            i = bitarray.getSizeInBytes();
        } else
        {
            i = s.length();
        }
        appendLengthInfo(i, ((Version) (obj)), map, bitarray1);
        bitarray1.appendBitArray(bitarray);
        s = ((Version) (obj)).getECBlocksForLevel(errorcorrectionlevel);
        i = ((Version) (obj)).getTotalCodewords() - s.getTotalECCodewords();
        terminateBits(i, bitarray1);
        s = interleaveWithECBytes(bitarray1, ((Version) (obj)).getTotalCodewords(), i, s.getNumBlocks());
        obj1 = new QRCode();
        ((QRCode) (obj1)).setECLevel(errorcorrectionlevel);
        ((QRCode) (obj1)).setMode(map);
        ((QRCode) (obj1)).setVersion(((Version) (obj)));
        i = ((Version) (obj)).getDimensionForVersion();
        map = new ByteMatrix(i, i);
        i = chooseMaskPattern(s, errorcorrectionlevel, ((Version) (obj)), map);
        ((QRCode) (obj1)).setMaskPattern(i);
        MatrixUtil.buildMatrix(s, errorcorrectionlevel, ((Version) (obj)), i, map);
        ((QRCode) (obj1)).setMatrix(map);
        return ((QRCode) (obj1));
    }

    private static byte[] generateECBytes(byte abyte0[], int i)
    {
        int l = abyte0.length;
        int ai[] = new int[l + i];
        for (int j = 0; j < l; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        (new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256)).encode(ai, i);
        abyte0 = new byte[i];
        for (int k = 0; k < i; k++)
        {
            abyte0[k] = (byte)ai[l + k];
        }

        return abyte0;
    }

    private static int getAlphanumericCode(int i)
    {
        if (i < ALPHANUMERIC_TABLE.length)
        {
            return ALPHANUMERIC_TABLE[i];
        } else
        {
            return -1;
        }
    }

    private static void getNumDataBytesAndNumECBytesForBlockID(int i, int j, int k, int l, int ai[], int ai1[])
        throws WriterException
    {
        if (l >= k)
        {
            throw new WriterException("Block ID too large");
        }
        int i1 = i % k;
        int j1 = k - i1;
        int k1 = i / k;
        j /= k;
        int l1 = j + 1;
        int i2 = k1 - j;
        k1 = (k1 + 1) - l1;
        if (i2 != k1)
        {
            throw new WriterException("EC bytes mismatch");
        }
        if (k != j1 + i1)
        {
            throw new WriterException("RS blocks mismatch");
        }
        if (i != (j + i2) * j1 + (l1 + k1) * i1)
        {
            throw new WriterException("Total bytes mismatch");
        }
        if (l < j1)
        {
            ai[0] = j;
            ai1[0] = i2;
            return;
        } else
        {
            ai[0] = l1;
            ai1[0] = k1;
            return;
        }
    }

    private static BitArray interleaveWithECBytes(BitArray bitarray, int i, int j, int k)
        throws WriterException
    {
        if (bitarray.getSizeInBytes() != j)
        {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        int k1 = 0;
        int i1 = 0;
        int l = 0;
        ArrayList arraylist = new ArrayList(k);
        for (int j1 = 0; j1 < k; j1++)
        {
            int ai[] = new int[1];
            int ai1[] = new int[1];
            getNumDataBytesAndNumECBytesForBlockID(i, j, k, j1, ai, ai1);
            int l1 = ai[0];
            byte abyte0[] = new byte[l1];
            bitarray.toBytes(k1 * 8, abyte0, 0, l1);
            ai1 = generateECBytes(abyte0, ai1[0]);
            arraylist.add(new BlockPair(abyte0, ai1));
            i1 = Math.max(i1, l1);
            l = Math.max(l, ai1.length);
            k1 += ai[0];
        }

        if (j != k1)
        {
            throw new WriterException("Data bytes does not match offset");
        }
        bitarray = new BitArray();
label0:
        for (j = 0; j < i1; j++)
        {
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                byte abyte1[] = ((BlockPair)iterator.next()).getDataBytes();
                if (j < abyte1.length)
                {
                    bitarray.appendBits(abyte1[j], 8);
                }
            } while (true);
        }

label1:
        for (j = 0; j < l; j++)
        {
            Iterator iterator1 = arraylist.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label1;
                }
                byte abyte2[] = ((BlockPair)iterator1.next()).getErrorCorrectionBytes();
                if (j < abyte2.length)
                {
                    bitarray.appendBits(abyte2[j], 8);
                }
            } while (true);
        }

        if (i != bitarray.getSizeInBytes())
        {
            throw new WriterException((new StringBuilder("Interleaving error: ")).append(i).append(" and ").append(bitarray.getSizeInBytes()).append(" differ.").toString());
        } else
        {
            return bitarray;
        }
    }

    private static boolean isOnlyDoubleByteKanji(String s)
    {
        int i;
        int j;
        int k;
        try
        {
            s = s.getBytes("Shift_JIS");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        j = s.length;
        if (j % 2 == 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                k = s[i] & 0xff;
                if ((k < 129 || k > 159) && (k < 224 || k > 235))
                {
                    break label0;
                }
                i += 2;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static void terminateBits(int i, BitArray bitarray)
        throws WriterException
    {
        int l = i << 3;
        if (bitarray.getSize() > l)
        {
            throw new WriterException((new StringBuilder("data bits cannot fit in the QR Code")).append(bitarray.getSize()).append(" > ").append(l).toString());
        }
        for (int j = 0; j < 4 && bitarray.getSize() < l; j++)
        {
            bitarray.appendBit(false);
        }

        int k = bitarray.getSize() & 7;
        if (k > 0)
        {
            for (; k < 8; k++)
            {
                bitarray.appendBit(false);
            }

        }
        int i1 = bitarray.getSizeInBytes();
        k = 0;
        while (k < i - i1) 
        {
            char c;
            if ((k & 1) == 0)
            {
                c = '\354';
            } else
            {
                c = '\021';
            }
            bitarray.appendBits(c, 8);
            k++;
        }
        if (bitarray.getSize() != l)
        {
            throw new WriterException("Bits size does not equal capacity");
        } else
        {
            return;
        }
    }

}
