// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngineException;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdBreakAsWatched;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.timeline.TimelineOperation;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdBreakPolicy;
import com.adobe.mediacore.timeline.advertising.AdBreakRemoval;
import com.adobe.mediacore.timeline.advertising.AdPolicy;
import com.adobe.mediacore.timeline.advertising.AdPolicyInfo;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import com.adobe.mediacore.timeline.advertising.AdPolicySelector;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimeline, VideoEngineAdapter, TimelineOperationQueue, MediaPlayerItem, 
//            VideoEngineDispatcher, MediaResource, SeekEvent, AdBreakPlacementCompletedListener, 
//            AdBreakPlacementFailedListener

public final class AdPolicyProxy
{

    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/AdPolicyProxy.getSimpleName()).toString();
    private AdPolicySelector _adPolicySelector;
    private long _cachedSeekPosition;
    private VideoEngineTimeline.TimeMapping _desiredSeekPosition;
    private AdBreakPlacement _firstPendingAdBreakPlacement;
    private final Logger _logger;
    private MediaPlayerItem _mediaPlayerItem;
    private HashMap _oldAdBreakPlacements;
    private final AdBreakPlacementCompletedListener _onAdBreakPlacementCompletedListener = new AdBreakPlacementCompletedListener() {

        final AdPolicyProxy this$0;

        public void onCompleted(AdBreakPlacement adbreakplacement, AdBreakPlacement adbreakplacement1)
        {
label0:
            {
                _logger.i((new StringBuilder()).append(AdPolicyProxy.LOG_TAG).append("#AdPolicyProxy::AdBreakPlacementCompletedListener").toString(), "Ad break placement completed");
                if (adbreakplacement != null && _toPlaceAdBreakPlacements != null && _toPlaceAdBreakPlacements.contains(adbreakplacement))
                {
                    if (adbreakplacement1 != null)
                    {
                        adbreakplacement1.getAdBreak().setRestoreId(adbreakplacement.getAdBreak().getRestoreId());
                    }
                    _toPlaceAdBreakPlacements.remove(adbreakplacement);
                    if (!listIsEmpty(_toPlaceAdBreakPlacements).booleanValue())
                    {
                        break label0;
                    }
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(SeekEvent.createSeekAdjustCompleted(_cachedSeekPosition));
                    }
                    removeAdBreakPlacementListeners();
                }
                return;
            }
            _logger.i((new StringBuilder()).append(AdPolicyProxy.LOG_TAG).append("AdPolicyProxy::onAdBreakComplete").toString(), "Place next Ad Break Placement that's skipped");
            adbreakplacement = (AdBreakPlacement)_toPlaceAdBreakPlacements.get(0);
            _timelineOperationQueue.addToQueue(adbreakplacement);
        }

            
            {
                this$0 = AdPolicyProxy.this;
                super();
            }
    };
    private final AdBreakPlacementFailedListener _onAdBreakPlacementFailedListener = new AdBreakPlacementFailedListener() {

        final AdPolicyProxy this$0;

        public void onFailed(AdBreakPlacement adbreakplacement)
        {
label0:
            {
                _logger.e((new StringBuilder()).append(AdPolicyProxy.LOG_TAG).append("#AdPolicyProxy::AdBreakPlacementFailedListener").toString(), "Ad break placement failed");
                if (adbreakplacement != null && _toPlaceAdBreakPlacements != null && _toPlaceAdBreakPlacements.contains(adbreakplacement))
                {
                    _toPlaceAdBreakPlacements.remove(adbreakplacement);
                    if (!listIsEmpty(_toPlaceAdBreakPlacements).booleanValue())
                    {
                        break label0;
                    }
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(SeekEvent.createSeekAdjustCompleted(adbreakplacement.getTime()));
                    }
                    removeAdBreakPlacementListeners();
                }
                return;
            }
            adbreakplacement = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = AdPolicyProxy.this;
                super();
            }
    };
    private List _pendingAdBreakPlacements;
    private AdPolicyMode _seekOrTrickPlay;
    private TimelineOperationQueue _timelineOperationQueue;
    private List _toPlaceAdBreakPlacements;
    private VideoEngineAdapter _videoEngineAdapter;
    private VideoEngineDispatcher _videoEngineDispatcher;
    private VideoEngineTimeline _videoEngineTimeline;

    public AdPolicyProxy(VideoEngineAdapter videoengineadapter, VideoEngineDispatcher videoenginedispatcher, VideoEngineTimeline videoenginetimeline, TimelineOperationQueue timelineoperationqueue, MediaPlayerItem mediaplayeritem, AdPolicySelector adpolicyselector)
    {
        _logger = Log.getLogger(LOG_TAG);
        _videoEngineAdapter = videoengineadapter;
        _videoEngineDispatcher = videoenginedispatcher;
        _videoEngineTimeline = videoenginetimeline;
        _timelineOperationQueue = timelineoperationqueue;
        _mediaPlayerItem = mediaplayeritem;
        _adPolicySelector = adpolicyselector;
    }

    private Ad getAd(AdBreakPlacement adbreakplacement)
    {
        if (adbreakplacement != null && adbreakplacement.getAdBreak() != null && adbreakplacement.getAdBreak().adsIterator() != null && adbreakplacement.getAdBreak().adsIterator().hasNext())
        {
            return (Ad)adbreakplacement.getAdBreak().adsIterator().next();
        } else
        {
            return null;
        }
    }

    private List getPendingAdBreakPlacements(VideoEngineTimeline.TimeMapping timemapping, long l)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = _videoEngineTimeline.getAdBreakPlacements().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AdBreakPlacement adbreakplacement = (AdBreakPlacement)iterator.next();
            if (adbreakplacement != null)
            {
                long l1 = adbreakplacement.getTime();
                long l2 = adbreakplacement.getDuration() + l1;
                if (timemapping.getTime() > l)
                {
                    if (l1 >= l && l2 <= timemapping.getTime())
                    {
                        arraylist.add(adbreakplacement);
                    }
                } else
                if (l1 >= timemapping.getTime() && l2 < l)
                {
                    arraylist.add(adbreakplacement);
                }
            }
        } while (true);
        if (!listIsEmpty(arraylist).booleanValue())
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::getPendingAdBreakPlacements").toString(), (new StringBuilder()).append("Found ").append(arraylist.size()).append(" skipped over ad breaks").toString());
            return arraylist;
        } else
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::getPendingAdBreakPlacements").toString(), "Found 0 skipped over ad breaks");
            return null;
        }
    }

    private AdBreakPlacement getSeekIntoAdBreakPlacement(VideoEngineTimeline.TimeMapping timemapping)
    {
label0:
        {
            Object obj = _videoEngineTimeline.getAdBreakPlacements();
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            AdBreakPlacement adbreakplacement;
            long l;
            long l1;
            do
            {
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    adbreakplacement = (AdBreakPlacement)((Iterator) (obj)).next();
                } while (adbreakplacement == null);
                l = adbreakplacement.getTime();
                l1 = adbreakplacement.getDuration();
            } while (l > timemapping.getTime() || l1 + l <= timemapping.getTime());
            return adbreakplacement;
        }
        return null;
    }

    private Boolean isCustomAdMarkerAdBreakPlacement(AdBreakPlacement adbreakplacement)
    {
        if (adbreakplacement != null)
        {
            adbreakplacement = getAd(adbreakplacement);
            if (adbreakplacement != null && adbreakplacement.isCustomAdMarker())
            {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    private Boolean listIsEmpty(List list)
    {
        if (list == null)
        {
            return Boolean.valueOf(true);
        }
        if (list != null && list.isEmpty())
        {
            return Boolean.valueOf(true);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private long modifyAdBreakPlacements(List list, VideoEngineTimeline.TimeMapping timemapping, boolean flag)
    {
        if (_toPlaceAdBreakPlacements != null)
        {
            _toPlaceAdBreakPlacements = null;
        }
        _oldAdBreakPlacements = new HashMap();
        long l = 0L;
        long l2 = timemapping.getTime();
        long l3 = _videoEngineAdapter.convertToLocalTime(l2);
        long l1 = l;
        if (list != null)
        {
            timemapping = null;
            Iterator iterator = list.iterator();
            Object obj = null;
            list = timemapping;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AdBreakPlacement adbreakplacement = (AdBreakPlacement)iterator.next();
                timemapping = getAdBreakPolicyFor(adbreakplacement.getAdBreak());
                if (timemapping != AdBreakPolicy.SKIP)
                {
                    if (timemapping == AdBreakPolicy.REMOVE)
                    {
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::modifyAdBreakPlacements").toString(), "Removing the Ad break due to REMOVE policy");
                        timemapping = new AdBreakRemoval(adbreakplacement);
                        _timelineOperationQueue.addToQueue(timemapping);
                        l += adbreakplacement.getDuration();
                    } else
                    {
                        l1 = adbreakplacement.getDuration();
                        timemapping = ((VideoEngineTimeline.TimeMapping) (obj));
                        if (obj == null)
                        {
                            timemapping = new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.MID_ROLL, l3, 0L);
                        }
                        if (adbreakplacement.getAdBreak().size() > 0L)
                        {
                            obj = Integer.toString(adbreakplacement.getAdBreak().getFirstAd().getId());
                            adbreakplacement.getAdBreak().setRestoreId(((String) (obj)));
                            PlacementInformation placementinformation = adbreakplacement.getPlacement();
                            if (placementinformation != null && _videoEngineAdapter != null)
                            {
                                placementinformation = new PlacementInformation(placementinformation.getType(), _videoEngineAdapter.convertToLocalTime(placementinformation.getTime()), placementinformation.getDuration());
                                _oldAdBreakPlacements.put(obj, new AdBreakPlacement(adbreakplacement.getAdBreak(), placementinformation));
                            }
                        }
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::modifyAdBreakPlacements").toString(), "Adding ad break removal operation to queue");
                        obj = new AdBreakRemoval(adbreakplacement);
                        if (list == null)
                        {
                            list = new ArrayList();
                        }
                        _timelineOperationQueue.addToQueue(((TimelineOperation) (obj)));
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::modifyAdBreakPlacements").toString(), "Adding ad break placement operation to queue");
                        obj = new AdBreakPlacement(adbreakplacement.getAdBreak(), timemapping);
                        if (_toPlaceAdBreakPlacements == null)
                        {
                            _toPlaceAdBreakPlacements = new ArrayList();
                        }
                        _toPlaceAdBreakPlacements.add(obj);
                        if (_firstPendingAdBreakPlacement == null)
                        {
                            _firstPendingAdBreakPlacement = ((AdBreakPlacement) (obj));
                        }
                        l += l1;
                        obj = timemapping;
                    }
                }
            } while (true);
            l1 = l;
            if (!listIsEmpty(_toPlaceAdBreakPlacements).booleanValue())
            {
                _timelineOperationQueue.addToQueue((TimelineOperation)_toPlaceAdBreakPlacements.get(0));
                l1 = l;
            }
        }
        if (!flag && _mediaPlayerItem != null && !_mediaPlayerItem.isLive())
        {
            return l2 - l1;
        } else
        {
            return l2;
        }
    }

    private final void removeAdBreakPlacementListeners()
    {
        if (_videoEngineDispatcher != null)
        {
            if (_onAdBreakPlacementCompletedListener != null)
            {
                _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_COMPLETED, _onAdBreakPlacementCompletedListener);
            }
            if (_onAdBreakPlacementFailedListener != null)
            {
                _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_FAILED, _onAdBreakPlacementFailedListener);
            }
        }
    }

    private List selectAdBreaksToPlayForSeek(List list, long l, long l1)
    {
        Object obj = null;
        List list1 = obj;
        if (!listIsEmpty(list).booleanValue())
        {
            list = new AdPolicyInfo(list, null, l, l1, 1.0F, _seekOrTrickPlay);
            list1 = obj;
            if (_adPolicySelector != null)
            {
                list1 = _adPolicySelector.selectAdBreaksToPlay(list);
            }
        }
        return list1;
    }

    private Boolean shouldPlayUpcomingAdBreak(AdBreakPlacement adbreakplacement)
    {
        boolean flag = false;
        List list = createAdBreakPlacementList(adbreakplacement);
        if (adbreakplacement.getAdBreak() != null && adbreakplacement.getPlacement() != null)
        {
            adbreakplacement = new AdPolicyInfo(list, null, _videoEngineAdapter.getCurrentTime(), _desiredSeekPosition.getTime(), 1.0F, _seekOrTrickPlay);
            adbreakplacement = _adPolicySelector.selectPolicyForAdBreak(adbreakplacement);
            if (adbreakplacement == AdBreakPolicy.PLAY || adbreakplacement == AdBreakPolicy.REMOVE_AFTER_PLAY)
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }

    private long startTimeForSeekIntoAd(AdBreakPlacement adbreakplacement, long l, VideoEngineTimeline.TimeMapping timemapping)
    {
        Object obj;
        long l1;
        long l2;
        obj = adbreakplacement.getAdBreak().adsIterator();
        l1 = adbreakplacement.getTime();
        l2 = 0L;
_L14:
        long l3 = l1;
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Ad ad = (Ad)((Iterator) (obj)).next();
        if (!TimeRange.createRange(l1 + l2, ad.getDuration()).contains(timemapping.getTime())) goto _L4; else goto _L3
_L3:
        obj = new AdPolicyInfo(createAdBreakPlacementList(adbreakplacement), ad, l, _desiredSeekPosition.getTime(), 1.0F, _seekOrTrickPlay);
        l3 = l1;
        if (_adPolicySelector == null) goto _L2; else goto _L5
_L5:
        obj = _adPolicySelector.selectPolicyForSeekIntoAd(((AdPolicyInfo) (obj)));
        static class _cls3
        {

            static final int $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[];

            static 
            {
                $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy = new int[AdPolicy.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.PLAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.PLAY_FROM_AD_BEGIN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.SKIP_AD_BREAK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.SKIP_TO_NEXT_AD_IN_BREAK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdPolicy[AdPolicy.PLAY_FROM_AD_BREAK_BEGIN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.adobe.mediacore.timeline.advertising.AdPolicy[((AdPolicy) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 164
    //                   1 173
    //                   2 182
    //                   3 191
    //                   4 204
    //                   5 219;
           goto _L6 _L7 _L8 _L9 _L10 _L11
_L6:
        l = l1;
_L12:
        l3 = l;
_L2:
        return l3;
_L7:
        l = timemapping.getTime();
        continue; /* Loop/switch isn't completed */
_L8:
        l = l1 + l2;
        continue; /* Loop/switch isn't completed */
_L9:
        l = adbreakplacement.getTime() + adbreakplacement.getDuration();
        continue; /* Loop/switch isn't completed */
_L10:
        l = ad.getDuration() + l2 + l1;
        continue; /* Loop/switch isn't completed */
_L11:
        l = l1;
        if (true) goto _L12; else goto _L4
_L4:
        l2 = ad.getDuration() + l2;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public AdBreakPlacement createAdBreakPlacement(AdBreak adbreak, PlacementInformation placementinformation)
    {
        Object obj = null;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::createAdBreakPlacement").toString(), (new StringBuilder()).append("AdBreak: ").append(adbreak.getFirstAd().getId()).toString());
        AdBreakPlacement adbreakplacement = obj;
        if (adbreak != null)
        {
            if (placementinformation != null)
            {
                adbreakplacement = new AdBreakPlacement(adbreak, placementinformation);
            } else
            {
                placementinformation = _videoEngineTimeline.getPlacementFor(adbreak);
                adbreakplacement = obj;
                if (placementinformation != null)
                {
                    return new AdBreakPlacement(adbreak, placementinformation);
                }
            }
        }
        return adbreakplacement;
    }

    public List createAdBreakPlacementList(AdBreakPlacement adbreakplacement)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::createAdBreakPlacementList").toString(), (new StringBuilder()).append("AdBreakPlacement: ").append(adbreakplacement).toString());
        if (adbreakplacement != null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(adbreakplacement);
            return arraylist;
        } else
        {
            return null;
        }
    }

    public AdBreakPolicy getAdBreakPolicyFor(AdBreak adbreak)
    {
        Object obj2 = null;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::getgetAdBreakPolicyFor").toString(), "Selecting the policy for upcoming Ad Break");
        Object obj = obj2;
        if (adbreak != null)
        {
            Object obj1;
            if (adbreak.getRestoreId() != null)
            {
                obj = (AdBreakPlacement)_oldAdBreakPlacements.get(adbreak.getRestoreId());
            } else
            {
                obj = null;
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = createAdBreakPlacement(adbreak, null);
            }
            adbreak = createAdBreakPlacementList(((AdBreakPlacement) (obj1)));
            obj = obj2;
            if (obj1 != null)
            {
                obj = obj2;
                if (((AdBreakPlacement) (obj1)).getAdBreak() != null)
                {
                    obj = obj2;
                    if (((AdBreakPlacement) (obj1)).getPlacement() != null)
                    {
                        obj = obj2;
                        if (_adPolicySelector != null)
                        {
                            obj = obj2;
                            if (_videoEngineAdapter != null)
                            {
                                _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::getgetAdBreakPolicyFor").toString(), "Get AdBreakPolicy.");
                                adbreak = new AdPolicyInfo(adbreak, null, _videoEngineAdapter.getCurrentTime(), 0L, 1.0F, AdPolicyMode.PLAY);
                                obj = _adPolicySelector.selectPolicyForAdBreak(adbreak);
                            }
                        }
                    }
                }
            }
        }
        return ((AdBreakPolicy) (obj));
    }

    public void placeTimelineLineOperation(TimelineOperation timelineoperation)
    {
        if (timelineoperation != null)
        {
            _timelineOperationQueue.addToQueue(timelineoperation);
        }
    }

    public void registerSeekOrTrickPlayToTime(VideoEngineTimeline.TimeMapping timemapping, long l, AdPolicyMode adpolicymode)
    {
        _seekOrTrickPlay = adpolicymode;
        _desiredSeekPosition = timemapping;
        _pendingAdBreakPlacements = new ArrayList();
        long l1 = timemapping.getTime();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::registerSeekOrTrickPlayToTime").toString(), (new StringBuilder()).append("begin=").append(l).append(" end=").append(timemapping.getTime()).toString());
        Object obj;
        Timeline timeline;
        boolean flag;
        if (timemapping.getTime() < l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adpolicymode = getSeekIntoAdBreakPlacement(timemapping);
        obj = getPendingAdBreakPlacements(_desiredSeekPosition, l);
        timemapping = adpolicymode;
        if (!isCustomAdMarkerAdBreakPlacement(adpolicymode).booleanValue()) goto _L2; else goto _L1
_L1:
        timemapping = getAd(adpolicymode);
        timeline = _videoEngineAdapter.getRawTimeline();
        if (timeline == null) goto _L4; else goto _L3
_L3:
        if (!timemapping.getPrimaryAsset().getMediaResource().getMetadata().getValue(DefaultMetadataKeys.METADATA_KEY_ADJUST_SEEK_ENABLED.getValue()).equals("true")) goto _L4; else goto _L5
_L5:
        VideoEngineTimeline.TimeMapping.create(timeline.firstPeriodIndex, adpolicymode.getTime());
        timemapping = adpolicymode;
_L2:
        if (obj != null)
        {
            adpolicymode = ((List) (obj)).iterator();
            do
            {
                if (!adpolicymode.hasNext())
                {
                    break;
                }
                obj = (AdBreakPlacement)adpolicymode.next();
                if (((AdBreakPlacement) (obj)).getAdBreak().size() > 0L && !isCustomAdMarkerAdBreakPlacement(((AdBreakPlacement) (obj))).booleanValue())
                {
                    _pendingAdBreakPlacements.add(obj);
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L4:
        timemapping = null;
        continue; /* Loop/switch isn't completed */
        timemapping;
        timemapping = adpolicymode;
        if (true) goto _L2; else goto _L6
_L6:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::registerSeekOrTrickPlayToTime").toString(), (new StringBuilder()).append("Pending ad breaks after cleanup: ").append(_pendingAdBreakPlacements.size()).toString());
        if (timemapping == null || _pendingAdBreakPlacements.size() != 0) goto _L8; else goto _L7
_L7:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::registerSeekOrTrickPlayToTime").toString(), "Seek into ad break without other ad breaks skipped over");
        if (shouldPlayUpcomingAdBreak(timemapping).booleanValue())
        {
            l = startTimeForSeekIntoAd(timemapping, l, _desiredSeekPosition);
        } else
        {
            l = timemapping.getDuration() + l1;
        }
        _cachedSeekPosition = l;
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(SeekEvent.createSeekAdjustCompleted(_cachedSeekPosition));
        }
_L10:
        return;
_L8:
        if (timemapping != null && !listIsEmpty(_pendingAdBreakPlacements).booleanValue())
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::registerSeekOrTrickPlayToTime").toString(), "Seek into ad break with other ad breaks skipped over");
            if (_desiredSeekPosition.getTime() > l)
            {
                _pendingAdBreakPlacements.add(timemapping);
            } else
            {
                l1 = timemapping.getTime() + timemapping.getDuration();
            }
            _desiredSeekPosition = VideoEngineTimeline.TimeMapping.create(_desiredSeekPosition.getPeriod(), timemapping.getTime() + timemapping.getDuration());
        }
        _pendingAdBreakPlacements = selectAdBreaksToPlayForSeek(_pendingAdBreakPlacements, l, _desiredSeekPosition.getTime());
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#AdPolicyProxy::registerSeekOrTrickPlayToTime").toString(), (new StringBuilder()).append("Seek into content currentTime=").append(l).append(", desiredPosition").append(_desiredSeekPosition.toString()).append(", selectAdBreaksToPlayForSeek empty: ").append(listIsEmpty(_pendingAdBreakPlacements)).toString());
        if (listIsEmpty(_pendingAdBreakPlacements).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        if (_oldAdBreakPlacements != null)
        {
            _oldAdBreakPlacements.clear();
        }
        if (_onAdBreakPlacementCompletedListener != null)
        {
            _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_COMPLETED, _onAdBreakPlacementCompletedListener);
        }
        if (_onAdBreakPlacementFailedListener != null)
        {
            _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ADBREAK_PLACEMENT_FAILED, _onAdBreakPlacementFailedListener);
        }
        _cachedSeekPosition = modifyAdBreakPlacements(_pendingAdBreakPlacements, _desiredSeekPosition, flag);
        if (timemapping != null && flag)
        {
            _cachedSeekPosition = _cachedSeekPosition + 1L;
        }
        if (_oldAdBreakPlacements == null || _oldAdBreakPlacements.isEmpty())
        {
            _videoEngineDispatcher.dispatch(SeekEvent.createSeekAdjustCompleted(_cachedSeekPosition));
            return;
        }
        if (true) goto _L10; else goto _L9
_L9:
        _cachedSeekPosition = l1;
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(SeekEvent.createSeekAdjustCompleted(_cachedSeekPosition));
            return;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void removeOldAdBreakPlacementForAdBreak(AdBreak adbreak)
    {
        if (adbreak != null && _oldAdBreakPlacements != null)
        {
            _oldAdBreakPlacements.remove(adbreak.getRestoreId());
        }
    }

    public void restoreAdBreak(AdBreak adbreak)
    {
        AdBreakPlacement adbreakplacement = (AdBreakPlacement)_oldAdBreakPlacements.get(adbreak.getRestoreId());
        if (adbreakplacement != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("AdPolicyProxy::restoreAdBreakPlacement").toString(), "Restore ad break");
            _oldAdBreakPlacements.remove(adbreak.getRestoreId());
            adbreakplacement.getAdBreak().setRestoreId(null);
            _timelineOperationQueue.addToQueue(adbreakplacement);
        }
    }

    public void seekThroughAdBreak(AdBreak adbreak)
    {
        try
        {
            adbreak = VideoEngineTimeline.TimeMapping.create(-1, adbreak.getTime() + adbreak.getDuration());
            _videoEngineAdapter.seek(adbreak);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdBreak adbreak)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#seekThroughAdBreak").toString(), "Exception raised while trying to seek through AdBreak ", adbreak);
        }
    }

    public void setAdBreakAsWatched(AdBreak adbreak, AdBreakAsWatched adbreakaswatched)
    {
        AdBreakAsWatched adbreakaswatched1 = AdBreakAsWatched.AD_BREAK_AS_WATCHED_ON_BEGIN;
        Object obj = adbreakaswatched1;
        if (_adPolicySelector != null)
        {
            List list = createAdBreakPlacementList(createAdBreakPlacement(adbreak, null));
            obj = adbreakaswatched1;
            if (_videoEngineAdapter != null)
            {
                obj = new AdPolicyInfo(list, null, _videoEngineAdapter.getCurrentTime(), 0L, 1.0F, AdPolicyMode.PLAY);
                obj = _adPolicySelector.selectWatchedPolicyForAdBreak(((AdPolicyInfo) (obj)));
            }
        }
        if (((AdBreakAsWatched) (obj)).getValue().equalsIgnoreCase(adbreakaswatched.getValue()) && !adbreak.isWatched().booleanValue())
        {
            adbreak.setIsWatched(Boolean.valueOf(true));
        }
    }









/*
    static long access$522(AdPolicyProxy adpolicyproxy, long l)
    {
        l = adpolicyproxy._cachedSeekPosition - l;
        adpolicyproxy._cachedSeekPosition = l;
        return l;
    }

*/


}
