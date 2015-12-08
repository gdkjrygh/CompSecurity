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

    private DataType Sp;
    private DataSource Sq;

    static DataType a( )
    {
        return .Sp;
    }

    static DataSource b(Sp sp)
    {
        return sp.Sq;
    }

    public ce d(DataSource datasource)
    {
        Sq = datasource;
        return this;
    }

    public  d(DataType datatype)
    {
        Sp = datatype;
        return this;
    }

    public aj jG()
    {
        if (Sp != null && Sq != null)
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
