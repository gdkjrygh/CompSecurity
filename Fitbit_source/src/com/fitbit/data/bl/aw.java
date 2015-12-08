// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService

public class aw extends b
{

    static String a = "com.fitbit.data.bl.SendResetEmailTask.ACTION";
    private static final String b = "com.fitbit.data.bl.SendResetEmailTask.EXTRA_EMAIL";

    public aw()
    {
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction(a);
        context.putExtra("com.fitbit.util.service.DispatcherService.AFTER_LOGOUT_TASK_PERRMISSION", true);
        context.putExtra("com.fitbit.data.bl.SendResetEmailTask.EXTRA_EMAIL", s);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getStringExtra("com.fitbit.data.bl.SendResetEmailTask.EXTRA_EMAIL");
        (new PublicAPI(ServerGateway.a())).F(syncservice);
    }

}
