// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

final class bo
    implements android.os.Parcelable.Creator
{

    bo()
    {
    }

    public UpdateDisplayState.DisplayState a(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/android/slyce/report/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
        bundle.readFromParcel(parcel);
        parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
        bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
        if ("InAppNotificationState".equals(parcel))
        {
            return new UpdateDisplayState.DisplayState.InAppNotificationState(bundle, null);
        }
        if ("SurveyState".equals(parcel))
        {
            return new UpdateDisplayState.DisplayState.SurveyState(bundle, null);
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("Unrecognized display state type ").append(parcel).toString());
        }
    }

    public UpdateDisplayState.DisplayState[] a(int i)
    {
        return new UpdateDisplayState.DisplayState[i];
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
