// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.widget.TextView;
import com.jcp.JCP;
import com.jcp.h.b;
import com.jcp.util.bq;
import com.jcp.widget.JCPActionBar;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            cg, t

public abstract class s extends cg
{

    private String a;
    private boolean b;
    private JCPActionBar c;
    private ActionBar d;

    public s()
    {
    }

    public static t a(ac ac1)
    {
        if (ac1 != null && (ac1 instanceof t))
        {
            return (t)ac1;
        } else
        {
            return null;
        }
    }

    private void a(Fragment fragment, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean(s1, true);
        fragment.g(bundle);
    }

    private boolean b(String s1)
    {
        boolean flag = false;
        Bundle bundle = h();
        if (bundle != null)
        {
            flag = bundle.getBoolean(s1, false);
        }
        return flag;
    }

    protected void O()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)i().getSystemService("input_method");
        View view = i().getCurrentFocus();
        if (view != null && view.getWindowToken() != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void P()
    {
        if (c == null && i() != null)
        {
            d = i().getActionBar();
            if (d != null && (d.getCustomView() instanceof JCPActionBar))
            {
                c = (JCPActionBar)d.getCustomView();
            }
        }
        if (c != null)
        {
            c.a();
        }
        if (i() != null)
        {
            i().invalidateOptionsMenu();
        }
    }

    protected boolean Q()
    {
        return b("intent_from_rewards_landing_page");
    }

    protected boolean R()
    {
        return b("intent_from_shopping_bag_page");
    }

    protected void a(Fragment fragment)
    {
        a(fragment, "intent_from_rewards_landing_page");
    }

    protected void a(CookieManager cookiemanager)
    {
        HttpCookie httpcookie;
        for (Iterator iterator = JCP.h().iterator(); iterator.hasNext(); cookiemanager.setCookie(".jcpenney.com", (new StringBuilder()).append(httpcookie.getName()).append("=").append(httpcookie.getValue()).toString()))
        {
            httpcookie = (HttpCookie)iterator.next();
        }

        com.jcp.h.b.a(cookiemanager);
    }

    protected void a(String s1)
    {
        a = s1;
        if (i() != null && i().getActionBar() != null && !bq.a(s1))
        {
            i().getActionBar().show();
        }
    }

    public void a(String s1, Activity activity)
    {
        if (activity == null || activity.getActionBar() == null)
        {
            return;
        }
        if (d == null || c == null)
        {
            d = activity.getActionBar();
            d.setDisplayHomeAsUpEnabled(true);
            d.setHomeButtonEnabled(true);
            d.setDisplayShowTitleEnabled(false);
            d.setDisplayUseLogoEnabled(false);
            d.setBackgroundDrawable(new ColorDrawable(-1));
            d.setDisplayShowCustomEnabled(true);
            d.setIcon(0x7f0d000e);
            c = new JCPActionBar(i());
        }
        d.setCustomView(c);
        c.setTitle(s1);
        a(s1);
        P();
    }

    protected void a(boolean flag)
    {
        b = flag;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        View view;
        if (!TextUtils.isEmpty(a))
        {
            a(a, i());
        }
        view = i().findViewById(0x7f0e0164);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        TextView textview;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        textview = (TextView)i().findViewById(0x7f0e045d);
        if (textview == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        textview.setText(0x7f0703b4);
        view.setVisibility(0);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        view.setVisibility(8);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void b(Fragment fragment)
    {
        a(fragment, "intent_from_shopping_bag_page");
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        ((InputMethodManager)i().getSystemService("input_method")).hideSoftInputFromWindow(r().getWindowToken(), 0);
    }

    public void f_()
    {
        super.f_();
        b();
    }
}
