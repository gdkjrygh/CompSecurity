// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.os.Bundle;

// Referenced classes of package com.accuweather.android.widgets:
//            WidgetConfigurationActivity, WidgetTermsAndConditionsActivity

public class HoloLight_WidgetConfigurationActivity extends WidgetConfigurationActivity
{

    public static final String DEBUG_TAG = "WidgetConfigurationActivity";

    public HoloLight_WidgetConfigurationActivity()
    {
    }

    public Bundle buildExtras()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_holo_light", true);
        bundle.putBoolean("is_from_resizable", true);
        return bundle;
    }

    protected Class getWidgetTermsAndConditionsActivity()
    {
        return com/accuweather/android/widgets/WidgetTermsAndConditionsActivity;
    }
}
