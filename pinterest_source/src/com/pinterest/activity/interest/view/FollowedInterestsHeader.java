// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class FollowedInterestsHeader extends RelativeLayout
{

    TextView _seeAll;
    private User _user;

    public FollowedInterestsHeader(Context context)
    {
        this(context, null);
    }

    public FollowedInterestsHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301d7, this, true);
        ButterKnife.a(this);
    }

    void onSeeAllClicked()
    {
        if (_user != null)
        {
            Pinalytics.a(ElementType.SEE_MORE_BUTTON, ComponentType.INTEREST_CAROUSEL);
            Events.post(new Navigation(Location.USER_FOLLOWED_INTERESTS, _user));
        }
    }

    public void setUser(User user)
    {
        _user = user;
    }
}
