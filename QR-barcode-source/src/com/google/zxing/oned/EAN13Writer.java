// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            UPCEANWriter, UPCEANReader, EAN13Reader

public final class EAN13Writer extends UPCEANWriter
{

    private static final int CODE_WIDTH = 95;

    public EAN13Writer()
    {
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.EAN_13)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode EAN_13, but got ").append(barcodeformat).toString());
        } else
        {
            return super.encode(s, barcodeformat, i, j, map);
        }
    }

    public boolean[] encode(String s)
    {
        if (s.length() != 13)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be 13 digits long, but got ").append(s.length()).toString());
        }
        try
        {
            if (!UPCEANReader.checkStandardUPCEANChecksum(s))
            {
                throw new IllegalArgumentException("Contents do not pass checksum");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Illegal contents");
        }
        int i = Integer.parseInt(s.substring(0, 1));
        int k1 = EAN13Reader.FIRST_DIGIT_ENCODINGS[i];
        boolean aflag[] = new boolean[95];
        int k = appendPattern(aflag, 0, UPCEANReader.START_END_PATTERN, true);
        i = 1;
        k += 0;
        for (; i <= 6; i++)
        {
            int j1 = Integer.parseInt(s.substring(i, i + 1));
            int l = j1;
            if ((k1 >> 6 - i & 1) == 1)
            {
                l = j1 + 10;
            }
            k += appendPattern(aflag, k, UPCEANReader.L_AND_G_PATTERNS[l], false);
        }

        k += appendPattern(aflag, k, UPCEANReader.MIDDLE_PATTERN, false);
        for (int j = 7; j <= 12; j++)
        {
            int i1 = Integer.parseInt(s.substring(j, j + 1));
            k += appendPattern(aflag, k, UPCEANReader.L_PATTERNS[i1], true);
        }

        appendPattern(aflag, k, UPCEANReader.START_END_PATTERN, true);
        return aflag;
    }
}
