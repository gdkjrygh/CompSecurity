// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture.processors;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.processors.NonNullProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionData;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.android.libraries.commerce.ocr.wobs.pub.DebugResponseInfoParcelable;
import com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class WobsOcrProcessor extends NonNullProcessor
{

    private final ImageUtil imageUtil;
    private final int jpegCompressionRate;
    private final com.google.commerce.ocr.definitions.WireProto.WobType wobType;
    private final WobsOcrClient wobsOcrClient;

    public WobsOcrProcessor(com.google.commerce.ocr.definitions.WireProto.WobType wobtype, WobsOcrClient wobsocrclient, ImageUtil imageutil, int i)
    {
        wobType = wobtype;
        wobsOcrClient = wobsocrclient;
        imageUtil = imageutil;
        jpegCompressionRate = i;
    }

    private boolean isProcessingNeeded(SessionData sessiondata)
    {
        return super.isProcessingNeeded(sessiondata) && ((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result)sessiondata.data).getCardImage() != null && ((SessionOcrResponseHandler)sessiondata.session).onOcrAttempt();
    }

    private void performOcrJpeg(byte abyte0[], boolean flag, com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        Object obj = com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest.newBuilder().setImage(com.google.commerce.ocr.definitions.PrimitivesProto.Image.newBuilder().setImage(ByteString.copyFrom(abyte0))).addWobType(wobType).setDebugInfo(com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo.newBuilder().setReturnFlatVssText(true));
        int i;
        if (flag)
        {
            abyte0 = com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest.CaptureMode.DETECTED;
        } else
        {
            abyte0 = com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest.CaptureMode.SNAP;
        }
        obj = (com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest)((com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest.Builder) (obj)).setCaptureMode(abyte0).build();
        i = ((com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest) (obj)).getImage().getImage().size();
        Log.d("WobsOcrProcessor", (new StringBuilder(35)).append("OCR request image size: ").append(i).toString());
        abyte0 = null;
        obj = wobsOcrClient.recognize(((com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest) (obj)));
        abyte0 = ((byte []) (obj));
_L1:
        IOException ioexception;
        if (abyte0 != null && abyte0.getRecognizedInstanceCount() > 0 && !abyte0.getRecognizedInstanceList().isEmpty())
        {
            ocrresponsehandler.onRecognized(new ArrayList(Lists.transform(abyte0.getRecognizedInstanceList(), new Function() {

                final WobsOcrProcessor this$0;

                private static RecognizedWobInstanceParcelable apply(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance recognizedinstance)
                {
                    return new RecognizedWobInstanceParcelable(recognizedinstance);
                }

                public final volatile Object apply(Object obj1)
                {
                    return apply((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)obj1);
                }

            
            {
                this$0 = WobsOcrProcessor.this;
                super();
            }
            })), new DebugResponseInfoParcelable(abyte0.getDebugInfo()));
            return;
        } else
        {
            ocrresponsehandler.onUnrecognized(null);
            return;
        }
        ioexception;
        ocrresponsehandler.onError(new OcrException(1, ioexception));
          goto _L1
    }

    private Void process(SessionData sessiondata)
    {
        com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result result = (com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result)sessiondata.data;
        sessiondata = (SessionOcrResponseHandler)sessiondata.session;
        try
        {
            byte abyte0[] = imageUtil.nativeToJpeg(result.getCardImage().getData(), jpegCompressionRate);
            OcrImageHolder.setImage(abyte0, (com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side)sessiondata.getSessionIdentifier());
            performOcrJpeg(abyte0, true, sessiondata);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            sessiondata.onError(new OcrException(5, outofmemoryerror));
        }
        return null;
    }

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((SessionData)obj);
    }

    public final void performOneOffOcrJpeg(byte abyte0[], boolean flag, SessionOcrResponseHandler sessionocrresponsehandler)
    {
        if (!sessionocrresponsehandler.onOcrAttempt())
        {
            return;
        } else
        {
            OcrImageHolder.setImage(abyte0, (com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side)sessionocrresponsehandler.getSessionIdentifier());
            performOcrJpeg(abyte0, flag, sessionocrresponsehandler);
            return;
        }
    }

    public final volatile Object process(Object obj)
    {
        return process((SessionData)obj);
    }
}
