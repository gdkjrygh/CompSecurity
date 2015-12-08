// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            UpdateDisplayState

final class bm
    implements android.os.Parcelable.Creator
{

    bm()
    {
    }

    public UpdateDisplayState a(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/android/slyce/report/mpmetrics/UpdateDisplayState.getClassLoader());
        bundle.readFromParcel(parcel);
        return new UpdateDisplayState(bundle, null);
    }

    public UpdateDisplayState[] a(int i)
    {
        return new UpdateDisplayState[i];
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
