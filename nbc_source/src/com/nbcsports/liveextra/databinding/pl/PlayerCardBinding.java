// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public abstract class PlayerCardBinding extends ViewDataBinding
{

    public final ImageView awayFormation;
    public final ViewPager awayPlayers;
    public final RelativeLayout bladeContent;
    public final FrameLayout field;
    public final ImageView homeFormation;
    public final ViewPager homePlayers;

    protected PlayerCardBinding(View view, int i, ImageView imageview, ViewPager viewpager, RelativeLayout relativelayout, FrameLayout framelayout, ImageView imageview1, 
            ViewPager viewpager1)
    {
        super(view, i);
        awayFormation = imageview;
        awayPlayers = viewpager;
        bladeContent = relativelayout;
        field = framelayout;
        homeFormation = imageview1;
        homePlayers = viewpager1;
    }

    public static PlayerCardBinding bind(View view)
    {
        return (PlayerCardBinding)bind(view, 0x7f04006f);
    }

    public static PlayerCardBinding inflate(LayoutInflater layoutinflater)
    {
        return (PlayerCardBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04006f, null, false);
    }

    public static PlayerCardBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (PlayerCardBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04006f, viewgroup, flag);
    }

    public abstract void setHandlers(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Handlers handlers);

    public abstract void setViewModel(com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView.Binder binder);
}
