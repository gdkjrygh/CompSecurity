// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.herrevad;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kra;

public class PredictedNetworkQuality
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kra();
    public final int a;
    public int b;
    public int c;
    public long d;
    public long e;

    public PredictedNetworkQuality()
    {
        a = 1;
        c = -1;
        d = -1L;
        e = -1L;
    }

    public PredictedNetworkQuality(int i, int j, int k, long l, long l1)
    {
        a = i;
        b = j;
        c = k;
        d = l;
        e = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append("[\n");
        stringbuilder.append("networkType: ").append(b).append("\n");
        stringbuilder.append("predictedLatencyMicros: ").append(c).append("\n");
        stringbuilder.append("predictedDownThroughputBps: ").append(d).append("\n");
        stringbuilder.append("predictedUpThroughputBps: ").append(d).append("\n");
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kra.a(this, parcel);
    }

}
