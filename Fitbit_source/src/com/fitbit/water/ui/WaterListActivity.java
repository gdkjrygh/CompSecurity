// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import com.fitbit.FitBitApplication;
import com.fitbit.LoadableListView;
import com.fitbit.LoadableListViewFragment;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.data.domain.r;
import com.fitbit.e.a;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.endless.b;
import com.fitbit.ui.endless.d;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.water.ui:
//            b, WaterBabyChartFragment, a, EditWaterEntriesActivity, 
//            AddWaterActivity

public class WaterListActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener
{

    public static final String a = "com.fitbit.water.ui.HEADER_FRAGMENT_TAG";
    public static final int b = 64;
    public static final String c = "WaterListActivity.START_POSITION";
    public static final String d = "DayListActivity.RANGE";
    public static final int e = 92;
    public static final int f = 40;
    public static final int g = 0;
    private static final String k = "WaterListActivity";
    private static final String l = "date";
    private static final String m = "Water";
    protected View h;
    protected com.fitbit.water.ui.a i;
    protected ActivityType j;
    private boolean n;
    private boolean o;
    private TimeZone p;

    public WaterListActivity()
    {
        n = false;
        o = true;
        p = null;
    }

    private Bundle a(int i1, int j1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("WaterListActivity.START_POSITION", i1);
        bundle.putInt("DayListActivity.RANGE", j1);
        return bundle;
    }

    private void a(List list, List list1)
    {
        list.removeAll(list1);
        list.addAll(list1);
    }

    private void j()
    {
        h.setVisibility(0);
        n = true;
        getSupportLoaderManager().restartLoader(304, a(0, g()), this);
    }

    public b a(int i1, boolean flag)
    {
        Date date = com.fitbit.util.o.f(com.fitbit.util.o.b());
        Object obj;
        if (!flag)
        {
            obj = f();
            if (obj == null)
            {
                obj = new Date(date.getTime() - (long)i1 * 0x5265c00L);
            } else
            {
                date = new Date(((WaterLogEntry) (obj)).getLogDate().getTime() - 0x5265c00L);
                obj = new Date(date.getTime() - (long)i1 * 0x5265c00L);
            }
        } else
        {
            obj = new Date(date.getTime() - (long)i1 * 0x5265c00L);
        }
        return new com.fitbit.water.ui.b(this, ((Date) (obj)), date);
    }

    public void a(Loader loader, d d1)
    {
        com.fitbit.e.a.a("WaterListActivity", "onLoadFinished: %s items", new Object[] {
            Integer.valueOf(d1.b().size())
        });
        WaterBabyChartFragment waterbabychartfragment = (WaterBabyChartFragment)getSupportFragmentManager().findFragmentByTag("com.fitbit.water.ui.HEADER_FRAGMENT_TAG");
        h.setVisibility(8);
        if (n)
        {
            n = false;
            i.clear();
        }
        a(((List) (i)), d1.b());
        i.notifyDataSetChanged();
        loader = (com.fitbit.water.ui.b)loader;
        Water water = new Water(loader.h(), com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML);
        waterbabychartfragment.a(d1.b(), water.a(r.e()).b());
        if (loader.i() != 0.0D)
        {
            o = false;
        }
        if (o)
        {
            h();
            return;
        } else
        {
            i();
            return;
        }
    }

    public WaterLogEntry f()
    {
        WaterLogEntry waterlogentry = null;
        if (!i.isEmpty())
        {
            waterlogentry = (WaterLogEntry)i.get(i.size() - 1);
        }
        return waterlogentry;
    }

    protected int g()
    {
        return 92;
    }

    public void h()
    {
        View view = getWindow().getDecorView();
        if (view != null && (view instanceof ViewGroup) && view.findViewById(0x7f11047a) == null)
        {
            LayoutInflater.from(this).inflate(0x7f0401bd, (ViewGroup)view);
        }
    }

    public void i()
    {
        View view = getWindow().getDecorView();
        if (view != null && (view instanceof ViewGroup))
        {
            View view1 = view.findViewById(0x7f11047a);
            if (view1 != null)
            {
                ((ViewGroup)view).removeView(view1);
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040053);
        j = ActivityType.f;
        h = findViewById(0x7f11006b);
        bundle = (LoadableListViewFragment)getSupportFragmentManager().findFragmentById(0x7f1101e2);
        bundle.d().a(this);
        bundle.d().a(getResources().getDrawable(0x7f0202cd));
        bundle.d().f(1);
        View view = LayoutInflater.from(this).inflate(0x7f0401e3, bundle.d().j(), false);
        FragmentManager fragmentmanager = getSupportFragmentManager();
        if (fragmentmanager.findFragmentByTag("com.fitbit.water.ui.HEADER_FRAGMENT_TAG") == null)
        {
            WaterBabyChartFragment waterbabychartfragment = WaterBabyChartFragment.f();
            fragmentmanager.beginTransaction().add(0x7f110009, waterbabychartfragment, "com.fitbit.water.ui.HEADER_FRAGMENT_TAG").commit();
        }
        bundle.d().b(view);
        i = new com.fitbit.water.ui.a(this, getSupportLoaderManager(), this);
        bundle.d().a(i);
        getSupportLoaderManager().initLoader(304, a(0, g()), this);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        com.fitbit.e.a.a("WaterListActivity", "onCreateLoader", new Object[0]);
        return a(bundle.getInt("DayListActivity.RANGE"), n);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f120009, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (i1 > 0)
        {
            adapterview = (WaterLogEntry)i.get(i1 - 1);
            view = new Intent(getApplicationContext(), com/fitbit/water/ui/EditWaterEntriesActivity);
            view.putExtra("date", adapterview.getLogDate());
            startActivity(view);
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        com.fitbit.e.a.a("WaterListActivity", "onLoaderReset", new Object[0]);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131821787: 
            menuitem = new Intent(this, com/fitbit/water/ui/AddWaterActivity);
            break;
        }
        menuitem.putExtra("date", com.fitbit.util.o.b().getTime());
        startActivity(menuitem);
        return true;
    }

    public void onRestart()
    {
        super.onRestart();
        n = true;
        getSupportLoaderManager().restartLoader(304, a(0, g()), this);
    }

    public void onResume()
    {
        TimeZone timezone;
        super.onResume();
        timezone = bn.b();
        if (p != null) goto _L2; else goto _L1
_L1:
        p = timezone;
_L4:
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.u);
        FitBitApplication.a().c().a(0x7f11000a).a("Water");
        return;
_L2:
        if (!p.equals(timezone))
        {
            j();
            p = timezone;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
