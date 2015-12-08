// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityLogEntry;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ExerciseListActivity

class a
    implements a
{

    final yId a;

    public long a(ActivityLogEntry activitylogentry)
    {
        activitylogentry = activitylogentry.getEntityId();
        if (activitylogentry == null)
        {
            return -1L;
        } else
        {
            return activitylogentry.longValue();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/fitbit/runtrack/ui/ExerciseListActivity$7

/* anonymous class */
    class ExerciseListActivity._cls7
        implements ExerciseListActivity.c.a
    {

        final ExerciseListActivity a;

        public void a(List list)
        {
            com.fitbit.ui.a.c c = ExerciseListActivity.c(a);
            if (c == null)
            {
                return;
            } else
            {
                ExerciseListActivity.a(a, list, c, new ExerciseListActivity._cls7._cls1(this));
                return;
            }
        }

            
            {
                a = exerciselistactivity;
                super();
            }
    }

}
