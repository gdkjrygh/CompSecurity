// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.presentation.RefreshableScreen;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleSupportFragment;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileScreen

public abstract class ScrollableProfileFragment extends LightCycleSupportFragment
    implements RefreshableScreen, ProfileScreen
{

    private Integer pendingEmptyViewHeight;
    private Boolean pendingRefreshState;

    public ScrollableProfileFragment()
    {
    }

    public MultiSwipeRefreshLayout getRefreshLayout()
    {
        return (MultiSwipeRefreshLayout)getView().findViewById(0x7f0f0153);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (pendingEmptyViewHeight != null)
        {
            setEmptyViewHeight(pendingEmptyViewHeight.intValue());
            pendingEmptyViewHeight = null;
        }
        if (pendingRefreshState != null)
        {
            setSwipeToRefreshEnabled(pendingRefreshState.booleanValue());
            pendingEmptyViewHeight = null;
        }
    }

    public void setEmptyViewHeight(int i)
    {
        if (getView() != null)
        {
            View view = getView().findViewById(0x1020004);
            view.getLayoutParams().height = i;
            view.requestLayout();
            return;
        } else
        {
            pendingEmptyViewHeight = Integer.valueOf(i);
            return;
        }
    }

    public void setSwipeToRefreshEnabled(boolean flag)
    {
        if (getView() != null)
        {
            getRefreshLayout().setEnabled(flag);
            return;
        } else
        {
            pendingRefreshState = Boolean.valueOf(flag);
            return;
        }
    }
}
