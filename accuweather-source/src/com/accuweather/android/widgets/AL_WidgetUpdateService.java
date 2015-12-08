// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.accuweather.android.utilities.Data;
import java.util.HashMap;

// Referenced classes of package com.accuweather.android.widgets:
//            ClockWidgetUpdateService, AL_WidgetProviderFollowMe, AL_WidgetUiBuilder, IWidgetUiBuilder

public class AL_WidgetUpdateService extends ClockWidgetUpdateService
{

    private boolean mIsTesting;

    public AL_WidgetUpdateService()
    {
        mIsTesting = false;
    }

    protected int[] getAppWidgetIds(Context context)
    {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/accuweather/android/widgets/AL_WidgetProviderFollowMe));
    }

    protected int getPendingIntentRequestCode()
    {
        return 0;
    }

    protected HashMap getWidgetIdMap()
    {
        return Data.getInstance(this).getALFollowMeWidgetIdMap();
    }

    protected IWidgetUiBuilder getWidgetUiBuilder(Context context, HashMap hashmap)
    {
        context = new AL_WidgetUiBuilder(context, hashmap);
        context.setTesting(mIsTesting);
        return context;
    }

    protected boolean hasWidgetIdBeenDeleted(int i)
    {
        return Data.getInstance(this).hasALFollowMeWidgetIdBeenDeleted(i);
    }

    protected void removeWidgetsById(int ai[])
    {
        Data.getInstance(this).removeALFollowMeWidgetsById(ai);
    }

    protected void saveWidgetIdMap()
    {
        Data.getInstance(this).saveALFollowMeWidgetIdMap();
    }

    public void setTesting(boolean flag)
    {
        mIsTesting = flag;
    }
}
