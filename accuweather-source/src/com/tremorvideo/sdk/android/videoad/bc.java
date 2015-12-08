// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            de, dh, gd, bd, 
//            be, bf

public class bc
{
    public static interface a
    {

        public abstract void a(Dialog dialog);

        public abstract void b(Dialog dialog);

        public abstract void c(Dialog dialog);
    }


    public static Dialog a(Context context, a a1, gd gd1)
    {
        de de1 = de.a(context);
        Bitmap abitmap[] = a(gd1);
        a1 = a(context, a1, gd1, ((Dialog) (de1)));
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        linearlayout.setPadding(10, 10, 10, 10);
        Object obj = new LinearLayout(context);
        ((LinearLayout) (obj)).setOrientation(0);
        TextView textview = new TextView(context);
        textview.setText("Tremor Video uses cookies or anonymous identifiers to send you ads that may be more relevant and useful to you. Select \"Opt Out\" if you no longer wish for Tremor Video to send you ads based on your inferred interests or demographics in this application on this device.");
        textview.setFocusable(false);
        ((LinearLayout) (obj)).addView(textview, new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearlayout.addView(((View) (obj)), new android.widget.LinearLayout.LayoutParams(-2, -2));
        obj = new android.widget.LinearLayout.LayoutParams(0, 0);
        obj.weight = 1.0F;
        linearlayout.addView(new View(context), ((android.view.ViewGroup.LayoutParams) (obj)));
        context = new android.widget.LinearLayout.LayoutParams(-2, -2);
        context.gravity = 81;
        linearlayout.addView(a1, context);
        de1.requestWindowFeature(1);
        de1.getWindow().setBackgroundDrawable(new dh(abitmap, gd1.a(gd.a.f)));
        de1.addContentView(linearlayout, new android.view.ViewGroup.LayoutParams(-2, -2));
        return de1;
    }

    private static ScrollView a(Context context, a a1, gd gd1, Dialog dialog)
    {
        gd1 = new int[3];
        gd1[0] = Color.rgb(156, 157, 158);
        gd1[1] = Color.rgb(39, 40, 41);
        gd1[2] = Color.rgb(59, 60, 63);
        int ai[] = new int[2];
        ai[0] = Color.rgb(68, 121, 254);
        ai[1] = Color.rgb(4, 63, 212);
        ScrollView scrollview = new ScrollView(context);
        TableLayout tablelayout = new TableLayout(context);
        TableRow tablerow = new TableRow(context);
        tablerow.setLayoutParams(new android.widget.TableRow.LayoutParams(-1, -2));
        String as[] = new String[3];
        as[0] = "Opt Out";
        as[1] = "More Info";
        as[2] = "OK";
        for (int i = 0; i < as.length; i++)
        {
            Object obj1 = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, gd1);
            ((GradientDrawable) (obj1)).setCornerRadius(6F);
            ((GradientDrawable) (obj1)).setGradientType(0);
            Object obj = new Button(context);
            ((Button) (obj)).setText(as[i]);
            ((Button) (obj)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
            ((Button) (obj)).setTextColor(-1);
            ((Button) (obj)).setPadding(5, 5, 5, 5);
            ((Button) (obj)).setId(i + 35);
            ((Button) (obj)).setFocusable(true);
            ((Button) (obj)).setTag(Integer.valueOf(i));
            ((Button) (obj)).setOnClickListener(new bd(a1, dialog));
            ((Button) (obj)).setOnFocusChangeListener(new be(ai, gd1));
            ((Button) (obj)).setOnTouchListener(new bf(ai, gd1));
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            obj1 = new FrameLayout(context);
            ((FrameLayout) (obj1)).addView(((View) (obj)), layoutparams);
            obj = new android.widget.TableRow.LayoutParams(0, -2);
            obj.weight = 1.0F;
            obj.rightMargin = 1;
            obj.leftMargin = 1;
            tablerow.addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (obj)));
            tablelayout.setColumnStretchable(i, true);
        }

        tablelayout.addView(tablerow, new android.widget.TableLayout.LayoutParams(-1, -2));
        scrollview.addView(tablelayout, new android.view.ViewGroup.LayoutParams(-1, -2));
        return scrollview;
    }

    private static Bitmap[] a(gd gd1)
    {
        Bitmap abitmap[] = new Bitmap[dh.a.values().length];
        abitmap[dh.a.a.ordinal()] = gd1.a(gd.b.y);
        abitmap[dh.a.b.ordinal()] = gd1.a(gd.b.z);
        abitmap[dh.a.c.ordinal()] = gd1.a(gd.b.A);
        abitmap[dh.a.d.ordinal()] = gd1.a(gd.b.B);
        abitmap[dh.a.e.ordinal()] = gd1.a(gd.b.C);
        abitmap[dh.a.f.ordinal()] = gd1.a(gd.b.D);
        abitmap[dh.a.g.ordinal()] = gd1.a(gd.b.E);
        abitmap[dh.a.h.ordinal()] = gd1.a(gd.b.F);
        return abitmap;
    }
}
