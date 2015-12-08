// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.request:
//            StartBleScanRequest, l, BleScanCallback

public static class Wn
{

    private DataType VU[];
    private l Wm;
    private int Wn;

    static DataType[] a(Wn wn)
    {
        return wn.VU;
    }

    static l b(VU vu)
    {
        return vu.Wm;
    }

    static int c(Wm wm)
    {
        return wm.Wn;
    }

    public Wn a(l l)
    {
        Wm = l;
        return this;
    }

    public StartBleScanRequest build()
    {
        boolean flag;
        if (Wm != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must set BleScanCallback");
        return new StartBleScanRequest(this, null);
    }

    public Wm setBleScanCallback(BleScanCallback blescancallback)
    {
        a(a().a(blescancallback));
        return this;
    }

    public transient a setDataTypes(DataType adatatype[])
    {
        VU = adatatype;
        return this;
    }

    public VU setTimeoutSecs(int i)
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
        jx.b(flag, "Stop time must be greater than zero");
        if (i <= 60)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Stop time must be less than 1 minute");
        Wn = i;
        return this;
    }

    public ()
    {
        VU = new DataType[0];
        Wn = 10;
    }
}
