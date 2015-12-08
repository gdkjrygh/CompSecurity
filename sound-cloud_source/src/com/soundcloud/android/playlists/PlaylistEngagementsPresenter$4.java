// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.analytics.OriginProvider;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsPresenter, PlaylistWithTracks

class this._cls0
    implements a
{

    final PlaylistEngagementsPresenter this$0;

    public void call()
    {
        UIEvent uievent = UIEvent.fromShufflePlaylist(PlaylistEngagementsPresenter.access$300(PlaylistEngagementsPresenter.this).getScreenTag(), PlaylistEngagementsPresenter.access$400(PlaylistEngagementsPresenter.this).getUrn());
        PlaylistEngagementsPresenter.access$500(PlaylistEngagementsPresenter.this).publish(EventQueue.TRACKING, uievent);
    }

    ()
    {
        this$0 = PlaylistEngagementsPresenter.this;
        super();
    }
}
