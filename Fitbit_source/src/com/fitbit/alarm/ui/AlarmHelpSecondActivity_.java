// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmHelpSecondActivity

public final class AlarmHelpSecondActivity_ extends AlarmHelpSecondActivity
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
            b.putExtra("deviceVersion", s);
            return this;
        }

        public a b(String s)
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
            b = new Intent(context, com/fitbit/alarm/ui/AlarmHelpSecondActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/alarm/ui/AlarmHelpSecondActivity_);
        }
    }


    public static final String d = "deviceVersion";
    public static final String e = "deviceAddress";
    private final c f = new c();

    public AlarmHelpSecondActivity_()
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
        if (bundle != null)
        {
            if (bundle.containsKey("deviceVersion"))
            {
                b = bundle.getString("deviceVersion");
            }
            if (bundle.containsKey("deviceAddress"))
            {
                c = bundle.getString("deviceAddress");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a = (TextView)a1.findViewById(0x7f11008f);
        a1 = a1.findViewById(0x7f11008e);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final AlarmHelpSecondActivity_ a;

                public void onClick(View view)
                {
                    a.b();
                }

            
            {
                a = AlarmHelpSecondActivity_.this;
                super();
            }
            });
        }
        a();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 400: 
            d_(j);
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(f);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040009);
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

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
