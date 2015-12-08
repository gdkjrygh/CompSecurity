// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

public final class TrackerDetailsActivity_ extends TrackerDetailsActivity
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
            b.putExtra("encodedId", s);
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
            b = new Intent(context, com/fitbit/device/ui/TrackerDetailsActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/device/ui/TrackerDetailsActivity_);
        }
    }


    public static final String t = "encodedId";
    private final c u = new c();

    public TrackerDetailsActivity_()
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
        k();
        r = com.fitbit.galileo.ui.sync.c.b(this);
        s = com.fitbit.galileo.service.b.b(this);
    }

    private void k()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("encodedId"))
        {
            q = bundle.getString("encodedId");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        p = a1.findViewById(0x7f1101d6);
        b = (TextView)a1.findViewById(0x7f1101a3);
        c = (ImageButton)a1.findViewById(0x7f110472);
        h = a1.findViewById(0x7f1101d0);
        k = a1.findViewById(0x7f1101ce);
        l = (ViewGroup)a1.findViewById(0x7f1101d2);
        g = (Button)a1.findViewById(0x7f1101cc);
        m = a1.findViewById(0x7f1101d4);
        i = (TextView)a1.findViewById(0x7f110474);
        j = a1.findViewById(0x7f1101d1);
        o = (TextView)a1.findViewById(0x7f110476);
        d = a1.findViewById(0x7f1101cf);
        a = a1.findViewById(0x7f11006c);
        f = (ProgressBar)a1.findViewById(0x7f11034e);
        n = (TextView)a1.findViewById(0x7f110475);
        e = (SwitchCompat)a1.findViewById(0x7f11046d);
        View view = a1.findViewById(0x7f1101d1);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackerDetailsActivity_ a;

                public void onClick(View view1)
                {
                    a.f();
                }

            
            {
                a = TrackerDetailsActivity_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f110472);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackerDetailsActivity_ a;

                public void onClick(View view1)
                {
                    a.h();
                }

            
            {
                a = TrackerDetailsActivity_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1101cc);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackerDetailsActivity_ a;

                public void onClick(View view1)
                {
                    a.i();
                }

            
            {
                a = TrackerDetailsActivity_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f1101d0);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final TrackerDetailsActivity_ a;

                public void onClick(View view1)
                {
                    a.g();
                }

            
            {
                a = TrackerDetailsActivity_.this;
                super();
            }
            });
        }
        d();
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
        c c1 = c.a(u);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04004f);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f12000d, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (menuitem.getItemId() == 0x7f1104e0)
        {
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        u.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        u.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        u.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        k();
    }
}
