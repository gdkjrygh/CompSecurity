// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.util.bf;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            UpdateRecordedExerciseActivity

private static class a extends bf
{

    private final ActivityLogEntry a;
    private ServerCommunicationException b;

    public boolean a()
    {
        return b != null;
    }

    public ServerCommunicationException b()
    {
        return b;
    }

    protected ActivityLogEntry d()
    {
        ActivityLogEntry activitylogentry;
        try
        {
            activitylogentry = ActivityBusinessLogic.a().d(a);
        }
        catch (ServerCommunicationException servercommunicationexception)
        {
            b = servercommunicationexception;
            return null;
        }
        return activitylogentry;
    }

    protected Object f_()
    {
        return d();
    }

    protected void onReset()
    {
        super.onReset();
        b = null;
    }

    public I(Context context, ActivityLogEntry activitylogentry)
    {
        super(context);
        a = activitylogentry;
    }
}
