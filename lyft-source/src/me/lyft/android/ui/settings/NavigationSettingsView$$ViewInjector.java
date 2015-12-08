// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.view.View;
import android.widget.ListView;
import me.lyft.android.controls.Toggle;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.settings:
//            NavigationSettingsView

public class 
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (NavigationSettingsView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, NavigationSettingsView navigationsettingsview, Object obj)
    {
        navigationsettingsview.navigatorsListView = (ListView)viewinjector.navigatorsListView((View)viewinjector.navigatorsListView(obj, 0x7f0d028a, "field 'navigatorsListView'"), 0x7f0d028a, "field 'navigatorsListView'");
        navigationsettingsview.autoNavigationToggle = (Toggle)viewinjector.autoNavigationToggle((View)viewinjector.autoNavigationToggle(obj, 0x7f0d007b, "field 'autoNavigationToggle'"), 0x7f0d007b, "field 'autoNavigationToggle'");
        navigationsettingsview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((NavigationSettingsView)obj);
    }

    public void reset(NavigationSettingsView navigationsettingsview)
    {
        navigationsettingsview.navigatorsListView = null;
        navigationsettingsview.autoNavigationToggle = null;
        navigationsettingsview.toolbar = null;
    }

    public ()
    {
    }
}
