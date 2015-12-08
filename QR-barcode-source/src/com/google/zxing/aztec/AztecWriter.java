// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.util.Map;

public final class AztecWriter
    implements Writer
{

    private static final Charset DEFAULT_CHARSET = Charset.forName("ISO-8859-1");

    public AztecWriter()
    {
    }

    private static BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Charset charset, int k, int l)
    {
        if (barcodeformat != BarcodeFormat.AZTEC)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode AZTEC, but got ").append(barcodeformat).toString());
        } else
        {
            return renderResult(Encoder.encode(s.getBytes(charset), k, l), i, j);
        }
    }

    private static BitMatrix renderResult(AztecCode azteccode, int i, int j)
    {
        azteccode = azteccode.getMatrix();
        if (azteccode == null)
        {
            throw new IllegalStateException();
        }
        int k1 = azteccode.getWidth();
        int l1 = azteccode.getHeight();
        i = Math.max(i, k1);
        int k = Math.max(j, l1);
        int i2 = Math.min(i / k1, k / l1);
        int j1 = (i - k1 * i2) / 2;
        j = (k - l1 * i2) / 2;
        BitMatrix bitmatrix = new BitMatrix(i, k);
        for (i = 0; i < l1; i++)
        {
            int l = j1;
            for (int i1 = 0; i1 < k1;)
            {
                if (azteccode.get(i1, i))
                {
                    bitmatrix.setRegion(l, j, i2, i2);
                }
                i1++;
                l += i2;
            }

            j += i2;
        }

        return bitmatrix;
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j)
    {
        return encode(s, barcodeformat, i, j, null);
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
    {
        Number number;
        Object obj;
        int k;
        int l;
        if (map == null)
        {
            obj = null;
        } else
        {
            obj = (String)map.get(EncodeHintType.CHARACTER_SET);
        }
        if (map == null)
        {
            number = null;
        } else
        {
            number = (Number)map.get(EncodeHintType.ERROR_CORRECTION);
        }
        if (map == null)
        {
            map = null;
        } else
        {
            map = (Integer)map.get(EncodeHintType.AZTEC_LAYERS);
        }
        if (obj == null)
        {
            obj = DEFAULT_CHARSET;
        } else
        {
            obj = Charset.forName(((String) (obj)));
        }
        if (number == null)
        {
            k = 33;
        } else
        {
            k = number.intValue();
        }
        if (map == null)
        {
            l = 0;
        } else
        {
            l = map.intValue();
        }
        return encode(s, barcodeformat, i, j, ((Charset) (obj)), k, l);
    }

}
