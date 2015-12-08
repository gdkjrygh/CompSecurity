// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.w;

public final class bh
{

    final RelativeLayout a;
    final Resources b;
    ImageView c;
    TextView d;
    final boolean e;
    private final Context f;
    private final boolean g;

    public bh(Context context, Resources resources)
    {
        boolean flag1 = w.a;
        boolean flag;
        if (!w.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(context, resources, flag1, flag);
    }

    private bh(Context context, Resources resources, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        super();
        a = new RelativeLayout(context);
        a.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        f = context;
        b = resources;
        e = flag;
        g = flag1;
        c = new ImageView(f);
        c.setImageDrawable(b.getDrawable(com.google.android.m4b.maps.h.e.maps_watermark_dark));
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(9);
        context.addRule(12);
        int i = b.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_watermark_margin);
        context.setMargins(i, i, i, i);
        c.setLayoutParams(context);
        c.setTag("GoogleWatermark");
        context = c;
        if (g)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        context.setVisibility(i);
        a.addView(c);
        d = new TextView(f);
        context = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        context.addRule(11);
        context.addRule(12);
        d.setLayoutParams(context);
        d.setTextSize(0, b.getDimensionPixelSize(com.google.android.m4b.maps.h.d.maps_dav_hud_copyright_fontsize));
        d.setTextColor(0xff000000);
        d.setSingleLine(true);
        d.setTag("GoogleCopyrights");
        context = d;
        if (e)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        context.setVisibility(i);
        a.addView(d);
    }
}
