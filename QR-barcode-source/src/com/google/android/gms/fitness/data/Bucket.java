// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            d, RawBucket, DataSet, RawDataSet, 
//            DataType, Session

public class Bucket
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final int BR;
    private final long KS;
    private final int SC;
    private final List SD;
    private final int SE;
    private boolean SF;
    private final long Sr;
    private final Session St;

    Bucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        SF = false;
        BR = i;
        KS = l;
        Sr = l1;
        St = session;
        SC = j;
        SD = list;
        SE = k;
        SF = flag;
    }

    public Bucket(RawBucket rawbucket, List list, List list1)
    {
        this(2, rawbucket.KS, rawbucket.Sr, rawbucket.St, rawbucket.Tl, a(rawbucket.SD, list, list1), rawbucket.SE, rawbucket.SF);
    }

    private static List a(List list, List list1, List list2)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new DataSet((RawDataSet)list.next(), list1, list2))) { }
        return arraylist;
    }

    private boolean a(Bucket bucket)
    {
        return KS == bucket.KS && Sr == bucket.Sr && SC == bucket.SC && n.equal(SD, bucket.SD) && SE == bucket.SE && SF == bucket.SF;
    }

    public static String cy(int i)
    {
        switch (i)
        {
        default:
            return "bug";

        case 1: // '\001'
            return "time";

        case 3: // '\003'
            return "type";

        case 4: // '\004'
            return "segment";

        case 2: // '\002'
            return "session";

        case 0: // '\0'
            return "unknown";
        }
    }

    public boolean b(Bucket bucket)
    {
        return KS == bucket.KS && Sr == bucket.Sr && SC == bucket.SC && SE == bucket.SE;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof Bucket) && a((Bucket)obj);
    }

    public String getActivity()
    {
        return FitnessActivities.getName(SC);
    }

    public int getBucketType()
    {
        return SE;
    }

    public DataSet getDataSet(DataType datatype)
    {
        for (Iterator iterator = SD.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if (dataset.getDataType().equals(datatype))
            {
                return dataset;
            }
        }

        return null;
    }

    public List getDataSets()
    {
        return SD;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(Sr, TimeUnit.MILLISECONDS);
    }

    public Session getSession()
    {
        return St;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(KS, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Long.valueOf(KS), Long.valueOf(Sr), Integer.valueOf(SC), Integer.valueOf(SE)
        });
    }

    public int iB()
    {
        return SC;
    }

    public boolean iC()
    {
        if (SF)
        {
            return true;
        }
        for (Iterator iterator = SD.iterator(); iterator.hasNext();)
        {
            if (((DataSet)iterator.next()).iC())
            {
                return true;
            }
        }

        return false;
    }

    public long iD()
    {
        return KS;
    }

    public long iE()
    {
        return Sr;
    }

    public String toString()
    {
        return n.h(this).a("startTime", Long.valueOf(KS)).a("endTime", Long.valueOf(Sr)).a("activity", Integer.valueOf(SC)).a("dataSets", SD).a("bucketType", cy(SE)).a("serverHasMoreData", Boolean.valueOf(SF)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
