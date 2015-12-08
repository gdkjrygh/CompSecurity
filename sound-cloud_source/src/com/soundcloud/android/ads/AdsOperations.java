// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.events.PlayQueueEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueItem;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.utils.LocaleProvider;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import rx.R;
import rx.b;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiInterstitial, AdOverlayProperty, ApiAudioAd, ApiLeaveBehind, 
//            LeaveBehindProperty, AdProperty, ApiAdsForTrack, ApiVideoAd, 
//            AdFunctions

public class AdsOperations
{

    private final ApiClientRx apiClientRx;
    private final rx.b.b cacheAudioAdTrack = new _cls1();
    private final FeatureFlags featureFlags;
    private final PlayQueueManager playQueueManager;
    private final R scheduler;
    private final StoreTracksCommand storeTracksCommand;

    AdsOperations(StoreTracksCommand storetrackscommand, PlayQueueManager playqueuemanager, ApiClientRx apiclientrx, R r, FeatureFlags featureflags)
    {
        storeTracksCommand = storetrackscommand;
        playQueueManager = playqueuemanager;
        apiClientRx = apiclientrx;
        scheduler = r;
        featureFlags = featureflags;
    }

    private void applyInterstitialAd(ApiInterstitial apiinterstitial, int i, Urn urn)
    {
        apiinterstitial = apiinterstitial.toPropertySet().put(AdOverlayProperty.META_AD_DISMISSED, Boolean.valueOf(false)).put(TrackProperty.URN, urn);
        playQueueManager.performPlayQueueUpdateOperations(new com.soundcloud.android.playback.PlayQueueManager.QueueUpdateOperation[] {
            new com.soundcloud.android.playback.PlayQueueManager.SetMetadataOperation(i, apiinterstitial)
        });
    }

    private void insertAudioAdWithLeaveBehind(ApiAudioAd apiaudioad, PropertySet propertyset, int i)
    {
        Urn urn = apiaudioad.getApiTrack().getUrn();
        apiaudioad = apiaudioad.getLeaveBehind().toPropertySet().put(AdOverlayProperty.META_AD_DISMISSED, Boolean.valueOf(false)).put(LeaveBehindProperty.AUDIO_AD_TRACK_URN, urn);
        playQueueManager.performPlayQueueUpdateOperations(new com.soundcloud.android.playback.PlayQueueManager.QueueUpdateOperation[] {
            new com.soundcloud.android.playback.PlayQueueManager.InsertAudioOperation(i, urn, propertyset, false), new com.soundcloud.android.playback.PlayQueueManager.SetMetadataOperation(i + 1, apiaudioad)
        });
    }

    private boolean isAudioAdAtPosition(int i)
    {
        PlayQueueItem playqueueitem = playQueueManager.getPlayQueueItemAtPosition(i);
        return playqueueitem.getMetaData().contains(AdProperty.AD_URN) && ((String)playqueueitem.getMetaData().get(AdProperty.AD_TYPE)).equals("audio_ad");
    }

    private boolean isVideoAdAtPosition(int i)
    {
        return playQueueManager.getPlayQueueItemAtPosition(i).isVideo();
    }

    private rx.b.b logAds(final Urn sourceUrn)
    {
        return new _cls2();
    }

    private rx.b.b logFailedAds(final Urn sourceUrn)
    {
        return new _cls3();
    }

    public b ads(Urn urn)
    {
        com.soundcloud.android.api.ApiRequest.Builder builder = ApiRequest.get(String.format(ApiEndpoints.ADS.path(), new Object[] {
            urn.toEncodedString()
        })).forPrivateApi(1);
        String s = LocaleProvider.getFormattedLocale();
        if (!s.isEmpty())
        {
            builder.addQueryParam(com.soundcloud.android.api.ApiRequest.Param.LOCALE, new Object[] {
                s
            });
        }
        return apiClientRx.mappedResponse(builder.build(), com/soundcloud/android/ads/ApiAdsForTrack).subscribeOn(scheduler).doOnError(logFailedAds(urn)).doOnNext(logAds(urn)).doOnNext(cacheAudioAdTrack);
    }

    public void applyAdToTrack(Urn urn, ApiAdsForTrack apiadsfortrack)
    {
        int i = playQueueManager.getUpcomingPositionForUrn(urn);
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Failed to find the monetizable track");
        if (featureFlags.isEnabled(Flag.VIDEO_ADS) && apiadsfortrack.videoAd().isPresent())
        {
            insertVideoAd(urn, (ApiVideoAd)apiadsfortrack.videoAd().get(), i);
        } else
        {
            if (apiadsfortrack.interstitialAd().isPresent())
            {
                applyInterstitialAd((ApiInterstitial)apiadsfortrack.interstitialAd().get(), i, urn);
                return;
            }
            if (apiadsfortrack.audioAd().isPresent())
            {
                insertAudioAd(urn, (ApiAudioAd)apiadsfortrack.audioAd().get(), i);
                return;
            }
        }
    }

    public void applyInterstitialToTrack(Urn urn, ApiAdsForTrack apiadsfortrack)
    {
        int i = playQueueManager.getUpcomingPositionForUrn(urn);
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Failed to find the monetizable track");
        if (apiadsfortrack.interstitialAd().isPresent())
        {
            applyInterstitialAd((ApiInterstitial)apiadsfortrack.interstitialAd().get(), i, urn);
        }
    }

    public void clearAllAdsFromQueue()
    {
        playQueueManager.removeItemsWithMetaData(AdFunctions.HAS_AD_URN, PlayQueueEvent.fromAudioAdRemoved(playQueueManager.getCollectionUrn()));
    }

    public PropertySet getMonetizableTrackMetaData()
    {
        int i = playQueueManager.getCurrentPosition();
        return playQueueManager.getPlayQueueItemAtPosition(i + 1).getMetaData();
    }

    void insertAudioAd(Urn urn, ApiAudioAd apiaudioad, int i)
    {
        urn = apiaudioad.toPropertySet().put(AdProperty.MONETIZABLE_TRACK_URN, urn);
        if (apiaudioad.hasApiLeaveBehind())
        {
            insertAudioAdWithLeaveBehind(apiaudioad, urn, i);
            return;
        } else
        {
            playQueueManager.performPlayQueueUpdateOperations(new com.soundcloud.android.playback.PlayQueueManager.QueueUpdateOperation[] {
                new com.soundcloud.android.playback.PlayQueueManager.SetMetadataOperation(i, PropertySet.create()), new com.soundcloud.android.playback.PlayQueueManager.InsertAudioOperation(i, apiaudioad.getApiTrack().getUrn(), urn, false)
            });
            return;
        }
    }

    void insertVideoAd(Urn urn, ApiVideoAd apivideoad, int i)
    {
        urn = apivideoad.toPropertySet().put(AdProperty.MONETIZABLE_TRACK_URN, urn);
        playQueueManager.performPlayQueueUpdateOperations(new com.soundcloud.android.playback.PlayQueueManager.QueueUpdateOperation[] {
            new com.soundcloud.android.playback.PlayQueueManager.SetMetadataOperation(i, PropertySet.create()), new com.soundcloud.android.playback.PlayQueueManager.InsertVideoOperation(i, urn)
        });
    }

    public boolean isAdAtPosition(int i)
    {
        return isAudioAdAtPosition(i) || isVideoAdAtPosition(i);
    }

    public boolean isCurrentItemAd()
    {
        return isAdAtPosition(playQueueManager.getCurrentPosition());
    }

    public boolean isCurrentItemAudioAd()
    {
        return !playQueueManager.isQueueEmpty() && isAudioAdAtPosition(playQueueManager.getCurrentPosition());
    }

    public boolean isNextItemAd()
    {
        return isAdAtPosition(playQueueManager.getCurrentPosition() + 1);
    }


    private class _cls1
        implements rx.b.b
    {

        final AdsOperations this$0;

        public void call(ApiAdsForTrack apiadsfortrack)
        {
            apiadsfortrack = apiadsfortrack.audioAd();
            if (apiadsfortrack.isPresent())
            {
                apiadsfortrack = ((ApiAudioAd)apiadsfortrack.get()).getApiTrack();
                storeTracksCommand.toAction().call(Arrays.asList(new ApiTrack[] {
                    apiadsfortrack
                }));
            }
        }

        public volatile void call(Object obj)
        {
            call((ApiAdsForTrack)obj);
        }

        _cls1()
        {
            this$0 = AdsOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final AdsOperations this$0;
        final Urn val$sourceUrn;

        public void call(ApiAdsForTrack apiadsfortrack)
        {
            (new StringBuilder("Retrieved ads for ")).append(sourceUrn.toString()).append(": ").append(apiadsfortrack.contentString());
        }

        public volatile void call(Object obj)
        {
            call((ApiAdsForTrack)obj);
        }

        _cls2()
        {
            this$0 = AdsOperations.this;
            sourceUrn = urn;
            super();
        }
    }


    private class _cls3
        implements rx.b.b
    {

        final AdsOperations this$0;
        final Urn val$sourceUrn;

        public volatile void call(Object obj)
        {
            call((Throwable)obj);
        }

        public void call(Throwable throwable)
        {
            (new StringBuilder("Failed to retrieve ads for ")).append(sourceUrn.toString());
        }

        _cls3()
        {
            this$0 = AdsOperations.this;
            sourceUrn = urn;
            super();
        }
    }

}
