// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.savedstate.s;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, dg, an

public class al extends b
{

    static final String a = "com.fitbit.data.bl.PairSoftTrackerTask.ACTION";
    private static final String b = "com.fitbit.data.bl.PairSoftTrackerTask.EXTRA_TRACKER_WIRE_ID";

    public al()
    {
    }

    public static Intent a(Context context)
    {
        return a(context, s.a());
    }

    public static Intent a(Context context, String s1)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.PairSoftTrackerTask.ACTION");
        if (s1 != null)
        {
            context.putExtra("com.fitbit.data.bl.PairSoftTrackerTask.EXTRA_TRACKER_WIRE_ID", s1);
        }
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = null;
        if (intent.hasExtra("com.fitbit.data.bl.PairSoftTrackerTask.EXTRA_TRACKER_WIRE_ID"))
        {
            syncservice = intent.getStringExtra("com.fitbit.data.bl.PairSoftTrackerTask.EXTRA_TRACKER_WIRE_ID");
        }
        dg.d().a(syncservice, this);
    }

    public boolean b()
    {
        return an.a().j();
    }
}
