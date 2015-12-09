// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.animation.Animator;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity

class a
    implements android.animation.ty._cls5
{

    final RecordExerciseSessionActivity a;

    public void onAnimationCancel(Animator animator)
    {
        RecordExerciseSessionActivity.d(a).a(RecordExerciseSessionActivity.h());
    }

    public void onAnimationEnd(Animator animator)
    {
        RecordExerciseSessionActivity.d(a).a(RecordExerciseSessionActivity.h());
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    (RecordExerciseSessionActivity recordexercisesessionactivity)
    {
        a = recordexercisesessionactivity;
        super();
    }
}
