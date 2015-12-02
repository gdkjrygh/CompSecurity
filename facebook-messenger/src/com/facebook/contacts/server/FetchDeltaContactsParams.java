// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            o

public class FetchDeltaContactsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    private final int a;
    private final String b;

    public FetchDeltaContactsParams(int i, String s)
    {
        a = i;
        b = s;
    }

    private FetchDeltaContactsParams(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
    }

    FetchDeltaContactsParams(Parcel parcel, o o1)
    {
        this(parcel);
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
    }

}
