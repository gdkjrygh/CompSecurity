// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DatabaseUtils;

final class gem
    implements geu
{

    private final int a;
    private final fps b;
    private final noz c;

    gem(Context context, int i)
    {
        a = i;
        b = (fps)olm.a(context, fps);
        c = noz.a(context, 3, "AppForegroundSyncTask", new String[0]);
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean b()
    {
        boolean flag = true;
        fps fps1 = b;
        int i = a;
        if (DatabaseUtils.queryNumEntries(mvj.a(fps1.a, i), "job_queue_table", "subsystem_id = ? AND network_required = ?", new String[] {
    "PHOTOS_JOB_SUBSYSTEM", "1"
}) <= 0L)
        {
            flag = false;
        }
        if (c.a())
        {
            (new StringBuilder(24)).append("shouldStopSyncing: ").append(flag);
        }
        return flag;
    }

    public final get c()
    {
        return get.e;
    }

    public final int d()
    {
        return a;
    }

    public final void e()
    {
    }

    public final void f()
    {
    }
}
