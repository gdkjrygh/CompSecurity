// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, de, dh, gd, 
//            dj, dk, dl

public class di
{
    public static interface a
    {

        public abstract void a(Dialog dialog);

        public abstract void a(Dialog dialog, int i);
    }


    private static int a()
    {
        int j = a(300);
        int i = j;
        if (Math.max(ct.l(), ct.k()) > 320)
        {
            i = Math.min(Math.round((float)ct.k() * 0.6F), j);
        }
        return Math.round((float)i * 0.9F);
    }

    private static int a(int i)
    {
        return Math.round(((float)Math.max(ct.l(), ct.k()) / 320F) * (float)i);
    }

    public static Dialog a(Context context, a a1, int i, String s, gd gd1)
    {
        de de1 = de.a(context);
        Bitmap abitmap[] = a(gd1);
        EditText edittext = new EditText(context);
        a1 = a(context, edittext, a1, gd1, ((Dialog) (de1)));
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        linearlayout.setPadding(10, 10, 10, 10);
        LinearLayout linearlayout1 = new LinearLayout(context);
        linearlayout1.setOrientation(1);
        TextView textview = new TextView(context);
        textview.setText(s);
        textview.setFocusable(false);
        linearlayout1.addView(textview, new android.widget.LinearLayout.LayoutParams(-1, -2));
        edittext.setInputType(2);
        edittext.setFocusable(true);
        edittext.setText(String.valueOf(i));
        edittext.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(5)
        });
        linearlayout1.addView(edittext, new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearlayout.addView(linearlayout1, new android.widget.LinearLayout.LayoutParams(-2, -2));
        s = new android.widget.LinearLayout.LayoutParams(0, 0);
        s.weight = 1.0F;
        linearlayout.addView(new View(context), s);
        context = new android.widget.LinearLayout.LayoutParams(-2, -2);
        context.gravity = 81;
        linearlayout.addView(a1, context);
        int k = a();
        int j = a(100);
        i = j;
        if (Math.max(ct.l(), ct.k()) > 320)
        {
            i = Math.min(Math.round((float)ct.l() * 0.5F), j);
        }
        de1.requestWindowFeature(1);
        de1.getWindow().setBackgroundDrawable(new dh(abitmap, gd1.a(gd.a.f)));
        de1.addContentView(linearlayout, new android.view.ViewGroup.LayoutParams(k, i));
        return de1;
    }

    private static ScrollView a(Context context, EditText edittext, a a1, gd gd1, Dialog dialog)
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
        String as[] = new String[2];
        as[0] = "   OK   ";
        as[1] = "Cancel";
        for (int i = 0; i < as.length; i++)
        {
            Object obj = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, gd1);
            ((GradientDrawable) (obj)).setCornerRadius(6F);
            ((GradientDrawable) (obj)).setGradientType(0);
            Button button = new Button(context);
            button.setText(as[i]);
            button.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            button.setTextColor(-1);
            button.setPadding(5, 5, 5, 5);
            button.setId(i + 35);
            button.setFocusable(true);
            button.setTag(Integer.valueOf(i));
            button.setOnClickListener(new dj(edittext, a1, dialog));
            button.setOnFocusChangeListener(new dk(ai, gd1));
            button.setOnTouchListener(new dl(ai, gd1));
            obj = new android.widget.TableRow.LayoutParams(-1, -2);
            obj.gravity = 1;
            tablerow.addView(button, ((android.view.ViewGroup.LayoutParams) (obj)));
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
