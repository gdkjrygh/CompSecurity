// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.jcp.JCP;
import com.jcp.h.f;
import com.jcp.util.af;
import com.jcp.util.ap;
import com.jcp.util.au;
import com.jcp.views.JCPWebView;

// Referenced classes of package com.jcp.fragments:
//            s, v, aa, z, 
//            y, w, x, ab

public class u extends s
{

    private static final String a = com/jcp/fragments/u.getName();
    private JCPWebView b;
    private String c;
    private int d;
    private boolean e;
    private ImageView f;
    private boolean g;
    private android.view.View.OnKeyListener h;

    public u()
    {
        h = new v(this);
    }

    private void U()
    {
        if (i() != null)
        {
            Intent intent = new Intent();
            intent.putExtra("checkout", Boolean.TRUE);
            intent.putExtra("type", "ActionBar");
            i().setResult(1000, intent);
            i().finish();
        }
    }

    private int V()
    {
        int j = -1;
        if (i() != null)
        {
            Display display = i().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            display.getSize(point);
            j = point.y;
        }
        return j;
    }

    private void W()
    {
        if (i() == null || !n())
        {
            return;
        }
        if (b != null)
        {
            WebSettings websettings = b.getSettings();
            websettings.setJavaScriptEnabled(true);
            b.setInitialScale(1);
            websettings.setLoadWithOverviewMode(true);
            websettings.setUseWideViewPort(true);
            b.setWebViewClient(new aa(this, null));
            b.loadUrl(c);
            return;
        } else
        {
            Toast.makeText(i(), a(0x7f07005d), 0).show();
            return;
        }
    }

    private void X()
    {
        if (b != null)
        {
            b.clearHistory();
            b.clearCache(true);
            b = null;
        }
    }

    private void Z()
    {
        au.a(i(), j().getString(0x7f0700ef), new z(this));
    }

    static int a(u u1, int j)
    {
        u1.d = j;
        return j;
    }

    private void a(RelativeLayout relativelayout)
    {
        int j = V();
        if (-1 != j)
        {
            relativelayout.post(new y(this, j, relativelayout));
        }
    }

    static void a(u u1)
    {
        u1.X();
    }

    static void a(u u1, boolean flag)
    {
        u1.b(flag);
    }

    private void b(boolean flag)
    {
        if (i() != null)
        {
            Intent intent = new Intent();
            intent.putExtra("checkout", Boolean.TRUE);
            intent.putExtra("type", "drawer");
            if (flag)
            {
                intent.putExtra("position", 1);
            } else
            {
                intent.putExtra("position", 0);
            }
            i().setResult(1000, intent);
            i().finish();
        }
    }

    static boolean b(u u1)
    {
        return u1.e;
    }

    static boolean b(u u1, boolean flag)
    {
        u1.g = flag;
        return flag;
    }

    static void c(u u1)
    {
        u1.U();
    }

    static boolean c(u u1, boolean flag)
    {
        u1.e = flag;
        return flag;
    }

    static void d(u u1)
    {
        u1.W();
    }

    static ImageView e(u u1)
    {
        return u1.f;
    }

    static boolean f(u u1)
    {
        return u1.g;
    }

    static void g(u u1)
    {
        u1.Z();
    }

    static JCPWebView h(u u1)
    {
        return u1.b;
    }

    static int i(u u1)
    {
        return u1.d;
    }

    protected f S()
    {
        f f1 = null;
        if (!JCP.s().c())
        {
            f1 = com.jcp.h.f.a();
        }
        return f1;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030064, viewgroup, false);
        viewgroup = h();
        if (viewgroup != null)
        {
            c = viewgroup.getString("url");
        }
        b = (JCPWebView)layoutinflater.findViewById(0x7f0e0268);
        b.setOnKeyListener(h);
        b.setVisibility(8);
        a((RelativeLayout)layoutinflater.findViewById(0x7f0e0155));
        f = (ImageView)layoutinflater.findViewById(0x7f0e0095);
        f.setEnabled(false);
        f.setOnClickListener(new w(this));
        viewgroup = CookieManager.getInstance();
        viewgroup.setAcceptCookie(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            viewgroup.removeAllCookies(new x(this, viewgroup));
            return layoutinflater;
        } else
        {
            (new ab(this, viewgroup)).execute(new Void[0]);
            return layoutinflater;
        }
    }

    protected String a()
    {
        return "CHECKOUT";
    }

    protected void b(CookieManager cookiemanager)
    {
        String s1 = ap.b(i());
        if (!TextUtils.isEmpty(s1))
        {
            cookiemanager.setCookie(".jcpenney.com", (new StringBuilder()).append("SELECTED_PICKUP_STORE=").append(s1).toString());
            cookiemanager.setCookie(".jcpenney.com", (new StringBuilder()).append("PICKUP_STORE_SEARCH=").append(ap.d(i())).toString());
            cookiemanager.setCookie(".jcpenney.com", (new StringBuilder()).append("PICKUP_STORE_LOCKED=").append(ap.c(i())).toString());
        }
        a(cookiemanager);
    }

    public void f()
    {
        X();
        super.f();
    }

}
