// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.google.a.j;
import com.jcp.JCP;
import com.jcp.activities.MainActivity;
import com.jcp.adapters.LocalAdsCatalogAdapter;
import com.jcp.b.a;
import com.jcp.c.e;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.ap;
import com.jcp.e.d;
import com.jcp.e.p;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.DownloadResultReceiver;
import com.jcp.util.JCPLocalAdsDownloadService;
import com.jcp.util.ae;
import com.jcp.util.af;
import com.jcp.util.ai;
import com.jcp.util.br;
import com.jcp.util.g;
import com.jcp.util.k;
import com.jcp.util.t;
import com.jcp.views.TypefaceTextView;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s

public class LocalAdsCatalogsFragment extends s
    implements aa, ap, d, p, t
{

    private static final String a = com/jcp/fragments/LocalAdsCatalogsFragment.getClass().getSimpleName();
    private SparseIntArray b;
    private boolean c;
    private String d;
    private SharedPreferences e;
    private int f;
    protected ListView mAdsCatalogsList;
    protected TypefaceTextView mSelectStoreBtn;
    protected TypefaceTextView mStoreAddress;
    protected TypefaceTextView mStoreName;

    public LocalAdsCatalogsFragment()
    {
        b = new SparseIntArray();
        f = 3;
    }

    private void V()
    {
        android.content.SharedPreferences.Editor editor = e.edit();
        editor.putLong("promotionsDownloadTime", Calendar.getInstance().getTimeInMillis());
        editor.apply();
    }

    private void W()
    {
        com.jcp.b.a.b(i(), a(0x7f070317));
    }

    private void X()
    {
        com.jcp.b.a.i();
    }

    private boolean Z()
    {
        long l = e.getLong("promotionsDownloadTime", 0L);
        return l == 0L || br.a(l, 24);
    }

    private void c(String s1)
    {
        s1 = ai.a().a(s1);
        s1 = new LocalAdsCatalogAdapter(i(), s1, this);
        mAdsCatalogsList.setAdapter(s1);
    }

    private int d(String s1)
    {
        return b.get(s1.hashCode(), 2);
    }

    private void e(String s1)
    {
        g.a().e(s1);
        com.jcp.a.a a1 = new com.jcp.a.a(i());
        a1.a(this);
        a1.a(false);
        a1.a(75);
        a1.execute(new String[] {
            s1
        });
    }

    public void U()
    {
        Stores stores = ai.a().b();
        String s1;
        if (stores != null)
        {
            String s2 = stores.getId();
            s1 = s2;
            if (!TextUtils.isEmpty(s2))
            {
                mStoreName.setText(stores.getName());
                mStoreAddress.setText(stores.getStoreFullAddress());
                mSelectStoreBtn.setText(i().getString(0x7f0700e5));
                s1 = s2;
            }
        } else
        {
            mStoreName.setText(i().getString(0x7f0702b1));
            mStoreAddress.setText(i().getString(0x7f0702b0));
            mSelectStoreBtn.setText(i().getString(0x7f0703be));
            s1 = ai.a().c();
        }
        if (ai.a().b(s1) && !Z())
        {
            c(s1);
            return;
        } else
        {
            g.a().d();
            ai.a().d();
            DownloadResultReceiver downloadresultreceiver = new DownloadResultReceiver(new Handler());
            downloadresultreceiver.a(this);
            Intent intent = new Intent(i(), com/jcp/util/JCPLocalAdsDownloadService);
            intent.putExtra("storeCode", s1);
            intent.putExtra("resultReceiver", downloadresultreceiver);
            i().startService(intent);
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030036, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        e = i().getSharedPreferences("com.jcp.activities", 0);
        U();
        if (JCP.s().c())
        {
            viewgroup = new q(i());
            viewgroup.a(this);
            viewgroup.e();
        }
        return layoutinflater;
    }

    protected String a()
    {
        return j().getString(0x7f070075);
    }

    public void a(int i, Bundle bundle)
    {
        i;
        JVM INSTR tableswitch 0 5: default 40
    //                   0 41
    //                   1 51
    //                   2 179
    //                   3 81
    //                   4 102
    //                   5 325;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        f = 0;
        W();
        return;
_L3:
        X();
        if (bundle != null && bundle.containsKey("storeCode"))
        {
            bundle = bundle.getString("storeCode");
        } else
        {
            bundle = null;
        }
        c(bundle);
        return;
_L5:
        bundle = bundle.getString("publicationId");
        b.put(bundle.hashCode(), 0);
        return;
_L6:
        bundle = bundle.getString("publicationId");
        b.put(bundle.hashCode(), 1);
        if (c && bundle.equalsIgnoreCase(d))
        {
            X();
            if (i() instanceof MainActivity)
            {
                ((MainActivity)i()).e(d);
            }
            c = false;
            d = null;
            return;
        }
          goto _L1
_L4:
        X();
        f = 2;
        if (bundle.containsKey("publicationId") && c && d.equalsIgnoreCase(bundle.getString("publicationId")))
        {
            k.a(i(), i().getResources().getString(0x7f0702a6), i().getResources().getString(0x7f0702b7));
            return;
        }
        if (bundle.containsKey("errorMessage"))
        {
            k.a(i(), i().getString(0x7f07017c), bundle.getString("errorMessage"));
            return;
        } else
        {
            k.a(i(), i().getResources().getString(0x7f0702a6), i().getResources().getString(0x7f0702b7));
            return;
        }
_L7:
        f = 1;
        ae.e(a, "All Publications data is loaded");
        V();
        return;
    }

    public void a(View view, String s1)
    {
        int i = d(s1);
        if (f == 0 && i == 2 || i == 0)
        {
            W();
            c = true;
            d = s1;
        } else
        if (i == 1 || ai.a().c(s1))
        {
            if (i() instanceof MainActivity)
            {
                ((MainActivity)i()).e(s1);
                return;
            }
        } else
        {
            e(s1);
            return;
        }
    }

    public void a(GetAccountResponse getaccountresponse, int i)
    {
    }

    public void a(String s1, int i)
    {
        X();
        k.a(i(), i().getResources().getString(0x7f0702a6), i().getResources().getString(0x7f0702b7));
    }

    public void a(String s1, String s2, int i)
    {
    }

    public void a(List list, int i)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int i)
    {
    }

    public void a(ProfilePojo aprofilepojo[], int i)
    {
    }

    public void a_(String s1, int i)
    {
    }

    public void a_(List list, int i)
    {
        if (list != null && list.size() != 0)
        {
            android.content.SharedPreferences.Editor editor = e.edit();
            editor.putString("storeList", (new j()).a(list.get(0)));
            editor.commit();
            U();
        }
    }

    public void a_(ProfilePojo aprofilepojo[], int i)
    {
        if (aprofilepojo == null || aprofilepojo.length <= 0) goto _L2; else goto _L1
_L1:
        i = 0;
_L7:
        if (i >= aprofilepojo.length) goto _L2; else goto _L3
_L3:
        String s1 = aprofilepojo[i].getIsDefault();
        if (s1 == null || s1.isEmpty() || !"true".equalsIgnoreCase(s1)) goto _L5; else goto _L4
_L4:
        e e1 = new e(i());
        e1.a(this);
        if (!TextUtils.isEmpty(aprofilepojo[i].getStoreNumber()))
        {
            e1.a(aprofilepojo[i].getStoreNumber());
        }
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b()
    {
        a(j().getString(0x7f070075));
        super.b();
    }

    public void b(String s1)
    {
        if (i() instanceof MainActivity)
        {
            ((MainActivity)i()).e(s1);
        }
    }

    public void b(String s1, int i)
    {
    }

}
