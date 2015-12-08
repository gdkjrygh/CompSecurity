// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.internal:
//            FusedLocationProviderResultCreator

public final class FusedLocationProviderResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new FusedLocationProviderResultCreator();
    public static final FusedLocationProviderResult RESULT_SUCCESS;
    final Status mStatus;
    final int mVersionCode;

    FusedLocationProviderResult(int i, Status status)
    {
        mVersionCode = i;
        mStatus = status;
    }

    private FusedLocationProviderResult(Status status)
    {
        this(1, status);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        FusedLocationProviderResultCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        RESULT_SUCCESS = new FusedLocationProviderResult(Status.RESULT_SUCCESS);
    }
}
