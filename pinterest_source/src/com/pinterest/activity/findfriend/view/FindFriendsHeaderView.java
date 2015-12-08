// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

public class FindFriendsHeaderView extends FrameLayout
{

    TextView _friendsCount;
    TextView _selectAllTv;

    public FindFriendsHeaderView(Context context)
    {
        this(context, null);
    }

    public FindFriendsHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FindFriendsHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301d0, this, true);
        ButterKnife.a(this, this);
    }

    void onSelectAllTvClicked()
    {
        Events.post(new Navigation(Location.INVITE_ALL_FRIENDS));
    }

    public void updateFriendsCount(int i)
    {
        _friendsCount.setText(Resources.stringPlural(0x7f090009, Integer.valueOf(i)));
        TextView textview = _selectAllTv;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(textview, flag);
    }
}
