// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.m4b.maps.cz.a;

public final class bi
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    final View a;
    final View b;
    final View c;
    a d;

    private bi(View view, View view1, View view2)
    {
        c = view;
        a = view1;
        b = view2;
    }

    public static bi a(Context context, Resources resources)
    {
        int k = 0;
        int j = com.google.android.m4b.maps.h.e.maps_btn_zoom_up;
        int i = com.google.android.m4b.maps.h.e.maps_btn_zoom_down;
        ImageView imageview;
        LinearLayout linearlayout;
        boolean flag;
        if (com.google.android.m4b.maps.cz.a.a(context))
        {
            j = com.google.android.m4b.maps.h.e.maps_btn_zoom_up_wear;
            i = com.google.android.m4b.maps.h.e.maps_btn_zoom_down_wear;
            flag = true;
        } else
        {
            flag = false;
        }
        linearlayout = new LinearLayout(context);
        if (!flag)
        {
            k = 1;
        }
        linearlayout.setOrientation(k);
        imageview = new ImageView(context);
        imageview.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        imageview.setImageDrawable(resources.getDrawable(j));
        imageview.setContentDescription(resources.getString(com.google.android.m4b.maps.h.h.maps_ZOOM_IN_ALT_TEXT));
        imageview.setTag("GoogleMapZoomInButton");
        context = new ImageView(context);
        context.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        context.setImageDrawable(resources.getDrawable(i));
        context.setContentDescription(resources.getString(com.google.android.m4b.maps.h.h.maps_ZOOM_OUT_ALT_TEXT));
        context.setTag("GoogleMapZoomOutButton");
        if (flag)
        {
            linearlayout.addView(context);
            linearlayout.addView(imageview);
        } else
        {
            linearlayout.addView(imageview);
            linearlayout.addView(context);
        }
        resources = new bi(linearlayout, imageview, context);
        imageview.setOnClickListener(resources);
        context.setOnClickListener(resources);
        return resources;
    }

    public final void onClick(View view)
    {
        if (d != null)
        {
            if (view == a)
            {
                d.a();
                return;
            }
            if (view == b)
            {
                d.b();
                return;
            }
        }
    }
}
