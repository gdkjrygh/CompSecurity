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
//            aP

public final class PayPalTouchResponseBundle
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aP();
    private static final String a = com/paypal/android/sdk/payments/PayPalTouchResponseBundle.getSimpleName();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    private PayPalTouchResponseBundle(Parcel parcel)
    {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    PayPalTouchResponseBundle(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PayPalTouchResponseBundle(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10)
    {
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
        i = s7;
        j = s8;
        k = s9;
        l = s10;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("version", b);
            jsonobject.put("display_name", c);
            jsonobject.put("access_token", d);
            jsonobject.put("response_type", e);
            jsonobject.put("authorization_code", f);
            jsonobject.put("expires_in", g);
            jsonobject.put("scope", h);
            jsonobject.put("email", i);
            jsonobject.put("photo_url", j);
            jsonobject.put("error", k);
            jsonobject.put("webURL", l);
        }
        catch (JSONException jsonexception)
        {
            Log.e(a, "error encoding JSON", jsonexception);
            return null;
        }
        return jsonobject;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(i);
        parcel.writeString(j);
        parcel.writeString(k);
        parcel.writeString(l);
    }

}
