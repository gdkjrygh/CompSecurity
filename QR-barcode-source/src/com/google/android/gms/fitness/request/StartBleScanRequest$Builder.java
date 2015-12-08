// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            StartBleScanRequest, l, BleScanCallback

public static class UR
{

    private l UQ;
    private int UR;
    private DataType Uy[];

    static DataType[] a(UR ur)
    {
        return ur.Uy;
    }

    static l b(Uy uy)
    {
        return uy.UQ;
    }

    static int c(UQ uq)
    {
        return uq.UR;
    }

    public UR a(l l)
    {
        UQ = l;
        return this;
    }

    public StartBleScanRequest build()
    {
        boolean flag;
        if (UQ != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must set BleScanCallback");
        return new StartBleScanRequest(this, null);
    }

    public UQ setBleScanCallback(BleScanCallback blescancallback)
    {
        a(a().a(blescancallback));
        return this;
    }

    public transient a setDataTypes(DataType adatatype[])
    {
        Uy = adatatype;
        return this;
    }

    public Uy setTimeoutSecs(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Stop time must be greater than zero");
        if (i <= 60)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.b(flag, "Stop time must be less than 1 minute");
        UR = i;
        return this;
    }

    public ()
    {
        Uy = new DataType[0];
        UR = 10;
    }
}
