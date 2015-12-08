// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverActivitiesView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverActivitiesView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DriverActivitiesView driveractivitiesview, Object obj)
    {
        driveractivitiesview.activityTitle = (TextView)viewinjector.activityTitle((View)viewinjector.activityTitle(obj, 0x7f0d019c, "field 'activityTitle'"), 0x7f0d019c, "field 'activityTitle'");
        driveractivitiesview.amountEarned = (TextView)viewinjector.amountEarned((View)viewinjector.amountEarned(obj, 0x7f0d019d, "field 'amountEarned'"), 0x7f0d019d, "field 'amountEarned'");
        driveractivitiesview.ridesCount = (TextView)viewinjector.ridesCount((View)viewinjector.ridesCount(obj, 0x7f0d019e, "field 'ridesCount'"), 0x7f0d019e, "field 'ridesCount'");
        driveractivitiesview.hoursCount = (TextView)viewinjector.hoursCount((View)viewinjector.hoursCount(obj, 0x7f0d019f, "field 'hoursCount'"), 0x7f0d019f, "field 'hoursCount'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverActivitiesView)obj);
    }

    public void reset(DriverActivitiesView driveractivitiesview)
    {
        driveractivitiesview.activityTitle = null;
        driveractivitiesview.amountEarned = null;
        driveractivitiesview.ridesCount = null;
        driveractivitiesview.hoursCount = null;
    }

    public ()
    {
    }
}
