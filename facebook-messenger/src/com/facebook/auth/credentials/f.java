// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import android.os.Parcel;

// Referenced classes of package com.facebook.auth.credentials:
//            UserTokenCredentials

final class f
    implements android.os.Parcelable.Creator
{

    f()
    {
    }

    public UserTokenCredentials a(Parcel parcel)
    {
        return new UserTokenCredentials(parcel.readString(), parcel.readString());
    }

    public UserTokenCredentials[] a(int i)
    {
        return new UserTokenCredentials[i];
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
