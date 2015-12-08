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
        if (k <= 4) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l;
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        Result result;
        ResultPoint aresultpoint[];
        Object obj;
        int i1;
        int j1;
        int k1;
        try
        {
            result = _flddelegate.decode(binarybitmap, map);
        }
        // Misplaced declaration of an exception variable
        catch (BinaryBitmap binarybitmap)
        {
            return;
        }
        obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!((Result)((Iterator) (obj)).next()).getText().equals(result.getText()));
        l = 1;
_L4:
        if (l == 0)
        {
            list.add(translateResultPoints(result, i, j));
        }
        aresultpoint = result.getResultPoints();
        if (aresultpoint != null && aresultpoint.length != 0)
        {
            i1 = binarybitmap.getWidth();
            j1 = binarybitmap.getHeight();
            f1 = i1;
            f3 = j1;
            f2 = 0.0F;
            f = 0.0F;
            k1 = aresultpoint.length;
            for (l = 0; l < k1; l++)
            {
                obj = aresultpoint[l];
                f5 = ((ResultPoint) (obj)).getX();
                f4 = ((ResultPoint) (obj)).getY();
                if (f5 < f1)
                {
                    f1 = f5;
                }
                if (f4 < f3)
                {
                    f3 = f4;
                }
                if (f5 > f2)
                {
                    f2 = f5;
                }
                if (f4 > f)
                {
                    f = f4;
                }
            }

            if (f1 > 100F)
            {
                doDecodeMultiple(binarybitmap.crop(0, 0, (int)f1, j1), map, list, i, j, k + 1);
            }
            if (f3 > 100F)
            {
                doDecodeMultiple(binarybitmap.crop(0, 0, i1, (int)f3), map, list, i, j, k + 1);
            }
            if (f2 < (float)(i1 - 100))
            {
                doDecodeMultiple(binarybitmap.crop((int)f2, 0, i1 - (int)f2, j1), map, list, i + (int)f2, j, k + 1);
            }
            if (f < (float)(j1 - 100))
            {
                doDecodeMultiple(binarybitmap.crop(0, (int)f, i1, j1 - (int)f), map, list, i, j + (int)f, k + 1);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        l = 0;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
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
