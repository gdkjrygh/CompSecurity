// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.os.Parcel;

// Referenced classes of package com.fitbit.data.domain.device:
//            TrackerType, TrackerInfo

static final class 
    implements android.os.ator
{

    public TrackerType a(Parcel parcel)
    {
        TrackerType trackertype = new TrackerType(parcel);
        trackertype.a((TrackerInfo)parcel.readParcelable(com/fitbit/data/domain/device/TrackerInfo.getClassLoader()));
        return trackertype;
    }

    public TrackerType[] a(int i)
    {
        return new TrackerType[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
