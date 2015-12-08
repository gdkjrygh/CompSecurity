// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.savedstate.ActivityLoggingState;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity, ExerciseDetailsActivity

class a
    implements a
{

    final ActivityLogEntry a;
    final RecordExerciseSessionActivity b;

    public void a()
    {
        ActivityLoggingState.a(com.fitbit.savedstate..b);
        b.startActivity(ExerciseDetailsActivity.a(b, a, true));
        b.finish();
    }

    (RecordExerciseSessionActivity recordexercisesessionactivity, ActivityLogEntry activitylogentry)
    {
        b = recordexercisesessionactivity;
        a = activitylogentry;
        super();
    }
}
