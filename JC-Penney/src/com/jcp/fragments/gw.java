// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.jcp.activities.MainActivity;
import com.jcp.b.b;
import com.jcp.util.au;
import com.jcp.views.JCPWebView;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.fragments:
//            s, gx, hb, ha, 
//            gz, gy, hc

public class gw extends s
{

    private JCPWebView a;
    private int b;
    private ImageView c;
    private String d;
    private boolean e;
    private android.view.View.OnKeyListener f;

    public gw()
    {
        f = new gx(this);
    }

    private void U()
    {
        d = com.jcp.b.b.k();
        Bundle bundle = h();
        if (bundle != null)
        {
            String s1 = "";
            String s2 = "";
            if (bundle.containsKey("orderNumber"))
            {
                s1 = bundle.getString("orderNumber");
            }
            if (bundle.containsKey("phoneNumber"))
            {
                s2 = bundle.getString("phoneNumber");
            }
            d = String.format(d, new Object[] {
                s1, s2
            });
        }
    }

    private int V()
    {
        int i = -1;
        if (i() != null)
        {
            Display display = i().getWindowManager().getDefaultDisplay();
            Point point = new Point();
            display.getSize(point);
            i = point.y;
        }
        return i;
    }

    private void W()
    {
        WebSettings websettings = a.getSettings();
        websettings.setJavaScriptEnabled(true);
        a.setInitialScale(1);
        websettings.setLoadWithOverviewMode(true);
        websettings.setUseWideViewPort(true);
        a.setWebViewClient(new hb(this, null));
        a.loadUrl(d);
    }

    private void X()
    {
        if (i() != null)
        {
            Intent intent = new Intent(i(), com/jcp/activities/MainActivity);
            i().startActivity(intent);
            i().finish();
        }
    }

    private void Z()
    {
        au.a(i(), j().getString(0x7f0700ef), new ha(this));
    }

    static int a(gw gw1, int i)
    {
        gw1.b = i;
        return i;
    }

    private void a(RelativeLayout relativelayout)
    {
        int i = V();
        if (-1 != i)
        {
            relativelayout.post(new gz(this, i, relativelayout));
        }
    }

    static void a(gw gw1)
    {
        gw1.X();
    }

    static boolean a(gw gw1, boolean flag)
    {
        gw1.e = flag;
        return flag;
    }

    static void b(gw gw1)
    {
        gw1.W();
    }

    static ImageView c(gw gw1)
    {
        return gw1.c;
    }

    static boolean d(gw gw1)
    {
        return gw1.e;
    }

    static void e(gw gw1)
    {
        gw1.Z();
    }

    static JCPWebView f(gw gw1)
    {
        return gw1.a;
    }

    static int g(gw gw1)
    {
        return gw1.b;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030064, viewgroup, false);
        ((TypefaceTextView)layoutinflater.findViewById(0x7f0e0267)).setText(a(0x7f0702d2));
        U();
        a = (JCPWebView)layoutinflater.findViewById(0x7f0e0268);
        a.setVerticalScrollBarEnabled(true);
        a.setOnKeyListener(f);
        a.setVisibility(8);
        a((RelativeLayout)layoutinflater.findViewById(0x7f0e0155));
        c = (ImageView)layoutinflater.findViewById(0x7f0e0095);
        c.setEnabled(false);
        c.setOnClickListener(new gy(this));
        (new hc(this, null)).execute(new Void[0]);
        return layoutinflater;
    }

    protected String a()
    {
        return "TRACKORDERSHYBRID";
    }

    public void b()
    {
        a(a(0x7f0702d2));
        super.b();
    }
}
