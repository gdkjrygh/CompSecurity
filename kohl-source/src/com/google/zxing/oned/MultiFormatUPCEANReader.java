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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDReader, EAN13Reader, EAN8Reader, UPCEReader, 
//            UPCEANReader, UPCAReader

public final class MultiFormatUPCEANReader extends OneDReader
{

    private final UPCEANReader readers[];

    public MultiFormatUPCEANReader(Map map)
    {
        ArrayList arraylist;
        if (map == null)
        {
            map = null;
        } else
        {
            map = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        arraylist = new ArrayList();
        if (map == null) goto _L2; else goto _L1
_L1:
        if (!map.contains(BarcodeFormat.EAN_13)) goto _L4; else goto _L3
_L3:
        arraylist.add(new EAN13Reader());
_L6:
        if (map.contains(BarcodeFormat.EAN_8))
        {
            arraylist.add(new EAN8Reader());
        }
        if (map.contains(BarcodeFormat.UPC_E))
        {
            arraylist.add(new UPCEReader());
        }
_L2:
        if (arraylist.isEmpty())
        {
            arraylist.add(new EAN13Reader());
            arraylist.add(new EAN8Reader());
            arraylist.add(new UPCEReader());
        }
        readers = (UPCEANReader[])arraylist.toArray(new UPCEANReader[arraylist.size()]);
        return;
_L4:
        if (map.contains(BarcodeFormat.UPC_A))
        {
            arraylist.add(new UPCAReader());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException
    {
        int ai[];
        UPCEANReader aupceanreader[];
        int j;
        int k;
        ai = UPCEANReader.findStartGuardPattern(bitarray);
        aupceanreader = readers;
        k = aupceanreader.length;
        j = 0;
_L2:
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = aupceanreader[j];
        obj = ((UPCEANReader) (obj)).decodeRow(i, bitarray, ai, map);
        if (((Result) (obj)).getBarcodeFormat() == BarcodeFormat.EAN_13 && ((Result) (obj)).getText().charAt(0) == '0')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (map == null)
        {
            bitarray = null;
        } else
        {
            bitarray = (Collection)map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        if (bitarray == null || bitarray.contains(BarcodeFormat.UPC_A))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0 && j != 0)
        {
            bitarray = new Result(((Result) (obj)).getText().substring(1), ((Result) (obj)).getRawBytes(), ((Result) (obj)).getResultPoints(), BarcodeFormat.UPC_A);
            bitarray.putAllMetadata(((Result) (obj)).getResultMetadata());
            return bitarray;
        } else
        {
            return ((Result) (obj));
        }
        obj;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        throw NotFoundException.getNotFoundInstance();
    }

    public void reset()
    {
        UPCEANReader aupceanreader[] = readers;
        int j = aupceanreader.length;
        for (int i = 0; i < j; i++)
        {
            aupceanreader[i].reset();
        }

    }
}
