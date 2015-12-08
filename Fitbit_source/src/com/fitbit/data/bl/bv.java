// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.v;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class bv extends com.fitbit.data.bl.a
{

    static final String b = "com.fitbit.data.bl.SyncDataForLongPeriod.ACTION";
    public static final com.fitbit.util.chart.Filter.Type c[];
    private static final String d = "com.fitbit.data.bl.SyncDataForLongPeriod.EXTRA_LOAD_FLOORS";
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 10;
    private static final int i = 11;
    private static final int j = 12;
    private static final int k = 13;
    private static final int l = 14;
    private static final int m = 15;
    private static final int n = 20;
    private static com.fitbit.util.chart.Filter.Type o[];

    public bv()
    {
    }

    private static Intent a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, int i1, boolean flag, UUID uuid)
    {
        return a(context, ranges, i1, flag, false, uuid);
    }

    private static Intent a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, int i1, boolean flag, boolean flag1, UUID uuid)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncDataForLongPeriod.ACTION");
        context.putExtra("force", flag);
        context.putExtra("range", ranges.toString());
        context.putExtra("type", i1);
        context.putExtra("com.fitbit.data.bl.SyncDataForLongPeriod.EXTRA_LOAD_FLOORS", flag1);
        if (uuid != null)
        {
            context.putExtra("com.fitbit.util.service.DispatcherService.GUID", uuid);
        }
        return context;
    }

    public static Intent a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag)
    {
        return a(context, ranges, 1, flag, false, null);
    }

    public static Intent a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 0, flag, false, uuid);
    }

    public static Intent a(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, boolean flag1, UUID uuid)
    {
        return a(context, ranges, 10, flag, flag1, uuid);
    }

    public static Intent b(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag)
    {
        return a(context, ranges, 2, flag, false, null);
    }

    public static Intent b(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 11, flag, uuid);
    }

    public static Intent c(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 14, flag, uuid);
    }

    public static Intent d(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 12, flag, uuid);
    }

    private void d()
    {
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(new Intent("com.fibit.data.bl.BROADCAST_CHART_UPDATE"));
    }

    public static Intent e(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 15, flag, uuid);
    }

    public static Intent f(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 13, flag, uuid);
    }

    public static Intent g(Context context, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag, UUID uuid)
    {
        return a(context, ranges, 20, flag, false, uuid);
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg dg1;
        int i1;
        boolean flag;
        com.fitbit.e.a.a("DispatcherService", "SyncDataForLongPeriodTask %s", new Object[] {
            this
        });
        flag = intent.getBooleanExtra("force", false);
        syncservice = SyncDataForLongPeriodOperation.Ranges.valueOf(intent.getStringExtra("range"));
        i1 = intent.getIntExtra("type", -1);
        dg1 = dg.d();
        com.fitbit.e.a.a("INFO", syncservice.name(), new Object[0]);
        i1;
        JVM INSTR tableswitch 0 20: default 160
    //                   0 188
    //                   1 251
    //                   2 302
    //                   3 160
    //                   4 160
    //                   5 160
    //                   6 160
    //                   7 160
    //                   8 160
    //                   9 160
    //                   10 353
    //                   11 422
    //                   12 459
    //                   13 570
    //                   14 496
    //                   15 533
    //                   16 160
    //                   17 160
    //                   18 160
    //                   19 160
    //                   20 607;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L1 _L1 _L1 _L11
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type = ").append(i1).toString());
_L2:
        dg1.c(syncservice, flag, this);
        v.b(true);
        v.a(true);
        d();
        return;
        syncservice;
        com.fitbit.e.a.a("INFO", syncservice.toString(), new Object[0]);
        v.b(true);
        v.a(true);
        d();
        return;
        syncservice;
        v.b(true);
        v.a(true);
        d();
        throw syncservice;
_L3:
        dg1.a(syncservice, flag, this);
        v.a(true);
        d();
        return;
        syncservice;
        com.fitbit.e.a.a("INFO", syncservice.toString(), new Object[0]);
        v.a(true);
        d();
        return;
        syncservice;
        v.a(true);
        d();
        throw syncservice;
_L4:
        dg1.b(syncservice, flag, this);
        v.b(true);
        d();
        return;
        syncservice;
        com.fitbit.e.a.a("INFO", syncservice.toString(), new Object[0]);
        v.b(true);
        d();
        return;
        syncservice;
        v.b(true);
        d();
        throw syncservice;
_L5:
        dg1.a(syncservice, flag, intent.getBooleanExtra("com.fitbit.data.bl.SyncDataForLongPeriod.EXTRA_LOAD_FLOORS", false), this);
        LoadSavedState.a(true, o);
        LoadSavedState.e(true, o);
        LoadSavedState.d(true, o);
        d();
        return;
        syncservice;
        LoadSavedState.a(true, o);
        LoadSavedState.e(true, o);
        LoadSavedState.d(true, o);
        d();
        throw syncservice;
_L6:
        dg1.a(syncservice, flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.STEPS, this);
        LoadSavedState.a(true, o);
        d();
        return;
        syncservice;
        LoadSavedState.a(true, o);
        d();
        throw syncservice;
_L7:
        dg1.a(syncservice, flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES, this);
        LoadSavedState.e(true, o);
        d();
        return;
        syncservice;
        LoadSavedState.e(true, o);
        d();
        throw syncservice;
_L9:
        dg1.a(syncservice, flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.DISTANCE, this);
        LoadSavedState.b(true, o);
        d();
        return;
        syncservice;
        LoadSavedState.b(true, o);
        d();
        throw syncservice;
_L10:
        dg1.a(syncservice, flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.MINUTES_VERY_ACTIVE, this);
        LoadSavedState.c(true, o);
        d();
        return;
        syncservice;
        LoadSavedState.c(true, o);
        d();
        throw syncservice;
_L8:
        dg1.a(syncservice, flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.FLOORS, this);
        LoadSavedState.d(true, o);
        d();
        return;
        syncservice;
        LoadSavedState.d(true, o);
        d();
        throw syncservice;
_L11:
        dg1.d(syncservice, flag, this);
        d();
        return;
        syncservice;
        d();
        throw syncservice;
    }

    public boolean b()
    {
        return com.fitbit.data.bl.an.a().j();
    }

    static 
    {
        c = (new com.fitbit.util.chart.Filter.Type[] {
            com.fitbit.util.chart.Filter.Type.b, com.fitbit.util.chart.Filter.Type.c, com.fitbit.util.chart.Filter.Type.d, com.fitbit.util.chart.Filter.Type.e, com.fitbit.util.chart.Filter.Type.f, com.fitbit.util.chart.Filter.Type.g, com.fitbit.util.chart.Filter.Type.h, com.fitbit.util.chart.Filter.Type.i, com.fitbit.util.chart.Filter.Type.j, com.fitbit.util.chart.Filter.Type.k, 
            com.fitbit.util.chart.Filter.Type.l, com.fitbit.util.chart.Filter.Type.m, com.fitbit.util.chart.Filter.Type.n, com.fitbit.util.chart.Filter.Type.o, com.fitbit.util.chart.Filter.Type.p, com.fitbit.util.chart.Filter.Type.q, com.fitbit.util.chart.Filter.Type.r, com.fitbit.util.chart.Filter.Type.s
        });
        o = (new com.fitbit.util.chart.Filter.Type[] {
            com.fitbit.util.chart.Filter.Type.c, com.fitbit.util.chart.Filter.Type.f, com.fitbit.util.chart.Filter.Type.i, com.fitbit.util.chart.Filter.Type.l, com.fitbit.util.chart.Filter.Type.o
        });
    }
}
