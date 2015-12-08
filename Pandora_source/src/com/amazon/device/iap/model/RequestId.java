// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.internal.util.d;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class RequestId
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RequestId createFromParcel(Parcel parcel)
        {
            return new RequestId(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public RequestId[] newArray(int i)
        {
            return new RequestId[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String ENCODED_ID = "encodedId";
    private final String encodedId;

    public RequestId()
    {
        encodedId = UUID.randomUUID().toString();
    }

    private RequestId(Parcel parcel)
    {
        encodedId = parcel.readString();
    }


    private RequestId(String s)
    {
        d.a(s, "encodedId");
        encodedId = s;
    }

    public static RequestId fromString(String s)
    {
        return new RequestId(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return encodedId.equals(((RequestId)obj).encodedId);
        }
    }

    public int hashCode()
    {
        int i;
        if (encodedId == null)
        {
            i = 0;
        } else
        {
            i = encodedId.hashCode();
        }
        return i + 31;
    }

    public JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("encodedId", encodedId);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public String toString()
    {
        return encodedId;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(encodedId);
    }

}
