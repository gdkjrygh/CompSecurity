// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.os.Bundle;
import com.fitbit.data.bl.b;
import com.fitbit.data.domain.Alarm;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.alarm.ui:
//            LogAlarmActivity

private static class b extends bf
{

    static final String a = "ARG_ALARM";
    private final long b;

    static Bundle a(long l)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("ARG_ALARM", l);
        return bundle;
    }

    public Alarm a()
    {
        Alarm alarm = com.fitbit.data.bl.b.a().a(b);
        if (!alarm.c())
        {
            alarm.b(0);
        }
        return alarm;
    }

    public Object f_()
    {
        return a();
    }

    public (Context context, long l)
    {
        super(context);
        b = l;
    }
}
