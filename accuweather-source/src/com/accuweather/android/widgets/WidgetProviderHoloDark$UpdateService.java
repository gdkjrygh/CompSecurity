// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;


// Referenced classes of package com.accuweather.android.widgets:
//            WidgetProviderHoloDark, HoloUiBuilder

public static class HoloDarkUiBuilder extends 
{
    private class HoloDarkUiBuilder extends HoloUiBuilder
    {

        final WidgetProviderHoloDark.UpdateService this$0;

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

        private HoloDarkUiBuilder()
        {
            this$0 = WidgetProviderHoloDark.UpdateService.this;
            super();
        }

        HoloDarkUiBuilder(WidgetProviderHoloDark._cls1 _pcls1)
        {
            this();
        }
    }


    protected HoloUiBuilder getHoloUiBuilder()
    {
        return new HoloDarkUiBuilder(null);
    }

    public HoloDarkUiBuilder()
    {
    }
}
