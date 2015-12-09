// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.a.j;
import com.jcp.JCP;
import com.jcp.adapters.CardListAdapter;
import com.jcp.adapters.bf;
import com.jcp.b.a;
import com.jcp.b.b;
import com.jcp.c.af;
import com.jcp.c.ak;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.ag;
import com.jcp.fragments.rewards.RewardsConnectAccountsSignInToRewardsFragment;
import com.jcp.fragments.rewards.RewardsDashboardFragment;
import com.jcp.model.CardDetails;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.au;
import com.jcp.util.bp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, ey, eu, gh, 
//            t, FindStoreDetailsFragment, fd, fe, 
//            SignInFragment, PrimaryAddressFragment, o, EditAccountFragment, 
//            AddCreditCardFragment

public class et extends s
    implements android.view.View.OnClickListener, aa, ag
{

    private static final String a = com/jcp/fragments/et.getSimpleName();
    private static ProfilePojo b;
    private List aj;
    private ToggleButton ak;
    private SharedPreferences al;
    private LinearLayout am;
    private LinearLayout an;
    private RelativeLayout ao;
    private ak ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private LinearLayout au;
    private TextView av;
    private GetAccountResponse aw;
    private List ax;
    private android.widget.AdapterView.OnItemClickListener ay;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private ListView g;
    private SharedPreferences h;
    private q i;

    public et()
    {
        ax = new ArrayList();
        ay = new ey(this);
    }

    public static void U()
    {
        com.jcp.b.a.i();
    }

    private static ProfilePojo V()
    {
        return b;
    }

    private void W()
    {
        if (i == null)
        {
            i = new q(i());
            i.a(this);
            i.a(true);
            i.b(true);
        }
    }

    private void X()
    {
        aq = true;
        W();
        i.a();
    }

    private void Z()
    {
label0:
        {
            boolean flag = com.jcp.c.af.b(i()).a();
            LinearLayout linearlayout = au;
            int k;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            linearlayout.setVisibility(k);
            if (flag)
            {
                if (!ah())
                {
                    break label0;
                }
                b(true);
            }
            return;
        }
        aq = true;
        af af1 = com.jcp.c.af.b(i());
        af1.a(this);
        af1.f();
    }

    static LinearLayout a(et et1, LinearLayout linearlayout)
    {
        et1.an = linearlayout;
        return linearlayout;
    }

    static List a(et et1)
    {
        return et1.aj;
    }

    private void a(View view)
    {
        c = (TextView)view.findViewById(0x7f0e03f0);
        d = (TextView)view.findViewById(0x7f0e03e5);
        e = (TextView)view.findViewById(0x7f0e03e6);
        f = (TextView)view.findViewById(0x7f0e03f5);
        ImageView imageview = (ImageView)view.findViewById(0x7f0e03f1);
        g = (ListView)view.findViewById(0x7f0e03fa);
        ao = (RelativeLayout)view.findViewById(0x7f0e03f9);
        g.setOnItemClickListener(ay);
        ImageView imageview1 = (ImageView)view.findViewById(0x7f0e03e7);
        ImageView imageview2 = (ImageView)view.findViewById(0x7f0e03fe);
        RelativeLayout relativelayout = (RelativeLayout)view.findViewById(0x7f0e03e4);
        au = (LinearLayout)view.findViewById(0x7f0e03e8);
        RelativeLayout relativelayout1 = (RelativeLayout)view.findViewById(0x7f0e03ea);
        av = (TextView)view.findViewById(0x7f0e03eb);
        RelativeLayout relativelayout2 = (RelativeLayout)view.findViewById(0x7f0e03ef);
        RelativeLayout relativelayout3 = (RelativeLayout)view.findViewById(0x7f0e03f4);
        RelativeLayout relativelayout4 = (RelativeLayout)view.findViewById(0x7f0e03fb);
        ak = (ToggleButton)view.findViewById(0x7f0e03e0);
        imageview2.setOnClickListener(this);
        imageview1.setOnClickListener(this);
        imageview.setOnClickListener(this);
        relativelayout.setOnClickListener(this);
        relativelayout1.setOnClickListener(this);
        relativelayout2.setOnClickListener(this);
        relativelayout3.setOnClickListener(this);
        relativelayout4.setOnClickListener(this);
        ak.setOnClickListener(this);
        aj = new ArrayList();
        g.setOnItemLongClickListener(new eu(this));
    }

    private void a(t t1)
    {
        if (!a(0x7f0703bb).equalsIgnoreCase(f.getText().toString())) goto _L2; else goto _L1
_L1:
        bf.a(null);
        if (t1 != null)
        {
            t1.c(new gh(), "StoreListFragment");
        }
_L4:
        return;
_L2:
        boolean flag;
        h = i().getSharedPreferences("MyPrefsForStore", 0);
        Object obj = h.getString("storeList", "");
        if (((String) (obj)).isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Stores)com.jcp.util.aa.a(((String) (obj)), com/jcp/storepickup/pojo/Stores);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        f.setText(((Stores) (obj)).getName());
        FindStoreDetailsFragment findstoredetailsfragment = new FindStoreDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("fromStoreList", "fromdefaultstore");
        bundle.putParcelable("arrayStoreList", ((Parcelable) (obj)));
        findstoredetailsfragment.g(bundle);
        if (t1 != null)
        {
            t1.c(findstoredetailsfragment, "StoreDetailsFragment");
        }
        flag = false;
_L5:
        if (flag)
        {
            t1 = V();
            ap = new ak(i(), this);
            if (!TextUtils.isEmpty(t1.getStoreNumber()))
            {
                ap.a(t1.getStoreNumber(), false, true);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = true;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void a(GetAccountResponse getaccountresponse)
    {
        aq = false;
        if (i() == null)
        {
            return;
        }
        i().findViewById(0x7f0e0164).setVisibility(8);
        d.setText((new StringBuilder()).append(getaccountresponse.getFirstName()).append(" ").append(getaccountresponse.getLastName()).toString());
        e.setText(getaccountresponse.getEmail());
        (new q(i())).a(i(), getaccountresponse);
        ad();
        try
        {
            com.jcp.util.af.a(i()).a(getaccountresponse);
        }
        // Misplaced declaration of an exception variable
        catch (GetAccountResponse getaccountresponse)
        {
            getaccountresponse.printStackTrace();
        }
        fd.U().a(true);
    }

    private static void a(ProfilePojo profilepojo)
    {
        b = profilepojo;
    }

    private void a(GetAddressResponseModel agetaddressresponsemodel[])
    {
        int k = 0;
        ar = false;
        if (i() != null)
        {
            i().findViewById(0x7f0e0164).setVisibility(8);
            if (agetaddressresponsemodel != null)
            {
                JCP.e().a(Arrays.asList(agetaddressresponsemodel));
                for (; k < agetaddressresponsemodel.length; k++)
                {
                    if (agetaddressresponsemodel[k].isDefault())
                    {
                        String s1 = agetaddressresponsemodel[k].getAddressLineOne();
                        String s2 = agetaddressresponsemodel[k].getState();
                        String s3 = agetaddressresponsemodel[k].getZip();
                        String s4 = agetaddressresponsemodel[k].getPhone();
                        android.content.SharedPreferences.Editor editor = al.edit();
                        editor.putString("phone", s4);
                        editor.putString("zip", s3);
                        editor.apply();
                        s1 = (new StringBuilder()).append(s1).append(" ").append(s2).append(" ").append(s3).toString();
                        c.setText(s1);
                    }
                }

            }
        }
        ad();
    }

    private void aa()
    {
        ar = true;
        W();
        i.a(6);
    }

    private void ab()
    {
        as = true;
        W();
        i.d();
    }

    private void ac()
    {
        at = true;
        W();
        i.e();
    }

    private void ad()
    {
        if (!ar && !aq && !as && !at && i() != null && !i().isFinishing())
        {
            com.jcp.b.a.i();
        }
    }

    private void ae()
    {
        if (com.jcp.g.a.i() || com.jcp.b.a.d())
        {
            if (com.jcp.g.a.i())
            {
                com.jcp.g.a.d(false);
            }
            if (com.jcp.b.a.d())
            {
                com.jcp.b.a.d(false);
            }
            aa();
        }
        if (com.jcp.g.a.f() || com.jcp.g.a.g())
        {
            if (com.jcp.g.a.f())
            {
                com.jcp.g.a.a(false);
            }
            if (com.jcp.g.a.g())
            {
                com.jcp.g.a.b(false);
            }
            ab();
        }
        if (com.jcp.g.a.h())
        {
            com.jcp.g.a.c(false);
            X();
        }
    }

    private void af()
    {
        if (av.getText().toString().equalsIgnoreCase(a(0x7f070369)))
        {
            a(i()).c(ag(), "RewardsConnectAccountsSignInToRewards");
            return;
        } else
        {
            a(i()).c(new RewardsDashboardFragment(), a.b);
            return;
        }
    }

    private Fragment ag()
    {
        RewardsConnectAccountsSignInToRewardsFragment rewardsconnectaccountssignintorewardsfragment = new RewardsConnectAccountsSignInToRewardsFragment();
        if (R())
        {
            b(rewardsconnectaccountssignintorewardsfragment);
        }
        if (Q())
        {
            a(rewardsconnectaccountssignintorewardsfragment);
        }
        return rewardsconnectaccountssignintorewardsfragment;
    }

    private boolean ah()
    {
        boolean flag;
        try
        {
            flag = com.jcp.util.af.a(i()).d();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        return flag;
    }

    static LinearLayout b(et et1)
    {
        return et1.am;
    }

    static LinearLayout b(et et1, LinearLayout linearlayout)
    {
        et1.am = linearlayout;
        return linearlayout;
    }

    private void b(t t1)
    {
        boolean flag = ak.isChecked();
        if (flag)
        {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromProfile", true);
            SignInFragment signinfragment = new SignInFragment();
            signinfragment.g(bundle);
            if (t1 != null)
            {
                t1.c(signinfragment, "SignInFragment");
            }
        }
        t1 = al.edit();
        t1.putBoolean("keep_me_signin", flag);
        t1.commit();
    }

    private void b(boolean flag)
    {
        if (n())
        {
            TextView textview = av;
            int k;
            if (flag)
            {
                k = 0x7f07038e;
            } else
            {
                k = 0x7f070369;
            }
            textview.setText(a(k));
        }
    }

    static q c(et et1)
    {
        return et1.i;
    }

    private void c(Bundle bundle)
    {
        aw = (GetAccountResponse)bundle.getParcelable("ACCOUNT_RESPONSE");
        a(aw);
        ax = bundle.getParcelableArrayList("ADDRESS_LIST");
        a((GetAddressResponseModel[])ax.toArray(new GetAddressResponseModel[ax.size()]));
    }

    private void c(t t1)
    {
        if (JCP.e().e() != null)
        {
            PrimaryAddressFragment primaryaddressfragment = new PrimaryAddressFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromCard", false);
            primaryaddressfragment.g(bundle);
            if (t1 != null)
            {
                t1.c(primaryaddressfragment, "PrimaryAddressFragment");
            }
        } else
        {
            o o1 = new o();
            Bundle bundle1 = new Bundle();
            bundle1.putString("Title", "addAddress");
            o1.g(bundle1);
            if (t1 != null)
            {
                t1.c(o1, "AddAddressFragment");
                return;
            }
        }
    }

    static LinearLayout d(et et1)
    {
        return et1.an;
    }

    private void d(t t1)
    {
        String s1 = al.getString("firstName", "");
        String s2 = al.getString("lastName", "");
        String s3 = al.getString("email", "");
        EditAccountFragment editaccountfragment = new EditAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putString("firstName", s1);
        bundle.putString("lastName", s2);
        bundle.putString("email", s3);
        editaccountfragment.g(bundle);
        if (t1 != null)
        {
            t1.c(editaccountfragment, "EditAccountFragment");
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        layoutinflater = layoutinflater.inflate(0x7f0300c9, viewgroup, false);
        a(a(0x7f07032c), ((android.app.Activity) (i())));
        al = i().getSharedPreferences("com.jcp.activities", 0);
        a(((View) (layoutinflater)));
        ak.setChecked(al.getBoolean("keep_me_signin", false));
        com.jcp.b.a.a(i(), 0x7f070317);
        if (bundle != null)
        {
            c(bundle);
        } else
        {
            X();
            aa();
        }
        Z();
        ab();
        ac();
        JCP.c().a(this);
        return layoutinflater;
    }

    protected String a()
    {
        return "PROFILE";
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        aq = false;
        ar = false;
        as = false;
        at = false;
    }

    public void a(RewardsAccount rewardsaccount)
    {
    }

    public void a(RewardsProfile rewardsprofile)
    {
        if (rewardsprofile == null)
        {
            return;
        } else
        {
            b(rewardsprofile.getStatus().equalsIgnoreCase("enrolled"));
            return;
        }
    }

    public void a(GetAccountResponse getaccountresponse, int k)
    {
        aw = getaccountresponse;
        a(getaccountresponse);
    }

    public void a(String s1, String s2, int k)
    {
        aq = false;
        ar = false;
        as = false;
        at = false;
        ad();
        if (!"SRV_SESSION_INVALID".equalsIgnoreCase(s1) && i() != null)
        {
            com.jcp.util.au.a(i(), s2);
        }
    }

    public void a(List list, int k)
    {
        if (i() == null || !n())
        {
            return;
        }
        as = false;
        if (!list.isEmpty())
        {
            if (aj != null)
            {
                aj.clear();
            }
            aj = list;
        }
        Object obj = new ArrayList();
        k = 0;
        while (k < list.size()) 
        {
            CardDetails carddetails = (CardDetails)list.get(k);
            if (carddetails.isDefault())
            {
                ((List) (obj)).add(0, carddetails);
            } else
            {
                ((List) (obj)).add(carddetails);
            }
            k++;
        }
        aj = ((List) (obj));
        list = new CardListAdapter(i(), ((List) (obj)));
        g.setAdapter(list);
        obj = (RelativeLayout)LayoutInflater.from(i().getApplicationContext()).inflate(0x7f0300db, null).findViewById(0x7f0e0468);
        if (((RelativeLayout) (obj)).getLayoutParams() != null)
        {
            obj = new android.widget.RelativeLayout.LayoutParams(-2, ((RelativeLayout) (obj)).getLayoutParams().height * aj.size());
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(3, 0x7f0e03f7);
            ao.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        ao.invalidate();
        list.notifyDataSetChanged();
        ad();
    }

    public void a(List list, List list1, boolean flag)
    {
        if (i() == null || !n())
        {
            return;
        }
        at = false;
        h = i().getSharedPreferences("MyPrefsForStore", 0);
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        String s1 = ((Stores)list.get(0)).getName();
        if (!flag) goto _L4; else goto _L3
_L3:
        if (s1 != null)
        {
            f.setText(s1);
        }
        list1 = h.edit();
        list1.putString("storeList", (new j()).a(list.get(0)));
        list1.commit();
_L6:
        ad();
        return;
_L4:
        list1 = new FindStoreDetailsFragment();
        Bundle bundle = new Bundle();
        android.content.SharedPreferences.Editor editor = h.edit();
        editor.putString("storeList", (new j()).a(list.get(0)));
        editor.commit();
        bundle.putParcelable("arrayStoreList", (Parcelable)list.get(0));
        bundle.putString("fromStoreList", "fromdefaultstore");
        f.setText(s1);
        list1.g(bundle);
        list = a(i());
        if (list != null)
        {
            list.c(list1, "StoreListFragment");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        f.setText(i().getResources().getString(0x7f0703bb));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void a(boolean flag, boolean flag1, String s1)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int k)
    {
        if (agetaddressresponsemodel != null && agetaddressresponsemodel.length > 0)
        {
            ax.clear();
            int l = agetaddressresponsemodel.length;
            for (k = 0; k < l; k++)
            {
                GetAddressResponseModel getaddressresponsemodel = agetaddressresponsemodel[k];
                ax.add(getaddressresponsemodel);
            }

        }
        a(agetaddressresponsemodel);
    }

    public void a_(String s1, int k)
    {
    }

    public void a_(ProfilePojo aprofilepojo[], int k)
    {
        at = false;
        if (aprofilepojo == null || aprofilepojo.length <= 0)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        k = 0;
_L5:
        if (k >= aprofilepojo.length) goto _L2; else goto _L1
_L1:
        String s1 = aprofilepojo[k].getIsDefault();
        if (s1 == null || s1.isEmpty() || !"true".equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        ap = new ak(i(), this);
        if (!TextUtils.isEmpty(aprofilepojo[k].getStoreNumber()))
        {
            ap.a(aprofilepojo[k].getStoreNumber(), true, false);
            a(aprofilepojo[k]);
        }
_L2:
        if (com.jcp.b.a.e())
        {
            com.jcp.b.a.e(false);
            com.jcp.util.au.a(i(), a(0x7f070416), a(0x7f070459));
        }
        ad();
        return;
_L4:
        k++;
          goto _L5
        f.setText(a(0x7f0703bb));
          goto _L2
    }

    public void b()
    {
        a(j().getString(0x7f07032c));
        Stores stores = (Stores)com.jcp.util.aa.a(i().getSharedPreferences("MyPrefsForStore", 0).getString("storeList", ""), com/jcp/storepickup/pojo/Stores);
        if (stores != null)
        {
            f.setText(stores.getName());
        } else
        {
            f.setText(a(0x7f0703bb));
        }
        super.b();
    }

    public void b(RewardsAccount rewardsaccount)
    {
    }

    public void b(boolean flag, boolean flag1)
    {
    }

    public void e(Bundle bundle)
    {
        if (aw != null)
        {
            bundle.putParcelable("ACCOUNT_RESPONSE", aw);
        }
        if (ax != null && !ax.isEmpty())
        {
            bundle.putParcelableArrayList("ADDRESS_LIST", (ArrayList)ax);
        }
        super.e(bundle);
    }

    public void f_()
    {
        super.f_();
        ae();
    }

    public void onClick(View view)
    {
        t t1 = a(i());
        view.getId();
        JVM INSTR lookupswitch 6: default 72
    //                   2131624928: 85
    //                   2131624932: 73
    //                   2131624938: 122
    //                   2131624943: 79
    //                   2131624948: 91
    //                   2131624955: 97;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L3:
        d(t1);
        return;
_L5:
        c(t1);
        return;
_L2:
        b(t1);
        return;
_L6:
        a(t1);
        return;
_L7:
        b.n = false;
        if (t1 != null)
        {
            t1.c(new AddCreditCardFragment(), "AddCreditCardFragment");
            return;
        }
          goto _L1
_L4:
        af();
        return;
    }

}
