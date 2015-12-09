// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.savedstate.v;
import com.fitbit.util.chart.a;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            SyncDataForLongPeriodOperation, fr, bs, e

public class fq extends SyncDataForLongPeriodOperation
{

    private static com.fitbit.util.chart.Filter.Type e[];

    public fq(bs bs, SyncDataForLongPeriodOperation.Ranges ranges, boolean flag)
    {
        super(bs, ranges.a(), flag);
    }

    public fq(bs bs, SyncDataForLongPeriodOperation.a a1, boolean flag)
    {
        super(bs, a1, flag);
    }

    protected e a(SyncDataForLongPeriodOperation.b b1)
    {
        return new fr(e(), b1.b(), b1.c(), false);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        super.a(a1);
    }

    protected void b(com.fitbit.data.bl.a.a a1)
        throws ServerCommunicationException, JSONException
    {
        super.b(a1);
        Date date = new Date();
        a1 = ((fr)a1).b();
        com.fitbit.util.chart.Filter.Type atype[] = e;
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            com.fitbit.util.chart.Filter.Type type = atype[i];
            if (a1.before(com.fitbit.util.chart.a.a(type, date)))
            {
                v.a(type, true);
            }
        }

    }

    static 
    {
        e = (new com.fitbit.util.chart.Filter.Type[] {
            com.fitbit.util.chart.Filter.Type.b, com.fitbit.util.chart.Filter.Type.e, com.fitbit.util.chart.Filter.Type.h, com.fitbit.util.chart.Filter.Type.k, com.fitbit.util.chart.Filter.Type.n
        });
    }
}
