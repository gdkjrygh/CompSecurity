// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import android.os.Parcel;

// Referenced classes of package com.dominos.android.sdk.common.dom.tracker:
//            TrackerOrderStatus

final class 
    implements android.os.om.tracker.TrackerOrderStatus._cls1
{

    public final TrackerOrderStatus createFromParcel(Parcel parcel)
    {
        return new TrackerOrderStatus(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final TrackerOrderStatus[] newArray(int i)
    {
        return new TrackerOrderStatus[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
