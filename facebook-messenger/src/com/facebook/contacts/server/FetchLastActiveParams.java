// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.EnumSet;

// Referenced classes of package com.facebook.contacts.server:
//            q, x

public class FetchLastActiveParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    private final EnumSet a;
    private final int b;

    private FetchLastActiveParams(Parcel parcel)
    {
        a = (EnumSet)parcel.readSerializable();
        b = parcel.readInt();
    }

    FetchLastActiveParams(Parcel parcel, q q1)
    {
        this(parcel);
    }

    public FetchLastActiveParams(EnumSet enumset, int i)
    {
        a = enumset;
        b = i;
    }

    public static FetchLastActiveParams a()
    {
        return new FetchLastActiveParams(EnumSet.of(x.ALL), 0);
    }

    public static FetchLastActiveParams a(int i)
    {
        return new FetchLastActiveParams(EnumSet.of(x.TOP_FRIENDS, x.FAVORITE_FRIENDS), i);
    }

    public EnumSet b()
    {
        return a;
    }

    public int c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeSerializable(a);
        parcel.writeInt(b);
    }

}
