// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.m4b.maps.cz.a;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ad, k, j, bi, 
//            q, bs

public final class bn
{

    public final RelativeLayout a;
    bi b;
    ad c;
    j d;
    public final q e;
    bs f;
    private final Resources g;
    private final Context h;

    public bn(Context context, Resources resources, q q1)
    {
        a = new RelativeLayout(context);
        a.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        h = context;
        g = resources;
        e = q1;
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        Object obj;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        int i;
        if (a())
        {
            context.addRule(9);
            context.addRule(15);
        } else
        {
            context.addRule(11);
            context.addRule(10);
        }
        context.setMargins(0, g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), 0);
        resources = h;
        q1 = g;
        obj = new ImageView(resources);
        i = com.google.android.m4b.maps.h.e.maps_btn_myl;
        if (com.google.android.m4b.maps.cz.a.a(resources))
        {
            i = com.google.android.m4b.maps.h.e.maps_btn_myl_wear;
        }
        ((ImageView) (obj)).setImageDrawable(q1.getDrawable(i));
        ((ImageView) (obj)).setVisibility(8);
        ((ImageView) (obj)).setContentDescription(q1.getString(com.google.android.m4b.maps.h.h.maps_MY_LOCATION_ALT_TEXT));
        ((ImageView) (obj)).setTag("GoogleMapMyLocationButton");
        c = new ad(((View) (obj)));
        a(c.a, 2, context);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -1);
        context.addRule(11);
        context.addRule(2, 1);
        context.addRule(3, 2);
        context.setMargins(0, g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin));
        q1 = h;
        obj = g;
        resources = new k(q1, ((Resources) (obj)));
        layoutparams = new android.widget.RelativeLayout.LayoutParams(((Resources) (obj)).getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_width), -2);
        layoutparams.addRule(15);
        resources.setLayoutParams(layoutparams);
        resources.setBackgroundDrawable(((Resources) (obj)).getDrawable(com.google.android.m4b.maps.h.e.maps_fproundcorner));
        resources.setCacheColorHint(0);
        resources.setChoiceMode(1);
        resources.setDivider(new ColorDrawable(0));
        resources.setVerticalScrollBarEnabled(false);
        resources.setScrollingCacheEnabled(true);
        resources.setSmoothScrollbarEnabled(true);
        resources.setVisibility(8);
        q1 = new RelativeLayout(q1);
        q1.addView(resources);
        q1.setVisibility(8);
        resources = new j(resources, q1);
        ((j) (resources)).a.setOnItemClickListener(new j._cls1(resources));
        d = resources;
        a(d.b, 3, context);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (a())
        {
            context.addRule(14);
            context.addRule(10);
        } else
        {
            context.addRule(11);
            context.addRule(12);
        }
        context.setMargins(0, 0, g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_zoom_y_margin));
        b = com.google.android.m4b.maps.cg.bi.a(h, g);
        a(b.c, 1, context);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(0, 1);
        context.alignWithParent = true;
        context.addRule(12);
        context.setMargins(0, 0, g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_zoom_y_margin));
        a(e.a, 4, context);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (a())
        {
            context.addRule(11);
            context.addRule(15);
        } else
        {
            context.addRule(9);
            context.addRule(10);
        }
        context.setMargins(g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), g.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_btn_margin), 0, 0);
        f = new bs(h, g);
        f.setTag("GoogleMapCompass");
        a(f, 5, context);
    }

    private void a(View view, int i, android.widget.RelativeLayout.LayoutParams layoutparams)
    {
        view.setVisibility(8);
        view.setId(i);
        a.addView(view, layoutparams);
    }

    private boolean a()
    {
        return com.google.android.m4b.maps.cz.a.a(h);
    }
}
