// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Pair;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class c
{

    public static final String a = "com.fitbit.runtrack.EXERCISE_SESSION_UPDATE";
    private static final String b = "com.fitbit.runtrack.xtra.SESSION";
    private static final String c = "com.fitbit.runtrack.xtra.SEGMENTS";
    private static final String d = "com.fitbit.runtrack.xtra.LAST_EVENT";
    private static final String e = "com.fitbit.runtrack.xtra.SPLITS";
    private static final String f = "com.fitbit.runtrack.xtra.AVG_STATS";
    private final Handler g = new Handler();

    public c()
    {
    }

    public static Intent a(ExerciseSession exercisesession, List list, ExerciseEvent exerciseevent, Pair pair)
    {
        Intent intent = new Intent("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE");
        intent.putExtra("com.fitbit.runtrack.xtra.SESSION", exercisesession);
        intent.putExtra("com.fitbit.runtrack.xtra.SEGMENTS", new ArrayList(list));
        if (pair != null)
        {
            intent.putExtra("com.fitbit.runtrack.xtra.SPLITS", new ArrayList((Collection)pair.second));
            intent.putExtra("com.fitbit.runtrack.xtra.AVG_STATS", (Parcelable)pair.first);
        }
        if (exerciseevent != null)
        {
            intent.putExtra("com.fitbit.runtrack.xtra.LAST_EVENT", exerciseevent);
        }
        return intent;
    }

    public static List a(Intent intent)
    {
        return intent.getParcelableArrayListExtra("com.fitbit.runtrack.xtra.SEGMENTS");
    }

    public static ExerciseEvent b(Intent intent)
    {
        return (ExerciseEvent)intent.getParcelableExtra("com.fitbit.runtrack.xtra.LAST_EVENT");
    }

    public static ExerciseSession c(Intent intent)
    {
        return (ExerciseSession)intent.getParcelableExtra("com.fitbit.runtrack.xtra.SESSION");
    }

    public static List d(Intent intent)
    {
        return intent.getParcelableArrayListExtra("com.fitbit.runtrack.xtra.SPLITS");
    }

    public static ExerciseStat e(Intent intent)
    {
        return (ExerciseStat)intent.getParcelableExtra("com.fitbit.runtrack.xtra.AVG_STATS");
    }

    public Intent b(ExerciseSession exercisesession, List list, ExerciseEvent exerciseevent, Pair pair)
    {
        exercisesession = a(exercisesession, list, exerciseevent, pair);
        g.post(new _cls1(exercisesession));
        return exercisesession;
    }

    /* member class not found */
    class _cls1 {}

}
