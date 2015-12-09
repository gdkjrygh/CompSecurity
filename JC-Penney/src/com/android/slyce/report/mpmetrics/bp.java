// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

final class bp
    implements android.os.Parcelable.Creator
{

    bp()
    {
    }

    public UpdateDisplayState.DisplayState.InAppNotificationState a(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/android/slyce/report/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState.getClassLoader());
        bundle.readFromParcel(parcel);
        return new UpdateDisplayState.DisplayState.InAppNotificationState(bundle, null);
    }

    public UpdateDisplayState.DisplayState.InAppNotificationState[] a(int i)
    {
        return new UpdateDisplayState.DisplayState.InAppNotificationState[i];
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
