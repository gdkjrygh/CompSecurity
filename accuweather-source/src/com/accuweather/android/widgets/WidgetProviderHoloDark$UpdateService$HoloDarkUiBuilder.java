// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;


// Referenced classes of package com.accuweather.android.widgets:
//            HoloUiBuilder, WidgetProviderHoloDark

private class <init> extends HoloUiBuilder
{

    final <init> this$0;

    protected String getIconPrefix()
    {
        return "icon_white_";
    }

    protected String getIntentForLocationAdvancing()
    {
        return "com.accuweather.android.action.ADVANCE_LOCATION_DARK";
    }

    protected int getWidgetLayoutId()
    {
        return com.accuweather.android.Builder;
    }

    protected Class getWidgetProviderClass()
    {
        return com/accuweather/android/widgets/WidgetProviderHoloDark;
    }

    protected Class getWidgetServiceClass()
    {
        return com/accuweather/android/widgets/WidgetProviderHoloDark$UpdateService;
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
