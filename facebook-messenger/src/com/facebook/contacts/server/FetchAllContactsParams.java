// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.server:
//            g

public class FetchAllContactsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int a;
    private final String b;
    private final long c;

    private FetchAllContactsParams(int i, String s, long l)
    {
        a = i;
        b = s;
        c = l;
    }

    private FetchAllContactsParams(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readLong();
    }

    FetchAllContactsParams(Parcel parcel, g g1)
    {
        this(parcel);
    }

    public static FetchAllContactsParams a(int i, String s)
    {
        return new FetchAllContactsParams(i, s, -1L);
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
        parcel.writeLong(c);
    }

}
