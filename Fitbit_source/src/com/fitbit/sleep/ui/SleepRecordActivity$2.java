// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.TimerTask;

// Referenced classes of package com.fitbit.sleep.ui:
//            SleepRecordActivity

class a extends TimerTask
{

    final SleepRecordActivity a;

    public void run()
    {
    /* block-local class not found */
    class _cls1 {}

        FitbitHandlerThread.a(new _cls1());
    }

    ead(SleepRecordActivity sleeprecordactivity)
    {
        a = sleeprecordactivity;
        super();
    }
}
