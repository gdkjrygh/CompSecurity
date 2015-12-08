// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets.sharp;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.accuweather.android.utilities.Logger;

// Referenced classes of package com.accuweather.android.widgets.sharp:
//            SharpWidgetUpdateService

public class SharpWidgetProvider extends AppWidgetProvider
{

    public SharpWidgetProvider()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Intent intent1 = new Intent(intent);
        intent1.setClass(context, com/accuweather/android/widgets/sharp/SharpWidgetUpdateService);
        Logger.i(getClass().getName(), (new StringBuilder()).append("In onReceive, intent = ").append(intent1).toString());
        context.startService(intent1);
        super.onReceive(context, intent);
    }
}
