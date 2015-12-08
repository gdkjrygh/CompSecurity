// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public final class RegistrationAnalytics
{

    public RegistrationAnalytics()
    {
    }

    public static AsyncActionAnalytics createLoadExperimentsAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.LOAD_EXPERIMENTS, Category.REGISTRATION);
    }

    public static AsyncActionAnalytics createStartAppAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.START_APP, Category.REGISTRATION);
    }

    public static void trackCloseTermsOfService()
    {
        UiAnalytics.trackTap(UiElement.CLOSE_TOS, Category.REGISTRATION);
    }
}
