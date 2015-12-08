// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataSourcesRequest

public static class Ux
{

    private boolean Ux;
    private DataType Uy[];
    private int Uz[] = {
        0, 1
    };

    static DataType[] a(Ux ux)
    {
        return ux.Uy;
    }

    static int[] b(Uy uy)
    {
        return uy.Uz;
    }

    static boolean c(Uz uz)
    {
        return uz.Ux;
    }

    public DataSourcesRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (Uy.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must add at least one data type");
        if (Uz.length > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must add at least one data source type");
        return new DataSourcesRequest(this, null);
    }

    public transient Uz setDataSourceTypes(int ai[])
    {
        Uz = ai;
        return this;
    }

    public transient Uz setDataTypes(DataType adatatype[])
    {
        Uy = adatatype;
        return this;
    }

    public ()
    {
        Uy = new DataType[0];
        Ux = false;
    }
}
