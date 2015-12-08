// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            EAN13Writer

public final class UPCAWriter
    implements Writer
{

    private final EAN13Writer subWriter = new EAN13Writer();

    public UPCAWriter()
    {
    }

    private static String preencode(String s)
    {
        int i = s.length();
        String s1;
        if (i == 11)
        {
            int j = 0;
            i = 0;
            while (i < 11) 
            {
                char c = s.charAt(i);
                byte byte0;
                if (i % 2 == 0)
                {
                    byte0 = 3;
                } else
                {
                    byte0 = 1;
                }
                j += byte0 * (c - 48);
                i++;
            }
            s1 = (new StringBuilder()).append(s).append((1000 - j) % 10).toString();
        } else
        {
            s1 = s;
            if (i != 12)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be 11 or 12 digits long, but got ").append(s.length()).toString());
            }
        }
        return (new StringBuilder()).append('0').append(s1).toString();
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j)
        throws WriterException
    {
        return encode(s, barcodeformat, i, j, null);
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.UPC_A)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode UPC-A, but got ").append(barcodeformat).toString());
        } else
        {
            return subWriter.encode(preencode(s), BarcodeFormat.EAN_13, i, j, map);
        }
    }
}
