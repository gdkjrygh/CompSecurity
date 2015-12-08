// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSource, a, Device, DataType

public static final class SR
{

    private int FD;
    private Device SO;
    private a SP;
    private String SQ;
    private boolean SR;
    private DataType Sp;
    private String mName;

    static DataType a(SR sr)
    {
        return sr.Sp;
    }

    static int b(Sp sp)
    {
        return sp.FD;
    }

    static String c(FD fd)
    {
        return fd.mName;
    }

    static Device d(mName mname)
    {
        return mname.SO;
    }

    static a e(SO so)
    {
        return so.SP;
    }

    static String f(SP sp)
    {
        return sp.SQ;
    }

    static boolean g(SQ sq)
    {
        return sq.SR;
    }

    public DataSource build()
    {
        boolean flag1 = true;
        boolean flag;
        if (Sp != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must set data type");
        if (FD >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        o.a(flag, "Must set data source type");
        return new DataSource(this, null);
    }

    public FD setAppPackageName(Context context)
    {
        return setAppPackageName(context.getPackageName());
    }

    public setAppPackageName setAppPackageName(String s)
    {
        SP = new a(s, null, null);
        return this;
    }

    public SP setDataType(DataType datatype)
    {
        Sp = datatype;
        return this;
    }

    public Sp setDevice(Device device)
    {
        SO = device;
        return this;
    }

    public SO setName(String s)
    {
        mName = s;
        return this;
    }

    public mName setObfuscated(boolean flag)
    {
        SR = flag;
        return this;
    }

    public SR setStreamName(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Must specify a valid stream name");
        SQ = s;
        return this;
    }

    public SQ setType(int i)
    {
        FD = i;
        return this;
    }

    public ()
    {
        FD = -1;
        SQ = "";
        SR = false;
    }
}
