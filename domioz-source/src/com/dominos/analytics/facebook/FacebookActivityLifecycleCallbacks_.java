// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics.facebook;

import android.content.Context;
import com.dominos.android.sdk.core.user.UserProfileManager_;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.analytics.facebook:
//            FacebookActivityLifecycleCallbacks

public final class FacebookActivityLifecycleCallbacks_ extends FacebookActivityLifecycleCallbacks
{

    private Context context_;

    private FacebookActivityLifecycleCallbacks_(Context context)
    {
        context_ = context;
        init_();
    }

    public static FacebookActivityLifecycleCallbacks_ getInstance_(Context context)
    {
        return new FacebookActivityLifecycleCallbacks_(context);
    }

    private void init_()
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mUserProfileManager = UserProfileManager_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
