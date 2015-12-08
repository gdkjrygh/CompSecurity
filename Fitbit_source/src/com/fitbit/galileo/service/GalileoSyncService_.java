// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.support.v4.app.Fragment;
import java.util.UUID;
import org.androidannotations.a.a;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService, b

public final class GalileoSyncService_ extends GalileoSyncService
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
            b = new Intent(context, com/fitbit/galileo/service/GalileoSyncService_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/galileo/service/GalileoSyncService_);
        }
    }


    public GalileoSyncService_()
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

    static void a(GalileoSyncService_ galileosyncservice_, com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget synctrackertasktarget)
    {
        galileosyncservice_.com.fitbit.galileo.service.GalileoSyncService.a(synctrackertasktarget);
    }

    static void a(GalileoSyncService_ galileosyncservice_, UUID uuid)
    {
        galileosyncservice_.com.fitbit.galileo.service.GalileoSyncService.a(uuid);
    }

    private void c()
    {
        b = (PowerManager)getSystemService("power");
        a = b.b(this);
    }

    public void a(com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget synctrackertasktarget)
    {
        org.androidannotations.a.a.a(new org.androidannotations.a.a.a("", 0, "", synctrackertasktarget) {

            final com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget a;
            final GalileoSyncService_ b;

            public void a()
            {
                try
                {
                    com.fitbit.galileo.service.GalileoSyncService_.a(b, a);
                    return;
                }
                catch (Throwable throwable)
                {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
                }
            }

            
            {
                b = GalileoSyncService_.this;
                a = synctrackertasktarget;
                super(s, i, s1);
            }
        });
    }

    public void a(UUID uuid)
    {
        org.androidannotations.a.a.a(new org.androidannotations.a.a.a("", 0, "", uuid) {

            final UUID a;
            final GalileoSyncService_ b;

            public void a()
            {
                try
                {
                    com.fitbit.galileo.service.GalileoSyncService_.a(b, a);
                    return;
                }
                catch (Throwable throwable)
                {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
                }
            }

            
            {
                b = GalileoSyncService_.this;
                a = uuid;
                super(s, i, s1);
            }
        });
    }

    public void onCreate()
    {
        c();
        super.onCreate();
    }
}
