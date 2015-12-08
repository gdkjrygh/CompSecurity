// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import rx.functions.Action0;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class this._cls0
    implements Action1
{

    final LyftDriverToggleService this$0;

    public volatile void call(Object obj)
    {
        call((aggingZone)obj);
    }

    public void call(aggingZone aggingzone)
    {
        if (aggingzone == aggingZone.DRAG_STARTED)
        {
            LyftDriverToggleService.access$1100(LyftDriverToggleService.this).call();
        } else
        {
            if (aggingzone == aggingZone.DRAG_TO_SWITCH)
            {
                LyftDriverToggleService.access$1200(LyftDriverToggleService.this).call();
                return;
            }
            if (aggingzone == aggingZone.DRAG_TO_REMOVE)
            {
                LyftDriverToggleService.access$1300(LyftDriverToggleService.this).call();
                return;
            }
        }
    }

    aggingZone()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
