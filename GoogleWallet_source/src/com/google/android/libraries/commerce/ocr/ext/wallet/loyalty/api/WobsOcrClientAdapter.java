// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.api;

import com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizeWobDataResponseConverter;
import com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.WobsOcrRequestConverter;
import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;
import java.io.IOException;

public class WobsOcrClientAdapter
    implements WobsOcrClient
{
    public static interface WalletOcrRecognize
    {

        public abstract com.google.wallet.proto.api.NanoWalletOcr.WobsOcrResponse recognize(com.google.wallet.proto.api.NanoWalletOcr.WobsOcrRequest wobsocrrequest)
            throws IOException;
    }


    private final WalletOcrRecognize recognizeFunction;
    private final WobsOcrRequestConverter requestConverter;
    private final RecognizeWobDataResponseConverter responseConverter;

    public WobsOcrClientAdapter(WobsOcrRequestConverter wobsocrrequestconverter, RecognizeWobDataResponseConverter recognizewobdataresponseconverter, WalletOcrRecognize walletocrrecognize)
    {
        requestConverter = wobsocrrequestconverter;
        responseConverter = recognizewobdataresponseconverter;
        recognizeFunction = walletocrrecognize;
    }

    public final com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataResponse recognize(com.google.commerce.ocr.rpc.ServiceProto.RecognizeWobDataRequest recognizewobdatarequest)
        throws IOException
    {
        recognizewobdatarequest = recognizeFunction.recognize(requestConverter.apply(recognizewobdatarequest));
        return responseConverter.apply(recognizewobdatarequest);
    }
}
