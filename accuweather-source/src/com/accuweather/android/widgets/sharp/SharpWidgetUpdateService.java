// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.sharp;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.widgets.ClockWidgetUpdateService;
import com.accuweather.android.widgets.IWidgetUiBuilder;
import java.util.HashMap;

// Referenced classes of package com.accuweather.android.widgets.sharp:
//            SharpWidgetProvider, SharpWidgetUiBuilder

public class SharpWidgetUpdateService extends ClockWidgetUpdateService
{

    private boolean mIsTesting;

    public SharpWidgetUpdateService()
    {
        mIsTesting = false;
    }

    protected int[] getAppWidgetIds(Context context)
    {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/accuweather/android/widgets/sharp/SharpWidgetProvider));
    }

    protected int getPendingIntentRequestCode()
    {
        return 1;
    }

    protected HashMap getWidgetIdMap()
    {
        return Data.getInstance(this).getSharpWidgetIdMap();
    }

    protected IWidgetUiBuilder getWidgetUiBuilder(Context context, HashMap hashmap)
    {
        context = new SharpWidgetUiBuilder(context, hashmap);
        context.setTesting(mIsTesting);
        return context;
    }

    protected boolean hasWidgetIdBeenDeleted(int i)
    {
        return Data.getInstance(this).hasSharpWidgetIdBeenDeleted(i);
    }

    protected void removeWidgetsById(int ai[])
    {
        Data.getInstance(this).removeSharpWidgetsById(ai);
    }

    protected void saveWidgetIdMap()
    {
        Data.getInstance(this).saveSharpWidgetIdMap();
    }

    public void setTesting(boolean flag)
    {
        mIsTesting = flag;
    }
}
