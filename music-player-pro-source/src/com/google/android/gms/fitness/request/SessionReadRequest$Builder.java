// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionReadRequest

public static class Wl
{

    private long LW;
    private long TO;
    private List TY;
    private List VH;
    private boolean VR;
    private String Wj;
    private boolean Wk;
    private List Wl;
    private String vZ;

    static String a(Wl wl)
    {
        return wl.Wj;
    }

    static String b(Wj wj)
    {
        return wj.vZ;
    }

    static long c(vZ vz)
    {
        return vz.LW;
    }

    static long d(LW lw)
    {
        return lw.TO;
    }

    static List e(TO to)
    {
        return to.TY;
    }

    static List f(TY ty)
    {
        return ty.VH;
    }

    static boolean g(VH vh)
    {
        return vh.Wk;
    }

    static boolean h(Wk wk)
    {
        return wk.VR;
    }

    static List i(VR vr)
    {
        return vr.Wl;
    }

    public SessionReadRequest build()
    {
        boolean flag;
        if (LW > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Invalid start time: %s", new Object[] {
            Long.valueOf(LW)
        });
        if (TO > 0L && TO > LW)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Invalid end time: %s", new Object[] {
            Long.valueOf(TO)
        });
        return new SessionReadRequest(this, null);
    }

    public TO enableServerQueries()
    {
        VR = true;
        return this;
    }

    public VR excludePackage(String s)
    {
        jx.b(s, "Attempting to use a null package name");
        if (!Wl.contains(s))
        {
            Wl.add(s);
        }
        return this;
    }

    public Wl read(DataSource datasource)
    {
        jx.b(datasource, "Attempting to add a null data source");
        if (!VH.contains(datasource))
        {
            VH.add(datasource);
        }
        return this;
    }

    public VH read(DataType datatype)
    {
        jx.b(datatype, "Attempting to use a null data type");
        if (!TY.contains(datatype))
        {
            TY.add(datatype);
        }
        return this;
    }

    public TY readSessionsFromAllApps()
    {
        Wk = true;
        return this;
    }

    public Wk setSessionId(String s)
    {
        vZ = s;
        return this;
    }

    public vZ setSessionName(String s)
    {
        Wj = s;
        return this;
    }

    public Wj setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        LW = timeunit.toMillis(l);
        TO = timeunit.toMillis(l1);
        return this;
    }

    public ()
    {
        LW = 0L;
        TO = 0L;
        TY = new ArrayList();
        VH = new ArrayList();
        Wk = false;
        VR = false;
        Wl = new ArrayList();
    }
}
