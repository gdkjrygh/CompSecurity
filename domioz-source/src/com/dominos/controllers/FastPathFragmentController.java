// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import com.dominos.MobileSession;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.interfaces.IDominosFastPathFragment;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;

public class FastPathFragmentController
    implements IDominosViewController
{

    MobileSession mMobileSession;
    private OrderManager mOrderManager;
    private UserProfileManager mProfileManager;
    UserAuthorization userAuth;
    protected IDominosFastPathFragment view;

    public FastPathFragmentController()
    {
    }

    private void onSessionTimedOut()
    {
        mProfileManager.clearCurrentUser();
        view.showSessionTimeoutAlert();
    }

    public void dispose()
    {
    }

    public void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        view = (IDominosFastPathFragment)idominosview;
        return this;
    }

    public void showOrderHistory()
    {
        if (userAuth.isSessionTimedOut(mProfileManager.isRemembered()))
        {
            onSessionTimedOut();
            return;
        } else
        {
            mOrderManager.setOrderType(com.dominos.android.sdk.core.order.OrderManager.OrderType.RECENT_ORDERS);
            view.showOrderHistoryActivity();
            return;
        }
    }
}
