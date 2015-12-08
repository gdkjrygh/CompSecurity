// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.RSS14Reader;
import com.google.zxing.oned.rss.expanded.RSSExpandedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDReader, MultiFormatUPCEANReader, Code39Reader, Code93Reader, 
//            Code128Reader, ITFReader, CodaBarReader

public final class MultiFormatOneDReader extends OneDReader
{

    private final OneDReader readers[];

    public MultiFormatOneDReader(Map map)
    {
        Collection collection;
        ArrayList arraylist;
        boolean flag;
        if (map == null)
        {
            collection = null;
        } else
        {
            collection = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist = new ArrayList();
        if (collection != null)
        {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E))
            {
                arraylist.add(new MultiFormatUPCEANReader(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39))
            {
                arraylist.add(new Code39Reader(flag));
            }
            if (collection.contains(BarcodeFormat.CODE_93))
            {
                arraylist.add(new Code93Reader());
            }
            if (collection.contains(BarcodeFormat.CODE_128))
            {
                arraylist.add(new Code128Reader());
            }
            if (collection.contains(BarcodeFormat.ITF))
            {
                arraylist.add(new ITFReader());
            }
            if (collection.contains(BarcodeFormat.CODABAR))
            {
                arraylist.add(new CodaBarReader());
            }
            if (collection.contains(BarcodeFormat.RSS_14))
            {
                arraylist.add(new RSS14Reader());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED))
            {
                arraylist.add(new RSSExpandedReader());
            }
        }
        if (arraylist.isEmpty())
        {
            arraylist.add(new MultiFormatUPCEANReader(map));
            arraylist.add(new Code39Reader());
            arraylist.add(new CodaBarReader());
            arraylist.add(new Code93Reader());
            arraylist.add(new Code128Reader());
            arraylist.add(new ITFReader());
            arraylist.add(new RSS14Reader());
            arraylist.add(new RSSExpandedReader());
        }
        readers = (OneDReader[])arraylist.toArray(new OneDReader[arraylist.size()]);
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException
    {
        OneDReader aonedreader[];
        int j;
        int k;
        aonedreader = readers;
        k = aonedreader.length;
        j = 0;
_L2:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aonedreader[j];
        obj = ((OneDReader) (obj)).decodeRow(i, bitarray, map);
        return ((Result) (obj));
        ReaderException readerexception;
        readerexception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset()
    {
        OneDReader aonedreader[] = readers;
        int j = aonedreader.length;
        for (int i = 0; i < j; i++)
        {
            aonedreader[i].reset();
        }

    }
}
