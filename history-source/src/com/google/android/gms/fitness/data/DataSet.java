// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            f, RawDataPoint, DataPoint, DataSource, 
//            DataType, RawDataSet

public final class DataSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int CK;
    private final DataType TM;
    private final DataSource TN;
    private boolean Uc;
    private final List Uj;
    private final List Uk;

    DataSet(int i, DataSource datasource, DataType datatype, List list, List list1, boolean flag)
    {
        Uc = false;
        CK = i;
        TN = datasource;
        TM = datatype;
        Uc = flag;
        Uj = new ArrayList(list.size());
        if (i < 2)
        {
            list1 = Collections.singletonList(datasource);
        }
        Uk = list1;
        for (datasource = list.iterator(); datasource.hasNext(); Uj.add(new DataPoint(Uk, datatype)))
        {
            datatype = (RawDataPoint)datasource.next();
        }

    }

    private DataSet(DataSource datasource, DataType datatype)
    {
        Uc = false;
        CK = 3;
        TN = (DataSource)jx.i(datasource);
        TM = (DataType)jx.i(datatype);
        Uj = new ArrayList();
        Uk = new ArrayList();
        Uk.add(TN);
    }

    public DataSet(RawDataSet rawdataset, List list, List list1)
    {
        this(3, (DataSource)d(list, rawdataset.UJ), (DataType)d(list1, rawdataset.UL), rawdataset.UM, list, rawdataset.Uc);
    }

    private boolean a(DataSet dataset)
    {
        return com.google.android.gms.internal.jv.equal(TM, dataset.TM) && com.google.android.gms.internal.jv.equal(TN, dataset.TN) && com.google.android.gms.internal.jv.equal(Uj, dataset.Uj) && Uc == dataset.Uc;
    }

    public static DataSet create(DataSource datasource)
    {
        jx.b(datasource, "DataSource should be specified");
        return new DataSet(datasource, datasource.getDataType());
    }

    private static Object d(List list, int i)
    {
        if (i >= 0 && i < list.size())
        {
            return list.get(i);
        } else
        {
            return null;
        }
    }

    public void a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); b((DataPoint)iterable.next())) { }
    }

    public void add(DataPoint datapoint)
    {
        DataSource datasource = datapoint.getDataSource();
        jx.b(datasource.getStreamIdentifier().equals(TN.getStreamIdentifier()), "Conflicting data sources found %s vs %s", new Object[] {
            datasource, TN
        });
        jx.b(datapoint.getDataType().getName().equals(TM.getName()), "Conflicting data types found %s vs %s", new Object[] {
            datapoint.getDataType(), TM
        });
        boolean flag;
        if (datapoint.getTimestamp(TimeUnit.NANOSECONDS) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Data point does not have the timestamp set: %s", new Object[] {
            datapoint
        });
        if (datapoint.getStartTime(TimeUnit.NANOSECONDS) <= datapoint.getEndTime(TimeUnit.NANOSECONDS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Data point with start time greater than end time found: %s", new Object[] {
            datapoint
        });
        b(datapoint);
    }

    public void addAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); add((DataPoint)iterable.next())) { }
    }

    public void b(DataPoint datapoint)
    {
        Uj.add(datapoint);
        datapoint = datapoint.getOriginalDataSource();
        if (datapoint != null && !Uk.contains(datapoint))
        {
            Uk.add(datapoint);
        }
    }

    public DataPoint createDataPoint()
    {
        return DataPoint.create(TN);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataSet) && a((DataSet)obj);
    }

    List f(List list)
    {
        ArrayList arraylist = new ArrayList(Uj.size());
        for (Iterator iterator = Uj.iterator(); iterator.hasNext(); arraylist.add(new RawDataPoint((DataPoint)iterator.next(), list))) { }
        return arraylist;
    }

    public List getDataPoints()
    {
        return Collections.unmodifiableList(Uj);
    }

    public DataSource getDataSource()
    {
        return TN;
    }

    public DataType getDataType()
    {
        return TM;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return com.google.android.gms.internal.jv.hashCode(new Object[] {
            TM, TN
        });
    }

    public boolean jn()
    {
        return Uc;
    }

    List jv()
    {
        return f(Uk);
    }

    List jw()
    {
        return Uk;
    }

    public String toString()
    {
        Object obj = jv();
        String s = TN.toDebugString();
        if (Uj.size() >= 10)
        {
            obj = String.format("%d data points, first 5: %s", new Object[] {
                Integer.valueOf(Uj.size()), ((List) (obj)).subList(0, 5)
            });
        }
        return String.format("DataSet{%s %s}", new Object[] {
            s, obj
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.data.f.a(this, parcel, i);
    }

}
