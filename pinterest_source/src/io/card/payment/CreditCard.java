// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

// Referenced classes of package io.card.payment:
//            CardType, CreditCardNumber

public class CreditCard
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int EXPIRY_MAX_FUTURE_YEARS = 15;
    private static final String TAG = io/card/payment/CreditCard.getSimpleName();
    public String cardNumber;
    public String cvv;
    public int expiryMonth;
    public int expiryYear;
    boolean flipped;
    public String postalCode;
    String scanId;
    int xoff[];
    int yoff;

    public CreditCard()
    {
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        xoff = new int[16];
        scanId = UUID.randomUUID().toString();
    }

    private CreditCard(Parcel parcel)
    {
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        cardNumber = parcel.readString();
        expiryMonth = parcel.readInt();
        expiryYear = parcel.readInt();
        cvv = parcel.readString();
        postalCode = parcel.readString();
        scanId = parcel.readString();
        yoff = parcel.readInt();
        xoff = parcel.createIntArray();
    }

    CreditCard(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public CreditCard(String s, int i, int j, String s1, String s2)
    {
        expiryMonth = 0;
        expiryYear = 0;
        flipped = false;
        cardNumber = s;
        expiryMonth = i;
        expiryYear = j;
        cvv = s1;
        postalCode = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public CardType getCardType()
    {
        return CardType.fromCardNumber(cardNumber);
    }

    public String getFormattedCardNumber()
    {
        return CreditCardNumber.formatString(cardNumber);
    }

    public String getLastFourDigitsOfCardNumber()
    {
        if (cardNumber != null)
        {
            int i = Math.min(4, cardNumber.length());
            return cardNumber.substring(cardNumber.length() - i);
        } else
        {
            return "";
        }
    }

    public String getRedactedCardNumber()
    {
        if (cardNumber != null)
        {
            String s = "";
            if (cardNumber.length() > 4)
            {
                s = (new StringBuilder()).append("").append(String.format((new StringBuilder("%")).append(cardNumber.length() - 4).append("s").toString(), new Object[] {
                    ""
                }).replace(' ', '\u2022')).toString();
            }
            return CreditCardNumber.formatString((new StringBuilder()).append(s).append(getLastFourDigitsOfCardNumber()).toString(), false, CardType.fromCardNumber(cardNumber));
        } else
        {
            return "";
        }
    }

    public boolean isExpiryValid()
    {
        return CreditCardNumber.isDateValid(expiryMonth, expiryYear);
    }

    public String toString()
    {
        Object obj;
label0:
        {
            String s = (new StringBuilder("{")).append(getCardType()).append(": ").append(getRedactedCardNumber()).toString();
            if (expiryMonth <= 0)
            {
                obj = s;
                if (expiryYear <= 0)
                {
                    break label0;
                }
            }
            obj = (new StringBuilder()).append(s).append("  expiry:").append(expiryMonth).append("/").append(expiryYear).toString();
        }
        String s1 = ((String) (obj));
        if (postalCode != null)
        {
            s1 = (new StringBuilder()).append(((String) (obj))).append("  postalCode:").append(postalCode).toString();
        }
        obj = s1;
        if (cvv != null)
        {
            obj = (new StringBuilder()).append(s1).append("  cvvLength:");
            int i;
            if (cvv != null)
            {
                i = cvv.length();
            } else
            {
                i = 0;
            }
            obj = ((StringBuilder) (obj)).append(i).toString();
        }
        return (new StringBuilder()).append(((String) (obj))).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(cardNumber);
        parcel.writeInt(expiryMonth);
        parcel.writeInt(expiryYear);
        parcel.writeString(cvv);
        parcel.writeString(postalCode);
        parcel.writeString(scanId);
        parcel.writeInt(yoff);
        parcel.writeIntArray(xoff);
    }


    /* member class not found */
    class _cls1 {}

}
