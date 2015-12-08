// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.location.Address;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.adapters.PickUpFromStoreAdapter;
import com.jcp.c.n;
import com.jcp.e.k;
import com.jcp.e.s;
import com.jcp.helper.aa;
import com.jcp.storepickup.pojo.Items;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.aj;
import com.jcp.util.ap;
import com.jcp.util.au;
import com.jcp.util.bq;
import com.jcp.util.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            an, bo, bp, bq, 
//            bn

public class SelectPickUpStoreActivity extends an
    implements android.widget.AbsListView.OnScrollListener, k, s
{

    private static View h;
    private boolean a;
    protected TextView address;
    private String b;
    private PickUpFromStoreAdapter c;
    private n d;
    protected TextView distance;
    private int e;
    protected RelativeLayout emptyview;
    private int f;
    private int g;
    private boolean i;
    protected TextView inventorystat;
    private int j;
    private boolean k;
    private List l;
    protected ListView lvnearbystores;
    private List m;
    protected ImageView mLocationView;
    protected ProgressBar mProgressBar;
    protected EditText mSearchView;
    private android.widget.TextView.OnEditorActionListener n;
    protected TextView name;
    protected TextView nearbystoresstat;
    private aa o;
    protected RelativeLayout rlselectedstore;
    protected View separatorviewbottom;
    protected View separatorviewtop;
    protected Button sort;
    protected TextView street;
    protected TextView tvselectedstore;

    public SelectPickUpStoreActivity()
    {
        j = 5;
        m = new ArrayList();
        n = new bo(this);
        o = new bp(this);
    }

    static PickUpFromStoreAdapter a(SelectPickUpStoreActivity selectpickupstoreactivity, PickUpFromStoreAdapter pickupfromstoreadapter)
    {
        selectpickupstoreactivity.c = pickupfromstoreadapter;
        return pickupfromstoreadapter;
    }

    static String a(SelectPickUpStoreActivity selectpickupstoreactivity, String s1)
    {
        selectpickupstoreactivity.b = s1;
        return s1;
    }

    static List a(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        return selectpickupstoreactivity.m;
    }

    static void a(SelectPickUpStoreActivity selectpickupstoreactivity, String s1, boolean flag, int i1)
    {
        selectpickupstoreactivity.a(s1, flag, i1);
    }

    private void a(String s1, boolean flag, int i1)
    {
        s1 = aj.a(this, s1);
        if (s1 != null)
        {
            d.a(Double.valueOf(s1.getLatitude()), Double.valueOf(s1.getLongitude()), Boolean.valueOf(flag), i1);
            return;
        } else
        {
            Toast.makeText(this, getResources().getString(0x7f07005d), 0).show();
            return;
        }
    }

    private void a(List list)
    {
        if (list == null)
        {
            return;
        }
        emptyview.setVisibility(8);
        lvnearbystores.setVisibility(0);
        lvnearbystores.setVisibility(0);
        inventorystat.setVisibility(0);
        nearbystoresstat.setVisibility(0);
        inventorystat.setText((new StringBuilder()).append(getResources().getString(0x7f070243)).append(bq.a(list, true)).toString());
        a = false;
        k = false;
        Map map = JCP.q();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            for (int j1 = 0; j1 < ((Stores)list.get(i1)).getItems().size(); j1++)
            {
                String s1 = (String)map.get(((Items)((Stores)list.get(i1)).getItems().get(j1)).getId());
                if (s1 != null)
                {
                    ((Items)((Stores)list.get(i1)).getItems().get(j1)).setImageUrl(s1);
                }
            }

        }

        if (c == null)
        {
            b(list);
            return;
        } else
        {
            c.b(list);
            return;
        }
    }

    static PickUpFromStoreAdapter b(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        return selectpickupstoreactivity.c;
    }

    private void b(List list)
    {
        l = list;
        c = new PickUpFromStoreAdapter(this, list);
        c.a(m);
        lvnearbystores.setAdapter(c);
        if (!i)
        {
            lvnearbystores.removeFooterView(h);
        }
    }

    static void c(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        selectpickupstoreactivity.k();
    }

    static String d(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        return selectpickupstoreactivity.b;
    }

    static boolean e(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        return selectpickupstoreactivity.k;
    }

    static aa f(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        return selectpickupstoreactivity.o;
    }

    static n g(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        return selectpickupstoreactivity.d;
    }

    private void g()
    {
        ButterKnife.inject(this);
        sort.setText(0x7f070402);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Gotham_Book.ttf");
        sort.setTypeface(typeface);
        if (!i)
        {
            h = ((LayoutInflater)getSystemService("layout_inflater")).inflate(0x7f03009f, null, false);
            lvnearbystores.addFooterView(h);
        }
        h();
    }

    private void h()
    {
        mSearchView.setOnEditorActionListener(n);
        lvnearbystores.setOnScrollListener(this);
        lvnearbystores.setVisibility(8);
        i();
    }

    private void i()
    {
        d = new n(this);
        d.a(this);
        j();
    }

    private void j()
    {
        if (ap.c(this))
        {
            Stores stores = ap.a(this);
            name.setText(stores.getName());
            street.setText(stores.getStreet());
            String s1 = String.format("%s, %s, %s", new Object[] {
                stores.getCity(), stores.getState(), stores.getZip()
            });
            address.setText(s1);
            distance.setText(String.format(getString(0x7f070175), new Object[] {
                stores.getDistance()
            }));
        } else
        {
            tvselectedstore.setVisibility(8);
            separatorviewtop.setVisibility(8);
            rlselectedstore.setVisibility(8);
            separatorviewbottom.setVisibility(8);
        }
        inventorystat.setVisibility(8);
        nearbystoresstat.setVisibility(8);
    }

    private void k()
    {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(mSearchView.getWindowToken(), 0);
    }

    private void l()
    {
label0:
        {
label1:
            {
                if (f > 0 && g == 0)
                {
                    if (e + f < j || e + f >= l.size())
                    {
                        break label0;
                    }
                    if (a)
                    {
                        break label1;
                    }
                    a = true;
                    m();
                }
                return;
            }
            lvnearbystores.removeFooterView(h);
            return;
        }
        lvnearbystores.removeFooterView(h);
    }

    private void m()
    {
        j = j + 5;
        k = true;
        lvnearbystores.addFooterView(h);
        a(b, k, j);
    }

    protected String a()
    {
        return "SELECTPICKUPSTORE";
    }

    public void a(StorePickUp storepickup, int i1)
    {
    }

    public void a(StorePickUp storepickup, int i1, String s1)
    {
    }

    public void a(String s1, int i1)
    {
    }

    public void b(StorePickUp storepickup, int i1)
    {
label0:
        {
            if (storepickup != null)
            {
                if (!storepickup.getStores().isEmpty())
                {
                    break label0;
                }
                com.jcp.util.k.a(this, 0x7f0702ac, 0x7f0702ab);
            }
            return;
        }
        ap.a(this, b);
        a(storepickup.getStores());
    }

    public void c()
    {
        mProgressBar.setVisibility(0);
        mLocationView.setVisibility(4);
        k();
        aj aj1 = new aj(this);
        aj1.a(new com.jcp.activities.bq(this));
        aj1.a();
    }

    void loadZipCode()
    {
        if (ap.e(this))
        {
            c();
            return;
        } else
        {
            au.a(this, this);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f03002e);
        g();
        if (ap.e(this))
        {
            c();
        } else
        if (ap.d(this) != null)
        {
            b = ap.d(this);
            mSearchView.setText(b);
            c = null;
            k();
            a(b, k, 5);
            return;
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        e = i1;
        f = j1;
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        g = i1;
        l();
    }

    public void s()
    {
        ap.a(true, this);
        c();
    }

    void sortList(View view)
    {
        if (c == null)
        {
            return;
        } else
        {
            view = new u(this, view);
            view.a(m);
            view.a(c.a(), new bn(this));
            return;
        }
    }

    public void t()
    {
        ap.a(false, this);
    }
}
