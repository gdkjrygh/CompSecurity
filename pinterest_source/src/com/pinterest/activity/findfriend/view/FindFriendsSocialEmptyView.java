// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.base.Events;
import com.pinterest.ui.text.PButton;

public class FindFriendsSocialEmptyView extends LinearLayout
{

    PButton _emptyActionBtn;
    TextView _emptySubtitleTv;
    TextView _emptyTitleTv;

    public FindFriendsSocialEmptyView(Context context)
    {
        this(context, null);
    }

    public FindFriendsSocialEmptyView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FindFriendsSocialEmptyView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301d1, this, true);
        ButterKnife.a(this, this);
        _emptyTitleTv.setText(getResources().getText(0x7f070299));
        _emptyActionBtn.setText(getResources().getText(0x7f070298));
    }

    void onEmptyActionClicked()
    {
        Events.post(new com.pinterest.activity.findfriend.adapter.FindFriendsViewAdapter.InviteTabSwitchEvent(com.pinterest.activity.findfriend.adapter.FindFriendsViewAdapter.Tab.MORE));
    }

    public void setSubtitleTextId(int i)
    {
        _emptySubtitleTv.setText(getResources().getText(i));
    }
}
