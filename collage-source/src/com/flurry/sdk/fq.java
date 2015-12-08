// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Locale;

// Referenced classes of package com.flurry.sdk:
//            hg, gd

public class fq
{

    private static final String a = com/flurry/sdk/fq.getSimpleName();

    public fq()
    {
    }

    public static int a()
    {
        int i = ((Integer)hg.a().a("AgentVersion")).intValue();
        gd.a(4, a, (new StringBuilder()).append("getAgentVersion() = ").append(i).toString());
        return i;
    }

    public static int b()
    {
        return ((Integer)hg.a().a("ReleaseMajorVersion")).intValue();
    }

    public static int c()
    {
        return ((Integer)hg.a().a("ReleaseMinorVersion")).intValue();
    }

    public static int d()
    {
        return ((Integer)hg.a().a("ReleasePatchVersion")).intValue();
    }

    public static String e()
    {
        return (String)hg.a().a("ReleaseBetaVersion");
    }

    public static String f()
    {
        String s;
        if (e().length() > 0)
        {
            s = ".";
        } else
        {
            s = "";
        }
        return String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", new Object[] {
            Integer.valueOf(a()), Integer.valueOf(b()), Integer.valueOf(c()), Integer.valueOf(d()), s, e()
        });
    }

}
