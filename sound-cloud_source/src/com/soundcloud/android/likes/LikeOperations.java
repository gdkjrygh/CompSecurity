// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.likes:
//            UpdateLikeCommand

public class LikeOperations
{

    static final int PAGE_SIZE = 30;
    private final EventBus eventBus;
    private final rx.b.b publishPlayableChanged = new _cls1();
    private final R scheduler;
    private final UpdateLikeCommand storeLikeCommand;
    private final SyncInitiator syncInitiator;

    public LikeOperations(UpdateLikeCommand updatelikecommand, SyncInitiator syncinitiator, EventBus eventbus, R r)
    {
        storeLikeCommand = updatelikecommand;
        eventBus = eventbus;
        scheduler = r;
        syncInitiator = syncinitiator;
    }

    private f toChangeSet(final Urn targetUrn, final boolean addLike)
    {
        return new _cls2();
    }

    public b toggleLike(Urn urn, boolean flag)
    {
        UpdateLikeCommand.UpdateLikeParams updatelikeparams = new UpdateLikeCommand.UpdateLikeParams(urn, flag);
        return storeLikeCommand.toObservable(updatelikeparams).map(toChangeSet(urn, flag)).doOnNext(publishPlayableChanged).doOnCompleted(syncInitiator.requestSystemSyncAction()).subscribeOn(scheduler);
    }


    private class _cls1
        implements rx.b.b
    {

        final LikeOperations this$0;

        public void call(PropertySet propertyset)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromLike(propertyset));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = LikeOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final LikeOperations this$0;
        final boolean val$addLike;
        final Urn val$targetUrn;

        public PropertySet call(Integer integer)
        {
            return PropertySet.from(new PropertyBinding[] {
                PlayableProperty.URN.bind(targetUrn), PlayableProperty.LIKES_COUNT.bind(integer), PlayableProperty.IS_LIKED.bind(Boolean.valueOf(addLike))
            });
        }

        public volatile Object call(Object obj)
        {
            return call((Integer)obj);
        }

        _cls2()
        {
            this$0 = LikeOperations.this;
            targetUrn = urn;
            addLike = flag;
            super();
        }
    }

}
