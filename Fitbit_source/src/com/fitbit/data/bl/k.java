// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, BadgesBusinessLogic

public class k extends b
{

    static final String a = "com.fitbit.data.bl.CheerBadgeTask.ACTION";
    private static final String b = "com.fitbit.data.bl.CheerBadgeTask.EXTRA_BADGE_ID";
    private static final String c = "com.fitbit.data.bl.CheerBadgeTask.EXTRA_USER_ID";

    public k()
    {
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.CheerBadgeTask.ACTION");
        context.putExtra("com.fitbit.data.bl.CheerBadgeTask.EXTRA_BADGE_ID", s);
        context.putExtra("com.fitbit.data.bl.CheerBadgeTask.EXTRA_USER_ID", s1);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getStringExtra("com.fitbit.data.bl.CheerBadgeTask.EXTRA_BADGE_ID");
        intent = intent.getStringExtra("com.fitbit.data.bl.CheerBadgeTask.EXTRA_USER_ID");
        BadgesBusinessLogic.a().b(syncservice, intent);
    }
}
