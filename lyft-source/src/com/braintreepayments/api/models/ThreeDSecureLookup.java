// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.braintreepayments.api.Utils;
import com.google.gson.Gson;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, ThreeDSecureInfo

public class ThreeDSecureLookup
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ThreeDSecureLookup createFromParcel(Parcel parcel)
        {
            return new ThreeDSecureLookup(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ThreeDSecureLookup[] newArray(int i)
        {
            return new ThreeDSecureLookup[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String acsUrl;
    private Card card;
    private String md;
    private String pareq;
    private String termUrl;

    public ThreeDSecureLookup()
    {
    }

    private ThreeDSecureLookup(Parcel parcel)
    {
        acsUrl = parcel.readString();
        md = parcel.readString();
        termUrl = parcel.readString();
        pareq = parcel.readString();
    }


    public static ThreeDSecureLookup fromJson(String s)
    {
        Object obj = new JSONObject(s);
        s = (Card)Utils.getGson().a(((JSONObject) (obj)).getJSONObject("paymentMethod").toString(), com/braintreepayments/api/models/Card);
        s.setThreeDSecureInfo((ThreeDSecureInfo)Utils.getGson().a(((JSONObject) (obj)).getJSONObject("threeDSecureInfo").toString(), com/braintreepayments/api/models/ThreeDSecureInfo));
        obj = (ThreeDSecureLookup)Utils.getGson().a(((JSONObject) (obj)).getJSONObject("lookup").toString(), com/braintreepayments/api/models/ThreeDSecureLookup);
        obj.card = s;
        return ((ThreeDSecureLookup) (obj));
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAcsUrl()
    {
        return acsUrl;
    }

    public Card getCard()
    {
        return card;
    }

    public String getMd()
    {
        return md;
    }

    public String getPareq()
    {
        return pareq;
    }

    public String getTermUrl()
    {
        return termUrl;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(acsUrl);
        parcel.writeString(md);
        parcel.writeString(termUrl);
        parcel.writeString(pareq);
    }

}
