// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideOverviewRouteItem

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RideOverviewRouteItem)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, RideOverviewRouteItem rideoverviewrouteitem, Object obj)
    {
        rideoverviewrouteitem.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0061, "field 'titleTextView'"), 0x7f0d0061, "field 'titleTextView'");
        rideoverviewrouteitem.subtitleTextView = (TextView)viewinjector.subtitleTextView((View)viewinjector.subtitleTextView(obj, 0x7f0d039c, "field 'subtitleTextView'"), 0x7f0d039c, "field 'subtitleTextView'");
        rideoverviewrouteitem.navigateButton = (Button)viewinjector.navigateButton((View)viewinjector.navigateButton(obj, 0x7f0d039b, "field 'navigateButton'"), 0x7f0d039b, "field 'navigateButton'");
        rideoverviewrouteitem.dashedPathView = (View)viewinjector.dashedPathView(obj, 0x7f0d0398, "field 'dashedPathView'");
        rideoverviewrouteitem.pathView = (View)viewinjector.pathView(obj, 0x7f0d0399, "field 'pathView'");
        rideoverviewrouteitem.stopImageView = (ImageView)viewinjector.stopImageView((View)viewinjector.stopImageView(obj, 0x7f0d0397, "field 'stopImageView'"), 0x7f0d0397, "field 'stopImageView'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideOverviewRouteItem)obj);
    }

    public void reset(RideOverviewRouteItem rideoverviewrouteitem)
    {
        rideoverviewrouteitem.titleTextView = null;
        rideoverviewrouteitem.subtitleTextView = null;
        rideoverviewrouteitem.navigateButton = null;
        rideoverviewrouteitem.dashedPathView = null;
        rideoverviewrouteitem.pathView = null;
        rideoverviewrouteitem.stopImageView = null;
    }

    public ()
    {
    }
}
