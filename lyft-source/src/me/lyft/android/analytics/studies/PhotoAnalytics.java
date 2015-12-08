// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class PhotoAnalytics
{

    public PhotoAnalytics()
    {
    }

    public static void choosePhoto(Category category)
    {
        UiAnalytics.trackTap(UiElement.CHOOSE_PHOTO, category);
    }

    public static void takePhoto(Category category)
    {
        UiAnalytics.trackTap(UiElement.TAKE_PHOTO, category);
    }
}
