// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.google;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.fitbit.e.a;
import com.fitbit.pedometer.b;
import com.fitbit.pedometer.e;
import com.fitbit.util.p;
import java.util.Date;

// Referenced classes of package com.fitbit.pedometer.google:
//            a, b

public final class GoogleStepsService extends Service
    implements a.b
{
    public static final class ServiceCommand extends Enum
    {

        public static final ServiceCommand a;
        public static final ServiceCommand b;
        public static final ServiceCommand c;
        public static final ServiceCommand d;
        public static final ServiceCommand e;
        private static final ServiceCommand f[];

        public static ServiceCommand valueOf(String s)
        {
            return (ServiceCommand)Enum.valueOf(com/fitbit/pedometer/google/GoogleStepsService$ServiceCommand, s);
        }

        public static ServiceCommand[] values()
        {
            return (ServiceCommand[])f.clone();
        }

        static 
        {
            a = new ServiceCommand("FLUSH", 0);
            b = new ServiceCommand("FLUSH_ALL", 1);
            c = new ServiceCommand("START_LIVE_DATA", 2);
            d = new ServiceCommand("STOP_LIVE_DATA", 3);
            e = new ServiceCommand("UNKNOWN", 4);
            f = (new ServiceCommand[] {
                a, b, c, d, e
            });
        }

        private ServiceCommand(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String a = "GoogleStepsService";
    public static final String b = "com.fitbit.pedometer.google.GoogleStepsService.EXTRA_SERVICE_COMMAND";
    public static final String c = "com.fitbit.pedometer.google.GoogleStepsService.EXTRA_INTERVAL";
    private final com.fitbit.pedometer.google.a d = new com.fitbit.pedometer.google.a();

    public GoogleStepsService()
    {
    }

    private b a()
    {
        e e1 = e.g();
        if (e1.a() != com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.c)
        {
            stopSelf();
            return null;
        } else
        {
            return (b)e1;
        }
    }

    public static ServiceCommand a(Intent intent)
    {
        if (intent != null && intent.hasExtra("com.fitbit.pedometer.google.GoogleStepsService.EXTRA_SERVICE_COMMAND"))
        {
            return (ServiceCommand)intent.getSerializableExtra("com.fitbit.pedometer.google.GoogleStepsService.EXTRA_SERVICE_COMMAND");
        } else
        {
            return com.fitbit.pedometer.google.ServiceCommand.e;
        }
    }

    public static void a(Context context)
    {
        a(context, null);
    }

    public static void a(Context context, ServiceCommand servicecommand)
    {
        Intent intent = new Intent(context, com/fitbit/pedometer/google/GoogleStepsService);
        if (servicecommand != null)
        {
            intent.putExtra("com.fitbit.pedometer.google.GoogleStepsService.EXTRA_SERVICE_COMMAND", servicecommand);
        }
        context.startService(intent);
    }

    public static void b(Context context)
    {
        context.stopService(new Intent(context, com/fitbit/pedometer/google/GoogleStepsService));
        com.fitbit.pedometer.google.b.b();
    }

    public void a(long l)
    {
        com.fitbit.e.a.a("GoogleStepsService", "onStepsReceived(): step taken at %s", new Object[] {
            new Date(l)
        });
        b b1 = a();
        if (b1 != null)
        {
            b1.a(l);
        }
    }

    public void a(boolean flag)
    {
        com.fitbit.e.a.a("GoogleStepsService", "onFlushCompleted()", new Object[0]);
        com.fitbit.pedometer.google.b.a();
        b b1 = a();
        if (b1 != null)
        {
            b1.d(flag);
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a("GoogleStepsService", "Create service.", new Object[0]);
        d.a(this);
        d.c();
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.fitbit.e.a.a("GoogleStepsService", "Destroy service.", new Object[0]);
        d.d();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        intent = a(intent);
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ServiceCommand.values().length];
                try
                {
                    a[com.fitbit.pedometer.google.ServiceCommand.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.pedometer.google.ServiceCommand.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ServiceCommand.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ServiceCommand.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.pedometer.google._cls1.a[intent.ordinal()])
        {
        default:
            com.fitbit.pedometer.google.b.a();
            return 1;

        case 1: // '\001'
            d.a();
            d.a(false);
            return 1;

        case 2: // '\002'
            d.a(true);
            return 1;

        case 3: // '\003'
            d.b();
            return 1;

        case 4: // '\004'
            break;
        }
        if (p.l())
        {
            d.c();
            return 1;
        } else
        {
            d.d();
            return 1;
        }
    }

    public void onTaskRemoved(Intent intent)
    {
        com.fitbit.pedometer.google.b.a(0L);
    }
}
