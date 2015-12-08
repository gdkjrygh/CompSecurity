// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

public class RecognizedBarcodeConverter
    implements Function
{

    static final ImmutableMap BARCODE_TYPES;

    RecognizedBarcodeConverter()
    {
    }

    private static com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode apply(com.google.wallet.proto.api.NanoWalletOcr.RecognizedBarcode recognizedbarcode)
    {
        Object obj = com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.newBuilder();
        if (recognizedbarcode.barcode != null)
        {
            com.google.wallet.proto.NanoWalletEntities.Barcode barcode = recognizedbarcode.barcode;
            if (barcode.type != null)
            {
                ((com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Builder) (obj)).setType((com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type)Optional.fromNullable(BARCODE_TYPES.get(barcode.type)).or(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UNKNOWN_FORMAT));
            }
            if (barcode.value != null)
            {
                ((com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Builder) (obj)).setValue(barcode.value);
            }
        }
        obj = com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.newBuilder().setValue(((com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Builder) (obj)));
        float f;
        if (recognizedbarcode.score != null)
        {
            f = recognizedbarcode.score.floatValue();
        } else
        {
            f = 0.0F;
        }
        return (com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.Builder) (obj)).setScore(f).build();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.wallet.proto.api.NanoWalletOcr.RecognizedBarcode)obj);
    }

    static 
    {
        BARCODE_TYPES = ImmutableMap.builder().put(Integer.valueOf(1), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UNKNOWN_FORMAT).put(Integer.valueOf(2), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.AZTEC).put(Integer.valueOf(6), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODABAR).put(Integer.valueOf(3), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_39).put(Integer.valueOf(5), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_128).put(Integer.valueOf(7), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.DATA_MATRIX).put(Integer.valueOf(8), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_8).put(Integer.valueOf(9), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_13).put(Integer.valueOf(10), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.ITF_14).put(Integer.valueOf(11), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.PDF_417).put(Integer.valueOf(14), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.QR_CODE).put(Integer.valueOf(15), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_A).put(Integer.valueOf(16), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_E).build();
    }
}
