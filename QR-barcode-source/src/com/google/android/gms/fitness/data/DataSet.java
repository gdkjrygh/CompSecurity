// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
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
    private final int BR;
    private boolean SF;
    private final List SM;
    private final List SN;
    private final DataType Sp;
    private final DataSource Sq;

    DataSet(int i, DataSource datasource, DataType datatype, List list, List list1, boolean flag)
    {
        SF = false;
        BR = i;
        Sq = datasource;
        Sp = datatype;
        SF = flag;
        SM = new ArrayList(list.size());
        if (i < 2)
        {
            list1 = Collections.singletonList(datasource);
        }
        SN = list1;
        for (datasource = list.iterator(); datasource.hasNext(); SM.add(new DataPoint(SN, datatype)))
        {
            datatype = (RawDataPoint)datasource.next();
        }

    }

    private DataSet(DataSource datasource, DataType datatype)
    {
        SF = false;
        BR = 3;
        Sq = (DataSource)o.i(datasource);
        Sp = (DataType)o.i(datatype);
        SM = new ArrayList();
        SN = new ArrayList();
        SN.add(Sq);
    }

    public DataSet(RawDataSet rawdataset, List list, List list1)
    {
        this(3, (DataSource)b(list, rawdataset.Tm), (DataType)b(list1, rawdataset.To), rawdataset.Tp, list, rawdataset.SF);
    }

    private boolean a(DataSet dataset)
    {
        return n.equal(Sp, dataset.Sp) && n.equal(Sq, dataset.Sq) && n.equal(SM, dataset.SM) && SF == dataset.SF;
    }

    private static Object b(List list, int i)
    {
        if (i >= 0 && i < list.size())
        {
            return list.get(i);
        } else
        {
            return null;
        }
    }

    public static DataSet create(DataSource datasource)
    {
        o.b(datasource, "DataSource should be specified");
        return new DataSet(datasource, datasource.getDataType());
    }

    public void a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); b((DataPoint)iterable.next())) { }
    }

    public void add(DataPoint datapoint)
    {
        DataSource datasource = datapoint.getDataSource();
        o.b(datasource.getStreamIdentifier().equals(Sq.getStreamIdentifier()), "Conflicting data sources found %s vs %s", new Object[] {
            datasource, Sq
        });
        o.b(datapoint.getDataType().getName().equals(Sp.getName()), "Conflicting data types found %s vs %s", new Object[] {
            datapoint.getDataType(), Sp
        });
        boolean flag;
        if (datapoint.getTimestamp(TimeUnit.NANOSECONDS) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Data point does not have the timestamp set: %s", new Object[] {
            datapoint
        });
        if (datapoint.getStartTime(TimeUnit.NANOSECONDS) <= datapoint.getEndTime(TimeUnit.NANOSECONDS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Data point with start time greater than end time found: %s", new Object[] {
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
        SM.add(datapoint);
        datapoint = datapoint.getOriginalDataSource();
        if (datapoint != null && !SN.contains(datapoint))
        {
            SN.add(datapoint);
        }
    }

    public DataPoint createDataPoint()
    {
        return DataPoint.create(Sq);
    }

    public int describeContents()
    {
        return 0;
    }

    List e(List list)
    {
        ArrayList arraylist = new ArrayList(SM.size());
        for (Iterator iterator = SM.iterator(); iterator.hasNext(); arraylist.add(new RawDataPoint((DataPoint)iterator.next(), list))) { }
        return arraylist;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataSet) && a((DataSet)obj);
    }

    public List getDataPoints()
    {
        return Collections.unmodifiableList(SM);
    }

    public DataSource getDataSource()
    {
        return Sq;
    }

    public DataType getDataType()
    {
        return Sp;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Sp, Sq
        });
    }

    public boolean iC()
    {
        return SF;
    }

    List iK()
    {
        return e(SN);
    }

    List iL()
    {
        return SN;
    }

    public String toString()
    {
        Object obj = iK();
        String s = Sq.toDebugString();
        if (SM.size() >= 10)
        {
            obj = String.format("%d data points, first 5: %s", new Object[] {
                Integer.valueOf(SM.size()), ((List) (obj)).subList(0, 5)
            });
        }
        return String.format("DataSet{%s %s}", new Object[] {
            s, obj
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
