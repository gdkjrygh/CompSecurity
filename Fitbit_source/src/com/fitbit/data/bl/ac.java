// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.util.service.a;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService

public class ac extends a
{

    static String a = "com.fitbit.data.bl.Login.ACTION";
    private static final String b = "com.fitbit.data.bl.Login.EXTRA_USER_NAME";
    private static final String c = "com.fitbit.data.bl.Login.EXTRA_PASSWORD";
    private static final String d = "com.fitbit.data.bl.Login.EXTRA_TOKEN_EXISTS";

    public ac()
    {
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction(a);
        context.putExtra("com.fitbit.data.bl.Login.EXTRA_TOKEN_EXISTS", true);
        return context;
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction(a);
        context.putExtra("com.fitbit.util.service.DispatcherService.AFTER_LOGOUT_TASK_PERRMISSION", true);
        context.putExtra("com.fitbit.data.bl.Login.EXTRA_USER_NAME", s);
        context.putExtra("com.fitbit.data.bl.Login.EXTRA_PASSWORD", s1);
        return context;
    }

    static void a(ac ac1, boolean flag)
    {
        ac1.a(flag);
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getStringExtra("com.fitbit.data.bl.Login.EXTRA_USER_NAME");
        a(((String) (syncservice)), ((com.fitbit.util.service.a.a) (new _cls1(intent, syncservice))));
    }


    /* member class not found */
    class _cls1 {}

}
