// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.res.Resources;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.GenreList;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.home.SlidingMenuAdapter;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.ViewUtils;

public class KidsSlidingMenuAdapter extends SlidingMenuAdapter
{

    private final int itemTextColor;

    public KidsSlidingMenuAdapter(NetflixActivity netflixactivity, DrawerLayout drawerlayout)
    {
        super(netflixactivity, drawerlayout);
        itemTextColor = netflixactivity.getResources().getColor(0x7f09006a);
        home.setTextColor(itemTextColor);
        ViewUtils.clearShadow(home);
        home.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, netflixactivity.getResources().getDimensionPixelSize(0x7f0a0085)));
        content.setBackgroundResource(0x7f090069);
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        super.onManagerReady(servicemanager, i);
        if (KidsUtils.shouldShowKidsEntryInMenu(activity))
        {
            servicemanager = (TextView)((ViewStub)content.findViewById(0x7f0700bf)).inflate().findViewById(0x7f0700c1);
            servicemanager.setText(0x7f0c0053);
            servicemanager.setTextColor(activity.getResources().getColor(0x7f090032));
            servicemanager.setBackgroundResource(0x7f0200f1);
            ViewUtils.setTextViewToBold(servicemanager);
            ViewUtils.clearShadow(servicemanager);
            servicemanager.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, activity.getResources().getDimensionPixelSize(0x7f0a0085)));
            servicemanager.setOnClickListener(new android.view.View.OnClickListener() );
        }
    }

    protected boolean shouldShowChangeProfilesItem()
    {
        return false;
    }

    protected void updateAdapterViews(com.netflix.mediaclient.ui.home.SlidingMenuAdapter.Holder holder, GenreList genrelist)
    {
        updateAdapterViews(holder, genrelist);
        holder.tv.setTextColor(itemTextColor);
        ViewUtils.clearShadow(holder.tv);
        holder.tv.setLayoutParams(new LayoutParams(-1, activity.getResources().getDimensionPixelSize(0x7f0a0085)));
    }


}
