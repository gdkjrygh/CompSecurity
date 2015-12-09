// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.service.a;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;

public final class b
{

    private final c a = new c() {

        final b a;

        public void a(Intent intent)
        {
            if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(intent.getAction()))
            {
                com.fitbit.a.b.a(a);
            }
        }

            
            {
                a = b.this;
                super();
            }
    };

    public b()
    {
    }

    static void a(b b1)
    {
        b1.b();
    }

    private void b()
    {
        e e1 = e.g();
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.values().length];
                try
                {
                    a[com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (com.fitbit.a._cls3.a[e1.a().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            e.a(new com.fitbit.pedometer.e.b() {

                final b a;

                public void a(e e2)
                {
                    if (com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.b == e2.a() && p.l())
                    {
                        com.fitbit.pedometer.service.a.b();
                        com.fitbit.multipledevice.a.a().b();
                    }
                }

                public volatile void a(Object obj)
                {
                    a((e)obj);
                }

            
            {
                a = b.this;
                super();
            }
            }, true);
            break;
        }
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
        a.a(intentfilter);
    }
}
