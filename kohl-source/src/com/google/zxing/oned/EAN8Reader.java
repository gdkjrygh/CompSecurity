// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned:
//            UPCEANReader

public final class EAN8Reader extends UPCEANReader
{

    private final int decodeMiddleCounters[] = new int[4];

    public EAN8Reader()
    {
    }

    protected int decodeMiddle(BitArray bitarray, int ai[], StringBuilder stringbuilder)
        throws NotFoundException
    {
        int ai1[] = decodeMiddleCounters;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j1 = bitarray.getSize();
        int k = ai[1];
        for (int i = 0; i < 4 && k < j1; i++)
        {
            stringbuilder.append((char)(decodeDigit(bitarray, ai1, k, L_PATTERNS) + 48));
            int k1 = ai1.length;
            for (int l = 0; l < k1; l++)
            {
                k += ai1[l];
            }

        }

        k = findGuardPattern(bitarray, k, true, MIDDLE_PATTERN)[1];
        for (int j = 0; j < 4 && k < j1; j++)
        {
            stringbuilder.append((char)(decodeDigit(bitarray, ai1, k, L_PATTERNS) + 48));
            int l1 = ai1.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                k += ai1[i1];
            }

        }

        return k;
    }

    BarcodeFormat getBarcodeFormat()
    {
        return BarcodeFormat.EAN_8;
    }
}
