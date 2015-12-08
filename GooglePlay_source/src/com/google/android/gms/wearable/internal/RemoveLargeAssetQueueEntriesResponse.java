// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            RemoveLargeAssetQueueEntriesResponseCreator

public final class RemoveLargeAssetQueueEntriesResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new RemoveLargeAssetQueueEntriesResponseCreator();
    public final int numDeleted;
    public final Status status;
    public final int versionCode;

    RemoveLargeAssetQueueEntriesResponse(int i, Status status1, int j)
    {
        versionCode = i;
        status = (Status)Preconditions.checkNotNull(status1, "status");
        numDeleted = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        RemoveLargeAssetQueueEntriesResponseCreator.writeToParcel(this, parcel, i);
    }

}
