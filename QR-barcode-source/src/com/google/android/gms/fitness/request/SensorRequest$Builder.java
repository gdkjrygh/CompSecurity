// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SensorRequest

public static class UJ
{

    private DataType Sp;
    private DataSource Sq;
    private long Tt;
    private int Tu;
    private long UD;
    private long UE;
    private long UJ;
    private boolean UK;

    static DataSource a(UJ uj)
    {
        return uj.Sq;
    }

    static DataType b(Sq sq)
    {
        return sq.Sp;
    }

    static long c(Sp sp)
    {
        return sp.Tt;
    }

    static long d(Tt tt)
    {
        return tt.UE;
    }

    static long e(UE ue)
    {
        return ue.UD;
    }

    static int f(UD ud)
    {
        return ud.Tu;
    }

    static long g(Tu tu)
    {
        return tu.UJ;
    }

    public SensorRequest build()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (Sq != null || Sp != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must call setDataSource() or setDataType()");
            if (Sp != null && Sq != null)
            {
                flag = flag1;
                if (!Sp.equals(Sq.getDataType()))
                {
                    break label0;
                }
            }
            flag = true;
        }
        o.a(flag, "Specified data type is incompatible with specified data source");
        return new SensorRequest(this, null);
    }

    public Sq setAccuracyMode(int i)
    {
        Tu = SensorRequest.da(i);
        return this;
    }

    public Tu setDataSource(DataSource datasource)
    {
        Sq = datasource;
        return this;
    }

    public Sq setDataType(DataType datatype)
    {
        Sp = datatype;
        return this;
    }

    public Sp setFastestRate(int i, TimeUnit timeunit)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Cannot use a negative interval");
        UK = true;
        UE = timeunit.toMicros(i);
        return this;
    }

    public UE setMaxDeliveryLatency(int i, TimeUnit timeunit)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Cannot use a negative delivery interval");
        UD = timeunit.toMicros(i);
        return this;
    }

    public UD setSamplingRate(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Cannot use a negative sampling interval");
        Tt = timeunit.toMicros(l);
        if (!UK)
        {
            UE = Tt / 2L;
        }
        return this;
    }

    public Tt setTimeout(long l, TimeUnit timeunit)
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
        o.b(flag, "Invalid time out value specified: %d", new Object[] {
            Long.valueOf(l)
        });
        if (timeunit != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Invalid time unit specified");
        UJ = timeunit.toMicros(l);
        return this;
    }

    public ()
    {
        Tt = -1L;
        UE = 0L;
        UD = 0L;
        UK = false;
        Tu = 2;
        UJ = 0x7fffffffffffffffL;
    }
}
