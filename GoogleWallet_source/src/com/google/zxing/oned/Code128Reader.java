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

    static final int CODE_PATTERNS[][];

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
        while (k < l1) 
        {
            int j;
            if (bitarray.get(k) ^ flag)
            {
                ai[l] = ai[l] + 1;
                j = l;
            } else
            {
                if (l == 5)
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
                    System.arraycopy(ai, 2, ai, 0, 4);
                    ai[4] = 0;
                    ai[5] = 0;
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

    public final Result decodeRow(int i, BitArray bitarray, Map map)
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
        i4;
        JVM INSTR tableswitch 103 105: default 60
    //                   103 70
    //                   104 257
    //                   105 264;
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
        map = new StringBuilder(20);
        obj = new ArrayList(20);
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
        int i1;
        boolean flag4;
        int j2;
        int k2;
        int l2;
        int i3;
        int j4;
        flag2 = false;
        flag4 = i2;
        j4 = decodeCode(bitarray, ai1, k1);
        ((List) (obj)).add(Byte.valueOf((byte)j4));
        i1 = l1;
        if (j4 != 106)
        {
            i1 = 1;
        }
        k2 = i4;
        j2 = j3;
        if (j4 != 106)
        {
            j2 = j3 + 1;
            k2 = i4 + j2 * j4;
        }
        l2 = k1;
        j = 0;
        i3 = k1;
        for (; j < 6; j++)
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
        JVM INSTR tableswitch 103 105: default 300
    //                   103 435
    //                   104 435
    //                   105 435;
           goto _L8 _L9 _L9 _L9
_L8:
        byte0;
        JVM INSTR tableswitch 99 101: default 328
    //                   99 1065
    //                   100 769
    //                   101 439;
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
        l1 = i1;
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
            l1 = i1;
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
        map.append((char)(j4 + 32));
        j = byte0;
        flag = flag5;
        flag1 = flag2;
          goto _L17
_L16:
        if (j4 >= 96) goto _L19; else goto _L18
_L18:
        map.append((char)(j4 - 64));
        j = byte0;
        flag = flag5;
        flag1 = flag2;
          goto _L17
_L19:
        k1 = i1;
        if (j4 != 106)
        {
            k1 = 0;
        }
        j = byte0;
        flag = flag5;
        flag1 = flag2;
        i1 = k1;
        switch (j4)
        {
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        default:
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            break;

        case 98: // 'b'
            flag1 = true;
            j = 100;
            flag = flag5;
            i1 = k1;
            break;

        case 102: // 'f'
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            if (flag3)
            {
                if (map.length() == 0)
                {
                    map.append("]C1");
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    i1 = k1;
                } else
                {
                    map.append('\035');
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    i1 = k1;
                }
            }
            break;

        case 100: // 'd'
            j = 100;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            break;

        case 99: // 'c'
            j = 99;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            break;

        case 106: // 'j'
            flag = true;
            j = byte0;
            flag1 = flag2;
            i1 = k1;
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
        map.append((char)(j4 + 32));
        j = byte0;
        flag = flag5;
        flag1 = flag2;
          goto _L17
_L22:
        k1 = i1;
        if (j4 != 106)
        {
            k1 = 0;
        }
        j = byte0;
        flag = flag5;
        flag1 = flag2;
        i1 = k1;
        switch (j4)
        {
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        default:
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            break;

        case 98: // 'b'
            flag1 = true;
            j = 101;
            flag = flag5;
            i1 = k1;
            break;

        case 102: // 'f'
            j = byte0;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            if (flag3)
            {
                if (map.length() == 0)
                {
                    map.append("]C1");
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    i1 = k1;
                } else
                {
                    map.append('\035');
                    j = byte0;
                    flag = flag5;
                    flag1 = flag2;
                    i1 = k1;
                }
            }
            break;

        case 101: // 'e'
            j = 101;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            break;

        case 99: // 'c'
            j = 99;
            flag = flag5;
            flag1 = flag2;
            i1 = k1;
            break;

        case 106: // 'j'
            flag = true;
            j = byte0;
            flag1 = flag2;
            i1 = k1;
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
                map.append('0');
            }
            map.append(j4);
            j = byte0;
            flag = flag5;
            flag1 = flag2;
        } else
        {
            k1 = i1;
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
                i1 = k1;
                break;

            case 100: // 'd'
                j = 100;
                flag = flag5;
                flag1 = flag2;
                i1 = k1;
                break;

            case 102: // 'f'
                j = byte0;
                flag = flag5;
                flag1 = flag2;
                i1 = k1;
                if (flag3)
                {
                    if (map.length() == 0)
                    {
                        map.append("]C1");
                        j = byte0;
                        flag = flag5;
                        flag1 = flag2;
                        i1 = k1;
                    } else
                    {
                        map.append('\035');
                        j = byte0;
                        flag = flag5;
                        flag1 = flag2;
                        i1 = k1;
                    }
                }
                break;

            case 101: // 'e'
                j = 101;
                flag = flag5;
                flag1 = flag2;
                i1 = k1;
                break;

            case 106: // 'j'
                flag = true;
                j = byte0;
                flag1 = flag2;
                i1 = k1;
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
        int j1 = map.length();
        if (j1 == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f;
        float f1;
        if (j1 > 0 && l1 != 0)
        {
            if (byte0 == 99)
            {
                map.delete(j1 - 2, j1);
            } else
            {
                map.delete(j1 - 1, j1);
            }
        }
        f = (float)(ai[1] + ai[0]) / 2.0F;
        f1 = (float)(k + k3) / 2.0F;
        j1 = ((List) (obj)).size();
        bitarray = new byte[j1];
        for (int l = 0; l < j1; l++)
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
        continue; /* Loop/switch isn't completed */
        if (true) goto _L17; else goto _L24
_L24:
        if (true) goto _L26; else goto _L25
_L25:
    }

    static 
    {
        int ai[] = {
            2, 1, 3, 2, 1, 2
        };
        int ai1[] = {
            2, 1, 1, 3, 1, 3
        };
        int ai2[] = {
            1, 3, 2, 1, 3, 1
        };
        int ai3[] = {
            2, 1, 3, 1, 3, 1
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
            }, new int[] {
                1, 1, 3, 2, 2, 2
            }, new int[] {
                1, 2, 3, 1, 2, 2
            }, new int[] {
                1, 2, 3, 2, 2, 1
            }, new int[] {
                2, 2, 3, 2, 1, 1
            }, new int[] {
                2, 2, 1, 1, 3, 2
            }, new int[] {
                2, 2, 1, 2, 3, 1
            }, ai, new int[] {
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
            }, new int[] {
                2, 1, 2, 1, 2, 3
            }, new int[] {
                2, 1, 2, 3, 2, 1
            }, new int[] {
                2, 3, 2, 1, 2, 1
            }, new int[] {
                1, 1, 1, 3, 2, 3
            }, new int[] {
                1, 3, 1, 1, 2, 3
            }, new int[] {
                1, 3, 1, 3, 2, 1
            }, new int[] {
                1, 1, 2, 3, 1, 3
            }, new int[] {
                1, 3, 2, 1, 1, 3
            }, new int[] {
                1, 3, 2, 3, 1, 1
            }, ai1, new int[] {
                2, 3, 1, 1, 1, 3
            }, new int[] {
                2, 3, 1, 3, 1, 1
            }, new int[] {
                1, 1, 2, 1, 3, 3
            }, new int[] {
                1, 1, 2, 3, 3, 1
            }, ai2, new int[] {
                1, 1, 3, 1, 2, 3
            }, new int[] {
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
            }, ai3, new int[] {
                3, 1, 1, 1, 2, 3
            }, new int[] {
                3, 1, 1, 3, 2, 1
            }, new int[] {
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
            }, new int[] {
                1, 4, 1, 2, 2, 1
            }, new int[] {
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
            }, new int[] {
                1, 3, 1, 1, 4, 1
            }, new int[] {
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
