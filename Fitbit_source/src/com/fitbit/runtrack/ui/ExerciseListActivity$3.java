// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityLogEntry;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity

class a
    implements a
{

    final ExerciseListActivity a;

    public long a(ActivityLogEntry activitylogentry)
    {
        if (activitylogentry == null)
        {
            return -1L;
        } else
        {
            return activitylogentry.getServerId();
        }
    }

    (ExerciseListActivity exerciselistactivity)
    {
        a = exerciselistactivity;
        super();
    }
}
