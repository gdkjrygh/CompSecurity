// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.t;
import com.fitbit.serverinteraction.PublicAPI;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao, aq

public class bt extends e
{

    private static final String a = "SyncCustomFoodOperation";

    public bt(bs bs1, boolean flag)
    {
        super(bs1, flag);
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = e().a().g();
        a1 = e().b().v(a1);
        aq.a().f().runInTransaction(new _cls1(a1));
    }

    public String c()
    {
        return "SyncCustomFoodOperation";
    }

    /* member class not found */
    class _cls1 {}

}
