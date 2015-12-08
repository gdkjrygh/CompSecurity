// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

final class bq
    implements android.os.Parcelable.Creator
{

    bq()
    {
    }

    public UpdateDisplayState.DisplayState.SurveyState a(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/android/slyce/report/mpmetrics/UpdateDisplayState$DisplayState$SurveyState.getClassLoader());
        bundle.readFromParcel(parcel);
        return new UpdateDisplayState.DisplayState.SurveyState(bundle, null);
    }

    public UpdateDisplayState.DisplayState.SurveyState[] a(int i)
    {
        return new UpdateDisplayState.DisplayState.SurveyState[i];
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
