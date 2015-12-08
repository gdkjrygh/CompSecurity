// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            aj

public static class 
{

    private DataType TM;
    private DataSource TN;

    static DataType a( )
    {
        return .TM;
    }

    static DataSource b(TM tm)
    {
        return tm.TN;
    }

    public ce d(DataSource datasource)
    {
        TN = datasource;
        return this;
    }

    public  d(DataType datatype)
    {
        TM = datatype;
        return this;
    }

    public aj kq()
    {
        if (TM != null && TN != null)
        {
            throw new IllegalArgumentException("Cannot specify both dataType and dataSource");
        } else
        {
            return new aj(this, null);
        }
    }

    public ()
    {
    }
}
