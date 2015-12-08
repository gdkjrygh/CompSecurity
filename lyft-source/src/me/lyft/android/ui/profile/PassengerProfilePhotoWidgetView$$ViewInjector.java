// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerProfilePhotoWidgetView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerProfilePhotoWidgetView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, PassengerProfilePhotoWidgetView passengerprofilephotowidgetview, Object obj)
    {
        passengerprofilephotowidgetview.photoImageView = (ImageView)viewinjector.photoImageView((View)viewinjector.photoImageView(obj, 0x7f0d0228, "field 'photoImageView'"), 0x7f0d0228, "field 'photoImageView'");
        passengerprofilephotowidgetview.nameTextView = (TextView)viewinjector.nameTextView((View)viewinjector.nameTextView(obj, 0x7f0d036b, "field 'nameTextView'"), 0x7f0d036b, "field 'nameTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerProfilePhotoWidgetView)obj);
    }

    public void reset(PassengerProfilePhotoWidgetView passengerprofilephotowidgetview)
    {
        passengerprofilephotowidgetview.photoImageView = null;
        passengerprofilephotowidgetview.nameTextView = null;
    }

    public ()
    {
    }
}
