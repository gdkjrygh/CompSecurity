// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

final class ap
    implements android.os.Parcelable.Creator
{

    ap()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
        bundle.readFromParcel(parcel);
        return new UpdateDisplayState.DisplayState.SurveyState(bundle, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UpdateDisplayState.DisplayState.SurveyState[i];
    }
}
