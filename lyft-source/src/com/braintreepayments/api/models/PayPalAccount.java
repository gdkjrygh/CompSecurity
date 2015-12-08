// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.braintreepayments.api.Utils;
import com.google.gson.Gson;
import java.io.Serializable;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, PaymentMethodOptions

public class PayPalAccount extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PayPalAccount createFromParcel(Parcel parcel)
        {
            return new PayPalAccount(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PayPalAccount[] newArray(int i)
        {
            return new PayPalAccount[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    protected static final String PAYMENT_METHOD_TYPE = "PayPalAccount";
    private String consentCode;
    private String correlationId;
    private PayPalDetails details;

    public PayPalAccount()
    {
    }

    private PayPalAccount(Parcel parcel)
    {
        consentCode = parcel.readString();
        correlationId = parcel.readString();
        details = (PayPalDetails)parcel.readParcelable(com/braintreepayments/api/models/PayPalAccount$PayPalDetails.getClassLoader());
        nonce = parcel.readString();
        description = parcel.readString();
        options = (PaymentMethodOptions)parcel.readSerializable();
        mSource = parcel.readString();
    }


    public static PayPalAccount fromJson(String s)
    {
        return (PayPalAccount)Utils.getGson().a(s, com/braintreepayments/api/models/PayPalAccount);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDescription()
    {
        if (TextUtils.equals(super.getDescription(), "PayPal") && !TextUtils.isEmpty(getEmail()))
        {
            return getEmail();
        } else
        {
            return super.getDescription();
        }
    }

    public String getEmail()
    {
        if (details != null)
        {
            return details.getEmail();
        } else
        {
            return "";
        }
    }

    public String getTypeLabel()
    {
        return "PayPal";
    }

    protected void setConsentCode(String s)
    {
        consentCode = s;
    }

    protected void setCorrelationId(String s)
    {
        correlationId = s;
    }

    protected void setEmail(String s)
    {
        details = new PayPalDetails();
        details.setEmail(s);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(consentCode);
        parcel.writeString(correlationId);
        parcel.writeParcelable(details, 0);
        parcel.writeString(nonce);
        parcel.writeString(description);
        parcel.writeSerializable(options);
        parcel.writeString(mSource);
    }


    private class PayPalDetails
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public PayPalDetails createFromParcel(Parcel parcel)
            {
                return new PayPalDetails(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public PayPalDetails[] newArray(int i)
            {
                return new PayPalDetails[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private String email;

        private String getEmail()
        {
            return email;
        }

        private void setEmail(String s)
        {
            email = s;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(email);
        }




        public PayPalDetails()
        {
        }

        private PayPalDetails(Parcel parcel)
        {
            email = parcel.readString();
        }

    }

}
