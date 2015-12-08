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
import android.widget.TextView;

public abstract class PlayItemBinding extends ViewDataBinding
{

    public final TextView detail;
    public final ImageView playIcon;

    protected PlayItemBinding(View view, int i, TextView textview, ImageView imageview)
    {
        super(view, i);
        detail = textview;
        playIcon = imageview;
    }

    public static PlayItemBinding bind(View view)
    {
        return (PlayItemBinding)bind(view, 0x7f04007f);
    }

    public static PlayItemBinding inflate(LayoutInflater layoutinflater)
    {
        return (PlayItemBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04007f, null, false);
    }

    public static PlayItemBinding inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        return (PlayItemBinding)DataBindingUtil.inflate(layoutinflater, 0x7f04007f, viewgroup, flag);
    }

    public abstract void setBinder(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Binder binder);

    public abstract void setHandler(com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView.Handler handler);
}
