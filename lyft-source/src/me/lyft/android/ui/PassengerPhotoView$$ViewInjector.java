// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            PassengerPhotoView, UserImageView

public class _cls9
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (PassengerPhotoView)obj, obj1);
    }

    public void inject(butterknife.jector jector, PassengerPhotoView passengerphotoview, Object obj)
    {
        passengerphotoview.passengerPhotoImageView = (UserImageView)jector.erPhotoImageView((View)jector.erPhotoImageView(obj, 0x7f0d01bc, "field 'passengerPhotoImageView'"), 0x7f0d01bc, "field 'passengerPhotoImageView'");
        passengerphotoview.passengerName = (TextView)jector.erName((View)jector.erName(obj, 0x7f0d02ac, "field 'passengerName'"), 0x7f0d02ac, "field 'passengerName'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerPhotoView)obj);
    }

    public void reset(PassengerPhotoView passengerphotoview)
    {
        passengerphotoview.passengerPhotoImageView = null;
        passengerphotoview.passengerName = null;
    }

    public _cls9()
    {
    }
}
