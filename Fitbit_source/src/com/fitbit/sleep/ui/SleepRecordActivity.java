// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.fitbit.data.bl.ay;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.savedstate.r;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.s;
import com.fitbit.util.f;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.fitbit.sleep.ui:
//            e

public class SleepRecordActivity extends FitbitActivity
{

    private static final long a = 62000L;
    private e b;
    private Timer c;

    public SleepRecordActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/fitbit/sleep/ui/SleepRecordActivity);
    }

    static void a(SleepRecordActivity sleeprecordactivity)
    {
        sleeprecordactivity.f();
    }

    private void f()
    {
        b.a(this);
    }

    private void g()
    {
        h();
        c = new Timer();
        c.schedule(new TimerTask() {

            final SleepRecordActivity a;

            public void run()
            {
            /* block-local class not found */
            class _cls1 {}

                FitbitHandlerThread.a(new _cls1());
            }

            
            {
                a = SleepRecordActivity.this;
                super();
            }
        }, 0L, 62000L);
    }

    private void h()
    {
        if (c != null)
        {
            c.cancel();
        }
    }

    private void i()
    {
        Date date = r.l();
        long l = r.m().getTime() - date.getTime();
        long l1 = l / 60000L;
        SleepLogEntry sleeplogentry = new SleepLogEntry();
        sleeplogentry.a(date);
        sleeplogentry.a((int)l);
        sleeplogentry.i((int)l1);
        sleeplogentry.c((int)l1);
        sleeplogentry.setLogDate(new Date());
        com.fitbit.util.f.a(new com.fitbit.util.f.a(this, sleeplogentry) {

            final SleepLogEntry a;
            final SleepRecordActivity b;
            private boolean c;

            public void a(Activity activity)
            {
                c = ay.a().a(a);
                if (c)
                {
                    ay.a().a(a, activity);
                }
            }

            public void a(Object obj)
            {
                b((Activity)obj);
            }

            public void b(Activity activity)
            {
                if (!c && b.P())
                {
                    s.a(activity, 0x7f0804bf, 1).i();
                }
            }

            public void b(Object obj)
            {
                a((Activity)obj);
            }

            
            {
                b = SleepRecordActivity.this;
                a = sleeplogentry;
                super(activity);
                c = true;
            }
        }, null);
    }

    protected void e()
    {
        if (r.p())
        {
            h();
            r.n();
            b.a(this, true);
            i();
            return;
        } else
        {
            r.q();
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04004d);
        bundle = findViewById(0x7f1101ba);
        if (bundle != null)
        {
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final SleepRecordActivity a;

                public void onClick(View view)
                {
                    a.e();
                }

            
            {
                a = SleepRecordActivity.this;
                super();
            }
            });
        }
        b = new e();
        b.a(this);
    }

    protected void onPause()
    {
        super.onPause();
        h();
    }

    protected void onResume()
    {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(512);
        if (!r.o())
        {
            g();
            return;
        } else
        {
            b.a(this, false);
            return;
        }
    }
}
