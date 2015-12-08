// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Subscription, DataSource, DataType

public static class UR
{

    private DataType TM;
    private DataSource TN;
    private long UQ;
    private int UR;

    static DataType a(UR ur)
    {
        return ur.TM;
    }

    static DataSource b(TM tm)
    {
        return tm.TN;
    }

    static long c(TN tn)
    {
        return tn.UQ;
    }

    static int d(UQ uq)
    {
        return uq.UR;
    }

    public UR b(DataSource datasource)
    {
        TN = datasource;
        return this;
    }

    public TN b(DataType datatype)
    {
        TM = datatype;
        return this;
    }

    public Subscription jK()
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
        return new Subscription(this, null);
    }

    public ()
    {
        UQ = -1L;
        UR = 2;
    }
}
