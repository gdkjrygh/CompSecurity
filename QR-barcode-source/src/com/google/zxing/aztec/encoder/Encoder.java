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

    static final boolean $assertionsDisabled;
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
        int j1 = bitarray.getSize() / i;
        for (j = 0; j < j1; j++)
        {
            int k = 0;
            int l = 0;
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
        boolean flag2 = false;
        boolean flag1 = false;
        int l = i / 2;
        i = ((flag2) ? 1 : 0);
        if (flag)
        {
            for (i = ((flag1) ? 1 : 0); i < 7; i++)
            {
                int j = (l - 3) + i;
                if (bitarray.get(i))
                {
                    bitmatrix.set(j, l - 5);
                }
                if (bitarray.get(i + 7))
                {
                    bitmatrix.set(l + 5, j);
                }
                if (bitarray.get(20 - i))
                {
                    bitmatrix.set(j, l + 5);
                }
                if (bitarray.get(27 - i))
                {
                    bitmatrix.set(l - 5, j);
                }
            }

        } else
        {
            for (; i < 10; i++)
            {
                int k = (l - 5) + i + i / 5;
                if (bitarray.get(i))
                {
                    bitmatrix.set(k, l - 7);
                }
                if (bitarray.get(i + 10))
                {
                    bitmatrix.set(l + 7, k);
                }
                if (bitarray.get(29 - i))
                {
                    bitmatrix.set(k, l + 7);
                }
                if (bitarray.get(39 - i))
                {
                    bitmatrix.set(l - 7, k);
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
        BitArray bitarray;
        int k2;
        int i3;
        bitarray = (new HighLevelEncoder(abyte0)).encode();
        k2 = (bitarray.getSize() * i) / 100 + 11;
        i3 = bitarray.getSize();
        if (j == 0) goto _L2; else goto _L1
_L1:
        int k;
        boolean flag;
        int l;
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
        k = totalBitsInLayer(l, flag);
        i = WORD_SIZE[l];
        abyte0 = stuffBits(bitarray, i);
        if (abyte0.getSize() + k2 > k - k % i)
        {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (flag && abyte0.getSize() > i * 64)
        {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        j = l;
_L11:
        Object obj;
        int ai[];
        int k3;
        obj = generateCheckWords(abyte0, k, i);
        k3 = abyte0.getSize() / i;
        bitarray = generateModeMessage(flag, j, k3);
        int i1;
        int l1;
        if (flag)
        {
            i = j * 4 + 11;
        } else
        {
            i = j * 4 + 14;
        }
        ai = new int[i];
        if (!flag) goto _L4; else goto _L3
_L2:
        k = 0;
        abyte0 = null;
        j = 0;
_L7:
        if (j > 32)
        {
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        if (j <= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = j + 1;
        } else
        {
            i1 = j;
        }
        l1 = totalBitsInLayer(i1, flag);
        if (i3 + k2 <= l1) goto _L6; else goto _L5
_L5:
        obj = abyte0;
_L9:
        j++;
        abyte0 = ((byte []) (obj));
          goto _L7
_L6:
        i = k;
        if (k != WORD_SIZE[i1])
        {
            i = WORD_SIZE[i1];
            abyte0 = stuffBits(bitarray, i);
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        k = i;
        if (abyte0.getSize() > i * 64) goto _L9; else goto _L8
_L8:
        obj = abyte0;
        k = i;
        if (abyte0.getSize() + k2 > l1 - l1 % i) goto _L9; else goto _L10
_L10:
        j = i1;
        k = l1;
          goto _L11
_L3:
        for (k = 0; k < ai.length; k++)
        {
            ai[k] = k;
        }

        k = i;
_L17:
        int j1;
        int i2;
        abyte0 = new BitMatrix(k);
        i2 = 0;
        j1 = 0;
_L15:
        if (j1 >= j)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        int j3;
        int l3;
        if (flag)
        {
            k2 = (j - j1) * 4 + 9;
        } else
        {
            k2 = (j - j1) * 4 + 12;
        }
        i3 = 0;
_L13:
        if (i3 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        l3 = i3 * 2;
        for (j3 = 0; j3 < 2; j3++)
        {
            if (((BitArray) (obj)).get(i2 + l3 + j3))
            {
                abyte0.set(ai[j1 * 2 + j3], ai[j1 * 2 + i3]);
            }
            if (((BitArray) (obj)).get(k2 * 2 + i2 + l3 + j3))
            {
                abyte0.set(ai[j1 * 2 + i3], ai[i - 1 - j1 * 2 - j3]);
            }
            if (((BitArray) (obj)).get(k2 * 4 + i2 + l3 + j3))
            {
                abyte0.set(ai[i - 1 - j1 * 2 - j3], ai[i - 1 - j1 * 2 - i3]);
            }
            if (((BitArray) (obj)).get(k2 * 6 + i2 + l3 + j3))
            {
                abyte0.set(ai[i - 1 - j1 * 2 - i3], ai[j1 * 2 + j3]);
            }
        }

        i3++;
        continue; /* Loop/switch isn't completed */
_L4:
        i2 = i + 1 + ((i / 2 - 1) / 15) * 2;
        k2 = i / 2;
        i3 = i2 / 2;
        j1 = 0;
        do
        {
            k = i2;
            if (j1 >= k2)
            {
                continue; /* Loop/switch isn't completed */
            }
            k = j1 / 15 + j1;
            ai[k2 - j1 - 1] = i3 - k - 1;
            ai[k2 + j1] = k + i3 + 1;
            j1++;
        } while (true);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L13; else goto _L12
_L12:
        i2 = k2 * 8 + i2;
        j1++;
        if (true) goto _L15; else goto _L14
_L14:
        drawModeMessage(abyte0, flag, k, bitarray);
        AztecCode azteccode;
        if (flag)
        {
            drawBullsEye(abyte0, k / 2, 5);
        } else
        {
            drawBullsEye(abyte0, k / 2, 7);
            int j2 = 0;
            int k1 = 0;
            while (j2 < i / 2 - 1) 
            {
                for (int l2 = k / 2 & 1; l2 < k; l2 += 2)
                {
                    abyte0.set(k / 2 - k1, l2);
                    abyte0.set(k / 2 + k1, l2);
                    abyte0.set(l2, k / 2 - k1);
                    abyte0.set(l2, k / 2 + k1);
                }

                j2 += 15;
                k1 += 16;
            }
        }
        azteccode = new AztecCode();
        azteccode.setCompact(flag);
        azteccode.setSize(k);
        azteccode.setLayers(j);
        azteccode.setCodeWords(k3);
        azteccode.setMatrix(abyte0);
        return azteccode;
        if (true) goto _L17; else goto _L16
_L16:
    }

    private static BitArray generateCheckWords(BitArray bitarray, int i, int j)
    {
        boolean flag = false;
        if (!$assertionsDisabled && bitarray.getSize() % j != 0)
        {
            throw new AssertionError();
        }
        int k = bitarray.getSize() / j;
        Object obj = new ReedSolomonEncoder(getGF(j));
        int l = i / j;
        bitarray = bitsToWords(bitarray, j, l);
        ((ReedSolomonEncoder) (obj)).encode(bitarray, l - k);
        obj = new BitArray();
        ((BitArray) (obj)).appendBits(0, i % j);
        k = bitarray.length;
        for (i = ((flag) ? 1 : 0); i < k; i++)
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
            int k = 0;
            int l;
            int i1;
            for (l = 0; k < i; l = i1)
            {
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

    static 
    {
        boolean flag;
        if (!com/google/zxing/aztec/encoder/Encoder.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
