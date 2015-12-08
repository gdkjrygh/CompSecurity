// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
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
    private final int BR;
    private final Status CM;
    private final List Uk;

    DataSourcesResult(int i, List list, Status status)
    {
        BR = i;
        Uk = Collections.unmodifiableList(list);
        CM = status;
    }

    public DataSourcesResult(List list, Status status)
    {
        BR = 3;
        Uk = Collections.unmodifiableList(list);
        CM = status;
    }

    public static DataSourcesResult E(Status status)
    {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    private boolean b(DataSourcesResult datasourcesresult)
    {
        return CM.equals(datasourcesresult.CM) && n.equal(Uk, datasourcesresult.Uk);
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
        return Uk;
    }

    public List getDataSources(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = Uk.iterator();
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
        return CM;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            CM, Uk
        });
    }

    public String toString()
    {
        return n.h(this).a("status", CM).a("dataSets", Uk).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
