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
                l = i;
                k = i1;
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
        int k2 = bitarray.getSize();
        int i = bitarray.getNextSet(0);
        int ai[] = new int[6];
        int l2 = ai.length;
        int i2 = i;
        boolean flag = false;
        int j = 0;
        while (i2 < k2) 
        {
            int l;
            if (bitarray.get(i2) ^ flag)
            {
                ai[j] = ai[j] + 1;
                int k = j;
                j = i;
                i = k;
            } else
            {
                if (j == l2 - 1)
                {
                    int l1 = 64;
                    byte byte0 = -1;
                    for (int i1 = 103; i1 <= 105; i1++)
                    {
                        int j2 = patternMatchVariance(ai, CODE_PATTERNS[i1], 179);
                        if (j2 < l1)
                        {
                            byte0 = i1;
                            l1 = j2;
                        }
                    }

                    if (byte0 >= 0 && bitarray.isRange(Math.max(0, i - (i2 - i) / 2), i, false))
                    {
                        return (new int[] {
                            i, i2, byte0
                        });
                    }
                    int j1 = ai[0] + ai[1] + i;
                    System.arraycopy(ai, 2, ai, 0, l2 - 2);
                    ai[l2 - 2] = 0;
                    ai[l2 - 1] = 0;
                    i = j - 1;
                    j = j1;
                } else
                {
                    int k1 = j + 1;
                    j = i;
                    i = k1;
                }
                ai[i] = 1;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            i2++;
            l = i;
            i = j;
            j = l;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, FormatException, ChecksumException
    {
        int ai[];
        int k1;
        boolean flag1;
        if (map != null && map.containsKey(DecodeHintType.ASSUME_GS1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ai = findStartPattern(bitarray);
        k1 = ai[2];
        k1;
        JVM INSTR tableswitch 103 105: default 60
    //                   103 70
    //                   104 253
    //                   105 260;
           goto _L1 _L2 _L3 _L4
_L1:
        throw FormatException.getFormatInstance();
_L2:
        int j = 101;
_L48:
        Object obj;
        int ai1[];
        int i1;
        int j1;
        int l1;
        int i2;
        int j2;
        int l2;
        int i3;
        int j3;
        map = new StringBuilder(20);
        obj = new ArrayList(20);
        l2 = ai[0];
        l1 = ai[1];
        ai1 = new int[6];
        j1 = 1;
        i3 = 0;
        i2 = 0;
        j3 = 0;
        j2 = 0;
        boolean flag = false;
        i1 = j;
        j = ((flag) ? 1 : 0);
_L14:
        if (j != 0) goto _L6; else goto _L5
_L5:
        int k2;
        int k3;
        int l3;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        l3 = decodeCode(bitarray, ai1, l1);
        ((List) (obj)).add(Byte.valueOf((byte)l3));
        if (l3 != 106)
        {
            j1 = 1;
        }
        k3 = i2;
        j3 = k1;
        if (l3 != 106)
        {
            k3 = i2 + 1;
            j3 = k1 + k3 * l3;
        }
        i2 = ai1.length;
        k1 = 0;
        k2 = l1;
        for (; k1 < i2; k1++)
        {
            k2 += ai1[k1];
        }

          goto _L7
_L3:
        j = 100;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 99;
        continue; /* Loop/switch isn't completed */
_L7:
        l3;
        JVM INSTR tableswitch 103 105: default 296
    //                   103 438
    //                   104 438
    //                   105 438;
           goto _L8 _L9 _L9 _L9
_L8:
        i1;
        JVM INSTR tableswitch 99 101: default 324
    //                   99 1049
    //                   100 765
    //                   101 442;
           goto _L10 _L11 _L12 _L13
_L10:
        k1 = j1;
_L45:
        j1 = j;
        j = k1;
        i2 = i1;
        i1 = 0;
        k1 = j1;
        j1 = i1;
        i1 = j;
        j = i2;
_L17:
        i2 = j;
        if (i3 != 0)
        {
            if (j == 101)
            {
                i2 = 100;
            } else
            {
                i2 = 101;
            }
        }
        i3 = j1;
        j1 = i2;
        j = j2;
        j2 = l3;
        l2 = i1;
        i1 = k1;
        i2 = k3;
        k1 = j3;
        j3 = j;
        j = i1;
        i1 = j1;
        j1 = l2;
        l2 = l1;
        l1 = k2;
          goto _L14
_L9:
        throw FormatException.getFormatInstance();
_L13:
        if (l3 >= 64) goto _L16; else goto _L15
_L15:
        map.append((char)(l3 + 32));
        k1 = j;
        j = i1;
        i2 = 0;
        i1 = j1;
        j1 = i2;
          goto _L17
_L16:
        if (l3 >= 96) goto _L19; else goto _L18
_L18:
        map.append((char)(l3 - 64));
        k1 = j;
        j = i1;
        i2 = 0;
        i1 = j1;
        j1 = i2;
          goto _L17
_L19:
        i2 = j1;
        if (l3 != 106)
        {
            i2 = 0;
        }
        k1 = ((flag2) ? 1 : 0);
        l2 = j;
        j1 = i1;
        l3;
        JVM INSTR tableswitch 96 106: default 608
    //                   96 620
    //                   97 620
    //                   98 707
    //                   99 736
    //                   100 721
    //                   101 620
    //                   102 639
    //                   103 620
    //                   104 620
    //                   105 620
    //                   106 751;
           goto _L20 _L21 _L21 _L22 _L23 _L24 _L21 _L25 _L21 _L21 _L21 _L26
_L21:
        break; /* Loop/switch isn't completed */
_L20:
        j1 = i1;
        l2 = j;
        k1 = ((flag2) ? 1 : 0);
_L27:
        i1 = i2;
        j = j1;
        j1 = k1;
        k1 = l2;
          goto _L17
_L25:
        k1 = ((flag2) ? 1 : 0);
        l2 = j;
        j1 = i1;
        if (flag1)
        {
            if (map.length() == 0)
            {
                map.append("]C1");
                k1 = ((flag2) ? 1 : 0);
                l2 = j;
                j1 = i1;
            } else
            {
                map.append('\035');
                k1 = ((flag2) ? 1 : 0);
                l2 = j;
                j1 = i1;
            }
        }
          goto _L27
_L22:
        k1 = 1;
        j1 = 100;
        l2 = j;
          goto _L27
_L24:
        j1 = 100;
        k1 = ((flag2) ? 1 : 0);
        l2 = j;
          goto _L27
_L23:
        j1 = 99;
        k1 = ((flag2) ? 1 : 0);
        l2 = j;
          goto _L27
_L26:
        l2 = 1;
        k1 = ((flag2) ? 1 : 0);
        j1 = i1;
          goto _L27
_L12:
        if (l3 >= 96) goto _L29; else goto _L28
_L28:
        map.append((char)(l3 + 32));
        k1 = j;
        j = i1;
        i2 = 0;
        i1 = j1;
        j1 = i2;
          goto _L17
_L29:
        i2 = j1;
        if (l3 != 106)
        {
            i2 = 0;
        }
        k1 = ((flag3) ? 1 : 0);
        l2 = j;
        j1 = i1;
        l3;
        JVM INSTR tableswitch 96 106: default 892
    //                   96 904
    //                   97 904
    //                   98 991
    //                   99 1020
    //                   100 904
    //                   101 1005
    //                   102 923
    //                   103 904
    //                   104 904
    //                   105 904
    //                   106 1035;
           goto _L30 _L31 _L31 _L32 _L33 _L31 _L34 _L35 _L31 _L31 _L31 _L36
_L31:
        break; /* Loop/switch isn't completed */
_L30:
        j1 = i1;
        l2 = j;
        k1 = ((flag3) ? 1 : 0);
_L37:
        i1 = i2;
        j = j1;
        j1 = k1;
        k1 = l2;
          goto _L17
_L35:
        k1 = ((flag3) ? 1 : 0);
        l2 = j;
        j1 = i1;
        if (flag1)
        {
            if (map.length() == 0)
            {
                map.append("]C1");
                k1 = ((flag3) ? 1 : 0);
                l2 = j;
                j1 = i1;
            } else
            {
                map.append('\035');
                k1 = ((flag3) ? 1 : 0);
                l2 = j;
                j1 = i1;
            }
        }
          goto _L37
_L32:
        k1 = 1;
        j1 = 101;
        l2 = j;
          goto _L37
_L34:
        j1 = 101;
        k1 = ((flag3) ? 1 : 0);
        l2 = j;
          goto _L37
_L33:
        j1 = 99;
        k1 = ((flag3) ? 1 : 0);
        l2 = j;
          goto _L37
_L36:
        l2 = 1;
        k1 = ((flag3) ? 1 : 0);
        j1 = i1;
          goto _L37
_L11:
        if (l3 >= 100) goto _L39; else goto _L38
_L38:
        if (l3 < 10)
        {
            map.append('0');
        }
        map.append(l3);
        k1 = j;
        j = i1;
        i2 = 0;
        i1 = j1;
        j1 = i2;
          goto _L17
_L39:
        if (l3 != 106)
        {
            j1 = 0;
        }
        l3;
        JVM INSTR tableswitch 100 106: default 1152
    //                   100 1159
    //                   101 1251
    //                   102 1177
    //                   103 1152
    //                   104 1152
    //                   105 1152
    //                   106 1269;
           goto _L40 _L41 _L42 _L43 _L40 _L40 _L40 _L44
_L40:
        k1 = j1;
          goto _L45
_L41:
        k1 = j;
        i1 = j1;
        j = 100;
        j1 = 0;
          goto _L17
_L43:
        k1 = j1;
        if (!flag1) goto _L45; else goto _L46
_L46:
        if (map.length() == 0)
        {
            map.append("]C1");
            k1 = j;
            j = i1;
            i2 = 0;
            i1 = j1;
            j1 = i2;
        } else
        {
            map.append('\035');
            k1 = j;
            j = i1;
            i2 = 0;
            i1 = j1;
            j1 = i2;
        }
          goto _L17
_L42:
        k1 = j;
        i1 = j1;
        j = 101;
        j1 = 0;
          goto _L17
_L44:
        k1 = 1;
        j = i1;
        i2 = 0;
        i1 = j1;
        j1 = i2;
          goto _L17
_L6:
        int k = bitarray.getNextUnset(l1);
        if (!bitarray.isRange(k, Math.min(bitarray.getSize(), (k - l2) / 2 + k), false))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if ((k1 - i2 * j3) % 103 != j3)
        {
            throw ChecksumException.getChecksumInstance();
        }
        k1 = map.length();
        if (k1 == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f;
        float f1;
        if (k1 > 0 && j1 != 0)
        {
            if (i1 == 99)
            {
                map.delete(k1 - 2, k1);
            } else
            {
                map.delete(k1 - 1, k1);
            }
        }
        f = (float)(ai[1] + ai[0]) / 2.0F;
        f1 = (float)(k + l2) / 2.0F;
        i1 = ((List) (obj)).size();
        bitarray = new byte[i1];
        for (int l = 0; l < i1; l++)
        {
            bitarray[l] = ((Byte)((List) (obj)).get(l)).byteValue();
        }

        map = map.toString();
        obj = new ResultPoint(f, i);
        ResultPoint resultpoint = new ResultPoint(f1, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODE_128;
        return new Result(map, bitarray, new ResultPoint[] {
            obj, resultpoint
        }, barcodeformat);
        if (true) goto _L48; else goto _L47
_L47:
    }

    static 
    {
        int ai[] = {
            1, 1, 3, 2, 2, 2
        };
        int ai1[] = {
            2, 1, 2, 1, 2, 3
        };
        int ai2[] = {
            1, 3, 1, 1, 2, 3
        };
        int ai3[] = {
            1, 1, 3, 1, 2, 3
        };
        int ai4[] = {
            3, 1, 1, 3, 2, 1
        };
        int ai5[] = {
            1, 4, 1, 2, 2, 1
        };
        int ai6[] = {
            1, 3, 1, 1, 4, 1
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
            }, new int[] {
                1, 3, 1, 2, 2, 2
            }, new int[] {
                1, 2, 2, 2, 1, 3
            }, new int[] {
                1, 2, 2, 3, 1, 2
            }, new int[] {
                1, 3, 2, 2, 1, 2
            }, new int[] {
                2, 2, 1, 2, 1, 3
            }, new int[] {
                2, 2, 1, 3, 1, 2
            }, new int[] {
                2, 3, 1, 2, 1, 2
            }, new int[] {
                1, 1, 2, 2, 3, 2
            }, new int[] {
                1, 2, 2, 1, 3, 2
            }, new int[] {
                1, 2, 2, 2, 3, 1
            }, ai, new int[] {
                1, 2, 3, 1, 2, 2
            }, new int[] {
                1, 2, 3, 2, 2, 1
            }, new int[] {
                2, 2, 3, 2, 1, 1
            }, new int[] {
                2, 2, 1, 1, 3, 2
            }, new int[] {
                2, 2, 1, 2, 3, 1
            }, new int[] {
                2, 1, 3, 2, 1, 2
            }, new int[] {
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
            }, new int[] {
                3, 2, 2, 2, 1, 1
            }, ai1, new int[] {
                2, 1, 2, 3, 2, 1
            }, new int[] {
                2, 3, 2, 1, 2, 1
            }, new int[] {
                1, 1, 1, 3, 2, 3
            }, ai2, new int[] {
                1, 3, 1, 3, 2, 1
            }, new int[] {
                1, 1, 2, 3, 1, 3
            }, new int[] {
                1, 3, 2, 1, 1, 3
            }, new int[] {
                1, 3, 2, 3, 1, 1
            }, new int[] {
                2, 1, 1, 3, 1, 3
            }, new int[] {
                2, 3, 1, 1, 1, 3
            }, new int[] {
                2, 3, 1, 3, 1, 1
            }, new int[] {
                1, 1, 2, 1, 3, 3
            }, new int[] {
                1, 1, 2, 3, 3, 1
            }, new int[] {
                1, 3, 2, 1, 3, 1
            }, ai3, new int[] {
                1, 1, 3, 3, 2, 1
            }, new int[] {
                1, 3, 3, 1, 2, 1
            }, new int[] {
                3, 1, 3, 1, 2, 1
            }, new int[] {
                2, 1, 1, 3, 3, 1
            }, new int[] {
                2, 3, 1, 1, 3, 1
            }, new int[] {
                2, 1, 3, 1, 1, 3
            }, new int[] {
                2, 1, 3, 3, 1, 1
            }, new int[] {
                2, 1, 3, 1, 3, 1
            }, new int[] {
                3, 1, 1, 1, 2, 3
            }, ai4, new int[] {
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
            }, new int[] {
                4, 3, 1, 1, 1, 1
            }, new int[] {
                1, 1, 1, 2, 2, 4
            }, new int[] {
                1, 1, 1, 4, 2, 2
            }, new int[] {
                1, 2, 1, 1, 2, 4
            }, new int[] {
                1, 2, 1, 4, 2, 1
            }, new int[] {
                1, 4, 1, 1, 2, 2
            }, ai5, new int[] {
                1, 1, 2, 2, 1, 4
            }, new int[] {
                1, 1, 2, 4, 1, 2
            }, new int[] {
                1, 2, 2, 1, 1, 4
            }, new int[] {
                1, 2, 2, 4, 1, 1
            }, new int[] {
                1, 4, 2, 1, 1, 2
            }, new int[] {
                1, 4, 2, 2, 1, 1
            }, new int[] {
                2, 4, 1, 2, 1, 1
            }, new int[] {
                2, 2, 1, 1, 1, 4
            }, new int[] {
                4, 1, 3, 1, 1, 1
            }, new int[] {
                2, 4, 1, 1, 1, 2
            }, new int[] {
                1, 3, 4, 1, 1, 1
            }, new int[] {
                1, 1, 1, 2, 4, 2
            }, new int[] {
                1, 2, 1, 1, 4, 2
            }, new int[] {
                1, 2, 1, 2, 4, 1
            }, new int[] {
                1, 1, 4, 2, 1, 2
            }, new int[] {
                1, 2, 4, 1, 1, 2
            }, new int[] {
                1, 2, 4, 2, 1, 1
            }, new int[] {
                4, 1, 1, 2, 1, 2
            }, new int[] {
                4, 2, 1, 1, 1, 2
            }, new int[] {
                4, 2, 1, 2, 1, 1
            }, new int[] {
                2, 1, 2, 1, 4, 1
            }, new int[] {
                2, 1, 4, 1, 2, 1
            }, new int[] {
                4, 1, 2, 1, 2, 1
            }, new int[] {
                1, 1, 1, 1, 4, 3
            }, new int[] {
                1, 1, 1, 3, 4, 1
            }, ai6, new int[] {
                1, 1, 4, 1, 1, 3
            }, new int[] {
                1, 1, 4, 3, 1, 1
            }, new int[] {
                4, 1, 1, 1, 1, 3
            }, new int[] {
                4, 1, 1, 3, 1, 1
            }, new int[] {
                1, 1, 3, 1, 4, 1
            }, new int[] {
                1, 1, 4, 1, 3, 1
            }, new int[] {
                3, 1, 1, 1, 4, 1
            }, new int[] {
                4, 1, 1, 1, 3, 1
            }, new int[] {
                2, 1, 1, 4, 1, 2
            }, new int[] {
                2, 1, 1, 2, 1, 4
            }, new int[] {
                2, 1, 1, 2, 3, 2
            }, new int[] {
                2, 3, 3, 1, 1, 1, 2
            }
        });
    }
}
