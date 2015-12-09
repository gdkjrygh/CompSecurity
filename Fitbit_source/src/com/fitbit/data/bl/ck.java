// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.util.Pair;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.i;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, EntityMerger, aq, dm, 
//            dg, ez, r, t, 
//            bs

public class ck extends e
{

    private static final String a = "SyncFoodLogsOperation";
    private final String b;
    private final int d;
    private final int e;

    public ck(bs bs, boolean flag, int j, int k)
    {
        super(bs, flag);
        d = j;
        e = k;
        b = (new StringBuilder()).append("SyncFoodLogsOperation-").append(j).append("-").append(k).toString();
        b(false);
    }

    private void a(List list)
    {
        (new EntityMerger(list, aq.a().e(), new _cls1(list))).a(dm.a());
    }

    public static void b()
    {
        dg.d().c().e("SyncFoodLogsOperation");
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = r.a().a(d, e);
        Pair pair;
        for (Iterator iterator = ((List)((Pair) (a1)).second).iterator(); iterator.hasNext(); t.a().a(com.fitbit.data.domain.Goal.GoalType.CALORIES_CONSUMED_GOAL, ((i)pair.second).a(), ((i)pair.second).b(), (Date)pair.first))
        {
            pair = (Pair)iterator.next();
        }

        a1 = (List)((Pair) (a1)).first;
        dm.a(a1);
        a(((List) (a1)));
    }

    public String c()
    {
        return b;
    }

    /* member class not found */
    class _cls1 {}

}
