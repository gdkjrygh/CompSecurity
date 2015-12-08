// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.aztec.AztecWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.DataMatrixWriter;
import com.google.zxing.oned.CodaBarWriter;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.oned.Code39Writer;
import com.google.zxing.oned.EAN13Writer;
import com.google.zxing.oned.EAN8Writer;
import com.google.zxing.oned.ITFWriter;
import com.google.zxing.oned.UPCAWriter;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            Writer, WriterException, BarcodeFormat

public final class MultiFormatWriter
    implements Writer
{

    public MultiFormatWriter()
    {
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j)
        throws WriterException
    {
        return encode(s, barcodeformat, i, j, null);
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$google$zxing$BarcodeFormat[];

            static 
            {
                $SwitchMap$com$google$zxing$BarcodeFormat = new int[BarcodeFormat.values().length];
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.EAN_8.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.EAN_13.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.UPC_A.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.QR_CODE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.CODE_39.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.CODE_128.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.ITF.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.PDF_417.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.CODABAR.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.DATA_MATRIX.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$zxing$BarcodeFormat[BarcodeFormat.AZTEC.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.zxing.BarcodeFormat[barcodeformat.ordinal()];
        JVM INSTR tableswitch 1 11: default 68
    //                   1 95
    //                   2 119
    //                   3 131
    //                   4 143
    //                   5 155
    //                   6 167
    //                   7 179
    //                   8 191
    //                   9 203
    //                   10 215
    //                   11 227;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("No encoder available for format ").append(barcodeformat).toString());
_L2:
        Object obj = new EAN8Writer();
_L14:
        return ((Writer) (obj)).encode(s, barcodeformat, i, j, map);
_L3:
        obj = new EAN13Writer();
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new UPCAWriter();
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new QRCodeWriter();
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new Code39Writer();
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new Code128Writer();
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new ITFWriter();
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new PDF417Writer();
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new CodaBarWriter();
        continue; /* Loop/switch isn't completed */
_L11:
        obj = new DataMatrixWriter();
        continue; /* Loop/switch isn't completed */
_L12:
        obj = new AztecWriter();
        if (true) goto _L14; else goto _L13
_L13:
    }
}
