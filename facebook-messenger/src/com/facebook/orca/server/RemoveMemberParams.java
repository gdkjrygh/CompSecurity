// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            at

public class RemoveMemberParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new at();
    private final String a;
    private final String b;

    private RemoveMemberParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    RemoveMemberParams(Parcel parcel, at at1)
    {
        this(parcel);
    }

    public RemoveMemberParams(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
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
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
