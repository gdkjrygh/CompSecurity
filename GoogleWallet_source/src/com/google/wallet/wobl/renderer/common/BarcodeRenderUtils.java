// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.common;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.pdf417.encoder.Compaction;
import java.util.HashMap;
import java.util.Map;

public class BarcodeRenderUtils
{

    static final int QUIET_ZONE_SIZE = 4;
    private static final Writer WRITER = new MultiFormatWriter();

    public BarcodeRenderUtils()
    {
    }

    public static BarcodeFormat barcodeTypeToZxingBarcodeFormat(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType = new int[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.EAN_8.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.EAN_13.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.UPC_A.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.QR_CODE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODE_39.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODE_128.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.ITF.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417_COMPACT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.CODABAR.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.DATA_MATRIX.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$BarcodeIr$BarcodeType[com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.AZTEC.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType[barcodetype.ordinal()])
        {
        default:
            barcodetype = String.valueOf(barcodetype);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(barcodetype).length() + 37)).append("Barcode type not supported by ZXing: ").append(barcodetype).toString());

        case 1: // '\001'
            return BarcodeFormat.EAN_8;

        case 2: // '\002'
            return BarcodeFormat.EAN_13;

        case 3: // '\003'
            return BarcodeFormat.UPC_A;

        case 4: // '\004'
            return BarcodeFormat.QR_CODE;

        case 5: // '\005'
            return BarcodeFormat.CODE_39;

        case 6: // '\006'
            return BarcodeFormat.CODE_128;

        case 7: // '\007'
            return BarcodeFormat.ITF;

        case 8: // '\b'
        case 9: // '\t'
            return BarcodeFormat.PDF_417;

        case 10: // '\n'
            return BarcodeFormat.CODABAR;

        case 11: // '\013'
            return BarcodeFormat.DATA_MATRIX;

        case 12: // '\f'
            return BarcodeFormat.AZTEC;
        }
    }

    public static BitMatrix generateBarcodeBitMatrix(String s, com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, int i, int j)
        throws WriterException, IllegalArgumentException
    {
        return WRITER.encode(s, barcodeTypeToZxingBarcodeFormat(barcodetype), i, j, getEncodeHints(barcodetype));
    }

    private static Map getEncodeHints(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype)
    {
        HashMap hashmap = new HashMap();
        switch (_cls1..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType[barcodetype.ordinal()])
        {
        case 10: // '\n'
        default:
            return hashmap;

        case 8: // '\b'
            hashmap.put(EncodeHintType.PDF417_COMPACT, Boolean.FALSE);
            hashmap.put(EncodeHintType.PDF417_COMPACTION, Compaction.TEXT);
            return hashmap;

        case 9: // '\t'
            hashmap.put(EncodeHintType.PDF417_COMPACT, Boolean.TRUE);
            hashmap.put(EncodeHintType.PDF417_COMPACTION, Compaction.TEXT);
            return hashmap;

        case 11: // '\013'
            hashmap.put(EncodeHintType.DATA_MATRIX_SHAPE, SymbolShapeHint.FORCE_SQUARE);
            break;
        }
        return hashmap;
    }

    public static BitMatrix renderPaddingIfNecessary(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, BitMatrix bitmatrix)
    {
        return renderPaddingIfNecessary(barcodetype, bitmatrix, 4);
    }

    public static BitMatrix renderPaddingIfNecessary(com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, BitMatrix bitmatrix, int i)
    {
        if (barcodetype != com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.AZTEC && barcodetype != com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.DATA_MATRIX)
        {
            return bitmatrix;
        }
        int l = bitmatrix.getWidth() + (i << 1);
        int i1 = bitmatrix.getHeight() + (i << 1);
        barcodetype = new BitMatrix(l, i1);
        for (int j = i; j < i1 - i; j++)
        {
            for (int k = i; k < l - i; k++)
            {
                if (bitmatrix.get(k - i, j - i))
                {
                    barcodetype.set(k, j);
                }
            }

        }

        return barcodetype;
    }

}
