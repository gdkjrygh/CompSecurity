// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, r, 
//            an

public class cl extends a
{

    static final String b = "com.fitbit.data.bl.SyncFoodLogsTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncFoodLogsTask.BROADCAST_ACTION";
    private static final String d = "force";
    private static final String e = "offset";
    private static final String f = "count";
    private static final String g = "startDate";

    public cl()
    {
    }

    public static Intent a(Context context, boolean flag, int i, int j, Date date)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncFoodLogsTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("offset", i);
        context.putExtra("count", j);
        context.putExtra("startDate", date);
        return context;
    }

    private void a(List list)
        throws Exception
    {
        Date date;
        Object obj;
        if (list.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        date = (Date)list.get(list.size() - 1);
        obj = (Date)list.get(0);
        if (a(date, ((Date) (obj)), 0x39ef8b000L))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        dg.d().a(false, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.CALORIES, date, ((Date) (obj)), null);
        return;
        list;
        list.printStackTrace();
        return;
        list;
        list.printStackTrace();
        return;
        date = new Date((date.getTime() + ((Date) (obj)).getTime()) / 2L);
        obj = new ArrayList();
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            Date date1 = (Date)list.next();
            if (date1.after(date))
            {
                arraylist.add(date1);
            } else
            {
                ((List) (obj)).add(date1);
            }
        }

        a(((List) (obj)));
        a(((List) (arraylist)));
        return;
    }

    private static boolean a(Date date, Date date1, long l)
    {
        return date1.getTime() - date.getTime() > l;
    }

    public static final IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncFoodLogsTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        boolean flag = intent.getBooleanExtra("force", false);
        int i = intent.getIntExtra("offset", 0);
        int j = intent.getIntExtra("count", 10);
        syncservice = (Date)intent.getSerializableExtra("startDate");
        dg.d().a(flag, this, i, j);
        a(r.a().a(syncservice, j));
        z.a(new Intent("com.fitbit.data.bl.SyncFoodLogsTask.BROADCAST_ACTION"));
        return;
        syncservice;
        z.a(new Intent("com.fitbit.data.bl.SyncFoodLogsTask.BROADCAST_ACTION"));
        throw syncservice;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
