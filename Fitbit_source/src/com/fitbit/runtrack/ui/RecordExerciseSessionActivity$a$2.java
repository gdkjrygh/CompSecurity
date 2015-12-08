// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity, ExerciseSessionStateBroadcaster, LiveExerciseTrackingFragment

class a
    implements Runnable
{

    final LiveExerciseTrackingFragment a;
    final b b;

    public void run()
    {
        com.fitbit.e.a.a(RecordExerciseSessionActivity.g(), "Registering Session State Callbacks for live stats view", new Object[0]);
        b.b.a(a, b.b);
    }

    ( , LiveExerciseTrackingFragment liveexercisetrackingfragment)
    {
        b = ;
        a = liveexercisetrackingfragment;
        super();
    }
}
