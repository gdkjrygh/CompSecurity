// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverOverflowMenuView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverOverflowMenuView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverOverflowMenuView driveroverflowmenuview, Object obj)
    {
        driveroverflowmenuview.menuItems = (LinearLayout)viewinjector.menuItems((View)viewinjector.menuItems(obj, 0x7f0d01c2, "field 'menuItems'"), 0x7f0d01c2, "field 'menuItems'");
        driveroverflowmenuview.backgroundView = (View)viewinjector.backgroundView(obj, 0x7f0d01c1, "field 'backgroundView'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverOverflowMenuView)obj);
    }

    public void reset(DriverOverflowMenuView driveroverflowmenuview)
    {
        driveroverflowmenuview.menuItems = null;
        driveroverflowmenuview.backgroundView = null;
    }

    public ()
    {
    }
}
