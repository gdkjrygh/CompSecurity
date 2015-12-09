// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.u;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.util.p;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            d, dg, ez, dm, 
//            ay, bs

public class er extends d
{

    private static final String a = "SyncSleepLogsForDayOperation";

    public er(bs bs, boolean flag, Date date)
    {
        super(bs, flag, date);
    }

    public static void a(Date date)
    {
        date = b(date);
        dg.d().c().d(date);
    }

    private static String b(Date date)
    {
        return dm.a("SyncSleepLogsForDayOperation", date);
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        if (!p.a(DeviceFeature.SLEEP))
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a1 = ay.a();
        Date date = b();
        a1.a(a1.a(date).a, date);
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.a, b(), com.fitbit.savedstate.LoadSavedState.Status.b);
        return;
        a1;
        LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.a, b(), com.fitbit.savedstate.LoadSavedState.Status.c, com.fitbit.savedstate.LoadSavedState.Status.a);
        throw a1;
    }

    public String d()
    {
        return "SyncSleepLogsForDayOperation";
    }
}
