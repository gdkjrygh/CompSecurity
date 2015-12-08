// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package me.lyft.android.ui.passenger:
//            RideInProgressBottomView, DriverPhotoView

public class I
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RideInProgressBottomView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, RideInProgressBottomView rideinprogressbottomview, Object obj)
    {
        rideinprogressbottomview.rideDetailsView = (ViewGroup)viewinjector.rideDetailsView((View)viewinjector.rideDetailsView(obj, 0x7f0d0318, "field 'rideDetailsView'"), 0x7f0d0318, "field 'rideDetailsView'");
        rideinprogressbottomview.driverPhotoView = (DriverPhotoView)viewinjector.driverPhotoView((View)viewinjector.driverPhotoView(obj, 0x7f0d0317, "field 'driverPhotoView'"), 0x7f0d0317, "field 'driverPhotoView'");
    }

    public volatile void reset(Object obj)
    {
        reset((RideInProgressBottomView)obj);
    }

    public void reset(RideInProgressBottomView rideinprogressbottomview)
    {
        rideinprogressbottomview.rideDetailsView = null;
        rideinprogressbottomview.driverPhotoView = null;
    }

    public I()
    {
    }
}
