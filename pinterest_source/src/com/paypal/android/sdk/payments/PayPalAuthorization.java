// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            al

public final class PayPalAuthorization
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new al();
    private String a;
    private String b;
    private String c;

    private PayPalAuthorization(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
    }

    PayPalAuthorization(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    PayPalAuthorization(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public final String a()
    {
        return b;
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("environment", a);
            jsonobject1.put("paypal_sdk_version", "2.10.0");
            jsonobject1.put("platform", "Android");
            jsonobject1.put("product_name", "PayPal-Android-SDK");
            jsonobject.put("client", jsonobject1);
            jsonobject1 = new JSONObject();
            jsonobject1.put("code", b);
            jsonobject.put("response", jsonobject1);
            jsonobject1 = new JSONObject();
            jsonobject1.put("display_string", c);
            jsonobject.put("user", jsonobject1);
            jsonobject.put("response_type", "authorization_code");
        }
        catch (JSONException jsonexception)
        {
            Log.e("paypal.sdk", "Error encoding JSON", jsonexception);
            return null;
        }
        return jsonobject;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

    static 
    {
        com/paypal/android/sdk/payments/PayPalAuthorization.getSimpleName();
    }
}
