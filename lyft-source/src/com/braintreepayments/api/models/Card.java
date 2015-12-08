// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.braintreepayments.api.Utils;
import com.google.gson.Gson;
import java.io.Serializable;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, PaymentMethodOptions, ThreeDSecureInfo

public class Card extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Card createFromParcel(Parcel parcel)
        {
            return new Card(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Card[] newArray(int i)
        {
            return new Card[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    protected static final String PAYMENT_METHOD_TYPE = "CreditCard";
    private BillingAddress billingAddress;
    private String cardNumber;
    private String cvv;
    private CardDetails details;
    private String expirationDate;
    private String expirationMonth;
    private String expirationYear;
    private ThreeDSecureInfo threeDSecureInfo;

    public Card()
    {
    }

    private Card(Parcel parcel)
    {
        billingAddress = (BillingAddress)parcel.readParcelable(com/braintreepayments/api/models/Card$BillingAddress.getClassLoader());
        details = (CardDetails)parcel.readParcelable(com/braintreepayments/api/models/Card$CardDetails.getClassLoader());
        expirationMonth = parcel.readString();
        expirationYear = parcel.readString();
        expirationDate = parcel.readString();
        cardNumber = parcel.readString();
        cvv = parcel.readString();
        nonce = parcel.readString();
        description = parcel.readString();
        options = (PaymentMethodOptions)parcel.readSerializable();
        mSource = parcel.readString();
    }


    public static Card fromJson(String s)
    {
        return (Card)Utils.getGson().a(s, com/braintreepayments/api/models/Card);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getLastTwo()
    {
        return details.getLastTwo();
    }

    public ThreeDSecureInfo getThreeDSecureInfo()
    {
        return threeDSecureInfo;
    }

    public String getTypeLabel()
    {
        return details.getCardType();
    }

    protected void setBillingAddress(BillingAddress billingaddress)
    {
        billingAddress = billingaddress;
    }

    protected void setCardNumber(String s)
    {
        cardNumber = s;
    }

    protected void setCvv(String s)
    {
        cvv = s;
    }

    protected void setExpirationDate(String s)
    {
        expirationDate = s;
    }

    protected void setExpirationMonth(String s)
    {
        expirationMonth = s;
    }

    protected void setExpirationYear(String s)
    {
        expirationYear = s;
    }

    protected void setThreeDSecureInfo(ThreeDSecureInfo threedsecureinfo)
    {
        threeDSecureInfo = threedsecureinfo;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(billingAddress, 0);
        parcel.writeParcelable(details, 0);
        parcel.writeString(expirationMonth);
        parcel.writeString(expirationYear);
        parcel.writeString(expirationDate);
        parcel.writeString(cardNumber);
        parcel.writeString(cvv);
        parcel.writeString(nonce);
        parcel.writeString(description);
        parcel.writeSerializable(options);
        parcel.writeString(mSource);
    }


    private class BillingAddress
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public BillingAddress createFromParcel(Parcel parcel)
            {
                return new BillingAddress(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public BillingAddress[] newArray(int i)
            {
                return new BillingAddress[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private String countryName;
        private String firstName;
        private String lastName;
        private String locality;
        private String postalCode;
        private String region;
        private String streetAddress;

        public int describeContents()
        {
            return 0;
        }

        protected void setCountryName(String s)
        {
            countryName = s;
        }

        protected void setFirstName(String s)
        {
            firstName = s;
        }

        protected void setLastName(String s)
        {
            lastName = s;
        }

        protected void setLocality(String s)
        {
            locality = s;
        }

        protected void setPostalCode(String s)
        {
            postalCode = s;
        }

        protected void setRegion(String s)
        {
            region = s;
        }

        protected void setStreetAddress(String s)
        {
            streetAddress = s;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(firstName);
            parcel.writeString(lastName);
            parcel.writeString(countryName);
            parcel.writeString(locality);
            parcel.writeString(postalCode);
            parcel.writeString(region);
            parcel.writeString(streetAddress);
        }


        public BillingAddress()
        {
        }

        private BillingAddress(Parcel parcel)
        {
            firstName = parcel.readString();
            lastName = parcel.readString();
            countryName = parcel.readString();
            locality = parcel.readString();
            postalCode = parcel.readString();
            region = parcel.readString();
            streetAddress = parcel.readString();
        }

    }


    private class CardDetails
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public CardDetails createFromParcel(Parcel parcel)
            {
                return new CardDetails(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public CardDetails[] newArray(int i)
            {
                return new CardDetails[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private String cardType;
        private String lastTwo;

        public int describeContents()
        {
            return 0;
        }

        protected String getCardType()
        {
            return cardType;
        }

        protected String getLastTwo()
        {
            return lastTwo;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(cardType);
            parcel.writeString(lastTwo);
        }


        public CardDetails()
        {
        }

        private CardDetails(Parcel parcel)
        {
            cardType = parcel.readString();
            lastTwo = parcel.readString();
        }

    }

}
