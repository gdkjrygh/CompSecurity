// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackRepository

class this._cls0
    implements b
{

    final TrackRepository this$0;

    public void call(PropertySet propertyset)
    {
        TrackRepository.access$000(TrackRepository.this).publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromSync(propertyset));
    }

    public volatile void call(Object obj)
    {
        call((PropertySet)obj);
    }

    Event()
    {
        this$0 = TrackRepository.this;
        super();
    }
}
