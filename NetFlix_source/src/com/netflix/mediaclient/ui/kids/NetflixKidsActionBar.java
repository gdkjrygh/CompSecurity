// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import com.netflix.mediaclient.util.ViewUtils;

public class NetflixKidsActionBar extends NetflixActionBar
{

    public NetflixKidsActionBar(NetflixActivity netflixactivity, boolean flag)
    {
        super(netflixactivity, flag);
        systemActionBar.setBackgroundDrawable(new ColorDrawable(netflixactivity.getResources().getColor(0x7f090066)));
        ViewUtils.setTextViewSizeByRes(title, 0x7f0a0031);
        if (flag)
        {
            netflixactivity = new com.netflix.mediaclient.android.widget.NetflixActionBar.PerformUpActionOnClickListener(netflixactivity);
            logo.setOnClickListener(netflixactivity);
            title.setOnClickListener(netflixactivity);
        }
    }

    protected int getFullSizeLogoId()
    {
        return 0x7f0200e8;
    }

    public void onManagerReady()
    {
        if (hasUpAction)
        {
            configureBackButtonIfNecessary(false);
        }
    }
}
