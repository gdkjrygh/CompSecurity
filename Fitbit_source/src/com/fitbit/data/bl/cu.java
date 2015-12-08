// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class cu extends a
{

    static final String b = "com.fitbit.data.bl.SyncFriendsOfFriendTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncFriendsOfFriendTask.BROADCAST_ACTION";
    private static final String d = "force";
    private static final String e = "encodedId";
    private static final String f = "inviteId";

    public cu()
    {
    }

    public static Intent a(Context context, boolean flag, long l)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFriendsOfFriendTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("inviteId", l);
        return context;
    }

    public static Intent a(Context context, boolean flag, String s)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFriendsOfFriendTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("encodedId", s);
        return context;
    }

    public static IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncFriendsOfFriendTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        long l;
        syncservice = intent.getStringExtra("encodedId");
        l = intent.getLongExtra("inviteId", 0L);
        if (syncservice == null) goto _L2; else goto _L1
_L1:
        dg.d().a(intent.getBooleanExtra("force", false), syncservice, this);
_L4:
        z.a(new Intent("com.fitbit.data.bl.SyncFriendsOfFriendTask.BROADCAST_ACTION"));
        return;
_L2:
        dg.d().a(intent.getBooleanExtra("force", false), l, this);
        if (true) goto _L4; else goto _L3
_L3:
        syncservice;
        z.a(new Intent("com.fitbit.data.bl.SyncFriendsOfFriendTask.BROADCAST_ACTION"));
        throw syncservice;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
