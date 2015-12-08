// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.pub;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

public class CreditCardOCRParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static CreditCardOCRParcelable createFromParcel(Parcel parcel)
        {
            return new CreditCardOCRParcelable(parcel);
        }

        private static CreditCardOCRParcelable[] newArray(int i)
        {
            return new CreditCardOCRParcelable[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String cardNum;
    private final int dominantColor;
    private final int expMonth;
    private final int expYear;

    public CreditCardOCRParcelable(Parcel parcel)
    {
        cardNum = parcel.readString();
        expYear = parcel.readInt();
        expMonth = parcel.readInt();
        dominantColor = parcel.readInt();
    }

    public CreditCardOCRParcelable(com.google.android.libraries.commerce.ocr.cv.localrecognition.NativeCreditCardRecognizer.CreditCardResult creditcardresult)
    {
        cardNum = creditcardresult.getCardNumber();
        expYear = creditcardresult.getExpirationYear();
        expMonth = creditcardresult.getExpirationMonth();
        dominantColor = creditcardresult.getDominantRgbColor();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCardNum()
    {
        return cardNum;
    }

    public int getDominantColor()
    {
        return dominantColor;
    }

    public int getExpMonth()
    {
        return expMonth;
    }

    public int getExpYear()
    {
        return expYear;
    }

    public boolean hasExpDate()
    {
        return expYear != 0 && expMonth != 0;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/android/libraries/commerce/ocr/pub/CreditCardOCRParcelable).add("card_num", cardNum).add("exp_year", expYear).add("exp_month", expMonth).add("dominate_color", Integer.toHexString(dominantColor)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(cardNum);
        parcel.writeInt(expYear);
        parcel.writeInt(expMonth);
        parcel.writeInt(dominantColor);
    }

}
