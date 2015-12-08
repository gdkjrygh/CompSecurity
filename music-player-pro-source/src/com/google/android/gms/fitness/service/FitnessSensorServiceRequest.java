// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.k;
import com.google.android.gms.internal.jv;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.service:
//            a, b, SensorEventDispatcher

public class FitnessSensorServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public static final int UNSPECIFIED = -1;
    private final int CK;
    private final DataSource TN;
    private final k VW;
    private final long Wy;
    private final long Wz;

    FitnessSensorServiceRequest(int i, DataSource datasource, IBinder ibinder, long l, long l1)
    {
        CK = i;
        TN = datasource;
        VW = com.google.android.gms.fitness.data.k.a.aq(ibinder);
        Wy = l;
        Wz = l1;
    }

    private boolean a(FitnessSensorServiceRequest fitnesssensorservicerequest)
    {
        return jv.equal(TN, fitnesssensorservicerequest.TN) && Wy == fitnesssensorservicerequest.Wy && Wz == fitnesssensorservicerequest.Wz;
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
        return timeunit.convert(Wz, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource()
    {
        return TN;
    }

    public SensorEventDispatcher getDispatcher()
    {
        return new b(VW);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        if (Wy == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(Wy, TimeUnit.MICROSECONDS);
        }
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TN, Long.valueOf(Wy), Long.valueOf(Wz)
        });
    }

    public long jI()
    {
        return Wy;
    }

    IBinder kg()
    {
        return VW.asBinder();
    }

    public long kx()
    {
        return Wz;
    }

    public String toString()
    {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[] {
            TN
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.service.a.a(this, parcel, i);
    }

}
