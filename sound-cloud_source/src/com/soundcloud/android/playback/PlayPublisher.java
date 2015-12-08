// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiResponse;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.gcm.GcmStorage;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;
import rx.g.m;

public class PlayPublisher
{
    static class Payload
    {

        public final String gatewayId;
        public final String registrationId;
        public final long timestamp;
        public final Urn track;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof Payload))
                {
                    return false;
                }
                obj = (Payload)obj;
                if (!MoreObjects.equal(Long.valueOf(timestamp), Long.valueOf(((Payload) (obj)).timestamp)) || !MoreObjects.equal(registrationId, ((Payload) (obj)).registrationId) || !MoreObjects.equal(track, ((Payload) (obj)).track))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return MoreObjects.hashCode(new Object[] {
                registrationId, Long.valueOf(timestamp), track
            });
        }

        Payload(String s, String s1, long l, Urn urn)
        {
            gatewayId = s;
            registrationId = s1;
            timestamp = l;
            track = urn;
        }
    }

    private static class ResponseLogger extends DefaultSubscriber
    {

        public void onNext(ApiResponse apiresponse)
        {
            (new StringBuilder("Posted play with response code ")).append(apiresponse.getStatusCode());
        }

        public volatile void onNext(Object obj)
        {
            onNext((ApiResponse)obj);
        }

        private ResponseLogger()
        {
        }

        ResponseLogger(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final f IS_PLAYER_PLAYING_EVENT = new _cls1();
    private static final String TAG = "PlayPublisher";
    private final ApiClientRx apiClient;
    private final DateProvider dateProvider;
    private final EventBus eventBus;
    private final GcmStorage gcmStorage;
    private final Resources resources;
    private final R scheduler;
    private f toApiResponse;

    public PlayPublisher(Resources resources1, GcmStorage gcmstorage, CurrentDateProvider currentdateprovider, EventBus eventbus, R r, ApiClientRx apiclientrx)
    {
        toApiResponse = new _cls2();
        resources = resources1;
        gcmStorage = gcmstorage;
        dateProvider = currentdateprovider;
        eventBus = eventbus;
        scheduler = r;
        apiClient = apiclientrx;
    }

    private Payload createPayload(Player.StateTransition statetransition)
    {
        return new Payload(resources.getString(0x7f0702b2), gcmStorage.getToken(), dateProvider.getCurrentTime(), statetransition.getTrackUrn());
    }

    public void subscribe()
    {
        eventBus.queue(EventQueue.PLAYBACK_STATE_CHANGED).filter(IS_PLAYER_PLAYING_EVENT).flatMap(toApiResponse).subscribe(new ResponseLogger(null));
    }





    private class _cls2
        implements f
    {

        final PlayPublisher this$0;

        public volatile Object call(Object obj)
        {
            return call((Player.StateTransition)obj);
        }

        public b call(Player.StateTransition statetransition)
        {
            statetransition = createPayload(statetransition);
            statetransition = ApiRequest.post(ApiEndpoints.PLAY_PUBLISH.path()).forPublicApi().withContent(statetransition).build();
            return apiClient.response(statetransition).subscribeOn(scheduler);
        }

        _cls2()
        {
            this$0 = PlayPublisher.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(Player.StateTransition statetransition)
        {
            return Boolean.valueOf(statetransition.isPlayerPlaying());
        }

        public final volatile Object call(Object obj)
        {
            return call((Player.StateTransition)obj);
        }

        _cls1()
        {
        }
    }

}
