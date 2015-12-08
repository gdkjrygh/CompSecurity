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

    private static final int WORD_SIZE[] = {
        4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 
        10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
        10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 
        12, 12, 12
    };

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

    public static AztecCode encode(byte abyte0[], int i, int j)
    {
        Object obj;
        int k;
        int i1;
        int j1;
        boolean flag2;
        BitArray bitarray = (new HighLevelEncoder(abyte0)).encode();
        int i3 = (bitarray.getSize() * i) / 100 + 11;
        int l3 = bitarray.getSize();
        if (j != 0)
        {
            int l1;
            boolean flag;
            if (j < 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = Math.abs(j);
            if (flag)
            {
                i = 4;
            } else
            {
                i = 32;
            }
            if (l1 > i)
            {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[] {
                    Integer.valueOf(j)
                }));
            }
            i = totalBitsInLayer(l1, flag);
            j = WORD_SIZE[l1];
            abyte0 = stuffBits(bitarray, j);
            if (abyte0.getSize() + i3 > i - i % j)
            {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            flag2 = flag;
            i1 = l1;
            obj = abyte0;
            k = i;
            j1 = j;
            if (flag)
            {
                flag2 = flag;
                i1 = l1;
                obj = abyte0;
                k = i;
                j1 = j;
                if (abyte0.getSize() > j << 6)
                {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
            break MISSING_BLOCK_LABEL_381;
        }
        k = 0;
        abyte0 = null;
        j = 0;
        do
        {
label0:
            {
                if (j > 32)
                {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                int i2;
                boolean flag1;
                if (j <= 3)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    i1 = j + 1;
                } else
                {
                    i1 = j;
                }
                i2 = totalBitsInLayer(i1, flag1);
                obj = abyte0;
                j1 = k;
                if (l3 + i3 > i2)
                {
                    break label0;
                }
                i = k;
                if (k != WORD_SIZE[i1])
                {
                    i = WORD_SIZE[i1];
                    abyte0 = stuffBits(bitarray, i);
                }
                if (flag1)
                {
                    obj = abyte0;
                    j1 = i;
                    if (abyte0.getSize() > i << 6)
                    {
                        break label0;
                    }
                }
                flag2 = flag1;
                obj = abyte0;
                k = i2;
                j1 = i;
                if (abyte0.getSize() + i3 <= i2 - i2 % i)
                {
                    break MISSING_BLOCK_LABEL_381;
                }
                j1 = i;
                obj = abyte0;
            }
            j++;
            abyte0 = ((byte []) (obj));
            k = j1;
        } while (true);
        abyte0 = generateCheckWords(((BitArray) (obj)), k, j1);
        int j4 = ((BitArray) (obj)).getSize() / j1;
        BitArray bitarray1 = generateModeMessage(flag2, i1, j4);
        int ai[];
        if (flag2)
        {
            i = (i1 << 2) + 11;
        } else
        {
            i = (i1 << 2) + 14;
        }
        ai = new int[i];
        if (flag2)
        {
            k = i;
            j1 = 0;
            do
            {
                j = k;
                if (j1 >= ai.length)
                {
                    break;
                }
                ai[j1] = j1;
                j1++;
            } while (true);
        } else
        {
            j1 = i + 1 + ((i / 2 - 1) / 15) * 2;
            int j2 = i / 2;
            int j3 = j1 / 2;
            k = 0;
            do
            {
                j = j1;
                if (k >= j2)
                {
                    break;
                }
                j = k + k / 15;
                ai[j2 - k - 1] = j3 - j - 1;
                ai[j2 + k] = j3 + j + 1;
                k++;
            } while (true);
        }
        obj = new BitMatrix(j);
        k = 0;
        j1 = 0;
        for (; k < i1; k++)
        {
            int k2;
            int k3;
            if (flag2)
            {
                k2 = (i1 - k << 2) + 9;
            } else
            {
                k2 = (i1 - k << 2) + 12;
            }
            for (k3 = 0; k3 < k2; k3++)
            {
                int k4 = k3 << 1;
                for (int i4 = 0; i4 < 2; i4++)
                {
                    if (abyte0.get(j1 + k4 + i4))
                    {
                        ((BitMatrix) (obj)).set(ai[(k << 1) + i4], ai[(k << 1) + k3]);
                    }
                    if (abyte0.get((k2 << 1) + j1 + k4 + i4))
                    {
                        ((BitMatrix) (obj)).set(ai[(k << 1) + k3], ai[i - 1 - (k << 1) - i4]);
                    }
                    if (abyte0.get((k2 << 2) + j1 + k4 + i4))
                    {
                        ((BitMatrix) (obj)).set(ai[i - 1 - (k << 1) - i4], ai[i - 1 - (k << 1) - k3]);
                    }
                    if (abyte0.get(k2 * 6 + j1 + k4 + i4))
                    {
                        ((BitMatrix) (obj)).set(ai[i - 1 - (k << 1) - k3], ai[(k << 1) + i4]);
                    }
                }

            }

            j1 += k2 << 3;
        }

        drawModeMessage(((BitMatrix) (obj)), flag2, j, bitarray1);
        if (flag2)
        {
            drawBullsEye(((BitMatrix) (obj)), j / 2, 5);
        } else
        {
            drawBullsEye(((BitMatrix) (obj)), j / 2, 7);
            int k1 = 0;
            int l = 0;
            while (k1 < i / 2 - 1) 
            {
                for (int l2 = j / 2 & 1; l2 < j; l2 += 2)
                {
                    ((BitMatrix) (obj)).set(j / 2 - l, l2);
                    ((BitMatrix) (obj)).set(j / 2 + l, l2);
                    ((BitMatrix) (obj)).set(l2, j / 2 - l);
                    ((BitMatrix) (obj)).set(l2, j / 2 + l);
                }

                k1 += 15;
                l += 16;
            }
        }
        abyte0 = new AztecCode();
        abyte0.setCompact(flag2);
        abyte0.setSize(j);
        abyte0.setLayers(i1);
        abyte0.setCodeWords(j4);
        abyte0.setMatrix(((BitMatrix) (obj)));
        return abyte0;
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

    private static BitArray generateModeMessage(boolean flag, int i, int j)
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

    private static BitArray stuffBits(BitArray bitarray, int i)
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
