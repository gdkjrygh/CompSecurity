// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionReadRequest

public static class UP
{

    private long KS;
    private List SB;
    private long Sr;
    private String UN;
    private boolean UO;
    private List UP;
    private List Uk;
    private boolean Uv;
    private String vL;

    static String a(UP up)
    {
        return up.UN;
    }

    static String b(UN un)
    {
        return un.vL;
    }

    static long c(vL vl)
    {
        return vl.KS;
    }

    static long d(KS ks)
    {
        return ks.Sr;
    }

    static List e(Sr sr)
    {
        return sr.SB;
    }

    static List f(SB sb)
    {
        return sb.Uk;
    }

    static boolean g(Uk uk)
    {
        return uk.UO;
    }

    static boolean h(UO uo)
    {
        return uo.Uv;
    }

    static List i(Uv uv)
    {
        return uv.UP;
    }

    public SessionReadRequest build()
    {
        boolean flag;
        if (KS > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Invalid start time: %s", new Object[] {
            Long.valueOf(KS)
        });
        if (Sr > 0L && Sr > KS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "Invalid end time: %s", new Object[] {
            Long.valueOf(Sr)
        });
        return new SessionReadRequest(this, null);
    }

    public Sr enableServerQueries()
    {
        Uv = true;
        return this;
    }

    public Uv excludePackage(String s)
    {
        o.b(s, "Attempting to use a null package name");
        if (!UP.contains(s))
        {
            UP.add(s);
        }
        return this;
    }

    public UP read(DataSource datasource)
    {
        o.b(datasource, "Attempting to add a null data source");
        if (!Uk.contains(datasource))
        {
            Uk.add(datasource);
        }
        return this;
    }

    public Uk read(DataType datatype)
    {
        o.b(datatype, "Attempting to use a null data type");
        if (!SB.contains(datatype))
        {
            SB.add(datatype);
        }
        return this;
    }

    public SB readSessionsFromAllApps()
    {
        UO = true;
        return this;
    }

    public UO setSessionId(String s)
    {
        vL = s;
        return this;
    }

    public vL setSessionName(String s)
    {
        UN = s;
        return this;
    }

    public UN setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        KS = timeunit.toMillis(l);
        Sr = timeunit.toMillis(l1);
        return this;
    }

    public ()
    {
        KS = 0L;
        Sr = 0L;
        SB = new ArrayList();
        Uk = new ArrayList();
        UO = false;
        Uv = false;
        UP = new ArrayList();
    }
}
