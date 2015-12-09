// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.d.b;
import com.fitbit.data.domain.Entity;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.device:
//            TrackerInfo

public class TrackerType extends Entity
    implements Parcelable, b
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TrackerType a(Parcel parcel)
        {
            TrackerType trackertype = new TrackerType(parcel);
            trackertype.a((TrackerInfo)parcel.readParcelable(com/fitbit/data/domain/device/TrackerInfo.getClassLoader()));
            return trackertype;
        }

        public TrackerType[] a(int i)
        {
            return new TrackerType[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public static final String a = "aria";
    public static final String b = "ultra";
    private static final String c = "TrackerType";
    private String assetsBaseUrl;
    private String assetsToken;
    private TrackerInfo info;
    private String name;

    public TrackerType()
    {
    }

    public TrackerType(Parcel parcel)
    {
        name = parcel.readString();
        assetsBaseUrl = parcel.readString();
        assetsToken = parcel.readString();
    }

    public String a()
    {
        return name;
    }

    public void a(TrackerInfo trackerinfo)
    {
        info = trackerinfo;
    }

    public String b()
    {
        return assetsBaseUrl;
    }

    public String c()
    {
        return assetsToken;
    }

    public TrackerInfo d()
    {
        return info;
    }

    public int describeContents()
    {
        return 0;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        name = jsonobject.getString("name");
        assetsBaseUrl = jsonobject.optString("assetsBaseUrl");
        assetsToken = jsonobject.optString("assetsToken");
        if (jsonobject.has("info"))
        {
            TrackerInfo trackerinfo = new TrackerInfo();
            trackerinfo.a(jsonobject.optJSONObject("info"), this);
            a(trackerinfo);
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", a());
        if (b() != null)
        {
            jsonobject.put("assetsBaseUrl", b());
        }
        if (c() != null)
        {
            jsonobject.put("assetsToken", c());
        }
        if (d() != null)
        {
            jsonobject.put("info", d().a());
        }
        return jsonobject;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" name: ").append(name).append(" assetsBaseUrl: ").append(assetsBaseUrl).append(" assetsToken: ").append(assetsToken);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
        parcel.writeString(assetsBaseUrl);
        parcel.writeString(assetsToken);
        parcel.writeParcelable(info, i);
    }

}
