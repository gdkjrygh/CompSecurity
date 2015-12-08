// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jx;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SensorRequest

public static class Wf
{

    private DataType TM;
    private DataSource TN;
    private long UQ;
    private int UR;
    private long VZ;
    private long Wa;
    private long Wf;
    private boolean Wg;

    static DataSource a(Wf wf)
    {
        return wf.TN;
    }

    static DataType b(TN tn)
    {
        return tn.TM;
    }

    static long c(TM tm)
    {
        return tm.UQ;
    }

    static long d(UQ uq)
    {
        return uq.Wa;
    }

    static long e(Wa wa)
    {
        return wa.VZ;
    }

    static int f(VZ vz)
    {
        return vz.UR;
    }

    static long g(UR ur)
    {
        return ur.Wf;
    }

    public SensorRequest build()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (TN != null || TM != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must call setDataSource() or setDataType()");
            if (TM != null && TN != null)
            {
                flag = flag1;
                if (!TM.equals(TN.getDataType()))
                {
                    break label0;
                }
            }
            flag = true;
        }
        jx.a(flag, "Specified data type is incompatible with specified data source");
        return new SensorRequest(this, null);
    }

    public TN setAccuracyMode(int i)
    {
        UR = SensorRequest.dl(i);
        return this;
    }

    public UR setDataSource(DataSource datasource)
    {
        TN = datasource;
        return this;
    }

    public TN setDataType(DataType datatype)
    {
        TM = datatype;
        return this;
    }

    public TM setFastestRate(int i, TimeUnit timeunit)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Cannot use a negative interval");
        Wg = true;
        Wa = timeunit.toMicros(i);
        return this;
    }

    public Wa setMaxDeliveryLatency(int i, TimeUnit timeunit)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Cannot use a negative delivery interval");
        VZ = timeunit.toMicros(i);
        return this;
    }

    public VZ setSamplingRate(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Cannot use a negative sampling interval");
        UQ = timeunit.toMicros(l);
        if (!Wg)
        {
            Wa = UQ / 2L;
        }
        return this;
    }

    public UQ setTimeout(long l, TimeUnit timeunit)
    {
        boolean flag1 = true;
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Invalid time out value specified: %d", new Object[] {
            Long.valueOf(l)
        });
        if (timeunit != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Invalid time unit specified");
        Wf = timeunit.toMicros(l);
        return this;
    }

    public ()
    {
        UQ = -1L;
        Wa = 0L;
        VZ = 0L;
        Wg = false;
        UR = 2;
        Wf = 0x7fffffffffffffffL;
    }
}
