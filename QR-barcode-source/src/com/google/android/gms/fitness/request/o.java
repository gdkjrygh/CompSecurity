// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.k;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            p, SensorRequest

public class o
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    private final int BR;
    private final DataType Sp;
    private final DataSource Sq;
    private final long Tt;
    private final int Tu;
    private k UA;
    int UB;
    int UC;
    private final long UD;
    private final long UE;
    private final List UF;
    private final long UG;
    private final List UH;
    private final PendingIntent mPendingIntent;

    o(int i, DataSource datasource, DataType datatype, IBinder ibinder, int j, int l, long l1, long l2, PendingIntent pendingintent, long l3, int i1, 
            List list, long l4)
    {
        BR = i;
        Sq = datasource;
        Sp = datatype;
        long l5;
        if (ibinder == null)
        {
            datasource = null;
        } else
        {
            datasource = com.google.android.gms.fitness.data.k.a.an(ibinder);
        }
        UA = datasource;
        l5 = l1;
        if (l1 == 0L)
        {
            l5 = j;
        }
        Tt = l5;
        UE = l3;
        l1 = l2;
        if (l2 == 0L)
        {
            l1 = l;
        }
        UD = l1;
        UF = list;
        mPendingIntent = pendingintent;
        Tu = i1;
        UH = Collections.emptyList();
        UG = l4;
    }

    private o(DataSource datasource, DataType datatype, k k1, PendingIntent pendingintent, long l, long l1, long l2, int i, List list, List list1, long l3)
    {
        BR = 4;
        Sq = datasource;
        Sp = datatype;
        UA = k1;
        mPendingIntent = pendingintent;
        Tt = l;
        UE = l1;
        UD = l2;
        Tu = i;
        UF = list;
        UH = list1;
        UG = l3;
    }

    public o(SensorRequest sensorrequest, k k1, PendingIntent pendingintent)
    {
        this(sensorrequest.getDataSource(), sensorrequest.getDataType(), k1, pendingintent, sensorrequest.getSamplingRate(TimeUnit.MICROSECONDS), sensorrequest.getFastestRate(TimeUnit.MICROSECONDS), sensorrequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), sensorrequest.getAccuracyMode(), null, Collections.emptyList(), sensorrequest.jx());
    }

    private boolean a(o o1)
    {
        return n.equal(Sq, o1.Sq) && n.equal(Sp, o1.Sp) && Tt == o1.Tt && UE == o1.UE && UD == o1.UD && Tu == o1.Tu && n.equal(UF, o1.UF);
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
        return Tu;
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
            Sq, Sp, UA, Long.valueOf(Tt), Long.valueOf(UE), Long.valueOf(UD), Integer.valueOf(Tu), UF
        });
    }

    public long iX()
    {
        return Tt;
    }

    public PendingIntent jr()
    {
        return mPendingIntent;
    }

    public long js()
    {
        return UE;
    }

    public long jt()
    {
        return UD;
    }

    public List ju()
    {
        return UF;
    }

    public long jv()
    {
        return UG;
    }

    IBinder jw()
    {
        if (UA == null)
        {
            return null;
        } else
        {
            return UA.asBinder();
        }
    }

    public String toString()
    {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[] {
            Sp, Sq, Long.valueOf(Tt), Long.valueOf(UE), Long.valueOf(UD)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
