// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.k;
import com.google.android.gms.internal.jv;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            p, SensorRequest

public class o
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    private final int CK;
    private final DataType TM;
    private final DataSource TN;
    private final long UQ;
    private final int UR;
    private k VW;
    int VX;
    int VY;
    private final long VZ;
    private final long Wa;
    private final List Wb;
    private final long Wc;
    private final List Wd;
    private final PendingIntent mPendingIntent;

    o(int i, DataSource datasource, DataType datatype, IBinder ibinder, int j, int l, long l1, long l2, PendingIntent pendingintent, long l3, int i1, 
            List list, long l4)
    {
        CK = i;
        TN = datasource;
        TM = datatype;
        long l5;
        if (ibinder == null)
        {
            datasource = null;
        } else
        {
            datasource = com.google.android.gms.fitness.data.k.a.aq(ibinder);
        }
        VW = datasource;
        l5 = l1;
        if (l1 == 0L)
        {
            l5 = j;
        }
        UQ = l5;
        Wa = l3;
        l1 = l2;
        if (l2 == 0L)
        {
            l1 = l;
        }
        VZ = l1;
        Wb = list;
        mPendingIntent = pendingintent;
        UR = i1;
        Wd = Collections.emptyList();
        Wc = l4;
    }

    private o(DataSource datasource, DataType datatype, k k1, PendingIntent pendingintent, long l, long l1, long l2, int i, List list, List list1, long l3)
    {
        CK = 4;
        TN = datasource;
        TM = datatype;
        VW = k1;
        mPendingIntent = pendingintent;
        UQ = l;
        Wa = l1;
        VZ = l2;
        UR = i;
        Wb = list;
        Wd = list1;
        Wc = l3;
    }

    public o(SensorRequest sensorrequest, k k1, PendingIntent pendingintent)
    {
        this(sensorrequest.getDataSource(), sensorrequest.getDataType(), k1, pendingintent, sensorrequest.getSamplingRate(TimeUnit.MICROSECONDS), sensorrequest.getFastestRate(TimeUnit.MICROSECONDS), sensorrequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), sensorrequest.getAccuracyMode(), null, Collections.emptyList(), sensorrequest.kh());
    }

    private boolean a(o o1)
    {
        return jv.equal(TN, o1.TN) && jv.equal(TM, o1.TM) && UQ == o1.UQ && Wa == o1.Wa && VZ == o1.VZ && UR == o1.UR && jv.equal(Wb, o1.Wb);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof o) && a((o)obj);
    }

    public int getAccuracyMode()
    {
        return UR;
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
        return jv.hashCode(new Object[] {
            TN, TM, VW, Long.valueOf(UQ), Long.valueOf(Wa), Long.valueOf(VZ), Integer.valueOf(UR), Wb
        });
    }

    public long jI()
    {
        return UQ;
    }

    public PendingIntent kb()
    {
        return mPendingIntent;
    }

    public long kc()
    {
        return Wa;
    }

    public long kd()
    {
        return VZ;
    }

    public List ke()
    {
        return Wb;
    }

    public long kf()
    {
        return Wc;
    }

    IBinder kg()
    {
        if (VW == null)
        {
            return null;
        } else
        {
            return VW.asBinder();
        }
    }

    public String toString()
    {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[] {
            TM, TN, Long.valueOf(UQ), Long.valueOf(Wa), Long.valueOf(VZ)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
