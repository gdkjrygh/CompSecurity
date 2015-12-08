// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.pinterest.ui.layout.AdapterLinearLayout;

public class UserSuggestedPinnersView extends AdapterLinearLayout
{

    public UserSuggestedPinnersView(Context context)
    {
        this(context, null);
    }

    public UserSuggestedPinnersView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserSuggestedPinnersView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void updateView()
    {
        super.updateView();
        setBackgroundColor(-1);
        addHeaderView(LayoutInflater.from(getContext()).inflate(0x7f030204, null));
    }
}
