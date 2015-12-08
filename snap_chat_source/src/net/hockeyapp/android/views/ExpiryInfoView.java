// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import agq;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExpiryInfoView extends RelativeLayout
{

    public ExpiryInfoView(Context context)
    {
        this(context, "");
    }

    public ExpiryInfoView(Context context, String s)
    {
        super(context);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        setBackgroundColor(-1);
        setLayoutParams(layoutparams);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 3F, getResources().getDisplayMetrics()));
        layoutparams.addRule(10, -1);
        ImageView imageview = new ImageView(context);
        imageview.setLayoutParams(layoutparams);
        imageview.setBackgroundDrawable(agq.a());
        addView(imageview);
        int i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams.addRule(13, -1);
        layoutparams.setMargins(i, i, i, i);
        context = new TextView(context);
        context.setGravity(17);
        context.setLayoutParams(layoutparams);
        context.setText(s);
        context.setTextColor(0xff000000);
        addView(context);
    }
}
