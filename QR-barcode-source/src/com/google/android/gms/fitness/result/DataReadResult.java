// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
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
    private final int BR;
    private final Status CM;
    private final List SD;
    private final List SN;
    private final List UV;
    private int UW;
    private final List UX;

    DataReadResult(int i, List list, Status status, List list1, int j, List list2, List list3)
    {
        BR = i;
        CM = status;
        UW = j;
        SN = list2;
        UX = list3;
        SD = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); SD.add(new DataSet(status, list2, list3)))
        {
            status = (RawDataSet)list.next();
        }

        UV = new ArrayList(list1.size());
        for (list = list1.iterator(); list.hasNext(); UV.add(new Bucket(status, list2, list3)))
        {
            status = (RawBucket)list.next();
        }

    }

    public DataReadResult(List list, List list1, Status status)
    {
        BR = 5;
        SD = list;
        CM = status;
        UV = list1;
        UW = 1;
        SN = new ArrayList();
        UX = new ArrayList();
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

            UV.add(bucket);
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
        return CM.equals(datareadresult.CM) && n.equal(SD, datareadresult.SD) && n.equal(UV, datareadresult.UV);
    }

    public void b(DataReadResult datareadresult)
    {
        for (Iterator iterator = datareadresult.getDataSets().iterator(); iterator.hasNext(); a((DataSet)iterator.next(), SD)) { }
        for (datareadresult = datareadresult.getBuckets().iterator(); datareadresult.hasNext(); a((Bucket)datareadresult.next(), UV)) { }
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
        return UV;
    }

    public DataSet getDataSet(DataSource datasource)
    {
        for (Iterator iterator = SD.iterator(); iterator.hasNext();)
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
        for (Iterator iterator = SD.iterator(); iterator.hasNext();)
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
        return SD;
    }

    public Status getStatus()
    {
        return CM;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            CM, SD, UV
        });
    }

    List iL()
    {
        return SN;
    }

    public int jH()
    {
        return UW;
    }

    List jI()
    {
        ArrayList arraylist = new ArrayList(UV.size());
        for (Iterator iterator = UV.iterator(); iterator.hasNext(); arraylist.add(new RawBucket((Bucket)iterator.next(), SN, UX))) { }
        return arraylist;
    }

    List jJ()
    {
        ArrayList arraylist = new ArrayList(SD.size());
        for (Iterator iterator = SD.iterator(); iterator.hasNext(); arraylist.add(new RawDataSet((DataSet)iterator.next(), SN, UX))) { }
        return arraylist;
    }

    List jK()
    {
        return UX;
    }

    public String toString()
    {
        com.google.android.gms.common.internal.n.a a1 = n.h(this).a("status", CM);
        Object obj;
        if (SD.size() > 5)
        {
            obj = (new StringBuilder()).append(SD.size()).append(" data sets").toString();
        } else
        {
            obj = SD;
        }
        a1 = a1.a("dataSets", obj);
        if (UV.size() > 5)
        {
            obj = (new StringBuilder()).append(UV.size()).append(" buckets").toString();
        } else
        {
            obj = UV;
        }
        return a1.a("buckets", obj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.result.b.a(this, parcel, i);
    }

}
