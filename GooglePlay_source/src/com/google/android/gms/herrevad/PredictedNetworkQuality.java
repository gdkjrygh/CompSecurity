// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.herrevad;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.herrevad:
//            PredictedNetworkQualityCreator

public class PredictedNetworkQuality
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PredictedNetworkQualityCreator();
    final int mVersionCode;
    public int networkType;
    public long predictedDownThroughputBps;
    public int predictedLatencyMicros;
    public long predictedUpThroughputBps;

    public PredictedNetworkQuality()
    {
        mVersionCode = 1;
        predictedLatencyMicros = -1;
        predictedDownThroughputBps = -1L;
        predictedUpThroughputBps = -1L;
    }

    PredictedNetworkQuality(int i, int j, int k, long l, long l1)
    {
        mVersionCode = i;
        networkType = j;
        predictedLatencyMicros = k;
        predictedDownThroughputBps = l;
        predictedUpThroughputBps = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append("[\n");
        stringbuilder.append("networkType: ").append(networkType).append("\n");
        stringbuilder.append("predictedLatencyMicros: ").append(predictedLatencyMicros).append("\n");
        stringbuilder.append("predictedDownThroughputBps: ").append(predictedDownThroughputBps).append("\n");
        stringbuilder.append("predictedUpThroughputBps: ").append(predictedUpThroughputBps).append("\n");
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PredictedNetworkQualityCreator.writeToParcel$5858cc2d(this, parcel);
    }

}
