// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.adapters.bt;
import com.jcp.b.b;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.g.a;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, ck, AddCreditCardFragment, t, 
//            o, cl

public class PrimaryAddressFragment extends s
    implements aa
{

    private boolean a;
    protected ListView additonalAddressListview;
    protected RelativeLayout additonalHeader;
    private ActionBar b;
    private a c;
    private q d;
    private List e;
    private List f;
    private bt g;
    private com.jcp.e.b h;
    private boolean i;
    protected ListView primaryAddressListview;

    public PrimaryAddressFragment()
    {
    }

    private void U()
    {
        b.setDisplayShowHomeEnabled(true);
        b.setDisplayShowTitleEnabled(true);
        View view = LayoutInflater.from(i()).inflate(0x7f030041, null);
        TextView textview = (TextView)view.findViewById(0x7f0e01e0);
        ((ImageView)view.findViewById(0x7f0e01e1)).setOnClickListener(new ck(this));
        textview.setText(a(0x7f070074));
        b.setCustomView(view);
        b.setDisplayShowCustomEnabled(true);
    }

    private void V()
    {
        d = new q(i());
        d.a(this);
        d.a(47);
    }

    static boolean a(PrimaryAddressFragment primaryaddressfragment)
    {
        return primaryaddressfragment.a;
    }

    static boolean b(PrimaryAddressFragment primaryaddressfragment)
    {
        return primaryaddressfragment.i;
    }

    static List c(PrimaryAddressFragment primaryaddressfragment)
    {
        return primaryaddressfragment.f;
    }

    static q d(PrimaryAddressFragment primaryaddressfragment)
    {
        return primaryaddressfragment.d;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03002b, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        b = i().getActionBar();
        U();
        d = new q(i());
        d.a(this);
        c = JCP.e();
        e = new ArrayList();
        f = new ArrayList();
        a(c.e());
        viewgroup = h();
        if (viewgroup != null)
        {
            if (viewgroup.containsKey("isFromCard"))
            {
                a = viewgroup.getBoolean("isFromCard");
                com.jcp.b.b.b(a);
                return layoutinflater;
            } else
            {
                com.jcp.b.b.b(false);
                return layoutinflater;
            }
        } else
        {
            com.jcp.b.b.b(false);
            return layoutinflater;
        }
    }

    protected String a()
    {
        return "PRIMARYADDRESS";
    }

    public void a(Activity activity)
    {
        super.a(activity);
        h = (com.jcp.e.b)activity;
    }

    public void a(GetAccountResponse getaccountresponse, int j)
    {
    }

    public void a(String s1, String s2, int j)
    {
    }

    public void a(List list)
    {
        if (list == null) goto _L2; else goto _L1
_L1:
        i = false;
        c.a(list);
        if (!e.isEmpty())
        {
            e.clear();
        }
        if (!f.isEmpty())
        {
            f.clear();
        }
        for (list = list.iterator(); list.hasNext();)
        {
            GetAddressResponseModel getaddressresponsemodel = (GetAddressResponseModel)list.next();
            if (getaddressresponsemodel.isDefault())
            {
                e.add(getaddressresponsemodel);
            } else
            {
                f.add(getaddressresponsemodel);
            }
        }

        if (!f.isEmpty()) goto _L4; else goto _L3
_L3:
        additonalHeader.setVisibility(8);
_L5:
        list = new bt(i(), e);
        g = new bt(i(), f);
        primaryAddressListview.setAdapter(list);
        additonalAddressListview.setAdapter(g);
        return;
_L4:
        if (additonalHeader.getVisibility() == 8)
        {
            additonalHeader.setVisibility(0);
        }
        if (true) goto _L5; else goto _L2
_L2:
        i = true;
        return;
    }

    public void a(List list, int j)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int j)
    {
        if (agetaddressresponsemodel != null)
        {
            c.a(null);
            c.a(Arrays.asList(agetaddressresponsemodel));
            a(c.e());
        }
    }

    public void a_(String s1, int j)
    {
        if (j == 12)
        {
            f.remove(com.jcp.b.b.g());
            g.notifyDataSetChanged();
            com.jcp.g.a.d(true);
        }
    }

    public void a_(ProfilePojo aprofilepojo[], int j)
    {
    }

    public void b()
    {
        a(a(0x7f070074));
        super.b();
        U();
        V();
    }

    public void d()
    {
        O();
        super.d();
    }

    public void f_()
    {
        super.f_();
        if (com.jcp.b.a.g())
        {
            com.jcp.b.a.h(false);
            com.jcp.b.a.d(true);
            V();
        }
    }

    protected void onAdditionalAddressListItemClick(int j)
    {
        Object obj = (GetAddressResponseModel)f.get(j);
        if (a)
        {
            String s1 = ((GetAddressResponseModel) (obj)).getAddressLineOne();
            String s2 = ((GetAddressResponseModel) (obj)).getState();
            String s3 = ((GetAddressResponseModel) (obj)).getZip();
            obj = ((GetAddressResponseModel) (obj)).getId();
            s1 = (new StringBuilder()).append(s1).append(" ").append(s2).append(" ").append(s3).toString();
            h.b(s1);
            h.c(((String) (obj)));
            b.n = true;
            obj = a(i());
            if (obj != null)
            {
                ((t) (obj)).c(new AddCreditCardFragment(), "AddCreditCardFragment");
            }
        } else
        {
            o o1 = new o();
            Bundle bundle = new Bundle();
            if (((GetAddressResponseModel) (obj)).getMilitaryAddressType() != null && !"".equals(((GetAddressResponseModel) (obj)).getMilitaryAddressType()))
            {
                bundle.putString("militaryAddressType", ((GetAddressResponseModel) (obj)).getMilitaryAddressType());
                bundle.putString("apoLpoOrUnitedAddressLayout", "apoLpoAddressLayout");
            } else
            {
                bundle.putString("apoLpoOrUnitedAddressLayout", "unitedAddressLayout");
                bundle.putString("City", ((GetAddressResponseModel) (obj)).getCity());
            }
            bundle.putString("Title", "editAddAddress");
            bundle.putString("FirstName", ((GetAddressResponseModel) (obj)).getFirstName());
            bundle.putString("LastName", ((GetAddressResponseModel) (obj)).getLastName());
            bundle.putString("AddressLineOne", ((GetAddressResponseModel) (obj)).getAddressLineOne());
            bundle.putString("ZipCode", ((GetAddressResponseModel) (obj)).getZip());
            bundle.putString("State", ((GetAddressResponseModel) (obj)).getState());
            bundle.putString("Phone", ((GetAddressResponseModel) (obj)).getPhone());
            bundle.putString("ADDRESS_ID", ((GetAddressResponseModel) (obj)).getId());
            bundle.putBoolean("IsDefault", ((GetAddressResponseModel) (obj)).isDefault());
            bundle.putString("Company", ((GetAddressResponseModel) (obj)).getCompany());
            bundle.putString("AddressLineTwo", ((GetAddressResponseModel) (obj)).getAddressLineTwo());
            o1.g(bundle);
            obj = a(i());
            if (obj != null)
            {
                ((t) (obj)).c(o1, "AddAddressFragment");
                return;
            }
        }
    }

    protected boolean onAdditionalAddressListItemLongClick(int j)
    {
        Dialog dialog = new Dialog(i());
        dialog.requestWindowFeature(1);
        dialog.setContentView(0x7f030055);
        ((LinearLayout)dialog.findViewById(0x7f0e0221)).setOnClickListener(new cl(this, j, dialog));
        dialog.show();
        return true;
    }

    protected void onPrimaryAddressListItemClick(int j)
    {
        Object obj = (GetAddressResponseModel)e.get(j);
        if (a)
        {
            String s1 = ((GetAddressResponseModel) (obj)).getAddressLineOne();
            String s2 = ((GetAddressResponseModel) (obj)).getState();
            String s3 = ((GetAddressResponseModel) (obj)).getZip();
            obj = ((GetAddressResponseModel) (obj)).getId();
            s1 = (new StringBuilder()).append(s1).append(" ").append(s2).append(" ").append(s3).toString();
            h.b(s1);
            h.c(((String) (obj)));
            b.n = true;
            obj = a(i());
            if (obj != null)
            {
                ((t) (obj)).c(new AddCreditCardFragment(), "AddCreditCardFragment");
            }
        } else
        {
            o o1 = new o();
            Bundle bundle = new Bundle();
            if (((GetAddressResponseModel) (obj)).getMilitaryAddressType() != null && !"".equals(((GetAddressResponseModel) (obj)).getMilitaryAddressType()))
            {
                bundle.putString(j().getString(0x7f070293), ((GetAddressResponseModel) (obj)).getMilitaryAddressType());
                bundle.putString(j().getString(0x7f07007e), "apoLpoAddressLayout");
            } else
            {
                bundle.putString(j().getString(0x7f07007e), "unitedAddressLayout");
                bundle.putString(j().getString(0x7f0700f2), ((GetAddressResponseModel) (obj)).getCity());
            }
            bundle.putString(j().getString(0x7f070436), "editAddAddress");
            bundle.putString(j().getString(0x7f0701df), ((GetAddressResponseModel) (obj)).getFirstName());
            bundle.putString(j().getString(0x7f070269), ((GetAddressResponseModel) (obj)).getLastName());
            bundle.putString(j().getString(0x7f070071), ((GetAddressResponseModel) (obj)).getAddressLineOne());
            bundle.putString(j().getString(0x7f070073), ((GetAddressResponseModel) (obj)).getAddressLineTwo());
            bundle.putString(j().getString(0x7f070485), ((GetAddressResponseModel) (obj)).getZip());
            bundle.putString(j().getString(0x7f07040b), ((GetAddressResponseModel) (obj)).getState());
            bundle.putString(j().getString(0x7f070305), ((GetAddressResponseModel) (obj)).getPhone());
            bundle.putString(j().getString(0x7f07006f), ((GetAddressResponseModel) (obj)).getId());
            bundle.putBoolean(j().getString(0x7f070245), ((GetAddressResponseModel) (obj)).isDefault());
            bundle.putString(j().getString(0x7f070116), ((GetAddressResponseModel) (obj)).getCompany());
            o1.g(bundle);
            obj = a(i());
            if (obj != null)
            {
                ((t) (obj)).c(o1, "AddAddressFragment");
                return;
            }
        }
    }
}
