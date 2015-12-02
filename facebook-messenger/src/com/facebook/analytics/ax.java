// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.os.Parcel;

// Referenced classes of package com.facebook.analytics:
//            AnalyticsServiceEvent

final class ax
    implements android.os.Parcelable.Creator
{

    ax()
    {
    }

    public AnalyticsServiceEvent a(Parcel parcel)
    {
        return new AnalyticsServiceEvent(parcel, null);
    }

    public AnalyticsServiceEvent[] a(int i)
    {
        return new AnalyticsServiceEvent[i];
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
