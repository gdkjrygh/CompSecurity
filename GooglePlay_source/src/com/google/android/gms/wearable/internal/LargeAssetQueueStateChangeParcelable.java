// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueStateChangeParcelableCreator, QueueEntryBufferImpl, LargeAssetQueueStateParcelable

public final class LargeAssetQueueStateChangeParcelable
    implements SafeParcelable, com.google.android.gms.wearable.LargeAssetApi.QueueStateChange
{

    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetQueueStateChangeParcelableCreator();
    private final QueueEntryBufferImpl mQueueEntryBuffer;
    final LargeAssetQueueStateParcelable mQueueState;
    final int mVersionCode;
    final DataHolder queueEntryBufferDataHolder;

    LargeAssetQueueStateChangeParcelable(int i, DataHolder dataholder, LargeAssetQueueStateParcelable largeassetqueuestateparcelable)
    {
        mVersionCode = i;
        queueEntryBufferDataHolder = (DataHolder)Preconditions.checkNotNull(dataholder);
        mQueueEntryBuffer = new QueueEntryBufferImpl(dataholder);
        mQueueState = (LargeAssetQueueStateParcelable)Preconditions.checkNotNull(largeassetqueuestateparcelable);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void release()
    {
        mQueueEntryBuffer.release();
    }

    public final String toString()
    {
        return (new StringBuilder("LargeAssetQueueStateChangeParcelable{queueEntryBuffer=")).append(mQueueEntryBuffer).append(", queueState=").append(mQueueState).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetQueueStateChangeParcelableCreator.writeToParcel(this, parcel, i);
    }

}
