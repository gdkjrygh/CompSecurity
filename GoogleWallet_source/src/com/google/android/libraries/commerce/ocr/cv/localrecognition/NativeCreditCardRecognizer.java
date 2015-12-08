// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv.localrecognition;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

public class NativeCreditCardRecognizer
{
    public static interface Callback
    {

        public abstract void onSuccess(CreditCardResult creditcardresult);
    }

    public static class CreditCardResult
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

        public CreditCardResult()
        {
        }
    }

    public static class ExpDateResult
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

        public ExpDateResult(String s, int i, double d, int ai[], int ai1[])
        {
            expDate = s;
            predictionStatus = i;
            confidence = d;
            digitPosX = ai;
            digitPosY = ai1;
        }
    }

    public static class NativeCreditCardResult
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

        public NativeCreditCardResult(int ai[], double d, double d1)
        {
            minDigitConfidence = d;
            meanDigitConfidence = d1;
            numbers = ai;
        }
    }


    private static final String TAG = "NativeCreditCardRecognizer";
    private final AssetManager assetManager;

    public NativeCreditCardRecognizer(Context context)
    {
        assetManager = context.getAssets();
    }

    public native NativeCreditCardResult getCreditCardNumbers(byte abyte0[], AssetManager assetmanager);

    public native ExpDateResult getExpirationDate(byte abyte0[], AssetManager assetmanager);

    protected int getExpirationMonth(String s)
    {
        return Integer.parseInt(s.substring(0, 2));
    }

    protected int getExpirationYear(String s)
    {
        switch (s.length())
        {
        case 6: // '\006'
        case 7: // '\007'
        default:
            return 0;

        case 5: // '\005'
            return Integer.parseInt(s.substring(3, 5));

        case 8: // '\b'
            return Integer.parseInt(s.substring(6, 8));
        }
    }

    public CreditCardResult recognizeCard(byte abyte0[], byte abyte1[], boolean flag)
    {
        Log.v("NativeCreditCardRecognizer", "making local request for OCR");
        NativeCreditCardResult nativecreditcardresult = getCreditCardNumbers(abyte0, assetManager);
        abyte0 = new ExpDateResult("", 0, 0.0D, new int[0], new int[0]);
        if (flag)
        {
            abyte0 = getExpirationDate(abyte1, assetManager);
        }
        abyte1 = nativecreditcardresult.getNumbers();
        StringBuilder stringbuilder = new StringBuilder(abyte1.length);
        for (int i = 0; i < abyte1.length; i++)
        {
            stringbuilder.append(abyte1[i]);
        }

        String s = stringbuilder.toString();
        int j = s.length();
        Log.v("NativeCreditCardRecognizer", (new StringBuilder(56)).append("Number received on Java side is ").append(j).append(" digits long.").toString());
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        int k = ((flag1) ? 1 : 0);
        int l = ((flag2) ? 1 : 0);
        j = ((flag3) ? 1 : 0);
        if (flag)
        {
            k = ((flag1) ? 1 : 0);
            l = ((flag2) ? 1 : 0);
            j = ((flag3) ? 1 : 0);
            if (abyte0.getPredictionStatus() > 0)
            {
                Object obj = abyte0.getExpirationDate();
                abyte1 = String.valueOf(obj);
                if (abyte1.length() != 0)
                {
                    abyte1 = "Got expiration date: ".concat(abyte1);
                } else
                {
                    abyte1 = new String("Got expiration date: ");
                }
                Log.v("NativeCreditCardRecognizer", abyte1);
                k = getExpirationMonth(((String) (obj)));
                l = getExpirationYear(((String) (obj)));
                if (k > 0 && l > 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
            }
        }
        obj = new CreditCardResult();
        obj.cardNumber = s;
        obj.minDigitConfidence = nativecreditcardresult.getMinDigitConfidence();
        obj.meanDigitConfidence = nativecreditcardresult.getMeanDigitConfidence();
        if (j != 0)
        {
            abyte1 = "true";
        } else
        {
            abyte1 = "false";
        }
        abyte1 = String.valueOf(abyte1);
        if (abyte1.length() != 0)
        {
            abyte1 = "Has expiration date = ".concat(abyte1);
        } else
        {
            abyte1 = new String("Has expiration date = ");
        }
        Log.v("NativeCreditCardRecognizer", abyte1);
        if (j != 0)
        {
            obj.expirationMonth = k;
            obj.expirationYear = l;
            if (abyte0.getExpirationDate().length() == 5)
            {
                j = 4;
            } else
            {
                j = 6;
            }
            obj.expirationDateNumDigits = j;
            obj.expirationDatePredictionStatus = abyte0.getPredictionStatus();
            obj.expirationDateConfidence = abyte0.getConfidence();
        }
        return ((CreditCardResult) (obj));
    }
}
