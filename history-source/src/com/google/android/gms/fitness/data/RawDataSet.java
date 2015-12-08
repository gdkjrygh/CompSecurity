// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            o, DataSet, t

public final class RawDataSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    final int CK;
    final int UJ;
    final int UL;
    final List UM;
    final boolean Uc;

    RawDataSet(int i, int j, int k, List list, boolean flag)
    {
        CK = i;
        UJ = j;
        UL = k;
        UM = list;
        Uc = flag;
    }

    public RawDataSet(DataSet dataset, List list, List list1)
    {
        CK = 2;
        UM = dataset.f(list);
        Uc = dataset.jn();
        UJ = t.a(dataset.getDataSource(), list);
        UL = t.a(dataset.getDataType(), list1);
    }

    private boolean a(RawDataSet rawdataset)
    {
        return UJ == rawdataset.UJ && UL == rawdataset.UL && Uc == rawdataset.Uc && jv.equal(UM, rawdataset.UM);
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
        return jv.hashCode(new Object[] {
            Integer.valueOf(UJ), Integer.valueOf(UL)
        });
    }

    public String toString()
    {
        return String.format("RawDataSet{%s@[%s, %s]}", new Object[] {
            Integer.valueOf(UJ), Integer.valueOf(UL), UM
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        o.a(this, parcel, i);
    }

}
