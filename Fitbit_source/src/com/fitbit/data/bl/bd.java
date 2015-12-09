// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivitySummaryItem;
import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.b;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            d, dg, ez, dm, 
//            ActivityBusinessLogic, aq, t, EntityMerger, 
//            bs

public class bd extends d
{

    private static final String a = "SyncActivityLogsAndSummaryOperation";
    private final EntityMerger.e b = new _cls1();

    public bd(bs bs, boolean flag, Date date)
    {
        super(bs, flag, date);
    }

    public static void a(Date date)
    {
        date = b(date);
        dg.d().c().d(date);
    }

    private static String b(Date date)
    {
        return dm.a("SyncActivityLogsAndSummaryOperation", date);
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        ActivityBusinessLogic.a a2 = ActivityBusinessLogic.a().b(b());
        if (a1.a())
        {
            return;
        } else
        {
            a1 = aq.a().m();
            a1.runInTransaction(new _cls2(a1, a2));
            aq.a().b().runInTransaction(new _cls3(a2));
            a1 = a2.a;
            ActivitySummaryItem activitysummaryitem = (ActivitySummaryItem)a2.first;
            t.a().a(a1, activitysummaryitem, b());
            a1 = aq.a().d();
            (new EntityMerger((List)a2.second, a1, new _cls4())).a(b);
            return;
        }
    }

    public String c()
    {
        return b(b());
    }

    public String d()
    {
        return "SyncActivityLogsAndSummaryOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}

}
