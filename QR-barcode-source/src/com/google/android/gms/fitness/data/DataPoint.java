// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.kj;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            e, DataSource, DataType, Value, 
//            Field, RawDataPoint

public final class DataPoint
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private final int BR;
    private long SG;
    private long SH;
    private final Value SI[];
    private DataSource SJ;
    private long SK;
    private long SL;
    private final DataSource Sq;

    DataPoint(int i, DataSource datasource, long l, long l1, Value avalue[], 
            DataSource datasource1, long l2, long l3)
    {
        BR = i;
        Sq = datasource;
        SJ = datasource1;
        SG = l;
        SH = l1;
        SI = avalue;
        SK = l2;
        SL = l3;
    }

    private DataPoint(DataSource datasource)
    {
        BR = 4;
        Sq = (DataSource)o.b(datasource, "Data source cannot be null");
        datasource = datasource.getDataType().getFields();
        SI = new Value[datasource.size()];
        datasource = datasource.iterator();
        for (int i = 0; datasource.hasNext(); i++)
        {
            Field field = (Field)datasource.next();
            SI[i] = new Value(field.getFormat());
        }

    }

    DataPoint(List list, RawDataPoint rawdatapoint)
    {
        this(4, a(list, rawdatapoint.Tm), rawdatapoint.SG, rawdatapoint.SH, rawdatapoint.SI, a(list, rawdatapoint.Tn), rawdatapoint.SK, rawdatapoint.SL);
    }

    private static DataSource a(List list, int i)
    {
        if (i >= 0 && i < list.size())
        {
            return (DataSource)list.get(i);
        } else
        {
            return null;
        }
    }

    private boolean a(DataPoint datapoint)
    {
        return n.equal(Sq, datapoint.Sq) && SG == datapoint.SG && SH == datapoint.SH && Arrays.equals(SI, datapoint.SI) && n.equal(SJ, datapoint.SJ);
    }

    private void cA(int i)
    {
        List list = getDataType().getFields();
        int j = list.size();
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Attempting to insert %s values, but needed %s: %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), list
        });
    }

    public static DataPoint create(DataSource datasource)
    {
        return new DataPoint(datasource);
    }

    public static DataPoint extract(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return (DataPoint)c.a(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
        }
    }

    private boolean iF()
    {
        return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataPoint) && a((DataPoint)obj);
    }

    public DataSource getDataSource()
    {
        return Sq;
    }

    public DataType getDataType()
    {
        return Sq.getDataType();
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(SG, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource()
    {
        return SJ;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(SH, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeunit)
    {
        return timeunit.convert(SG, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos()
    {
        return SG;
    }

    public Value getValue(Field field)
    {
        int i = getDataType().indexOf(field);
        return SI[i];
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Sq, Long.valueOf(SG), Long.valueOf(SH)
        });
    }

    public Value[] iG()
    {
        return SI;
    }

    public long iH()
    {
        return SK;
    }

    public long iI()
    {
        return SL;
    }

    public long iJ()
    {
        return SH;
    }

    public transient DataPoint setFloatValues(float af[])
    {
        cA(af.length);
        for (int i = 0; i < af.length; i++)
        {
            SI[i].setFloat(af[i]);
        }

        return this;
    }

    public transient DataPoint setIntValues(int ai[])
    {
        cA(ai.length);
        for (int i = 0; i < ai.length; i++)
        {
            SI[i].setInt(ai[i]);
        }

        return this;
    }

    public DataPoint setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        SH = timeunit.toNanos(l);
        SG = timeunit.toNanos(l1);
        return this;
    }

    public DataPoint setTimestamp(long l, TimeUnit timeunit)
    {
        SG = timeunit.toNanos(l);
        if (iF() && kj.a(timeunit))
        {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            SG = kj.a(SG, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public String toString()
    {
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[] {
            Arrays.toString(SI), Long.valueOf(SH), Long.valueOf(SG), Long.valueOf(SK), Long.valueOf(SL), Sq, SJ
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
