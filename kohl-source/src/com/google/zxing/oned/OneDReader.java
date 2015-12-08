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
_L1:
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
                j1 = (i1 >> 1) + l1 * k;
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
            break MISSING_BLOCK_LABEL_372;
        }
        obj1 = map;
        if (l == 1)
        {
            ((BitArray) (obj)).reverse();
            obj1 = map;
            if (map != null)
            {
                obj1 = map;
                if (map.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK))
                {
                    obj1 = new EnumMap(com/google/zxing/DecodeHintType);
                    ((Map) (obj1)).putAll(map);
                    ((Map) (obj1)).remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                }
            }
        }
        map = decodeRow(j1, ((BitArray) (obj)), ((Map) (obj1)));
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        map.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(180));
        obj2 = map.getResultPoints();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        obj2[0] = new ResultPoint((float)k1 - obj2[0].getX() - 1.0F, obj2[0].getY());
        obj2[1] = new ResultPoint((float)k1 - obj2[1].getX() - 1.0F, obj2[1].getY());
        return map;
        obj1;
        obj1 = map;
        obj2 = obj;
        j++;
        obj = obj2;
        map = ((Map) (obj1));
          goto _L1
        map;
        l++;
        map = ((Map) (obj1));
          goto _L2
    }

    protected static int patternMatchVariance(int ai[], int ai1[], int i)
    {
        int j;
        int i1;
        int k1;
        k1 = ai.length;
        j = 0;
        i1 = 0;
        for (int k = 0; k < k1; k++)
        {
            j += ai[k];
            i1 += ai1[k];
        }

        if (j >= i1) goto _L2; else goto _L1
_L1:
        return 0x7fffffff;
_L2:
        int l1 = (j << 8) / i1;
        i1 = 0;
        int l = 0;
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
        int l;
        int i1;
        int j1;
        i1 = ai.length;
        Arrays.fill(ai, 0, i1, 0);
        j1 = bitarray.getSize();
        if (i >= j1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (!bitarray.get(i))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        l = 0;
        k = j;
        j = i;
        i = l;
        l = i;
        if (j >= j1) goto _L2; else goto _L1
_L1:
        if (!(bitarray.get(j) ^ k)) goto _L4; else goto _L3
_L3:
        ai[i] = ai[i] + 1;
        l = i;
_L6:
        j++;
        i = l;
        break MISSING_BLOCK_LABEL_49;
_L4:
        l = i + 1;
        if (l != i1)
        {
            break MISSING_BLOCK_LABEL_133;
        }
_L2:
        if (l != i1 && (l != i1 - 1 || j != j1))
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
        ai[l] = 1;
        if (k == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = i;
        if (true) goto _L6; else goto _L5
_L5:
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
                } else
                {
                    flag = false;
                }
                i = k;
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
        Result result = doDecode(binarybitmap, map);
        binarybitmap = result;
_L2:
        return binarybitmap;
        Object obj;
        obj;
label0:
        {
            ResultPoint aresultpoint[];
            int i;
            char c;
            if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0 || !binarybitmap.isRotateSupported())
            {
                break label0;
            }
            obj = binarybitmap.rotateCounterClockwise();
            map = doDecode(((BinaryBitmap) (obj)), map);
            binarybitmap = map.getResultMetadata();
            c = '\u010E';
            i = c;
            if (binarybitmap != null)
            {
                i = c;
                if (binarybitmap.containsKey(ResultMetadataType.ORIENTATION))
                {
                    i = (((Integer)binarybitmap.get(ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
                }
            }
            map.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
            aresultpoint = map.getResultPoints();
            binarybitmap = map;
            if (aresultpoint != null)
            {
                int j = ((BinaryBitmap) (obj)).getHeight();
                i = 0;
                do
                {
                    binarybitmap = map;
                    if (i >= aresultpoint.length)
                    {
                        break;
                    }
                    aresultpoint[i] = new ResultPoint((float)j - aresultpoint[i].getY() - 1.0F, aresultpoint[i].getX());
                    i++;
                } while (true);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        throw obj;
    }

    public abstract Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, ChecksumException, FormatException;

    public void reset()
    {
    }
}
