// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.os.Parcel;

// Referenced classes of package com.facebook.push.c2dm:
//            RegisterPushTokenParams

final class ab
    implements android.os.Parcelable.Creator
{

    ab()
    {
    }

    public RegisterPushTokenParams a(Parcel parcel)
    {
        return new RegisterPushTokenParams(parcel, null);
    }

    public RegisterPushTokenParams[] a(int i)
    {
        return new RegisterPushTokenParams[i];
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
