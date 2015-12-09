// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.e.a;
import com.fitbit.maps.g;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import com.fitbit.runtrack.data.b;
import com.fitbit.runtrack.ui.RecordExerciseSessionActivity;
import com.fitbit.util.threading.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack:
//            j, Duration, SupportedActivity, g, 
//            e, c

public class ExerciseLocationService extends Service
    implements android.os.Handler.Callback, com.fitbit.maps.g.a, com.fitbit.maps.g.b
{
    private static abstract class a extends c
    {

        public abstract void a(Intent intent);

        private a()
        {
        }

    }


    private static final String c = "com.fitbit.runtrack.START_EXERCISE_TRACKING";
    private static final String d = "com.fitbit.runtrack.END_EXERCISE_TRACKING";
    private static final String e = "com.fitbit.runtrack.PAUSE_EXERICSE_TRACKING";
    private static final String f = "com.fitbit.runtrack.RESUME_EXERICSE_TRACKING";
    private static final String g = "com.fitbit.runtrack.CLEAR_STALE_DATA";
    private static final String h = "com.fitbit.runtrack.LOCATION_UPDATE";
    private static final String i = "com.fitbit.runtrack.xtra.EXERCISE_SESSION";
    private static final String j = com/fitbit/runtrack/ExerciseLocationService.getSimpleName();
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final float p = 80F;
    private static final long q = 50L;
    private g r;
    private ExecutorService s;
    private Queue t;
    private b u;
    private com.fitbit.runtrack.c v;
    private Handler w;
    private Notification x;
    private a y;

    public ExerciseLocationService()
    {
        y = new a() {

            final ExerciseLocationService a;

            public void a(Intent intent)
            {
                if (!com.fitbit.runtrack.ExerciseLocationService.a(a))
                {
                    a.startService(com.fitbit.runtrack.ExerciseLocationService.b(a));
                } else
                if (TextUtils.equals("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE", intent.getAction()))
                {
                    ExerciseSession exercisesession = com.fitbit.runtrack.c.c(intent);
                    List list = com.fitbit.runtrack.c.a(intent);
                    com.fitbit.runtrack.ExerciseLocationService.a(a, exercisesession, list);
                    com.fitbit.runtrack.ExerciseLocationService.a(a, exercisesession, list, com.fitbit.runtrack.c.e(intent));
                    return;
                }
            }

            
            {
                a = ExerciseLocationService.this;
                super();
            }
        };
    }

    public static final Intent a(Context context)
    {
        return a(context, "com.fitbit.runtrack.CLEAR_STALE_DATA");
    }

    public static final Intent a(Context context, ExerciseSession exercisesession)
    {
        context = a(context, "com.fitbit.runtrack.START_EXERCISE_TRACKING");
        context.putExtra("com.fitbit.runtrack.xtra.EXERCISE_SESSION", exercisesession);
        return context;
    }

    private static final Intent a(Context context, String s1)
    {
        s1 = new Intent(s1);
        s1.setClass(context, com/fitbit/runtrack/ExerciseLocationService);
        return s1;
    }

    static String a()
    {
        return j;
    }

    private void a(Intent intent, int i1)
    {
        ExerciseSession exercisesession;
        for (intent = u.a(com.fitbit.runtrack.data.ExerciseSession.Status.b).iterator(); intent.hasNext(); u.h(exercisesession))
        {
            exercisesession = (ExerciseSession)intent.next();
        }

        ExerciseSession exercisesession1;
        for (intent = u.a(com.fitbit.runtrack.data.ExerciseSession.Status.a).iterator(); intent.hasNext(); u.h(exercisesession1))
        {
            exercisesession1 = (ExerciseSession)intent.next();
        }

        b(b(this), i1);
    }

    static void a(ExerciseLocationService exerciselocationservice, ExerciseSession exercisesession, List list)
    {
        exerciselocationservice.a(exercisesession, list);
    }

    static void a(ExerciseLocationService exerciselocationservice, ExerciseSession exercisesession, List list, ExerciseStat exercisestat)
    {
        exerciselocationservice.a(exercisesession, list, exercisestat);
    }

    private void a(ExerciseSession exercisesession)
    {
        RemoteViews remoteviews = new RemoteViews(getPackageName(), 0x7f0401c6);
        remoteviews.setTextViewText(0x7f11011f, b(exercisesession));
        Intent intent = b(this, exercisesession);
        exercisesession = e(exercisesession);
        remoteviews.setOnClickPendingIntent(0x7f110494, PendingIntent.getBroadcast(this, 0, intent, 0x8000000));
        startForeground(0x7f11031d, (new android.support.v4.app.NotificationCompat.Builder(this)).setContent(remoteviews).setOngoing(true).setSmallIcon(0x7f0201dd, 0).setContentIntent(PendingIntent.getActivity(this, 0, exercisesession, 0x8000000)).build());
    }

    private void a(ExerciseSession exercisesession, List list)
    {
        j j1 = new j(this);
        if (((ExerciseSegment)list.get(list.size() - 1)).a())
        {
            j1.b(exercisesession);
            return;
        } else
        {
            j1.a(exercisesession, new Duration(u.a(list)));
            return;
        }
    }

    private void a(ExerciseSession exercisesession, List list, ExerciseStat exercisestat)
    {
        ((NotificationManager)getSystemService("notification")).notify(0x7f11031d, b(exercisesession, list, exercisestat));
    }

    static boolean a(ExerciseLocationService exerciselocationservice)
    {
        return exerciselocationservice.g();
    }

    private Notification b(ExerciseSession exercisesession, List list, ExerciseStat exercisestat)
    {
        byte byte0 = 8;
        Intent intent = RecordExerciseSessionActivity.a(this, exercisesession);
        intent.setFlags(0x24000000);
        boolean flag = ((ExerciseSegment)list.get(list.size() - 1)).a();
        RemoteViews remoteviews = new RemoteViews(getPackageName(), 0x7f0401c6);
        remoteviews.setTextViewText(0x7f11011f, b(exercisesession));
        Intent intent1;
        int i1;
        long l1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        remoteviews.setViewVisibility(0x7f110495, i1);
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        remoteviews.setViewVisibility(0x7f110496, i1);
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        remoteviews.setViewVisibility(0x7f110494, i1);
        intent1 = b(((Context) (this)), exercisesession);
        remoteviews.setOnClickPendingIntent(0x7f110495, PendingIntent.getService(this, 0, c(this, exercisesession), 0x8000000));
        remoteviews.setOnClickPendingIntent(0x7f110494, PendingIntent.getService(this, 0, intent1, 0x8000000));
        remoteviews.setOnClickPendingIntent(0x7f110496, PendingIntent.getActivity(this, 0, intent, 0x8000000));
        if (flag)
        {
            i1 = 0x7f02028e;
        } else
        {
            i1 = 0x7f02028d;
        }
        remoteviews.setImageViewResource(0x7f1101ec, i1);
        l1 = u.a(list);
        remoteviews.setTextViewText(0x7f1102b5, DateUtils.formatElapsedTime(TimeUnit.SECONDS.convert(l1, TimeUnit.MILLISECONDS)));
        if (exercisestat != null)
        {
            exercisesession = an.a().b();
            remoteviews.setTextViewText(0x7f110107, exercisestat.a().a(exercisesession.t()).toString());
        }
        if (x == null)
        {
            x = (new android.support.v4.app.NotificationCompat.Builder(this)).setOngoing(true).setSmallIcon(0x7f020283, 0).setContentIntent(PendingIntent.getActivity(this, 0, intent, 0x8000000)).setContent(remoteviews).setPriority(1).build();
        }
        x.contentView = remoteviews;
        return x;
    }

    public static final Intent b(Context context)
    {
        return a(context, "com.fitbit.runtrack.END_EXERCISE_TRACKING");
    }

    public static final Intent b(Context context, ExerciseSession exercisesession)
    {
        context = a(context, "com.fitbit.runtrack.PAUSE_EXERICSE_TRACKING");
        context.putExtra("com.fitbit.runtrack.xtra.EXERCISE_SESSION", exercisesession);
        return context;
    }

    static b b(ExerciseLocationService exerciselocationservice)
    {
        return exerciselocationservice.u;
    }

    private CharSequence b(ExerciseSession exercisesession)
    {
        exercisesession = com.fitbit.runtrack.SupportedActivity.a(exercisesession);
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[SupportedActivity.values().length];
                try
                {
                    a[com.fitbit.runtrack.SupportedActivity.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.runtrack.SupportedActivity.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.runtrack.SupportedActivity.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.runtrack._cls4.a[exercisesession.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 46
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        int i1 = 0x7f08047b;
_L5:
        return getText(i1);
_L2:
        i1 = 0x7f08047a;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f08047c;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void b()
    {
        w.removeMessages(3);
        y.d();
    }

    private void b(Intent intent, int i1, int j1)
    {
        if (TextUtils.equals("com.fitbit.runtrack.START_EXERCISE_TRACKING", intent.getAction()))
        {
            e(intent, i1, j1);
        } else
        {
            if (TextUtils.equals("com.fitbit.runtrack.LOCATION_UPDATE", intent.getAction()))
            {
                a(intent, i1, j1);
                return;
            }
            if (TextUtils.equals("com.fitbit.runtrack.PAUSE_EXERICSE_TRACKING", intent.getAction()))
            {
                c(intent, i1, j1);
                return;
            }
            if (TextUtils.equals("com.fitbit.runtrack.RESUME_EXERICSE_TRACKING", intent.getAction()))
            {
                d(intent, i1, j1);
                return;
            }
            if (TextUtils.equals("com.fitbit.runtrack.CLEAR_STALE_DATA", intent.getAction()))
            {
                a(intent, j1);
                return;
            }
            if (TextUtils.equals("com.fitbit.runtrack.END_EXERCISE_TRACKING", intent.getAction()) && !b(intent, j1))
            {
                f();
                return;
            }
        }
    }

    private boolean b(Intent intent, int i1)
    {
        if (!r.b())
        {
            t.add(Pair.create(intent, Integer.valueOf(i1)));
            if (!r.c())
            {
                r.a();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static final Intent c(Context context, ExerciseSession exercisesession)
    {
        context = a(context, "com.fitbit.runtrack.RESUME_EXERICSE_TRACKING");
        context.putExtra("com.fitbit.runtrack.xtra.EXERCISE_SESSION", exercisesession);
        return context;
    }

    private void c()
    {
        if (r.b())
        {
            r.b(d());
        }
        com.fitbit.e.a.d(j, "Finished Run, disconnecting location client", new Object[0]);
        r.d();
    }

    private void c(Intent intent, int i1, int j1)
    {
        intent = (ExerciseSession)intent.getParcelableExtra("com.fitbit.runtrack.xtra.EXERCISE_SESSION");
        com.fitbit.e.a.a(j, String.format("Attempt to pause Session %s", new Object[] {
            intent.getUuid()
        }), new Object[0]);
        s.submit(new Runnable(intent) {

            final ExerciseSession a;
            final ExerciseLocationService b;

            public void run()
            {
                Object obj = com.fitbit.runtrack.ExerciseLocationService.b(b).i(a);
                if (!((List) (obj)).isEmpty())
                {
                    obj = (ExerciseSegment)((List) (obj)).get(((List) (obj)).size() - 1);
                    if (!((ExerciseSegment) (obj)).a())
                    {
                        com.fitbit.runtrack.ExerciseLocationService.b(b).a(((ExerciseSegment) (obj)));
                        com.fitbit.e.a.d(com.fitbit.runtrack.ExerciseLocationService.a(), String.format("Paused Session %s", new Object[] {
                            a.getUuid()
                        }), new Object[0]);
                    }
                }
                com.fitbit.runtrack.ExerciseLocationService.c(b);
                obj = (new e(a, com.fitbit.runtrack.ExerciseLocationService.b(b), ExerciseLocationService.d(b))).a();
            /* block-local class not found */
            class _cls1 {}

                ExerciseLocationService.f(b).post(new _cls1(((Intent) (obj))));
            }

            
            {
                b = ExerciseLocationService.this;
                a = exercisesession;
                super();
            }
        });
    }

    static void c(ExerciseLocationService exerciselocationservice)
    {
        exerciselocationservice.b();
    }

    private void c(ExerciseSession exercisesession)
    {
        IntentFilter intentfilter = new IntentFilter("com.fitbit.runtrack.EXERCISE_SESSION_UPDATE");
        y.a(intentfilter);
        w.sendMessageDelayed(w.obtainMessage(3, exercisesession), 50L);
    }

    private PendingIntent d()
    {
        Intent intent = new Intent(this, getClass());
        intent.setAction("com.fitbit.runtrack.LOCATION_UPDATE");
        return PendingIntent.getService(this, 0, intent, 0x8000000);
    }

    static com.fitbit.runtrack.c d(ExerciseLocationService exerciselocationservice)
    {
        return exerciselocationservice.v;
    }

    private void d(Intent intent, int i1, int j1)
    {
        intent = (ExerciseSession)intent.getParcelableExtra("com.fitbit.runtrack.xtra.EXERCISE_SESSION");
        com.fitbit.e.a.a(j, String.format("Attempt to resume Session %s", new Object[] {
            intent.getUuid()
        }), new Object[0]);
        s.submit(new Runnable(intent) {

            final ExerciseSession a;
            final ExerciseLocationService b;

            public void run()
            {
                List list = com.fitbit.runtrack.ExerciseLocationService.b(b).i(a);
                if (!list.isEmpty() && ((ExerciseSegment)list.get(list.size() - 1)).a())
                {
                    com.fitbit.runtrack.ExerciseLocationService.b(b).b(a);
                    com.fitbit.e.a.d(com.fitbit.runtrack.ExerciseLocationService.a(), String.format("Resumed Session %s", new Object[] {
                        a.getUuid()
                    }), new Object[0]);
                }
                ExerciseLocationService.f(b).removeMessages(3, null);
                ExerciseLocationService.f(b).sendMessage(ExerciseLocationService.f(b).obtainMessage(4, a));
            }

            
            {
                b = ExerciseLocationService.this;
                a = exercisesession;
                super();
            }
        });
    }

    private void d(ExerciseSession exercisesession)
    {
        r.b(d());
        r.a(d());
    }

    private Intent e(ExerciseSession exercisesession)
    {
        exercisesession = RecordExerciseSessionActivity.a(this, exercisesession);
        exercisesession.setFlags(0x24000000);
        return exercisesession;
    }

    static a e(ExerciseLocationService exerciselocationservice)
    {
        return exerciselocationservice.y;
    }

    private void e()
    {
        r = new g(this, this, this);
    }

    private void e(Intent intent, int i1, int j1)
    {
        if (!b(intent, j1))
        {
            intent = (ExerciseSession)intent.getParcelableExtra("com.fitbit.runtrack.xtra.EXERCISE_SESSION");
            a(intent);
            d(intent);
            c(intent);
        }
    }

    static Handler f(ExerciseLocationService exerciselocationservice)
    {
        return exerciselocationservice.w;
    }

    private void f()
    {
        stopForeground(true);
        c();
        b();
        w.removeCallbacksAndMessages(null);
        stopSelf();
    }

    private boolean g()
    {
        return an.a().b() != null;
    }

    public void a(Intent intent, int i1, int j1)
    {
        if (!g())
        {
            startService(b(this));
            return;
        }
        intent = (Location)intent.getParcelableExtra("com.google.android.location.LOCATION");
        if (intent.hasAccuracy() && intent.getAccuracy() > 80F)
        {
            com.fitbit.e.a.a(j, "Location received but ignoring due to low accuracy", new Object[0]);
            return;
        } else
        {
            intent = new com.fitbit.runtrack.g(u, intent, v);
            s.submit(intent);
            return;
        }
    }

    public void a(Bundle bundle)
    {
        w.sendEmptyMessage(0);
    }

    public void a(String s1)
    {
        com.fitbit.e.a.d(j, "Location Client connection failed, location client remade", new Object[0]);
        w.sendEmptyMessage(2);
    }

    public void h_(int i1)
    {
        com.fitbit.e.a.d(j, "Location Client was disconnected, location client remade", new Object[0]);
        w.sendEmptyMessage(1);
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            for (; !t.isEmpty(); b((Intent)((Pair) (message)).first, 1, ((Integer)((Pair) (message)).second).intValue()))
            {
                message = (Pair)t.remove();
            }

            return true;

        case 1: // '\001'
        case 2: // '\002'
            e();
            return true;

        case 3: // '\003'
            w.removeMessages(3);
            Object obj = (ExerciseSession)message.obj;
            s.submit(new e(((ExerciseSession) (obj)), u, v));
            obj = w.obtainMessage();
            ((Message) (obj)).copyFrom(message);
            w.sendMessageDelayed(((Message) (obj)), 50L);
            return true;

        case 4: // '\004'
            b();
            c((ExerciseSession)message.obj);
            s.submit(new e((ExerciseSession)message.obj, u, v));
            return true;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        e();
        t = new LinkedList();
        u = new b();
        s = Executors.newSingleThreadExecutor();
        v = new com.fitbit.runtrack.c();
        w = new Handler(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        s.shutdown();
        w.removeCallbacksAndMessages(null);
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (intent == null)
        {
            stopSelf(j1);
            return 2;
        } else
        {
            b(intent, i1, j1);
            return 3;
        }
    }

}
