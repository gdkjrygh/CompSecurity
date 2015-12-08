// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.capture.OcrRecognizer;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;
import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleWobsOcrRecognizer
    implements OcrRecognizer
{

    private static final Function TO_PARCELABLE_INSTANCE = new Function() {

        private static RecognizedWobInstanceParcelable apply(com.google.commerce.ocr.definitions.WireProto.RecognizedInstance recognizedinstance)
        {
            return new RecognizedWobInstanceParcelable(recognizedinstance);
        }

        public final volatile Object apply(Object obj)
        {
            return apply((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)obj);
        }

    };
    private final com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugRequestInfo;
    private final InstrumentationSupervisor instrumentationSupervisor;
    private final AtomicInteger requestCount = new AtomicInteger();
    private final int requestLimit;
    private final AtomicInteger responseCount = new AtomicInteger();
    private final Stopwatch scanStopwatch = Stopwatch.createStarted();
    private final com.google.commerce.ocr.definitions.WireProto.WobType wobType;
    private final WobsOcrClient wobsOcrClient;

    public SimpleWobsOcrRecognizer(WobsOcrClient wobsocrclient, com.google.commerce.ocr.definitions.WireProto.WobType wobtype, InstrumentationSupervisor instrumentationsupervisor, com.google.commerce.ocr.definitions.WireProto.DebugRequestInfo debugrequestinfo, int i)
    {
        wobsOcrClient = wobsocrclient;
        wobType = wobtype;
        instrumentationSupervisor = instrumentationsupervisor;
        requestLimit = i;
        debugRequestInfo = debugrequestinfo;
    }

    private static String getStringForRecogizedWobDataResponse(com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse recognizewobdataresponse)
    {
        com.google.common.base.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(recognizewobdataresponse).add("Num instance candidates", recognizewobdataresponse.getRecognizedInstanceCount());
        for (recognizewobdataresponse = recognizewobdataresponse.getRecognizedInstanceList().iterator(); recognizewobdataresponse.hasNext();)
        {
            Object obj = (com.google.commerce.ocr.definitions.WireProto.RecognizedInstance)recognizewobdataresponse.next();
            tostringhelper.add("WobType", ((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance) (obj)).getWobType());
            com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode;
            for (Iterator iterator = ((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance) (obj)).getBarcodeList().iterator(); iterator.hasNext(); tostringhelper.add("barcode", String.format("%s (score=%f)", new Object[] {
    recognizedbarcode.getBarcodeText(), Float.valueOf(recognizedbarcode.getScore())
})))
            {
                recognizedbarcode = (com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)iterator.next();
            }

            obj = ((com.google.commerce.ocr.definitions.WireProto.RecognizedInstance) (obj)).getTextFieldList().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText recognizedtext = (com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedText)((Iterator) (obj)).next();
                tostringhelper.add(recognizedtext.getType().toString(), String.format("%s (score=%f)", new Object[] {
                    recognizedtext.getValue(), Float.valueOf(recognizedtext.getScore())
                }));
            }
        }

        return tostringhelper.toString();
    }

    public final void performOcr(OcrImage ocrimage, com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        Object obj;
        ocrresponsehandler.onOcrAttempt();
        int i = requestCount.incrementAndGet();
        if (i > requestLimit)
        {
            ocrresponsehandler.onError(new OcrException(3));
            return;
        }
        try
        {
            obj = Stopwatch.createStarted();
            com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest recognizewobdatarequest = (com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest)com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest.newBuilder().addWobType(wobType).setImage(com.google.commerce.ocr.definitions.PrimitivesProto.Image.newBuilder().setImage(ByteString.copyFrom(ocrimage.getData()))).setDebugInfo(debugRequestInfo).build();
            Log.d("SimpleWobsOcrRecognizer", String.format("%s OCR request image size: %d", new Object[] {
                Thread.currentThread().getName(), Integer.valueOf(recognizewobdatarequest.getImage().getImage().size())
            }));
            ocrimage = wobsOcrClient.recognize(recognizewobdatarequest);
            responseCount.incrementAndGet();
            long l = ((Stopwatch) (obj)).stop().elapsed(TimeUnit.MILLISECONDS);
            Log.d("SimpleWobsOcrRecognizer", String.format("%s ocr time: %d, response: %s", new Object[] {
                Thread.currentThread().getName(), Long.valueOf(l), getStringForRecogizedWobDataResponse(ocrimage)
            }));
            obj = (new DebugInfo()).setRequest(recognizewobdatarequest).setServerProcessingTime(l).setCurrentOperationCount(i, responseCount.get()).setTimeSinceStartInMs(scanStopwatch.elapsed(TimeUnit.MILLISECONDS)).setExperimentalInstances(Lists.transform(ocrimage.getDebugInfo().getExperimentalInstanceList(), TO_PARCELABLE_INSTANCE));
            ocrimage = Lists.newArrayList(Lists.transform(ocrimage.getRecognizedInstanceList(), TO_PARCELABLE_INSTANCE));
            if (ocrimage.isEmpty())
            {
                ocrresponsehandler.onUnrecognized(obj);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (OcrImage ocrimage)
        {
            ocrresponsehandler.onError(new OcrException(1, ocrimage));
            return;
        }
        instrumentationSupervisor.onServerResult();
        ocrresponsehandler.onRecognized(ocrimage, obj);
        return;
    }

}
