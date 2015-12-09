// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Handler;
import android.view.animation.Animation;

// Referenced classes of package com.fitbit.device.ui:
//            ExerciseOptionsActivity

class a
    implements android.view.animation.r
{

    final ExerciseOptionsActivity a;

    public void onAnimationEnd(Animation animation)
    {
        ExerciseOptionsActivity.f(a).postDelayed(ExerciseOptionsActivity.e(a), 3000L);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ner(ExerciseOptionsActivity exerciseoptionsactivity)
    {
        a = exerciseoptionsactivity;
        super();
    }
}
