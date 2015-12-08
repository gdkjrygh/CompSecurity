// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.PropertySetFunctions;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController

private final class <init> extends DefaultSubscriber
{

    final PlayerWidgetController this$0;

    public final void onNext(EntityStateChangedEvent entitystatechangedevent)
    {
        if (!PlayerWidgetController.access$500(PlayerWidgetController.this).isQueueEmpty() && PlayerWidgetController.access$500(PlayerWidgetController.this).isCurrentTrack(entitystatechangedevent.getFirstUrn()))
        {
            PlayerWidgetController.access$600(PlayerWidgetController.this, PropertySetFunctions.mergeWith(entitystatechangedevent.getNextChangeSet()));
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((EntityStateChangedEvent)obj);
    }

    private ()
    {
        this$0 = PlayerWidgetController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
