// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations

class this._cls0
    implements b
{

    final PlaylistOperations this$0;

    public void call(Urn urn)
    {
        PlaylistOperations.access$000(PlaylistOperations.this).publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromPlaylistCreated(urn));
    }

    public volatile void call(Object obj)
    {
        call((Urn)obj);
    }

    ()
    {
        this$0 = PlaylistOperations.this;
        super();
    }
}
