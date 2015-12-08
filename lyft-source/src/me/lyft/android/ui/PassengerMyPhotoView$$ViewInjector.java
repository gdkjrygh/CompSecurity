// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            PassengerMyPhotoView, PassengerPhotoView

public class  extends 
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (PassengerMyPhotoView)obj, obj1);
    }

    public void inject(butterknife.jector jector, PassengerMyPhotoView passengermyphotoview, Object obj)
    {
        super.ject(jector, passengermyphotoview, obj);
        passengermyphotoview.userImageView = (ImageView)jector.geView((View)jector.geView(obj, 0x7f0d03e8, "field 'userImageView'"), 0x7f0d03e8, "field 'userImageView'");
        passengermyphotoview.userNeedsPhotoContainer = (View)jector.dsPhotoContainer(obj, 0x7f0d0413, null);
        passengermyphotoview.progress = (ProgressBar)jector.s((View)jector.s(obj, 0x7f0d0415, null), 0x7f0d0415, "field 'progress'");
        passengermyphotoview.addPhotoText = (TextView)jector.oText((View)jector.oText(obj, 0x7f0d0414, null), 0x7f0d0414, "field 'addPhotoText'");
    }

    public volatile void inject(butterknife.jector jector, PassengerPhotoView passengerphotoview, Object obj)
    {
        inject(jector, (PassengerMyPhotoView)passengerphotoview, obj);
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerMyPhotoView)obj);
    }

    public void reset(PassengerMyPhotoView passengermyphotoview)
    {
        super.set(passengermyphotoview);
        passengermyphotoview.userImageView = null;
        passengermyphotoview.userNeedsPhotoContainer = null;
        passengermyphotoview.progress = null;
        passengermyphotoview.addPhotoText = null;
    }

    public volatile void reset(PassengerPhotoView passengerphotoview)
    {
        reset((PassengerMyPhotoView)passengerphotoview);
    }

    public ()
    {
    }
}
