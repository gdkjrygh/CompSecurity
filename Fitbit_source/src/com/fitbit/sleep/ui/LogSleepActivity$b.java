// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.content.Context;
import com.fitbit.data.bl.ay;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.util.bf;
import java.util.UUID;

// Referenced classes of package com.fitbit.sleep.ui:
//            LogSleepActivity

private static class b extends bf
{

    private UUID a;
    private Long b;

    protected SleepLogEntry a()
    {
        if (a != null)
        {
            return ay.a().a(a);
        } else
        {
            return ay.a().a(b);
        }
    }

    protected Object f_()
    {
        return a();
    }

    public (Context context, UUID uuid, Long long1)
    {
        super(context);
        a = uuid;
        b = long1;
    }
}
