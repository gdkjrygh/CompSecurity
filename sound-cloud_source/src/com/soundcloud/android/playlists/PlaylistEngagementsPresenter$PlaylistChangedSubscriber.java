// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistEngagementsPresenter, PlaylistWithTracks, PlaylistProperty, PlaylistEngagementsView

private class <init> extends DefaultSubscriber
{

    final PlaylistEngagementsPresenter this$0;

    public void onNext(EntityStateChangedEvent entitystatechangedevent)
    {
        if (PlaylistEngagementsPresenter.access$400(PlaylistEngagementsPresenter.this) != null && PlaylistEngagementsPresenter.access$400(PlaylistEngagementsPresenter.this).getUrn().equals(entitystatechangedevent.getFirstUrn()))
        {
            entitystatechangedevent = entitystatechangedevent.getNextChangeSet();
            PlaylistEngagementsPresenter.access$400(PlaylistEngagementsPresenter.this).update(entitystatechangedevent);
            if (entitystatechangedevent.contains(PlaylistProperty.IS_LIKED))
            {
                PlaylistEngagementsPresenter.access$600(PlaylistEngagementsPresenter.this).updateLikeItem(((Integer)entitystatechangedevent.get(PlayableProperty.LIKES_COUNT)).intValue(), ((Boolean)entitystatechangedevent.get(PlayableProperty.IS_LIKED)).booleanValue());
            }
            if (entitystatechangedevent.contains(PlaylistProperty.IS_REPOSTED))
            {
                PlaylistEngagementsPresenter.access$600(PlaylistEngagementsPresenter.this).showPublicOptions(((Boolean)entitystatechangedevent.get(PlayableProperty.IS_REPOSTED)).booleanValue());
            }
            if (entitystatechangedevent.contains(com.soundcloud.android.offline.r.this._fld0))
            {
                PlaylistEngagementsPresenter.access$700(PlaylistEngagementsPresenter.this);
            }
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((EntityStateChangedEvent)obj);
    }

    private ()
    {
        this$0 = PlaylistEngagementsPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
