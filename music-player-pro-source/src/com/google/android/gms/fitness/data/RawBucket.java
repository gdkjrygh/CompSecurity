// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            m, Bucket, DataSet, RawDataSet, 
//            Session

public final class RawBucket
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    final int CK;
    final long LW;
    final long TO;
    final Session TQ;
    final int UI;
    final List Ua;
    final int Ub;
    final boolean Uc;

    RawBucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        CK = i;
        LW = l;
        TO = l1;
        TQ = session;
        UI = j;
        Ua = list;
        Ub = k;
        Uc = flag;
    }

    public RawBucket(Bucket bucket, List list, List list1)
    {
        CK = 2;
        LW = bucket.getStartTime(TimeUnit.MILLISECONDS);
        TO = bucket.getEndTime(TimeUnit.MILLISECONDS);
        TQ = bucket.getSession();
        UI = bucket.jm();
        Ub = bucket.getBucketType();
        Uc = bucket.jn();
        bucket = bucket.getDataSets();
        Ua = new ArrayList(bucket.size());
        DataSet dataset;
        for (bucket = bucket.iterator(); bucket.hasNext(); Ua.add(new RawDataSet(dataset, list, list1)))
        {
            dataset = (DataSet)bucket.next();
        }

    }

    private boolean a(RawBucket rawbucket)
    {
        return LW == rawbucket.LW && TO == rawbucket.TO && UI == rawbucket.UI && jv.equal(Ua, rawbucket.Ua) && Ub == rawbucket.Ub && Uc == rawbucket.Uc;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawBucket) && a((RawBucket)obj);
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Long.valueOf(LW), Long.valueOf(TO), Integer.valueOf(Ub)
        });
    }

    public String toString()
    {
        return jv.h(this).a("startTime", Long.valueOf(LW)).a("endTime", Long.valueOf(TO)).a("activity", Integer.valueOf(UI)).a("dataSets", Ua).a("bucketType", Integer.valueOf(Ub)).a("serverHasMoreData", Boolean.valueOf(Uc)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
