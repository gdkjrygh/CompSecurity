// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.content.Intent;
import android.text.TextUtils;

// Referenced classes of package com.fitbit.runtrack:
//            ExerciseLocationService, c

class <init> extends <init>
{

    final ExerciseLocationService a;

    public void a(Intent intent)
    {
        if (!ExerciseLocationService.a(a))
        {
            a.startService(ExerciseLocationService.b(a));
        } else
        if (TextUtils.equals("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE", intent.getAction()))
        {
            com.fitbit.runtrack.data.ExerciseSession exercisesession = c.c(intent);
            java.util.List list = c.a(intent);
            ExerciseLocationService.a(a, exercisesession, list);
            ExerciseLocationService.a(a, exercisesession, list, c.e(intent));
            return;
        }
    }

    (ExerciseLocationService exerciselocationservice)
    {
        a = exerciselocationservice;
        super(null);
    }
}
