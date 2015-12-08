// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.daydetails;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.e.a;
import com.fitbit.food.barcode.ui.BarcodeScannerActivity;
import com.fitbit.food.ui.DeleteFoodLogConfirmationDialog;
import com.fitbit.food.ui.landing.e;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.food.ui.logging.QuickCalorieAddActivity;
import com.fitbit.ui.choose.food.ChooseFoodActivity;
import com.fitbit.util.ad;
import java.util.Date;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.fitbit.food.ui.daydetails:
//            FoodLoggingDayDetailsFragment_, FoodLoggingDayDetailsAdapter

public class FoodLoggingDayDetailsFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, com.fitbit.food.ui.DeleteFoodLogConfirmationDialog.a
{

    private static final String f = "FoodLoggingDayDetailsFragment";
    private static final String g = "com.fitbit.food.ui.daydetails.FoodLoggingDayDetailsFragment.DELETE_LOG_DIALOG";
    private static final int h = 0x7f1104da;
    private static final int i = 0x7f1104dc;
    private static final int j = 0x7f1104dd;
    protected View a;
    protected View b;
    protected StickyListHeadersListView c;
    protected Date d;
    protected FoodLoggingDayDetailsAdapter e;
    private com.fitbit.food.barcode.ui.a k;

    public FoodLoggingDayDetailsFragment()
    {
    }

    public static FoodLoggingDayDetailsFragment a(Date date)
    {
        return FoodLoggingDayDetailsFragment_.b().a(date).a();
    }

    protected void a()
    {
        setHasOptionsMenu(true);
        e = new FoodLoggingDayDetailsAdapter(getActivity());
        c.a(e);
        c.a(this);
        c.a(this);
        c.f(0);
        ad.a(getFragmentManager(), "com.fitbit.food.ui.daydetails.FoodLoggingDayDetailsFragment.DELETE_LOG_DIALOG");
        getLoaderManager().initLoader(2, null, this);
        getLoaderManager().initLoader(29, null, k);
    }

    public void a(Loader loader, e e1)
    {
        com.fitbit.e.a.a("FoodLoggingDayDetailsFragment", "onLoadFinished: %s items", new Object[] {
            Integer.valueOf(e1.e().size())
        });
        if (c.getVisibility() != 0)
        {
            a.setVisibility(8);
            c.f(b);
            c.setVisibility(0);
        }
        e.a(e1);
        e.notifyDataSetChanged();
    }

    public void a(e e1)
    {
        e.a(e1);
        e.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = new com.fitbit.food.barcode.ui.a(getActivity());
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
    /* block-local class not found */
    class a {}

        return new a(getActivity(), d);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menuinflater.inflate(0x7f120012, menu);
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
label0:
        {
            adapterview = (FoodLoggingDayDetailsAdapter.a)adapterview.getItemAtPosition(l);
            if (FoodLoggingDayDetailsAdapter.DayDetailsCellType.c == ((FoodLoggingDayDetailsAdapter.a) (adapterview)).a)
            {
                adapterview = (FoodLogEntry)((FoodLoggingDayDetailsAdapter.a) (adapterview)).b;
                if (!adapterview.isQuickCaloriesAdd())
                {
                    break label0;
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
            com.fitbit.e.a.a("FoodLoggingDayDetailsFragment", "Ignore click: food log [%s] does not contain food item.", new Object[] {
                adapterview
            });
            return;
        }
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int l, long l1)
    {
        adapterview = (FoodLoggingDayDetailsAdapter.a)adapterview.getItemAtPosition(l);
        if (FoodLoggingDayDetailsAdapter.DayDetailsCellType.c == ((FoodLoggingDayDetailsAdapter.a) (adapterview)).a)
        {
            adapterview = (FoodLogEntry)((FoodLoggingDayDetailsAdapter.a) (adapterview)).b;
            view = DeleteFoodLogConfirmationDialog.a(this, e.a());
            DeleteFoodLogConfirmationDialog.a(view, adapterview.getEntityId().longValue());
            ad.a(getFragmentManager(), "com.fitbit.food.ui.daydetails.FoodLoggingDayDetailsFragment.DELETE_LOG_DIALOG", view);
        }
        return true;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (e)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (0x7f1104dc == menuitem.getItemId())
        {
            BarcodeScannerActivity.a(this, d);
            return true;
        }
        if (0x7f1104dd == menuitem.getItemId())
        {
            QuickCalorieAddActivity.a(getActivity(), d);
            return true;
        }
        if (0x7f1104da == menuitem.getItemId())
        {
            ChooseFoodActivity.a(getActivity(), d);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f1104dc).setVisible(k.a());
        super.onPrepareOptionsMenu(menu);
    }
}
