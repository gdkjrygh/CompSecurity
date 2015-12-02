// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import com.facebook.base.lwperf.perfstats.PerfStats;
import com.facebook.perf.StartupPerfLogger;

// Referenced classes of package com.facebook.katana.app:
//            FacebookApplicationImpl

class a
    implements com.facebook.base.app.er
{

    final StartupPerfLogger a;
    final FacebookApplicationImpl b;

    public final void a(int i, String s, long l, long l1, boolean flag, 
            PerfStats perfstats)
    {
        FacebookApplicationImpl.a(a, i, s, l, l1, Boolean.valueOf(flag), perfstats);
    }

    (FacebookApplicationImpl facebookapplicationimpl, StartupPerfLogger startupperflogger)
    {
        b = facebookapplicationimpl;
        a = startupperflogger;
        super();
    }
}
