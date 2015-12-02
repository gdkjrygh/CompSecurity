// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            u

public class FetchVoipInfoParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    private final long a;

    public FetchVoipInfoParams(long l)
    {
        a = l;
    }

    private FetchVoipInfoParams(Parcel parcel)
    {
        a = parcel.readLong();
    }

    FetchVoipInfoParams(Parcel parcel, u u1)
    {
        this(parcel);
    }

    public long a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
    }

}
