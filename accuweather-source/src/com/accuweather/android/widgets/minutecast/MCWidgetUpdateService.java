// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.minutecast;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.widgets.ClockWidgetUpdateService;
import com.accuweather.android.widgets.IWidgetUiBuilder;
import java.util.HashMap;

// Referenced classes of package com.accuweather.android.widgets.minutecast:
//            AL_WidgetProvider, MCWidgetUiBuilder

public class MCWidgetUpdateService extends ClockWidgetUpdateService
{

    public MCWidgetUpdateService()
    {
    }

    protected int[] getAppWidgetIds(Context context)
    {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/accuweather/android/widgets/minutecast/AL_WidgetProvider));
    }

    protected int getPendingIntentRequestCode()
    {
        return 0;
    }

    protected HashMap getWidgetIdMap()
    {
        return Data.getInstance(this).getALWidgetIdMap();
    }

    protected IWidgetUiBuilder getWidgetUiBuilder(Context context, HashMap hashmap)
    {
        return new MCWidgetUiBuilder(context, hashmap);
    }

    protected boolean hasWidgetIdBeenDeleted(int i)
    {
        return Data.getInstance(this).hasALWidgetIdBeenDeleted(i);
    }

    protected void removeWidgetsById(int ai[])
    {
        Data.getInstance(this).removeALWidgetsById(ai);
    }

    protected void saveWidgetIdMap()
    {
        Data.getInstance(this).saveALWidgetIdMap();
    }
}
