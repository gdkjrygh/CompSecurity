// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.oned:
//            UPCEANReader

public final class EAN13Reader extends UPCEANReader
{

    static final int FIRST_DIGIT_ENCODINGS[] = {
        0, 11, 13, 14, 19, 25, 28, 21, 22, 26
    };
    private final int decodeMiddleCounters[] = new int[4];

    public EAN13Reader()
    {
    }

    private static void determineFirstDigit(StringBuilder stringbuilder, int i)
        throws NotFoundException
    {
        for (int j = 0; j < 10; j++)
        {
            if (i == FIRST_DIGIT_ENCODINGS[j])
            {
                stringbuilder.insert(0, (char)(j + 48));
                return;
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    protected int decodeMiddle(BitArray bitarray, int ai[], StringBuilder stringbuilder)
        throws NotFoundException
    {
        int ai1[] = decodeMiddleCounters;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int i2 = bitarray.getSize();
        int i = ai[1];
        int j = 0;
        int l;
        int k1;
        for (l = 0; j < 6 && i < i2; l = k1)
        {
            int j2 = decodeDigit(bitarray, ai1, i, L_AND_G_PATTERNS);
            stringbuilder.append((char)(j2 % 10 + 48));
            int k2 = ai1.length;
            for (int j1 = 0; j1 < k2; j1++)
            {
                i += ai1[j1];
            }

            k1 = l;
            if (j2 >= 10)
            {
                k1 = l | 1 << 5 - j;
            }
            j++;
        }

        determineFirstDigit(stringbuilder, l);
        i = findGuardPattern(bitarray, i, true, MIDDLE_PATTERN)[1];
        for (int k = 0; k < 6 && i < i2; k++)
        {
            stringbuilder.append((char)(decodeDigit(bitarray, ai1, i, L_PATTERNS) + 48));
            int l1 = ai1.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                i += ai1[i1];
            }

        }

        return i;
    }

    BarcodeFormat getBarcodeFormat()
    {
        return BarcodeFormat.EAN_13;
    }

}
