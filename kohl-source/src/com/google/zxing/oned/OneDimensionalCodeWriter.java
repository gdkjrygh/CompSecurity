// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

public abstract class OneDimensionalCodeWriter
    implements Writer
{

    public OneDimensionalCodeWriter()
    {
    }

    protected static int appendPattern(boolean aflag[], int i, int ai[], boolean flag)
    {
        int k = 0;
        int i1 = ai.length;
        int j = 0;
        while (j < i1) 
        {
            int j1 = ai[j];
            for (int l = 0; l < j1;)
            {
                aflag[i] = flag;
                l++;
                i++;
            }

            k += j1;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j++;
        }
        return k;
    }

    private static BitMatrix renderResult(boolean aflag[], int i, int j, int k)
    {
        int l = aflag.length;
        int i1 = l + k;
        int j1 = Math.max(i, i1);
        k = Math.max(1, j);
        i1 = j1 / i1;
        i = (j1 - l * i1) / 2;
        BitMatrix bitmatrix = new BitMatrix(j1, k);
        for (j = 0; j < l;)
        {
            if (aflag[j])
            {
                bitmatrix.setRegion(i, 0, i1, k);
            }
            j++;
            i += i1;
        }

        return bitmatrix;
    }

    public final BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j)
        throws WriterException
    {
        return encode(s, barcodeformat, i, j, null);
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Negative size is not allowed. Input: ").append(i).append('x').append(j).toString());
        }
        int l = getDefaultMargin();
        int k = l;
        if (map != null)
        {
            barcodeformat = (Integer)map.get(EncodeHintType.MARGIN);
            k = l;
            if (barcodeformat != null)
            {
                k = barcodeformat.intValue();
            }
        }
        return renderResult(encode(s), i, j, k);
    }

    public abstract boolean[] encode(String s);

    public int getDefaultMargin()
    {
        return 10;
    }
}
