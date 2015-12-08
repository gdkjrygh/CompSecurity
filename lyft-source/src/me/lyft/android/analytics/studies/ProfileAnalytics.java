// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class ProfileAnalytics
{

    public ProfileAnalytics()
    {
    }

    public static AsyncActionAnalytics saveDataAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.SAVE_PROFILE_DATA, Category.PROFILE);
    }

    public static AsyncActionAnalytics savePhotoAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.SAVE_PROFILE_PHOTO, Category.PROFILE);
    }

    public static AsyncActionAnalytics savePhotoAndDataAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.SAVE_PROFILE_PHOTO_AND_DATA, Category.PROFILE);
    }

    public static AsyncActionAnalytics trackRefreshFacebookSession()
    {
        return (new AsyncActionAnalytics(ActionName.REFRESH_FACEBOOK_SESSION, Category.PROFILE)).trackRequest();
    }

    public static void updatePhoto()
    {
        UiAnalytics.trackTap(UiElement.UPDATE_PROFILE_PHOTO, Category.PROFILE);
    }
}
