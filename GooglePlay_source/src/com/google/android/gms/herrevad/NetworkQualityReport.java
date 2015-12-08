// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.herrevad;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.herrevad:
//            NetworkQualityReportCreator

public class NetworkQualityReport
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new NetworkQualityReportCreator();
    public long mBytesDownloaded;
    public long mBytesUploaded;
    public Bundle mCustomParams;
    public long mDurationMicros;
    public boolean mIsNoConnectivity;
    public int mLatencyMicros;
    public int mMeasurementType;
    public final int mVersionCode;

    public NetworkQualityReport()
    {
        mLatencyMicros = -1;
        mDurationMicros = -1L;
        mBytesDownloaded = -1L;
        mBytesUploaded = -1L;
        mMeasurementType = -1;
        mCustomParams = new Bundle();
        mIsNoConnectivity = false;
        mVersionCode = 1;
    }

    NetworkQualityReport(int i, int j, long l, long l1, long l2, int k, Bundle bundle, boolean flag)
    {
        mLatencyMicros = -1;
        mDurationMicros = -1L;
        mBytesDownloaded = -1L;
        mBytesUploaded = -1L;
        mMeasurementType = -1;
        mCustomParams = new Bundle();
        mIsNoConnectivity = false;
        mVersionCode = i;
        mLatencyMicros = j;
        mDurationMicros = l;
        mBytesDownloaded = l1;
        mBytesUploaded = l2;
        mMeasurementType = k;
        mCustomParams = bundle;
        mIsNoConnectivity = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append("[\n");
        stringbuilder.append("mLatencyMicros: ").append(mLatencyMicros).append("\n");
        stringbuilder.append("mDurationMicros: ").append(mDurationMicros).append("\n");
        stringbuilder.append("mBytesDownloaded: ").append(mBytesDownloaded).append("\n");
        stringbuilder.append("mBytesUploaded: ").append(mBytesUploaded).append("\n");
        stringbuilder.append("mMeasurementType: ").append(mMeasurementType).append("\n");
        stringbuilder.append("mIsNoConnectivity: ").append(mIsNoConnectivity).append("\n");
        String s;
        for (Iterator iterator = mCustomParams.keySet().iterator(); iterator.hasNext(); stringbuilder.append("custom param: ").append(s).append("/").append(mCustomParams.getString(s)).append("\n"))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NetworkQualityReportCreator.writeToParcel$14c21a41(this, parcel);
    }

}
