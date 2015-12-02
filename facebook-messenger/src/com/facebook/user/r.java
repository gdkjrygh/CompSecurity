// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;

// Referenced classes of package com.facebook.user:
//            UserFbidIdentifier

final class r
    implements android.os.Parcelable.Creator
{

    r()
    {
    }

    public UserFbidIdentifier a(Parcel parcel)
    {
        return new UserFbidIdentifier(parcel, null);
    }

    public UserFbidIdentifier[] a(int i)
    {
        return new UserFbidIdentifier[i];
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
