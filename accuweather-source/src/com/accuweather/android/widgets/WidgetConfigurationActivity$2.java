// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import com.accuweather.android.utilities.Logger;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            WidgetConfigurationActivity

class this._cls0
    implements android.widget.r
{

    final WidgetConfigurationActivity this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Logger.i("AL_WidgetConfigurationActivity", "onItemSelected() inside setOnItemSelectedListener");
        Logger.i("AL_WidgetConfigurationActivity", (new StringBuilder()).append("position:  ").append(i).toString());
        Logger.i("AL_WidgetConfigurationActivity", (new StringBuilder()).append("mLocCodes.get(position):  ").append((String)WidgetConfigurationActivity.access$100(WidgetConfigurationActivity.this).get(i)).toString());
        if (!getWidgetIdMap().containsValue(WidgetConfigurationActivity.access$100(WidgetConfigurationActivity.this).get(i)))
        {
            Logger.i(this, "onListItemClicked updateWeather");
            WidgetConfigurationActivity.access$200(WidgetConfigurationActivity.this, (String)WidgetConfigurationActivity.access$100(WidgetConfigurationActivity.this).get(i));
            return;
        } else
        {
            (new android.app.igurationActivity(WidgetConfigurationActivity.access$300(WidgetConfigurationActivity.this))).igurationActivity(com.accuweather.android.ivity).(com.accuweather.android.dgetAssigned_YouCannotCreateAnotherOne).Button(com.accuweather.android.otherOne, null).tener().show();
            return;
        }
    }

    ()
    {
        this$0 = WidgetConfigurationActivity.this;
        super();
    }
}
