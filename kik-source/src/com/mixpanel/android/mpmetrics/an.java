// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

final class an
    implements android.os.Parcelable.Creator
{

    an()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
        bundle.readFromParcel(parcel);
        parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
        bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
        if ("InAppNotificationState".equals(parcel))
        {
            return new UpdateDisplayState.DisplayState.InAppNotificationState(bundle, (byte)0);
        }
        if ("SurveyState".equals(parcel))
        {
            return new UpdateDisplayState.DisplayState.SurveyState(bundle, (byte)0);
        } else
        {
            throw new RuntimeException((new StringBuilder("Unrecognized display state type ")).append(parcel).toString());
        }
    }

    public final volatile Object[] newArray(int i)
    {
        return new UpdateDisplayState.DisplayState[i];
    }
}
