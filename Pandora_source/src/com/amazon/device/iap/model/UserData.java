// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import org.json.JSONException;
import org.json.JSONObject;

public final class UserData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public UserData createFromParcel(Parcel parcel)
        {
            return new UserData(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public UserData[] newArray(int i)
        {
            return new UserData[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String MARKETPLACE = "marketplace";
    private static final String USER_ID = "userId";
    private final String marketplace;
    private final String userId;

    private UserData(Parcel parcel)
    {
        userId = parcel.readString();
        marketplace = parcel.readString();
    }


    public UserData(UserDataBuilder userdatabuilder)
    {
        userId = userdatabuilder.getUserId();
        marketplace = userdatabuilder.getMarketplace();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getMarketplace()
    {
        return marketplace;
    }

    public String getUserId()
    {
        return userId;
    }

    public JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("userId", userId);
            jsonobject.put("marketplace", marketplace);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        String s;
        try
        {
            s = toJSON().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStringArray(new String[] {
            userId, marketplace
        });
    }

}
