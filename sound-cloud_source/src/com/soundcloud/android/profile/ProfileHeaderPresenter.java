// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import a.a;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.util.CondensedNumberFormatter;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileUser

class ProfileHeaderPresenter
{
    public static class ProfileHeaderPresenterFactory
    {

        private final AccountOperations accountOperations;
        private final EngagementsTracking engagementsTracking;
        private final NextFollowingOperations followingOperations;
        private final ImageOperations imageOperations;
        private final CondensedNumberFormatter numberFormatter;

        ProfileHeaderPresenter create(Activity activity, Urn urn)
        {
            return new ProfileHeaderPresenter(activity, imageOperations, numberFormatter, accountOperations, urn, followingOperations, engagementsTracking);
        }

        public ProfileHeaderPresenterFactory(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, AccountOperations accountoperations, NextFollowingOperations nextfollowingoperations, EngagementsTracking engagementstracking)
        {
            imageOperations = imageoperations;
            numberFormatter = condensednumberformatter;
            accountOperations = accountoperations;
            followingOperations = nextfollowingoperations;
            engagementsTracking = engagementstracking;
        }
    }


    ToggleButton followButton;
    TextView followerCount;
    View headerInfoLayout;
    ImageView image;
    private final ImageOperations imageOperations;
    private Urn lastUser;
    private final CondensedNumberFormatter numberFormatter;
    View tabs;
    TextView username;

    public ProfileHeaderPresenter(final Activity profileActivity, final ImageOperations imageOperations, CondensedNumberFormatter condensednumberformatter, AccountOperations accountoperations, final Urn user, final NextFollowingOperations followingOperations, final EngagementsTracking engagementsTracking)
    {
        this.imageOperations = imageOperations;
        numberFormatter = condensednumberformatter;
        a.a(this, profileActivity);
        if (accountoperations.isLoggedInUser(user))
        {
            followButton.setVisibility(8);
        } else
        {
            followButton.setOnClickListener(new _cls1());
        }
        image.setOnClickListener(new _cls2());
    }

    public void setUserDetails(ProfileUser profileuser)
    {
        username.setText(profileuser.getName());
        followButton.setChecked(profileuser.isFollowed());
        if (profileuser.getFollowerCount() != -1L)
        {
            followerCount.setText(numberFormatter.format(profileuser.getFollowerCount()));
            followerCount.setVisibility(0);
        } else
        {
            followerCount.setVisibility(8);
        }
        if (!profileuser.getUrn().equals(lastUser))
        {
            lastUser = profileuser.getUrn();
            imageOperations.displayCircularWithPlaceholder(lastUser, ApiImageSize.getFullImageSize(image.getResources()), image);
        }
    }

    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ProfileHeaderPresenter this$0;
        final ImageOperations val$imageOperations;
        final Activity val$profileActivity;
        final Urn val$user;

        public void onClick(View view)
        {
            (new FullImageDialog(profileActivity, user, imageOperations)).show();
        }

        _cls2()
        {
            this$0 = ProfileHeaderPresenter.this;
            profileActivity = activity;
            user = urn;
            imageOperations = imageoperations;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ProfileHeaderPresenter this$0;
        final EngagementsTracking val$engagementsTracking;
        final NextFollowingOperations val$followingOperations;
        final Urn val$user;

        public void onClick(View view)
        {
            followingOperations.toggleFollowing(user, followButton.isChecked()).subscribe(new DefaultSubscriber());
            engagementsTracking.followUserUrn(user, followButton.isChecked());
        }

        _cls1()
        {
            this$0 = ProfileHeaderPresenter.this;
            followingOperations = nextfollowingoperations;
            user = urn;
            engagementsTracking = engagementstracking;
            super();
        }
    }

}
