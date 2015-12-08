// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            EnqueueLargeAssetResponseCreator, LargeAssetQueueEntryParcelable

public final class EnqueueLargeAssetResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new EnqueueLargeAssetResponseCreator();
    final int mVersionCode;
    public final LargeAssetQueueEntryParcelable queueEntry;
    public final int statusCode;

    EnqueueLargeAssetResponse(int i, int j, LargeAssetQueueEntryParcelable largeassetqueueentryparcelable)
    {
        boolean flag = true;
        super();
        mVersionCode = i;
        statusCode = j;
        if (j == 0)
        {
            if (largeassetqueueentryparcelable == null)
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Expecting non-null queueEntry");
        } else
        {
            boolean flag1;
            if (largeassetqueueentryparcelable == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1, "Expecting null queueEntry: %s", new Object[] {
                largeassetqueueentryparcelable
            });
        }
        queueEntry = largeassetqueueentryparcelable;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        EnqueueLargeAssetResponseCreator.writeToParcel(this, parcel, i);
    }

}
