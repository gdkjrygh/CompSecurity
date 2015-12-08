// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class DriverDocumentsAnalytics
{

    public DriverDocumentsAnalytics()
    {
    }

    public static AsyncActionAnalytics createInspectionSubmitEvent()
    {
        return new AsyncActionAnalytics(ActionName.DRIVER_DOCS_INSPECTION_SUBMIT, Category.DRIVER_DOCUMENTS);
    }

    public static AsyncActionAnalytics createInsuranceSubmitEvent()
    {
        return new AsyncActionAnalytics(ActionName.DRIVER_DOCS_INSURANCE_SUBMIT, Category.DRIVER_DOCUMENTS);
    }

    public static AsyncActionAnalytics createRegistrationSubmitEvent()
    {
        return new AsyncActionAnalytics(ActionName.DRIVER_DOCS_REGISTRATION_SUBMIT, Category.DRIVER_DOCUMENTS);
    }

    public static void driverInsuranceDialogNotNow()
    {
        UiAnalytics.trackTap(UiElement.DRIVER_INSURANCE_PROMPT_NOT_NOW, Category.DRIVER_DOCUMENTS);
    }

    public static void driverInsuranceDialogUpdate()
    {
        UiAnalytics.trackTap(UiElement.DRIVER_INSURANCE_PROMPT_UPDATE, Category.DRIVER_DOCUMENTS);
    }

    public static void driverInsuranceUpdate()
    {
        UiAnalytics.trackTap(UiElement.DRIVER_INSURANCE_UPDATE, Category.DRIVER_DOCUMENTS);
    }
}
