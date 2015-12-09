// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class cf extends a
{

    static final String b = "com.fitbit.data.bl.SyncFoodInfoTask.ACTION";

    public cf()
    {
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFoodInfoTask.ACTION");
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        boolean flag = intent.getBooleanExtra("force", false);
        dg.d().m(flag, this);
    }

    public boolean b()
    {
        return an.a().j();
    }
}
