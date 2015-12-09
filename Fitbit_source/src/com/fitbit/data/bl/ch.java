// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.FoodLocale;
import com.fitbit.util.z;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, r, EntityMerger, 
//            aq

public class ch extends e
{

    public static final String a = "com.fitbit.data.bl.SyncFoodLocalesTask.BROADCAST_ACTION";
    private static final String b = "SyncFoodLocalesOperation";

    public ch(bs bs1, boolean flag)
    {
        super(bs1, flag);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        e().a(true);
        a1 = r.a().u();
        int i = 0;
_L2:
        if (i >= a1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((FoodLocale)a1.get(i)).setEntityId(Long.valueOf(i + 1));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        EntityMerger entitymerger = new EntityMerger(a1, aq.a().H(), new _cls1());
        entitymerger.a(new _cls2());
        entitymerger.a(new _cls3(a1));
        entitymerger.a(new _cls4());
        e().a(false);
        z.a(new Intent("com.fitbit.data.bl.SyncFoodLocalesTask.BROADCAST_ACTION"));
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncFoodLocalesOperation";
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
