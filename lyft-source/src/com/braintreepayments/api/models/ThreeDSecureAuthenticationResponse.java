// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.braintreepayments.api.Utils;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, ThreeDSecureInfo

public class ThreeDSecureAuthenticationResponse
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ThreeDSecureAuthenticationResponse createFromParcel(Parcel parcel)
        {
            return new ThreeDSecureAuthenticationResponse(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ThreeDSecureAuthenticationResponse[] newArray(int i)
        {
            return new ThreeDSecureAuthenticationResponse[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private Card card;
    private com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors errors;
    private String exception;
    private boolean success;

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
        success = flag;
        card = (Card)parcel.readParcelable(com/braintreepayments/api/models/Card.getClassLoader());
        errors = (com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors)parcel.readParcelable(com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeError.getClassLoader());
        exception = parcel.readString();
    }


    public static ThreeDSecureAuthenticationResponse fromException(String s)
    {
        ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse = new ThreeDSecureAuthenticationResponse();
        threedsecureauthenticationresponse.success = false;
        threedsecureauthenticationresponse.exception = s;
        return threedsecureauthenticationresponse;
    }

    public static ThreeDSecureAuthenticationResponse fromJson(String s)
    {
        ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse = new ThreeDSecureAuthenticationResponse();
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            Card card1 = (Card)Utils.getGson().a(jsonobject.getJSONObject("paymentMethod").toString(), com/braintreepayments/api/models/Card);
            card1.setThreeDSecureInfo((ThreeDSecureInfo)Utils.getGson().a(jsonobject.getJSONObject("threeDSecureInfo").toString(), com/braintreepayments/api/models/ThreeDSecureInfo));
            threedsecureauthenticationresponse.card = card1;
            threedsecureauthenticationresponse.success = jsonobject.getBoolean("success");
        }
        catch (JSONException jsonexception)
        {
            threedsecureauthenticationresponse.success = false;
        }
        threedsecureauthenticationresponse.errors = (com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors)Utils.getGson().a(s, com/braintreepayments/api/exceptions/ErrorWithResponse$BraintreeErrors);
        return threedsecureauthenticationresponse;
    }

    public int describeContents()
    {
        return 0;
    }

    public Card getCard()
    {
        return card;
    }

    public com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeErrors getErrors()
    {
        return errors;
    }

    public String getException()
    {
        return exception;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte byte0;
        if (success)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeParcelable(card, i);
        parcel.writeParcelable(errors, i);
        parcel.writeString(exception);
    }

}
