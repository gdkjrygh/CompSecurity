// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class cs extends a
{

    static final String b = "com.fitbit.data.bl.SyncFriendsFromContactsTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncFriendsFromContactsTask.BROADCAST_ACTION";
    private static final String d = "force";
    private static final String e = "what_scan";
    private static final String f = "EXTRA_WAIT_FOR_FACEBOOK";

    public cs()
    {
    }

    public static Intent a(Context context, boolean flag, com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning whatsscanning, int i)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFriendsFromContactsTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("what_scan", whatsscanning.ordinal());
        context.putExtra("EXTRA_WAIT_FOR_FACEBOOK", i);
        return context;
    }

    public static final IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncFriendsFromContactsTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg.d().a(intent.getBooleanExtra("force", false), com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.a(intent, "what_scan", com.fitbit.friends.ui.ScanNetworkOperationBinder.WhatsScanning.b), intent.getIntExtra("EXTRA_WAIT_FOR_FACEBOOK", com.fitbit.friends.ui.ScanNetworkOperationBinder.WaitForFacebook.a.a()), this);
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncFriendsFromContactsTask.BROADCAST_ACTION"));
    }

    public boolean b()
    {
        return an.a().j();
    }
}
