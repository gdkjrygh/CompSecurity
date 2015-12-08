// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.FavoriteFoodItem;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.repo.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, r, 
//            aq, EntityMerger, bs

public class cb extends e
{

    private static final String a = "SyncFavoriteFoodOperation";

    public cb(bs bs, boolean flag)
    {
        super(bs, flag);
    }

    public static List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(new FavoriteFoodItem((FoodItem)list.next()))) { }
        return arraylist;
    }

    public static void b()
    {
        dg.d().c().d("SyncFavoriteFoodOperation");
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = a(r.a().n());
        aq.a().f().runInTransaction(new _cls1(a1));
        (new EntityMerger(a1, aq.a().q(), new _cls2())).a();
    }

    public String c()
    {
        return "SyncFavoriteFoodOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
