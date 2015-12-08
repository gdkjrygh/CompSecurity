// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            FarePriceWidgetView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (FarePriceWidgetView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, FarePriceWidgetView farepricewidgetview, Object obj)
    {
        farepricewidgetview.farePrice = (TextView)viewinjector.farePrice((View)viewinjector.farePrice(obj, 0x7f0d021c, "field 'farePrice'"), 0x7f0d021c, "field 'farePrice'");
        farepricewidgetview.comparisonLabel = (TextView)viewinjector.comparisonLabel((View)viewinjector.comparisonLabel(obj, 0x7f0d021d, "field 'comparisonLabel'"), 0x7f0d021d, "field 'comparisonLabel'");
    }

    public volatile void reset(Object obj)
    {
        reset((FarePriceWidgetView)obj);
    }

    public void reset(FarePriceWidgetView farepricewidgetview)
    {
        farepricewidgetview.farePrice = null;
        farepricewidgetview.comparisonLabel = null;
    }

    public ()
    {
    }
}
