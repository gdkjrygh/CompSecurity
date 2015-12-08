// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataSource, a, DataType, Device

public static final class Uo
{

    private int Gt;
    private DataType TM;
    private Device Ul;
    private a Um;
    private String Un;
    private boolean Uo;
    private String mName;

    static DataType a(Uo uo)
    {
        return uo.TM;
    }

    static int b(TM tm)
    {
        return tm.Gt;
    }

    static String c(Gt gt)
    {
        return gt.mName;
    }

    static Device d(mName mname)
    {
        return mname.Ul;
    }

    static a e(Ul ul)
    {
        return ul.Um;
    }

    static String f(Um um)
    {
        return um.Un;
    }

    static boolean g(Un un)
    {
        return un.Uo;
    }

    public DataSource build()
    {
        boolean flag1 = true;
        boolean flag;
        if (TM != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must set data type");
        if (Gt >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Must set data source type");
        return new DataSource(this, null);
    }

    public Gt setAppPackageName(Context context)
    {
        return setAppPackageName(context.getPackageName());
    }

    public setAppPackageName setAppPackageName(String s)
    {
        Um = new a(s, null, null);
        return this;
    }

    public Um setDataType(DataType datatype)
    {
        TM = datatype;
        return this;
    }

    public TM setDevice(Device device)
    {
        Ul = device;
        return this;
    }

    public Ul setName(String s)
    {
        mName = s;
        return this;
    }

    public mName setObfuscated(boolean flag)
    {
        Uo = flag;
        return this;
    }

    public Uo setStreamName(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Must specify a valid stream name");
        Un = s;
        return this;
    }

    public Un setType(int i)
    {
        Gt = i;
        return this;
    }

    public ()
    {
        Gt = -1;
        Un = "";
        Uo = false;
    }
}
