// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.util;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.util:
//            c

public class UserDataParcelable
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public String a;
    public String b;
    public String c;
    public String d;

    private UserDataParcelable(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
    }

    UserDataParcelable(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public UserDataParcelable(String s, String s1, String s2)
    {
        Object obj = null;
        String s3;
        if (s2 == null)
        {
            s3 = null;
        } else
        {
            s3 = (new StringBuilder()).append(s2).append("/orig.jpg").toString();
        }
        if (s2 == null)
        {
            s2 = obj;
        } else
        {
            s2 = (new StringBuilder()).append(s2).append("/thumb.jpg").toString();
        }
        this(s, s1, s3, s2);
    }

    private UserDataParcelable(String s, String s1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    public static JSONObject a(UserDataParcelable userdataparcelable)
    {
        if (userdataparcelable.c == null && userdataparcelable.b == null && userdataparcelable.d == null)
        {
            return (new JSONObject()).put("username", userdataparcelable.a);
        }
        JSONObject jsonobject = (new JSONObject()).put("username", userdataparcelable.a).put("displayName", userdataparcelable.b);
        if (userdataparcelable.c == null || userdataparcelable.d == null)
        {
            jsonobject.put("pic", JSONObject.NULL);
            jsonobject.put("thumbnail", JSONObject.NULL);
            return jsonobject;
        } else
        {
            jsonobject.put("pic", userdataparcelable.c).put("thumbnail", userdataparcelable.d);
            return jsonobject;
        }
    }

    public final void a()
    {
        b = null;
        c = null;
        d = null;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
