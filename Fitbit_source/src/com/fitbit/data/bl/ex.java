// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, EntityMerger, aa, aq, 
//            bs

public class ex extends e
{

    private static final String a = "SyncSupportedLocalesOperation";

    public ex(bs bs, boolean flag)
    {
        super(bs, flag);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        a1 = new EntityMerger(aa.a().c(), aq.a().C(), new _cls1());
        a1.a(new _cls2());
        a1.a(new _cls3());
    }

    public String c()
    {
        return "SyncSupportedLocalesOperation";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
