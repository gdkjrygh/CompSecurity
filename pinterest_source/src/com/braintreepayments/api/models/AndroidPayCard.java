// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, PaymentMethodOptions

public class AndroidPayCard extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private AndroidPayCardDetails e;

    public AndroidPayCard()
    {
    }

    private AndroidPayCard(Parcel parcel)
    {
        e = (AndroidPayCardDetails)parcel.readParcelable(com/braintreepayments/api/models/AndroidPayCard$AndroidPayCardDetails.getClassLoader());
        a = parcel.readString();
        b = parcel.readString();
        c = (PaymentMethodOptions)parcel.readSerializable();
        d = parcel.readString();
    }

    AndroidPayCard(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final String a()
    {
        return "Google Wallet";
    }

    public final String a_()
    {
        return e.a();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(e, 0);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeSerializable(c);
        parcel.writeString(d);
    }


    private class AndroidPayCardDetails
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private String a;
        private String b;

        protected final String a()
        {
            return b;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
            parcel.writeString(b);
        }


        public AndroidPayCardDetails()
        {
        }

        private AndroidPayCardDetails(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readString();
        }

        AndroidPayCardDetails(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    /* member class not found */
    class _cls1 {}

}
