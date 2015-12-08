// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.SuggestedFriendAction;

// Referenced classes of package com.snapchat.android.analytics:
//            ProfileEventAnalytics

public static final class sContext
{

    public static final int $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[];
    static final int $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[];
    static final int $SwitchMap$com$snapchat$android$model$FriendAction[];
    public static final int $SwitchMap$com$snapchat$android$model$SuggestedFriendAction[];

    static 
    {
        $SwitchMap$com$snapchat$android$model$Friend$AddSourceType = new int[com.snapchat.android.model.ues().length];
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_ADDED_ME_BACK.inal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror29) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_PHONE.inal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror28) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_QR_CODE.inal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror27) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_USERNAME.inal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_NEARBY.inal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_SUGGESTED.inal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$Friend$AddSourceType[com.snapchat.android.model.ED_BY_OFFICIAL_STORY_SEARCH.inal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        $SwitchMap$com$snapchat$android$model$FriendAction = new int[FriendAction.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.ADD.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.DELETE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.BLOCK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.UNBLOCK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.SET_DISPLAY_NAME.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$snapchat$android$model$FriendAction[FriendAction.IGNORE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        $SwitchMap$com$snapchat$android$model$SuggestedFriendAction = new int[SuggestedFriendAction.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$model$SuggestedFriendAction[SuggestedFriendAction.HIDE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext = new int[sContext.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_MAIN_PAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_PICTURES_PAGE_VIEW.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_ADDED_ME_PAGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_ADD_FRIENDS_MENU_PAGE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_ADD_FRIENDS_BY_USERNAME_PAGE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_ADD_NEARBY_FRIENDS_PAGE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_MY_FRIENDS_PAGE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_ADD_FRIENDS_BY_CONTACTS_PAGE.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.PROFILE_MY_CONTACTS_PAGE.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.CAMERA_PAGE.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.FEED.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.STORIES.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.HELP_PAGE.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.SETTINGS.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.SNAPCODE_PAGE.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$snapchat$android$analytics$AnalyticsEvents$AnalyticsContext[sContext.TROPHY.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
