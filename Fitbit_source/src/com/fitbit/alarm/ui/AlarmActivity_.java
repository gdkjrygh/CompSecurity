// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmActivity, AlarmFragment

public final class AlarmActivity_ extends AlarmActivity
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

        public a a(String s)
        {
            b.putExtra("deviceAddress", s);
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
            b = new Intent(context, com/fitbit/alarm/ui/AlarmActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/alarm/ui/AlarmActivity_);
        }
    }


    public static final String c = "deviceAddress";
    private final c d = new c();

    public AlarmActivity_()
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

    private void a(Bundle bundle)
    {
        org.androidannotations.a.c.c.a(this);
        f();
    }

    private Fragment b(int i)
    {
        return getSupportFragmentManager().findFragmentById(i);
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("deviceAddress"))
        {
            a = bundle.getString("deviceAddress");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        b = (AlarmFragment)b(0x7f11008b);
        a();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 7687: 
            a(j, intent);
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(d);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
        setContentView(0x7f040007);
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
        d.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        d.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        d.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
