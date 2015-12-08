// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.base.view.DefaultViewHolder;
import com.google.android.apps.wallet.ui.listener.Listeners;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.view.Views;

public class SplashScreenDisplay extends DefaultViewHolder
{

    private TextView bodyText1;
    private TextView bodyText2;
    private Button button;
    private TextView headLine;
    private ImageView image;
    private TextView link;

    SplashScreenDisplay()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.splash_screen);
    }

    public final void setBodyText1(String s)
    {
        bodyText1.setText(s);
    }

    public final void setBodyText2(String s)
    {
        Views.setTextOrHide(bodyText2, s);
    }

    public final void setButtonOnActionListener(OnActionListener onactionlistener)
    {
        button.setOnClickListener(Listeners.getOnClickListener(onactionlistener, null));
    }

    public final void setButtonText(String s)
    {
        button.setText(s);
    }

    public final void setHeadLine(String s)
    {
        headLine.setText(s);
    }

    public final void setImageResource(int i)
    {
        image.setImageResource(i);
    }

    public final void setLinkOnActionListener(OnActionListener onactionlistener)
    {
        link.setOnClickListener(Listeners.getOnClickListener(onactionlistener, null));
    }

    public final void setLinkText(String s)
    {
        Views.setTextOrHide(link, s);
    }

    public final void setView(View view)
    {
        super.setView(view);
        image = (ImageView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashScreenImage);
        headLine = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashScreenHeadLine);
        bodyText1 = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashScreenBodyText1);
        bodyText2 = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashScreenBodyText2);
        link = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashScreenLink);
        button = (Button)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashScreenButton);
    }
}
