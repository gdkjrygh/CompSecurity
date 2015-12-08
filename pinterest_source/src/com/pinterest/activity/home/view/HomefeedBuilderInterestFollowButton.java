// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.activity.interest.view.FollowInterestButton;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;

public class HomefeedBuilderInterestFollowButton extends FollowInterestButton
{

    public HomefeedBuilderInterestFollowButton(Context context)
    {
        super(context);
    }

    public HomefeedBuilderInterestFollowButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public HomefeedBuilderInterestFollowButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void onClick(View view)
    {
        view = _interest;
        boolean flag;
        if (!Constants.isTrue(_interest.getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setFollowing(Boolean.valueOf(flag));
        updateDisplay();
        Events.post(new InterestFollowEvent(_interest));
    }

    private class InterestFollowEvent
    {

        private Interest _interest;

        public Interest getInterest()
        {
            return _interest;
        }

        public void setInterest(Interest interest)
        {
            _interest = interest;
        }

        public InterestFollowEvent(Interest interest)
        {
            _interest = interest;
        }
    }

}
