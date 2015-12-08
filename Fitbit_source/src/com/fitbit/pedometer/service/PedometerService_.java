// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.app.Fragment;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.PedometerMinuteData;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService, c

public final class PedometerService_ extends PedometerService
{
    public static class a
    {

        private Context a;
        private final Intent b;
        private Fragment c;

        public Intent a()
        {
            return b;
        }

        public a a(int i)
        {
            b.setFlags(i);
            return this;
        }

        public ComponentName b()
        {
            return a.startService(b);
        }

        public boolean c()
        {
            return a.stopService(b);
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/pedometer/service/PedometerService_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/pedometer/service/PedometerService_);
        }
    }


    public PedometerService_()
    {
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void e()
    {
        d = (PowerManager)getSystemService("power");
        c = com.fitbit.pedometer.service.c.b(this);
    }

    public volatile void a()
    {
        super.a();
    }

    public volatile void a(int i, double d1, Length length)
    {
        super.a(i, d1, length);
    }

    public volatile void a(PedometerMinuteData pedometerminutedata)
    {
        super.a(pedometerminutedata);
    }

    public volatile void b()
    {
        super.b();
    }

    public volatile void c()
    {
        super.c();
    }

    public volatile void d()
    {
        super.d();
    }

    public volatile IBinder onBind(Intent intent)
    {
        return super.onBind(intent);
    }

    public void onCreate()
    {
        e();
        super.onCreate();
    }

    public volatile void onDestroy()
    {
        super.onDestroy();
    }

    public volatile int onStartCommand(Intent intent, int i, int j)
    {
        return super.onStartCommand(intent, i, j);
    }
}
