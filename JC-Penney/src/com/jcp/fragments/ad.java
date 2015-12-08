// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.jcp.activities.JCPWebViewActivity;
import com.jcp.adapters.au;
import com.jcp.util.bv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, af, ag, ae

public class ad extends s
{

    private List a;

    public ad()
    {
        a = new ArrayList();
    }

    static void a(ad ad1, String s1)
    {
        ad1.b(s1);
    }

    static void a(ad ad1, String s1, String s2)
    {
        ad1.a(s1, s2);
    }

    private void a(String s1, String s2)
    {
        Intent intent = new Intent(i(), com/jcp/activities/JCPWebViewActivity);
        intent.putExtra("title", bv.b(s1));
        intent.putExtra("weburl", s2);
        a(intent);
    }

    private void b(String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(i());
        builder.setMessage(j().getString(0x7f0701cc));
        builder.setPositiveButton(0x7f070049, new af(this, s1));
        builder.setNegativeButton(0x7f070041, new ag(this));
        builder.create().show();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        layoutinflater = layoutinflater.inflate(0x7f030065, viewgroup, false);
        a.add(new com.jcp.util.ad(0x7f0200dc, j().getString(0x7f070122)));
        a.add(new com.jcp.util.ad(0x7f020160, j().getString(0x7f07026d)));
        a.add(new com.jcp.util.ad(0x7f02015b, j().getString(0x7f070139)));
        a.add(new com.jcp.util.ad(0x7f02018c, j().getString(0x7f0702f4)));
        a.add(new com.jcp.util.ad(0x7f0201f3, j().getString(0x7f0703e6)));
        a.add(new com.jcp.util.ad(0x7f0201da, j().getString(0x7f07039c)));
        a.add(new com.jcp.util.ad(0x7f0201c1, j().getString(0x7f070353)));
        a.add(new com.jcp.util.ad(0x7f020108, j().getString(0x7f070205)));
        a.add(new com.jcp.util.ad(0x7f0201ac, j().getString(0x7f070339)));
        a.add(new com.jcp.util.ad(0x7f020080, j().getString(0x7f070418)));
        a.add(new com.jcp.util.ad(0x7f0201ad, j().getString(0x7f070326)));
        viewgroup = (GridView)layoutinflater.findViewById(0x7f0e0269);
        viewgroup.setAdapter(new au(i(), 0x7f03005a, a));
        viewgroup.setOnItemClickListener(new ae(this));
        a(a(0x7f070143), ((android.app.Activity) (i())));
        return layoutinflater;
    }

    protected String a()
    {
        return "CUSTOMERSERVICE";
    }

    public void b()
    {
        a(a(0x7f070143));
        super.b();
    }

    public void f_()
    {
        super.f_();
        if (i() != null)
        {
            i().findViewById(0x7f0e0164).setVisibility(8);
        }
    }
}
