// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.users.UserAssociationStorage;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.a;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.associations:
//            UpdateFollowingCommand

public class NextFollowingOperations
{

    private static final f IS_FOLLOWING_EVENT = new _cls4();
    private static final f IS_UNFOLLOW_EVENT = new _cls5();
    private final EventBus eventBus;
    private final f loadFollowedUser = new _cls2();
    private final rx.b.b publishFollowingChanged = new _cls1();
    private final R scheduler;
    private final UpdateFollowingCommand storeFollowingCommand;
    private final a syncFollowings = new _cls3();
    private final SyncInitiator syncInitiator;
    private final UserAssociationStorage userAssociationStorage;

    public NextFollowingOperations(SyncInitiator syncinitiator, EventBus eventbus, UpdateFollowingCommand updatefollowingcommand, R r, UserAssociationStorage userassociationstorage)
    {
        syncInitiator = syncinitiator;
        eventBus = eventbus;
        storeFollowingCommand = updatefollowingcommand;
        scheduler = r;
        userAssociationStorage = userassociationstorage;
    }

    private f toChangeSet(final Urn targetUrn, final boolean following)
    {
        return new _cls6();
    }

    public b onUserFollowed()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(IS_FOLLOWING_EVENT).map(EntityStateChangedEvent.TO_URN).flatMap(loadFollowedUser);
    }

    public b onUserUnfollowed()
    {
        return eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(IS_UNFOLLOW_EVENT).map(EntityStateChangedEvent.TO_URN);
    }

    public b toggleFollowing(Urn urn, boolean flag)
    {
        UpdateFollowingCommand.UpdateFollowingParams updatefollowingparams = new UpdateFollowingCommand.UpdateFollowingParams(urn, flag);
        return storeFollowingCommand.toObservable(updatefollowingparams).map(toChangeSet(urn, flag)).doOnNext(publishFollowingChanged).doOnCompleted(syncFollowings).subscribeOn(scheduler);
    }





    private class _cls1
        implements rx.b.b
    {

        final NextFollowingOperations this$0;

        public void call(PropertySet propertyset)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromFollowing(propertyset));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = NextFollowingOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final NextFollowingOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Urn)obj);
        }

        public b call(Urn urn)
        {
            return userAssociationStorage.loadFollowing(urn);
        }

        _cls2()
        {
            this$0 = NextFollowingOperations.this;
            super();
        }
    }


    private class _cls3
        implements a
    {

        final NextFollowingOperations this$0;

        public void call()
        {
            syncInitiator.pushFollowingsToApi();
        }

        _cls3()
        {
            this$0 = NextFollowingOperations.this;
            super();
        }
    }


    private class _cls6
        implements f
    {

        final NextFollowingOperations this$0;
        final boolean val$following;
        final Urn val$targetUrn;

        public PropertySet call(Integer integer)
        {
            return PropertySet.from(new PropertyBinding[] {
                UserProperty.URN.bind(targetUrn), UserProperty.FOLLOWERS_COUNT.bind(integer), UserProperty.IS_FOLLOWED_BY_ME.bind(Boolean.valueOf(following))
            });
        }

        public volatile Object call(Object obj)
        {
            return call((Integer)obj);
        }

        _cls6()
        {
            this$0 = NextFollowingOperations.this;
            targetUrn = urn;
            following = flag;
            super();
        }
    }


    private class _cls4
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.getKind() == 7 && entitystatechangedevent.isSingularChange() && ((Boolean)entitystatechangedevent.getNextChangeSet().getOrElse(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(false))).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls4()
        {
        }
    }


    private class _cls5
        implements f
    {

        public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            boolean flag;
            if (entitystatechangedevent.getKind() == 7 && entitystatechangedevent.isSingularChange() && !((Boolean)entitystatechangedevent.getNextChangeSet().getOrElse(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(true))).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls5()
        {
        }
    }

}
