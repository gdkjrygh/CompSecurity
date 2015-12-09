// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import com.google.android.libraries.commerce.ocr.ui.UserSkipHandler;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            SimpleOcrResponseHandler, BarcodeDecoder

public class BarcodeCaptureModule
{

    public BarcodeCaptureModule()
    {
    }

    static com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo provideDebugRequestInfo()
    {
        return (com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo)com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.newBuilder().build();
    }

    static UserSkipHandler provideDefaultUserSkipHandler(SimpleOcrResponseHandler simpleocrresponsehandler)
    {
        return simpleocrresponsehandler;
    }

    static com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler provideOcrResponseHandler(SimpleOcrResponseHandler simpleocrresponsehandler)
    {
        return simpleocrresponsehandler;
    }

    static SizeSelectionStrategy provideSizeSelectionStrategy()
    {
        return SizeSelectionStrategy.RATIO;
    }

    final BarcodeDecoder provideBarcodeDecoder()
    {
        return new BarcodeDecoder() {

            final BarcodeCaptureModule this$0;
            final MultiFormatReader val$xzingReader;

            public final Result decodeWithState(BinaryBitmap binarybitmap)
                throws NotFoundException
            {
                return xzingReader.decodeWithState(binarybitmap);
            }

            public final void reset()
            {
                xzingReader.reset();
            }

            public final void setHint(Map map)
            {
                xzingReader.setHints(map);
            }

            
            {
                this$0 = BarcodeCaptureModule.this;
                xzingReader = multiformatreader;
                super();
            }
        };
    }
}
