// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.Fragment;
import org.androidannotations.a.a;

// Referenced classes of package com.fitbit.widget:
//            c

public final class WidgetUpdaterService_ extends c
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
            b = new Intent(context, com/fitbit/widget/WidgetUpdaterService_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/widget/WidgetUpdaterService_);
        }
    }


    public WidgetUpdaterService_()
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

    static void a(WidgetUpdaterService_ widgetupdaterservice_)
    {
        widgetupdaterservice_.com.fitbit.widget.c.a();
    }

    public void a()
    {
        org.androidannotations.a.a.a(new org.androidannotations.a.a.a("", 0, "") {

            final WidgetUpdaterService_ a;

            public void a()
            {
                try
                {
                    com.fitbit.widget.WidgetUpdaterService_.a(a);
                    return;
                }
                catch (Throwable throwable)
                {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
                }
            }

            
            {
                a = WidgetUpdaterService_.this;
                super(s, i, s1);
            }
        });
    }

    public volatile IBinder onBind(Intent intent)
    {
        return super.onBind(intent);
    }

    public volatile int onStartCommand(Intent intent, int i, int j)
    {
        return super.onStartCommand(intent, i, j);
    }
}
