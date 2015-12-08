// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.app.Activity;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.EngagementsTracking;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.util.CondensedNumberFormatter;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileHeaderPresenter

public static class engagementsTracking
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

    public Y(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, AccountOperations accountoperations, NextFollowingOperations nextfollowingoperations, EngagementsTracking engagementstracking)
    {
        imageOperations = imageoperations;
        numberFormatter = condensednumberformatter;
        accountOperations = accountoperations;
        followingOperations = nextfollowingoperations;
        engagementsTracking = engagementstracking;
    }
}
