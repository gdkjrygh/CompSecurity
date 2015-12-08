// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, bb, dg, 
//            an

public class bc extends a
{

    static final String b = "com.fitbit.data.bl.SyncActivityLogsAndIntradayDataTask.ACTION";
    private static final String c = "date";
    private static final String d = "force";

    public bc()
    {
    }

    public static Intent a(Context context, Date date, boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncActivityLogsAndIntradayDataTask.ACTION");
        context.putExtra("date", date);
        context.putExtra("force", flag);
        return context;
    }

    public static void a(Date date)
    {
        bb.b(date);
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        boolean flag = intent.getBooleanExtra("force", false);
        dg.d().a(true, flag, this);
        (new bb(dg.d(), (Date)intent.getSerializableExtra("date"), intent.getBooleanExtra("force", false))).b(this);
    }

    public boolean b()
    {
        return an.a().j();
    }
}
