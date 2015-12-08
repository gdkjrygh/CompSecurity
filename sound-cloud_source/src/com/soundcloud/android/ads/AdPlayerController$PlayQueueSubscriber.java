// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.ads:
//            AdPlayerController

private final class <init> extends DefaultSubscriber
{

    final AdPlayerController this$0;

    public final void onNext(<init> <init>1)
    {
        AdPlayerController.access$600(AdPlayerController.this).publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.expandPlayer());
        AdPlayerController.access$600(AdPlayerController.this).publish(EventQueue.TRACKING, UIEvent.fromPlayerOpen("ad_play"));
        AdPlayerController.access$202(AdPlayerController.this, this._mth0(<init>1));
    }

    public final volatile void onNext(Object obj)
    {
        onNext((onNext)obj);
    }

    private ()
    {
        this$0 = AdPlayerController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
