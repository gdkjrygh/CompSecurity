// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.MobileSession;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.interfaces.IDominosNoCachedAddressFragment;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;

public class NoCachedAddressFragmentController
    implements IDominosViewController
{

    MobileSession mMobileSession;
    private UserProfileManager mProfileManager;
    protected IDominosNoCachedAddressFragment view;

    public NoCachedAddressFragmentController()
    {
    }

    public void dispose()
    {
    }

    public void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        view = (IDominosNoCachedAddressFragment)idominosview;
        return this;
    }

    public void showLogin()
    {
        if (mProfileManager.getAuthorizationCode() == null)
        {
            if (!mProfileManager.isRemembered())
            {
                mProfileManager.clearCurrentUser();
            }
            view.showUserLoginActivity();
            return;
        } else
        {
            view.showUserAccountActivity();
            return;
        }
    }
}
