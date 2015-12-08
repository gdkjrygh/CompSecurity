// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            dp, dq, eo, dl, 
//            dj

public class dn
{

    private static final String a = com/flurry/sdk/dn.getSimpleName();
    private static dn b;

    public dn()
    {
    }

    public static dn a()
    {
        com/flurry/sdk/dn;
        JVM INSTR monitorenter ;
        dn dn1;
        if (b == null)
        {
            b = new dn();
        }
        dn1 = b;
        com/flurry/sdk/dn;
        JVM INSTR monitorexit ;
        return dn1;
        Exception exception;
        exception;
        throw exception;
    }

    public int b()
    {
        int i1 = ((Integer)dp.a().a("AgentVersion")).intValue();
        eo.a(4, a, (new StringBuilder("getAgentVersion() = ")).append(i1).toString());
        return i1;
    }

    int c()
    {
        return ((Integer)dp.a().a("ReleaseMajorVersion")).intValue();
    }

    int d()
    {
        return ((Integer)dp.a().a("ReleaseMinorVersion")).intValue();
    }

    int e()
    {
        return ((Integer)dp.a().a("ReleasePatchVersion")).intValue();
    }

    String f()
    {
        return (String)dp.a().a("ReleaseBetaVersion");
    }

    public String g()
    {
        String s;
        if (f().length() > 0)
        {
            s = ".";
        } else
        {
            s = "";
        }
        return String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", new Object[] {
            Integer.valueOf(b()), Integer.valueOf(c()), Integer.valueOf(d()), Integer.valueOf(e()), s, f()
        });
    }

    public String h()
    {
        String s = null;
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            s = dj1.j();
        }
        return s;
    }

    public String i()
    {
        String s = null;
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            s = dj1.k();
        }
        return s;
    }

    public String j()
    {
        String s = null;
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            s = dj1.l();
        }
        return s;
    }

    public boolean k()
    {
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            return dj1.o();
        } else
        {
            return true;
        }
    }

    public Map l()
    {
        dj dj1 = dl.a().c();
        if (dj1 != null)
        {
            return dj1.p();
        } else
        {
            return Collections.emptyMap();
        }
    }

}
