// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.activity.map:
//            MapPin, PinMarkerOptionsChooser, RoundedSize

class _roundedSize extends BackgroundTask
{

    private BitmapDescriptor _descriptor;
    private RoundedSize _roundedSize;
    final MapPin this$0;

    public void onFinish()
    {
        MapPin.access$000(MapPin.this, _descriptor);
    }

    public void run()
    {
        _descriptor = PinMarkerOptionsChooser.instance().getDescriptorFromRounded(_roundedSize.pinId, _roundedSize.rounded, _roundedSize.size);
    }

    public or(RoundedSize roundedsize)
    {
        this$0 = MapPin.this;
        super();
        _roundedSize = roundedsize;
    }
}
