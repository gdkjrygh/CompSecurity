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

public class cw extends a
{

    public static final String b = "com.fitbit.data.bl.SyncFriendsTask.BROADCAST_ACTION";
    static final String c = "com.fitbit.data.bl.SyncFriendsTask.ACTION";
    private static final String d = "force";

    public cw()
    {
    }

    public static Intent a(Context context, boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFriendsTask.ACTION");
        context.putExtra("force", flag);
        return context;
    }

    public static IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncFriendsTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg.d().a(intent.getBooleanExtra("force", false), this);
        z.a(new Intent("com.fitbit.data.bl.SyncFriendsTask.BROADCAST_ACTION"));
        return;
        syncservice;
        z.a(new Intent("com.fitbit.data.bl.SyncFriendsTask.BROADCAST_ACTION"));
        throw syncservice;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
