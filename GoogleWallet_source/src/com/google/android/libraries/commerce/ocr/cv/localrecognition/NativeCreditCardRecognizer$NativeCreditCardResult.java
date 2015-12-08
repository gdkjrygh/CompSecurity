// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv.localrecognition;


// Referenced classes of package com.google.android.libraries.commerce.ocr.cv.localrecognition:
//            NativeCreditCardRecognizer

public static class numbers
{

    private final double meanDigitConfidence;
    private final double minDigitConfidence;
    private final int numbers[];

    public double getMeanDigitConfidence()
    {
        return meanDigitConfidence;
    }

    public double getMinDigitConfidence()
    {
        return minDigitConfidence;
    }

    public int[] getNumbers()
    {
        return numbers;
    }

    public (int ai[], double d, double d1)
    {
        minDigitConfidence = d;
        meanDigitConfidence = d1;
        numbers = ai;
    }
}
