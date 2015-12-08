// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import com.jcp.b.a;
import com.jcp.h.f;
import com.jcp.util.ae;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.fragments:
//            s, fc, fb

public class fa extends s
{

    private static final String b = com/jcp/fragments/fa.getSimpleName();
    private int a;
    private ActionBar c;
    private View d;
    private String e;

    public fa()
    {
    }

    static int a(fa fa1)
    {
        return fa1.a;
    }

    static void a(fa fa1, int i)
    {
        fa1.b(i);
    }

    private void b(int i)
    {
        if (d != null)
        {
            d.setVisibility(i);
        }
    }

    protected f S()
    {
        return f.c();
    }

    protected String T()
    {
        return "Mobile|pg40028600007";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = i().getActionBar();
        if (c != null)
        {
            c.hide();
        }
        d = i().findViewById(0x7f0e0164);
        b(8);
        layoutinflater = layoutinflater.inflate(0x7f030073, viewgroup, false);
        bundle = h();
        viewgroup = bundle.getString("destinationURL");
        e = bundle.getString("COUPON_CODE");
        a = viewgroup.indexOf("jcpenney.com");
        ae.d(b, (new StringBuilder()).append("destinationUrl: ").append(viewgroup).toString());
        a(a(0x7f070425), ((android.app.Activity) (i())));
        bundle = (JCPWebView)layoutinflater.findViewById(0x7f0e02ba);
        bundle.getSettings().setJavaScriptEnabled(true);
        bundle.setWebViewClient(new fc(this, null));
        bundle.loadUrl(viewgroup);
        ((ImageView)layoutinflater.findViewById(0x7f0e0095)).setOnClickListener(new fb(this));
        com.jcp.b.a.a(i(), 0x7f070276);
        return layoutinflater;
    }

    protected String a()
    {
        return (new StringBuilder()).append("Promotion Landing Page:promo ").append(e).append("(").append("pg40028600007").append(")").toString();
    }

    public void b()
    {
        a(a(0x7f070425));
        super.b();
    }

    public void f_()
    {
        super.f_();
        if (i() != null)
        {
            b(8);
        }
    }

    public void u()
    {
        super.u();
        com.jcp.b.a.i();
        if (c != null)
        {
            c.show();
        }
        b(0);
        c = null;
        d = null;
    }

}
