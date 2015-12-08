// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, bs, 
//            ao, t

public class bu extends e
{

    private static final String a = "SyncDailyGoalsOperation";
    private final Date b;

    public bu(bs bs1, boolean flag, Date date)
    {
        super(bs1, flag);
        b = date;
    }

    public static void b()
    {
        dg.d().c().d("SyncDailyGoalsOperation");
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        a1 = e().b().C(e().a().q());
        t.a().a(a1, b);
        a1 = e().b().y(e().a().w());
        t.a().a(com.fitbit.data.domain.Goal.GoalType.CALORIES_CONSUMED_GOAL, null, a1, b);
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncDailyGoalsOperation";
    }
}
