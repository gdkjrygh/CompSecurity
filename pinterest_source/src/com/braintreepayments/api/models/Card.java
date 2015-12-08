// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import java.io.Serializable;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, ThreeDSecureInfo, PaymentMethodOptions

public class Card extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private BillingAddress e;
    private ThreeDSecureInfo f;
    private CardDetails g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public Card()
    {
    }

    private Card(Parcel parcel)
    {
        e = (BillingAddress)parcel.readParcelable(com/braintreepayments/api/models/Card$BillingAddress.getClassLoader());
        f = (ThreeDSecureInfo)parcel.readParcelable(com/braintreepayments/api/models/ThreeDSecureInfo.getClassLoader());
        g = (CardDetails)parcel.readParcelable(com/braintreepayments/api/models/Card$CardDetails.getClassLoader());
        h = parcel.readString();
        i = parcel.readString();
        j = parcel.readString();
        k = parcel.readString();
        l = parcel.readString();
        a = parcel.readString();
        b = parcel.readString();
        c = (PaymentMethodOptions)parcel.readSerializable();
        d = parcel.readString();
    }

    Card(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static Card e(String s)
    {
        return (Card)(new Gson()).fromJson(s, com/braintreepayments/api/models/Card);
    }

    public final String a()
    {
        return g.a();
    }

    protected final void a(BillingAddress billingaddress)
    {
        e = billingaddress;
    }

    protected final void a(ThreeDSecureInfo threedsecureinfo)
    {
        f = threedsecureinfo;
    }

    protected final void a(String s)
    {
        h = s;
    }

    protected final void b(String s)
    {
        i = s;
    }

    public final String b_()
    {
        return g.b();
    }

    protected final void c(String s)
    {
        k = s;
    }

    protected final void d(String s)
    {
        l = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeParcelable(e, 0);
        parcel.writeParcelable(f, 0);
        parcel.writeParcelable(g, 0);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeString(k);
        parcel.writeString(l);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeSerializable(c);
        parcel.writeString(d);
    }


    private class BillingAddress
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        protected final void a(String s)
        {
            a = s;
        }

        protected final void b(String s)
        {
            b = s;
        }

        protected final void c(String s)
        {
            d = s;
        }

        protected final void d(String s)
        {
            e = s;
        }

        public int describeContents()
        {
            return 0;
        }

        protected final void e(String s)
        {
            f = s;
        }

        protected final void f(String s)
        {
            g = s;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(a);
            parcel.writeString(b);
            parcel.writeString(c);
            parcel.writeString(d);
            parcel.writeString(e);
            parcel.writeString(f);
            parcel.writeString(g);
        }


        public BillingAddress()
        {
        }

        private BillingAddress(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readString();
            c = parcel.readString();
            d = parcel.readString();
            e = parcel.readString();
            f = parcel.readString();
            g = parcel.readString();
        }

        BillingAddress(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    private class CardDetails
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private String a;
        private String b;

        protected final String a()
        {
            return a;
        }

        protected final String b()
        {
            return b;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeString(a);
            parcel.writeString(b);
        }


        public CardDetails()
        {
        }

        private CardDetails(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readString();
        }

        CardDetails(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    /* member class not found */
    class _cls1 {}

}
