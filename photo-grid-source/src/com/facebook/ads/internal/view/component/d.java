// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.internal.view.g;

public class d extends LinearLayout
{

    public d(Context context, NativeAd nativead, NativeAdViewAttributes nativeadviewattributes)
    {
        super(context);
        Object obj = context.getResources().getDisplayMetrics();
        context = new LinearLayout(context);
        context.setOrientation(1);
        context.setGravity(17);
        context.setVerticalGravity(16);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutparams.setMargins(Math.round(((DisplayMetrics) (obj)).density * 15F), Math.round(((DisplayMetrics) (obj)).density * 15F), Math.round(((DisplayMetrics) (obj)).density * 15F), Math.round(((DisplayMetrics) (obj)).density * 15F));
        context.setLayoutParams(layoutparams);
        addView(context);
        obj = new TextView(getContext());
        ((TextView) (obj)).setText(nativead.getAdSubtitle());
        g.a(((TextView) (obj)), nativeadviewattributes);
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        ((TextView) (obj)).setSingleLine(true);
        context.addView(((android.view.View) (obj)));
        obj = new TextView(getContext());
        ((TextView) (obj)).setText(nativead.getAdBody());
        g.b(((TextView) (obj)), nativeadviewattributes);
        ((TextView) (obj)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        ((TextView) (obj)).setMaxLines(2);
        context.addView(((android.view.View) (obj)));
    }
}
