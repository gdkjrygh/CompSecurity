// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class HighLevelStatsBinding extends ViewDataBinding
{

    public final ImageView awayField;
    public final TextView ballLocation;
    public final ImageView centerField;
    public final LinearLayout field;
    public final ImageView homeField;
    public final RecyclerView statsList;

    protected HighLevelStatsBinding(View view, int i, ImageView imageview, TextView textview, ImageView imageview1, LinearLayout linearlayout, ImageView imageview2, 
            RecyclerView recyclerview)
    {
        super(view, i);
        awayField = imageview;
        ballLocation = textview;
        centerField = imageview1;
        field = linearlayout;
        homeField = imageview2;
        statsList = recyclerview;
    }

    public static HighLevelStatsBinding bind(View view)
    {
        return (HighLevelStatsBinding)bind(view, 0x7f040072);
    }

    public static HighLevelStatsBinding inflate(LayoutInflater layoutinflater)
    {
        return (HighLevelStatsBinding)DataBindingUtil.inflate(layoutinflater, 0x7f040072, null, false);
    }

    public static HighLevelStatsBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (HighLevelStatsBinding)DataBindingUtil.inflate(layoutinflater, 0x7f040072, viewgroup, flag);
    }

    public abstract void setBinder(com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView.Binder binder);
}
