// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Parcel;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            InAppNotification

final class w
    implements android.os.Parcelable.Creator
{

    w()
    {
    }

    public InAppNotification a(Parcel parcel)
    {
        return new InAppNotification(parcel);
    }

    public InAppNotification[] a(int i)
    {
        return new InAppNotification[i];
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
