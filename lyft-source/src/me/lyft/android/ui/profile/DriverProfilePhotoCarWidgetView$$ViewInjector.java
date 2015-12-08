// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            DriverProfilePhotoCarWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DriverProfilePhotoCarWidgetView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, DriverProfilePhotoCarWidgetView driverprofilephotocarwidgetview, Object obj)
    {
        driverprofilephotocarwidgetview.photoImageView = (ImageView)viewinjector.photoImageView((View)viewinjector.photoImageView(obj, 0x7f0d0228, "field 'photoImageView'"), 0x7f0d0228, "field 'photoImageView'");
        driverprofilephotocarwidgetview.driverPhotoImageView = (ImageView)viewinjector.driverPhotoImageView((View)viewinjector.driverPhotoImageView(obj, 0x7f0d036a, "field 'driverPhotoImageView'"), 0x7f0d036a, "field 'driverPhotoImageView'");
        driverprofilephotocarwidgetview.nameTextView = (TextView)viewinjector.nameTextView((View)viewinjector.nameTextView(obj, 0x7f0d036b, "field 'nameTextView'"), 0x7f0d036b, "field 'nameTextView'");
        driverprofilephotocarwidgetview.licensePlateTextView = (TextView)viewinjector.licensePlateTextView((View)viewinjector.licensePlateTextView(obj, 0x7f0d0369, "field 'licensePlateTextView'"), 0x7f0d0369, "field 'licensePlateTextView'");
        driverprofilephotocarwidgetview.carMakeModelTextView = (TextView)viewinjector.carMakeModelTextView((View)viewinjector.carMakeModelTextView(obj, 0x7f0d0368, "field 'carMakeModelTextView'"), 0x7f0d0368, "field 'carMakeModelTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((DriverProfilePhotoCarWidgetView)obj);
    }

    public void reset(DriverProfilePhotoCarWidgetView driverprofilephotocarwidgetview)
    {
        driverprofilephotocarwidgetview.photoImageView = null;
        driverprofilephotocarwidgetview.driverPhotoImageView = null;
        driverprofilephotocarwidgetview.nameTextView = null;
        driverprofilephotocarwidgetview.licensePlateTextView = null;
        driverprofilephotocarwidgetview.carMakeModelTextView = null;
    }

    public ()
    {
    }
}
