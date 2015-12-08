// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.k;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.service:
//            a, b, SensorEventDispatcher

public class FitnessSensorServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int UNSPECIFIED = -1;
    private final int BR;
    private final DataSource Sq;
    private final k UA;
    private final long Vc;
    private final long Vd;

    FitnessSensorServiceRequest(int i, DataSource datasource, IBinder ibinder, long l, long l1)
    {
        BR = i;
        Sq = datasource;
        UA = com.google.android.gms.fitness.data.k.a.an(ibinder);
        Vc = l;
        Vd = l1;
    }

    private boolean a(FitnessSensorServiceRequest fitnesssensorservicerequest)
    {
        return n.equal(Sq, fitnesssensorservicerequest.Sq) && Vc == fitnesssensorservicerequest.Vc && Vd == fitnesssensorservicerequest.Vd;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof FitnessSensorServiceRequest) && a((FitnessSensorServiceRequest)obj);
    }

    public long getBatchInterval(TimeUnit timeunit)
    {
        return timeunit.convert(Vd, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource()
    {
        return Sq;
    }

    public SensorEventDispatcher getDispatcher()
    {
        return new b(UA);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        if (Vc == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(Vc, TimeUnit.MICROSECONDS);
        }
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Sq, Long.valueOf(Vc), Long.valueOf(Vd)
        });
    }

    public long iX()
    {
        return Vc;
    }

    public long jN()
    {
        return Vd;
    }

    IBinder jw()
    {
        return UA.asBinder();
    }

    public String toString()
    {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[] {
            Sq
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.service.a.a(this, parcel, i);
    }

}
