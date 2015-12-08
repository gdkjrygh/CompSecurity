// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDimensionalCodeWriter, Code39Reader

public final class Code39Writer extends OneDimensionalCodeWriter
{

    public Code39Writer()
    {
    }

    private static void toIntArray(int i, int ai[])
    {
        int j = 0;
        while (j < 9) 
        {
            int k;
            if ((i & 1 << j) == 0)
            {
                k = 1;
            } else
            {
                k = 2;
            }
            ai[j] = k;
            j++;
        }
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.CODE_39)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode CODE_39, but got ").append(barcodeformat).toString());
        } else
        {
            return super.encode(s, barcodeformat, i, j, map);
        }
    }

    public boolean[] encode(String s)
    {
        int l1 = s.length();
        if (l1 > 80)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be less than 80 digits long, but got ").append(l1).toString());
        }
        int ai[] = new int[9];
        int l = l1 + 25;
        for (int i = 0; i < l1; i++)
        {
            int i1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(s.charAt(i));
            if (i1 < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad contents: ").append(s).toString());
            }
            toIntArray(Code39Reader.CHARACTER_ENCODINGS[i1], ai);
            int i2 = ai.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                l += ai[j1];
            }

        }

        boolean aflag[] = new boolean[l];
        toIntArray(Code39Reader.CHARACTER_ENCODINGS[39], ai);
        int j = appendPattern(aflag, 0, ai, true);
        int ai1[] = new int[1];
        ai1[0] = 1;
        l = j + appendPattern(aflag, j, ai1, false);
        for (int k = l1 - 1; k >= 0; k--)
        {
            int k1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(s.charAt(k));
            toIntArray(Code39Reader.CHARACTER_ENCODINGS[k1], ai);
            l += appendPattern(aflag, l, ai, true);
            l += appendPattern(aflag, l, ai1, false);
        }

        toIntArray(Code39Reader.CHARACTER_ENCODINGS[39], ai);
        appendPattern(aflag, l, ai, true);
        return aflag;
    }
}
