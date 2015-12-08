// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.core.user.UserService;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.controllers.interfaces.IDominosLandingScreen;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;

public class LandingScreenController
    implements IDominosViewController
{

    private static final String NONE = "none";
    MobileSession mMobileSession;
    private UserProfileManager mProfileManager;
    PowerRestClient powerService;
    DominosPrefs_ prefs;
    UserService user;
    private IDominosLandingScreen view;

    public LandingScreenController()
    {
    }

    public void clearCurrentUser()
    {
        mProfileManager.clearCurrentUser();
    }

    public void dispose()
    {
    }

    public boolean isFirstTimeUser()
    {
        return App.getInstance().isFirstTime() && mProfileManager.getCurrentUser() == null && !mProfileManager.isRemembered();
    }

    public void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        view = (IDominosLandingScreen)idominosview;
        return this;
    }

    public void showFragment()
    {
        if (!isFirstTimeUser() && mProfileManager.isAuthorizedUser() && mProfileManager.getCurrentUser() != null)
        {
            view.showProfiledUserFragment();
            return;
        } else
        {
            view.showNoCachedAddressFragment();
            return;
        }
    }
}
