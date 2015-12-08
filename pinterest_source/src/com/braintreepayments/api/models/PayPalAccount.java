// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            PaymentMethod, PaymentMethodOptions, PostalAddress

public class PayPalAccount extends PaymentMethod
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String e;
    private String f;
    private PayPalDetails g;
    private PostalAddress h;

    public PayPalAccount()
    {
    }

    private PayPalAccount(Parcel parcel)
    {
        e = parcel.readString();
        f = parcel.readString();
        g = (PayPalDetails)parcel.readParcelable(com/braintreepayments/api/models/PayPalAccount$PayPalDetails.getClassLoader());
        a = parcel.readString();
        b = parcel.readString();
        c = (PaymentMethodOptions)parcel.readSerializable();
        d = parcel.readString();
        h = (PostalAddress)parcel.readParcelable(com/braintreepayments/api/models/PostalAddress.getClassLoader());
    }

    PayPalAccount(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static PayPalAccount d(String s)
    {
        PayPalAccount paypalaccount = (PayPalAccount)(new Gson()).fromJson(s, com/braintreepayments/api/models/PayPalAccount);
        try
        {
            s = (new JSONObject(s)).getJSONObject("details").getJSONObject("payerInfo").getJSONObject("accountAddress").toString();
            paypalaccount.h = (PostalAddress)(new Gson()).fromJson(s, com/braintreepayments/api/models/PostalAddress);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return paypalaccount;
        }
        return paypalaccount;
    }

    private String e()
    {
        if (g != null)
        {
            return PayPalDetails.a(g);
        } else
        {
            return "";
        }
    }

    public final String a()
    {
        return "PayPal";
    }

    protected final void a(String s)
    {
        g = new PayPalDetails();
        PayPalDetails.a(g, s);
    }

    public final String b()
    {
        if (TextUtils.equals(super.b(), "PayPal") && !TextUtils.isEmpty(e()))
        {
            return e();
        } else
        {
            return super.b();
        }
    }

    protected final void b(String s)
    {
        e = s;
    }

    protected final void c(String s)
    {
        f = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeParcelable(g, 0);
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeSerializable(c);
        parcel.writeString(d);
        parcel.writeParcelable(h, 0);
    }


    private class PayPalDetails
        implements Parcelable, Serializable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private String a;

        static String a(PayPalDetails paypaldetails)
        {
            return paypaldetails.a;
        }

        static void a(PayPalDetails paypaldetails, String s)
        {
            paypaldetails.a = s;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
        }


        public PayPalDetails()
        {
        }

        private PayPalDetails(Parcel parcel)
        {
            a = parcel.readString();
        }

        PayPalDetails(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        /* block-local class not found */
        class _cls1 {}

    }


    /* member class not found */
    class _cls1 {}

}
