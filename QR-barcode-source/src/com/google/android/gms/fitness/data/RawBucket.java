// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
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
    final int BR;
    final long KS;
    final List SD;
    final int SE;
    final boolean SF;
    final long Sr;
    final Session St;
    final int Tl;

    RawBucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        BR = i;
        KS = l;
        Sr = l1;
        St = session;
        Tl = j;
        SD = list;
        SE = k;
        SF = flag;
    }

    public RawBucket(Bucket bucket, List list, List list1)
    {
        BR = 2;
        KS = bucket.getStartTime(TimeUnit.MILLISECONDS);
        Sr = bucket.getEndTime(TimeUnit.MILLISECONDS);
        St = bucket.getSession();
        Tl = bucket.iB();
        SE = bucket.getBucketType();
        SF = bucket.iC();
        bucket = bucket.getDataSets();
        SD = new ArrayList(bucket.size());
        DataSet dataset;
        for (bucket = bucket.iterator(); bucket.hasNext(); SD.add(new RawDataSet(dataset, list, list1)))
        {
            dataset = (DataSet)bucket.next();
        }

    }

    private boolean a(RawBucket rawbucket)
    {
        return KS == rawbucket.KS && Sr == rawbucket.Sr && Tl == rawbucket.Tl && n.equal(SD, rawbucket.SD) && SE == rawbucket.SE && SF == rawbucket.SF;
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
        return n.hashCode(new Object[] {
            Long.valueOf(KS), Long.valueOf(Sr), Integer.valueOf(SE)
        });
    }

    public String toString()
    {
        return n.h(this).a("startTime", Long.valueOf(KS)).a("endTime", Long.valueOf(Sr)).a("activity", Integer.valueOf(Tl)).a("dataSets", SD).a("bucketType", Integer.valueOf(SE)).a("serverHasMoreData", Boolean.valueOf(SF)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
