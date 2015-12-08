// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.Date;

// Referenced classes of package com.comscore.analytics:
//            Core, SessionState

class ae
    implements Runnable
{

    final Core a;

    ae(Core core)
    {
        a = core;
        super();
    }

    public void run()
    {
        if (a.z())
        {
            return;
        }
        if (a.Q < 0)
        {
            a.Q = 0;
        }
        if (a.R < 0)
        {
            a.R = 0;
        }
        a.W = Date.unixTime();
        Core core = a;
        core.V = core.V + 1;
        if (a.L != SessionState.ACTIVE_USER)
        {
            a.n();
            return;
        } else
        {
            a.o();
            return;
        }
    }
}
