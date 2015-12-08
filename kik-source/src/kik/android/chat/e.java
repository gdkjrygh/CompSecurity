// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import com.kik.g.f;
import com.kik.g.i;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import kik.android.AlarmReceiver;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class e extends i
{

    final KikApplication a;

    e(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = new Intent(a.getBaseContext(), kik/android/AlarmReceiver);
        obj = PendingIntent.getBroadcast(a.getBaseContext(), 0, ((Intent) (obj)), 0x8000000);
        obj1 = Calendar.getInstance();
        ((Calendar) (obj1)).add(14, 500);
        AlarmManager alarmmanager = (AlarmManager)a.getSystemService("alarm");
        KikApplication.n(a).a();
        KikApplication.o(a).cancel();
        KikApplication.p(a).purge();
        alarmmanager.set(0, ((Calendar) (obj1)).getTimeInMillis(), ((PendingIntent) (obj)));
        Process.killProcess(Process.myPid());
    }
}
