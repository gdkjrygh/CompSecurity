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
//            aO, PayPalTouchResponseBundle

public final class PayPalTouchConfirmation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aO();
    private static final String a = com/paypal/android/sdk/payments/PayPalTouchConfirmation.getSimpleName();
    private PayPalTouchResponseBundle b;

    private PayPalTouchConfirmation(Parcel parcel)
    {
        b = (PayPalTouchResponseBundle)parcel.readParcelable(com/paypal/android/sdk/payments/PayPalTouchResponseBundle.getClassLoader());
    }

    PayPalTouchConfirmation(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    PayPalTouchConfirmation(PayPalTouchResponseBundle paypaltouchresponsebundle)
    {
        b = paypaltouchresponsebundle;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("paypal_sdk_version", "2.10.0");
            jsonobject1.put("platform", "Android");
            jsonobject1.put("product_name", "PayPal-Android-SDK");
            jsonobject.put("client", jsonobject1);
            jsonobject.put("response", b.a());
        }
        catch (JSONException jsonexception)
        {
            Log.e(a, "Error encoding JSON", jsonexception);
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
        parcel.writeParcelable(b, 0);
    }

}
