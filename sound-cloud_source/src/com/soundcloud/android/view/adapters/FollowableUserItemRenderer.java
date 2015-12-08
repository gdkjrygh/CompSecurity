// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.view.View;
import android.widget.ToggleButton;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.users.UserItem;
import com.soundcloud.android.util.CondensedNumberFormatter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            UserItemRenderer

public class FollowableUserItemRenderer extends UserItemRenderer
{

    private final EngagementsTracking engagementsTracking;
    private final FeatureFlags featureFlags;
    private final NextFollowingOperations followingOperations;

    public FollowableUserItemRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, NextFollowingOperations nextfollowingoperations, FeatureFlags featureflags, EngagementsTracking engagementstracking)
    {
        super(imageoperations, condensednumberformatter);
        followingOperations = nextfollowingoperations;
        featureFlags = featureflags;
        engagementsTracking = engagementstracking;
    }

    private void setupFollowToggle(final View toggleFollow, final UserItem user)
    {
        toggleFollow = (ToggleButton)toggleFollow.findViewById(0x7f0f020c);
        if (featureFlags.isEnabled(Flag.FOLLOW_USER_SEARCH))
        {
            toggleFollow.setVisibility(0);
            toggleFollow.setChecked(user.isFollowedByMe());
            toggleFollow.setOnClickListener(new _cls1());
            return;
        } else
        {
            toggleFollow.setVisibility(8);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        super.bindItemView(i, view, list);
        setupFollowToggle(view, (UserItem)list.get(i));
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FollowableUserItemRenderer this$0;
        final ToggleButton val$toggleFollow;
        final UserItem val$user;

        public void onClick(View view)
        {
            DefaultSubscriber.fireAndForget(followingOperations.toggleFollowing(user.getEntityUrn(), toggleFollow.isChecked()));
            engagementsTracking.followUserUrn(user.getEntityUrn(), toggleFollow.isChecked());
        }

        _cls1()
        {
            this$0 = FollowableUserItemRenderer.this;
            user = useritem;
            toggleFollow = togglebutton;
            super();
        }
    }

}
