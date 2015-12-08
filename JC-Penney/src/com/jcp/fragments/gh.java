// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.location.Address;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.ay;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.a.j;
import com.google.android.gms.maps.GoogleMapOptions;
import com.jcp.JCP;
import com.jcp.activities.StoreDetailsActivity;
import com.jcp.adapters.cw;
import com.jcp.adapters.cz;
import com.jcp.c.e;
import com.jcp.c.n;
import com.jcp.e.ap;
import com.jcp.e.k;
import com.jcp.e.s;
import com.jcp.g.a;
import com.jcp.h.f;
import com.jcp.pojo.ProfilePojo;
import com.jcp.storepickup.pojo.Inventory;
import com.jcp.storepickup.pojo.StorePickUp;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.jcp.util.af;
import com.jcp.util.aj;
import com.jcp.util.au;
import com.jcp.util.bq;
import com.jcp.util.bt;
import com.jcp.util.bv;
import com.jcp.util.u;
import com.jcp.views.HtmlTypefaceTextView;
import com.jcp.views.PagingListView;
import com.jcp.views.z;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.jcp.fragments:
//            s, gi, gj, gk, 
//            gl, gs, gr, gq, 
//            gm, gp, gn, go

public class gh extends com.jcp.fragments.s
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, ap, k, s
{

    private static final String a = com/jcp/fragments/gh.getSimpleName();
    private com.jcp.helper.aa aA;
    private z aB;
    private gs aj;
    private String ak;
    private n al;
    private cw am;
    private String an;
    private gr ao;
    private List ap;
    private List aq;
    private List ar;
    private int as;
    private String at;
    private boolean au;
    private Address av;
    private ProfilePojo aw[];
    private Stores ax;
    private boolean ay;
    private android.widget.TextView.OnEditorActionListener az;
    private EditText b;
    private ImageView c;
    private ProgressBar d;
    private Button e;
    private RelativeLayout f;
    private LinearLayout g;
    private PagingListView h;
    private FrameLayout i;

    public gh()
    {
        ap = new ArrayList();
        aq = new ArrayList();
        ar = new ArrayList();
        at = "";
        az = new gi(this);
        aA = new gj(this);
        aB = new gk(this);
    }

    private void V()
    {
        SharedPreferences sharedpreferences = i().getSharedPreferences("MyPrefsForStore", 0);
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().clear().commit();
        }
    }

    private boolean W()
    {
        return !TextUtils.isEmpty(an) && an.equals("ProductDetailFragment");
    }

    private boolean X()
    {
        return !TextUtils.isEmpty(an) && an.equals("AdsAndCatalogsFragment");
    }

    private Stores Z()
    {
        return (Stores)com.jcp.util.aa.a(i().getSharedPreferences("MyPrefsForStore", 0).getString("storeList", ""), com/jcp/storepickup/pojo/Stores);
    }

    static int a(gh gh1, int i1)
    {
        gh1.as = i1;
        return i1;
    }

    static Address a(gh gh1, Address address)
    {
        gh1.av = address;
        return address;
    }

    static cw a(gh gh1, cw cw1)
    {
        gh1.am = cw1;
        return cw1;
    }

    static String a(gh gh1)
    {
        return gh1.ak;
    }

    static String a(gh gh1, String s1)
    {
        gh1.ak = s1;
        return s1;
    }

    private Map a(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("storeNumber", s1);
        hashmap.put("isDefault", s2);
        return hashmap;
    }

    private void a(Stores stores, List list)
    {
        View view = i().getLayoutInflater().inflate(0x7f03009d, null);
        Object obj = (TextView)view.findViewById(0x7f0e035d);
        TextView textview = (TextView)view.findViewById(0x7f0e04e3);
        ((TextView) (obj)).setText("");
        ((TextView) (obj)).setVisibility(4);
        ((TextView)view.findViewById(0x7f0e01ac)).setText(stores.getName());
        ((TextView)view.findViewById(0x7f0e01ad)).setText(stores.getStreet());
        ((TextView)view.findViewById(0x7f0e01af)).setText(stores.getName());
        view.findViewById(0x7f0e01ae).setVisibility(8);
        obj = stores.getPhone();
        textview.setText(((CharSequence) (obj)));
        textview.setOnClickListener(new gl(this, ((String) (obj))));
        if (!W())
        {
            view.findViewById(0x7f0e035f).setVisibility(8);
            view.findViewById(0x7f0e029b).setVisibility(0);
        } else
        {
            view.findViewById(0x7f0e029b).setVisibility(8);
            bt.a(i(), (HtmlTypefaceTextView)(HtmlTypefaceTextView)view.findViewById(0x7f0e035f), b(list));
        }
        view.setTag(stores);
        ap.add(view);
        h.addHeaderView(view);
    }

    private void a(List list)
    {
        Stores stores = null;
        if (i() == null)
        {
            return;
        }
        am = new cw(i(), list);
        am.b(X());
        if (JCP.s().c())
        {
            stores = Z();
        }
        if (W())
        {
            b(i().getString(0x7f0703b5));
            c(list);
            am.a(true);
        }
        if (stores != null && !X())
        {
            b(i().getString(0x7f070299));
            a(stores, list);
        }
        b(i().getString(0x7f0702a1));
        am.a(aq);
        h.setAdapter(am);
    }

    private void a(List list, List list1)
    {
        if (list == null)
        {
            return;
        }
        f.setVisibility(8);
        g.setVisibility(0);
        if (am == null)
        {
            if (list1 != null && !list1.isEmpty())
            {
                ar.addAll(list1);
                ar.remove(0);
            }
            a(list);
            if (!W())
            {
                ab();
            }
        } else
        {
            am.b(list);
            if (!W() && aj != null)
            {
                aj.a(am.c());
            }
        }
        if (am.c() != null && am.getCount() > 0)
        {
            com.jcp.util.ap.a(i(), am.b(0), false);
            JCP.a(am.b(0));
        }
        if (ar != null && !ar.isEmpty())
        {
            if (as != ar.size())
            {
                h.a(true, null);
                return;
            } else
            {
                h.a(false, null);
                return;
            }
        } else
        {
            h.a(false, null);
            return;
        }
    }

    private void aa()
    {
        b = (EditText)r().findViewById(0x7f0e01a2);
        c = (ImageView)r().findViewById(0x7f0e01a4);
        d = (ProgressBar)r().findViewById(0x7f0e01a5);
        e = (Button)r().findViewById(0x7f0e01a6);
        f = (RelativeLayout)r().findViewById(0x7f0e01a7);
        g = (LinearLayout)r().findViewById(0x7f0e026a);
        i = (FrameLayout)r().findViewById(0x7f0e0317);
        h = (PagingListView)r().findViewById(0x7f0e0318);
        b.setOnEditorActionListener(az);
        c.setOnClickListener(this);
        e.setOnClickListener(this);
        h.setHasMoreItems(true);
        h.setOnItemClickListener(this);
        h.setPagingableListener(aB);
        Typeface typeface;
        if (W())
        {
            e.setText(0x7f070402);
            aq.add("Distance");
            g.removeView(i);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1, 10F);
            h.setLayoutParams(layoutparams);
        } else
        {
            e.setText(0x7f0701d6);
        }
        typeface = Typeface.createFromAsset(i().getAssets(), "fonts/Gotham_Book.ttf");
        e.setTypeface(typeface);
        if (W() || X())
        {
            if (com.jcp.util.ap.e(i()))
            {
                U();
            } else
            {
                ak = com.jcp.util.ap.d(i());
                if (!TextUtils.isEmpty(ak))
                {
                    av = com.jcp.util.aj.a(i(), ak);
                    if (av == null)
                    {
                        Toast.makeText(i(), j().getString(0x7f07005d), 0).show();
                    }
                    b.setText(ak);
                    if (av != null)
                    {
                        al.a(com.jcp.fragments.gr.a(ao), Double.valueOf(av.getLatitude()), Double.valueOf(av.getLongitude()));
                        return;
                    }
                }
            }
        }
    }

    private void ab()
    {
        if (X())
        {
            i().findViewById(0x7f0e0317).setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F);
            i().findViewById(0x7f0e0318).setLayoutParams(layoutparams);
            return;
        } else
        {
            Object obj = new GoogleMapOptions();
            ((GoogleMapOptions) (obj)).i(true);
            ((GoogleMapOptions) (obj)).j(false);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arrayStoreList", (ArrayList)am.c());
            bundle.putParcelable("MapOptions", ((android.os.Parcelable) (obj)));
            aj = new gs();
            aj.g(bundle);
            obj = i().f().a();
            ((ay) (obj)).a(0x7f0e0317, aj);
            ((ay) (obj)).b();
            return;
        }
    }

    private void ac()
    {
        if (com.jcp.util.ap.e(i()))
        {
            U();
            return;
        } else
        {
            com.jcp.util.au.a(i(), this);
            return;
        }
    }

    static Address b(gh gh1)
    {
        return gh1.av;
    }

    private Inventory b(List list)
    {
        Stores stores;
        int i1;
        stores = Z();
        if (list == null || stores == null)
        {
            return null;
        }
        i1 = 0;
_L2:
        Inventory inventory;
        if (i1 >= list.size())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (TextUtils.isEmpty(((Stores)list.get(i1)).getId()) || TextUtils.isEmpty(stores.getId()) || !((Stores)list.get(i1)).getId().equalsIgnoreCase(stores.getId()))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        inventory = new Inventory();
        inventory.setMessage(((Stores)list.get(i1)).getInventory().getMessage());
        inventory.setStatus(((Stores)list.get(i1)).getInventory().getStatus());
        stores.setInventory(inventory);
        if (stores.getInventory() == null)
        {
            list = new Inventory();
            list.setMessage("Not Available");
            list.setStatus("NOTAVAILABLE");
            stores.setInventory(list);
        }
        return stores.getInventory();
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        ae.a("Store List Fragment", (new StringBuilder()).append("IllegalArgumentException while getting entity from array list").append(illegalargumentexception).toString());
        illegalargumentexception.printStackTrace();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b(String s1)
    {
        View view = i().getLayoutInflater().inflate(0x7f030091, null);
        ((TextView)view.findViewById(0x7f0e033a)).setText(s1);
        ap.add(view);
        h.addHeaderView(view);
    }

    static RelativeLayout c(gh gh1)
    {
        return gh1.f;
    }

    private void c(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = h();
        }
        if (bundle1 != null)
        {
            an = bundle1.getString("from");
            if (W())
            {
                bundle = bundle1.getString("PRODNAME");
                String s1 = bundle1.getString("ItemID");
                String s2 = bundle1.getString("IMAGEURL");
                Map map = (Map)bundle1.getSerializable("selected_sku");
                au = bundle1.getBoolean("BOPUS");
                ao = new gr(bundle, s1, map, s2);
                return;
            }
        }
    }

    private void c(String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setMessage(s1);
        builder.setPositiveButton(0x7f070049, new gq(this));
        builder.create().show();
    }

    private void c(List list)
    {
        View view = View.inflate(i(), 0x7f0300b5, null);
        view.findViewById(0x7f0e0390).setVisibility(8);
        ((TextView)view.findViewById(0x7f0e0392)).setText(ao.b());
        ((TextView)view.findViewById(0x7f0e0396)).setText(ao.c());
        Object obj;
        if (!TextUtils.isEmpty(ao.d()) && ao.d().contains(".tif"))
        {
            obj = ao.d().replace(".tif", "");
            Map map;
            Iterator iterator;
            String s1;
            try
            {
                com.jcp.g.a.a().a(((String) (obj))).b(0x7f02017f).a((ImageView)view.findViewById(0x7f0e0398));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ae.a("Store List Fragment", "url string is empty");
            }
        }
        obj = (HtmlTypefaceTextView)view.findViewById(0x7f0e0397);
        map = ao.a();
        if (map != null && map.size() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (iterator = map.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append(bv.b(s1.replace("_", " "))).append(" : <b>").append((String)map.get(s1)).append("</b><br>").toString()))
            {
                s1 = (String)iterator.next();
            }

            ((HtmlTypefaceTextView) (obj)).setHtmlText(stringbuilder.toString());
        }
        ((TextView)view.findViewById(0x7f0e0399)).setText((new StringBuilder()).append(a(0x7f070451)).append(bq.a(list, false)).toString());
        ap.add(view);
        h.addHeaderView(view);
    }

    static ProgressBar d(gh gh1)
    {
        return gh1.d;
    }

    static LinearLayout e(gh gh1)
    {
        return gh1.g;
    }

    static List f(gh gh1)
    {
        return gh1.ar;
    }

    static cw g(gh gh1)
    {
        return gh1.am;
    }

    static List h(gh gh1)
    {
        return gh1.aq;
    }

    static boolean i(gh gh1)
    {
        return gh1.W();
    }

    static PagingListView j(gh gh1)
    {
        return gh1.h;
    }

    static List k(gh gh1)
    {
        return gh1.ap;
    }

    static gr l(gh gh1)
    {
        return gh1.ao;
    }

    static n m(gh gh1)
    {
        return gh1.al;
    }

    static boolean n(gh gh1)
    {
        return gh1.X();
    }

    static ImageView o(gh gh1)
    {
        return gh1.c;
    }

    static EditText p(gh gh1)
    {
        return gh1.b;
    }

    static int q(gh gh1)
    {
        int i1 = gh1.as;
        gh1.as = i1 + 1;
        return i1;
    }

    static com.jcp.helper.aa r(gh gh1)
    {
        return gh1.aA;
    }

    static gs s(gh gh1)
    {
        return gh1.aj;
    }

    protected f S()
    {
        return com.jcp.h.f.b(ak);
    }

    protected String T()
    {
        if (W())
        {
            return "MOBILE|FindInStores";
        } else
        {
            return "MOBILE|Customerservice";
        }
    }

    public void U()
    {
        d.setVisibility(0);
        c.setVisibility(4);
        O();
        aj aj1 = new aj(i());
        aj1.a(new gm(this));
        aj1.a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        return layoutinflater.inflate(0x7f030083, viewgroup, false);
    }

    protected String a()
    {
        if (W())
        {
            return "Find Item In Store";
        } else
        {
            return "Store Locator Menu";
        }
    }

    public void a(int i1, int j1, Intent intent)
    {
        super.a(i1, j1, intent);
        i1;
        JVM INSTR tableswitch 110 110: default 28
    //                   110 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 == -1)
        {
            intent = am.b();
            if (h != null)
            {
                for (i1 = 0; i1 < ap.size(); i1++)
                {
                    h.removeHeaderView((View)ap.get(i1));
                }

            }
            if (intent != null)
            {
                a(((List) (intent)));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(StorePickUp storepickup, int i1)
    {
        while (i() == null || storepickup == null) 
        {
            return;
        }
        a(storepickup.getStores(), storepickup.getPages());
    }

    public void a(StorePickUp storepickup, int i1, String s1)
    {
        while (i() == null || !n() || storepickup == null) 
        {
            return;
        }
        if (storepickup.getStores().isEmpty())
        {
            com.jcp.util.k.a(i(), 0x7f0702ac, 0x7f0702ab);
            return;
        } else
        {
            a(storepickup.getStores(), storepickup.getPages());
            return;
        }
    }

    public void a(String s1, int i1)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (i1 == 32 || i1 == 33)
        {
            c(s1);
            return;
        }
        if (!TextUtils.isEmpty(s1) && "Store not found.".equalsIgnoreCase(s1))
        {
            com.jcp.util.k.a(i(), 0x7f0701bb, 0x7f070464);
            return;
        } else
        {
            com.jcp.util.k.a(i(), 0x7f0701bb, 0x7f0702b5);
            return;
        }
    }

    public void a(ProfilePojo aprofilepojo[], int i1)
    {
        boolean flag = false;
        if (i() != null && n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        SharedPreferences sharedpreferences = i().getSharedPreferences("MyPrefsForStore", 0);
        if (i1 == 33)
        {
            aprofilepojo = sharedpreferences.edit();
            aprofilepojo.remove("storeList");
            aprofilepojo.commit();
            if (ay)
            {
                aprofilepojo = a(ax.getId(), "true");
                e e1 = new e(i());
                e1.a(this);
                e1.a(aprofilepojo, ax.getId());
                ay = false;
                return;
            } else
            {
                ax.setSaved(false);
                am.notifyDataSetChanged();
                return;
            }
        }
        aw = aprofilepojo;
        if (aprofilepojo != null && aprofilepojo.length > 0)
        {
            i1 = ((flag) ? 1 : 0);
            while (i1 < aprofilepojo.length) 
            {
                String s1 = aprofilepojo[i1].getIsDefault();
                if (s1 != null && !s1.isEmpty() && "true".equalsIgnoreCase(s1))
                {
                    String s2 = aprofilepojo[i1].getId();
                    e e2 = new e(i());
                    e2.a(this);
                    e2.b(s2);
                }
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a_(List list, int i1)
    {
    }

    public void b()
    {
        if (au)
        {
            a(a(0x7f0700e9));
        } else
        {
            a(a(0x7f07025e));
        }
        super.b();
    }

    public void b(int i1)
    {
        h.clearFocus();
        h.post(new gp(this, i1));
    }

    public void b(StorePickUp storepickup, int i1)
    {
    }

    public void b(String s1, int i1)
    {
        while (i() == null || !n() || !TextUtils.isEmpty(s1)) 
        {
            return;
        }
        V();
        ax.setSaved(true);
        s1 = i().getSharedPreferences("MyPrefsForStore", 0).edit();
        s1.putString("storeList", (new j()).a(ax));
        s1.commit();
        am.notifyDataSetChanged();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        c(bundle);
        if (au)
        {
            a(i().getString(0x7f0700e9), i());
        } else
        {
            a(i().getString(0x7f070263), i());
        }
        al = new n(i());
        al.a(this);
        aa();
    }

    public void onClick(View view)
    {
        if (view != e) goto _L2; else goto _L1
_L1:
        if (am != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if (W())
        {
            view = new u(i(), view);
            view.a(aq);
            view.a(am.d(), new gn(this));
            return;
        } else
        {
            view = new u(i(), view);
            view.a(aq);
            view.a(am.d(), new go(this));
            return;
        }
_L2:
        if (view == c)
        {
            if (au)
            {
                ac();
                return;
            } else
            {
                U();
                return;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        Stores stores;
        adapterview = new ArrayList();
        adapterview.addAll(am.c());
        stores = Z();
        ax = (Stores)adapterview.get(i1 - 1);
        if (!X()) goto _L2; else goto _L1
_L1:
        if (stores != null && (stores == null || stores.getId().equals(ax.getId()))) goto _L4; else goto _L3
_L3:
        if (!JCP.s().c()) goto _L6; else goto _L5
_L5:
        if (stores != null) goto _L8; else goto _L7
_L7:
        adapterview = a(ax.getId(), "true");
        view = new e(i());
        view.a(this);
        view.a(adapterview, ax.getId());
_L10:
        return;
_L8:
        ay = true;
        adapterview = new e(i());
        adapterview.a(this);
        adapterview.a();
        return;
_L6:
        V();
        adapterview = i().getSharedPreferences("MyPrefsForStore", 0).edit();
        adapterview.putString("storeList", (new j()).a(ax));
        adapterview.commit();
        am.notifyDataSetChanged();
        return;
_L4:
        if (stores != null && stores.getId().equals(ax.getId()))
        {
            if (JCP.s().c())
            {
                adapterview = new e(i());
                adapterview.a(this);
                adapterview.a();
                return;
            } else
            {
                V();
                am.notifyDataSetChanged();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!(view.getTag() instanceof Stores))
        {
            continue; /* Loop/switch isn't completed */
        }
        StoreDetailsActivity.a((Stores)view.getTag());
        at = "fromheader";
_L11:
        if (stores != null)
        {
            adapterview.add(0, stores);
        }
        StoreDetailsActivity.a(adapterview);
        adapterview = new Intent(i(), com/jcp/activities/StoreDetailsActivity);
        adapterview.putExtra("fromlisttype", at);
        a(adapterview, 110);
        return;
        if (!(view.getTag() instanceof cz)) goto _L10; else goto _L9
_L9:
        StoreDetailsActivity.a((Stores)view.findViewById(0x7f0e035d).getTag());
        at = "fromlist";
          goto _L11
        if (true) goto _L10; else goto _L12
_L12:
    }

    public void s()
    {
        com.jcp.util.ap.a(true, i());
        U();
    }

    public void t()
    {
        com.jcp.util.ap.a(false, i());
    }

}
