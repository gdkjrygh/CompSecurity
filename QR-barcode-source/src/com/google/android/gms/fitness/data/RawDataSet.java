// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            o, DataSet, t

public final class RawDataSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    final int BR;
    final boolean SF;
    final int Tm;
    final int To;
    final List Tp;

    RawDataSet(int i, int j, int k, List list, boolean flag)
    {
        BR = i;
        Tm = j;
        To = k;
        Tp = list;
        SF = flag;
    }

    public RawDataSet(DataSet dataset, List list, List list1)
    {
        BR = 2;
        Tp = dataset.e(list);
        SF = dataset.iC();
        Tm = t.a(dataset.getDataSource(), list);
        To = t.a(dataset.getDataType(), list1);
    }

    private boolean a(RawDataSet rawdataset)
    {
        return Tm == rawdataset.Tm && To == rawdataset.To && SF == rawdataset.SF && n.equal(Tp, rawdataset.Tp);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawDataSet) && a((RawDataSet)obj);
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(Tm), Integer.valueOf(To)
        });
    }

    public String toString()
    {
        return String.format("RawDataSet{%s@[%s, %s]}", new Object[] {
            Integer.valueOf(Tm), Integer.valueOf(To), Tp
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
