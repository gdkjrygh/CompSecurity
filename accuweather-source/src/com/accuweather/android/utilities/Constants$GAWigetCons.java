// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


// Referenced classes of package com.accuweather.android.utilities:
//            Constants

public static class 
{

    public static final String GA_TRACKING_URL = "http://www.accuweather.com/get/beacon?account=UA-28728915-16&path=%2Fwidget%2FWIDGET_TYPE&event_info=Widget_Monthly_Count;WIDGET_TYPE";
    public static final String GA_TRACKING_URL_OLD = "http://www.accuweather.com/get/beacon?account=UA-28728915-16&path=%2Fwidget%2FWIDGET_TYPE&event_info=Widget_Unique_Monthly_View;WIDGET_TYPE";
    public static final String INTENT_ACTION_RESET_TRACKING_WIDGET = "com.accuweather.android.widget.ga.reset";
    public static final String INTENT_ACTION_START_TRACKING_WIDGET = "com.accuweather.android.widget.ga.fire_beacon";
    public static final String KEY_LAST_TIME_TRIGGER = "last_time_trigger_new";
    public static final String KEY_LIST_PROVIDER_REMAINING = "list_provider_remaining_new";
    public static final String KEY_NUMBER_TIME_RETRY = "key_number_time_retry_new";
    public static final String KEY_RETRY_ERROR = "retry_error_new";
    public static final int MAX_TIME_RETRY = 10;
    public static final long TIME_INTERVAL_RETRY_IN_MILLIS = 0x1d4c0L;
    public static final int TIME_TRIGGER_TYPE = 2;
    public static final int TIME_TRIGGER_VALUE = 1;
    public static final String WIDGET_TYPE_CLOCK = "Clock";
    public static final String WIDGET_TYPE_HOLO_DARK = "Holo_dark";
    public static final String WIDGET_TYPE_HOLO_LIGHT = "Holo_light";
    public static final String WIDGET_TYPE_MINUTE_CAST = "MinuteCast";

    public ()
    {
    }
}
