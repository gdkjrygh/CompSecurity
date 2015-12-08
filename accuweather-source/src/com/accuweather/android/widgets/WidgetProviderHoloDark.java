// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;


// Referenced classes of package com.accuweather.android.widgets:
//            WidgetProviderHoloLight, HoloUiBuilder

public class WidgetProviderHoloDark extends WidgetProviderHoloLight
{
    public static class UpdateService extends WidgetProviderHoloLight.UpdateService
    {

        protected HoloUiBuilder getHoloUiBuilder()
        {
            return new HoloDarkUiBuilder();
        }

        public UpdateService()
        {
        }
    }

    private class UpdateService.HoloDarkUiBuilder extends HoloUiBuilder
    {

        final UpdateService this$0;

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
            return com.accuweather.android.R.layout.widget_item_holo_dark;
        }

        protected Class getWidgetProviderClass()
        {
            return com/accuweather/android/widgets/WidgetProviderHoloDark;
        }

        protected Class getWidgetServiceClass()
        {
            return com/accuweather/android/widgets/WidgetProviderHoloDark$UpdateService;
        }

        private UpdateService.HoloDarkUiBuilder()
        {
            this$0 = UpdateService.this;
            super();
        }

    }


    public WidgetProviderHoloDark()
    {
    }

    protected Class getUpdateServiceClass()
    {
        return com/accuweather/android/widgets/WidgetProviderHoloDark$UpdateService;
    }
}
