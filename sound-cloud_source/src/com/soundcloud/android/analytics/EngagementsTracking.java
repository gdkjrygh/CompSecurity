// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.users.UserRepository;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.analytics:
//            PromotedSourceInfo

public class EngagementsTracking
{

    private final EventBus eventBus;
    private final TrackRepository trackRepository;
    private final UserRepository userRepository;

    public EngagementsTracking(EventBus eventbus, TrackRepository trackrepository, UserRepository userrepository)
    {
        eventBus = eventbus;
        trackRepository = trackrepository;
        userRepository = userrepository;
    }

    private f followEventFromUser(final boolean isFollow)
    {
        return new _cls2();
    }

    private f likeEventFromTrack(final Urn trackUrn, final boolean addLike, final String invokerScreen, final String contextScreen, final String pageName, final Urn pageUrn, final PromotedSourceInfo promotedSourceInfo)
    {
        return new _cls1();
    }

    public void followUserUrn(Urn urn, boolean flag)
    {
        userRepository.userInfo(urn).map(followEventFromUser(flag)).subscribe(eventBus.queue(EventQueue.TRACKING));
    }

    public void likeTrackUrn(Urn urn, boolean flag, String s, String s1, String s2, Urn urn1, PromotedSourceInfo promotedsourceinfo)
    {
        trackRepository.track(urn).map(likeEventFromTrack(urn, flag, s, s1, s2, urn1, promotedsourceinfo)).subscribe(eventBus.queue(EventQueue.TRACKING));
    }

    private class _cls2
        implements f
    {

        final EngagementsTracking this$0;
        final boolean val$isFollow;

        public UIEvent call(PropertySet propertyset)
        {
            return UIEvent.fromToggleFollow(isFollow, EntityMetadata.fromUser(propertyset));
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls2()
        {
            this$0 = EngagementsTracking.this;
            isFollow = flag;
            super();
        }
    }


    private class _cls1
        implements f
    {

        final EngagementsTracking this$0;
        final boolean val$addLike;
        final String val$contextScreen;
        final String val$invokerScreen;
        final String val$pageName;
        final Urn val$pageUrn;
        final PromotedSourceInfo val$promotedSourceInfo;
        final Urn val$trackUrn;

        public UIEvent call(PropertySet propertyset)
        {
            return UIEvent.fromToggleLike(addLike, invokerScreen, contextScreen, pageName, trackUrn, pageUrn, promotedSourceInfo, EntityMetadata.from(propertyset));
        }

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = EngagementsTracking.this;
            addLike = flag;
            invokerScreen = s;
            contextScreen = s1;
            pageName = s2;
            trackUrn = urn;
            pageUrn = urn1;
            promotedSourceInfo = promotedsourceinfo;
            super();
        }
    }

}
