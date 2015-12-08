// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv.localrecognition;


// Referenced classes of package com.google.android.libraries.commerce.ocr.cv.localrecognition:
//            NativeCreditCardRecognizer

public static class 
{

    public String cardNumber;
    public int dominantRgbColor;
    public double expirationDateConfidence;
    public int expirationDateNumDigits;
    public int expirationDatePredictionStatus;
    public int expirationMonth;
    public int expirationYear;
    public double meanDigitConfidence;
    public double minDigitConfidence;

    public void clearCardNumber()
    {
        cardNumber = "";
    }

    public void clearExpirationDate()
    {
        expirationYear = 0;
        expirationMonth = 0;
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public int getDominantRgbColor()
    {
        return dominantRgbColor;
    }

    public double getExpirationDateConfidence()
    {
        return expirationDateConfidence;
    }

    public int getExpirationDateNumDigits()
    {
        return expirationDateNumDigits;
    }

    public int getExpirationDatePredictionStatus()
    {
        return expirationDatePredictionStatus;
    }

    public int getExpirationMonth()
    {
        return expirationMonth;
    }

    public int getExpirationYear()
    {
        return expirationYear;
    }

    public double getMeanDigitConfidence()
    {
        return meanDigitConfidence;
    }

    public double getMinDigitConfidence()
    {
        return minDigitConfidence;
    }

    public ()
    {
    }
}
