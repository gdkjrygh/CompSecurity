// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.onboarding.setup:
//            CheckDeviceActivity

public final class CheckDeviceActivity_ extends CheckDeviceActivity
    implements org.androidannotations.a.c.a, b
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

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/onboarding/setup/CheckDeviceActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/onboarding/setup/CheckDeviceActivity_);
        }
    }


    private final c f = new c();
    private Handler g;

    public CheckDeviceActivity_()
    {
        g = new Handler(Looper.getMainLooper());
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        c.a(this);
    }

    static void a(CheckDeviceActivity_ checkdeviceactivity_)
    {
        checkdeviceactivity_.CheckDeviceActivity.f();
    }

    static void a(CheckDeviceActivity_ checkdeviceactivity_, String s)
    {
        checkdeviceactivity_.com.fitbit.onboarding.setup.CheckDeviceActivity.a(s);
    }

    static void b(CheckDeviceActivity_ checkdeviceactivity_)
    {
        checkdeviceactivity_.CheckDeviceActivity.e();
    }

    public void a(String s)
    {
        g.post(new Runnable(s) {

            final String a;
            final CheckDeviceActivity_ b;

            public void run()
            {
                com.fitbit.onboarding.setup.CheckDeviceActivity_.a(b, a);
            }

            
            {
                b = CheckDeviceActivity_.this;
                a = s;
                super();
            }
        });
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        c = (ProgressBar)a1.findViewById(0x7f11009b);
        a = a1.findViewById(0x7f11009c);
        d = (TextView)a1.findViewById(0x7f11009d);
        b = a1.findViewById(0x7f11009a);
        d();
    }

    public void e()
    {
        g.post(new Runnable() {

            final CheckDeviceActivity_ a;

            public void run()
            {
                com.fitbit.onboarding.setup.CheckDeviceActivity_.b(a);
            }

            
            {
                a = CheckDeviceActivity_.this;
                super();
            }
        });
    }

    public void f()
    {
        g.post(new Runnable() {

            final CheckDeviceActivity_ a;

            public void run()
            {
                com.fitbit.onboarding.setup.CheckDeviceActivity_.a(a);
            }

            
            {
                a = CheckDeviceActivity_.this;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(f);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04000d);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        f.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        f.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        f.a(this);
    }
}
