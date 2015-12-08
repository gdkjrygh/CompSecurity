// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            HighLevelEncoder, AztecCode

public final class Encoder
{

    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int WORD_SIZE[] = {
        4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 
        10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
        10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 
        12, 12, 12
    };

    private Encoder()
    {
    }

    private static int[] bitsToWords(BitArray bitarray, int i, int j)
    {
        int ai[] = new int[j];
        j = 0;
        for (int j1 = bitarray.getSize() / i; j < j1; j++)
        {
            int l = 0;
            int k = 0;
            while (k < i) 
            {
                int i1;
                if (bitarray.get(j * i + k))
                {
                    i1 = 1 << i - k - 1;
                } else
                {
                    i1 = 0;
                }
                l |= i1;
                k++;
            }
            ai[j] = l;
        }

        return ai;
    }

    private static void drawBullsEye(BitMatrix bitmatrix, int i, int j)
    {
        for (int k = 0; k < j; k += 2)
        {
            for (int l = i - k; l <= i + k; l++)
            {
                bitmatrix.set(l, i - k);
                bitmatrix.set(l, i + k);
                bitmatrix.set(i - k, l);
                bitmatrix.set(i + k, l);
            }

        }

        bitmatrix.set(i - j, i - j);
        bitmatrix.set((i - j) + 1, i - j);
        bitmatrix.set(i - j, (i - j) + 1);
        bitmatrix.set(i + j, i - j);
        bitmatrix.set(i + j, (i - j) + 1);
        bitmatrix.set(i + j, (i + j) - 1);
    }

    private static void drawModeMessage(BitMatrix bitmatrix, boolean flag, int i, BitArray bitarray)
    {
        int j = i / 2;
        if (flag)
        {
            for (i = 0; i < 7; i++)
            {
                int k = (j - 3) + i;
                if (bitarray.get(i))
                {
                    bitmatrix.set(k, j - 5);
                }
                if (bitarray.get(i + 7))
                {
                    bitmatrix.set(j + 5, k);
                }
                if (bitarray.get(20 - i))
                {
                    bitmatrix.set(k, j + 5);
                }
                if (bitarray.get(27 - i))
                {
                    bitmatrix.set(j - 5, k);
                }
            }

        } else
        {
            for (i = 0; i < 10; i++)
            {
                int l = (j - 5) + i + i / 5;
                if (bitarray.get(i))
                {
                    bitmatrix.set(l, j - 7);
                }
                if (bitarray.get(i + 10))
                {
                    bitmatrix.set(j + 7, l);
                }
                if (bitarray.get(29 - i))
                {
                    bitmatrix.set(l, j + 7);
                }
                if (bitarray.get(39 - i))
                {
                    bitmatrix.set(j - 7, l);
                }
            }

        }
    }

    public static AztecCode encode(byte abyte0[])
    {
        return encode(abyte0, 33, 0);
    }

    public static AztecCode encode(byte abyte0[], int i, int j)
    {
        BitArray bitarray1;
        int k;
        int i1;
        int l3;
        int l4;
        boolean flag2;
        bitarray1 = (new HighLevelEncoder(abyte0)).encode();
        l4 = (bitarray1.getSize() * i) / 100 + 11;
        l3 = bitarray1.getSize();
        if (j != 0)
        {
            int l;
            boolean flag;
            if (j < 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = Math.abs(j);
            if (flag)
            {
                i = 4;
            } else
            {
                i = 32;
            }
            if (l > i)
            {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[] {
                    Integer.valueOf(j)
                }));
            }
            int j2 = totalBitsInLayer(l, flag);
            l3 = WORD_SIZE[l];
            BitArray bitarray = stuffBits(bitarray1, l3);
            if (bitarray.getSize() + l4 > j2 - j2 % l3)
            {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            flag2 = flag;
            k = l;
            abyte0 = bitarray;
            j = j2;
            i = l3;
            if (flag)
            {
                flag2 = flag;
                k = l;
                abyte0 = bitarray;
                j = j2;
                i = l3;
                if (bitarray.getSize() > l3 * 64)
                {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
            break MISSING_BLOCK_LABEL_374;
        }
        i1 = 0;
        abyte0 = null;
        j = 0;
_L3:
        byte abyte1[];
        int k2;
        boolean flag1;
        if (j > 32)
        {
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        if (j <= 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            k = j + 1;
        } else
        {
            k = j;
        }
        k2 = totalBitsInLayer(k, flag1);
        if (l3 + l4 <= k2) goto _L2; else goto _L1
_L1:
        abyte1 = abyte0;
_L5:
        j++;
        abyte0 = abyte1;
          goto _L3
_L2:
        i = i1;
        if (i1 != WORD_SIZE[k])
        {
            i = WORD_SIZE[k];
            abyte0 = stuffBits(bitarray1, i);
        }
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte1 = abyte0;
        i1 = i;
        if (abyte0.getSize() > i * 64) goto _L5; else goto _L4
_L4:
        abyte1 = abyte0;
        i1 = i;
        if (abyte0.getSize() + l4 > k2 - k2 % i) goto _L5; else goto _L6
_L6:
        j = k2;
        flag2 = flag1;
        Object obj = generateCheckWords(abyte0, j, i);
        int l5 = abyte0.getSize() / i;
        BitArray bitarray2 = generateModeMessage(flag2, k, l5);
        int ai[];
        if (flag2)
        {
            i = k * 4 + 11;
        } else
        {
            i = k * 4 + 14;
        }
        ai = new int[i];
        if (flag2)
        {
            int j1 = i;
            int l2 = 0;
            do
            {
                j = j1;
                if (l2 >= ai.length)
                {
                    break;
                }
                ai[l2] = l2;
                l2++;
            } while (true);
        } else
        {
            int i3 = i + 1 + ((i / 2 - 1) / 15) * 2;
            int i4 = i / 2;
            int i5 = i3 / 2;
            int k1 = 0;
            do
            {
                j = i3;
                if (k1 >= i4)
                {
                    break;
                }
                j = k1 + k1 / 15;
                ai[i4 - k1 - 1] = i5 - j - 1;
                ai[i4 + k1] = i5 + j + 1;
                k1++;
            } while (true);
        }
        abyte0 = new BitMatrix(j);
        int l1 = 0;
        int j3 = 0;
        for (; l1 < k; l1++)
        {
            int j4;
            int j5;
            if (flag2)
            {
                j4 = (k - l1) * 4 + 9;
            } else
            {
                j4 = (k - l1) * 4 + 12;
            }
            for (j5 = 0; j5 < j4; j5++)
            {
                int i6 = j5 * 2;
                for (int k5 = 0; k5 < 2; k5++)
                {
                    if (((BitArray) (obj)).get(j3 + i6 + k5))
                    {
                        abyte0.set(ai[l1 * 2 + k5], ai[l1 * 2 + j5]);
                    }
                    if (((BitArray) (obj)).get(j4 * 2 + j3 + i6 + k5))
                    {
                        abyte0.set(ai[l1 * 2 + j5], ai[i - 1 - l1 * 2 - k5]);
                    }
                    if (((BitArray) (obj)).get(j4 * 4 + j3 + i6 + k5))
                    {
                        abyte0.set(ai[i - 1 - l1 * 2 - k5], ai[i - 1 - l1 * 2 - j5]);
                    }
                    if (((BitArray) (obj)).get(j4 * 6 + j3 + i6 + k5))
                    {
                        abyte0.set(ai[i - 1 - l1 * 2 - j5], ai[l1 * 2 + k5]);
                    }
                }

            }

            j3 += j4 * 8;
        }

        drawModeMessage(abyte0, flag2, j, bitarray2);
        if (flag2)
        {
            drawBullsEye(abyte0, j / 2, 5);
        } else
        {
            drawBullsEye(abyte0, j / 2, 7);
            int k3 = 0;
            int i2 = 0;
            while (k3 < i / 2 - 1) 
            {
                for (int k4 = j / 2 & 1; k4 < j; k4 += 2)
                {
                    abyte0.set(j / 2 - i2, k4);
                    abyte0.set(j / 2 + i2, k4);
                    abyte0.set(k4, j / 2 - i2);
                    abyte0.set(k4, j / 2 + i2);
                }

                k3 += 15;
                i2 += 16;
            }
        }
        obj = new AztecCode();
        ((AztecCode) (obj)).setCompact(flag2);
        ((AztecCode) (obj)).setSize(j);
        ((AztecCode) (obj)).setLayers(k);
        ((AztecCode) (obj)).setCodeWords(l5);
        ((AztecCode) (obj)).setMatrix(abyte0);
        return ((AztecCode) (obj));
    }

    private static BitArray generateCheckWords(BitArray bitarray, int i, int j)
    {
        int k = bitarray.getSize() / j;
        Object obj = new ReedSolomonEncoder(getGF(j));
        int l = i / j;
        bitarray = bitsToWords(bitarray, j, l);
        ((ReedSolomonEncoder) (obj)).encode(bitarray, l - k);
        obj = new BitArray();
        ((BitArray) (obj)).appendBits(0, i % j);
        k = bitarray.length;
        for (i = 0; i < k; i++)
        {
            ((BitArray) (obj)).appendBits(bitarray[i], j);
        }

        return ((BitArray) (obj));
    }

    static BitArray generateModeMessage(boolean flag, int i, int j)
    {
        BitArray bitarray = new BitArray();
        if (flag)
        {
            bitarray.appendBits(i - 1, 2);
            bitarray.appendBits(j - 1, 6);
            return generateCheckWords(bitarray, 28, 4);
        } else
        {
            bitarray.appendBits(i - 1, 5);
            bitarray.appendBits(j - 1, 11);
            return generateCheckWords(bitarray, 40, 4);
        }
    }

    private static GenericGF getGF(int i)
    {
        switch (i)
        {
        case 5: // '\005'
        case 7: // '\007'
        case 9: // '\t'
        case 11: // '\013'
        default:
            return null;

        case 4: // '\004'
            return GenericGF.AZTEC_PARAM;

        case 6: // '\006'
            return GenericGF.AZTEC_DATA_6;

        case 8: // '\b'
            return GenericGF.AZTEC_DATA_8;

        case 10: // '\n'
            return GenericGF.AZTEC_DATA_10;

        case 12: // '\f'
            return GenericGF.AZTEC_DATA_12;
        }
    }

    static BitArray stuffBits(BitArray bitarray, int i)
    {
        BitArray bitarray1 = new BitArray();
        int j1 = bitarray.getSize();
        int k1 = (1 << i) - 2;
        int j = 0;
        do
        {
            if (j >= j1)
            {
                break;
            }
            int l = 0;
            for (int k = 0; k < i;)
            {
                int i1;
label0:
                {
                    if (j + k < j1)
                    {
                        i1 = l;
                        if (!bitarray.get(j + k))
                        {
                            break label0;
                        }
                    }
                    i1 = l | 1 << i - 1 - k;
                }
                k++;
                l = i1;
            }

            if ((l & k1) == k1)
            {
                bitarray1.appendBits(l & k1, i);
                j--;
            } else
            if ((l & k1) == 0)
            {
                bitarray1.appendBits(l | 1, i);
                j--;
            } else
            {
                bitarray1.appendBits(l, i);
            }
            j += i;
        } while (true);
        return bitarray1;
    }

    private static int totalBitsInLayer(int i, boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 88;
        } else
        {
            byte0 = 112;
        }
        return (byte0 + i * 16) * i;
    }

}
