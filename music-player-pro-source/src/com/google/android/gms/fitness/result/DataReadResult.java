// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            b

public class DataReadResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int CK;
    private final Status Eb;
    private final List Ua;
    private final List Uk;
    private final List Wr;
    private int Ws;
    private final List Wt;

    DataReadResult(int i, List list, Status status, List list1, int j, List list2, List list3)
    {
        CK = i;
        Eb = status;
        Ws = j;
        Uk = list2;
        Wt = list3;
        Ua = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); Ua.add(new DataSet(status, list2, list3)))
        {
            status = (RawDataSet)list.next();
        }

        Wr = new ArrayList(list1.size());
        for (list = list1.iterator(); list.hasNext(); Wr.add(new Bucket(status, list2, list3)))
        {
            status = (RawBucket)list.next();
        }

    }

    public DataReadResult(List list, List list1, Status status)
    {
        CK = 5;
        Ua = list;
        Eb = status;
        Wr = list1;
        Ws = 1;
        Uk = new ArrayList();
        Wt = new ArrayList();
    }

    public static DataReadResult a(Status status, DataReadRequest datareadrequest)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = datareadrequest.getDataSources().iterator(); iterator.hasNext(); arraylist.add(DataSet.create((DataSource)iterator.next()))) { }
        DataType datatype;
        for (datareadrequest = datareadrequest.getDataTypes().iterator(); datareadrequest.hasNext(); arraylist.add(DataSet.create((new com.google.android.gms.fitness.data.DataSource.Builder()).setDataType(datatype).setType(1).setName("Default").build())))
        {
            datatype = (DataType)datareadrequest.next();
        }

        return new DataReadResult(arraylist, Collections.emptyList(), status);
    }

    private void a(Bucket bucket, List list)
    {
label0:
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                list = (Bucket)iterator.next();
                if (list.b(bucket))
                {
                    for (bucket = bucket.getDataSets().iterator(); bucket.hasNext(); a((DataSet)bucket.next(), list.getDataSets())) { }
                    break label0;
                }
            }

            Wr.add(bucket);
        }
    }

    private void a(DataSet dataset, List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            DataSet dataset1 = (DataSet)iterator.next();
            if (dataset1.getDataSource().equals(dataset.getDataSource()))
            {
                dataset1.a(dataset.getDataPoints());
                return;
            }
        }

        list.add(dataset);
    }

    private boolean c(DataReadResult datareadresult)
    {
        return Eb.equals(datareadresult.Eb) && jv.equal(Ua, datareadresult.Ua) && jv.equal(Wr, datareadresult.Wr);
    }

    public void b(DataReadResult datareadresult)
    {
        for (Iterator iterator = datareadresult.getDataSets().iterator(); iterator.hasNext(); a((DataSet)iterator.next(), Ua)) { }
        for (datareadresult = datareadresult.getBuckets().iterator(); datareadresult.hasNext(); a((Bucket)datareadresult.next(), Wr)) { }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataReadResult) && c((DataReadResult)obj);
    }

    public List getBuckets()
    {
        return Wr;
    }

    public DataSet getDataSet(DataSource datasource)
    {
        for (Iterator iterator = Ua.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if (datasource.equals(dataset.getDataSource()))
            {
                return dataset;
            }
        }

        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[] {
            datasource.getStreamIdentifier()
        }));
    }

    public DataSet getDataSet(DataType datatype)
    {
        for (Iterator iterator = Ua.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if (datatype.equals(dataset.getDataType()))
            {
                return dataset;
            }
        }

        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[] {
            datatype.getName()
        }));
    }

    public List getDataSets()
    {
        return Ua;
    }

    public Status getStatus()
    {
        return Eb;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Eb, Ua, Wr
        });
    }

    List jw()
    {
        return Uk;
    }

    public int kr()
    {
        return Ws;
    }

    List ks()
    {
        ArrayList arraylist = new ArrayList(Wr.size());
        for (Iterator iterator = Wr.iterator(); iterator.hasNext(); arraylist.add(new RawBucket((Bucket)iterator.next(), Uk, Wt))) { }
        return arraylist;
    }

    List kt()
    {
        ArrayList arraylist = new ArrayList(Ua.size());
        for (Iterator iterator = Ua.iterator(); iterator.hasNext(); arraylist.add(new RawDataSet((DataSet)iterator.next(), Uk, Wt))) { }
        return arraylist;
    }

    List ku()
    {
        return Wt;
    }

    public String toString()
    {
        com.google.android.gms.internal.jv.a a1 = jv.h(this).a("status", Eb);
        Object obj;
        if (Ua.size() > 5)
        {
            obj = (new StringBuilder()).append(Ua.size()).append(" data sets").toString();
        } else
        {
            obj = Ua;
        }
        a1 = a1.a("dataSets", obj);
        if (Wr.size() > 5)
        {
            obj = (new StringBuilder()).append(Wr.size()).append(" buckets").toString();
        } else
        {
            obj = Wr;
        }
        return a1.a("buckets", obj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.result.b.a(this, parcel, i);
    }

}
