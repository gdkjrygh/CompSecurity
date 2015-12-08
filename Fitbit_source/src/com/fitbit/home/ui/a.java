// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Intent;
import android.os.Handler;
import com.fitbit.util.z;

public class com.fitbit.home.ui.a
{
    private static class a
    {

        public static com.fitbit.home.ui.a a = new com.fitbit.home.ui.a();


        private a()
        {
        }
    }


    public static final String a = (new StringBuilder()).append(com/fitbit/home/ui/a.getCanonicalName()).append(".ACTION_SHOW_ADDITIONAL_DEVICES_STATE_CHANGED").toString();
    private static final long b = 2000L;
    private Handler c;
    private boolean d;
    private final Runnable e;

    private com.fitbit.home.ui.a()
    {
        c = new Handler();
        d = false;
        e = new Runnable() {

            final com.fitbit.home.ui.a a;

            public void run()
            {
                com.fitbit.home.ui.a.a(a, false);
            }

            
            {
                a = com.fitbit.home.ui.a.this;
                super();
            }
        };
    }


    public static com.fitbit.home.ui.a a()
    {
        return a.a;
    }

    static void a(com.fitbit.home.ui.a a1, boolean flag)
    {
        a1.a(flag);
    }

    private void a(boolean flag)
    {
        if (d != flag)
        {
            d = flag;
            z.b(new Intent(a));
        }
    }

    public void b()
    {
        a(true);
        c.removeCallbacks(e);
        c.postDelayed(e, 2000L);
    }

    public boolean c()
    {
        return d;
    }

}
