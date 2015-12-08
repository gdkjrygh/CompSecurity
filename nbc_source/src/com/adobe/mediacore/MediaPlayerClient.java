// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.TimelineOperation;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.adobe.mediacore.timeline.advertising.AdPolicySelector;
import com.adobe.mediacore.timeline.advertising.AdProvider;
import com.adobe.mediacore.timeline.advertising.ContentResolver;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineAdapter, VideoEngineTimeline, TimelineOperationQueue, VideoEngineDispatcher, 
//            MediaPlayerEvent, VideoEngineTimelineProxy, MediaPlayerItem, MediaResource, 
//            MediaPlayerNotification, OperationFailedEvent, AdvertisingFactory, DefaultAdPolicySelector, 
//            AdPolicyProxy, TimelineMonitor, AdClientFactory, PlacementOpportunityDetector, 
//            OpportunityHandledListener

class MediaPlayerClient
{
    private class AdProviderListener
        implements com.adobe.mediacore.timeline.advertising.AdProvider.OnCompleteListener
    {

        final MediaPlayerClient this$0;

        public void onComplete(AdProvider adprovider, List list)
        {
            unregisterPlacement();
            if (list.size() <= 0) goto _L2; else goto _L1
_L1:
            TimelineOperation timelineoperation;
            for (adprovider = list.iterator(); adprovider.hasNext(); _videoEngineTimelineProxy.addHoldReference(timelineoperation.getPlacement().getTime()))
            {
                timelineoperation = (TimelineOperation)adprovider.next();
                _logger.i((new StringBuilder()).append(MediaPlayerClient.LOG_TAG).append("#ContentResolver.OnCompleteListener::onComplete").toString(), (new StringBuilder()).append("Adding reference for timelineOperation for HOLD at ").append(timelineoperation.getPlacement().getTime()).toString());
            }

            _timelineOperationQueue.addAllToQueue(list);
_L4:
            if (_processingPlacementOpportunity != null)
            {
                long l = _processingPlacementOpportunity.getPlacementInformation().getTime();
                _logger.i((new StringBuilder()).append(MediaPlayerClient.LOG_TAG).append("#ContentResolver.OnCompleteListener::onComplete").toString(), (new StringBuilder()).append("Release reference for timelineOperation for HOLD at ").append(l).toString());
                _videoEngineTimelineProxy.releaseHoldReference(l);
            }
            _processingPlacementOpportunity = null;
            processQueuedOpportunities();
            return;
_L2:
            if (doneInitialResolving())
            {
                notifyAdResolvingCompletion();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void onError(AdProvider adprovider, MediaPlayerNotification.Error error)
        {
            unregisterPlacement();
            MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.AD_RESOLVER_FAIL, "Ad resolving operation has failed.");
            if (_processingPlacementOpportunity != null)
            {
                _videoEngineTimelineProxy.releaseHoldReference(_processingPlacementOpportunity.getPlacementInformation().getTime());
            }
            _processingPlacementOpportunity = null;
            processQueuedOpportunities();
            warning.setInnerNotification(error);
            onWarning(adprovider, warning);
            notifyAdResolvingCompletion();
        }

        public void onWarning(AdProvider adprovider, MediaPlayerNotification.Warning warning)
        {
            if (_dispatcher != null)
            {
                _dispatcher.dispatch(OperationFailedEvent.createEvent(warning));
            }
        }

        public AdProviderListener()
        {
            this$0 = MediaPlayerClient.this;
            super();
            if (_timelineOperationQueue == null)
            {
                throw new IllegalArgumentException("The TimelineOperationQueue must be not null.");
            } else
            {
                return;
            }
        }
    }


    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/MediaPlayerClient.getSimpleName()).toString();
    private final AdClientFactory _adClientFactory;
    private AdPolicyProxy _adPolicyProxy;
    private AdPolicySelector _adPolicySelector;
    private final AdProviderListener _adProviderListener = new AdProviderListener();
    private final AdSignalingMode _adSignalingMode;
    private TimelineMonitor _adTimelineMonitor;
    private List _contentResolvers;
    private final VideoEngineDispatcher _dispatcher;
    private final Logger _logger;
    private final MediaPlayerItem _mediaPlayerItem;
    private MediaPlayer.AdPlaybackEventListener _onAdPlaybackEventListener;
    private OpportunityHandledListener _onOpportunityCompletedListener;
    private PlacementOpportunityDetector _placementOpportunityDetector;
    protected List _processedTimedMetadatas;
    private PlacementOpportunity _processingPlacementOpportunity;
    private long _processingTime;
    private final Queue _queuedOpportunities = new ArrayDeque();
    private int _reservations;
    private final TimelineOperationQueue _timelineOperationQueue;
    private final VideoEngineAdapter _videoEngineAdapter;
    private final VideoEngineTimeline _videoEngineTimeline;
    private final VideoEngineTimelineProxy _videoEngineTimelineProxy;

    public MediaPlayerClient(VideoEngineDispatcher videoenginedispatcher, MediaPlayerItem mediaplayeritem, VideoEngineAdapter videoengineadapter, AdClientFactory adclientfactory, AdSignalingMode adsignalingmode)
    {
        _logger = Log.getLogger(LOG_TAG);
        _reservations = 0;
        _processingTime = -1L;
        _processedTimedMetadatas = new ArrayList();
        _onOpportunityCompletedListener = new OpportunityHandledListener() {

            final MediaPlayerClient this$0;

            public void onOpportunityHandled(long l)
            {
                _logger.i((new StringBuilder()).append(MediaPlayerClient.LOG_TAG).append("#OpportunityHandledListener::onOpportunityHandled").toString(), (new StringBuilder()).append("Release reference for placement complete for HOLD at ").append(l).toString());
                _videoEngineTimelineProxy.releaseHoldReference(l);
            }

            
            {
                this$0 = MediaPlayerClient.this;
                super();
            }
        };
        _onAdPlaybackEventListener = new MediaPlayer.AdPlaybackEventListener() {

            final MediaPlayerClient this$0;

            public void onAdBreakComplete(AdBreak adbreak)
            {
            }

            public void onAdBreakSkipped(AdBreak adbreak)
            {
            }

            public void onAdBreakStart(AdBreak adbreak)
            {
            }

            public void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick)
            {
            }

            public void onAdComplete(AdBreak adbreak, Ad ad)
            {
            }

            public void onAdProgress(AdBreak adbreak, Ad ad, int i)
            {
            }

            public void onAdStart(AdBreak adbreak, Ad ad)
            {
            }

            
            {
                this$0 = MediaPlayerClient.this;
                super();
            }
        };
        _dispatcher = videoenginedispatcher;
        _videoEngineAdapter = videoengineadapter;
        _videoEngineTimeline = _videoEngineAdapter.getTimeline();
        _videoEngineTimeline.setMediaPlayerClient(this);
        _timelineOperationQueue = new TimelineOperationQueue(_videoEngineAdapter.getTimeline(), videoenginedispatcher);
        _videoEngineTimelineProxy = _videoEngineAdapter.createVideoEngineTimelineProxy();
        _mediaPlayerItem = mediaplayeritem;
        _adClientFactory = adclientfactory;
        _adSignalingMode = adsignalingmode;
        _dispatcher.addEventListener(MediaPlayerEvent.Type.OPPORTUNITY_COMPLETED, _onOpportunityCompletedListener);
        _dispatcher.addEventListener(MediaPlayerEvent.Type.OPPORTUNITY_FAILED, _onOpportunityCompletedListener);
        _dispatcher.addEventListener(MediaPlayer.Event.AD_PLAYBACK, _onAdPlaybackEventListener);
    }

    private boolean isValid(PlacementOpportunity placementopportunity)
    {
        if (placementopportunity == null || placementopportunity.getPlacementInformation() == null)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#isOpportunity").toString(), "PlacementOpportunity received is invalid.");
            return false;
        }
        long l = placementopportunity.getPlacementInformation().getTime();
        for (Iterator iterator = _queuedOpportunities.iterator(); iterator.hasNext();)
        {
            PlacementOpportunity placementopportunity1 = (PlacementOpportunity)iterator.next();
            long l1 = placementopportunity1.getPlacementInformation().getTime();
            long l2 = placementopportunity1.getPlacementInformation().getDuration();
            if (l1 <= l && l < l2 + l1)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#isOpportunity").toString(), (new StringBuilder()).append("PlacementOpportunity is overlapping an existing one [").append(placementopportunity.toString()).append("] with [").append(placementopportunity1.toString()).append("]").toString());
                return false;
            }
        }

        return true;
    }

    private ContentResolver lookupContentResolver(PlacementOpportunity placementopportunity)
    {
        ContentResolver contentresolver;
        Iterator iterator;
        contentresolver = null;
        iterator = null;
        if (placementopportunity != null) goto _L2; else goto _L1
_L1:
        ContentResolver contentresolver1 = iterator;
_L4:
        return contentresolver1;
_L2:
        contentresolver1 = iterator;
        if (_contentResolvers == null)
        {
            continue;
        }
        contentresolver1 = iterator;
        if (_contentResolvers.isEmpty())
        {
            continue;
        }
        iterator = _contentResolvers.iterator();
        do
        {
            contentresolver1 = contentresolver;
            if (!iterator.hasNext())
            {
                continue;
            }
            contentresolver1 = (ContentResolver)iterator.next();
            if (contentresolver1.canResolve(placementopportunity))
            {
                contentresolver = contentresolver1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void notifyAdResolvingCompletion()
    {
        _dispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.CONTENT_PLACEMENT_COMPLETE));
    }

    private void processQueuedOpportunities()
    {
        if (_processingPlacementOpportunity == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        synchronized (_queuedOpportunities)
        {
            _processingPlacementOpportunity = (PlacementOpportunity)_queuedOpportunities.poll();
        }
        if (lookupContentResolver(_processingPlacementOpportunity) == null) goto _L1; else goto _L3
_L3:
        long l;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#processQueuedOpportunities").toString(), (new StringBuilder()).append("Processing ").append(_processingPlacementOpportunity.toString()).toString());
        l = _processingPlacementOpportunity.getPlacementInformation().getTime();
        if (_videoEngineTimelineProxy.containsHoldFor(l))
        {
            break MISSING_BLOCK_LABEL_323;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#processQueuedOpportunities").toString(), (new StringBuilder()).append("Trying to place HOLD at ").append(l).toString());
        obj = _videoEngineTimelineProxy.getHoldAt(l);
        if (obj == null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#processQueuedOpportunities").toString(), (new StringBuilder()).append("Unable to place HOLD at ").append(l).append(". Ignoring timedMetadata").toString());
            removeTimedMetadata(l);
            _processingPlacementOpportunity = null;
            processQueuedOpportunities();
            return;
        }
        break MISSING_BLOCK_LABEL_264;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#processQueuedOpportunities").toString(), (new StringBuilder()).append("Adding reference for opportunity for  HOLD at ").append(l).toString());
        _videoEngineTimelineProxy.addHoldReference(((TimelineHold) (obj)));
        lookupContentResolver(_processingPlacementOpportunity).resolveAds(_processingPlacementOpportunity.getMetadata(), _processingPlacementOpportunity);
        return;
    }

    private void removeTimedMetadata(long l)
    {
        List list = _processedTimedMetadatas;
        list;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ArrayList();
        Iterator iterator = _processedTimedMetadatas.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TimedMetadata timedmetadata = (TimedMetadata)iterator.next();
            if (timedmetadata.getTime() == l)
            {
                ((List) (obj)).add(timedmetadata);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_79;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        _processedTimedMetadatas.removeAll(((java.util.Collection) (obj)));
        list;
        JVM INSTR monitorexit ;
    }

    private void resolveOpportunity(PlacementOpportunity placementopportunity)
    {
        if (placementopportunity == null)
        {
            throw new IllegalArgumentException("PlacementOpportunity parameter can not be null.");
        }
        synchronized (_queuedOpportunities)
        {
            if (isValid(placementopportunity))
            {
                _queuedOpportunities.add(placementopportunity);
                processQueuedOpportunities();
            }
        }
        return;
        placementopportunity;
        queue;
        JVM INSTR monitorexit ;
        throw placementopportunity;
    }

    public void beginResolveAds(PlacementInformation placementinformation)
    {
        Object obj;
        if (_contentResolvers == null || _contentResolvers.size() == 0)
        {
            registerPlacement(0);
            notifyAdResolvingCompletion();
            return;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#beginResolveAds").toString(), "Ad resolving and placementInformation process is starting.");
        obj = _mediaPlayerItem.getResource().getMetadata();
        placementinformation = new PlacementOpportunity("", placementinformation, ((Metadata) (obj)));
        Object obj1 = lookupContentResolver(placementinformation);
        if (obj1 != null)
        {
            try
            {
                ((ContentResolver) (obj1)).resolveAds(((Metadata) (obj)), placementinformation);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (PlacementInformation placementinformation)
            {
                obj = (new StringBuilder()).append("Ad resolving and placementInformation process cancelled due argument exception [").append(placementinformation.toString()).append("].").toString();
            }
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#beginResolveAds").toString(), ((String) (obj)));
            obj = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.PLAYBACK_OPERATION_FAIL, "Ad resolving and placementInformation process cancelled due argument exception.");
            obj1 = new MetadataNode();
            ((Metadata) (obj1)).setValue("DESCRIPTION", placementinformation.getMessage());
            ((MediaPlayerNotification.Warning) (obj)).setMetadata(((Metadata) (obj1)));
            _dispatcher.dispatch(OperationFailedEvent.createEvent(((MediaPlayerNotification.Warning) (obj))));
            notifyAdResolvingCompletion();
            return;
        }
        unregisterPlacement();
        return;
    }

    public boolean doneInitialResolving()
    {
        return _reservations == 0;
    }

    public AdPolicyProxy getAdPolicyProxy()
    {
        return _adPolicyProxy;
    }

    public AdSignalingMode getAdSignalingMode()
    {
        return _adSignalingMode;
    }

    public void initialize(VideoEngineTimeline.TimeMapping timemapping, TimelineMonitor timelinemonitor)
    {
        _adTimelineMonitor = timelinemonitor;
        if (_adClientFactory instanceof AdvertisingFactory)
        {
            _adPolicySelector = ((AdvertisingFactory)_adClientFactory).createAdPolicySelector(_mediaPlayerItem);
            if (_adPolicySelector == null)
            {
                _adPolicySelector = new DefaultAdPolicySelector(_mediaPlayerItem);
            }
            _contentResolvers = ((AdvertisingFactory)_adClientFactory).createContentResolvers(_mediaPlayerItem);
            _adPolicyProxy = new AdPolicyProxy(_videoEngineAdapter, _dispatcher, _videoEngineTimeline, _timelineOperationQueue, _mediaPlayerItem, _adPolicySelector);
            _adTimelineMonitor.initialize(_adPolicyProxy);
        }
        _placementOpportunityDetector = _adClientFactory.createOpportunityDetector(_mediaPlayerItem);
        if (_placementOpportunityDetector != null)
        {
            _processingTime = timemapping.getTime();
        }
        if (_contentResolvers != null && _contentResolvers.size() > 0 && _adProviderListener != null)
        {
            for (timelinemonitor = _contentResolvers.iterator(); timelinemonitor.hasNext(); ((ContentResolver)timelinemonitor.next()).registerOnCompleteListener(_adProviderListener)) { }
        }
        _videoEngineTimeline.setInitialTimeMapping(timemapping);
    }

    public void registerPlacement(int i)
    {
        _reservations = i;
    }

    public void unload()
    {
        _timelineOperationQueue.dispose();
        _timelineOperationQueue.clear();
        _dispatcher.removeEventListener(MediaPlayerEvent.Type.OPPORTUNITY_COMPLETED, _onOpportunityCompletedListener);
        _dispatcher.removeEventListener(MediaPlayerEvent.Type.OPPORTUNITY_FAILED, _onOpportunityCompletedListener);
        _dispatcher.removeEventListener(MediaPlayer.Event.AD_PLAYBACK, _onAdPlaybackEventListener);
        if (_contentResolvers != null && _contentResolvers.size() > 0)
        {
            for (Iterator iterator = _contentResolvers.iterator(); iterator.hasNext(); ((ContentResolver)iterator.next()).unregisterOnCompleteListener(_adProviderListener)) { }
        }
    }

    public void unregisterPlacement()
    {
        _reservations = _reservations - 1;
    }

    public void update(long l, TimeRange timerange)
    {
        if (_placementOpportunityDetector != null) goto _L2; else goto _L1
_L1:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "Update ignored as there is no registered detector to process it");
_L8:
        return;
_L2:
        ArrayList arraylist;
        Object obj;
        _processingTime = l;
        obj = _mediaPlayerItem.getTimedMetadata();
        arraylist = new ArrayList();
        List list = _processedTimedMetadatas;
        list;
        JVM INSTR monitorenter ;
        obj = ((List) (obj)).iterator();
_L5:
        TimedMetadata timedmetadata;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_343;
        }
        timedmetadata = (TimedMetadata)((Iterator) (obj)).next();
        if (timerange.contains(timedmetadata.getTime())) goto _L4; else goto _L3
_L3:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), (new StringBuilder()).append("Removing old timed metadata.[ opportunity: ").append(timedmetadata).append(", playback range: ").append(timerange).append("].").toString());
        _processedTimedMetadatas.remove(timedmetadata);
          goto _L5
        timerange;
        list;
        JVM INSTR monitorexit ;
        throw timerange;
_L4:
        if (_processedTimedMetadatas.contains(timedmetadata)) goto _L5; else goto _L6
_L6:
        if (timedmetadata.getTime() >= _processingTime)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), (new StringBuilder()).append("Ad placement opportunity skipped since its position is in the past (previous to the play head).[ opportunity: ").append(timedmetadata).append(", processing time: ").append(String.valueOf(l)).append("].").toString());
          goto _L5
        arraylist.add(timedmetadata);
        _processedTimedMetadatas.add(timedmetadata);
        _processingTime = timedmetadata.getTime();
          goto _L5
        list;
        JVM INSTR monitorexit ;
        timerange = _placementOpportunityDetector.process(arraylist, _mediaPlayerItem.getResource().getMetadata());
        if (timerange.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        timerange = timerange.iterator();
        while (timerange.hasNext()) 
        {
            PlacementOpportunity placementopportunity = (PlacementOpportunity)timerange.next();
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), (new StringBuilder()).append("Resolving opportunity ").append(placementopportunity.toString()).append(", processing time=").append(String.valueOf(l)).append("].").toString());
            resolveOpportunity(placementopportunity);
        }
        if (true || (_processingPlacementOpportunity != null || _queuedOpportunities.size() != 0)) goto _L8; else goto _L7
_L7:
        notifyAdResolvingCompletion();
        return;
    }









/*
    static PlacementOpportunity access$502(MediaPlayerClient mediaplayerclient, PlacementOpportunity placementopportunity)
    {
        mediaplayerclient._processingPlacementOpportunity = placementopportunity;
        return placementopportunity;
    }

*/


}
