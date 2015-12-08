// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.analytics:
//            Event, RedshiftTrackerExtra, Analytics, GoogleTrackerExtra

public class UiAnalytics
{

    public UiAnalytics()
    {
    }

    public static void trackDismiss(UiElement uielement, Category category)
    {
        trackUiEvent(EventName.DISMISS, uielement, category);
    }

    public static void trackDismiss(UiElement uielement, Category category, String s)
    {
        trackUiEvent(EventName.DISMISS, uielement, category, s);
    }

    public static void trackShown(UiElement uielement, Category category)
    {
        trackUiEvent(EventName.SHOWN, uielement, category);
    }

    public static void trackShown(UiElement uielement, Category category, String s)
    {
        trackUiEvent(EventName.SHOWN, uielement, category, s);
    }

    public static void trackTap(UiElement uielement, Category category)
    {
        trackUiEvent(EventName.TAP, uielement, category);
    }

    public static void trackTap(UiElement uielement, Category category, String s)
    {
        trackUiEvent(EventName.TAP, uielement, category, s);
    }

    private static void trackUiEvent(EventName eventname, UiElement uielement, Category category)
    {
        trackUiEvent(eventname, uielement, category, null);
    }

    private static void trackUiEvent(EventName eventname, UiElement uielement, Category category, String s)
    {
        Event event = new Event(eventname);
        event.putParameter(Parameter.ELEMENT, uielement.toString()).putParameter(Parameter.CATEGORY, category.toString()).addTracker(RedshiftTrackerExtra.create());
        if (!Strings.isNullOrEmpty(s))
        {
            event.putParameter(Parameter.ELEMENT_VALUE, s);
        }
        Analytics.track(event);
        Analytics.track((new Event(String.format("%s_%s", new Object[] {
            uielement.toString(), eventname.toString()
        }))).addTracker(new GoogleTrackerExtra(category.toString())));
    }
}
