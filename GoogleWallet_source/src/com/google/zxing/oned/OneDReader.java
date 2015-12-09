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

    public OneDReader()
    {
    }

    private Result doDecode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException
    {
        Object obj;
        Object obj1;
        Object obj2;
        int j;
        int k;
        int j1 = binarybitmap.getWidth();
        int l = binarybitmap.getHeight();
        obj = new BitArray(j1);
        int i;
        int k1;
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
        k1 = Math.max(1, l >> j);
        if (i != 0)
        {
            i = l;
        } else
        {
            i = 15;
        }
        j = 0;
_L5:
        if (j >= i) goto _L2; else goto _L1
_L1:
        int i1 = j + 1 >> 1;
        if ((j & 1) == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            k = i1;
        } else
        {
            k = -i1;
        }
        i1 = (l >> 1) + k1 * k;
        if (i1 < 0 || i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = binarybitmap.getBlackRow(i1, ((BitArray) (obj)));
        obj = obj1;
        k = 0;
_L4:
        obj2 = obj;
        obj1 = map;
        if (k >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = map;
        if (k == 1)
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
        map = decodeRow(i1, ((BitArray) (obj)), ((Map) (obj1)));
        if (k != 1)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        map.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(180));
        obj2 = map.getResultPoints();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj2[0] = new ResultPoint((float)j1 - obj2[0].getX() - 1.0F, obj2[0].getY());
        obj2[1] = new ResultPoint((float)j1 - obj2[1].getX() - 1.0F, obj2[1].getY());
        return map;
        map;
        k++;
        map = ((Map) (obj1));
        if (true) goto _L4; else goto _L3
        obj1;
        obj1 = map;
        obj2 = obj;
_L3:
        j++;
        obj = obj2;
        map = ((Map) (obj1));
          goto _L5
_L2:
        throw NotFoundException.getNotFoundInstance();
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
        int k1;
        j1 = ai.length;
        Arrays.fill(ai, 0, j1, 0);
        k1 = bitarray.getSize();
        if (i >= k1)
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
_L6:
        i1 = i;
        if (j >= k1)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (!(bitarray.get(j) ^ k))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ai[i] + 1;
        l = i;
_L4:
        j++;
        i = l;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_49;
_L1:
        l = i + 1;
        i1 = l;
        if (l == j1)
        {
            break MISSING_BLOCK_LABEL_134;
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
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != j1 && (i1 != j1 - 1 || j != k1))
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
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
