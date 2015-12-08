// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class z extends a
{

    public static final String b = "com.fitbit.data.bl.LoadProfileInfoTask.BROADCAST_ACTION";
    static final String c = "com.fitbit.data.bl.LoadProfileInfoTask.ACTION";
    static final String d = "com.fitbit.data.bl.LoadProfileInfoTask.USER_ID";
    static final String e = "com.fitbit.data.bl.LoadProfileInfoTask.NEED_BROADCAST";

    public z()
    {
    }

    public static IntentFilter D_()
    {
        return new IntentFilter("com.fitbit.data.bl.LoadProfileInfoTask.BROADCAST_ACTION");
    }

    public static Intent a(Context context, boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.LoadProfileInfoTask.ACTION");
        context.putExtra("force", flag);
        return context;
    }

    public static Intent a(Context context, boolean flag, String s)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.LoadProfileInfoTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("com.fitbit.data.bl.LoadProfileInfoTask.USER_ID", s);
        return context;
    }

    public static Intent a(Context context, boolean flag, String s, boolean flag1)
    {
        context = a(context, flag, s);
        context.putExtra("com.fitbit.data.bl.LoadProfileInfoTask.NEED_BROADCAST", flag1);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        boolean flag = intent.getBooleanExtra("com.fitbit.data.bl.LoadProfileInfoTask.NEED_BROADCAST", true);
        boolean flag1 = intent.getBooleanExtra("force", false);
        syncservice = intent.getStringExtra("com.fitbit.data.bl.LoadProfileInfoTask.USER_ID");
        dg.d().a(flag1, this, syncservice);
        if (flag)
        {
            com.fitbit.util.z.a(new Intent("com.fitbit.data.bl.LoadProfileInfoTask.BROADCAST_ACTION"));
        }
        return;
        syncservice;
        if (flag)
        {
            com.fitbit.util.z.a(new Intent("com.fitbit.data.bl.LoadProfileInfoTask.BROADCAST_ACTION"));
        }
        throw syncservice;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
