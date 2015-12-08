// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.multi:
//            MultipleBarcodeReader

public final class GenericMultipleBarcodeReader
    implements MultipleBarcodeReader
{

    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader _flddelegate;

    public GenericMultipleBarcodeReader(Reader reader)
    {
        _flddelegate = reader;
    }

    private void doDecodeMultiple(BinaryBitmap binarybitmap, Map map, List list, int i, int j, int k)
    {
        if (k <= 4)
        {
            Result result;
            ResultPoint aresultpoint[];
            Iterator iterator;
            boolean flag;
            boolean flag1;
            try
            {
                result = _flddelegate.decode(binarybitmap, map);
            }
            // Misplaced declaration of an exception variable
            catch (BinaryBitmap binarybitmap)
            {
                return;
            }
            flag1 = false;
            iterator = list.iterator();
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!((Result)iterator.next()).getText().equals(result.getText()))
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            if (!flag)
            {
                list.add(translateResultPoints(result, i, j));
            }
            aresultpoint = result.getResultPoints();
            if (aresultpoint != null && aresultpoint.length != 0)
            {
                int i1 = binarybitmap.getWidth();
                int j1 = binarybitmap.getHeight();
                float f7 = i1;
                float f4 = j1;
                float f3 = 0.0F;
                float f = 0.0F;
                int k1 = aresultpoint.length;
                for (int l = 0; l < k1;)
                {
                    ResultPoint resultpoint = aresultpoint[l];
                    float f6 = resultpoint.getX();
                    float f1 = resultpoint.getY();
                    float f2 = f7;
                    if (f6 < f7)
                    {
                        f2 = f6;
                    }
                    float f5 = f4;
                    if (f1 < f4)
                    {
                        f5 = f1;
                    }
                    f4 = f3;
                    if (f6 > f3)
                    {
                        f4 = f6;
                    }
                    f6 = f;
                    if (f1 > f)
                    {
                        f6 = f1;
                    }
                    l++;
                    f3 = f4;
                    f = f6;
                    f7 = f2;
                    f4 = f5;
                }

                if (f7 > 100F)
                {
                    doDecodeMultiple(binarybitmap.crop(0, 0, (int)f7, j1), map, list, i, j, k + 1);
                }
                if (f4 > 100F)
                {
                    doDecodeMultiple(binarybitmap.crop(0, 0, i1, (int)f4), map, list, i, j, k + 1);
                }
                if (f3 < (float)(i1 - 100))
                {
                    doDecodeMultiple(binarybitmap.crop((int)f3, 0, i1 - (int)f3, j1), map, list, i + (int)f3, j, k + 1);
                }
                if (f < (float)(j1 - 100))
                {
                    doDecodeMultiple(binarybitmap.crop(0, (int)f, i1, j1 - (int)f), map, list, i, j + (int)f, k + 1);
                    return;
                }
            }
        }
    }

    private static Result translateResultPoints(Result result, int i, int j)
    {
        ResultPoint aresultpoint[] = result.getResultPoints();
        if (aresultpoint == null)
        {
            return result;
        }
        ResultPoint aresultpoint1[] = new ResultPoint[aresultpoint.length];
        for (int k = 0; k < aresultpoint.length; k++)
        {
            ResultPoint resultpoint = aresultpoint[k];
            aresultpoint1[k] = new ResultPoint(resultpoint.getX() + (float)i, resultpoint.getY() + (float)j);
        }

        Result result1 = new Result(result.getText(), result.getRawBytes(), aresultpoint1, result.getBarcodeFormat());
        result1.putAllMetadata(result.getResultMetadata());
        return result1;
    }

    public Result[] decodeMultiple(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        return decodeMultiple(binarybitmap, null);
    }

    public Result[] decodeMultiple(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException
    {
        ArrayList arraylist = new ArrayList();
        doDecodeMultiple(binarybitmap, map, arraylist, 0, 0, 0);
        if (arraylist.isEmpty())
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return (Result[])arraylist.toArray(new Result[arraylist.size()]);
        }
    }
}
