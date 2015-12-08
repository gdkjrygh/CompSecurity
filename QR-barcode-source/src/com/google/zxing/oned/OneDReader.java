// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class OneDReader
    implements Reader
{

    protected static final int INTEGER_MATH_SHIFT = 8;
    protected static final int PATTERN_MATCH_RESULT_SCALE_FACTOR = 256;

    public OneDReader()
    {
    }

    private Result doDecode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException
    {
        Object obj;
        int j;
        int j1;
        int k1;
        k1 = binarybitmap.getWidth();
        int i1 = binarybitmap.getHeight();
        obj = new BitArray(k1);
        int i;
        int l1;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = 8;
        } else
        {
            j = 5;
        }
        l1 = Math.max(1, i1 >> j);
        if (i != 0)
        {
            i = i1;
        } else
        {
            i = 15;
        }
        j = 0;
_L4:
label0:
        {
            if (j < i)
            {
                j1 = j + 1 >> 1;
                int k;
                if ((j & 1) == 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0)
                {
                    k = j1;
                } else
                {
                    k = -j1;
                }
                j1 = (i1 >> 1) + k * l1;
                if (j1 >= 0 && j1 < i1)
                {
                    break label0;
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
        Object obj1 = binarybitmap.getBlackRow(j1, ((BitArray) (obj)));
        int l;
        obj = obj1;
        l = 0;
_L2:
        Object obj2;
        obj2 = obj;
        obj1 = map;
        if (l >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l == 1)
        {
            ((BitArray) (obj)).reverse();
            if (map != null && map.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK))
            {
                obj1 = new EnumMap(com/google/zxing/DecodeHintType);
                ((Map) (obj1)).putAll(map);
                ((Map) (obj1)).remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                map = ((Map) (obj1));
            }
        }
        obj1 = decodeRow(j1, ((BitArray) (obj)), map);
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((Result) (obj1)).putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(180));
        obj2 = ((Result) (obj1)).getResultPoints();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj2[0] = new ResultPoint((float)k1 - obj2[0].getX() - 1.0F, obj2[0].getY());
        obj2[1] = new ResultPoint((float)k1 - obj2[1].getX() - 1.0F, obj2[1].getY());
        return ((Result) (obj1));
        obj1;
        l++;
        if (true) goto _L2; else goto _L1
        obj1;
        obj1 = map;
        obj2 = obj;
_L1:
        j++;
        obj = obj2;
        map = ((Map) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static int patternMatchVariance(int ai[], int ai1[], int i)
    {
        int j;
        int i1;
        int k1;
        k1 = ai.length;
        int k = 0;
        i1 = 0;
        j = 0;
        for (; k < k1; k++)
        {
            j += ai[k];
            i1 += ai1[k];
        }

        if (j >= i1) goto _L2; else goto _L1
_L1:
        return 0x7fffffff;
_L2:
        int l1 = (j << 8) / i1;
        int l = 0;
        i1 = 0;
        do
        {
label0:
            {
                if (l >= k1)
                {
                    break label0;
                }
                int j1 = ai[l] << 8;
                int i2 = ai1[l] * l1;
                if (j1 > i2)
                {
                    j1 -= i2;
                } else
                {
                    j1 = i2 - j1;
                }
                if (j1 > i * l1 >> 8)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 += j1;
                l++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return i1 / j;
    }

    protected static void recordPattern(BitArray bitarray, int i, int ai[])
        throws NotFoundException
    {
        int j;
        int k;
        int i1;
        int j1;
        i1 = ai.length;
        Arrays.fill(ai, 0, i1, 0);
        j1 = bitarray.getSize();
        if (i >= j1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean flag;
        if (!bitarray.get(i))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag = false;
        k = i;
        i = ((flag) ? 1 : 0);
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!(bitarray.get(k) ^ j))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ai[i] + 1;
_L5:
        k++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_47;
_L1:
        int l = i + 1;
        if (l != i1) goto _L4; else goto _L3
_L3:
        if (l != i1 && (l != i1 - 1 || k != j1))
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
_L4:
        ai[l] = 1;
        if (j == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = i;
        i = l;
          goto _L5
        l = i;
          goto _L3
    }

    protected static void recordPatternInReverse(BitArray bitarray, int i, int ai[])
        throws NotFoundException
    {
        int j = ai.length;
        boolean flag = bitarray.get(i);
        do
        {
            if (i <= 0 || j < 0)
            {
                break;
            }
            int k = i - 1;
            i = k;
            if (bitarray.get(k) != flag)
            {
                j--;
                if (!flag)
                {
                    flag = true;
                    i = k;
                } else
                {
                    flag = false;
                    i = k;
                }
            }
        } while (true);
        if (j >= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            recordPattern(bitarray, i + 1, ai);
            return;
        }
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, FormatException
    {
        return decode(binarybitmap, null);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, FormatException
    {
        Result result;
        try
        {
            result = doDecode(binarybitmap, map);
        }
        catch (Object obj)
        {
            int i;
            if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && binarybitmap.isRotateSupported())
            {
                binarybitmap = binarybitmap.rotateCounterClockwise();
                map = doDecode(binarybitmap, map);
                obj = map.getResultMetadata();
                if (obj != null && ((Map) (obj)).containsKey(ResultMetadataType.ORIENTATION))
                {
                    i = (((Integer)((Map) (obj)).get(ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
                } else
                {
                    i = 270;
                }
                map.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
                obj = map.getResultPoints();
                if (obj != null)
                {
                    int j = binarybitmap.getHeight();
                    for (i = 0; i < obj.length; i++)
                    {
                        obj[i] = new ResultPoint((float)j - obj[i].getY() - 1.0F, obj[i].getX());
                    }

                }
                return map;
            } else
            {
                throw obj;
            }
        }
        return result;
    }

    public abstract Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, ChecksumException, FormatException;

    public void reset()
    {
    }
}
