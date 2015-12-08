// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            v, t, w

public final class u extends v
{

    private static final int d = Color.parseColor("#4D4D4D");
    private static final int e = Color.parseColor("#E2E2E2");
    private final t f;
    private View g;

    public u(Context context, Resources resources, w w, boolean flag, t t1)
    {
        super(context, resources, w);
        f = t1;
        if (flag)
        {
            resources = new LinearLayout(context);
            resources.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            resources.setOrientation(1);
            w = new RelativeLayout(a);
            w.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            t1 = new TextView(a);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(9);
            layoutparams.addRule(15);
            int i = a(11F);
            t1.setPadding(i, i, i, i);
            t1.setLayoutParams(layoutparams);
            t1.setText(b.getString(com.google.android.m4b.maps.h.h.maps_BACK_TO_LIST));
            t1.setTextColor(d);
            t1.setTextSize(16F);
            t1.setTypeface(Typeface.DEFAULT_BOLD);
            t1.setCompoundDrawablesWithIntrinsicBounds(b.getDrawable(com.google.android.m4b.maps.h.e.maps_btn_back), null, null, null);
            t1.setOnClickListener(new android.view.View.OnClickListener() {

                private u a;

                public final void onClick(View view)
                {
                    a.c.a();
                }

            
            {
                a = u.this;
                super();
            }
            });
            g = t1;
            g.setTag("GoogleMapMapsEngineInfocardBackButton");
            w.addView(t1);
            t1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            t1.addRule(11);
            t1.addRule(15);
            w.addView(a(), t1);
            resources.addView(w);
            w = new View(a);
            w.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, a(0.5F)));
            w.setBackgroundColor(e);
            resources.addView(w);
            resources.addView(a(context, false));
            a(resources, false);
            return;
        } else
        {
            a(a(context, true), true);
            return;
        }
    }

    private WebView a(Context context, boolean flag)
    {
        WebView webview = new WebView(context);
        int i;
        int j;
        if (flag)
        {
            context = new android.widget.LinearLayout.LayoutParams(0, -2);
        } else
        {
            context = new android.widget.LinearLayout.LayoutParams(-2, 0);
        }
        context.weight = 1.0F;
        j = a(11F);
        if (flag)
        {
            i = j;
        } else
        {
            i = 0;
        }
        context.setMargins(j, j, i, j);
        webview.setLayoutParams(context);
        webview.setFocusable(false);
        webview.loadData(f.d(), "text/html; charset=UTF-8", null);
        return webview;
    }

}
