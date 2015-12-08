// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.view.ViewGroup;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideCompletedView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverRideCompletedView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverRideCompletedView driverridecompletedview, Object obj)
    {
        driverridecompletedview.ratingAndEarningScreen = (ViewGroup)viewinjector.ratingAndEarningScreen((View)viewinjector.ratingAndEarningScreen(obj, 0x7f0d01d4, "field 'ratingAndEarningScreen'"), 0x7f0d01d4, "field 'ratingAndEarningScreen'");
        driverridecompletedview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverRideCompletedView)obj);
    }

    public void reset(DriverRideCompletedView driverridecompletedview)
    {
        driverridecompletedview.ratingAndEarningScreen = null;
        driverridecompletedview.toolbar = null;
    }

    public ()
    {
    }
}
