// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, FacebookBusinessLogic, dg, 
//            an

public class SyncFacebookLinkTask extends com.fitbit.data.bl.a
{

    static final String b = "com.fitbit.data.bl.SyncFacebookLinkTask.ACTION";
    private static final String c = "SyncFacebookLinkTask";

    public SyncFacebookLinkTask()
    {
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFacebookLinkTask.ACTION");
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        com.fitbit.e.a.a("SyncFacebookLinkTask", "SyncFacebookLinkTask started", new Object[0]);
        intent = FacebookBusinessLogic.e();
    /* block-local class not found */
    class MissingFacebookDataException {}

        if (intent == null)
        {
            throw new MissingFacebookDataException();
        } else
        {
            syncservice = ((com.fitbit.c.a) (intent)).a;
            intent = ((com.fitbit.c.a) (intent)).b;
            dg.d().a(true, syncservice, intent, this);
            return;
        }
    }

    public boolean b()
    {
        return com.fitbit.data.bl.an.a().j();
    }
}
