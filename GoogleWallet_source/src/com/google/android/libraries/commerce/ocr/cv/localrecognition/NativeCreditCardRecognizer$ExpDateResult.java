// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv.localrecognition;


// Referenced classes of package com.google.android.libraries.commerce.ocr.cv.localrecognition:
//            NativeCreditCardRecognizer

public static class digitPosY
{

    private final double confidence;
    private final int digitPosX[];
    private final int digitPosY[];
    private final String expDate;
    private final int predictionStatus;

    public double getConfidence()
    {
        return confidence;
    }

    public int[] getDigitPosX()
    {
        return digitPosX;
    }

    public int[] getDigitPosY()
    {
        return digitPosY;
    }

    public String getExpirationDate()
    {
        return expDate;
    }

    public int getPredictionStatus()
    {
        return predictionStatus;
    }

    public (String s, int i, double d, int ai[], int ai1[])
    {
        expDate = s;
        predictionStatus = i;
        confidence = d;
        digitPosX = ai;
        digitPosY = ai1;
    }
}
