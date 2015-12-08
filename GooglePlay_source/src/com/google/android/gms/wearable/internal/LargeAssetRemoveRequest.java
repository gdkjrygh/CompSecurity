// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetRemoveRequestCreator

public final class LargeAssetRemoveRequest
    implements SafeParcelable
{

    private static final LargeAssetRemoveRequest CLEAR_ALL_INSTANCE = new LargeAssetRemoveRequest(1, null);
    public static final android.os.Parcelable.Creator CREATOR = new LargeAssetRemoveRequestCreator();
    final int mVersionCode;
    public final long transferIdsToRemove[];

    LargeAssetRemoveRequest(int i, long al[])
    {
        mVersionCode = i;
        transferIdsToRemove = al;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("LargeAssetRemoveRequest{transferIdsToRemove=")).append(Arrays.toString(transferIdsToRemove)).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LargeAssetRemoveRequestCreator.writeToParcel$61d0d736(this, parcel);
    }

}
