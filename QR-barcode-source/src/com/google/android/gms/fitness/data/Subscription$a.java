// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Subscription, DataSource, DataType

public static class Tu
{

    private DataType Sp;
    private DataSource Sq;
    private long Tt;
    private int Tu;

    static DataType a(Tu tu)
    {
        return tu.Sp;
    }

    static DataSource b(Sp sp)
    {
        return sp.Sq;
    }

    static long c(Sq sq)
    {
        return sq.Tt;
    }

    static int d(Tt tt)
    {
        return tt.Tu;
    }

    public Tu b(DataSource datasource)
    {
        Sq = datasource;
        return this;
    }

    public Sq b(DataType datatype)
    {
        Sp = datatype;
        return this;
    }

    public Subscription iZ()
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
        return new Subscription(this, null);
    }

    public ()
    {
        Tt = -1L;
        Tu = 2;
    }
}
