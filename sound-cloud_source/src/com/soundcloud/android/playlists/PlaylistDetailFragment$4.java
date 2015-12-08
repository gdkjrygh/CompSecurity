// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment, PlaylistWithTracks

class t> extends DefaultSubscriber
{

    final PlaylistDetailFragment this$0;

    public void onNext(EntityStateChangedEvent entitystatechangedevent)
    {
        if (entitystatechangedevent.getFirstUrn().equals(PlaylistDetailFragment.access$100(PlaylistDetailFragment.this).getUrn()))
        {
            onPlaylistContentChanged();
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((EntityStateChangedEvent)obj);
    }

    ()
    {
        this$0 = PlaylistDetailFragment.this;
        super();
    }
}
