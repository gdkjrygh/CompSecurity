// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;

// Referenced classes of package com.facebook.user:
//            UserPhoneNumber

final class ab
    implements android.os.Parcelable.Creator
{

    ab()
    {
    }

    public UserPhoneNumber a(Parcel parcel)
    {
        return new UserPhoneNumber(parcel, null);
    }

    public UserPhoneNumber[] a(int i)
    {
        return new UserPhoneNumber[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
