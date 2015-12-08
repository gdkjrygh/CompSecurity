// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.setup;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.data.bl.bl;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.util.a.a;

// Referenced classes of package com.fitbit.onboarding.setup:
//            CheckDeviceActivity_

public class CheckDeviceActivity extends OnboardingFragmentActivity
{
    private class a extends g
    {

        final CheckDeviceActivity a;

        public void a()
        {
            super.a();
            com.fitbit.onboarding.setup.CheckDeviceActivity.f(a);
        }

        public a()
        {
            a = CheckDeviceActivity.this;
            super(CheckDeviceActivity.this, 201);
        }
    }

    private class b
        implements f
    {

        final CheckDeviceActivity a;

        public void a(Exception exception)
        {
            if (exception instanceof IncorrectTimestampException)
            {
                com.fitbit.onboarding.setup.CheckDeviceActivity.g(a);
                return;
            } else
            {
                com.fitbit.onboarding.setup.CheckDeviceActivity.f(a);
                return;
            }
        }

        public void c()
        {
            a.e();
        }

        public void d()
        {
        }

        public void h()
        {
        }

        private b()
        {
            a = CheckDeviceActivity.this;
            super();
        }

    }


    public static final String e = "com.fitbit.onboarding.setup.EXTRA_CHECK_DEVICE_ACTIVITY_MESSAGE";
    protected View a;
    protected View b;
    protected ProgressBar c;
    protected TextView d;
    private g f;
    private Handler g;
    private Runnable h;
    private int i;
    private boolean j;
    private Handler k;
    private Runnable l;

    public CheckDeviceActivity()
    {
        g = new Handler(Looper.getMainLooper());
        h = new Runnable() {

            final CheckDeviceActivity a;

            public void run()
            {
                com.fitbit.onboarding.setup.CheckDeviceActivity.a(a).a(bl.a(a, true));
            }

            
            {
                a = CheckDeviceActivity.this;
                super();
            }
        };
        i = 0;
        j = false;
        k = new Handler(Looper.getMainLooper());
        l = new Runnable() {

            final CheckDeviceActivity a;

            public void run()
            {
                if (!CheckDeviceActivity.b(a))
                {
                    com.fitbit.onboarding.setup.CheckDeviceActivity.a(a, 4);
                    if (CheckDeviceActivity.c(a) > 100)
                    {
                        CheckDeviceActivity.b(a, 100);
                    }
                    a.c.setProgress(CheckDeviceActivity.c(a));
                    CheckDeviceActivity.e(a).postDelayed(CheckDeviceActivity.d(a), 40L);
                }
            }

            
            {
                a = CheckDeviceActivity.this;
                super();
            }
        };
    }

    static int a(CheckDeviceActivity checkdeviceactivity, int i1)
    {
        i1 = checkdeviceactivity.i + i1;
        checkdeviceactivity.i = i1;
        return i1;
    }

    static g a(CheckDeviceActivity checkdeviceactivity)
    {
        return checkdeviceactivity.f;
    }

    public static void a(Activity activity, int i1)
    {
        com.fitbit.onboarding.setup.CheckDeviceActivity_.a(activity).b(i1);
        com.fitbit.util.a.a.a(activity);
    }

    static int b(CheckDeviceActivity checkdeviceactivity, int i1)
    {
        i1 = checkdeviceactivity.i - i1;
        checkdeviceactivity.i = i1;
        return i1;
    }

    static boolean b(CheckDeviceActivity checkdeviceactivity)
    {
        return checkdeviceactivity.j;
    }

    static int c(CheckDeviceActivity checkdeviceactivity)
    {
        return checkdeviceactivity.i;
    }

    static Runnable d(CheckDeviceActivity checkdeviceactivity)
    {
        return checkdeviceactivity.l;
    }

    static Handler e(CheckDeviceActivity checkdeviceactivity)
    {
        return checkdeviceactivity.k;
    }

    static void f(CheckDeviceActivity checkdeviceactivity)
    {
        checkdeviceactivity.g();
    }

    private void g()
    {
        j = true;
        setResult(-1);
        finish();
        com.fitbit.util.a.a.a(this);
    }

    static void g(CheckDeviceActivity checkdeviceactivity)
    {
        checkdeviceactivity.h();
    }

    private void h()
    {
        j = true;
        getIntent().putExtra("com.fitbit.onboarding.setup.EXTRA_CHECK_DEVICE_ACTIVITY_MESSAGE", getString(0x7f080286));
        setResult(0, getIntent());
        finish();
        com.fitbit.util.a.a.a(this);
    }

    private String i()
    {
        return com.fitbit.ui.dialogs.a.b(this);
    }

    protected void a(String s)
    {
        d.setText(s);
    }

    protected void d()
    {
        if (ServerGateway.a().d())
        {
            f = new a();
            f.a(new b());
            g.postDelayed(h, 1000L);
            k.postDelayed(l, 40L);
            return;
        } else
        {
            a(i());
            b.setVisibility(8);
            a.setVisibility(0);
            return;
        }
    }

    protected void e()
    {
        com.fitbit.util.a.a.a(this, b, a);
    }

    protected void f()
    {
        com.fitbit.util.a.a.a(this, a, b);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        g.removeCallbacks(h);
        j = true;
        k.removeCallbacks(l);
    }
}
