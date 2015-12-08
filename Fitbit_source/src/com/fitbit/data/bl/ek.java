// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.t;
import com.fitbit.data.repo.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, r, 
//            aq, bs

public class ek extends e
{

    static Comparator a = new _cls1();
    private static final String b = "SyncRecentAndFrequentFoodOperation";

    public ek(bs bs, boolean flag)
    {
        super(bs, flag);
    }

    public static void b()
    {
        dg.d().c().d("SyncRecentAndFrequentFoodOperation");
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(r.a().j());
        if (!a1.a())
        {
            arraylist.addAll(r.a().k());
            if (!a1.a())
            {
                aq.a().f().runInTransaction(new _cls2(arraylist));
                aq.a().e().runInTransaction(new _cls3(arraylist));
                return;
            }
        }
    }

    public String c()
    {
        return "SyncRecentAndFrequentFoodOperation";
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
