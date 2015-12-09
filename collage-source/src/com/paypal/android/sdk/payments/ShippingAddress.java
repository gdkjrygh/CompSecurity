// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.paypal.android.sdk.gd;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ci

public final class ShippingAddress
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ci();
    private static final String a = com/paypal/android/sdk/payments/ShippingAddress.getSimpleName();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public ShippingAddress()
    {
    }

    private ShippingAddress(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
    }

    ShippingAddress(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private static boolean a(String s)
    {
        return gd.d(s);
    }

    private static boolean a(String s, String s1)
    {
        if (gd.c(s))
        {
            return gd.c(s1);
        }
        if (gd.c(s1))
        {
            return false;
        } else
        {
            return s.trim().equals(s1.trim());
        }
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.accumulate("recipient_name", b);
            jsonobject.accumulate("line1", c);
            jsonobject.accumulate("city", e);
            jsonobject.accumulate("country_code", h);
            if (a(d))
            {
                jsonobject.accumulate("line2", d);
            }
            if (a(f))
            {
                jsonobject.accumulate("state", f);
            }
            if (a(g))
            {
                jsonobject.accumulate("postal_code", g);
            }
        }
        catch (JSONException jsonexception)
        {
            Log.e(a, jsonexception.getMessage());
            return jsonobject;
        }
        return jsonobject;
    }

    final boolean a(JSONObject jsonobject)
    {
        while (!a(jsonobject.optString("recipient_name"), b) || !a(jsonobject.optString("line1"), c) || !a(jsonobject.optString("line2"), d) || !a(jsonobject.optString("city"), e) || !a(jsonobject.optString("state"), f) || !a(jsonobject.optString("country_code"), h) || !a(jsonobject.optString("postal_code"), g)) 
        {
            return false;
        }
        return true;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
    }

}
