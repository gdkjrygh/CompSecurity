// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.repo.t;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, r, 
//            aq, bs

public class cg extends e
{

    private static final String a = "SyncFoodItemFullInfoOperation";
    private final long b;
    private FoodItem d;
    private String e;

    public cg(bs bs, long l)
    {
        super(bs, false);
        b = l;
        e = (new StringBuilder()).append("SyncFoodItemFullInfoOperation-").append(l).toString();
        b(false);
    }

    public static void d()
    {
        dg.d().c().e("SyncFoodItemFullInfoOperation");
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        FoodItem fooditem = r.a().d(b);
        t t1 = aq.a().f();
        fooditem = FoodItem.a(fooditem, (FoodItem)t1.getByServerId(b));
        if (!a1.a())
        {
            if (fooditem.isNew())
            {
                t1.add(fooditem);
            } else
            {
                t1.save(fooditem);
            }
        }
        d = fooditem;
    }

    public FoodItem b()
    {
        return d;
    }

    public String c()
    {
        return e;
    }
}
