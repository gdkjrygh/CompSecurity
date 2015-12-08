// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.picker;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.picker:
//            b

public class PickerRequest
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public String a;
    public JSONObject b;

    private PickerRequest(Parcel parcel)
    {
        a = parcel.readString();
        try
        {
            b = new JSONObject(parcel.readString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            b = new JSONObject();
        }
    }

    PickerRequest(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public PickerRequest(String s, JSONObject jsonobject)
    {
        a = s;
        b = jsonobject;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b.toString());
    }

}
