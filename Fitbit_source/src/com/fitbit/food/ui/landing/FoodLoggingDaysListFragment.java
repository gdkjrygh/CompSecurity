// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.landing;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.food.barcode.ui.BarcodeScannerActivity;
import com.fitbit.food.ui.DeleteFoodLogConfirmationDialog;
import com.fitbit.food.ui.daydetails.FoodLoggingDayDetailsActivity;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.food.ui.logging.QuickCalorieAddActivity;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.ui.c.b;
import com.fitbit.ui.charts.OnboardingCellView;
import com.fitbit.ui.choose.food.ChooseFoodActivity;
import com.fitbit.ui.endless.DaysListFragment;
import com.fitbit.ui.endless.EndlessStickyHeadersListView;
import com.fitbit.ui.endless.a;
import com.fitbit.ui.endless.d;
import com.fitbit.util.ad;
import com.fitbit.util.bi;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.fitbit.food.ui.landing:
//            FoodLoggingDaysListFragment_, c, FoodLoggingStickyHeaderView, FoodLoggingSevenDaysHeaderFragment_, 
//            e, f

public class FoodLoggingDaysListFragment extends DaysListFragment
    implements android.widget.AdapterView.OnItemLongClickListener, com.fitbit.food.ui.DeleteFoodLogConfirmationDialog.a, se.emilsjolander.stickylistheaders.StickyListHeadersListView.d
{

    public static final String a = "FoodLoggingDaysListFragment";
    private static final String b = "Details Screen - FOOD";
    private static final String c = "com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.HEADER_FRAGMENT_TAG";
    private static final String h = "com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.DELETE_LOG_DIALOG";
    private static final int i = 3;
    private static final int j = 7;
    private b k;
    private int l;
    private boolean m;
    private FoodLoggingStickyHeaderView n;
    private com.fitbit.food.barcode.ui.a o;

    public FoodLoggingDaysListFragment()
    {
        l = 0;
        m = false;
        n = null;
    }

    public static FoodLoggingDaysListFragment g()
    {
        return FoodLoggingDaysListFragment_.k().a();
    }

    private Date k()
    {
        return new Date();
    }

    private c o()
    {
        return (c)g;
    }

    private void p()
    {
        if (k != null)
        {
            k.a();
            m = true;
        }
    }

    private void q()
    {
        View view2 = getView();
        View view1 = null;
        View view = view2;
        if (view2 != null)
        {
            view = view2.getRootView();
            view1 = view.findViewById(0x7f1104da);
        }
        if (k != null)
        {
            k.a(view, view1);
        }
    }

    protected a a()
    {
        return new c(getActivity());
    }

    public void a(int i1)
    {
        b(i1);
    }

    public void a(Loader loader, d d1)
    {
        super.a(loader, d1);
        if (d1.b().size() == 0)
        {
            if (!m)
            {
                l = l + 1;
            }
        } else
        {
            m = true;
        }
        if (l > 0 && l % 2 == 0 && !m)
        {
            q();
        }
        if (g.size() == 0 && d1 != null && d1.c() && d1.b().isEmpty())
        {
            g.addAll(d1.b());
            g.notifyDataSetChanged();
        }
    }

    public void a(e e1)
    {
        e e2 = o().a();
        if (e2 != null)
        {
            int i1 = g.indexOf(e2);
            if (i1 >= 0)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.addAll(g);
                g.clear();
                arraylist.set(i1, e1);
                g.addAll(arraylist);
                g.notifyDataSetChanged();
            }
        }
    }

    public void a(StickyListHeadersListView stickylistheaderslistview, View view, int i1, long l1)
    {
label0:
        {
            view.setBackgroundColor(getActivity().getResources().getColor(0x7f0f015c));
            if (view != n)
            {
                if (n != null)
                {
                    n.setSelected(false);
                }
                if (!(view instanceof FoodLoggingStickyHeaderView) || l1 == 0L)
                {
                    break label0;
                }
                n = (FoodLoggingStickyHeaderView)view;
                n.setSelected(true);
            }
            return;
        }
        n = null;
    }

    protected View b()
    {
        LinearLayout linearlayout = new LinearLayout(getActivity());
        linearlayout.setOrientation(1);
        FrameLayout framelayout = new FrameLayout(getActivity());
        framelayout.setId(0x7f110009);
        FragmentManager fragmentmanager = getChildFragmentManager();
        if (fragmentmanager.findFragmentByTag("com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.HEADER_FRAGMENT_TAG") == null)
        {
            FoodLoggingSevenDaysHeaderFragment foodloggingsevendaysheaderfragment = com.fitbit.food.ui.landing.FoodLoggingSevenDaysHeaderFragment_.b().a();
            fragmentmanager.beginTransaction().add(framelayout.getId(), foodloggingsevendaysheaderfragment, "com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.HEADER_FRAGMENT_TAG").commit();
        }
        linearlayout.addView(framelayout);
        if (UISavedState.a(com.fitbit.ui.charts.OnboardingCellView.TileType.d))
        {
            OnboardingCellView onboardingcellview = OnboardingCellView.a(getActivity());
            onboardingcellview.a(com.fitbit.ui.charts.OnboardingCellView.TileType.d);
            linearlayout.addView(onboardingcellview);
        }
        return linearlayout;
    }

    protected bi b(int i1, int j1)
    {
        com.fitbit.e.a.a("FoodLoggingDaysListFragment", "createLoader for startPosition = %s, range = %s", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        });
        Date date = com.fitbit.util.o.f();
        e e1 = (e)m();
        if (e1 != null)
        {
            date = new Date(e1.f().getTime() - 0x5265c00L);
        }
        i1 = g.size();
        return new f(getActivity(), i1, j1, date);
    }

    public void c()
    {
        f.a(this);
        f.a(this);
        f.f(0);
        setHasOptionsMenu(true);
        k = new b(getActivity(), 0x7f08051a);
        ad.a(getFragmentManager(), "com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.DELETE_LOG_DIALOG");
        o = new com.fitbit.food.barcode.ui.a(getActivity());
        getLoaderManager().initLoader(29, null, o);
    }

    protected void d()
    {
        p();
        ChooseFoodActivity.a(getActivity(), k());
    }

    protected void e()
    {
        p();
        BarcodeScannerActivity.a(this, k());
    }

    protected void f()
    {
        p();
        QuickCalorieAddActivity.a(getActivity(), k());
    }

    protected int h()
    {
        return 3;
    }

    protected int i()
    {
        return 7;
    }

    public void j()
    {
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
label0:
        {
label1:
            {
                adapterview = (e)adapterview.getItemAtPosition(i1);
                if (adapterview != null)
                {
                    if (!com.fitbit.util.o.i(adapterview.f()))
                    {
                        break label0;
                    }
                    adapterview = (FoodLogEntry)adapterview.e().get(0);
                    if (!adapterview.isQuickCaloriesAdd())
                    {
                        break label1;
                    }
                    QuickCalorieAddActivity.a(getActivity(), adapterview);
                }
                return;
            }
            if (adapterview.getFoodItem() != null)
            {
                LogFoodActivity.a(getActivity(), adapterview);
                return;
            } else
            {
                com.fitbit.e.a.a("FoodLoggingDaysListFragment", "Ignore click: food log [%s] does not contain food item.", new Object[] {
                    adapterview
                });
                return;
            }
        }
        com.fitbit.e.a.a("FoodLoggingDaysListFragment", "Open day info", new Object[0]);
        FoodLoggingDayDetailsActivity.a(getActivity(), adapterview.f());
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (e)adapterview.getItemAtPosition(i1);
        if (adapterview != null && com.fitbit.util.o.i(adapterview.f()))
        {
            adapterview = (FoodLogEntry)adapterview.e().get(0);
            view = DeleteFoodLogConfirmationDialog.a(this, o().a());
            DeleteFoodLogConfirmationDialog.a(view, adapterview.getEntityId().longValue());
            ad.a(getFragmentManager(), "com.fitbit.food.ui.landing.FoodLoggingDaysListFragment.DELETE_LOG_DIALOG", view);
        }
        return true;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        MenuItem menuitem = menu.findItem(0x7f1104dc);
        if (menuitem != null)
        {
            menuitem.setVisible(o.a());
        }
        super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        r.a().c();
        if (g.size() != 0)
        {
            g = a();
            f.a(g);
            n();
        }
        FitBitApplication.a().c().a(0x7f11000a).a("Details Screen - FOOD");
    }
}
