// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.apps.photos.trash.purger.PurgeTrashService;
import java.util.concurrent.TimeUnit;

public class jaz
    implements izq
{

    public static final long a;
    public final Context b;
    public final jae c;
    public final eto d;
    public final mmv e;
    public final muz f;

    public jaz(Context context)
    {
        b = context;
        c = (jae)olm.a(context, jae);
        d = (eto)olm.a(context, eto);
        e = (mmv)olm.a(context, mmv);
        f = (muz)olm.a(context, muz);
    }

    public static void a(Context context, long l)
    {
        android.content.Intent intent = PurgeTrashService.b(context);
        ((AlarmManager)context.getSystemService("alarm")).set(1, l, PendingIntent.getService(context, 0, intent, 0x8000000));
    }

    public final void a()
    {
        b();
    }

    public final void b()
    {
        boolean flag = false;
        Object obj = PurgeTrashService.b(b);
        if (PendingIntent.getService(b, 0, ((android.content.Intent) (obj)), 0x20000000) != null)
        {
            flag = true;
        }
        if (!flag)
        {
            if ((obj = c.b(0L)) != null)
            {
                a(b, ((Long) (obj)).longValue() + a);
                return;
            }
        }
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(60L);
    }
}
