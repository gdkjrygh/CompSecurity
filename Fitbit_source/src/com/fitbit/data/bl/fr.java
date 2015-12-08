// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.util.au;
import com.fitbit.util.o;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, gd, aq, EntityMerger, 
//            bs

public class fr extends e
{

    private static final String a = "SyncWeightLogEntriesOperation";
    private Date b;
    private Date d;
    private String e;

    public fr(bs bs, Date date, Date date1, boolean flag)
    {
        super(bs, flag);
        b = date;
        d = date1;
        e = (new StringBuilder()).append("SyncWeightLogEntriesOperation-").append(date.getTime()).append("-").append(date1.getTime()).toString();
    }

    public fr(bs bs, boolean flag)
    {
        super(bs, flag);
        d = o.f(new Date());
        b = o.d(o.a(d, -14, 6));
        e = "SyncWeightLogEntriesOperation";
    }

    static Date a(fr fr1)
    {
        return fr1.b;
    }

    static Date b(fr fr1)
    {
        return fr1.d;
    }

    public void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Object obj = gd.a().b(b, d);
        if (!a1.a())
        {
            com.fitbit.data.repo.ax ax = aq.a().l();
            a1 = new au(Boolean.FALSE);
            obj = (new EntityMerger(((java.util.List) (obj)), ax, new _cls2())).a(new _cls1(a1));
            if (obj == EntityMerger.MergeStatus.b || obj == EntityMerger.MergeStatus.c || ((Boolean)((au) (a1)).a).booleanValue())
            {
                a1 = new Intent("com.fibit.data.bl.BROADCAST_CHART_UPDATE");
                LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(a1);
            }
        }
    }

    public Date b()
    {
        return b;
    }

    public String c()
    {
        return e;
    }

    public Date d()
    {
        return d;
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
