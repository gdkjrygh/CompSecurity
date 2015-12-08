// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.DialogHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class UnauthHelper
{

    public UnauthHelper()
    {
    }

    public static void onClick(View view, Context context)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131689847: 
            Pinalytics.a(ElementType.LOGIN_BUTTON, ComponentType.NAVIGATION);
            AnalyticsApi.a("login_button_click");
            DialogHelper.goLogin();
            return;

        case 2131689803: 
            Pinalytics.a(ElementType.SIGNUP_BUTTON, ComponentType.NAVIGATION);
            DialogHelper.goSignup();
            return;

        case 2131689595: 
            Pinalytics.a(ElementType.FACEBOOK_CONNECT);
            AnalyticsApi.a("facebook_continue_button_click");
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK, true));
            return;

        case 2131689757: 
            Pinalytics.a(ElementType.GPLUS_CONNECT);
            AnalyticsApi.a("gplus_button_continue_click");
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.GPLUS, true));
            return;

        case 2131689596: 
            Pinalytics.a(ElementType.TWITTER_CONNECT);
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER, true));
            return;

        case 2131689758: 
            Pinalytics.a(ElementType.TOS_BUTTON);
            AnalyticsApi.a("tos_button_click");
            ActivityHelper.goIntentView(context, Resources.string(0x7f07074f));
            return;
        }
    }
}
