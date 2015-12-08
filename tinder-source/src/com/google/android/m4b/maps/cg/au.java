// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.g.g;

public final class au
{

    final RelativeLayout a;
    TextView b;
    TextView c;
    private final Context d;
    private ImageView e;
    private final Resources f;

    public au(Context context, Resources resources)
    {
        a = new RelativeLayout(context);
        a.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        d = context;
        f = resources;
        a.setVisibility(8);
        c = a();
        c.setId(1);
        c.setVisibility(8);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(11);
        context.addRule(12);
        context.setMargins(10, 0, 0, 0);
        a.addView(c, context);
        b = a();
        b.setText("Report a problem");
        b.setId(2);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(0, c.getId());
        context.addRule(12);
        a.addView(b, context);
        e = new ImageView(d);
        e.setImageDrawable(f.getDrawable(com.google.android.m4b.maps.h.e.maps_watermark_light));
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(9);
        context.addRule(12);
        int i = f.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_watermark_margin);
        context.setMargins(i, i, i, i);
        e.setLayoutParams(context);
        e.setTag("GoogleWatermark");
        a.addView(e);
        if (g.e(d))
        {
            b.setVisibility(8);
        }
    }

    private TextView a()
    {
        TextView textview = new TextView(d);
        textview.setClickable(true);
        textview.setBackgroundColor(0x90ffffff);
        textview.setTextColor(0xff000000);
        textview.setTextSize(10F);
        textview.setPadding(5, 0, 5, 0);
        return textview;
    }

    public final void a(boolean flag)
    {
        RelativeLayout relativelayout = a;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        relativelayout.setVisibility(i);
    }
}
