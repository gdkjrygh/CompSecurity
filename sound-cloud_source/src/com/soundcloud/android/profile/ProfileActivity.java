// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePresenter

public class ProfileActivity extends ScActivity
{

    public static final String EXTRA_SEARCH_QUERY_SOURCE_INFO = "searchQuerySourceInfo";
    public static final String EXTRA_USER_URN = "userUrn";
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;
    ProfilePresenter profilePresenter;

    public ProfileActivity()
    {
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.createActionBarLayout(this, 0x7f0300a0);
    }
}
