// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.activity.pin.adapter.ImageGalleryAdapter;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class > extends android.support.v4.view.geListener
{

    final PinCloseupGalleryModule this$0;

    public void onPageSelected(int i)
    {
        com.pinterest.api.model.GalleryModule gallerymodule;
        boolean flag;
        if (PinCloseupGalleryModule.access$100(PinCloseupGalleryModule.this) == 0 || i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).darken();
        PinCloseupGalleryModule.access$102(PinCloseupGalleryModule.this, i);
        PinCloseupGalleryModule.access$002(PinCloseupGalleryModule.this, PinCloseupGalleryModule.access$200(PinCloseupGalleryModule.this).getViewAtPosition(PinCloseupGalleryModule.access$100(PinCloseupGalleryModule.this)));
        PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).lighten();
        if (flag)
        {
            PinCloseupGalleryModule.access$300(PinCloseupGalleryModule.this, i);
        }
        gallerymodule = PinCloseupGalleryModule.access$000(PinCloseupGalleryModule.this).getGalleryItem();
        Events.post(new lleryUpdatedEvent(PinCloseupGalleryModule.this, gallerymodule));
        Pinalytics.a(_pinUid, i, gallerymodule.gnature());
    }

    lleryUpdatedEvent()
    {
        this$0 = PinCloseupGalleryModule.this;
        super();
    }
}
