// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            SlidingPlayerController

private class <init> extends DefaultSubscriber
{

    final SlidingPlayerController this$0;

    public void onNext(PlayerUICommand playeruicommand)
    {
        if (playeruicommand.isExpand())
        {
            SlidingPlayerController.access$200(SlidingPlayerController.this);
        } else
        {
            if (playeruicommand.isCollapse())
            {
                SlidingPlayerController.access$300(SlidingPlayerController.this);
                return;
            }
            if (playeruicommand.isShow())
            {
                SlidingPlayerController.access$400(SlidingPlayerController.this);
                return;
            }
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlayerUICommand)obj);
    }

    private ()
    {
        this$0 = SlidingPlayerController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
