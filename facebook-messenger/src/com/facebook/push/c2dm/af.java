// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.os.Parcel;

// Referenced classes of package com.facebook.push.c2dm:
//            UnregisterPushTokenParams

final class af
    implements android.os.Parcelable.Creator
{

    af()
    {
    }

    public UnregisterPushTokenParams a(Parcel parcel)
    {
        return new UnregisterPushTokenParams(parcel, null);
    }

    public UnregisterPushTokenParams[] a(int i)
    {
        return new UnregisterPushTokenParams[i];
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
