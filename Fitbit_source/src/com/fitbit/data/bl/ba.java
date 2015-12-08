// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.repo.b;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, ActivityBusinessLogic, aq, bs

public class ba extends e
{

    private static final String a = "SyncActivityFullInfoOperation";
    private long b;
    private ActivityItem d;

    public ba(bs bs, long l)
    {
        super(bs, true);
        b = l;
    }

    static ActivityItem a(ba ba1)
    {
        return ba1.d;
    }

    static ActivityItem a(ba ba1, ActivityItem activityitem)
    {
        ba1.d = activityitem;
        return activityitem;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = ActivityBusinessLogic.a().b(b);
        aq.a().b().runInTransaction(new _cls1(a1));
    }

    public ActivityItem b()
    {
        return d;
    }

    public String c()
    {
        return "SyncActivityFullInfoOperation";
    }

    /* member class not found */
    class _cls1 {}

}
