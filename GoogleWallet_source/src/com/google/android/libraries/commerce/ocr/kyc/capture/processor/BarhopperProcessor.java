// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import android.graphics.Point;
import android.util.Log;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.Barhopper;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.common.collect.ImmutableMap;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.capture.processor:
//            BarcodeProcessor

public final class BarhopperProcessor extends BarcodeProcessor
{

    private static final ImmutableMap FORMAT_TO_TYPE;
    private static final String TAG = com/google/android/libraries/barhopper/Barhopper.getSimpleName();
    private final ImageUtil imageUtil;
    private final RecognitionOptions recognitionOptions = new RecognitionOptions();

    public BarhopperProcessor(ImageUtil imageutil, int i)
    {
        imageUtil = imageutil;
        recognitionOptions.setBarcodeFormats(i);
    }

    private com.google.commerce.ocr.definitions.PrimitivesProto.Path.PathComponent cornerPointToPathComponent(Point point, OcrImage ocrimage)
    {
        return (com.google.commerce.ocr.definitions.PrimitivesProto.Path.PathComponent)com.google.commerce.ocr.definitions.PrimitivesProto.Path.PathComponent.newBuilder().setEndPoint(cornerPointToPoint(point, ocrimage)).build();
    }

    private com.google.commerce.ocr.definitions.PrimitivesProto.Path.Point cornerPointToPoint(Point point, OcrImage ocrimage)
    {
        ImageUtil imageutil = imageUtil;
        point = ImageUtil.rotatePointByImageOrientation(point, ocrimage);
        return (com.google.commerce.ocr.definitions.PrimitivesProto.Path.Point)com.google.commerce.ocr.definitions.PrimitivesProto.Path.Point.newBuilder().setX(point.x).setY(point.y).build();
    }

    public final com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode getBarcode(OcrImage ocrimage)
    {
        Barcode abarcode[] = Barhopper.recognize(ocrimage.getWidth(), ocrimage.getHeight(), ocrimage.getData(), recognitionOptions);
        if (abarcode.length > 0)
        {
            Barcode barcode = abarcode[0];
            com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.Builder builder = com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.newBuilder();
            com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Builder builder1 = com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.newBuilder().setValue(barcode.rawValue);
            Object obj;
            if (FORMAT_TO_TYPE.containsKey(Integer.valueOf(barcode.format)))
            {
                obj = (com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type)FORMAT_TO_TYPE.get(Integer.valueOf(barcode.format));
            } else
            {
                obj = com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UNKNOWN_FORMAT;
            }
            obj = builder.setValue(builder1.setType(((com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type) (obj))));
            if (barcode.cornerPoints == null || barcode.cornerPoints.length != 4)
            {
                String s = TAG;
                if (barcode.cornerPoints == null)
                {
                    ocrimage = "no";
                } else
                {
                    ocrimage = Integer.valueOf(barcode.cornerPoints.length);
                }
                ocrimage = String.valueOf(ocrimage);
                Log.w(s, (new StringBuilder(String.valueOf(ocrimage).length() + 26)).append("Barcode has ").append(ocrimage).append(" corner points").toString());
            } else
            {
                ((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.Builder) (obj)).setBounds(com.google.commerce.ocr.definitions.PrimitivesProto.Path.newBuilder().setStartPoint(cornerPointToPoint(barcode.cornerPoints[0], ocrimage)).addPathComponent(cornerPointToPathComponent(barcode.cornerPoints[1], ocrimage)).addPathComponent(cornerPointToPathComponent(barcode.cornerPoints[2], ocrimage)).addPathComponent(cornerPointToPathComponent(barcode.cornerPoints[3], ocrimage)).addConstraint(com.google.commerce.ocr.definitions.PrimitivesProto.Path.Constraint.CONSTRAINT_BOX).addConstraint(com.google.commerce.ocr.definitions.PrimitivesProto.Path.Constraint.CONSTRAINT_LINEAR));
            }
            return (com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.Builder) (obj)).build();
        } else
        {
            return com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.getDefaultInstance();
        }
    }

    static 
    {
        FORMAT_TO_TYPE = ImmutableMap.builder().put(Integer.valueOf(1), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_128).put(Integer.valueOf(2), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_39).put(Integer.valueOf(4), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_93).put(Integer.valueOf(8), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODABAR).put(Integer.valueOf(16), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.DATA_MATRIX).put(Integer.valueOf(32), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_13).put(Integer.valueOf(64), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_8).put(Integer.valueOf(256), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.QR_CODE).put(Integer.valueOf(512), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_A).put(Integer.valueOf(1024), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_E).put(Integer.valueOf(2048), com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.PDF_417).build();
    }
}
