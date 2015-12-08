// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;

public class WorkPerksAnalytics
{

    public WorkPerksAnalytics()
    {
    }

    public static AsyncActionAnalytics trackEditEmailAttempt()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.WORK_PERKS_EDIT_EMAIL, Category.WORK_PERKS);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static AsyncActionAnalytics trackEnterEmailAttempt()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.WORK_PERKS_ENTER_EMAIL, Category.WORK_PERKS);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static AsyncActionAnalytics trackGetUserOrganizationAttempt()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.WORK_PERKS_GET_USER_ORGANIZATION, Category.WORK_PERKS);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static AsyncActionAnalytics trackSendInvitesAttempt()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.WORK_PERKS_SEND_INVITES, Category.WORK_PERKS);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static AsyncActionAnalytics trackSendSmsAttempt()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.WORK_PERKS_SEND_SMS, Category.WORK_PERKS);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }
}
