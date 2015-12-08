// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.Command;
import com.soundcloud.android.model.Urn;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostStorage

public class RepostOperations
{

    private final ApiClientRx apiClientRx;
    private final EventBus eventBus;
    private final rx.b.b publishEntityStateChanged = new _cls1();
    private final RepostStorage repostStorage;
    private final R scheduler;

    RepostOperations(RepostStorage repoststorage, ApiClientRx apiclientrx, R r, EventBus eventbus)
    {
        repostStorage = repoststorage;
        apiClientRx = apiclientrx;
        scheduler = r;
        eventBus = eventbus;
    }

    private b addRepostLocally(Urn urn)
    {
        return repostStorage.addRepost().toObservable(urn).subscribeOn(scheduler).map(toRepostProperties(urn, true)).doOnNext(publishEntityStateChanged).doOnError(rollbackRepost(urn, false));
    }

    private ApiEndpoints getRepostEndpoint(Urn urn)
    {
        if (urn.isTrack())
        {
            return ApiEndpoints.MY_TRACK_REPOSTS;
        } else
        {
            return ApiEndpoints.MY_PLAYLIST_REPOSTS;
        }
    }

    private b pushAddRepost(Urn urn)
    {
        urn = ApiRequest.put(getRepostEndpoint(urn).path(new Object[] {
            Long.valueOf(urn.getNumericId())
        })).forPublicApi().build();
        return apiClientRx.response(urn);
    }

    private f pushAddRepostAndRevertWhenFailed()
    {
        return new _cls2();
    }

    private f pushRemoveAndRevertWhenFailed()
    {
        return new _cls3();
    }

    private b pushRemoveRepost(Urn urn)
    {
        urn = ApiRequest.delete(getRepostEndpoint(urn).path(new Object[] {
            Long.valueOf(urn.getNumericId())
        })).forPublicApi().build();
        return apiClientRx.response(urn);
    }

    private b removeRepostLocally(Urn urn)
    {
        return repostStorage.removeRepost().toObservable(urn).subscribeOn(scheduler).map(toRepostProperties(urn, false)).doOnNext(publishEntityStateChanged).doOnError(rollbackRepost(urn, true));
    }

    private rx.b.b rollbackRepost(final Urn soundUrn, final boolean addRepost)
    {
        return new _cls4();
    }

    private f toRepostProperties(final Urn soundUrn, final boolean addRepost)
    {
        return new _cls5();
    }

    public b toggleRepost(Urn urn, boolean flag)
    {
        if (flag)
        {
            return addRepostLocally(urn).flatMap(pushAddRepostAndRevertWhenFailed());
        } else
        {
            return removeRepostLocally(urn).flatMap(pushRemoveAndRevertWhenFailed());
        }
    }







    private class _cls1
        implements rx.b.b
    {

        final RepostOperations this$0;

        public void call(PropertySet propertyset)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromRepost(propertyset));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = RepostOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final RepostOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        public b call(PropertySet propertyset)
        {
            Urn urn = (Urn)propertyset.get(PlayableProperty.URN);
            return pushAddRepost(urn).map(RxUtils.returning(propertyset)).onErrorResumeNext(removeRepostLocally(urn));
        }

        _cls2()
        {
            this$0 = RepostOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final RepostOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        public b call(PropertySet propertyset)
        {
            Urn urn = (Urn)propertyset.get(PlayableProperty.URN);
            return pushRemoveRepost(urn).map(RxUtils.returning(propertyset)).onErrorResumeNext(addRepostLocally(urn));
        }

        _cls3()
        {
            this$0 = RepostOperations.this;
            super();
        }
    }


    private class _cls4
        implements rx.b.b
    {

        final RepostOperations this$0;
        final boolean val$addRepost;
        final Urn val$soundUrn;

        public volatile void call(Object obj)
        {
            call((Throwable)obj);
        }

        public void call(Throwable throwable)
        {
            throwable = PropertySet.from(new PropertyBinding[] {
                PlayableProperty.URN.bind(soundUrn), PlayableProperty.IS_REPOSTED.bind(Boolean.valueOf(addRepost))
            });
            publishEntityStateChanged.call(throwable);
        }

        _cls4()
        {
            this$0 = RepostOperations.this;
            soundUrn = urn;
            addRepost = flag;
            super();
        }
    }


    private class _cls5
        implements f
    {

        final RepostOperations this$0;
        final boolean val$addRepost;
        final Urn val$soundUrn;

        public PropertySet call(Integer integer)
        {
            return PropertySet.from(new PropertyBinding[] {
                PlayableProperty.URN.bind(soundUrn), PlayableProperty.IS_REPOSTED.bind(Boolean.valueOf(addRepost)), PlayableProperty.REPOSTS_COUNT.bind(integer)
            });
        }

        public volatile Object call(Object obj)
        {
            return call((Integer)obj);
        }

        _cls5()
        {
            this$0 = RepostOperations.this;
            soundUrn = urn;
            addRepost = flag;
            super();
        }
    }

}
