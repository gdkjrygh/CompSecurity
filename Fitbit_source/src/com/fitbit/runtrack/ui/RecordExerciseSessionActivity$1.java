// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Intent;
import android.text.TextUtils;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity, LiveExerciseTrackingFragment, PathTrackingMapFragment

class a extends c
{

    final RecordExerciseSessionActivity a;

    protected void a(Intent intent)
    {
        if (TextUtils.equals("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE", intent.getAction()))
        {
            Object obj = com.fitbit.runtrack.c.e(intent);
            if (obj != null)
            {
                RecordExerciseSessionActivity.a(a, ((com.fitbit.runtrack.data.ExerciseStat) (obj)));
            }
            java.util.List list1 = com.fitbit.runtrack.c.d(intent);
            java.util.List list = com.fitbit.runtrack.c.a(intent);
            a.a(list);
            LiveExerciseTrackingFragment liveexercisetrackingfragment = RecordExerciseSessionActivity.a(a).a();
            if (liveexercisetrackingfragment != null && liveexercisetrackingfragment.isVisible())
            {
                if (obj != null && list1 != null)
                {
                    liveexercisetrackingfragment.a(((com.fitbit.runtrack.data.ExerciseStat) (obj)), list1);
                }
                liveexercisetrackingfragment.a(list);
            }
            intent = com.fitbit.runtrack.c.b(intent);
            obj = RecordExerciseSessionActivity.a(a).b();
            if (intent != null && obj != null && ((PathTrackingMapFragment) (obj)).isVisible())
            {
                ((PathTrackingMapFragment) (obj)).a(RecordExerciseSessionActivity.b(a), intent, list);
            }
        }
    }

    (RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        a = recordexercisesessionactivity;
        super();
    }
}
