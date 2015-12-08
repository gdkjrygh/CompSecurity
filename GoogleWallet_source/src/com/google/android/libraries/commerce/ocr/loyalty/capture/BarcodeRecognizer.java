// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.capture.OcrRecognizer;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeDecoder, RotatedPlanarYUVLuminanceSource

public final class BarcodeRecognizer
    implements OcrRecognizer
{
    abstract class RecognitionStrategy
    {

        final BarcodeRecognizer this$0;

        private Result tryRecognize(OcrImage ocrimage, Stopwatch stopwatch, Rect rect)
            throws OcrException
        {
            ocrimage = new BinaryBitmap(new HybridBinarizer(getLuminanceSource(ocrimage, rect)));
            rect = reader.decodeWithState(ocrimage);
            long l = stopwatch.elapsed(TimeUnit.MILLISECONDS);
            Log.d("BarcodeRecognizer", (new StringBuilder(57)).append("barcode decoding preprocessing time: ").append(l).toString());
            int i = ocrimage.getWidth();
            int j = ocrimage.getHeight();
            Log.v("BarcodeRecognizer", (new StringBuilder(59)).append("barcode decoding bitmap dimension: ").append(i).append(", ").append(j).toString());
            if (rect != null)
            {
                reader.reset();
                return rect;
            }
            reader.reset();
_L2:
            return null;
            ocrimage;
            ocrimage = String.valueOf(ocrimage);
            Log.e("BarcodeRecognizer", (new StringBuilder(String.valueOf(ocrimage).length() + 19)).append("reader exception : ").append(ocrimage).toString());
            reader.reset();
            if (true) goto _L2; else goto _L1
_L1:
            ocrimage;
            Log.e("BarcodeRecognizer", "Exception during ZXing decode process (continuing anyway)", ocrimage);
            throw new OcrException(4, ocrimage);
            ocrimage;
            reader.reset();
            throw ocrimage;
        }

        protected abstract LuminanceSource getLuminanceSource(OcrImage ocrimage, Rect rect);


        private RecognitionStrategy()
        {
            this$0 = BarcodeRecognizer.this;
            super();
        }

    }


    static final ImmutableMap BARCODE_TYPE_MAP;
    private final BarcodeDecoder reader;
    private final List recognitionStrategies;
    private final OcrRegionOfInterestProvider roiAreaProvider;

    public BarcodeRecognizer(BarcodeDecoder barcodedecoder, OcrRegionOfInterestProvider ocrregionofinterestprovider)
    {
        reader = barcodedecoder;
        roiAreaProvider = ocrregionofinterestprovider;
        reader.setHint(ImmutableMap.of(DecodeHintType.RETURN_CODABAR_START_END, Boolean.TRUE, DecodeHintType.POSSIBLE_FORMATS, BARCODE_TYPE_MAP.keySet()));
        barcodedecoder = new RecognitionStrategy() {

            final BarcodeRecognizer this$0;

            protected final LuminanceSource getLuminanceSource(OcrImage ocrimage, Rect rect)
            {
                return new PlanarYUVLuminanceSource(ocrimage.getData(), ocrimage.getWidth(), ocrimage.getHeight(), rect.left, rect.top, rect.width(), rect.height(), false);
            }

            
            {
                this$0 = BarcodeRecognizer.this;
                super();
            }
        };
        recognitionStrategies = ImmutableList.of(new RecognitionStrategy() {

            final BarcodeRecognizer this$0;

            protected final LuminanceSource getLuminanceSource(OcrImage ocrimage, Rect rect)
            {
                return new RotatedPlanarYUVLuminanceSource(ocrimage.getData(), ocrimage.getWidth(), ocrimage.getHeight(), rect, new byte[rect.width() * rect.height()]);
            }

            
            {
                this$0 = BarcodeRecognizer.this;
                super();
            }
        }, barcodedecoder);
    }

    private static ArrayList fromZxingResult(Result result)
    {
        com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type type;
        if (BARCODE_TYPE_MAP.containsKey(result.getBarcodeFormat()))
        {
            type = (com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type)BARCODE_TYPE_MAP.get(result.getBarcodeFormat());
        } else
        {
            type = com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UNKNOWN_FORMAT;
        }
        result = (com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode.newBuilder().setScore(1.0F).setValue(com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.newBuilder().setType(type).setValue(result.getText())).build();
        return Lists.newArrayList(new RecognizedWobInstanceParcelable[] {
            new RecognizedWobInstanceParcelable((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)com.google.commerce.ocr.definitions.WireProto.RecognizedInstance.newBuilder().setWobType(com.google.commerce.ocr.definitions.WireProto.WobType.UNKNOWN).addBarcode(result).build())
        });
    }

    public final void performOcr(OcrImage ocrimage, com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        Object obj;
        OcrException ocrexception;
        Stopwatch stopwatch;
        Rect rect;
        Iterator iterator;
        stopwatch = Stopwatch.createStarted();
        int i = ocrimage.getData().length;
        Log.d("BarcodeRecognizer", (new StringBuilder(40)).append("barcode decoding image size: ").append(i).toString());
        rect = roiAreaProvider.getBoundingBoxRectRelativeToCameraPreview();
        ocrresponsehandler.onOcrAttempt();
        obj = null;
        ocrexception = null;
        iterator = recognitionStrategies.iterator();
_L2:
        Object obj1;
        obj1 = obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj1 = (RecognitionStrategy)iterator.next();
        obj1 = ((RecognitionStrategy) (obj1)).tryRecognize(ocrimage, stopwatch, rect);
        obj = obj1;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        OutOfMemoryError outofmemoryerror;
        long l;
        if (obj1 != null)
        {
            ocrresponsehandler.onRecognized(fromZxingResult(((Result) (obj1))));
        } else
        if (ocrexception == null)
        {
            ocrresponsehandler.onUnrecognized();
        } else
        {
            ocrresponsehandler.onError(ocrexception);
        }
        ocrimage = String.valueOf(Thread.currentThread());
        l = stopwatch.stop().elapsed(TimeUnit.MILLISECONDS);
        Log.d("BarcodeRecognizer", (new StringBuilder(String.valueOf(ocrimage).length() + 51)).append(ocrimage).append(": total barcode decoding time: ").append(l).toString());
        return;
        ocrexception;
        continue; /* Loop/switch isn't completed */
        outofmemoryerror;
        Log.w("BarcodeRecognizer", "Ran out of memory for a barcode matrix, skipping");
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        BARCODE_TYPE_MAP = ImmutableMap.builder().put(BarcodeFormat.AZTEC, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.AZTEC).put(BarcodeFormat.CODABAR, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODABAR).put(BarcodeFormat.CODE_39, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_39).put(BarcodeFormat.CODE_128, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.CODE_128).put(BarcodeFormat.DATA_MATRIX, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.DATA_MATRIX).put(BarcodeFormat.EAN_13, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.EAN_13).put(BarcodeFormat.ITF, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.ITF_14).put(BarcodeFormat.PDF_417, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.PDF_417).put(BarcodeFormat.QR_CODE, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.QR_CODE).put(BarcodeFormat.UPC_A, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_A).put(BarcodeFormat.UPC_E, com.google.commerce.ocr.definitions.PrimitivesProto.Barcode.Type.UPC_E).build();
    }

}
