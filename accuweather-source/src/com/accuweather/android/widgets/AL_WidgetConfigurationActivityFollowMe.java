// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Intent;
import android.os.Bundle;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import java.util.HashMap;

// Referenced classes of package com.accuweather.android.widgets:
//            WidgetConfigurationActivity

public class AL_WidgetConfigurationActivityFollowMe extends WidgetConfigurationActivity
{

    private static final String ACTIVITY_PACKAGE_NAME = "com.accuweather.android.widgets";
    private static final String WIDGET_ACTIVITY_CLASS = "com.accuweather.android.widgets.WidgetTermsAndConditionsActivity";

    public AL_WidgetConfigurationActivityFollowMe()
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
        return getData().getALFollowMeWidgetIdMap();
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

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 200 && j == 0)
        {
            if (mAppWidgetId != 0)
            {
                getData().removeALFollowMeWidgetsById(new int[] {
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
        getData().saveALFollowMeWidgetIdMap();
    }
}
