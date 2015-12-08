// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aj;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.crittercism.app.Crittercism;
import com.crittercism.app.CrittercismConfig;
import com.jcp.JCP;
import com.jcp.adapters.ProductCategoriesAdapter;
import com.jcp.adapters.ay;
import com.jcp.adapters.cn;
import com.jcp.b.a;
import com.jcp.c.aa;
import com.jcp.c.ad;
import com.jcp.c.af;
import com.jcp.c.d;
import com.jcp.c.h;
import com.jcp.c.l;
import com.jcp.e;
import com.jcp.e.ae;
import com.jcp.e.ag;
import com.jcp.e.ai;
import com.jcp.e.ak;
import com.jcp.e.al;
import com.jcp.e.b;
import com.jcp.e.j;
import com.jcp.e.s;
import com.jcp.e.t;
import com.jcp.e.u;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.JCPCreateAccountFragment;
import com.jcp.fragments.LocalAdsCatalogsFragment;
import com.jcp.fragments.ProductDetailFragment;
import com.jcp.fragments.ShoppingBagFragment;
import com.jcp.fragments.SignInFragment;
import com.jcp.fragments.ac;
import com.jcp.fragments.ah;
import com.jcp.fragments.as;
import com.jcp.fragments.bh;
import com.jcp.fragments.el;
import com.jcp.fragments.et;
import com.jcp.fragments.fd;
import com.jcp.fragments.ff;
import com.jcp.fragments.fz;
import com.jcp.fragments.gh;
import com.jcp.fragments.gt;
import com.jcp.fragments.rewards.RewardsConfirmationFragment;
import com.jcp.fragments.rewards.RewardsConnectAccountsSignInToJCPFragment;
import com.jcp.fragments.rewards.RewardsConnectAccountsSignInToRewardsFragment;
import com.jcp.fragments.rewards.RewardsEnrollFragment;
import com.jcp.fragments.rewards.RewardsEnrollOptionalInfoFragment;
import com.jcp.fragments.rewards.RewardsLandingFragment;
import com.jcp.helper.ab;
import com.jcp.model.Session;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.pojo.Profile;
import com.jcp.pojo.SavedItems;
import com.jcp.pojo.SearchHistory;
import com.jcp.productcategories.modal.Modal;
import com.jcp.searchentity.SearchSuggestionsEntityContainer;
import com.jcp.settings.model.AndroidAppSettings;
import com.jcp.settings.model.JCPSettings;
import com.jcp.util.DownloadService;
import com.jcp.util.ap;
import com.jcp.util.au;
import com.jcp.util.bk;
import com.jcp.util.bn;
import com.jcp.util.bo;
import com.jcp.util.bp;
import com.jcp.util.g;
import com.jcp.util.k;
import com.jcp.widget.JCPActionBar;
import com.jcp.widget.i;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.activities:
//            ao, aj, VisualSearchTutorialActivity, SlyceScanActivity, 
//            am, af, ag, ah, 
//            ai, ak, GiftCardActivity

public class MainActivity extends ao
    implements android.widget.AdapterView.OnItemClickListener, ae, ag, ai, ak, al, b, j, s, t, u, com.jcp.fragments.t
{

    public static final String i = com/jcp/activities/MainActivity.getSimpleName();
    private static final List j = new ArrayList();
    private static boolean k;
    private String A;
    private final Map B = new HashMap();
    private String C;
    private String D;
    private Bundle E;
    private int F;
    private boolean G;
    private String H;
    private boolean I;
    private android.support.v4.app.al J;
    private List K;
    private boolean L;
    private com.jcp.widget.g l;
    private android.support.v4.app.a m;
    protected DrawerLayout mDrawerLayout;
    protected ListView mDrawerList;
    protected ImageView mScan;
    protected EditText mSearchEditText;
    protected RelativeLayout mSearchInclude;
    protected LinearLayout mSearchLayout;
    protected LinearLayout mSearchSuggestionLayout;
    protected ListView mSearchSuggestionsListView;
    protected TextView mSearchTextView;
    protected LinearLayout mSlideMenuRootLayout;
    private JCPActionBar n;
    private boolean o;
    private ay p;
    private final List q = new ArrayList();
    private ProductCategoriesAdapter r;
    private int s;
    protected ListView sDepartmentListView;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private boolean y;
    private String z;

    public MainActivity()
    {
        z = "";
        A = "";
        I = true;
        K = new ArrayList(10);
    }

    private void B()
    {
        mDrawerList.setVisibility(0);
        sDepartmentListView.setVisibility(8);
    }

    private void C()
    {
        Object obj = getIntent();
        if (obj != null)
        {
            String s1 = ((Intent) (obj)).getAction();
            obj = ((Intent) (obj)).getDataString();
            if ("android.intent.action.VIEW".equalsIgnoreCase(s1) && obj != null)
            {
                (new d(this, this, ((String) (obj)))).a();
            }
        }
    }

    private void D()
    {
label0:
        {
            if (E.getBoolean("fromshoppingbag", false) && !com.jcp.b.b.s && !G)
            {
                if (E.getBundle("ADDTOCARTBUNDLE") == null)
                {
                    break label0;
                }
                c(7, "drawer");
            }
            return;
        }
        if (E.getBoolean("fromshoppingbagFindCoupon", false))
        {
            c(2, "drawer");
            return;
        } else
        {
            c(1, "drawer");
            return;
        }
    }

    private void E()
    {
        G = E.getBoolean("forSessionInvalidLaunch", false);
        if (G)
        {
            m(getResources().getString(0x7f0703f9));
            c(0, "popupmenu");
        }
    }

    private void F()
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        G();
        int i1;
        int j1;
        int k1;
        i1 = Integer.parseInt(z);
        j1 = Integer.parseInt(A);
        k1 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
label0:
        {
            {
                if (k1 >= j1)
                {
                    break label0;
                }
                try
                {
                    a(0);
                }
                catch (NumberFormatException numberformatexception)
                {
                    com.jcp.util.ae.d(i, "Invalid version returned from settings, ignoring");
                    flag = flag1;
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    com.jcp.util.ae.d(i, "Catching Package Manager, package name not found");
                    flag = flag1;
                }
            }
            if (flag)
            {
                aa();
            }
            return;
        }
        if (k1 >= i1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        a(1);
        continue;
        for (flag = true; false;)
        {
        }

        break MISSING_BLOCK_LABEL_55;
    }

    private void G()
    {
        JCPSettings jcpsettings = JCP.f();
        if (jcpsettings != null)
        {
            z = jcpsettings.getAndroidApp().getCurrentVersion();
            A = jcpsettings.getAndroidApp().getMinimumVersion();
        }
    }

    private void H()
    {
        af.b(this).a(JCP.f().getRewards());
    }

    private void I()
    {
        String s1 = getPackageName();
        try
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s1).toString())));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception1) { }
        try
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("https://play.google.com/store/apps/details?id=").append(s1).toString())));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            com.jcp.util.ae.a(i, "ActivityNotFoundException caught", activitynotfoundexception);
        }
    }

    private void J()
    {
        com.jcp.fragments.ez ez = ap.c();
        if (ez != null)
        {
            b(ez, "InternalPromoFragment");
            return;
        } else
        {
            (new h(this)).a();
            return;
        }
    }

    private void K()
    {
        com.jcp.b.a.c(true);
        aa aa1 = new aa(this);
        aa1.a(this);
        aa1.d();
    }

    private SharedPreferences L()
    {
        return getSharedPreferences("com.jcp.activities", 0);
    }

    private void M()
    {
        g g1 = com.jcp.util.g.a();
        Object obj;
        List list;
        obj = getResources();
        j.clear();
        j.add(new Modal(((Resources) (obj)).getString(0x7f070211)));
        list = g1.a("depth0");
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        Modal modal;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); q.add(modal.getName()))
        {
            modal = (Modal)iterator.next();
        }

        break MISSING_BLOCK_LABEL_116;
        obj;
        g1.close();
        throw obj;
        j.add(new Modal(((Resources) (obj)).getString(0x7f070215)));
        j.addAll(list);
        j.add(new Modal(((Resources) (obj)).getString(0x7f070212)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f07020d)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f07020c)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f070214)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f07020f)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f070210)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f070213)));
        j.add(new Modal(((Resources) (obj)).getString(0x7f07020e)));
        g1.close();
        return;
    }

    private void N()
    {
        l = new com.jcp.widget.g(this);
        sDepartmentListView.setOnItemClickListener(this);
        n = new JCPActionBar(this);
        Object obj = new Point();
        getWindowManager().getDefaultDisplay().getSize(((Point) (obj)));
        mSearchSuggestionsListView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, ((Point) (obj)).y));
        obj = new ab(this, this, mSearchEditText);
        mSearchEditText.addTextChangedListener(((android.text.TextWatcher) (obj)));
        mSearchEditText.setOnEditorActionListener(((android.widget.TextView.OnEditorActionListener) (obj)));
        obj = mScan;
        int i1;
        if (O())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((ImageView) (obj)).setVisibility(i1);
    }

    private boolean O()
    {
        return getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera") && Camera.getNumberOfCameras() > 0;
    }

    private String P()
    {
        int i1 = f().e();
        if (i1 > 0)
        {
            return f().a(i1 - 1).c();
        } else
        {
            return null;
        }
    }

    private String Q()
    {
        int i1 = f().e();
        if (i1 > 1)
        {
            return f().a(i1 - 1 - 1).c();
        } else
        {
            return null;
        }
    }

    private void R()
    {
        mDrawerList.setOnItemClickListener(this);
        mDrawerList.addFooterView(new i(this));
        p = new ay(this, j);
        mDrawerList.setAdapter(p);
        m = new com.jcp.activities.aj(this, this, mDrawerLayout, 0x7f02012a, 0x7f070080, 0);
        mDrawerLayout.setDrawerListener(m);
    }

    private void S()
    {
        if (mDrawerLayout.f(0x800003))
        {
            mDrawerLayout.i(mSlideMenuRootLayout);
        }
    }

    private void T()
    {
        mSearchInclude.setVisibility(8);
    }

    private void U()
    {
        mSearchInclude.setVisibility(0);
    }

    private void V()
    {
        if (L().getBoolean("keep_me_signin", false))
        {
            Profile profile = bk.a(this);
            if (profile != null)
            {
                l l1 = new l(this);
                l1.a(true);
                l1.a(this);
                l1.a(com.jcp.b.b.x(), ad.a(profile.getUsername(), profile.getPassword()), 1);
            }
        }
    }

    private void W()
    {
        if (!getSharedPreferences("com.jcp.activities", 0).getBoolean("gotIt", false))
        {
            startActivityForResult(new Intent(this, com/jcp/activities/VisualSearchTutorialActivity), 400);
            return;
        } else
        {
            startActivityForResult(new Intent(this, com/jcp/activities/SlyceScanActivity), 201);
            return;
        }
    }

    private void X()
    {
        mSearchEditText.requestFocus();
        ((InputMethodManager)getSystemService("input_method")).showSoftInput(mSearchEditText, 1);
        mSearchSuggestionLayout.setVisibility(0);
        mSearchLayout.setVisibility(8);
        List list = SearchHistory.getInstance(this).getSearchHistory();
        if (!list.isEmpty())
        {
            b(list);
            mSearchSuggestionsListView.setVisibility(0);
        }
    }

    private void Y()
    {
        J = new am(this);
    }

    private void Z()
    {
        k(null);
        c(new SignInFragment(), "SignInFragment");
        com.jcp.b.a.c(this, getString(0x7f07027b));
    }

    private List a(List list, int i1)
    {
        ArrayList arraylist;
        int j1;
        arraylist = new ArrayList();
        j1 = 0;
_L2:
        if (j1 < s)
        {
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            try
            {
                arraylist.add(list.get(j1));
                break MISSING_BLOCK_LABEL_88;
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
            // Misplaced declaration of an exception variable
            catch (List list) { }
            // Misplaced declaration of an exception variable
            catch (List list) { }
            break MISSING_BLOCK_LABEL_74;
        }
        arraylist.add(list.get(i1));
        list.clear();
        list.addAll(arraylist);
        return arraylist;
        list.printStackTrace();
        return arraylist;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(int i1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        i1;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 43
    //                   1 86;
           goto _L1 _L2 _L3
_L1:
        builder.create();
        builder.show();
        return;
_L2:
        builder.setMessage(0x7f0701e4);
        builder.setPositiveButton(0x7f070049, new com.jcp.activities.af(this));
        builder.setNegativeButton(0x7f070041, new com.jcp.activities.ag(this));
        continue; /* Loop/switch isn't completed */
_L3:
        builder.setMessage(0x7f070453);
        builder.setPositiveButton(0x7f07047e, new com.jcp.activities.ah(this));
        builder.setNegativeButton(0x7f0702aa, new com.jcp.activities.ai(this));
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(Intent intent)
    {
        el el1 = new el();
        Bundle bundle = new Bundle();
        bundle.putString("SELECTED_VALUE", intent.getStringExtra("SELECTED_VALUE"));
        bundle.putBoolean("progress", intent.getBooleanExtra("progress", true));
        bundle.putBoolean("SEARCH", intent.getBooleanExtra("SEARCH", false));
        bundle.putBoolean("showSearch", intent.getBooleanExtra("showSearch", false));
        bundle.putString("Title", intent.getStringExtra("Title"));
        bundle.putBoolean("resultsIncluded", intent.getBooleanExtra("resultsIncluded", true));
        bundle.putString("response", intent.getStringExtra("response"));
        bundle.putBoolean("pagingDisabled", intent.getBooleanExtra("pagingDisabled", false));
        el1.g(bundle);
        b(el1, "ProductListFragment");
    }

    static void a(MainActivity mainactivity)
    {
        mainactivity.I();
    }

    static void a(MainActivity mainactivity, String s1, int i1, g g1, List list)
    {
        mainactivity.b(s1, i1, g1, list);
    }

    private void a(String s1, int i1, Fragment fragment)
    {
        if (fragment != null)
        {
            l.a();
            S();
            b(fragment, s1);
            s1 = getResources().getStringArray(0x7f0c0012);
            if (i1 < s1.length)
            {
                setTitle(s1[i1]);
            }
        }
    }

    private void a(String s1, int i1, g g1, List list)
    {
        (new Thread(new com.jcp.activities.ak(this, g1, s1, i1, list))).start();
    }

    private void a(String s1, int i1, List list, int j1)
    {
        g();
        g g1 = com.jcp.util.g.a();
        ArrayList arraylist = new ArrayList();
        if (i1 > 0 && list != null)
        {
            List list1 = a(list, j1);
            if (list1 != null && list1.size() > 0)
            {
                arraylist.addAll(list);
            }
            j1 = i1;
        } else
        if (i1 == 0 && list == null && s1 != null)
        {
            list = g1.b(s1);
            if (list != null && !TextUtils.isEmpty(list.getName()))
            {
                arraylist.add(list);
            }
            j1 = i1 + 1;
        } else
        {
            j1 = i1;
        }
        if (g1.a(s1).size() == 0)
        {
            a(s1, i1, g1, ((List) (arraylist)));
            return;
        } else
        {
            b(s1, j1, g1, arraylist);
            return;
        }
    }

    private void a(List list)
    {
        Modal modal = new Modal();
        modal.setCategoryId("-1");
        modal.setName("BACK TO MENU");
        list.add(0, modal);
    }

    static boolean a(MainActivity mainactivity, boolean flag)
    {
        mainactivity.o = flag;
        return flag;
    }

    private void aa()
    {
        if (!ap.f(this) && !ap.e(this))
        {
            au.a(this, this);
            ap.a(this);
        }
    }

    private void b(int i1)
    {
        String s1;
        Object obj1;
        int j1;
        obj1 = null;
        s1 = null;
        o = JCP.s().c();
        j1 = i1;
        if (i1 >= 3)
        {
            j1 = i1;
            if (!af.b(this).d())
            {
                j1 = i1 + 1;
            }
        }
        j1;
        JVM INSTR tableswitch 0 5: default 80
    //                   0 91
    //                   1 148
    //                   2 174
    //                   3 242
    //                   4 189
    //                   5 280;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L1:
        Object obj = null;
_L8:
        a(s1, j1, ((Fragment) (obj)));
        return;
_L2:
        if (o)
        {
            obj = new l(this);
            ((l) (obj)).a(this);
            ((l) (obj)).a();
            obj = null;
            s1 = obj1;
        } else
        {
            obj = new SignInFragment();
            T();
            s1 = "SignInFragment";
        }
        o = false;
          goto _L8
_L3:
        if (!o) goto _L1; else goto _L9
_L9:
        obj = new et();
        T();
        s1 = "ProfileFragment";
          goto _L8
_L4:
        obj = new fz();
        s1 = "SavedItemFragment";
          goto _L8
_L6:
        if (mSearchSuggestionLayout.getVisibility() == 0)
        {
            i();
            mSearchEditText.setText("");
            mSearchLayout.setVisibility(0);
            mSearchSuggestionLayout.setVisibility(8);
        }
        obj = fd.a(null, false);
        s1 = "RecommendationFragment";
          goto _L8
_L5:
        if (af.b(this).a())
        {
            bn.a(this);
            obj = null;
        } else
        {
            obj = new bh();
            T();
            s1 = "RewardsFragment";
        }
          goto _L8
        obj = new gt();
        T();
        s1 = "TrackOrderHybridFragment";
          goto _L8
    }

    static void b(MainActivity mainactivity)
    {
        mainactivity.aa();
    }

    private void b(String s1, int i1, g g1, List list)
    {
        List list1 = g1.a(s1);
        com.jcp.util.ae.c(i, (new StringBuilder()).append("Cat Size2 :").append(list1.size()).toString());
        list.addAll(list1);
        a(list);
        r = new ProductCategoriesAdapter(this, list);
        r.a(i1);
        sDepartmentListView.setAdapter(r);
        g1.close();
        if (list1.isEmpty())
        {
            g1 = (Modal)list.get(list.size() - 1);
            if (g1 != null && !g1.getName().equalsIgnoreCase("BACK TO MENU"))
            {
                if (g1.getExternal() != null && g1.getExternal().booleanValue())
                {
                    S();
                    com.jcp.util.k.b(this, getString(0x7f0701cc), g1.getUrl());
                } else
                {
                    a(s1, g1.getName(), g1.getUrl(), i1);
                    s1 = g1.getMobile();
                    if ((TextUtils.isEmpty(s1) || s1.equalsIgnoreCase("Category Menu")) && j(g1.getUrl()))
                    {
                        s1 = new Intent(this, com/jcp/util/DownloadService);
                        s1.putExtra("url", g1.getUrl());
                        s1.putExtra("categoryMenu", true);
                        startService(s1);
                        return;
                    }
                }
            }
        }
    }

    private void b(List list)
    {
        mSearchSuggestionsListView.setAdapter(new cn(this, list));
    }

    static com.jcp.widget.g c(MainActivity mainactivity)
    {
        return mainactivity.l;
    }

    private void c(int i1)
    {
        String s1 = null;
        i1;
        JVM INSTR tableswitch 0 7: default 48
    //                   0 58
    //                   1 73
    //                   2 92
    //                   3 111
    //                   4 126
    //                   5 245
    //                   6 254
    //                   7 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        Object obj = null;
_L11:
        a(s1, i1, ((Fragment) (obj)));
        return;
_L2:
        obj = new as();
        s1 = "HomeFragment";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new ah();
        U();
        s1 = "DepartmentFragment";
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new ac();
        U();
        s1 = "CouponsFragment";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new LocalAdsCatalogsFragment();
        s1 = "AdsAndCatalogsFragment";
        continue; /* Loop/switch isn't completed */
_L6:
        gh gh1 = new gh();
        T();
        String s2 = "StoreListFragment";
        s1 = s2;
        obj = gh1;
        if (y)
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("from", "ProductDetailsPage");
            ((Bundle) (obj)).putString("PRODNAME", u);
            ((Bundle) (obj)).putString("ItemID", v);
            ((Bundle) (obj)).putString("PPID", w);
            ((Bundle) (obj)).putString("COLOR", x);
            ((Bundle) (obj)).putString("IMAGEURL", t);
            gh1.g(((Bundle) (obj)));
            s1 = s2;
            obj = gh1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        w();
        obj = null;
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new ff();
        s1 = "RegistryFragment";
        continue; /* Loop/switch isn't completed */
_L9:
        com.jcp.b.b.s = true;
        obj = new com.jcp.fragments.ad();
        s1 = "CustomerServiceFragment";
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void g(String s1)
    {
        if (K.contains(s1))
        {
            K = new ArrayList(K.subList(0, K.lastIndexOf(s1)));
        }
        K.add(s1);
    }

    private void h(String s1)
    {
        g();
        ArrayList arraylist = new ArrayList();
        boolean flag = false;
        g g1 = com.jcp.util.g.a();
        Modal modal = g1.b(s1);
        int i1 = ((flag) ? 1 : 0);
        if (modal != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (!TextUtils.isEmpty(modal.getName()))
            {
                arraylist.add(modal);
                i1 = 1;
            }
        }
        modal = new Modal();
        modal.setId("flyParent");
        modal.setName("Categories");
        modal.setCategoryId(s1);
        modal.setLocalAdCategory(true);
        arraylist.add(modal);
        b(s1, i1 + 1, g1, arraylist);
    }

    private String i(String s1)
    {
        String s2 = "";
        if (s1.contains("cat"))
        {
            s2 = com.jcp.b.b.k(s1);
        } else
        if (s1.contains("dept"))
        {
            return com.jcp.b.b.j(s1);
        }
        return s2;
    }

    private boolean j(String s1)
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            s1 = new URL(s1);
            s1.toURI();
            flag1 = TextUtils.isEmpty(s1.getHost());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return false;
        }
        if (!flag1)
        {
            flag = true;
        }
        return flag;
    }

    private void k(String s1)
    {
        if (!isFinishing() && I)
        {
            f().b(s1, 1);
        }
    }

    private void l(String s1)
    {
        com.jcp.b.b.d(false);
        ProductDetailFragment productdetailfragment = new ProductDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ProductURL", "");
        bundle.putString("PPID", s1);
        bundle.putBoolean("ProductDetails", true);
        productdetailfragment.g(bundle);
        c(productdetailfragment, "ProductDetailFragment");
    }

    private void m(String s1)
    {
        if (getActionBar() == null)
        {
            return;
        } else
        {
            getActionBar().show();
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setHomeButtonEnabled(true);
            getActionBar().setDisplayShowTitleEnabled(false);
            getActionBar().setDisplayUseLogoEnabled(false);
            getActionBar().setBackgroundDrawable(new ColorDrawable(-1));
            getActionBar().setDisplayShowCustomEnabled(true);
            getActionBar().setIcon(0x7f0d000e);
            getActionBar().setCustomView(n);
            n.setTitle(s1);
            return;
        }
    }

    public void a(int i1, int j1)
    {
    }

    public void a(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (i1 == 201)
        {
            JCP.s().a(true);
        }
    }

    public void a(int i1, String s1)
    {
        Z();
    }

    public void a(int i1, String s1, int j1)
    {
        if (!TextUtils.isEmpty(s1) && j1 == 40)
        {
            s1 = (SavedItems[])com.jcp.util.aa.a(s1, [Lcom/jcp/pojo/SavedItems;);
            JCP.b().a(s1);
            if (s1 != null && s1.length > 0)
            {
                j1 = s1.length;
                for (i1 = 0; i1 < j1; i1++)
                {
                    SavedItems saveditems = s1[i1];
                    String s2 = saveditems.getPpId();
                    com.jcp.util.ae.d(i, (new StringBuilder()).append("ppid: ").append(s2).append("Itemid: ").append(saveditems.getId()).toString());
                    if (JCP.e().a(s2).equals("null"))
                    {
                        JCP.e().a(s2, saveditems.getItemId());
                    }
                }

            }
            com.jcp.b.a.c(false);
        }
    }

    public void a(Intent intent, boolean flag, Map map)
    {
        gh gh1 = new gh();
        Bundle bundle = new Bundle();
        u = intent.getStringExtra("PRODNAME");
        v = intent.getStringExtra("ItemID");
        w = intent.getStringExtra("PPID");
        x = intent.getStringExtra("COLOR");
        t = intent.getStringExtra("IMAGEURL");
        m(getResources().getString(0x7f07025e));
        bundle.putString("from", "ProductDetailFragment");
        bundle.putString("PRODNAME", u);
        bundle.putString("ItemID", v);
        bundle.putString("PPID", w);
        bundle.putSerializable("selected_sku", new HashMap(map));
        bundle.putString("IMAGEURL", t);
        bundle.putBoolean("BOPUS", flag);
        gh1.g(bundle);
        c(gh1, "StoreListFragment");
    }

    public void a(Bundle bundle)
    {
        el el1 = new el();
        el1.g(bundle);
        b(el1, "ProductListFragment");
    }

    public void a(Fragment fragment, String s1)
    {
        o();
        c(fragment, s1);
    }

    public void a(Session session)
    {
        if (session != null)
        {
            af.b(this).a(session.isRewardsEligible());
        }
        Z();
    }

    public void a(RewardsAccount rewardsaccount)
    {
        RewardsEnrollOptionalInfoFragment rewardsenrolloptionalinfofragment = new RewardsEnrollOptionalInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("intent_rewards_account_object", rewardsaccount);
        rewardsenrolloptionalinfofragment.g(bundle);
        c(rewardsenrolloptionalinfofragment, "RewardsOptionalInfoFragment");
    }

    public void a(RewardsProfile rewardsprofile)
    {
    }

    public void a(SearchSuggestionsEntityContainer searchsuggestionsentitycontainer, int i1)
    {
        mSearchSuggestionsListView.setVisibility(0);
        b(new ArrayList(Arrays.asList(searchsuggestionsentitycontainer.getSuggestions())));
    }

    public void a(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        i();
        SearchHistory searchhistory = SearchHistory.getInstance(this);
        searchhistory.addToSearchHistory(s1);
        fd.d(this, s1);
        b(searchhistory.getSearchHistory());
        mSearchSuggestionsListView.setVisibility(8);
        if (getString(0x7f0700f5).equalsIgnoreCase(s1))
        {
            mSearchEditText.setText("");
            searchhistory.clearSearchHistory();
            return;
        } else
        {
            mSearchEditText.setText(s1);
            mSearchLayout.setVisibility(0);
            mSearchSuggestionLayout.setVisibility(8);
            (new Thread(new e(this, com.jcp.b.b.w(com.jcp.b.b.p(s1)), s1))).start();
            return;
        }
    }

    public void a(String s1, String s2)
    {
        j();
        g();
        m();
        a(s1, s2, 0, ((List) (null)), 0);
    }

    public void a(String s1, String s2, int i1)
    {
    }

    public void a(String s1, String s2, int i1, List list, int j1)
    {
        Fragment fragment = f().a("ProductListFragment");
        if (H != null && H.equalsIgnoreCase(s1) && fragment != null && !fragment.o()) goto _L2; else goto _L1
_L1:
        H = s1;
        g(s1);
        mSearchLayout.setVisibility(0);
        mSearchSuggestionLayout.setVisibility(8);
        mSearchSuggestionsListView.setVisibility(8);
        mSearchTextView.setText(0x7f0703b4);
        s = i1;
        if (TextUtils.isEmpty(s2) || s2.equals("BACK TO MENU") || q.contains(s2.trim().toLowerCase())) goto _L4; else goto _L3
_L3:
        Bundle bundle = new Bundle();
        bundle.putString("SELECTED_VALUE", com.jcp.b.b.v(s1));
        bundle.putString("Title", s2);
        bundle.putBoolean("progress", false);
        bundle.putStringArrayList("breadcrumbs", new ArrayList(K));
        s2 = new el();
        s2.g(bundle);
        b(s2, "ProductListFragment");
_L6:
        a(s1, s, list, j1);
_L2:
        return;
_L4:
        s2 = P();
        if (TextUtils.isEmpty(s2) || !"DepartmentFragment".equalsIgnoreCase(s2))
        {
            a(((String) (null)), ((String) (null)), ((String) (null)));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(String s1, String s2, Fragment fragment)
    {
        k(s1);
        c(fragment, s2);
    }

    public void a(String s1, String s2, String s3)
    {
        ah ah1 = new ah();
        if (!TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s2) || !TextUtils.isEmpty(s3))
        {
            Bundle bundle = new Bundle();
            bundle.putString("SitePromoOne", s1);
            bundle.putString("SitePromoTwo", s2);
            bundle.putString("SitePromoThree", s3);
            ah1.g(bundle);
        }
        c(ah1, "DepartmentFragment");
    }

    public void a(String s1, String s2, String s3, int i1)
    {
        S();
        mSearchTextView.setText(0x7f0703b4);
        s = i1;
        if (r != null)
        {
            r.a(i1);
            r.notifyDataSetChanged();
        }
        String s4 = s3;
        if (!TextUtils.isEmpty(s3))
        {
            s4 = com.jcp.b.b.v(s1);
        }
        s3 = new Bundle();
        s3.putString("SELECTED_VALUE", s4);
        s3.putString("Title", s2);
        s3.putBoolean("progress", false);
        g(s1);
        s3.putStringArrayList("breadcrumbs", new ArrayList(K));
        s1 = new el();
        s1.g(s3);
        b(s1, "ProductListFragment");
    }

    public void a(String s1, List list, int i1)
    {
        S();
        s = i1;
        if (r != null)
        {
            r.a(i1);
            r.notifyDataSetChanged();
        }
        boolean flag1 = true;
        boolean flag = flag1;
        if (list != null)
        {
            flag = flag1;
            if (list.size() > 10)
            {
                flag = false;
            }
        }
        el el1 = new el();
        Bundle bundle = new Bundle();
        bundle.putBoolean("progress", false);
        bundle.putBoolean("SEARCH", false);
        bundle.putBoolean("showSearch", false);
        bundle.putString("Title", s1);
        bundle.putBoolean("resultsIncluded", false);
        bundle.putStringArrayList("categoryProductsSkuIds", (ArrayList)list);
        bundle.putBoolean("pagingDisabled", flag);
        el1.g(bundle);
        b(el1, "ProductListFragment");
    }

    public void a(Map map)
    {
        if (!map.isEmpty())
        {
            B.clear();
            B.putAll(map);
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        RewardsConfirmationFragment rewardsconfirmationfragment = new RewardsConfirmationFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("jcp_account_created", flag);
        bundle.putBoolean("rewards_account_created", flag1);
        rewardsconfirmationfragment.g(bundle);
        a(((Fragment) (rewardsconfirmationfragment)), "RewardsConfirmationFragment");
    }

    public void a(boolean flag, boolean flag1, String s1)
    {
        RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment = new RewardsConnectAccountsSignInToRewardsFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("jcp_account_created", flag);
        bundle.putBoolean("intent_user_has_rewards_account", flag1);
        bundle.putString("intent_email", s1);
        rewardsconnectaccountssignintorewardsfragment.g(bundle);
        a(((Fragment) (rewardsconnectaccountssignintorewardsfragment)), "RewardsConnectAccountsSignInToRewards");
    }

    public void a_(String s1, int i1)
    {
    }

    public void b(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (com.jcp.http.b.a(i1))
        {
            getSharedPreferences("MyPrefsForStore", 0).edit().remove("storeList").apply();
            JCP.s().a(false, false);
            JCP.d().a(0);
            T();
            errormessageentitycontainer = new l(this);
            errormessageentitycontainer.a(this);
            errormessageentitycontainer.d();
        }
    }

    public void b(int i1, String s1)
    {
    }

    public void b(Fragment fragment, String s1)
    {
        k(s1);
        c(fragment, s1);
    }

    public void b(RewardsAccount rewardsaccount)
    {
        if (rewardsaccount != null)
        {
            JCPCreateAccountFragment jcpcreateaccountfragment = new JCPCreateAccountFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("intent_rewards_account_object", rewardsaccount);
            jcpcreateaccountfragment.g(bundle);
            a(jcpcreateaccountfragment, "CreateAccountFragment");
        }
    }

    public void b(String s1)
    {
        C = s1;
    }

    public void b(String s1, int i1)
    {
        try
        {
            s1 = new JSONObject(s1);
            if (s1.has("errorMessage"))
            {
                com.jcp.util.ae.a(i, s1.getString("errorMessage"));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.jcp.util.ae.a(i, "Exception occurred while parsing received error response");
        }
    }

    public void b(String s1, String s2, int i1)
    {
        String s3 = P();
        if (s2 != null && !s2.equalsIgnoreCase(s3) && i1 == 1)
        {
            b(((Fragment) (new LocalAdsCatalogsFragment())), "AdsAndCatalogsFragment");
        }
        e(s1);
    }

    public void b(boolean flag, boolean flag1)
    {
        RewardsConnectAccountsSignInToJCPFragment rewardsconnectaccountssignintojcpfragment = new RewardsConnectAccountsSignInToJCPFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_user_has_rewards_account", flag);
        bundle.putBoolean("intent_from_rewards_landing_page", flag1);
        rewardsconnectaccountssignintojcpfragment.g(bundle);
        c(rewardsconnectaccountssignintojcpfragment, "RewardsConnectAccountsSignInToJCP");
    }

    public void c(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
    }

    public void c(int i1, String s1)
    {
        byte byte0;
        mSearchTextView.setText(0x7f0703b4);
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 52
    //                   -2092731939: 109
    //                   -1323763471: 81
    //                   -615428085: 95;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_109;
_L5:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            c(i1);
            return;

        case 1: // '\001'
            b(i1);
            return;

        case 2: // '\002'
            a("ShoppingCart", i1, new ShoppingBagFragment());
            break;
        }
        break MISSING_BLOCK_LABEL_151;
_L3:
        if (s1.equals("drawer"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s1.equals("popupmenu"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s1.equals("ActionBar"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public void c(Fragment fragment, String s1)
    {
        if (!isFinishing() && I)
        {
            f().a().a(0x7f0e0166, fragment, s1).a(s1).b();
        }
    }

    public void c(String s1)
    {
        D = s1;
    }

    public void c(String s1, int i1)
    {
        el el1 = (el)f().a("ProductListFragment");
        if (el1 != null && el1.n())
        {
            el1.c(s1, i1);
        }
    }

    public void c(boolean flag, boolean flag1)
    {
        if (flag)
        {
            RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment = new RewardsConnectAccountsSignInToRewardsFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("intent_user_has_rewards_account", true);
            bundle.putBoolean("intent_from_rewards_landing_page", flag1);
            rewardsconnectaccountssignintorewardsfragment.g(bundle);
            c(((Fragment) (rewardsconnectaccountssignintorewardsfragment)), "RewardsConnectAccountsSignInToRewards");
            return;
        } else
        {
            c(((Fragment) (new RewardsEnrollFragment())), "RewardsEnrollFragment");
            return;
        }
    }

    public void clickEvent(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624476: 
            b(new ShoppingBagFragment(), "ShoppingCart");
            return;

        case 2131624475: 
            i();
            S();
            l.a(view);
            return;
        }
    }

    public void d(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
    }

    public void d(String s1)
    {
        if (com.jcp.util.g.a().b(s1) != null)
        {
            mDrawerLayout.d(0x800003);
            a(s1, 0, ((List) (null)), 0);
            return;
        } else
        {
            a(s1, ((String) (null)), i(s1), 0);
            return;
        }
    }

    public void e(String s1)
    {
        mDrawerLayout.d(0x800003);
        h(s1);
    }

    public void f(String s1)
    {
        l(s1);
    }

    public void findStore(View view)
    {
        view = new gh();
        if (L)
        {
            Bundle bundle = new Bundle();
            bundle.putString("from", "AdsAndCatalogsFragment");
            view.g(bundle);
        }
        c(view, "StoreListFragment");
    }

    public void g()
    {
        mDrawerList.setVisibility(8);
        sDepartmentListView.setVisibility(0);
    }

    protected String h()
    {
        return "MAIN";
    }

    public void i()
    {
        if (getCurrentFocus() != null && getCurrentFocus().getWindowToken() != null)
        {
            ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void j()
    {
        mDrawerLayout.h(mSlideMenuRootLayout);
    }

    public void k()
    {
        mDrawerLayout.setDrawerLockMode(1);
    }

    public void l()
    {
        mDrawerLayout.setDrawerLockMode(0);
    }

    public void m()
    {
        K.clear();
    }

    public void n()
    {
        s = 0;
        B();
        f().a("HomeFragment", 0);
    }

    public void o()
    {
        if (!isFinishing() && I)
        {
            f().d();
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        I = true;
        i1;
        JVM INSTR lookupswitch 4: default 56
    //                   201: 85
    //                   300: 175
    //                   400: 221
    //                   1000: 57;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L5:
        if (intent != null)
        {
            String s1 = intent.getStringExtra("type");
            c(intent.getIntExtra("position", 0), s1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j1 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent != null && intent.getBooleanExtra("startScan", false))
        {
            W();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (j1 != -1 || intent == null) goto _L1; else goto _L6
_L6:
        boolean flag1;
        boolean flag = intent.getBooleanExtra("startProductDetails", false);
        flag1 = intent.getBooleanExtra("startProductList", false);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra("PPID");
        if (!TextUtils.isEmpty(intent))
        {
            l(intent);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!flag1) goto _L1; else goto _L7
_L7:
        a(intent);
        return;
_L3:
        if (j1 == -1)
        {
            intent = com.jcp.b.b.m(getResources().getString(0x7f070206));
            a(getResources().getString(0x7f070206), getResources().getString(0x7f070207), intent, 1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j1 == -1)
        {
            W();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void onBackPressed()
    {
        try
        {
            if (mSearchSuggestionsListView.getVisibility() == 0 || mSearchSuggestionLayout.getVisibility() == 0)
            {
                mSearchSuggestionsListView.setVisibility(8);
                mSearchLayout.setVisibility(0);
                mSearchSuggestionLayout.setVisibility(8);
                return;
            }
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (mDrawerLayout.f(0x800003))
        {
            mDrawerLayout.i(mSlideMenuRootLayout);
            return;
        }
        String s1;
        if (l.a())
        {
            break MISSING_BLOCK_LABEL_241;
        }
        s1 = P();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if ("HomeFragment".equalsIgnoreCase(s1))
        {
            (new ap(this)).b();
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        if (f().e() == 1)
        {
            a(new as(), "HomeFragment");
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (com.jcp.b.a.j() != null && ("ProductDetailFragment".equalsIgnoreCase(s1) || "MultipleVideosGridFragment".equalsIgnoreCase(s1)))
        {
            com.jcp.b.a.j().a();
            return;
        }
        String s2 = Q();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if (!"StoreListFragment".equalsIgnoreCase(s1) || s2 == null)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if ("AdsAndCatalogsFragment".equalsIgnoreCase(s2))
        {
            ((LocalAdsCatalogsFragment)f().a("AdsAndCatalogsFragment")).U();
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        if (!k)
        {
            CrittercismConfig crittercismconfig = new CrittercismConfig();
            crittercismconfig.a(true);
            Crittercism.a(getApplicationContext(), getString(0x7f070141), crittercismconfig);
        }
        super.onCreate(bundle);
        Y();
        if (!k)
        {
            F();
            H();
        }
        getWindow().requestFeature(8);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        f().a(null, 1);
        i();
        setContentView(0x7f030029);
        ButterKnife.inject(this);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        Bundle bundle1 = bundle;
_L11:
        E = bundle1;
        if (E == null) goto _L4; else goto _L3
_L3:
        bundle1 = E;
_L12:
        boolean flag;
        E = bundle1;
        N();
        M();
        R();
        F = E.getInt("position", 0);
        y = E.getBoolean("frompdp", false);
        E();
        D();
        flag = E.getBoolean("checkout", Boolean.FALSE.booleanValue());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        c(F, "");
        if (y && !com.jcp.b.b.s && !G)
        {
            m(getResources().getString(0x7f07025e));
            u = E.getString("PRODNAME");
            v = E.getString("ItemID");
            w = E.getString("PPID");
            x = E.getString("COLOR");
            t = E.getString("IMAGEURL");
            c(4, "drawer");
        }
        V();
        if (bundle != null) goto _L6; else goto _L5
_L5:
        if (y || com.jcp.b.b.s || G || flag)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        if (F == 1) goto _L8; else goto _L7
_L7:
        if (F != 7) goto _L10; else goto _L9
_L9:
        c(7, "drawer");
_L6:
        C();
        if (!k)
        {
            K();
            J();
        }
        k = true;
        return;
_L2:
        bundle1 = getIntent().getExtras();
          goto _L11
_L4:
        bundle1 = new Bundle();
          goto _L12
        bundle;
        k = true;
        throw bundle;
_L10:
        c(0, "drawer");
          goto _L6
_L8:
        if (getIntent() == null) goto _L6; else goto _L13
_L13:
        c(F, "popupmenu");
          goto _L6
        c(0, "drawer");
          goto _L6
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (adapterview.getId() == 0x7f0e0169 && i1 < j.size())
        {
            mSearchTextView.setText(0x7f0703b4);
            adapterview = ((Modal)j.get(i1)).getName();
            if (!getString(0x7f070212).equalsIgnoreCase(adapterview) && !getString(0x7f070215).equalsIgnoreCase(adapterview))
            {
                if (getString(0x7f070211).equalsIgnoreCase(adapterview))
                {
                    p.a(adapterview);
                    c(0, "drawer");
                } else
                if (getString(0x7f07020d).equalsIgnoreCase(adapterview))
                {
                    p.a(adapterview);
                    c(2, "drawer");
                } else
                if (getString(0x7f07020c).equalsIgnoreCase(adapterview))
                {
                    L = true;
                    p.a(adapterview);
                    c(3, "drawer");
                } else
                if (getString(0x7f07020f).equalsIgnoreCase(adapterview))
                {
                    y = false;
                    p.a(adapterview);
                    c(4, "drawer");
                } else
                if (getString(0x7f070214).equalsIgnoreCase(adapterview))
                {
                    p.a(adapterview);
                    W();
                    S();
                } else
                if (getString(0x7f070210).equalsIgnoreCase(adapterview))
                {
                    p.a(adapterview);
                    c(5, "drawer");
                } else
                if (getString(0x7f070213).equalsIgnoreCase(adapterview))
                {
                    p.a(adapterview);
                    c(6, "drawer");
                } else
                if (getString(0x7f07020e).equalsIgnoreCase(adapterview))
                {
                    p.a(adapterview);
                    c(7, "drawer");
                } else
                {
                    if (!"DEBUG".equalsIgnoreCase(adapterview));
                    a(((Modal)j.get(i1)).getId(), adapterview);
                }
                p.notifyDataSetChanged();
                return;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return m.a(menuitem) || super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        super.onPause();
        I = false;
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        m.a();
    }

    public void onResume()
    {
        super.onResume();
        I = true;
        Fragment fragment = f().a("DepartmentFragment");
        if (fragment != null && fragment.o())
        {
            JCP.c().a((com.jcp.fragments.s)fragment);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("position", F);
        bundle.putBoolean("frompdp", y);
        bundle.putBundle("ADDTOCARTBUNDLE", E.getBundle("ADDTOCARTBUNDLE"));
        bundle.putString("PRODNAME", u);
        bundle.putString("ItemID", v);
        bundle.putString("PPID", w);
        bundle.putString("COLOR", x);
        bundle.putString("IMAGEURL", t);
        bundle.putBoolean("forSessionInvalidLaunch", G);
    }

    protected void onScanClick()
    {
        W();
    }

    public void onSearchClearIconClick()
    {
        i();
        mSearchEditText.setText("");
        mSearchLayout.setVisibility(0);
        mSearchSuggestionLayout.setVisibility(8);
    }

    public void onSearchClick()
    {
        if (!mDrawerLayout.f(0x800003))
        {
            X();
            mSearchEditText.setText("");
        }
    }

    protected void onStart()
    {
        super.onStart();
        f().a(J);
    }

    protected void onStop()
    {
        super.onStop();
        f().b(J);
    }

    public Map p()
    {
        return B;
    }

    public String q()
    {
        return C;
    }

    public String r()
    {
        return D;
    }

    public void s()
    {
        ap.a(true, this);
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        n.setTitle(charsequence.toString());
    }

    public void t()
    {
        ap.a(false, this);
    }

    public void u()
    {
        c(new ac(), "CouponsFragment");
    }

    public void v()
    {
        c(new gh(), "StoreListFragment");
    }

    public void w()
    {
        startActivityForResult(new Intent(this, com/jcp/activities/GiftCardActivity), 300);
    }

    public void x()
    {
        c(new RewardsLandingFragment(), "RewardsLandingFragment");
    }

}
