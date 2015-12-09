// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MealItem;
import com.fitbit.data.repo.ae;
import com.fitbit.data.repo.af;
import com.fitbit.data.repo.t;
import com.fitbit.serverinteraction.PublicAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, bs, 
//            ao, aq

public class dh extends e
{

    private static final String a = "SyncMealsOperation";

    public dh(bs bs1, boolean flag)
    {
        super(bs1, flag);
    }

    public static void b()
    {
        dg.d().c().d("SyncMealsOperation");
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = e().a().f();
        a1 = e().b().u(a1);
        af af1 = aq.a().o();
        ae ae1 = aq.a().p();
        ae1.clear(true);
        af1.clear(true);
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a1.iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((Meal)iterator.next()).c().iterator();
            while (iterator1.hasNext()) 
            {
                arraylist.add((MealItem)iterator1.next());
            }
        }

        aq.a().f().runInTransaction(new _cls1(arraylist));
        af1.addAll(a1);
        ae1.addAll(arraylist);
    }

    public String c()
    {
        return "SyncMealsOperation";
    }

    /* member class not found */
    class _cls1 {}

}
