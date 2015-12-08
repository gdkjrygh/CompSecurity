// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fitbit.activity.a;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.savedstate.MobileRunSavedState;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack:
//            j, Duration, b, SpeechService, 
//            c

public class AudioCueBroadcastReceiver extends BroadcastReceiver
{

    public static final String a = "com.fitbit.runtrack.AUDIO_CUE_BASED_ON_FREQUENCY";

    public AudioCueBroadcastReceiver()
    {
    }

    public static Intent a(Context context, ExerciseSession exercisesession)
    {
        return a(context, exercisesession.getUuid());
    }

    public static Intent a(Context context, UUID uuid)
    {
        context = new Intent(context, com/fitbit/runtrack/AudioCueBroadcastReceiver);
        context.setAction("com.fitbit.runtrack.AUDIO_CUE_BASED_ON_FREQUENCY");
        context.setData(Uri.parse(String.format("data://exercise_session/%s", new Object[] {
            uuid
        })));
        return context;
    }

    private void a(Context context, ExerciseSession exercisesession, ExerciseStat exercisestat, ExerciseEvent exerciseevent, int i, Duration duration)
    {
        if (i > exercisesession.f() && (new b()).a(i, exercisesession))
        {
            a(context, exercisesession, exercisestat, exerciseevent, duration);
        }
    }

    private void c(Context context, Intent intent)
    {
        ((AlarmManager)context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, 0x10000000));
    }

    public void a(Context context, Intent intent)
    {
        if (MobileRunSavedState.c() != com.fitbit.savedstate.MobileRunSavedState.FrequencyType.b)
        {
            c(context, intent);
            return;
        }
        j j1 = new j(context);
        b b1 = new b();
        UUID uuid = UUID.fromString(intent.getData().getLastPathSegment());
        ExerciseSession exercisesession = b1.a(uuid);
        if (exercisesession == null || exercisesession.a() != com.fitbit.runtrack.data.ExerciseSession.Status.b)
        {
            c(context, intent);
            j1.a(uuid);
            return;
        } else
        {
            Object obj = b1.g(exercisesession);
            intent = new Duration(b1.c(exercisesession));
            obj = (ExerciseStat)((Pair) (obj)).first;
            long l = MobileRunSavedState.f();
            int i = (int)(intent.a(TimeUnit.MILLISECONDS) / l);
            a(context, exercisesession, ((ExerciseStat) (obj)), b1.d(exercisesession), i, ((Duration) (intent)));
            j1.a(exercisesession, intent);
            return;
        }
    }

    public void a(Context context, ExerciseSession exercisesession, ExerciseStat exercisestat, ExerciseEvent exerciseevent, Duration duration)
    {
        exercisesession = exerciseevent.location;
        Object obj = MobileRunSavedState.g();
        exerciseevent = an.a().b().t();
        obj = new com.fitbit.runtrack.b(((java.util.EnumSet) (obj)));
        ((com.fitbit.runtrack.b) (obj)).a(exercisestat.a().a(exerciseevent));
        ((com.fitbit.runtrack.b) (obj)).b(exercisestat.a(exerciseevent));
        ((com.fitbit.runtrack.b) (obj)).a((int)com.fitbit.activity.a.a(exercisestat.b(), new Date()));
        exercisestat.a(exerciseevent);
        if (exercisesession.hasSpeed())
        {
            long l = (int)(1.0D / (new Length(exercisesession.getSpeed(), com.fitbit.data.domain.Length.LengthUnits.METERS)).a(exerciseevent).b());
            if (l > 0L)
            {
                new Duration(l);
            }
        }
        ((com.fitbit.runtrack.b) (obj)).a(duration);
        ((com.fitbit.runtrack.b) (obj)).c(exercisestat.a(exerciseevent));
        ((com.fitbit.runtrack.b) (obj)).a(exerciseevent);
        context.startService(com.fitbit.runtrack.SpeechService.a(context, Locale.getDefault(), ((com.fitbit.runtrack.b) (obj)).a(context.getResources()), 3, 0.8F));
    }

    public void b(Context context, Intent intent)
    {
        ExerciseSession exercisesession;
        ExerciseStat exercisestat;
        if (MobileRunSavedState.c() == com.fitbit.savedstate.MobileRunSavedState.FrequencyType.a)
        {
            if ((exercisesession = com.fitbit.runtrack.c.c(intent)).a() == com.fitbit.runtrack.data.ExerciseSession.Status.b && (exercisestat = com.fitbit.runtrack.c.e(intent)) != null && (intent = com.fitbit.runtrack.c.b(intent)) != null)
            {
                Duration duration = new Duration((new b()).c(exercisesession));
                long l = MobileRunSavedState.f();
                a(context, exercisesession, exercisestat, intent, (int)Math.floor(exercisestat.a().a(com.fitbit.data.domain.Length.LengthUnits.METERS).b() / (double)l), duration);
                return;
            }
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (MobileRunSavedState.h())
        {
            if (TextUtils.equals("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE", intent.getAction()))
            {
                b(context, intent);
                return;
            }
            if (TextUtils.equals("com.fitbit.runtrack.AUDIO_CUE_BASED_ON_FREQUENCY", intent.getAction()))
            {
                a(context, intent);
                return;
            }
        }
    }
}
