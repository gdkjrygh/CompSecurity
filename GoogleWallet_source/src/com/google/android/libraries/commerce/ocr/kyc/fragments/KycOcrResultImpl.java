// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult;
import java.util.EnumMap;
import java.util.Map;

public final class KycOcrResultImpl
    implements KycOcrResult
{

    private Map analyticsMap;
    private com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode barcode;
    private Map imageMap;

    public KycOcrResultImpl()
    {
        imageMap = new EnumMap(com/google/android/libraries/commerce/ocr/kyc/pub/KycOcrResult$Side);
        analyticsMap = new EnumMap(com/google/android/libraries/commerce/ocr/kyc/pub/KycOcrResult$Side);
    }

    public final com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode getBarcode()
    {
        return barcode;
    }

    public final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics getSideAnalytics(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side)
    {
        return (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsMap.get(side);
    }

    public final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage getSideImage(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side)
    {
        return (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage)imageMap.get(side);
    }

    public final void setBarcode(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode)
    {
        barcode = recognizedbarcode;
    }

    public final void setSideAnalytics(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics analytics, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side)
    {
        analyticsMap.put(side, analytics);
    }

    public final void setSideImage(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage, com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Side side)
    {
        imageMap.put(side, cardsideimage);
    }
}
