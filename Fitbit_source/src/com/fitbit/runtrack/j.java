// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.savedstate.MobileRunSavedState;
import com.fitbit.util.b.a;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack:
//            Duration, AudioCueBroadcastReceiver

public class j
{

    final Context a;

    public j(Context context)
    {
        a = context;
    }

    private void a(AlarmManager alarmmanager, long l, PendingIntent pendingintent)
    {
        alarmmanager.setExact(2, l, pendingintent);
    }

    private void a(AlarmManager alarmmanager, long l, PendingIntent pendingintent, long l1)
    {
        alarmmanager.setRepeating(2, l, l1, pendingintent);
    }

    public void a(ExerciseSession exercisesession)
    {
        a(exercisesession, new Duration(0L));
    }

    public void a(ExerciseSession exercisesession, Duration duration)
    {
        if (MobileRunSavedState.c() != com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b)
        {
            return;
        }
        AlarmManager alarmmanager = (AlarmManager)a.getSystemService("alarm");
        long l = MobileRunSavedState.f();
        exercisesession = com.fitbit.runtrack.AudioCueBroadcastReceiver.a(a, exercisesession);
        exercisesession = PendingIntent.getBroadcast(a, 0, exercisesession, 0x8000000);
        long l1 = SystemClock.elapsedRealtime() + (l - duration.a(TimeUnit.MILLISECONDS) % l);
        if (com.fitbit.util.b.a.a(19))
        {
            a(alarmmanager, l1, ((PendingIntent) (exercisesession)));
            return;
        } else
        {
            a(alarmmanager, l1, ((PendingIntent) (exercisesession)), l);
            return;
        }
    }

    public void a(UUID uuid)
    {
        AlarmManager alarmmanager = (AlarmManager)a.getSystemService("alarm");
        uuid = com.fitbit.runtrack.AudioCueBroadcastReceiver.a(a, uuid);
        alarmmanager.cancel(PendingIntent.getBroadcast(a, 0, uuid, 0));
    }

    public void b(ExerciseSession exercisesession)
    {
        a(exercisesession.getUuid());
    }
}
