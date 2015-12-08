// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import com.fitbit.util.w;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class SyncTrackerTask extends a
{
    public static final class SyncTrackerTaskTarget extends Enum
    {

        public static final SyncTrackerTaskTarget a;
        public static final SyncTrackerTaskTarget b;
        private static final SyncTrackerTaskTarget c[];

        public static SyncTrackerTaskTarget valueOf(String s)
        {
            return (SyncTrackerTaskTarget)Enum.valueOf(com/fitbit/data/bl/SyncTrackerTask$SyncTrackerTaskTarget, s);
        }

        public static SyncTrackerTaskTarget[] values()
        {
            return (SyncTrackerTaskTarget[])c.clone();
        }

        static 
        {
            a = new SyncTrackerTaskTarget("ALL", 0);
            b = new SyncTrackerTaskTarget("SOFT_TRACKER", 1);
            c = (new SyncTrackerTaskTarget[] {
                a, b
            });
        }

        private SyncTrackerTaskTarget(String s, int i)
        {
            super(s, i);
        }
    }


    static final String b = "com.fitbit.data.bl.SyncTrackerTask.ACTION";
    static final String c = "com.fitbit.data.bl.SyncTrackerTask.EXTRA_SYNC_TARGET";

    public SyncTrackerTask()
    {
    }

    public static Intent a(Context context, SyncTrackerTaskTarget synctrackertasktarget)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncTrackerTask.ACTION");
        context.putExtra("com.fitbit.data.bl.SyncTrackerTask.EXTRA_SYNC_TARGET", synctrackertasktarget.toString());
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        syncservice = (SyncTrackerTaskTarget)w.a(intent.getStringExtra("com.fitbit.data.bl.SyncTrackerTask.EXTRA_SYNC_TARGET"), com/fitbit/data/bl/SyncTrackerTask$SyncTrackerTaskTarget, SyncTrackerTaskTarget.a);
        intent = dg.d();
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[syncservice.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            intent.d(this);
            return;

        case 2: // '\002'
            intent.f(this);
            break;
        }
    }

    public boolean b()
    {
        return an.a().j();
    }
}
