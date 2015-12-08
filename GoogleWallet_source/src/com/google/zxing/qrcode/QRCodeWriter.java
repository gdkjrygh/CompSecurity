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
        int l = k1 + (k << 1);
        int j1 = l1 + (k << 1);
        k = Math.max(i, l);
        j = Math.max(j, j1);
        int i2 = Math.min(k / l, j / j1);
        j1 = (k - k1 * i2) / 2;
        i = (j - l1 * i2) / 2;
        BitMatrix bitmatrix = new BitMatrix(k, j);
        for (j = 0; j < l1;)
        {
            int i1 = 0;
            for (k = j1; i1 < k1; k += i2)
            {
                if (qrcode.get(i1, j) == 1)
                {
                    bitmatrix.setRegion(k, i, i2, i2);
                }
                i1++;
            }

            j++;
            i += i2;
        }

        return bitmatrix;
    }

    public final BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeformat != BarcodeFormat.QR_CODE)
        {
            throw new IllegalArgumentException((new StringBuilder("Can only encode QR_CODE, but got ")).append(barcodeformat).toString());
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Requested dimensions are too small: ")).append(i).append('x').append(j).toString());
        }
        barcodeformat = ErrorCorrectionLevel.L;
        byte byte0 = 4;
        Object obj = barcodeformat;
        int k = byte0;
        if (map != null)
        {
            obj = (ErrorCorrectionLevel)map.get(EncodeHintType.ERROR_CORRECTION);
            if (obj != null)
            {
                barcodeformat = ((BarcodeFormat) (obj));
            }
            Integer integer = (Integer)map.get(EncodeHintType.MARGIN);
            obj = barcodeformat;
            k = byte0;
            if (integer != null)
            {
                k = integer.intValue();
                obj = barcodeformat;
            }
        }
        return renderResult(Encoder.encode(s, ((ErrorCorrectionLevel) (obj)), map), i, j, k);
    }
}
