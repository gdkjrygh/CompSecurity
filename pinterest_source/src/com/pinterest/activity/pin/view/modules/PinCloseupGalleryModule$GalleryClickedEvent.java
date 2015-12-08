// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupGalleryModule

public class _galleryVariant
{

    private final Pin _galleryPin;
    private com.pinterest.api.model.eryClickedEvent._galleryPin _galleryVariant;
    final PinCloseupGalleryModule this$0;

    public Pin getPin()
    {
        return _galleryPin;
    }

    public com.pinterest.api.model.eryClickedEvent getVariant()
    {
        return _galleryVariant;
    }

    public boolean isEventForPin(Pin pin)
    {
        return pin != null && _galleryPin != null && pin.getUid().equals(_galleryPin.getUid());
    }

    Y(Pin pin, com.pinterest.api.model.eryClickedEvent eryclickedevent)
    {
        this$0 = PinCloseupGalleryModule.this;
        super();
        _galleryPin = pin;
        _galleryVariant = eryclickedevent;
    }
}
