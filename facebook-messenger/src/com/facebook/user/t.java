// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;

// Referenced classes of package com.facebook.user:
//            UserIdentifierKey

final class t
    implements android.os.Parcelable.Creator
{

    t()
    {
    }

    public UserIdentifierKey a(Parcel parcel)
    {
        return new UserIdentifierKey(parcel, null);
    }

    public UserIdentifierKey[] a(int i)
    {
        return new UserIdentifierKey[i];
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
