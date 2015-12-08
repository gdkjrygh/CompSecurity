// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RideOverviewView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, RideOverviewView rideoverviewview, Object obj)
    {
        rideoverviewview.poorConnectionBanner = (TextView)viewinjector.poorConnectionBanner((View)viewinjector.poorConnectionBanner(obj, 0x7f0d038c, "field 'poorConnectionBanner'"), 0x7f0d038c, "field 'poorConnectionBanner'");
        rideoverviewview.partyContainer = (LinearLayout)viewinjector.partyContainer((View)viewinjector.partyContainer(obj, 0x7f0d038d, "field 'partyContainer'"), 0x7f0d038d, "field 'partyContainer'");
        rideoverviewview.routContainer = (LinearLayout)viewinjector.routContainer((View)viewinjector.routContainer(obj, 0x7f0d038e, "field 'routContainer'"), 0x7f0d038e, "field 'routContainer'");
        rideoverviewview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideOverviewView)obj);
    }

    public void reset(RideOverviewView rideoverviewview)
    {
        rideoverviewview.poorConnectionBanner = null;
        rideoverviewview.partyContainer = null;
        rideoverviewview.routContainer = null;
        rideoverviewview.toolbar = null;
    }

    public ()
    {
    }
}
