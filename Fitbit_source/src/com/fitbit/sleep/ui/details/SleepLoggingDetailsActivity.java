// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.details;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.ActionBar;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.sleep.ui.LogSleepActivity;
import com.fitbit.sleep.ui.landing.SleepLoggingLandingActivity;
import com.fitbit.sleep.ui.landing.b;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.ap;
import com.fitbit.util.fonts.FitbitFont;

// Referenced classes of package com.fitbit.sleep.ui.details:
//            SleepLoggingDetailsHeaderFragment, SleepLoggingDetailsSummaryView, a

public class SleepLoggingDetailsActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    public static final String a = "EXTRA_LOG_ID";
    private static final String b = "TAG_HEADER_FRAGMENT";
    private static final int c = 5;
    private static final float d = ap.b(0.0F);
    private static final float e = ap.b(4F);
    private static final int f = 250;
    private SleepLogEntry g;
    private SleepLoggingDetailsSummaryView h;
    private ScrollView i;
    private long j;
    private boolean k;
    private TransitionDrawable l;

    public SleepLoggingDetailsActivity()
    {
        k = false;
    }

    public static Intent a(Context context, long l1)
    {
        context = new Intent(context, com/fitbit/sleep/ui/details/SleepLoggingDetailsActivity);
        context.putExtra("EXTRA_LOG_ID", l1);
        return context;
    }

    static ScrollView a(SleepLoggingDetailsActivity sleeploggingdetailsactivity)
    {
        return sleeploggingdetailsactivity.i;
    }

    static boolean a(SleepLoggingDetailsActivity sleeploggingdetailsactivity, boolean flag)
    {
        sleeploggingdetailsactivity.k = flag;
        return flag;
    }

    static boolean b(SleepLoggingDetailsActivity sleeploggingdetailsactivity)
    {
        return sleeploggingdetailsactivity.k;
    }

    static TransitionDrawable c(SleepLoggingDetailsActivity sleeploggingdetailsactivity)
    {
        return sleeploggingdetailsactivity.l;
    }

    static float g()
    {
        return e;
    }

    static float h()
    {
        return d;
    }

    private void i()
    {
        getSupportLoaderManager().initLoader(502, null, this);
        if ((SleepLoggingDetailsHeaderFragment)getSupportFragmentManager().findFragmentByTag("TAG_HEADER_FRAGMENT") == null)
        {
            SleepLoggingDetailsHeaderFragment sleeploggingdetailsheaderfragment = SleepLoggingDetailsHeaderFragment.a(j);
            getSupportFragmentManager().beginTransaction().add(0x7f110083, sleeploggingdetailsheaderfragment, "TAG_HEADER_FRAGMENT").commit();
        }
        i.setOverScrollMode(2);
        i.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

            final SleepLoggingDetailsActivity a;

            public void onScrollChanged()
            {
                int i1 = SleepLoggingDetailsActivity.a(a).getScrollY();
                if (!com.fitbit.sleep.ui.details.SleepLoggingDetailsActivity.b(a) || i1 > 5) goto _L2; else goto _L1
_L1:
                SleepLoggingDetailsActivity.c(a).reverseTransition(250);
                SleepLoggingDetailsActivity.a(a, false);
_L4:
                ActionBar actionbar = a.getSupportActionBar();
                if (actionbar != null)
                {
                    actionbar.setElevation(Math.min(SleepLoggingDetailsActivity.g(), Math.max(SleepLoggingDetailsActivity.h(), i1)));
                }
                return;
_L2:
                if (!com.fitbit.sleep.ui.details.SleepLoggingDetailsActivity.b(a) && i1 > 5)
                {
                    SleepLoggingDetailsActivity.c(a).startTransition(250);
                    SleepLoggingDetailsActivity.a(a, true);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = SleepLoggingDetailsActivity.this;
                super();
            }
        });
    }

    public void a(Loader loader, b b1)
    {
        if (b1 == null || b1.a() == null)
        {
            loader = SleepLoggingLandingActivity.a(this);
            loader.setFlags(0x4000000);
            startActivity(loader);
            return;
        } else
        {
            g = b1.a();
            h.a(g);
            h.a(b1.b());
            return;
        }
    }

    protected void f()
    {
        if (g != null)
        {
            startActivity(LogSleepActivity.a(this, g, g.b()));
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04004b);
        bundle = getIntent();
        if (bundle.hasExtra("EXTRA_LOG_ID"))
        {
            j = bundle.getLongExtra("EXTRA_LOG_ID", -1L);
        }
        i = (ScrollView)findViewById(0x7f110149);
        h = (SleepLoggingDetailsSummaryView)findViewById(0x7f110084);
        i();
        bundle = new TypedValue();
        if (getTheme().resolveAttribute(0x7f010000, bundle, true))
        {
            l = (TransitionDrawable)getResources().getDrawable(((TypedValue) (bundle)).resourceId);
            getSupportActionBar().setBackgroundDrawable(l);
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new a(this, j);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f12000f, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (menuitem.getItemId() == 0x7f1104e2)
        {
            f();
            return true;
        } else
        {
            return false;
        }
    }

    protected FitbitFont p_()
    {
        return FitbitFont.g;
    }

}
