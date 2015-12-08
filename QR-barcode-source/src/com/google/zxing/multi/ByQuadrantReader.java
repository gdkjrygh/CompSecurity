// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import java.util.Map;

public final class ByQuadrantReader
    implements Reader
{

    private final Reader _flddelegate;

    public ByQuadrantReader(Reader reader)
    {
        _flddelegate = reader;
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, ChecksumException, FormatException
    {
        return decode(binarybitmap, null);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        int j = binarybitmap.getWidth();
        int i = binarybitmap.getHeight();
        j /= 2;
        i /= 2;
        Object obj = binarybitmap.crop(0, 0, j, i);
        try
        {
            obj = _flddelegate.decode(((BinaryBitmap) (obj)), map);
        }
        catch (NotFoundException notfoundexception)
        {
            Object obj1 = binarybitmap.crop(j, 0, j, i);
            try
            {
                obj1 = _flddelegate.decode(((BinaryBitmap) (obj1)), map);
            }
            catch (NotFoundException notfoundexception1)
            {
                Object obj2 = binarybitmap.crop(0, i, j, i);
                try
                {
                    obj2 = _flddelegate.decode(((BinaryBitmap) (obj2)), map);
                }
                catch (NotFoundException notfoundexception2)
                {
                    Object obj3 = binarybitmap.crop(j, i, j, i);
                    try
                    {
                        obj3 = _flddelegate.decode(((BinaryBitmap) (obj3)), map);
                    }
                    catch (NotFoundException notfoundexception3)
                    {
                        binarybitmap = binarybitmap.crop(j / 2, i / 2, j, i);
                        return _flddelegate.decode(binarybitmap, map);
                    }
                    return ((Result) (obj3));
                }
                return ((Result) (obj2));
            }
            return ((Result) (obj1));
        }
        return ((Result) (obj));
    }

    public void reset()
    {
        _flddelegate.reset();
    }
}
