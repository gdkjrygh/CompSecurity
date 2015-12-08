// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
    public static class Builder
    {

        private DataType Sp;
        private DataSource Sq;
        private long Tt;
        private int Tu;
        private long UD;
        private long UE;
        private long UJ;
        private boolean UK;

        static DataSource a(Builder builder)
        {
            return builder.Sq;
        }

        static DataType b(Builder builder)
        {
            return builder.Sp;
        }

        static long c(Builder builder)
        {
            return builder.Tt;
        }

        static long d(Builder builder)
        {
            return builder.UE;
        }

        static long e(Builder builder)
        {
            return builder.UD;
        }

        static int f(Builder builder)
        {
            return builder.Tu;
        }

        static long g(Builder builder)
        {
            return builder.UJ;
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
            return new SensorRequest(this);
        }

        public Builder setAccuracyMode(int i)
        {
            Tu = SensorRequest.da(i);
            return this;
        }

        public Builder setDataSource(DataSource datasource)
        {
            Sq = datasource;
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            Sp = datatype;
            return this;
        }

        public Builder setFastestRate(int i, TimeUnit timeunit)
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

        public Builder setMaxDeliveryLatency(int i, TimeUnit timeunit)
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

        public Builder setSamplingRate(long l, TimeUnit timeunit)
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

        public Builder setTimeout(long l, TimeUnit timeunit)
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

        public Builder()
        {
            Tt = -1L;
            UE = 0L;
            UD = 0L;
            UK = false;
            Tu = 2;
            UJ = 0x7fffffffffffffffL;
        }
    }


    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final DataType Sp;
    private final DataSource Sq;
    private final long Tt;
    private final int Tu;
    private final long UD;
    private final long UE;
    private final LocationRequest UI;
    private final long UJ;

    private SensorRequest(DataSource datasource, LocationRequest locationrequest)
    {
        UI = locationrequest;
        Tt = TimeUnit.MILLISECONDS.toMicros(locationrequest.getInterval());
        UE = TimeUnit.MILLISECONDS.toMicros(locationrequest.getFastestInterval());
        UD = Tt;
        Sp = datasource.getDataType();
        Tu = a(locationrequest);
        Sq = datasource;
        long l = locationrequest.getExpirationTime();
        if (l == 0x7fffffffffffffffL)
        {
            UJ = 0x7fffffffffffffffL;
            return;
        } else
        {
            UJ = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
            return;
        }
    }

    private SensorRequest(Builder builder)
    {
        Sq = Builder.a(builder);
        Sp = Builder.b(builder);
        Tt = Builder.c(builder);
        UE = Builder.d(builder);
        UD = Builder.e(builder);
        Tu = Builder.f(builder);
        UI = null;
        UJ = Builder.g(builder);
    }


    private static int a(LocationRequest locationrequest)
    {
        switch (locationrequest.getPriority())
        {
        default:
            return 2;

        case 100: // 'd'
            return 3;

        case 104: // 'h'
            return 1;
        }
    }

    private boolean a(SensorRequest sensorrequest)
    {
        return n.equal(Sq, sensorrequest.Sq) && n.equal(Sp, sensorrequest.Sp) && Tt == sensorrequest.Tt && UE == sensorrequest.UE && UD == sensorrequest.UD && Tu == sensorrequest.Tu && n.equal(UI, sensorrequest.UI) && UJ == sensorrequest.UJ;
    }

    public static int da(int i)
    {
        int j = i;
        switch (i)
        {
        case 2: // '\002'
        default:
            j = 2;
            // fall through

        case 1: // '\001'
        case 3: // '\003'
            return j;
        }
    }

    public static SensorRequest fromLocationRequest(DataSource datasource, LocationRequest locationrequest)
    {
        return new SensorRequest(datasource, locationrequest);
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SensorRequest) && a((SensorRequest)obj);
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

    public long getFastestRate(TimeUnit timeunit)
    {
        return timeunit.convert(UE, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeunit)
    {
        return timeunit.convert(UD, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        return timeunit.convert(Tt, TimeUnit.MICROSECONDS);
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Sq, Sp, Long.valueOf(Tt), Long.valueOf(UE), Long.valueOf(UD), Integer.valueOf(Tu), UI, Long.valueOf(UJ)
        });
    }

    public long jx()
    {
        return UJ;
    }

    public String toString()
    {
        return n.h(this).a("dataSource", Sq).a("dataType", Sp).a("samplingRateMicros", Long.valueOf(Tt)).a("deliveryLatencyMicros", Long.valueOf(UD)).a("timeOutMicros", Long.valueOf(UJ)).toString();
    }
}
