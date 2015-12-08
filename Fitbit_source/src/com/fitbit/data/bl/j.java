// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.data.bl.exceptions.AccountValidationException;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.service.b;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, ao

public class j extends b
{

    static String a = "com.fitbit.data.bl.CheckAccountTask.ACTION";
    private static final String b = "com.fitbit.data.bl.CheckAccountTask.EXTRA_EMAIL";
    private static final String c = "com.fitbit.data.bl.CheckAccountTask.EXTRA_PASSWORD";

    public j()
    {
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction(a);
        context.putExtra("com.fitbit.data.bl.CheckAccountTask.EXTRA_EMAIL", s);
        context.putExtra("com.fitbit.data.bl.CheckAccountTask.EXTRA_PASSWORD", s1);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getStringExtra("com.fitbit.data.bl.CheckAccountTask.EXTRA_EMAIL");
        intent = intent.getStringExtra("com.fitbit.data.bl.CheckAccountTask.EXTRA_PASSWORD");
        resultreceiver = new PublicAPI(ServerGateway.a());
        syncservice = (new ao()).X(resultreceiver.h(syncservice, intent));
        if (syncservice != null && syncservice.size() > 0)
        {
            throw new AccountValidationException(syncservice);
        } else
        {
            return;
        }
    }

}
