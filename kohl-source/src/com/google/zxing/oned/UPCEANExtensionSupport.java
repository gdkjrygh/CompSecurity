// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned:
//            UPCEANExtension2Support, UPCEANExtension5Support, UPCEANReader

final class UPCEANExtensionSupport
{

    private static final int EXTENSION_START_PATTERN[] = {
        1, 1, 2
    };
    private final UPCEANExtension5Support fiveSupport = new UPCEANExtension5Support();
    private final UPCEANExtension2Support twoSupport = new UPCEANExtension2Support();

    UPCEANExtensionSupport()
    {
    }

    Result decodeRow(int i, BitArray bitarray, int j)
        throws NotFoundException
    {
        int ai[] = UPCEANReader.findGuardPattern(bitarray, j, false, EXTENSION_START_PATTERN);
        Result result;
        try
        {
            result = fiveSupport.decodeRow(i, bitarray, ai);
        }
        catch (ReaderException readerexception)
        {
            return twoSupport.decodeRow(i, bitarray, ai);
        }
        return result;
    }

}
