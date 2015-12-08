// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.lt;
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
    private final int CK;
    private final DataSource TN;
    private long Ud;
    private long Ue;
    private final Value Uf[];
    private DataSource Ug;
    private long Uh;
    private long Ui;

    DataPoint(int i, DataSource datasource, long l, long l1, Value avalue[], 
            DataSource datasource1, long l2, long l3)
    {
        CK = i;
        TN = datasource;
        Ug = datasource1;
        Ud = l;
        Ue = l1;
        Uf = avalue;
        Uh = l2;
        Ui = l3;
    }

    private DataPoint(DataSource datasource)
    {
        CK = 4;
        TN = (DataSource)jx.b(datasource, "Data source cannot be null");
        datasource = datasource.getDataType().getFields();
        Uf = new Value[datasource.size()];
        datasource = datasource.iterator();
        for (int i = 0; datasource.hasNext(); i++)
        {
            Field field = (Field)datasource.next();
            Uf[i] = new Value(field.getFormat());
        }

    }

    DataPoint(List list, RawDataPoint rawdatapoint)
    {
        this(4, c(list, rawdatapoint.UJ), rawdatapoint.Ud, rawdatapoint.Ue, rawdatapoint.Uf, c(list, rawdatapoint.UK), rawdatapoint.Uh, rawdatapoint.Ui);
    }

    private boolean a(DataPoint datapoint)
    {
        return jv.equal(TN, datapoint.TN) && Ud == datapoint.Ud && Ue == datapoint.Ue && Arrays.equals(Uf, datapoint.Uf) && jv.equal(Ug, datapoint.Ug);
    }

    private static DataSource c(List list, int i)
    {
        if (i >= 0 && i < list.size())
        {
            return (DataSource)list.get(i);
        } else
        {
            return null;
        }
    }

    private void cL(int i)
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
        jx.b(flag, "Attempting to insert %s values, but needed %s: %s", new Object[] {
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
            return (DataPoint)com.google.android.gms.common.internal.safeparcel.c.a(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
        }
    }

    private boolean jq()
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
        return TN;
    }

    public DataType getDataType()
    {
        return TN.getDataType();
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(Ud, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource()
    {
        return Ug;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(Ue, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeunit)
    {
        return timeunit.convert(Ud, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos()
    {
        return Ud;
    }

    public Value getValue(Field field)
    {
        int i = getDataType().indexOf(field);
        return Uf[i];
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TN, Long.valueOf(Ud), Long.valueOf(Ue)
        });
    }

    public Value[] jr()
    {
        return Uf;
    }

    public long js()
    {
        return Uh;
    }

    public long jt()
    {
        return Ui;
    }

    public long ju()
    {
        return Ue;
    }

    public transient DataPoint setFloatValues(float af[])
    {
        cL(af.length);
        for (int i = 0; i < af.length; i++)
        {
            Uf[i].setFloat(af[i]);
        }

        return this;
    }

    public transient DataPoint setIntValues(int ai[])
    {
        cL(ai.length);
        for (int i = 0; i < ai.length; i++)
        {
            Uf[i].setInt(ai[i]);
        }

        return this;
    }

    public DataPoint setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        Ue = timeunit.toNanos(l);
        Ud = timeunit.toNanos(l1);
        return this;
    }

    public DataPoint setTimestamp(long l, TimeUnit timeunit)
    {
        Ud = timeunit.toNanos(l);
        if (jq() && lt.a(timeunit))
        {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            Ud = lt.a(Ud, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public String toString()
    {
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[] {
            Arrays.toString(Uf), Long.valueOf(Ue), Long.valueOf(Ud), Long.valueOf(Uh), Long.valueOf(Ui), TN, Ug
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
