// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.push.c2dm:
//            af

public class UnregisterPushTokenParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new af();
    private final String a;

    private UnregisterPushTokenParams(Parcel parcel)
    {
        a = parcel.readString();
    }

    UnregisterPushTokenParams(Parcel parcel, af af1)
    {
        this(parcel);
    }

    public UnregisterPushTokenParams(String s)
    {
        a = s;
    }

    public String a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
