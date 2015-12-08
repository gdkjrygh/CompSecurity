// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.w;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ez, r, 
//            aq, EntityMerger

public class cm extends e
{

    public static final String a = "com.fitbit.data.bl.SyncFoodMeasurementUnitsOperation";
    private static final long b = 0x36ee80L;

    public cm(bs bs1, boolean flag)
    {
        super(bs1, flag);
        bs1.c().a(Long.valueOf(0x36ee80L), c());
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        java.util.List list = r.a().l();
        w w1 = aq.a().g();
        w1.clear(false);
        if (!a1.a())
        {
            (new EntityMerger(list, w1, new _cls1())).a();
        }
    }

    public String c()
    {
        return "com.fitbit.data.bl.SyncFoodMeasurementUnitsOperation";
    }

    /* member class not found */
    class _cls1 {}

}
