// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            c

public class DataSourcesResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int CK;
    private final Status Eb;
    private final List VH;

    DataSourcesResult(int i, List list, Status status)
    {
        CK = i;
        VH = Collections.unmodifiableList(list);
        Eb = status;
    }

    public DataSourcesResult(List list, Status status)
    {
        CK = 3;
        VH = Collections.unmodifiableList(list);
        Eb = status;
    }

    public static DataSourcesResult D(Status status)
    {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    private boolean b(DataSourcesResult datasourcesresult)
    {
        return Eb.equals(datasourcesresult.Eb) && jv.equal(VH, datasourcesresult.VH);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataSourcesResult) && b((DataSourcesResult)obj);
    }

    public List getDataSources()
    {
        return VH;
    }

    public List getDataSources(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = VH.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DataSource datasource = (DataSource)iterator.next();
            if (datasource.getDataType().equals(datatype))
            {
                arraylist.add(datasource);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    public Status getStatus()
    {
        return Eb;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Eb, VH
        });
    }

    public String toString()
    {
        return jv.h(this).a("status", Eb).a("dataSets", VH).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
