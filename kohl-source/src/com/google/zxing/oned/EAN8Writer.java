// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            UPCEANWriter, UPCEANReader

public final class EAN8Writer extends UPCEANWriter
{

    private static final int CODE_WIDTH = 67;

    public EAN8Writer()
    {
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.EAN_8)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode EAN_8, but got ").append(barcodeformat).toString());
        } else
        {
            return super.encode(s, barcodeformat, i, j, map);
        }
    }

    public boolean[] encode(String s)
    {
        if (s.length() != 8)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be 8 digits long, but got ").append(s.length()).toString());
        }
        boolean aflag[] = new boolean[67];
        int k = 0 + appendPattern(aflag, 0, UPCEANReader.START_END_PATTERN, true);
        for (int i = 0; i <= 3; i++)
        {
            int l = Integer.parseInt(s.substring(i, i + 1));
            k += appendPattern(aflag, k, UPCEANReader.L_PATTERNS[l], false);
        }

        k += appendPattern(aflag, k, UPCEANReader.MIDDLE_PATTERN, false);
        for (int j = 4; j <= 7; j++)
        {
            int i1 = Integer.parseInt(s.substring(j, j + 1));
            k += appendPattern(aflag, k, UPCEANReader.L_PATTERNS[i1], true);
        }

        appendPattern(aflag, k, UPCEANReader.START_END_PATTERN, true);
        return aflag;
    }
}
