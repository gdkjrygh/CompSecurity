// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.databinding.pl;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class GoalEventItemBinding extends ViewDataBinding
{

    public final LinearLayout detail;
    public final TextView eventTime;
    public final ImageView playIcon;
    public final ImageView teamShield;

    protected GoalEventItemBinding(View view, int i, LinearLayout linearlayout, TextView textview, ImageView imageview, ImageView imageview1)
    {
        super(view, i);
        detail = linearlayout;
        eventTime = textview;
        playIcon = imageview;
        teamShield = imageview1;
    }

    public static GoalEventItemBinding bind(View view)
    {
        return (GoalEventItemBinding)bind(view, 0x7f040073);
    }

    public static GoalEventItemBinding inflate(LayoutInflater layoutinflater)
    {
        return (GoalEventItemBinding)DataBindingUtil.inflate(layoutinflater, 0x7f040073, null, false);
    }

    public static GoalEventItemBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (GoalEventItemBinding)DataBindingUtil.inflate(layoutinflater, 0x7f040073, viewgroup, flag);
    }

    public abstract void setBinder(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Binder binder);

    public abstract void setHandlers(com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView.Handlers handlers);
}
