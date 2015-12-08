// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.support.v4.view.ViewPager;
import com.pinterest.api.model.Pin;
import com.pinterest.events.VariantUpdatedEvent;
import java.util.List;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

class this._cls0
    implements com.pinterest.base.oseupGalleryModule._cls7
{

    final PinCloseupGalleryModule this$0;

    public void onEventMainThread(VariantUpdatedEvent variantupdatedevent)
    {
        com.pinterest.api.model.GalleryModule gallerymodule = variantupdatedevent.a();
        if (gallerymodule != null && variantupdatedevent.a(_pin)) goto _L2; else goto _L1
_L1:
        PinCloseupGalleryModule.access$502(PinCloseupGalleryModule.this, null);
_L4:
        return;
_L2:
        variantupdatedevent = gallerymodule.Images();
        if (variantupdatedevent != null && !variantupdatedevent.isEmpty())
        {
            variantupdatedevent = (com.pinterest.api.model.Images)variantupdatedevent.get(0);
            List list = _pin.getGalleryItems();
            int i = 0;
            while (i < list.size()) 
            {
                if (((com.pinterest.api.model.GalleryModule._pin)list.get(i)).gnature().equals(variantupdatedevent.gnature()))
                {
                    PinCloseupGalleryModule.access$400(PinCloseupGalleryModule.this).setCurrentItem(i);
                    PinCloseupGalleryModule.access$502(PinCloseupGalleryModule.this, gallerymodule);
                    return;
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = PinCloseupGalleryModule.this;
        super();
    }
}
