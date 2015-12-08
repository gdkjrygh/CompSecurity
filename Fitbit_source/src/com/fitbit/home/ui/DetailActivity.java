// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.core.a;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.dy;
import com.fitbit.savedstate.c;
import com.fitbit.savedstate.k;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.o;
import com.fitbit.weight.ui.WeightFragment_;
import java.util.Date;

// Referenced classes of package com.fitbit.home.ui:
//            g, DetailActivity_

public class DetailActivity extends FitbitActivity
{

    private static final String b = "Details Screen - BODY";
    private static final String c = (new StringBuilder()).append(com/fitbit/home/ui/DetailActivity.getName()).append(".BODY").toString();
    protected Date a;
    private g d;
    private final BroadcastReceiver e = new BroadcastReceiver() {

        final DetailActivity a;

        public void onReceive(Context context, Intent intent)
        {
            com.fitbit.home.ui.DetailActivity.a(a);
        }

            
            {
                a = DetailActivity.this;
                super();
            }
    };

    public DetailActivity()
    {
        d = new g(this, 82);
    }

    public static void a(Context context)
    {
        DetailActivity_.b(context).a(0x4000000).b();
    }

    private void a(Intent intent)
    {
        setTitle(0x7f080378);
        setRequestedOrientation(1);
    }

    static void a(DetailActivity detailactivity)
    {
        detailactivity.h();
    }

    private void f()
    {
        if (P())
        {
            String s = c;
            if (getSupportFragmentManager().findFragmentByTag(s) == null)
            {
                Fragment fragment = Fragment.instantiate(this, com/fitbit/weight/ui/WeightFragment_.getName());
                if (a != null)
                {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("date", a);
                    fragment.setArguments(bundle);
                }
                getSupportFragmentManager().beginTransaction().replace(0x1020002, fragment, s).commit();
            }
        }
    }

    private void g()
    {
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.r);
    }

    private void h()
    {
        if (d.l())
        {
            return;
        } else
        {
            Intent intent = dy.a(getApplicationContext(), false);
            d.a(intent);
            return;
        }
    }

    protected void n_()
    {
        com.fitbit.ui.b.a.a(this, H);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(getIntent());
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
    }

    protected void onPause()
    {
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(e);
        k.a(o.b());
    }

    protected void onResume()
    {
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(e, new IntentFilter("com.fitbit.controllers.AlarmsController.ACTION_MIDNIGHT_COMES"));
        Date date = k.h();
        if (date != null && !o.j(date, o.b()))
        {
            com.fitbit.savedstate.c.a(o.b());
            h();
        }
        f();
        g();
        FitBitApplication.a().c().a(0x7f11000a).a(String.format("Details Screen - BODY", new Object[0]));
    }

}
