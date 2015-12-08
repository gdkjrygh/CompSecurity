// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDReader

public final class Code128Reader extends OneDReader
{

    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int CODE_PATTERNS[][];
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final int MAX_AVG_VARIANCE = 64;
    private static final int MAX_INDIVIDUAL_VARIANCE = 179;

    public Code128Reader()
    {
    }

    private static int decodeCode(BitArray bitarray, int ai[], int i)
        throws NotFoundException
    {
        recordPattern(bitarray, i, ai);
        int j = 64;
        int l = -1;
        for (i = 0; i < CODE_PATTERNS.length;)
        {
            int i1 = patternMatchVariance(ai, CODE_PATTERNS[i], 179);
            int k = j;
            if (i1 < j)
            {
                k = i1;
                l = i;
            }
            i++;
            j = k;
        }

        if (l >= 0)
        {
            return l;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private static int[] findStartPattern(BitArray bitarray)
        throws NotFoundException
    {
        int l1 = bitarray.getSize();
        int k = bitarray.getNextSet(0);
        int l = 0;
        int ai[] = new int[6];
        int i = k;
        boolean flag = false;
        int i2 = ai.length;
        while (k < l1) 
        {
            int j;
            if (bitarray.get(k) ^ flag)
            {
                ai[l] = ai[l] + 1;
                j = l;
            } else
            {
                if (l == i2 - 1)
                {
                    int i1 = 64;
                    byte byte0 = -1;
                    for (j = 103; j <= 105;)
                    {
                        int k1 = patternMatchVariance(ai, CODE_PATTERNS[j], 179);
                        int j1 = i1;
                        if (k1 < i1)
                        {
                            j1 = k1;
                            byte0 = j;
                        }
                        j++;
                        i1 = j1;
                    }

                    if (byte0 >= 0 && bitarray.isRange(Math.max(0, i - (k - i) / 2), i, false))
                    {
                        return (new int[] {
                            i, k, byte0
                        });
                    }
                    i += ai[0] + ai[1];
                    System.arraycopy(ai, 2, ai, 0, i2 - 2);
                    ai[i2 - 2] = 0;
                    ai[i2 - 1] = 0;
                    j = l - 1;
                } else
                {
                    j = l + 1;
                }
                ai[j] = 1;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            k++;
            l = j;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, FormatException, ChecksumException
    {
        int ai[];
        boolean flag3;
        int i4;
        if (map != null && map.containsKey(DecodeHintType.ASSUME_GS1))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        ai = findStartPattern(bitarray);
        i4 = ai[2];
        map = new ArrayList(20);
        map.add(Byte.valueOf((byte)i4));
        i4;
        JVM INSTR tableswitch 103 105: default 84
    //                   103 94
    //                   104 275
    //                   105 282;
           goto _L1 _L2 _L3 _L4
_L1:
        throw FormatException.getFormatInstance();
_L2:
        int j = 101;
_L26:
        Object obj;
        int ai1[];
        byte byte0;
        int k1;
        int l1;
        boolean flag2;
        int i2;
        boolean flag5;
        int j3;
        int k3;
        int l3;
        flag5 = false;
        flag2 = false;
        obj = new StringBuilder(20);
        k3 = ai[0];
        k1 = ai[1];
        ai1 = new int[6];
        l3 = 0;
        i2 = 0;
        j3 = 0;
        l1 = 1;
        byte0 = j;
_L14:
        boolean flag6 = flag2;
        if (flag5) goto _L6; else goto _L5
_L5:
        int l;
        boolean flag4;
        int j2;
        int k2;
        int l2;
        int i3;
        int j4;
        flag2 = false;
        flag4 = i2;
        j4 = decodeCode(bitarray, ai1, k1);
        map.add(Byte.valueOf((byte)j4));
        l = l1;
        if (j4 != 106)
        {
            l = 1;
        }
        k2 = i4;
        j2 = j3;
        if (j4 != 106)
        {
            j2 = j3 + 1;
            k2 = i4 + j2 * j4;
        }
        l2 = k1;
        int j1 = ai1.length;
        j = 0;
        i3 = k1;
        for (; j < j1; j++)
        {
            i3 += ai1[j];
        }

          goto _L7
_L3:
        j = 100;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 99;
        continue; /* Loop/switch isn't completed */
_L7:
        j4;
        JVM INSTR tableswitch 103 105: default 316
    //                   103 451
    //                   104 451
    //                   105 451;
           goto _L8 _L9 _L9 _L9
_L8:
        byte0;
        JVM INSTR tableswitch 99 101: default 344
    //                   99 1088
    //                   100 788
    //                   101 455;
           goto _L10 _L11 _L12 _L13
_L10:
        boolean flag;
        boolean flag1;
        flag1 = flag2;
        flag = flag5;
        j = byte0;
_L17:
        i4 = k2;
        i2 = j4;
        byte0 = j;
        flag5 = flag;
        flag2 = flag1;
        l1 = l;
        l3 = ((flag4) ? 1 : 0);
        k3 = l2;
        j3 = j2;
        k1 = i3;
        if (flag6)
        {
            if (j == 101)
            {
                byte0 = 100;
            } else
            {
                byte0 = 101;
            }
            i4 = k2;
            i2 = j4;
            flag5 = flag;
            flag2 = flag1;
            l1 = l;
            l3 = ((flag4) ? 1 : 0);
            k3 = l2;
            j3 = j2;
            k1 = i3;
        }
          goto _L14
_L9:
        throw FormatException.getFormatInstance();
_L13:
        if (j4 >= 64) goto _L16; else goto _L15
_L15:
        ((StringBuilder) (obj)).append((char)(j4 + 32));
        j = byte0;
        flag = flag5;
        flag1 = flag2;
          goto _L17
_L16:
        if (j4 >= 96) goto _L19; else goto _L18
_L18:
        ((StringBuilder) (obj)).append((char)(j4 - 64));
        j = byte0;
        flag = flag5;
        flag1 = flag2;
          goto _L17
_L19:
        k1 = l;
        if (j4 != 106)
        {
            k1 = 0;
        }
        j = byte0;
        flag = flag5;
        flag1 = flag2;
        l = k1;
        switch (j4)
        {
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        default:
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            break;

        case 98: // 'b'
            flag1 = true;
            j = 100;
            flag = flag5;
            l = k1;
            break;

        case 102: // 'f'
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            if (flag3)
            {
                if (((StringBuilder) (obj)).length() == 0)
                {
                    ((StringBuilder) (obj)).append("]C1");
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    l = k1;
                } else
                {
                    ((StringBuilder) (obj)).append('\035');
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    l = k1;
                }
            }
            break;

        case 100: // 'd'
            j = 100;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            break;

        case 99: // 'c'
            j = 99;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            break;

        case 106: // 'j'
            flag = true;
            j = byte0;
            flag1 = flag2;
            l = k1;
            break;

        case 96: // '`'
        case 97: // 'a'
        case 101: // 'e'
            break;
        }
        if (true) goto _L17; else goto _L20
_L20:
_L12:
        if (j4 >= 96) goto _L22; else goto _L21
_L21:
        ((StringBuilder) (obj)).append((char)(j4 + 32));
        j = byte0;
        flag = flag5;
        flag1 = flag2;
          goto _L17
_L22:
        k1 = l;
        if (j4 != 106)
        {
            k1 = 0;
        }
        j = byte0;
        flag = flag5;
        flag1 = flag2;
        l = k1;
        switch (j4)
        {
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        default:
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            break;

        case 98: // 'b'
            flag1 = true;
            j = 101;
            flag = flag5;
            l = k1;
            break;

        case 102: // 'f'
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            if (flag3)
            {
                if (((StringBuilder) (obj)).length() == 0)
                {
                    ((StringBuilder) (obj)).append("]C1");
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    l = k1;
                } else
                {
                    ((StringBuilder) (obj)).append('\035');
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    l = k1;
                }
            }
            break;

        case 101: // 'e'
            j = 101;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            break;

        case 99: // 'c'
            j = 99;
            flag = flag5;
            flag1 = flag2;
            l = k1;
            break;

        case 106: // 'j'
            flag = true;
            j = byte0;
            flag1 = flag2;
            l = k1;
            break;

        case 96: // '`'
        case 97: // 'a'
        case 100: // 'd'
            break;
        }
        if (true) goto _L17; else goto _L23
_L23:
_L11:
        if (j4 < 100)
        {
            if (j4 < 10)
            {
                ((StringBuilder) (obj)).append('0');
            }
            ((StringBuilder) (obj)).append(j4);
            j = byte0;
            flag = flag5;
            flag1 = flag2;
        } else
        {
            k1 = l;
            if (j4 != 106)
            {
                k1 = 0;
            }
            switch (j4)
            {
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
            default:
                j = byte0;
                flag = flag5;
                flag1 = flag2;
                l = k1;
                break;

            case 100: // 'd'
                j = 100;
                flag = flag5;
                flag1 = flag2;
                l = k1;
                break;

            case 102: // 'f'
                j = byte0;
                flag = flag5;
                flag1 = flag2;
                l = k1;
                if (flag3)
                {
                    if (((StringBuilder) (obj)).length() == 0)
                    {
                        ((StringBuilder) (obj)).append("]C1");
                        j = byte0;
                        flag = flag5;
                        flag1 = flag2;
                        l = k1;
                    } else
                    {
                        ((StringBuilder) (obj)).append('\035');
                        j = byte0;
                        flag = flag5;
                        flag1 = flag2;
                        l = k1;
                    }
                }
                break;

            case 101: // 'e'
                j = 101;
                flag = flag5;
                flag1 = flag2;
                l = k1;
                break;

            case 106: // 'j'
                flag = true;
                j = byte0;
                flag1 = flag2;
                l = k1;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L17
_L6:
        int k = bitarray.getNextUnset(k1);
        if (!bitarray.isRange(k, Math.min(bitarray.getSize(), (k - k3) / 2 + k), false))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if ((i4 - j3 * l3) % 103 != l3)
        {
            throw ChecksumException.getChecksumInstance();
        }
        k = ((StringBuilder) (obj)).length();
        if (k == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f;
        float f1;
        float f2;
        int i1;
        if (k > 0 && l1 != 0)
        {
            if (byte0 == 99)
            {
                ((StringBuilder) (obj)).delete(k - 2, k);
            } else
            {
                ((StringBuilder) (obj)).delete(k - 1, k);
            }
        }
        f = (float)(ai[1] + ai[0]) / 2.0F;
        f1 = k3;
        f2 = (float)(k1 - k3) / 2.0F;
        i1 = map.size();
        bitarray = new byte[i1];
        for (k = 0; k < i1; k++)
        {
            bitarray[k] = ((Byte)map.get(k)).byteValue();
        }

        map = ((StringBuilder) (obj)).toString();
        obj = new ResultPoint(f, i);
        ResultPoint resultpoint = new ResultPoint(f1 + f2, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODE_128;
        return new Result(map, bitarray, new ResultPoint[] {
            obj, resultpoint
        }, barcodeformat);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L17; else goto _L24
_L24:
        if (true) goto _L26; else goto _L25
_L25:
    }

    static 
    {
        int ai[] = {
            1, 3, 1, 2, 2, 2
        };
        int ai1[] = {
            1, 2, 2, 2, 1, 3
        };
        int ai2[] = {
            2, 3, 1, 2, 1, 2
        };
        int ai3[] = {
            1, 1, 2, 2, 3, 2
        };
        int ai4[] = {
            1, 2, 2, 2, 3, 1
        };
        int ai5[] = {
            2, 2, 1, 1, 3, 2
        };
        int ai6[] = {
            2, 1, 3, 2, 1, 2
        };
        int ai7[] = {
            3, 2, 2, 2, 1, 1
        };
        int ai8[] = {
            2, 3, 2, 1, 2, 1
        };
        int ai9[] = {
            1, 1, 1, 3, 2, 3
        };
        int ai10[] = {
            1, 3, 1, 1, 2, 3
        };
        int ai11[] = {
            1, 3, 1, 3, 2, 1
        };
        int ai12[] = {
            2, 3, 1, 1, 1, 3
        };
        int ai13[] = {
            1, 1, 2, 1, 3, 3
        };
        int ai14[] = {
            1, 3, 2, 1, 3, 1
        };
        int ai15[] = {
            1, 1, 3, 3, 2, 1
        };
        int ai16[] = {
            2, 1, 1, 3, 3, 1
        };
        int ai17[] = {
            3, 1, 1, 3, 2, 1
        };
        int ai18[] = {
            4, 3, 1, 1, 1, 1
        };
        int ai19[] = {
            1, 1, 1, 4, 2, 2
        };
        int ai20[] = {
            1, 2, 1, 4, 2, 1
        };
        int ai21[] = {
            1, 1, 2, 2, 1, 4
        };
        int ai22[] = {
            2, 4, 1, 2, 1, 1
        };
        int ai23[] = {
            2, 4, 1, 1, 1, 2
        };
        int ai24[] = {
            1, 2, 1, 1, 4, 2
        };
        int ai25[] = {
            1, 2, 4, 1, 1, 2
        };
        int ai26[] = {
            1, 2, 4, 2, 1, 1
        };
        int ai27[] = {
            4, 1, 1, 2, 1, 2
        };
        int ai28[] = {
            4, 2, 1, 1, 1, 2
        };
        int ai29[] = {
            4, 2, 1, 2, 1, 1
        };
        int ai30[] = {
            2, 1, 4, 1, 2, 1
        };
        int ai31[] = {
            4, 1, 2, 1, 2, 1
        };
        int ai32[] = {
            1, 1, 1, 3, 4, 1
        };
        int ai33[] = {
            1, 3, 1, 1, 4, 1
        };
        int ai34[] = {
            1, 1, 4, 1, 1, 3
        };
        int ai35[] = {
            4, 1, 1, 1, 1, 3
        };
        int ai36[] = {
            4, 1, 1, 3, 1, 1
        };
        int ai37[] = {
            1, 1, 3, 1, 4, 1
        };
        int ai38[] = {
            1, 1, 4, 1, 3, 1
        };
        int ai39[] = {
            3, 1, 1, 1, 4, 1
        };
        int ai40[] = {
            4, 1, 1, 1, 3, 1
        };
        int ai41[] = {
            2, 1, 1, 2, 1, 4
        };
        int ai42[] = {
            2, 1, 1, 2, 3, 2
        };
        int ai43[] = {
            2, 3, 3, 1, 1, 1, 2
        };
        CODE_PATTERNS = (new int[][] {
            new int[] {
                2, 1, 2, 2, 2, 2
            }, new int[] {
                2, 2, 2, 1, 2, 2
            }, new int[] {
                2, 2, 2, 2, 2, 1
            }, new int[] {
                1, 2, 1, 2, 2, 3
            }, new int[] {
                1, 2, 1, 3, 2, 2
            }, ai, ai1, new int[] {
                1, 2, 2, 3, 1, 2
            }, new int[] {
                1, 3, 2, 2, 1, 2
            }, new int[] {
                2, 2, 1, 2, 1, 3
            }, new int[] {
                2, 2, 1, 3, 1, 2
            }, ai2, ai3, new int[] {
                1, 2, 2, 1, 3, 2
            }, ai4, new int[] {
                1, 1, 3, 2, 2, 2
            }, new int[] {
                1, 2, 3, 1, 2, 2
            }, new int[] {
                1, 2, 3, 2, 2, 1
            }, new int[] {
                2, 2, 3, 2, 1, 1
            }, ai5, new int[] {
                2, 2, 1, 2, 3, 1
            }, ai6, new int[] {
                2, 2, 3, 1, 1, 2
            }, new int[] {
                3, 1, 2, 1, 3, 1
            }, new int[] {
                3, 1, 1, 2, 2, 2
            }, new int[] {
                3, 2, 1, 1, 2, 2
            }, new int[] {
                3, 2, 1, 2, 2, 1
            }, new int[] {
                3, 1, 2, 2, 1, 2
            }, new int[] {
                3, 2, 2, 1, 1, 2
            }, ai7, new int[] {
                2, 1, 2, 1, 2, 3
            }, new int[] {
                2, 1, 2, 3, 2, 1
            }, ai8, ai9, ai10, ai11, new int[] {
                1, 1, 2, 3, 1, 3
            }, new int[] {
                1, 3, 2, 1, 1, 3
            }, new int[] {
                1, 3, 2, 3, 1, 1
            }, new int[] {
                2, 1, 1, 3, 1, 3
            }, ai12, new int[] {
                2, 3, 1, 3, 1, 1
            }, ai13, new int[] {
                1, 1, 2, 3, 3, 1
            }, ai14, new int[] {
                1, 1, 3, 1, 2, 3
            }, ai15, new int[] {
                1, 3, 3, 1, 2, 1
            }, new int[] {
                3, 1, 3, 1, 2, 1
            }, ai16, new int[] {
                2, 3, 1, 1, 3, 1
            }, new int[] {
                2, 1, 3, 1, 1, 3
            }, new int[] {
                2, 1, 3, 3, 1, 1
            }, new int[] {
                2, 1, 3, 1, 3, 1
            }, new int[] {
                3, 1, 1, 1, 2, 3
            }, ai17, new int[] {
                3, 3, 1, 1, 2, 1
            }, new int[] {
                3, 1, 2, 1, 1, 3
            }, new int[] {
                3, 1, 2, 3, 1, 1
            }, new int[] {
                3, 3, 2, 1, 1, 1
            }, new int[] {
                3, 1, 4, 1, 1, 1
            }, new int[] {
                2, 2, 1, 4, 1, 1
            }, ai18, new int[] {
                1, 1, 1, 2, 2, 4
            }, ai19, new int[] {
                1, 2, 1, 1, 2, 4
            }, ai20, new int[] {
                1, 4, 1, 1, 2, 2
            }, new int[] {
                1, 4, 1, 2, 2, 1
            }, ai21, new int[] {
                1, 1, 2, 4, 1, 2
            }, new int[] {
                1, 2, 2, 1, 1, 4
            }, new int[] {
                1, 2, 2, 4, 1, 1
            }, new int[] {
                1, 4, 2, 1, 1, 2
            }, new int[] {
                1, 4, 2, 2, 1, 1
            }, ai22, new int[] {
                2, 2, 1, 1, 1, 4
            }, new int[] {
                4, 1, 3, 1, 1, 1
            }, ai23, new int[] {
                1, 3, 4, 1, 1, 1
            }, new int[] {
                1, 1, 1, 2, 4, 2
            }, ai24, new int[] {
                1, 2, 1, 2, 4, 1
            }, new int[] {
                1, 1, 4, 2, 1, 2
            }, ai25, ai26, ai27, ai28, ai29, new int[] {
                2, 1, 2, 1, 4, 1
            }, ai30, ai31, new int[] {
                1, 1, 1, 1, 4, 3
            }, ai32, ai33, ai34, new int[] {
                1, 1, 4, 3, 1, 1
            }, ai35, ai36, ai37, ai38, ai39, ai40, new int[] {
                2, 1, 1, 4, 1, 2
            }, ai41, ai42, ai43
        });
    }
}
