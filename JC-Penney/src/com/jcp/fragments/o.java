// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jcp.adapters.r;
import com.jcp.b.b;
import com.jcp.c.c;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.h;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.util.au;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            s, p, q, r, 
//            AddCreditCardFragment, t

public class o extends s
    implements android.view.View.OnClickListener, aa, h
{

    public static final String a = com/jcp/fragments/o.getSimpleName();
    private boolean aj;
    private boolean ak;
    private q al;
    private com.jcp.e.b am;
    private String b;
    private c c;
    private Map d;
    private ViewPager e;
    private r f;
    private Bundle g;
    private int h;
    private View i;

    public o()
    {
    }

    private void U()
    {
        e.setOnPageChangeListener(new p(this));
    }

    private void V()
    {
        i.findViewById(0x7f0e0342).setVisibility(0);
        i.findViewById(0x7f0e0343).setVisibility(4);
        h = 0;
    }

    private void W()
    {
        i.findViewById(0x7f0e0342).setVisibility(4);
        i.findViewById(0x7f0e0343).setVisibility(0);
        h = 1;
    }

    private int X()
    {
        boolean flag = false;
        if (!"addAddress".equals(b)) goto _L2; else goto _L1
_L1:
        int l = ((flag) ? 1 : 0);
_L4:
        h = l;
        return l;
_L2:
        l = ((flag) ? 1 : 0);
        if ("editAddAddress".equals(b))
        {
            String s1 = g.getString("apoLpoOrUnitedAddressLayout");
            l = ((flag) ? 1 : 0);
            if (!"unitedAddressLayout".equals(s1))
            {
                l = ((flag) ? 1 : 0);
                if ("apoLpoAddressLayout".equals(s1))
                {
                    l = 1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void Z()
    {
        Object obj = i().getActionBar();
        if (obj == null)
        {
            return;
        }
        ((ActionBar) (obj)).setDisplayShowHomeEnabled(true);
        ((ActionBar) (obj)).setDisplayShowTitleEnabled(true);
        ((ActionBar) (obj)).setCustomView(0x7f030040);
        obj = ((ActionBar) (obj)).getCustomView();
        TextView textview = (TextView)((View) (obj)).findViewById(0x7f0e01de);
        if (b.equals("addAddress"))
        {
            textview.setText(i().getResources().getString(0x7f07005f));
        } else
        {
            textview.setText(i().getResources().getString(0x7f070189));
        }
        obj = (TextView)((View) (obj)).findViewById(0x7f0e01df);
        ((TextView) (obj)).setText("Save");
        ((TextView) (obj)).setOnClickListener(new com.jcp.fragments.q(this));
    }

    static q a(o o1, q q1)
    {
        o1.al = q1;
        return q1;
    }

    static Map a(o o1, Map map)
    {
        o1.d = map;
        return map;
    }

    static void a(o o1)
    {
        o1.V();
    }

    static void b(o o1)
    {
        o1.W();
    }

    private void b(String s1, int l)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setTitle(a(0x7f070416));
        builder.setMessage(s1);
        builder.setPositiveButton(0x7f070049, new com.jcp.fragments.r(this, l));
        builder.create().show();
    }

    static c c(o o1)
    {
        return o1.c;
    }

    static int d(o o1)
    {
        return o1.h;
    }

    static r e(o o1)
    {
        return o1.f;
    }

    static String f(o o1)
    {
        return o1.b;
    }

    static Map g(o o1)
    {
        return o1.d;
    }

    static Bundle h(o o1)
    {
        return o1.g;
    }

    static boolean i(o o1)
    {
        return o1.ak;
    }

    static boolean j(o o1)
    {
        return o1.aj;
    }

    static q k(o o1)
    {
        return o1.al;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i = layoutinflater.inflate(0x7f030084, viewgroup, false);
        c = com.jcp.c.c.a(i());
        g = h();
        b = g.getString("Title");
        if (g != null)
        {
            if (g.containsKey("isFromCard"))
            {
                aj = g.getBoolean("isFromCard");
            }
            if (g.containsKey("isAddressNull"))
            {
                ak = g.getBoolean("isAddressNull");
            }
        }
        com.jcp.b.b.a(ak);
        com.jcp.b.b.z(b);
        Z();
        e = (ViewPager)i.findViewById(0x7f0e031c);
        f = new r(i().f(), g);
        e.setAdapter(f);
        int l = X();
        e.setCurrentItem(l);
        ((TextView)i.findViewById(0x7f0e0319)).setOnClickListener(this);
        ((TextView)i.findViewById(0x7f0e031b)).setOnClickListener(this);
        U();
        if (g.containsKey("apoLpoOrUnitedAddressLayout"))
        {
            if ("unitedAddressLayout".equalsIgnoreCase(g.getString("apoLpoOrUnitedAddressLayout")))
            {
                V();
            } else
            {
                W();
            }
        }
        return i;
    }

    protected String a()
    {
        return "ADDNEWADDRESS";
    }

    public void a(Activity activity)
    {
        super.a(activity);
        am = (com.jcp.e.b)activity;
    }

    public void a(GetAccountResponse getaccountresponse, int l)
    {
    }

    public void a(String s1, String s2, int l)
    {
        if ("SRV_ERR_CITY_NOTFOUND_FOR_POSTALCODE".equals(s1))
        {
            au.a(i(), a(0x7f0701bb), a(0x7f0701b9));
            return;
        } else
        {
            au.a(i(), a(0x7f0701bb), s2);
            return;
        }
    }

    public void a(List list, int l)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int l)
    {
        String s1 = agetaddressresponsemodel[0].getAddressLineOne();
        String s2 = agetaddressresponsemodel[0].getState();
        String s3 = agetaddressresponsemodel[0].getZip();
        agetaddressresponsemodel = agetaddressresponsemodel[0].getId();
        s1 = (new StringBuilder()).append(s1).append(" ").append(s2).append(" ").append(s3).toString();
        am.b(s1);
        am.c(agetaddressresponsemodel);
        b.n = true;
        agetaddressresponsemodel = a(i());
        if (agetaddressresponsemodel != null)
        {
            agetaddressresponsemodel.c(new AddCreditCardFragment(), "AddCreditCardFragment");
        }
    }

    public void a_(String s1, int l)
    {
        if (l == 25 || l == 26)
        {
            b((new StringBuilder()).append("").append(j().getString(0x7f0702a0)).toString(), l);
        } else
        if (l == 27 || l == 28)
        {
            b((new StringBuilder()).append("").append(j().getString(0x7f07018a)).toString(), l);
            return;
        }
    }

    public void a_(ProfilePojo aprofilepojo[], int l)
    {
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131624730: 
        default:
            return;

        case 2131624729: 
            e.setCurrentItem(0);
            h = 0;
            return;

        case 2131624731: 
            e.setCurrentItem(1);
            break;
        }
        h = 1;
    }

}
