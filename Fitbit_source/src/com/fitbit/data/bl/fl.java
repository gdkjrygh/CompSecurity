// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.repo.av;
import com.fitbit.serverinteraction.PublicAPI;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, ao, aq

public class fl extends e
{

    private static final String a = "SyncTrackerTypesOperation";

    public fl(bs bs1, boolean flag)
    {
        super(bs1, flag);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        e().a(true);
        a1 = e().a().A();
        a1 = e().b().J(a1);
        av av1 = aq.a().I();
        av1.runInTransaction(new _cls1(av1, a1));
        e().a(false);
        return;
        a1;
        e().a(false);
        throw a1;
    }

    public String c()
    {
        return "SyncTrackerTypesOperation";
    }

    /* member class not found */
    class _cls1 {}

}
