// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.request:
//            DataSourcesRequest

public static class VT
{

    private boolean VT;
    private DataType VU[];
    private int VV[] = {
        0, 1
    };

    static DataType[] a(VT vt)
    {
        return vt.VU;
    }

    static int[] b(VU vu)
    {
        return vu.VV;
    }

    static boolean c(VV vv)
    {
        return vv.VT;
    }

    public DataSourcesRequest build()
    {
        boolean flag1 = true;
        boolean flag;
        if (VU.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must add at least one data type");
        if (VV.length > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must add at least one data source type");
        return new DataSourcesRequest(this, null);
    }

    public transient VV setDataSourceTypes(int ai[])
    {
        VV = ai;
        return this;
    }

    public transient VV setDataTypes(DataType adatatype[])
    {
        VU = adatatype;
        return this;
    }

    public ()
    {
        VU = new DataType[0];
        VT = false;
    }
}
