// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.aztec.AztecReader;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.google.zxing.maxicode.MaxiCodeReader;
import com.google.zxing.oned.MultiFormatOneDReader;
import com.google.zxing.pdf417.PDF417Reader;
import com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            Reader, NotFoundException, ReaderException, DecodeHintType, 
//            BarcodeFormat, BinaryBitmap, Result

public final class MultiFormatReader
    implements Reader
{

    private Map hints;
    private Reader readers[];

    public MultiFormatReader()
    {
    }

    private Result decodeInternal(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        if (readers == null) goto _L2; else goto _L1
_L1:
        Reader areader[];
        int i;
        int j;
        areader = readers;
        j = areader.length;
        i = 0;
_L3:
        Object obj;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = areader[i];
        obj = ((Reader) (obj)).decode(binarybitmap, hints);
        return ((Result) (obj));
        ReaderException readerexception;
        readerexception;
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        setHints(null);
        return decodeInternal(binarybitmap);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException
    {
        setHints(map);
        return decodeInternal(binarybitmap);
    }

    public Result decodeWithState(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        if (readers == null)
        {
            setHints(null);
        }
        return decodeInternal(binarybitmap);
    }

    public void reset()
    {
        if (readers != null)
        {
            Reader areader[] = readers;
            int j = areader.length;
            for (int i = 0; i < j; i++)
            {
                areader[i].reset();
            }

        }
    }

    public void setHints(Map map)
    {
        boolean flag1 = false;
        hints = map;
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED))
            {
                flag1 = true;
            }
            if (flag1 && !flag)
            {
                arraylist.add(new MultiFormatOneDReader(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE))
            {
                arraylist.add(new QRCodeReader());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX))
            {
                arraylist.add(new DataMatrixReader());
            }
            if (collection.contains(BarcodeFormat.AZTEC))
            {
                arraylist.add(new AztecReader());
            }
            if (collection.contains(BarcodeFormat.PDF_417))
            {
                arraylist.add(new PDF417Reader());
            }
            if (collection.contains(BarcodeFormat.MAXICODE))
            {
                arraylist.add(new MaxiCodeReader());
            }
            if (flag1 && flag)
            {
                arraylist.add(new MultiFormatOneDReader(map));
            }
        }
        if (arraylist.isEmpty())
        {
            if (!flag)
            {
                arraylist.add(new MultiFormatOneDReader(map));
            }
            arraylist.add(new QRCodeReader());
            arraylist.add(new DataMatrixReader());
            arraylist.add(new AztecReader());
            arraylist.add(new PDF417Reader());
            arraylist.add(new MaxiCodeReader());
            if (flag)
            {
                arraylist.add(new MultiFormatOneDReader(map));
            }
        }
        readers = (Reader[])arraylist.toArray(new Reader[arraylist.size()]);
    }
}
