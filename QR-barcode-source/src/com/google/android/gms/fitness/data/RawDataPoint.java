// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            n, DataPoint, t, Value

public final class RawDataPoint
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.data.n();
    final int BR;
    final long SG;
    final long SH;
    final Value SI[];
    final long SK;
    final long SL;
    final int Tm;
    final int Tn;

    RawDataPoint(int i, long l, long l1, Value avalue[], int j, 
            int k, long l2, long l3)
    {
        BR = i;
        SG = l;
        SH = l1;
        Tm = j;
        Tn = k;
        SK = l2;
        SL = l3;
        SI = avalue;
    }

    RawDataPoint(DataPoint datapoint, List list)
    {
        BR = 4;
        SG = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
        SH = datapoint.getStartTime(TimeUnit.NANOSECONDS);
        SI = datapoint.iG();
        Tm = t.a(datapoint.getDataSource(), list);
        Tn = t.a(datapoint.getOriginalDataSource(), list);
        SK = datapoint.iH();
        SL = datapoint.iI();
    }

    private boolean a(RawDataPoint rawdatapoint)
    {
        return SG == rawdatapoint.SG && SH == rawdatapoint.SH && Arrays.equals(SI, rawdatapoint.SI) && Tm == rawdatapoint.Tm && Tn == rawdatapoint.Tn && SK == rawdatapoint.SK;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawDataPoint) && a((RawDataPoint)obj);
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Long.valueOf(SG), Long.valueOf(SH)
        });
    }

    public String toString()
    {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[] {
            Arrays.toString(SI), Long.valueOf(SH), Long.valueOf(SG), Integer.valueOf(Tm), Integer.valueOf(Tn)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
