// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            am

public class UserData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new am();
    private final String a;
    private final String b;

    private UserData(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    UserData(Parcel parcel, am am1)
    {
        this(parcel);
    }

    UserData(String s, String s1)
    {
        a = s;
        b = s1;
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        if (a == null) goto _L2; else goto _L1
_L1:
        Object obj = a;
_L3:
        jsonobject.put("userId", obj);
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj = b;
_L4:
        jsonobject.put("marketplace", obj);
        return jsonobject;
_L2:
        try
        {
            obj = (JSONObject)null;
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
          goto _L3
        obj = (JSONObject)null;
          goto _L4
    }

    public int describeContents()
    {
        return hashCode();
    }

    public String getMarketplace()
    {
        return b;
    }

    public String getUserId()
    {
        return a;
    }

    public String toString()
    {
        String s;
        try
        {
            s = a().toString(4);
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
            a, b
        });
    }


    // Unreferenced inner class com/amazon/device/associates/am
    static final class am
        implements android.os.Parcelable.Creator
    {

        public UserData a(Parcel parcel)
        {
            return new UserData(parcel, null);
        }

        public UserData[] a(int i)
        {
            return new UserData[i];
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public volatile Object[] newArray(int i)
        {
            return a(i);
        }

            am()
            {
            }
    }

}
