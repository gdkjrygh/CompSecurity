// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueStateParcelableCreator

public final class LargeAssetQueueStateParcelable
    implements SafeParcelable, com.google.android.gms.wearable.LargeAssetApi.QueueState
{

    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetQueueStateParcelableCreator();
    final int mLocalNodeFlags;
    final String mLocalNodeId;
    final int mPausedCount;
    final Map mRemoteNodeFlags;
    final int mRunningCount;
    final int mVersionCode;

    LargeAssetQueueStateParcelable(int i, int j, String s, Bundle bundle, int k, int l)
    {
        mVersionCode = i;
        mLocalNodeFlags = j & 0xf;
        mLocalNodeId = (String)Preconditions.checkNotNull(s);
        mRemoteNodeFlags = bundleToFlagMap(bundle);
        mPausedCount = k;
        mRunningCount = l;
    }

    private static Map bundleToFlagMap(Bundle bundle)
    {
        Object obj = bundle.keySet();
        ArrayMap arraymap = new ArrayMap(((Set) (obj)).size());
        String s;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraymap.put(s, Integer.valueOf(bundle.getInt(s) & 0xf)))
        {
            s = (String)((Iterator) (obj)).next();
        }

        return arraymap;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LargeAssetQueueStateParcelable))
            {
                return false;
            }
            obj = (LargeAssetQueueStateParcelable)obj;
            if (mVersionCode != ((LargeAssetQueueStateParcelable) (obj)).mVersionCode || mLocalNodeFlags != ((LargeAssetQueueStateParcelable) (obj)).mLocalNodeFlags || mPausedCount != ((LargeAssetQueueStateParcelable) (obj)).mPausedCount || mRunningCount != ((LargeAssetQueueStateParcelable) (obj)).mRunningCount || !mLocalNodeId.equals(((LargeAssetQueueStateParcelable) (obj)).mLocalNodeId) || !mRemoteNodeFlags.equals(((LargeAssetQueueStateParcelable) (obj)).mRemoteNodeFlags))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((((mVersionCode * 31 + mLocalNodeFlags) * 31 + mLocalNodeId.hashCode()) * 31 + mRemoteNodeFlags.hashCode()) * 31 + mPausedCount) * 31 + mRunningCount;
    }

    public final String toString()
    {
        return (new StringBuilder("QueueState{localNodeFlags=")).append(mLocalNodeFlags).append(", localNodeId='").append(mLocalNodeId).append("', remoteNodeFlags=").append(mRemoteNodeFlags).append(", pausedCount=").append(mPausedCount).append(", runningCount=").append(mRunningCount).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetQueueStateParcelableCreator.writeToParcel$2673ddc(this, parcel);
    }

}
