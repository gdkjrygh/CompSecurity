// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
    public static class Builder
    {

        private DataType TM;
        private DataSource TN;
        private long UQ;
        private int UR;
        private long VZ;
        private long Wa;
        private long Wf;
        private boolean Wg;

        static DataSource a(Builder builder)
        {
            return builder.TN;
        }

        static DataType b(Builder builder)
        {
            return builder.TM;
        }

        static long c(Builder builder)
        {
            return builder.UQ;
        }

        static long d(Builder builder)
        {
            return builder.Wa;
        }

        static long e(Builder builder)
        {
            return builder.VZ;
        }

        static int f(Builder builder)
        {
            return builder.UR;
        }

        static long g(Builder builder)
        {
            return builder.Wf;
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
            return new SensorRequest(this);
        }

        public Builder setAccuracyMode(int i)
        {
            UR = SensorRequest.dl(i);
            return this;
        }

        public Builder setDataSource(DataSource datasource)
        {
            TN = datasource;
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            TM = datatype;
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
            jx.b(flag, "Cannot use a negative interval");
            Wg = true;
            Wa = timeunit.toMicros(i);
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
            jx.b(flag, "Cannot use a negative delivery interval");
            VZ = timeunit.toMicros(i);
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
            jx.b(flag, "Cannot use a negative sampling interval");
            UQ = timeunit.toMicros(l);
            if (!Wg)
            {
                Wa = UQ / 2L;
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

        public Builder()
        {
            UQ = -1L;
            Wa = 0L;
            VZ = 0L;
            Wg = false;
            UR = 2;
            Wf = 0x7fffffffffffffffL;
        }
    }


    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final DataType TM;
    private final DataSource TN;
    private final long UQ;
    private final int UR;
    private final long VZ;
    private final long Wa;
    private final LocationRequest We;
    private final long Wf;

    private SensorRequest(DataSource datasource, LocationRequest locationrequest)
    {
        We = locationrequest;
        UQ = TimeUnit.MILLISECONDS.toMicros(locationrequest.getInterval());
        Wa = TimeUnit.MILLISECONDS.toMicros(locationrequest.getFastestInterval());
        VZ = UQ;
        TM = datasource.getDataType();
        UR = a(locationrequest);
        TN = datasource;
        long l = locationrequest.getExpirationTime();
        if (l == 0x7fffffffffffffffL)
        {
            Wf = 0x7fffffffffffffffL;
            return;
        } else
        {
            Wf = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
            return;
        }
    }

    private SensorRequest(Builder builder)
    {
        TN = Builder.a(builder);
        TM = Builder.b(builder);
        UQ = Builder.c(builder);
        Wa = Builder.d(builder);
        VZ = Builder.e(builder);
        UR = Builder.f(builder);
        We = null;
        Wf = Builder.g(builder);
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
        return jv.equal(TN, sensorrequest.TN) && jv.equal(TM, sensorrequest.TM) && UQ == sensorrequest.UQ && Wa == sensorrequest.Wa && VZ == sensorrequest.VZ && UR == sensorrequest.UR && jv.equal(We, sensorrequest.We) && Wf == sensorrequest.Wf;
    }

    public static int dl(int i)
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

    public long getFastestRate(TimeUnit timeunit)
    {
        return timeunit.convert(Wa, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeunit)
    {
        return timeunit.convert(VZ, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        return timeunit.convert(UQ, TimeUnit.MICROSECONDS);
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TN, TM, Long.valueOf(UQ), Long.valueOf(Wa), Long.valueOf(VZ), Integer.valueOf(UR), We, Long.valueOf(Wf)
        });
    }

    public long kh()
    {
        return Wf;
    }

    public String toString()
    {
        return jv.h(this).a("dataSource", TN).a("dataType", TM).a("samplingRateMicros", Long.valueOf(UQ)).a("deliveryLatencyMicros", Long.valueOf(VZ)).a("timeOutMicros", Long.valueOf(Wf)).toString();
    }
}
