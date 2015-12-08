// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;

// Referenced classes of package com.amazon.device.associates:
//            UserData

final class am
    implements android.os.Parcelable.Creator
{

    am()
    {
    }

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
}
