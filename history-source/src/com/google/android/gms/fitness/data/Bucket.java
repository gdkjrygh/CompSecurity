// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.jv;
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
    private final int CK;
    private final long LW;
    private final long TO;
    private final Session TQ;
    private final int TZ;
    private final List Ua;
    private final int Ub;
    private boolean Uc;

    Bucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        Uc = false;
        CK = i;
        LW = l;
        TO = l1;
        TQ = session;
        TZ = j;
        Ua = list;
        Ub = k;
        Uc = flag;
    }

    public Bucket(RawBucket rawbucket, List list, List list1)
    {
        this(2, rawbucket.LW, rawbucket.TO, rawbucket.TQ, rawbucket.UI, a(rawbucket.Ua, list, list1), rawbucket.Ub, rawbucket.Uc);
    }

    private static List a(List list, List list1, List list2)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new DataSet((RawDataSet)list.next(), list1, list2))) { }
        return arraylist;
    }

    private boolean a(Bucket bucket)
    {
        return LW == bucket.LW && TO == bucket.TO && TZ == bucket.TZ && jv.equal(Ua, bucket.Ua) && Ub == bucket.Ub && Uc == bucket.Uc;
    }

    public static String cJ(int i)
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
        return LW == bucket.LW && TO == bucket.TO && TZ == bucket.TZ && Ub == bucket.Ub;
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
        return FitnessActivities.getName(TZ);
    }

    public int getBucketType()
    {
        return Ub;
    }

    public DataSet getDataSet(DataType datatype)
    {
        for (Iterator iterator = Ua.iterator(); iterator.hasNext();)
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
        return Ua;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(TO, TimeUnit.MILLISECONDS);
    }

    public Session getSession()
    {
        return TQ;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(LW, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Long.valueOf(LW), Long.valueOf(TO), Integer.valueOf(TZ), Integer.valueOf(Ub)
        });
    }

    public int jm()
    {
        return TZ;
    }

    public boolean jn()
    {
        if (Uc)
        {
            return true;
        }
        for (Iterator iterator = Ua.iterator(); iterator.hasNext();)
        {
            if (((DataSet)iterator.next()).jn())
            {
                return true;
            }
        }

        return false;
    }

    public long jo()
    {
        return LW;
    }

    public long jp()
    {
        return TO;
    }

    public String toString()
    {
        return jv.h(this).a("startTime", Long.valueOf(LW)).a("endTime", Long.valueOf(TO)).a("activity", Integer.valueOf(TZ)).a("dataSets", Ua).a("bucketType", cJ(Ub)).a("serverHasMoreData", Boolean.valueOf(Uc)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
