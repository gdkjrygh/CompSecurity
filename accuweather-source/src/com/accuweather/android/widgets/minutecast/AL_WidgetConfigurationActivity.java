// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.minutecast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import com.accuweather.android.widgets.WidgetConfigurationActivity;
import java.util.HashMap;

public class AL_WidgetConfigurationActivity extends WidgetConfigurationActivity
{

    private static final String ACTIVITY_PACKAGE_NAME = "com.accuweather.android.widgets";
    private static final String WIDGET_ACTIVITY_CLASS = "com.accuweather.android.widgets.WidgetTermsAndConditionsActivity";

    public AL_WidgetConfigurationActivity()
    {
    }

    public Bundle buildExtras()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_resizable", false);
        return bundle;
    }

    public HashMap getWidgetIdMap()
    {
        return getData().getALWidgetIdMap();
    }

    protected Class getWidgetTermsAndConditionsActivity()
    {
        if (Utilities.isAndroidLite())
        {
            return super.getWidgetTermsAndConditionsActivity();
        }
        Class class1;
        try
        {
            class1 = Class.forName("com.accuweather.android.widgets.WidgetTermsAndConditionsActivity");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException("Couldn't instantiate AL widget class com.accuweather.android.widgets.WidgetTermsAndConditionsActivity. Did you forget to change the IS_ANDROIDLITE constant? This value is currently false");
        }
        return class1;
    }

    public void init()
    {
        super.init();
        findViewById(com.accuweather.android.R.id.or_use).setVisibility(8);
        findViewById(com.accuweather.android.R.id.use_gps).setVisibility(8);
        findViewById(com.accuweather.android.R.id.descrip_enable_loc).setVisibility(8);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 200 && j == 0)
        {
            if (mAppWidgetId != 0)
            {
                getData().removeALWidgetsById(new int[] {
                    mAppWidgetId
                });
            }
            finish();
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    protected void saveWidgetData()
    {
        getData().saveALWidgetIdMap();
    }
}
