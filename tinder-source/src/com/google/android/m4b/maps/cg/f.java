// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class f extends LinearLayout
{

    final TextView a;
    final TextView b;

    private f(Context context, TextView textview, TextView textview1)
    {
        super(context);
        a = textview;
        b = textview1;
    }

    public static f a(Context context)
    {
        TextView textview = new TextView(context);
        Object obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj.gravity = 1;
        textview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textview.setSingleLine(true);
        textview.setTextColor(0xff000000);
        textview.setTextSize(14F);
        textview.setTypeface(null, 1);
        obj = new TextView(context);
        ((TextView) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        ((TextView) (obj)).setSingleLine(true);
        ((TextView) (obj)).setTextColor(0xff888888);
        ((TextView) (obj)).setTextSize(14F);
        context = new f(context, textview, ((TextView) (obj)));
        context.addView(textview);
        context.addView(((android.view.View) (obj)));
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        context.setOrientation(1);
        return context;
    }
}
