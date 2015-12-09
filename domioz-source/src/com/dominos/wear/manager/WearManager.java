// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.manager;

import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.wear.WearSession;
import com.dominos.wear.api.WearAPI;
import com.dominos.wear.client.WearMessageClient;

public class WearManager
{

    private UserProfileManager mUserProfileManager;
    WearAPI mWearAPI;
    WearMessageClient mWearMessageClient;
    WearSession mWearSession;

    public WearManager()
    {
    }

    protected void onAfterInject()
    {
        mUserProfileManager = (UserProfileManager)mWearSession.getManager("user_manager");
    }

    public void sendTrackerStatusToWear(final Context context, final Intent intent)
    {
        mWearMessageClient.checkIsWearPaired(new _cls2());
    }

    public void setup()
    {
        if (!mWearAPI.isWearIntroTriggered())
        {
            mWearMessageClient.checkIsWearPaired(new _cls1());
        }
    }


    private class _cls2
        implements com.dominos.wear.client.WearMessageClient.WearConnectionCallback
    {

        final WearManager this$0;
        final Context val$context;
        final Intent val$intent;

        public void onConnectionFailed()
        {
        }

        public void onConnectionSuccess()
        {
            (new WearTrackerReceiver()).onReceive(context, intent);
        }

        _cls2()
        {
            this$0 = WearManager.this;
            context = context1;
            intent = intent1;
            super();
        }
    }


    private class _cls1
        implements com.dominos.wear.client.WearMessageClient.WearConnectionCallback
    {

        final WearManager this$0;

        public void onConnectionFailed()
        {
        }

        public void onConnectionSuccess()
        {
            String s;
            if (mUserProfileManager.isRemembered() || mUserProfileManager.isUserLoggedIn())
            {
                s = "UserSigned:YES";
            } else
            {
                s = "UserSigned:NO";
            }
            mWearMessageClient.sendToWear("/dominos-trigger-intro-notification", s);
        }

        _cls1()
        {
            this$0 = WearManager.this;
            super();
        }
    }

}
