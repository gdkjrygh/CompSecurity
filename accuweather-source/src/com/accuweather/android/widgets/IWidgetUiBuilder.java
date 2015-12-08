// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import com.accuweather.android.models.WeatherDataModel;

// Referenced classes of package com.accuweather.android.widgets:
//            AccuRemoteViews

public interface IWidgetUiBuilder
{

    public abstract AccuRemoteViews buildRemoteView(int i, WeatherDataModel weatherdatamodel, String s);

    public abstract AccuRemoteViews buildRemoteViewForGpsTimeout(int i, String s);
}
