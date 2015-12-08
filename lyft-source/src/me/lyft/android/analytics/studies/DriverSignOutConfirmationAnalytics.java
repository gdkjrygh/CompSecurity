// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.infrastructure.lyft.ride.DriverSignOutFrictionDTO;

public class DriverSignOutConfirmationAnalytics
{

    public static final String ACTION_DIALOG_DISMISSED = "action dialog dismissed";
    public static final String ACTION_KEEP_DRIVING = "keep driving";
    public static final String ACTION_SIGN_OUT = "sign out";

    public DriverSignOutConfirmationAnalytics()
    {
    }

    public static AsyncActionAnalytics createSignOutAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.SIGN_OUT_REQUEST, Category.DRIVER_SIGN_OUT_CONFIRMATION);
    }

    public static void dismissed()
    {
        UiAnalytics.trackDismiss(UiElement.DIALOG_DISMISSED, Category.DRIVER_SIGN_OUT_CONFIRMATION);
    }

    public static void keepDriving(long l, DriverSignOutFrictionDTO driversignoutfrictiondto)
    {
        Analytics.track(new DriverSignoutConfirmationEvent("keep driving", l, driversignoutfrictiondto));
        UiAnalytics.trackTap(UiElement.KEEP_DRIVING, Category.DRIVER_SIGN_OUT_CONFIRMATION);
    }

    public static void shown()
    {
        UiAnalytics.trackShown(UiElement.DRIVER_SIGN_OUT_CONFIRMATION_DIALOG, Category.DRIVER_SIGN_OUT_CONFIRMATION);
    }

    public static void signOut(long l, DriverSignOutFrictionDTO driversignoutfrictiondto)
    {
        Analytics.track(new DriverSignoutConfirmationEvent("sign out", l, driversignoutfrictiondto));
        UiAnalytics.trackTap(UiElement.SIGN_OUT, Category.DRIVER_SIGN_OUT_CONFIRMATION);
    }

    private class DriverSignoutConfirmationEvent extends Event
    {

        public DriverSignoutConfirmationEvent(String s, long l, DriverSignOutFrictionDTO driversignoutfrictiondto)
        {
            super(EventName.DRIVER_SIGNOUT_CONFIRMATION_DISMISSED);
            putParameter(Parameter.ACTION, s);
            putParameter(Parameter.TIME_ON_SCREEN_MILLIS, Long.valueOf(l));
            putParameter(Parameter.TITLE, (String)Objects.firstNonNull(driversignoutfrictiondto.getTitleText(), ""));
            putParameter(Parameter.MESSAGE, (String)Objects.firstNonNull(driversignoutfrictiondto.getMessageText(), ""));
            putParameter(Parameter.SIGNOUT_BUTTON_TEXT, (String)Objects.firstNonNull(driversignoutfrictiondto.getSignOutButtonText(), ""));
            putParameter(Parameter.KEEP_DRIVING_BUTTON_TEXT, (String)Objects.firstNonNull(driversignoutfrictiondto.getKeepDrivingButtonText(), ""));
            addTracker(RedshiftTrackerExtra.create());
        }
    }

}
