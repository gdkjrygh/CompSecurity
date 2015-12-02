// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            g

public class DeleteThreadParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final String a;

    private DeleteThreadParams(Parcel parcel)
    {
        a = parcel.readString();
    }

    DeleteThreadParams(Parcel parcel, g g1)
    {
        this(parcel);
    }

    public DeleteThreadParams(String s)
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
