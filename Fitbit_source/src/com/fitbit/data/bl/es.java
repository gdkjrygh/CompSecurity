// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.util.o;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dg, ez, ay, 
//            bs

public class es extends e
{

    private static final String a = "SyncSleepLogsOperation";
    private final String b;
    private final int d;
    private final int e;

    public es(bs bs, boolean flag, int i, int j)
    {
        super(bs, flag);
        d = i;
        e = j;
        b = (new StringBuilder()).append("SyncSleepLogsOperation-").append(i).append("-").append(j).toString();
        b(false);
    }

    public static void b()
    {
        dg.d().c().e("SyncSleepLogsOperation");
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        a1 = o.f();
        ay ay1 = ay.a();
        ay1.a(ay1.a(a1, d, e), a1, d, e);
    }

    public String c()
    {
        return b;
    }
}
