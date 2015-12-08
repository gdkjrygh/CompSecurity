// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core, ApplicationState, SessionState

class af
    implements Runnable
{

    final ApplicationState a;
    final ApplicationState b;
    final SessionState c;
    final SessionState d;
    final Core e;

    af(Core core, ApplicationState applicationstate, ApplicationState applicationstate1, SessionState sessionstate, SessionState sessionstate1)
    {
        e = core;
        a = applicationstate;
        b = applicationstate1;
        c = sessionstate;
        d = sessionstate1;
        super();
    }

    public void run()
    {
        boolean flag1 = true;
        boolean flag;
        if (a != b)
        {
            e.a(e.y);
            e.b(b);
            e.s();
            e.y = b;
            flag = true;
        } else
        {
            flag = false;
        }
        if (c != d)
        {
            e.a(e.L);
            e.b(d);
            e.t();
            e.L = d;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            e.a(a, e.y);
        }
        if (flag1)
        {
            e.a(c, e.L);
        }
    }
}
