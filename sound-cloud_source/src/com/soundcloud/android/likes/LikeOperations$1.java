// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.likes:
//            LikeOperations

class this._cls0
    implements b
{

    final LikeOperations this$0;

    public void call(PropertySet propertyset)
    {
        LikeOperations.access$000(LikeOperations.this).publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromLike(propertyset));
    }

    public volatile void call(Object obj)
    {
        call((PropertySet)obj);
    }

    edEvent()
    {
        this$0 = LikeOperations.this;
        super();
    }
}
