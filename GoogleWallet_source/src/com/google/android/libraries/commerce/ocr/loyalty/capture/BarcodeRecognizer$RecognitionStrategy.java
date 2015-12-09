// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.common.base.Stopwatch;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.HybridBinarizer;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeRecognizer, BarcodeDecoder

abstract class <init>
{

    final BarcodeRecognizer this$0;

    private Result tryRecognize(OcrImage ocrimage, Stopwatch stopwatch, Rect rect)
        throws OcrException
    {
        ocrimage = new BinaryBitmap(new HybridBinarizer(getLuminanceSource(ocrimage, rect)));
        rect = BarcodeRecognizer.access$200(BarcodeRecognizer.this).decodeWithState(ocrimage);
        long l = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        Log.d("BarcodeRecognizer", (new StringBuilder(57)).append("barcode decoding preprocessing time: ").append(l).toString());
        int i = ocrimage.getWidth();
        int j = ocrimage.getHeight();
        Log.v("BarcodeRecognizer", (new StringBuilder(59)).append("barcode decoding bitmap dimension: ").append(i).append(", ").append(j).toString());
        if (rect != null)
        {
            BarcodeRecognizer.access$200(BarcodeRecognizer.this).reset();
            return rect;
        }
        BarcodeRecognizer.access$200(BarcodeRecognizer.this).reset();
_L2:
        return null;
        ocrimage;
        ocrimage = String.valueOf(ocrimage);
        Log.e("BarcodeRecognizer", (new StringBuilder(String.valueOf(ocrimage).length() + 19)).append("reader exception : ").append(ocrimage).toString());
        BarcodeRecognizer.access$200(BarcodeRecognizer.this).reset();
        if (true) goto _L2; else goto _L1
_L1:
        ocrimage;
        Log.e("BarcodeRecognizer", "Exception during ZXing decode process (continuing anyway)", ocrimage);
        throw new OcrException(4, ocrimage);
        ocrimage;
        BarcodeRecognizer.access$200(BarcodeRecognizer.this).reset();
        throw ocrimage;
    }

    protected abstract LuminanceSource getLuminanceSource(OcrImage ocrimage, Rect rect);


    private ()
    {
        this$0 = BarcodeRecognizer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
