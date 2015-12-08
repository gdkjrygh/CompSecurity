// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, ThreeDSecureInfo

public class ThreeDSecureAuthenticationResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private Card a;
    private boolean b;
    private com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors c;
    private String d;

    public ThreeDSecureAuthenticationResponse()
    {
    }

    private ThreeDSecureAuthenticationResponse(Parcel parcel)
    {
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        a = (Card)parcel.readParcelable(com/braintreepayments/api/models/Card.getClassLoader());
        c = (com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors)parcel.readParcelable(com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeError.getClassLoader());
        d = parcel.readString();
    }

    ThreeDSecureAuthenticationResponse(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public static ThreeDSecureAuthenticationResponse a(String s)
    {
        ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse = new ThreeDSecureAuthenticationResponse();
        Gson gson = new Gson();
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            Card card = (Card)gson.fromJson(jsonobject.getJSONObject("paymentMethod").toString(), com/braintreepayments/api/models/Card);
            card.a((ThreeDSecureInfo)gson.fromJson(jsonobject.getJSONObject("threeDSecureInfo").toString(), com/braintreepayments/api/models/ThreeDSecureInfo));
            threedsecureauthenticationresponse.a = card;
            threedsecureauthenticationresponse.b = jsonobject.getBoolean("success");
        }
        catch (JSONException jsonexception)
        {
            threedsecureauthenticationresponse.b = false;
        }
        threedsecureauthenticationresponse.c = (com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors)gson.fromJson(s, com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeErrors);
        return threedsecureauthenticationresponse;
    }

    public static boolean a(Intent intent)
    {
        return intent.hasExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT");
    }

    public static ThreeDSecureAuthenticationResponse b(String s)
    {
        ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse = new ThreeDSecureAuthenticationResponse();
        threedsecureauthenticationresponse.b = false;
        threedsecureauthenticationresponse.d = s;
        return threedsecureauthenticationresponse;
    }

    public final boolean a()
    {
        return b;
    }

    public final Card b()
    {
        return a;
    }

    public final com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte byte0;
        if (b)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(c, i);
        parcel.writeString(d);
    }


    /* member class not found */
    class _cls1 {}

}
