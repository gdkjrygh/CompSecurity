// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, PaymentMethodOptions

public class CoinbaseAccount extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String e;
    private CoinbaseAccountDetails f;
    private String g;

    public CoinbaseAccount()
    {
    }

    private CoinbaseAccount(Parcel parcel)
    {
        e = parcel.readString();
        g = parcel.readString();
        f = (CoinbaseAccountDetails)parcel.readParcelable(com/braintreepayments/api/models/CoinbaseAccount$CoinbaseAccountDetails.getClassLoader());
        a = parcel.readString();
        b = parcel.readString();
        c = (PaymentMethodOptions)parcel.readSerializable();
        d = parcel.readString();
    }

    CoinbaseAccount(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final String a()
    {
        return "Coinbase";
    }

    public final String c_()
    {
        if (f != null)
        {
            return f.a();
        } else
        {
            return "";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(e);
        parcel.writeString(g);
        parcel.writeParcelable(f, 0);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeSerializable(c);
        parcel.writeString(d);
    }


    private class CoinbaseAccountDetails
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private String a;

        public final String a()
        {
            return a;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
        }


        public CoinbaseAccountDetails()
        {
        }

        private CoinbaseAccountDetails(Parcel parcel)
        {
            a = parcel.readString();
        }

        CoinbaseAccountDetails(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    /* member class not found */
    class _cls1 {}

}
