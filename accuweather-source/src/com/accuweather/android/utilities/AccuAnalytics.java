// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;

// Referenced classes of package com.accuweather.android.utilities:
//            Logger

public class AccuAnalytics
{
    private static final class EventType extends Enum
    {

        private static final EventType $VALUES[];
        public static final EventType STATE;
        public static final EventType UI;

        public static EventType valueOf(String s)
        {
            return (EventType)Enum.valueOf(com/accuweather/android/utilities/AccuAnalytics$EventType, s);
        }

        public static EventType[] values()
        {
            return (EventType[])$VALUES.clone();
        }

        static 
        {
            UI = new EventType("UI", 0);
            STATE = new EventType("STATE", 1);
            $VALUES = (new EventType[] {
                UI, STATE
            });
        }

        private EventType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String ACTION_BAR_LOCATION_SELECTED = "Action bar location selected";
    public static final String ADD_LOCATION_FROM_ACTION_BAR = "Add location from Action Bar";
    public static final String AMAZON_SHOPPING_PRODUCT_CLICK = "Amazon shopping product click";
    public static final String AMAZON_SHOPPING_TRIANGLE_CLICK = "Amazon shopping triangle click";
    public static final String CLICKS_ON_MINUTECAST_SUMMARY = "Clicks on MinuteCast summary";
    public static final String CLICKS_ON_TEASER_CONTENT = "Clicks on Teaser content";
    public static final String CLICK_ON_TRIGGER_SWITCH_MINUTECAST = "Clicks on trigger to switch between MinuteCast circle view and list view";
    public static final String CLOSE_NAVIGATION_DRAWER = "Close Navigation Drawer";
    public static final String DAILY_DETAILS_LAUNCHED = "Daily details launched";
    public static final String DELETE_LOCATION = "Delete location";
    public static final String DIALOG_NEGATIVE_CLICK = "Dialog negative click";
    public static final String DIALOG_POSITIVE_CLICK = "Dialog positive click";
    public static final String DMA_CLICKED = "DMA clicked";
    public static final String GPS_SELECTED = "GPS";
    public static final String GRAPHS_OFF_SELECTED = "Graphs off selected";
    public static final String GRAPHS_ON_SELECTED = "Graphs on selected";
    public static final String HOME_SELECTED = "Action bar Home pressed";
    public static final String HOURLY_DETAILS_LAUNCHED = "Hourly details launched";
    public static final String INTERACTION_ON_MINUTECAST_CIRCLE = "Interaction on MinuteCast circle";
    public static final String INTERACTION_ON_MINUTECAST_LIST_VIEW = "Interaction on the MinuteCast List view";
    public static final String INTERACTION_ON_MINUTECAST_LIST_VIEW_SCROLL_BAR = "Interaction on the MinuteCast List view using scroll bar";
    public static final String LOCATION_ADDED = "Location added with new location count";
    public static final String LOCATION_ALIAS_NEGATIVE_CLICK = "Location alias negative click";
    public static final String LOCATION_ALIAS_POSITIVE_CLICK = "Location alias positive click";
    public static final String LOCATION_COUNT_ON_RESUME = "Location count on app resume";
    public static final String LOCATION_LONG_PRESSED = "Location long pressed";
    public static final String LOCATION_SELECTED_FROM_MANAGEMENT_PAGE = "Location selected from management page";
    public static final String MAP_ADD_LOCATION_TILE_PRESSED = "Map add location tile pressed";
    public static final String MAP_DETAILS_LAUNCHED = "Map details launched";
    public static final String NEWS_DETAILS_LAUNCHED = "News details launched";
    public static final String OPEN_NAVIGATION_DRAWER = "Open Navigation Drawer";
    public static final String QUICK_SETUP_ACCEPTED = "Quick setup accepted";
    public static final String QUICK_SETUP_DECLINED = "Quick setup declined";
    public static final String REFRESH_SELECTED = "Refresh selected";
    public static final String SAVE_GPS_LOCATION = "Save GPS location";
    public static final String SEARCH_BUTTON_CLICKED = "Search button clicked";
    public static final String SETTINGS_ITEM_SELECTED = "Settings item selected";
    public static final String SETTINGS_SELECTED = "Settings selected";
    public static final String SET_NEW_HOME_LOCATION = "Set new home location";
    public static final String SHARE_SELECTED = "Share selected";
    public static final String SHARE_TARGET_SELECTED = "Share target selected";
    public static final String SHOW_ALERT_WEB_VIEW = "Show alert web view";
    public static final String SPINNER_ITEM_SELECTED = "Spinner item selected";
    public static final String START_APP_FROM_PUSH = "Starting app from push notification";
    public static final String START_APP_FROM_WIDGET = "Starting app from widget";
    public static final String START_APP_NORMALLY = "Starting app normally";
    public static final String VIDEO_DETAILS_LAUNCHED = "Video details launched";
    public static final String VIEWS_OF_MINUTECAST_SUMMARY = "Views of MinuteCast summary";
    public static final String VIEWS_OF_TEASER_CONTENT = "Views of Teaser content";
    public static final String VIEW_ON_MINUTECAST_CIRCLE_VIEW = "Views on MinuteCast Circle view";
    public static final String VIEW_ON_MINUTECAST_LIST_VIEW = "Views on MinuteCast List view";

    public AccuAnalytics()
    {
    }

    private static void logEvent(Context context, String s, String s1, EventType eventtype)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        EasyTracker.getTracker().trackEvent((new StringBuilder()).append(context.getClass().getSimpleName()).append("-").append(eventtype.name()).toString(), s, s1, Long.valueOf(0L));
        if (Logger.isDebugEnabled())
        {
            Logger.d(com/accuweather/android/utilities/AccuAnalytics.getName(), (new StringBuilder()).append("Analytics for ").append(eventtype.name()).append(" event ").append(s).append(", value = ").append(s1).toString());
        }
        return;
        context;
    }

    public static void logStateEvent(Context context, String s)
    {
        logStateEvent(context, s, "");
    }

    public static void logStateEvent(Context context, String s, int i)
    {
        logStateEvent(context, s, String.valueOf(i));
    }

    public static void logStateEvent(Context context, String s, String s1)
    {
        logEvent(context, s, s1, EventType.STATE);
    }

    public static void logUiEvent(Context context, String s)
    {
        logUiEvent(context, s, "");
    }

    public static void logUiEvent(Context context, String s, int i)
    {
        logUiEvent(context, s, String.valueOf(i));
    }

    public static void logUiEvent(Context context, String s, String s1)
    {
        logEvent(context, s, s1, EventType.UI);
    }
}
