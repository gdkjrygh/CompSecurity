// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.serverinteraction.restrictions.b;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService

public class fz extends a
{

    static final String b = "com.fitbit.data.bl.UpdateRestrictionsTask.ACTION";

    public fz()
    {
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.UpdateRestrictionsTask.ACTION");
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        ServerGateway.a().b().b();
        com.fitbit.serverinteraction.restrictions.b.a().a(true);
    }
}
