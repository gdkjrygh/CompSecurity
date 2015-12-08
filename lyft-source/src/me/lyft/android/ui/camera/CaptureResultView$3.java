// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureResultView

class this._cls0
    implements Action1
{

    final CaptureResultView this$0;

    public volatile void call(Object obj)
    {
        call((RideDTO)obj);
    }

    public void call(RideDTO ridedto)
    {
        if ("droppedOff".equalsIgnoreCase(ridedto.getStatus()))
        {
            appFlow.resetTo(new me.lyft.android.ui.en());
        }
    }

    TO()
    {
        this$0 = CaptureResultView.this;
        super();
    }
}
