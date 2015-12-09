// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.fitbit.galileo.GalileoTracker;
import java.util.List;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.galileo.ui:
//            GalileoScanActivity, TrackersFragment

public final class GalileoScanActivity_ extends GalileoScanActivity
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
            b = new Intent(context, com/fitbit/galileo/ui/GalileoScanActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/galileo/ui/GalileoScanActivity_);
        }
    }


    private final c c = new c();
    private Handler d;

    public GalileoScanActivity_()
    {
        d = new Handler(Looper.getMainLooper());
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
    }

    static void a(GalileoScanActivity_ galileoscanactivity_, GalileoTracker galileotracker)
    {
        galileoscanactivity_.com.fitbit.galileo.ui.GalileoScanActivity.b(galileotracker);
    }

    static void a(GalileoScanActivity_ galileoscanactivity_, List list)
    {
        galileoscanactivity_.com.fitbit.galileo.ui.GalileoScanActivity.a(list);
    }

    private Fragment b(int i)
    {
        return getSupportFragmentManager().findFragmentById(i);
    }

    public void a(List list)
    {
        d.post(new Runnable(list) {

            final List a;
            final GalileoScanActivity_ b;

            public void run()
            {
                com.fitbit.galileo.ui.GalileoScanActivity_.a(b, a);
            }

            
            {
                b = GalileoScanActivity_.this;
                a = list;
                super();
            }
        });
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        b = (Button)a1.findViewById(0x7f1100fd);
        a = (TrackersFragment)b(0x7f1100fc);
        a1 = a1.findViewById(0x7f1100fd);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final GalileoScanActivity_ a;

                public void onClick(View view)
                {
                    a.c();
                }

            
            {
                a = GalileoScanActivity_.this;
                super();
            }
            });
        }
    }

    public void b(GalileoTracker galileotracker)
    {
        d.post(new Runnable(galileotracker) {

            final GalileoTracker a;
            final GalileoScanActivity_ b;

            public void run()
            {
                com.fitbit.galileo.ui.GalileoScanActivity_.a(b, a);
            }

            
            {
                b = GalileoScanActivity_.this;
                a = galileotracker;
                super();
            }
        });
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = org.androidannotations.a.c.c.a(c);
        a(bundle);
        super.onCreate(bundle);
        org.androidannotations.a.c.c.a(c1);
        setContentView(0x7f040022);
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
        c.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        c.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        c.a(this);
    }
}
