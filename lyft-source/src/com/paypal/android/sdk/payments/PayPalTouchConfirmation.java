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
//            aI, aJ

public final class PayPalTouchConfirmation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aI();
    private static final String a = com/paypal/android/sdk/payments/PayPalTouchConfirmation.getSimpleName();
    private aJ b;

    private PayPalTouchConfirmation(Parcel parcel)
    {
        b = (aJ)parcel.readParcelable(com/paypal/android/sdk/payments/aJ.getClassLoader());
    }

    PayPalTouchConfirmation(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    PayPalTouchConfirmation(aJ aj)
    {
        b = aj;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final aJ getPayPalTouchResponseBundle()
    {
        return b;
    }

    public final JSONObject toJSONObject()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("paypal_sdk_version", "2.9.0");
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

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, 0);
    }

}
