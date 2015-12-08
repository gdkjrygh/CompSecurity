// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.g.a;
import com.jcp.model.CardDetails;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.util.au;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            s, fs, ft, fy, 
//            fw, fm, fo, fr, 
//            fu

public class SavedCardFragment extends s
    implements aa
{

    private static q aj;
    private ListView a;
    private boolean ak;
    private boolean al;
    private int am;
    private TextView an;
    private TextView ao;
    private TextView ap;
    private LinearLayout aq;
    private LinearLayout ar;
    private LinearLayout as;
    private ListView b;
    private List c;
    private List d;
    private fw e;
    private fy f;
    private LinearLayout g;
    private LinearLayout h;
    private ImageView i;

    public SavedCardFragment()
    {
    }

    static q V()
    {
        return aj;
    }

    static int a(SavedCardFragment savedcardfragment, int j)
    {
        savedcardfragment.am = j;
        return j;
    }

    static LinearLayout a(SavedCardFragment savedcardfragment, LinearLayout linearlayout)
    {
        savedcardfragment.aq = linearlayout;
        return linearlayout;
    }

    static TextView a(SavedCardFragment savedcardfragment, TextView textview)
    {
        savedcardfragment.ap = textview;
        return textview;
    }

    static List a(SavedCardFragment savedcardfragment)
    {
        return savedcardfragment.c;
    }

    static void a(SavedCardFragment savedcardfragment, String s1)
    {
        savedcardfragment.c(s1);
    }

    static void a(SavedCardFragment savedcardfragment, Map map, String s1)
    {
        savedcardfragment.a(map, s1);
    }

    private void a(Map map, String s1)
    {
        aj.a(map, s1);
    }

    static boolean a(SavedCardFragment savedcardfragment, boolean flag)
    {
        savedcardfragment.ak = flag;
        return flag;
    }

    static LinearLayout b(SavedCardFragment savedcardfragment)
    {
        return savedcardfragment.aq;
    }

    static LinearLayout b(SavedCardFragment savedcardfragment, LinearLayout linearlayout)
    {
        savedcardfragment.ar = linearlayout;
        return linearlayout;
    }

    static TextView b(SavedCardFragment savedcardfragment, TextView textview)
    {
        savedcardfragment.an = textview;
        return textview;
    }

    static boolean b(SavedCardFragment savedcardfragment, boolean flag)
    {
        savedcardfragment.al = flag;
        return flag;
    }

    static LinearLayout c(SavedCardFragment savedcardfragment, LinearLayout linearlayout)
    {
        savedcardfragment.as = linearlayout;
        return linearlayout;
    }

    static TextView c(SavedCardFragment savedcardfragment, TextView textview)
    {
        savedcardfragment.ao = textview;
        return textview;
    }

    static List c(SavedCardFragment savedcardfragment)
    {
        return savedcardfragment.d;
    }

    private void c(String s1)
    {
        au.a(i(), a(0x7f070161), a(0x7f070119), a(0x7f070049), a(0x7f070041), new fs(this, s1), new ft(this));
    }

    static LinearLayout d(SavedCardFragment savedcardfragment)
    {
        return savedcardfragment.ar;
    }

    static LinearLayout e(SavedCardFragment savedcardfragment)
    {
        return savedcardfragment.as;
    }

    public void U()
    {
        f = new fy(this);
        a.setAdapter(f);
        e = new fw(this, d);
        b.setAdapter(e);
        if (c.size() > 0)
        {
            g.setVisibility(0);
            a.setVisibility(0);
        } else
        {
            g.setVisibility(8);
            a.setVisibility(8);
        }
        if (d.size() > 0)
        {
            b.setVisibility(0);
            h.setVisibility(0);
            if (c.size() <= 0)
            {
                h.setVisibility(8);
            }
            return;
        } else
        {
            h.setVisibility(8);
            b.setVisibility(8);
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300da, viewgroup, false);
        b();
        aj = new q(i());
        aj.a(this);
        aj.d();
        g = (LinearLayout)layoutinflater.findViewById(0x7f0e0460);
        h = (LinearLayout)layoutinflater.findViewById(0x7f0e0464);
        a = (ListView)layoutinflater.findViewById(0x7f0e0462);
        b = (ListView)layoutinflater.findViewById(0x7f0e0466);
        i = (ImageView)layoutinflater.findViewById(0x7f0e0467);
        a.setOnItemLongClickListener(new fm(this));
        b.setOnItemLongClickListener(new fo(this));
        return layoutinflater;
    }

    protected String a()
    {
        return "SAVEDCARD";
    }

    public void a(GetAccountResponse getaccountresponse, int j)
    {
    }

    public void a(String s1, String s2, int j)
    {
        if (i() == null || !n())
        {
            return;
        } else
        {
            b(s2);
            return;
        }
    }

    public void a(List list, int j)
    {
        c = new ArrayList();
        d = new ArrayList();
        j = 0;
        while (j < list.size()) 
        {
            CardDetails carddetails = (CardDetails)list.get(j);
            if (carddetails.isDefault())
            {
                c.add(carddetails);
            } else
            {
                d.add(carddetails);
            }
            j++;
        }
        if (i() != null)
        {
            U();
        }
        i.setVisibility(8);
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int j)
    {
    }

    public void a_(String s1, int j)
    {
        if (!al) goto _L2; else goto _L1
_L1:
        al = false;
        com.jcp.g.a.b(true);
        aj.d();
_L4:
        return;
_L2:
        com.jcp.g.a.a(true);
        if (!ak)
        {
            break; /* Loop/switch isn't completed */
        }
        c.remove(am);
        f.notifyDataSetChanged();
        if (c.size() == 0 && d.size() > 0 || c.size() == 0 && d.size() == 0)
        {
            g.setVisibility(8);
            h.setVisibility(8);
        }
_L5:
        if (c.size() == 0 && d.size() == 0)
        {
            i.setVisibility(0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        d.remove(am);
        e.notifyDataSetChanged();
        if (d.size() == 0 && c.size() > 0)
        {
            if (g.getVisibility() == 0)
            {
                h.setVisibility(8);
            }
        } else
        if (d.size() == 0 && c.size() == 0)
        {
            g.setVisibility(8);
            h.setVisibility(8);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a_(ProfilePojo aprofilepojo[], int j)
    {
    }

    public void b()
    {
        i().getActionBar().show();
        ActionBar actionbar = i().getActionBar();
        actionbar.setDisplayShowTitleEnabled(true);
        View view = LayoutInflater.from(i()).inflate(0x7f030041, null);
        ((TextView)view.findViewById(0x7f0e01e0)).setText(j().getString(0x7f07039f));
        actionbar.setCustomView(view);
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setDisplayShowCustomEnabled(true);
        ((ImageView)view.findViewById(0x7f0e01e1)).setOnClickListener(new fr(this));
    }

    public void b(String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setMessage(s1);
        builder.setTitle(0x7f0701bb);
        builder.setPositiveButton(0x7f070049, new fu(this));
        if (!i().isFinishing())
        {
            builder.show();
        }
    }
}
