// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            n, DataPoint, t, Value

public final class RawDataPoint
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    final int CK;
    final int UJ;
    final int UK;
    final long Ud;
    final long Ue;
    final Value Uf[];
    final long Uh;
    final long Ui;

    RawDataPoint(int i, long l, long l1, Value avalue[], int j, 
            int k, long l2, long l3)
    {
        CK = i;
        Ud = l;
        Ue = l1;
        UJ = j;
        UK = k;
        Uh = l2;
        Ui = l3;
        Uf = avalue;
    }

    RawDataPoint(DataPoint datapoint, List list)
    {
        CK = 4;
        Ud = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
        Ue = datapoint.getStartTime(TimeUnit.NANOSECONDS);
        Uf = datapoint.jr();
        UJ = t.a(datapoint.getDataSource(), list);
        UK = t.a(datapoint.getOriginalDataSource(), list);
        Uh = datapoint.js();
        Ui = datapoint.jt();
    }

    private boolean a(RawDataPoint rawdatapoint)
    {
        return Ud == rawdatapoint.Ud && Ue == rawdatapoint.Ue && Arrays.equals(Uf, rawdatapoint.Uf) && UJ == rawdatapoint.UJ && UK == rawdatapoint.UK && Uh == rawdatapoint.Uh;
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
        return jv.hashCode(new Object[] {
            Long.valueOf(Ud), Long.valueOf(Ue)
        });
    }

    public String toString()
    {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[] {
            Arrays.toString(Uf), Long.valueOf(Ue), Long.valueOf(Ud), Integer.valueOf(UJ), Integer.valueOf(UK)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
