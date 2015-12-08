// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui:
//            ScaleDetailsActivity

public final class ScaleDetailsActivity_ extends ScaleDetailsActivity
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

        public a a(int j)
        {
            b.setFlags(j);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("encodedId", s);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int j)
        {
            if (c != null)
            {
                c.startActivityForResult(b, j);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, j);
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
            b = new Intent(context, com/fitbit/device/ui/ScaleDetailsActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/device/ui/ScaleDetailsActivity_);
        }
    }


    public static final String h = "encodedId";
    private final c i = new c();

    public ScaleDetailsActivity_()
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
        c.a(this);
        f();
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("encodedId"))
        {
            a = bundle.getString("encodedId");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        g = a1.findViewById(0x7f110127);
        d = (Spinner)a1.findViewById(0x7f1101a5);
        c = (EditText)a1.findViewById(0x7f1101a2);
        f = (ProgressBar)a1.findViewById(0x7f11009b);
        b = (TextView)a1.findViewById(0x7f1101a3);
        e = (TextView)a1.findViewById(0x7f1101a4);
        c();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(i);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040043);
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && j == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(j, keyevent);
    }

    public void setContentView(int j)
    {
        super.setContentView(j);
        i.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        i.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        i.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
