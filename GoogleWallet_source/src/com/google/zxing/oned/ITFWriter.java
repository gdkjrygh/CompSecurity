// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDimensionalCodeWriter, ITFReader

public final class ITFWriter extends OneDimensionalCodeWriter
{

    private static final int END_PATTERN[] = {
        3, 1, 1
    };
    private static final int START_PATTERN[] = {
        1, 1, 1, 1
    };

    public ITFWriter()
    {
    }

    public final BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.ITF)
        {
            throw new IllegalArgumentException((new StringBuilder("Can only encode ITF, but got ")).append(barcodeformat).toString());
        } else
        {
            return super.encode(s, barcodeformat, i, j, map);
        }
    }

    public final boolean[] encode(String s)
    {
        int l = s.length();
        if (l % 2 != 0)
        {
            throw new IllegalArgumentException("The lenght of the input should be even");
        }
        if (l > 80)
        {
            throw new IllegalArgumentException((new StringBuilder("Requested contents should be less than 80 digits long, but got ")).append(l).toString());
        }
        boolean aflag[] = new boolean[l * 9 + 9];
        int j = appendPattern(aflag, 0, START_PATTERN, true);
        for (int i = 0; i < l; i += 2)
        {
            int i1 = Character.digit(s.charAt(i), 10);
            int j1 = Character.digit(s.charAt(i + 1), 10);
            int ai[] = new int[18];
            for (int k = 0; k < 5; k++)
            {
                ai[k << 1] = ITFReader.PATTERNS[i1][k];
                ai[(k << 1) + 1] = ITFReader.PATTERNS[j1][k];
            }

            j += appendPattern(aflag, j, ai, true);
        }

        appendPattern(aflag, j, END_PATTERN, true);
        return aflag;
    }

}
