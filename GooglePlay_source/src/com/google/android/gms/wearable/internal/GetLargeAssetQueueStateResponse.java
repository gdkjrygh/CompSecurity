// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetLargeAssetQueueStateResponseCreator, LargeAssetQueueStateParcelable

public final class GetLargeAssetQueueStateResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetLargeAssetQueueStateResponseCreator();
    final int mVersionCode;
    public final LargeAssetQueueStateParcelable queueState;
    public final Status status;

    GetLargeAssetQueueStateResponse(int i, Status status1, LargeAssetQueueStateParcelable largeassetqueuestateparcelable)
    {
        mVersionCode = i;
        status = status1;
        if (status1.isSuccess())
        {
            Preconditions.checkNotNull(largeassetqueuestateparcelable);
        }
        queueState = largeassetqueuestateparcelable;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        GetLargeAssetQueueStateResponseCreator.writeToParcel(this, parcel, i);
    }

}
