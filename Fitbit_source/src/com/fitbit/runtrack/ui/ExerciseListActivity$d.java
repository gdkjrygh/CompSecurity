// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.util.bf;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity

private static class a extends bf
{

    private final long a;

    protected List a()
    {
        ActivityLogEntry activitylogentry = ActivityBusinessLogic.a().c(a);
        if (activitylogentry == null || activitylogentry.getEntityStatus() == com.fitbit.data.domain.DING_DELETE)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.singletonList(activitylogentry);
        }
    }

    protected Object f_()
    {
        return a();
    }

    public (Context context, long l)
    {
        super(context);
        a = l;
    }
}
