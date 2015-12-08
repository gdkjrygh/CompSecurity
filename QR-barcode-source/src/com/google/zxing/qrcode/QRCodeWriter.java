// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import java.util.Map;

public final class QRCodeWriter
    implements Writer
{

    private static final int QUIET_ZONE_SIZE = 4;

    public QRCodeWriter()
    {
    }

    private static BitMatrix renderResult(QRCode qrcode, int i, int j, int k)
    {
        qrcode = qrcode.getMatrix();
        if (qrcode == null)
        {
            throw new IllegalStateException();
        }
        int k1 = qrcode.getWidth();
        int l1 = qrcode.getHeight();
        int l = (k << 1) + k1;
        int j1 = (k << 1) + l1;
        i = Math.max(i, l);
        k = Math.max(j, j1);
        int i2 = Math.min(i / l, k / j1);
        j1 = (i - k1 * i2) / 2;
        j = (k - l1 * i2) / 2;
        BitMatrix bitmatrix = new BitMatrix(i, k);
        for (i = 0; i < l1; i++)
        {
            int i1 = 0;
            for (k = j1; i1 < k1; k += i2)
            {
                if (qrcode.get(i1, i) == 1)
                {
                    bitmatrix.setRegion(k, j, i2, i2);
                }
                i1++;
            }

            j += i2;
        }

        return bitmatrix;
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j)
        throws WriterException
    {
        return encode(s, barcodeformat, i, j, null);
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        Object obj;
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeformat != BarcodeFormat.QR_CODE)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode QR_CODE, but got ").append(barcodeformat).toString());
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested dimensions are too small: ").append(i).append('x').append(j).toString());
        }
        barcodeformat = ErrorCorrectionLevel.L;
        obj = barcodeformat;
        if (map == null) goto _L2; else goto _L1
_L1:
        Integer integer;
        obj = (ErrorCorrectionLevel)map.get(EncodeHintType.ERROR_CORRECTION);
        if (obj != null)
        {
            barcodeformat = ((BarcodeFormat) (obj));
        }
        integer = (Integer)map.get(EncodeHintType.MARGIN);
        obj = barcodeformat;
        if (integer == null) goto _L2; else goto _L3
_L3:
        int k = integer.intValue();
_L5:
        return renderResult(Encoder.encode(s, barcodeformat, map), i, j, k);
_L2:
        k = 4;
        barcodeformat = ((BarcodeFormat) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }
}
