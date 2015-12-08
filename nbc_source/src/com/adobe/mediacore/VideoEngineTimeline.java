// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.os.Handler;
import com.adobe.ave.InsertionResult;
import com.adobe.ave.PeriodInfo;
import com.adobe.ave.Timeline;
import com.adobe.ave.VideoEngineException;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.BlackoutMetadata;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.timeline.TimelineOperation;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdBreakRemoval;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import com.adobe.mediacore.timeline.advertising.ContentRemoval;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.mediacore:
//            ContentMapCache, ContentLoader, ContentNoCache, AdHandle, 
//            MediaResource, VideoEngineAdapter, AdBreakPlacementEvent, VideoEngineDispatcher, 
//            MediaPlayerEvent, ContentCache, MediaPlayerNotification, OperationFailedEvent, 
//            BufferControlParameters, MediaPlayerClient, AdPolicyProxy, VideoEngineContentMarkerCache, 
//            AdBreakManifestLoadCompleteListener

final class VideoEngineTimeline
{
    private final class InsertedAd
    {

        private Ad _ad;
        private AdHandle _handle;
        private int _index;
        private long _replaceDuration;
        private TimeMapping _timeMapping;
        final VideoEngineTimeline this$0;

        public Ad getAd()
        {
            return _ad;
        }

        public AdHandle getAdHandle()
        {
            return _handle;
        }

        public int getIndex()
        {
            return _index;
        }

        public long getReplaceDuration()
        {
            return _replaceDuration;
        }

        public TimeMapping getTimeMapping()
        {
            return _timeMapping;
        }

        public InsertedAd(int i, TimeMapping timemapping, AdHandle adhandle, Ad ad, long l)
        {
            this$0 = VideoEngineTimeline.this;
            super();
            _index = i;
            _timeMapping = timemapping;
            _handle = adhandle;
            _ad = ad;
            _replaceDuration = l;
        }
    }

    private final class Period
    {

        private final int periodIndex;
        private final PeriodInfo periodInfo;
        final VideoEngineTimeline this$0;

        public long getDuration()
        {
            return periodInfo.duration;
        }

        public long getLocalEndTime()
        {
            return getLocalStartTime() + getDuration();
        }

        public long getLocalStartTime()
        {
            return periodInfo.localStartTime;
        }

        public int getPeriodIndex()
        {
            return periodIndex;
        }

        public long getVirtualTime()
        {
            return periodInfo.virtualStartTime;
        }

        public Period(int i, PeriodInfo periodinfo)
        {
            this$0 = VideoEngineTimeline.this;
            super();
            periodIndex = i;
            periodInfo = periodinfo;
        }
    }

    public static class TimeMapping
    {

        public static final int INVALID_PERIOD = -1;
        public static final long INVALID_POSITION = -3L;
        public static final long LIVE_POINT = -2L;
        final int _period;
        final long _time;

        public static TimeMapping create(int i, long l)
        {
            return new TimeMapping(i, l);
        }

        public static TimeMapping createInvalid()
        {
            return new TimeMapping(-1, -3L);
        }

        public static TimeMapping createLivePoint()
        {
            return new TimeMapping(-1, -2L);
        }

        public int getPeriod()
        {
            return _period;
        }

        public long getTime()
        {
            return _time;
        }

        public boolean isInvalid()
        {
            return _period == -1 && _time == -3L;
        }

        public String toString()
        {
            return (new StringBuilder()).append("TimeMapping { _period=").append(_period).append(", _time=").append(_time).append("}").toString();
        }

        private TimeMapping(int i, long l)
        {
            _period = i;
            _time = l;
        }

        TimeMapping(int i, long l, _cls1 _pcls1)
        {
            this(i, l);
        }
    }


    private static final int DELTA = 5;
    private static final int INSERTION_DELTA = 300;
    public static final int INVALID_CONTENT_ID = -1;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineTimeline.getSimpleName()).toString();
    private static final int READ_HEAD_DELTA = 10000;
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private final int START_AD_BREAK_ID = 3000;
    private List _acceptedAds;
    private long _acceptedReplaceDuration;
    private final List _adBreakPlacements = new ArrayList();
    private final Map _adBreaksPlacementToRemove = new HashMap();
    private final ContentCache _contentCache;
    private final ContentLoader _contentLoader;
    private VideoEngineContentMarkerCache _contentMarkerCache;
    private Runnable _executor;
    private Handler _handler;
    private TimeMapping _initialTimeMapping;
    private List _insertedAds;
    private final int _mainContentId;
    private MediaPlayerClient _mediaPlayerClient;
    private final MediaResource _mediaResource;
    private int _nextTimelineId;
    private final AdBreakManifestLoadCompleteListener _onAdBreakCompleteLoadListener = new AdBreakManifestLoadCompleteListener() {

        final VideoEngineTimeline this$0;

        public void onComplete()
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator = _processingAdBreakPlacement.getAdBreak().adsIterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Ad ad = (Ad)iterator.next();
                AdHandle adhandle = _contentCache.getHandle(ad.getPrimaryAsset().getMediaResource().getUrl());
                if (adhandle != null)
                {
                    arraylist.add(ad);
                    arraylist1.add(adhandle);
                }
            } while (true);
            if (arraylist.isEmpty())
            {
                endAdBreakPlacement();
                return;
            } else
            {
                placeAdBreak(arraylist, arraylist1);
                return;
            }
        }

            
            {
                this$0 = VideoEngineTimeline.this;
                super();
            }
    };
    private AdBreakPlacement _processingAdBreakPlacement;
    private final VideoEngineAdapter _videoEngineAdapter;
    private final VideoEngineDispatcher _videoEngineDispatcher;

    public VideoEngineTimeline(VideoEngineDispatcher videoenginedispatcher, VideoEngineAdapter videoengineadapter, MediaResource mediaresource, int i, boolean flag)
    {
        _insertedAds = new ArrayList();
        _initialTimeMapping = TimeMapping.createInvalid();
        _nextTimelineId = 3000;
        if (videoenginedispatcher == null)
        {
            throw new IllegalArgumentException("Video engine dispatcher parameter must not be null.");
        }
        if (videoengineadapter == null)
        {
            throw new IllegalArgumentException("Video engine parameter must not be null.");
        }
        _videoEngineDispatcher = videoenginedispatcher;
        if (flag)
        {
            _logger.i(LOG_TAG, "Content cache is enabled.");
            _contentCache = new ContentMapCache();
        } else
        {
            _logger.i(LOG_TAG, "Content cache is disabled.");
            _contentCache = new ContentNoCache();
        }
        _contentLoader = new ContentLoader(_videoEngineDispatcher, _contentCache);
        _videoEngineAdapter = videoengineadapter;
        _mediaResource = mediaresource;
        _mainContentId = i;
        initialise();
        clearAdBreakPlacement();
    }

    private void acceptAd(AdHandle adhandle, Ad ad)
    {
        adhandle = Ad.cloneAd(ad, adhandle.getDuration(), _nextTimelineId);
        _acceptedAds.add(adhandle);
    }

    private void add(AdBreakPlacement adbreakplacement)
    {
        synchronized (_adBreakPlacements)
        {
            _adBreakPlacements.add(adbreakplacement);
        }
        return;
        adbreakplacement;
        list;
        JVM INSTR monitorexit ;
        throw adbreakplacement;
    }

    private boolean adjusAdBreakPlacementPosition(AdBreakPlacement adbreakplacement, Ad ad)
        throws VideoEngineException
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ad != null)
        {
            ad = getPeriod(ad.getId());
            flag = flag1;
            if (ad != null)
            {
                long l = ad.getVirtualTime();
                flag = flag1;
                if (adbreakplacement.getTime() != l)
                {
                    _logger.i((new StringBuilder()).append(LOG_TAG).append("#adjusAdBreakPlacementPosition").toString(), (new StringBuilder()).append("Adjusting ad break position from [").append(adbreakplacement.getTime()).append("] to [").append(l).append("].").toString());
                    ad = adbreakplacement.getPlacement();
                    adbreakplacement.setPlacement(new PlacementInformation(ad.getType(), l, ad.getDuration()));
                    flag = true;
                }
            }
        }
        return flag;
    }

    private long calculateAdsDuration(List list)
    {
        list = list.iterator();
        AdHandle adhandle;
        int i;
        long l;
        for (i = 0; list.hasNext(); i = (int)(adhandle.getDuration() + l))
        {
            adhandle = (AdHandle)list.next();
            l = i;
        }

        return (long)i;
    }

    private long calculateFailoverReplaceDuration(long l, AdHandle adhandle)
    {
        long l1 = 0L;
        if (l > 0L || l - adhandle.getDuration() > 0L)
        {
            l1 = l - adhandle.getDuration();
        }
        return l1;
    }

    private void clearAdBreakPlacement()
    {
        _acceptedAds = null;
        _processingAdBreakPlacement = null;
    }

    private void endAdBreakPlacement()
    {
        Object obj = null;
        AdBreakPlacement adbreakplacement = _processingAdBreakPlacement;
        Object obj1 = adbreakplacement.getAdBreak();
        Object obj2 = adbreakplacement.getPlacement();
        AdBreakPlacement adbreakplacement1;
        VideoEngineException videoengineexception;
        if (_acceptedAds.size() > 0)
        {
            obj = (Ad)_acceptedAds.get(0);
            long l1 = ((PlacementInformation) (obj2)).getTime();
            long l = l1;
            if (!((Ad) (obj)).isCustomAdMarker())
            {
                l = l1;
                if (((Ad) (obj)).getPrimaryAsset().getMediaResource().getUrl() != null)
                {
                    Long long1 = getVirtualTimeFor(((Ad) (obj)));
                    l = l1;
                    if (long1 != null)
                    {
                        l = long1.longValue();
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#endAdBreakPlacement").toString(), (new StringBuilder()).append("PlacementInformation information is ").append(l).append(" for ").append(((Ad) (obj)).getId()).toString());
                    }
                }
            }
            obj = new PlacementInformation(((PlacementInformation) (obj2)).getType(), l, ((PlacementInformation) (obj2)).getDuration());
            obj1 = AdBreak.createAdBreak(_acceptedAds, l, _acceptedReplaceDuration, ((AdBreak) (obj1)).getTag());
        } else
        {
            obj1 = null;
        }
        clearAdBreakPlacement();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        obj1 = new AdBreakPlacement(((AdBreak) (obj1)), ((PlacementInformation) (obj)));
        add(((AdBreakPlacement) (obj1)));
        _videoEngineAdapter.getPlaybackMetrics().update();
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#remove").toString(), (new StringBuilder()).append("Seekable range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getSeekableRange().toString()).toString());
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#remove").toString(), (new StringBuilder()).append("Playback range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getPlaybackRange().toString()).toString());
        obj = _adBreakPlacements;
        obj;
        JVM INSTR monitorenter ;
        obj2 = _adBreakPlacements.iterator();
_L1:
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_513;
        }
        adbreakplacement1 = (AdBreakPlacement)((Iterator) (obj2)).next();
        if (adbreakplacement1 == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        if (adbreakplacement1.getAdBreak() != null)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#endAdBreakPlacement").toString(), "Unable to retrieve valid Ad Break.");
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        adjusAdBreakPlacementPosition(adbreakplacement1, adbreakplacement1.getAdBreak().getFirstAd());
          goto _L1
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#endAdBreakPlacement").toString(), "A VideoEngineException occured while accessing the timeline", videoengineexception);
          goto _L1
        obj;
        JVM INSTR monitorexit ;
        _videoEngineDispatcher.dispatch(AdBreakPlacementEvent.createPlacementCompletedEvent(adbreakplacement, ((AdBreakPlacement) (obj1))));
        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.TIMELINE_UPDATED));
        return;
        _videoEngineDispatcher.dispatch(AdBreakPlacementEvent.createPlacementFailedEvent(adbreakplacement));
        return;
    }

    private void generateInsertedAds()
    {
        _insertedAds = new ArrayList();
        if (_contentCache != null)
        {
            Iterator iterator = _adBreakPlacements.iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (AdBreakPlacement)iterator.next();
                if (obj != null)
                {
                    PlacementInformation placementinformation = ((AdBreakPlacement) (obj)).getPlacement();
                    obj = ((AdBreakPlacement) (obj)).getAdBreak().adsIterator();
                    long l = 0L;
                    if (placementinformation != null)
                    {
                        l = placementinformation.getDuration();
                    }
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        Object obj1 = (Ad)((Iterator) (obj)).next();
                        if (obj1 != null && ((Ad) (obj1)).getPrimaryAsset() != null && ((Ad) (obj1)).getPrimaryAsset().getMediaResource() != null)
                        {
                            AdHandle adhandle = _contentCache.getHandle(((Ad) (obj1)).getPrimaryAsset().getMediaResource().getUrl());
                            if (adhandle != null && _videoEngineAdapter != null)
                            {
                                TimeMapping timemapping = getAdTimeMapping(((Ad) (obj1)).getId());
                                if (!timemapping.isInvalid())
                                {
                                    obj1 = new InsertedAd(i, timemapping, adhandle, ((Ad) (obj1)), l);
                                    _insertedAds.add(obj1);
                                }
                            }
                        }
                    } while (true);
                    i++;
                }
            } while (true);
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#generateInsertedAds").toString(), (new StringBuilder()).append("InsertedAds List size = ").append(_insertedAds.size()).toString());
    }

    private TimeMapping getAdTimeMapping(int i)
    {
        Timeline timeline = _videoEngineAdapter.getRawTimeline();
        if (timeline != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        return TimeMapping.createInvalid();
        int k = timeline.firstPeriodIndex;
        int j = 0;
_L12:
        PeriodInfo periodinfo;
        if (k > timeline.lastPeriodIndex)
        {
            break; /* Loop/switch isn't completed */
        }
        periodinfo = timeline.getPeriodInfo(k);
        if (periodinfo == null) goto _L2; else goto _L1
_L1:
        if (periodinfo.userData != i) goto _L2; else goto _L3
_L3:
        long l1 = _videoEngineAdapter.convertToLocalTime(periodinfo.virtualStartTime);
        if (j == 0) goto _L5; else goto _L4
_L4:
        int l;
        try
        {
            return TimeMapping.create(k, l1);
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#getAdTimeMapping").toString(), (new StringBuilder()).append("Exception raised while getting ad timemapping. {").append(videoengineexception.getErrorCode()).append(",").append(videoengineexception.getDetailMessage()).append("}").toString());
        }
          goto _L6
_L5:
        if (k - 1 < 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        return TimeMapping.create(k - 1, l1);
        return TimeMapping.create(k, l1);
_L2:
        if (periodinfo == null) goto _L8; else goto _L7
_L7:
        j = periodinfo.userData;
        l = _mainContentId;
        if (j == l) goto _L8; else goto _L9
_L9:
        j = 1;
_L10:
        k++;
        continue; /* Loop/switch isn't completed */
_L8:
        j = 0;
        if (true) goto _L10; else goto _L6
_L6:
        return TimeMapping.createInvalid();
        if (true) goto _L12; else goto _L11
_L11:
        return TimeMapping.createInvalid();
    }

    private TimeMapping getAdjustedPlacementTimeMapping(TimeMapping timemapping)
    {
        TimeMapping timemapping1;
        Object obj;
        int i;
        long l;
        try
        {
            obj = _videoEngineAdapter.getRawTimeline();
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#getAdjustedPlacementTimeMapping").toString(), (new StringBuilder()).append("Exception raised while adjusting placement time mapping. {").append(videoengineexception.getErrorCode()).append(",").append(videoengineexception.getDetailMessage()).append("}").toString());
            return timemapping;
        }
        timemapping1 = timemapping;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        i = timemapping.getPeriod();
        timemapping1 = timemapping;
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        obj = ((Timeline) (obj)).getPeriodInfo(timemapping.getPeriod());
        l = timemapping.getTime() - ((PeriodInfo) (obj)).localStartTime;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#getAdjustedPlacementTimeMapping").toString(), (new StringBuilder()).append("Diff between proposed position and period local start: ").append(l).toString());
        timemapping1 = timemapping;
        if (l <= 2L)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        timemapping1 = timemapping;
        if (l > 300L)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#getAdjustedPlacementTimeMapping").toString(), (new StringBuilder()).append("Adjust Insertion position from ").append(timemapping.getTime()).append(" to ").append(((PeriodInfo) (obj)).localStartTime).toString());
        timemapping1 = TimeMapping.create(i, ((PeriodInfo) (obj)).localStartTime);
        return timemapping1;
    }

    private TimeMapping getAdjustedTimeMapping(long l)
    {
        long l1 = l;
        if (l > 0x7fffffffL)
        {
            l1 = 0x7fffffffL;
        }
        return mapLocalTime(l1);
    }

    private TimeMapping getNextTimeMapping(int i)
    {
        Object obj = _videoEngineAdapter.getRawTimeline();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (i < ((Timeline) (obj)).lastPeriodIndex)
        {
            return new TimeMapping(i + 1, 0L);
        }
        PeriodInfo periodinfo = ((Timeline) (obj)).getPeriodInfo(((Timeline) (obj)).lastPeriodIndex);
        obj = new TimeMapping(((Timeline) (obj)).lastPeriodIndex, periodinfo.duration + 5L);
        return ((TimeMapping) (obj));
        VideoEngineException videoengineexception;
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#getNextTimeMapping").toString(), "Could not create time mapping for ad insertion.");
        return null;
    }

    private int getNextTimelineId()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = _nextTimelineId;
        _nextTimelineId = i + 1;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    private TimeRange[] getNonSeekableRanges()
    {
        if (_mediaResource != null && _mediaResource.getMetadata() != null && (_mediaResource.getMetadata() instanceof MetadataNode))
        {
            Object obj = (MetadataNode)_mediaResource.getMetadata();
            if (obj != null && ((MetadataNode) (obj)).containsKey(DefaultMetadataKeys.BLACKOUT_METADATA_KEY.getValue()))
            {
                obj = (BlackoutMetadata)((MetadataNode) (obj)).getNode(DefaultMetadataKeys.BLACKOUT_METADATA_KEY.getValue());
                if (obj != null)
                {
                    return ((BlackoutMetadata) (obj)).getNonSeekableRanges();
                }
            }
        }
        return null;
    }

    private Period getPeriod(int i)
        throws VideoEngineException
    {
        Timeline timeline = _videoEngineAdapter.getRawTimeline();
        for (int j = timeline.firstPeriodIndex; j <= timeline.lastPeriodIndex; j++)
        {
            PeriodInfo periodinfo = timeline.getPeriodInfo(j);
            if (periodinfo != null && periodinfo.userData == i)
            {
                return new Period(j, periodinfo);
            }
        }

        return null;
    }

    private Long getVirtualTimeFor(Ad ad)
    {
        Timeline timeline;
        int i;
        timeline = _videoEngineAdapter.getRawTimeline();
        i = timeline.firstPeriodIndex;
_L1:
        PeriodInfo periodinfo;
        if (i > timeline.lastPeriodIndex)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        periodinfo = timeline.getPeriodInfo(i);
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        long l;
        if (periodinfo.userData != ad.getId())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l = periodinfo.virtualStartTime;
        return Long.valueOf(l);
        i++;
          goto _L1
        ad;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#getVirtualTimeFor").toString(), "Exception raised while trying to access the timeline ", ad);
        return null;
    }

    private void initialise()
    {
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.AD_BREAK_MANIFEST_LOAD_COMPLETE, _onAdBreakCompleteLoadListener);
        _handler = new Handler();
        _executor = new Runnable() {

            final VideoEngineTimeline this$0;

            public void run()
            {
                if (_processingAdBreakPlacement != null && _processingAdBreakPlacement.getAdBreak() != null)
                {
                    _contentLoader.loadContent(_processingAdBreakPlacement.getAdBreak());
                    return;
                } else
                {
                    VideoEngineTimeline._logger.w((new StringBuilder()).append(VideoEngineTimeline.LOG_TAG).append("#initialise::run").toString(), "Loading manifests for ads cannot proceed");
                    return;
                }
            }

            
            {
                this$0 = VideoEngineTimeline.this;
                super();
            }
        };
    }

    private boolean isLive()
    {
        boolean flag1 = false;
        Timeline timeline;
        boolean flag;
        try
        {
            timeline = _videoEngineAdapter.getRawTimeline();
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#isLive").toString(), "Could not obtain timeline from VideoEngine ", videoengineexception);
            return false;
        }
        flag = flag1;
        if (timeline != null)
        {
            flag = flag1;
            if (timeline.complete == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean isWithinBounds(long l, long l1)
    {
        boolean flag1 = false;
        long l2;
        long l3;
        long l4;
        boolean flag;
        try
        {
            Timeline timeline = _videoEngineAdapter.getRawTimeline();
            l2 = timeline.getPeriodInfo(timeline.firstPeriodIndex).localStartTime;
            l3 = timeline.getPeriodInfo(timeline.lastPeriodIndex).localStartTime;
            l4 = timeline.getPeriodInfo(timeline.lastPeriodIndex).duration;
        }
        catch (VideoEngineException videoengineexception)
        {
            return false;
        }
        l3 += l4;
        flag = flag1;
        if (l >= l2)
        {
            flag = flag1;
            if (l < l3)
            {
                flag = flag1;
                if (l1 > l2)
                {
                    flag = flag1;
                    if (l1 <= l3)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private void loadAds()
    {
        boolean flag;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#loadAds").toString(), (new StringBuilder()).append("Starting to load ad manifests for adBreak = ").append(_processingAdBreakPlacement.getAdBreak().toString()).toString());
        flag = false;
        Timeline timeline = _videoEngineAdapter.getRawTimeline();
        if (timeline == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        _contentLoader.setVideoEngineTimeline(timeline);
        flag = true;
_L1:
        if (flag)
        {
            _handler.post(_executor);
            return;
        } else
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#loadAds").toString(), "Timeline retrieve from the VideoEngine is invalid. Ending ad break placement");
            endAdBreakPlacement();
            return;
        }
        try
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#loadAds").toString(), "Timeline received on the from the video engine is null");
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#loadAds").toString(), (new StringBuilder()).append("Exception raised while trying to access the video engine timeline { code = ").append(videoengineexception.getErrorCode()).append(", description = ").append(videoengineexception.getDetailMessage()).append("}").toString());
        }
          goto _L1
    }

    private TimeMapping mapLocalTime(long l)
    {
        Object obj;
        PeriodInfo periodinfo;
        try
        {
            obj = _videoEngineAdapter.getRawTimeline();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#mapLocalTime").toString(), (new StringBuilder()).append("Exception raised while mapping time on timeline. {").append(((VideoEngineException) (obj)).getErrorCode()).append(",").append(((VideoEngineException) (obj)).getDetailMessage()).append("}").toString());
            return TimeMapping.createInvalid();
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        return TimeMapping.createInvalid();
        periodinfo = ((Timeline) (obj)).getPeriodInfo(((Timeline) (obj)).lastPeriodIndex);
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        if (l < _videoEngineAdapter.convertToLocalTime(periodinfo.virtualStartTime + periodinfo.duration))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj = new TimeMapping(((Timeline) (obj)).lastPeriodIndex, l);
        return ((TimeMapping) (obj));
        int j;
        int k;
        j = ((Timeline) (obj)).firstPeriodIndex;
        k = ((Timeline) (obj)).lastPeriodIndex;
_L10:
        if (j >= k + 1) goto _L2; else goto _L1
_L1:
        PeriodInfo periodinfo1 = ((Timeline) (obj)).getPeriodInfo(j);
        if (periodinfo1 == null) goto _L4; else goto _L3
_L3:
        if (periodinfo1.userData != _mainContentId) goto _L4; else goto _L5
_L5:
        long l1;
        long l2;
        l1 = periodinfo1.localStartTime;
        l2 = periodinfo1.duration;
        int i = j;
        if (l < l1) goto _L7; else goto _L6
_L6:
        if (l1 > l || l >= l2 + l1) goto _L4; else goto _L8
_L8:
        i = j;
_L7:
        j = i;
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        return TimeMapping.createInvalid();
        j = ((Timeline) (obj)).lastPeriodIndex;
        return new TimeMapping(j, l);
_L2:
        i = -1;
        if (true) goto _L7; else goto _L4
_L4:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void placeAdBreak(List list, List list1)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#placeAdBreak").toString(), "Ad break placement process starting.");
        long l = calculateAdsDuration(list1);
        long l1 = _processingAdBreakPlacement.getPlacement().getDuration();
        TimeMapping timemapping;
        int i;
        if (l1 == 0L)
        {
            l = l1;
        }
        _acceptedReplaceDuration = l;
        if (_processingAdBreakPlacement.getPlacement().getType().equals(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL) && !_initialTimeMapping.isInvalid())
        {
            timemapping = getAdjustedTimeMapping(_initialTimeMapping.getTime());
        } else
        {
            timemapping = getAdjustedTimeMapping(_processingAdBreakPlacement.getTime());
        }
        if (timemapping.isInvalid())
        {
            endAdBreakPlacement();
        }
        timemapping = getAdjustedPlacementTimeMapping(timemapping);
        i = 0;
        while (i < list1.size()) 
        {
            AdHandle adhandle = (AdHandle)list1.get(i);
            Ad ad = (Ad)list.get(i);
            int j = placeContent(timemapping, adhandle.getHandle(), _nextTimelineId, l);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#placeAdBreak").toString(), (new StringBuilder()).append("Placecontent: time=").append(timemapping.toString()).append(", adHandle=").append(adhandle).append(", replaceDuration=").append(l).toString());
            if (j != -1)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#placeAdBreak").toString(), (new StringBuilder()).append("Ad inserted at period ").append(j).append(" with contentId = ").append(_nextTimelineId).append(" url = ").append(ad.getPrimaryAsset().getMediaResource().getUrl()).toString());
                acceptAd(adhandle, ad);
                timemapping = getNextTimeMapping(j);
                _nextTimelineId = _nextTimelineId + 1;
                l = 0L;
            } else
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#placeAdBreak").toString(), (new StringBuilder()).append("Ad insertion failed for contentId = ").append(_nextTimelineId).append(" url = ").append(ad.getPrimaryAsset().getMediaResource().getUrl()).toString());
                removeContent(_nextTimelineId, true);
                l = calculateFailoverReplaceDuration(l, adhandle);
                _acceptedReplaceDuration = l;
            }
            i++;
        }
        endAdBreakPlacement();
    }

    private int placeContent(TimeMapping timemapping, int i, int j, long l)
    {
        Timeline timeline = _videoEngineAdapter.getRawTimeline();
        if (timeline == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#placeContent").toString(), (new StringBuilder()).append("Placing content at ").append(timemapping.toString()).append(" for handle ").append(i).append(" contentId = ").append(j).append(" replaceDuration = ").append(l).toString());
        timemapping = timeline.insertByLocalTime(timemapping.getPeriod(), timemapping.getTime(), i, j, l);
        if (timemapping == null)
        {
            return -1;
        }
        i = ((InsertionResult) (timemapping)).periodIndex;
        return i;
        timemapping;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#placeContent").toString(), (new StringBuilder()).append("Exception raised while placing content. {").append(timemapping.getErrorCode()).append(",").append(timemapping.getDetailMessage()).append("}").toString());
        return -1;
    }

    static void printTimeline(Timeline timeline)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#printTimeline").toString(), "Showing the AVE timeline:");
        if (timeline != null) goto _L2; else goto _L1
_L1:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#printTimeline").toString(), "Invalid AVE timeline");
_L5:
        return;
_L2:
        int i = timeline.firstPeriodIndex;
_L3:
        PeriodInfo periodinfo;
        if (i > timeline.lastPeriodIndex)
        {
            continue; /* Loop/switch isn't completed */
        }
        periodinfo = timeline.getPeriodInfo(i);
        if (periodinfo != null)
        {
            try
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#printTimeline").toString(), (new StringBuilder()).append("> ").append(i).append(" vStart: ").append(periodinfo.virtualStartTime).append(" lStart: ").append(periodinfo.localStartTime).append(" - duration: ").append(periodinfo.duration).append(" contentId: ").append(periodinfo.userData).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Timeline timeline)
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#printTimeline").toString(), (new StringBuilder()).append("Exception raised while accessing the video engine timeline{ code = ").append(String.valueOf(timeline.getErrorCode())).append(", message = ").append(String.valueOf(timeline.getDetailMessage())).append("}").toString());
                return;
            }
        }
        i++;
          goto _L3
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean processCustomMarkers()
    {
        Iterator iterator = _processingAdBreakPlacement.getAdBreak().adsIterator();
        long l = 0L;
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Ad ad = (Ad)iterator.next();
            if (ad.getPrimaryAsset().getMediaResource().getUrl() == null)
            {
                int i = getNextTimelineId();
                long l1 = ad.getDuration();
                TimeMapping timemapping = getAdjustedTimeMapping(_processingAdBreakPlacement.getAdBreak().getTime() + l);
                if (!timemapping.isInvalid())
                {
                    long l2 = _processingAdBreakPlacement.getAdBreak().getTime();
                    long l3 = l2 + l1;
                    if (!isWithinBounds(l2, l3))
                    {
                        _logger.w((new StringBuilder()).append(LOG_TAG).append("#processCustomMarkers").toString(), (new StringBuilder()).append("Invalid TimeRange [").append(l2).append(", ").append(l3).append("], 'begin' or 'end' value is out of bounds of stream").toString());
                    }
                    if (placeContentMarker(timemapping, i, l1))
                    {
                        ad = Ad.cloneAd(ad, l1, i);
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#placeAd").toString(), (new StringBuilder()).append("Placing custom ad-marker in ").append(String.valueOf(timemapping.toString())).append(" with replacement duration [").append(0L).append("]. ").append(ad.toString()).toString());
                        _acceptedAds.add(ad);
                        l += l1;
                        flag = true;
                    }
                }
            }
        } while (true);
        if (flag)
        {
            getAdjustedTimeMapping(l + _processingAdBreakPlacement.getAdBreak().getTime());
            endAdBreakPlacement();
        }
        return flag;
    }

    private void removeByLocalTime(TimelineOperation timelineoperation)
    {
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), "Starting to remove the AdBreak by local time");
        Object obj = ((AdBreakRemoval)timelineoperation).getAdBreak();
        Iterator iterator = ((AdBreak) (obj)).adsIterator();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Seekable range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getSeekableRange().toString()).toString());
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Playback range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getPlaybackRange().toString()).toString());
        while (iterator.hasNext()) 
        {
            Ad ad = (Ad)iterator.next();
            boolean flag;
            if (((AdBreak) (obj)).getReplaceDuration() != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Removing the content with id = ").append(ad.getId()).append(" and replace content is set to ").append(flag).toString());
            if (removeContent(ad.getId(), flag))
            {
                _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Removing the content with id = ").append(ad.getId()).append(" succeded").toString());
                arraylist.add(ad);
            } else
            {
                arraylist1.add(ad);
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Removing the content with id = ").append(ad.getId()).append(" failed").toString());
                MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.GENERIC_WARNING, "Failed to remove content from timeline");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("AD_BREAK", ((AdBreakRemoval)timelineoperation).getAdBreak().toString());
                metadatanode.setValue("AD", ad.toString());
                warning.setMetadata(metadatanode);
                _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(warning));
            }
        }
        _videoEngineAdapter.getPlaybackMetrics().update();
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Seekable range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getSeekableRange().toString()).toString());
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), (new StringBuilder()).append("Playback range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getPlaybackRange().toString()).toString());
        Iterator iterator1;
        try
        {
            printTimeline(_videoEngineAdapter.getRawTimeline());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByLocalTime").toString(), "Unable to retrieve thet timeline in order to print the timeline");
        }
        obj = null;
        iterator1 = _adBreakPlacements.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            AdBreakPlacement adbreakplacement = (AdBreakPlacement)iterator1.next();
            if (adbreakplacement.getPlacement().equals(timelineoperation.getPlacement()))
            {
                obj = adbreakplacement;
            }
        } while (true);
        if (updateAdBreakPlacement(arraylist1, arraylist, ((AdBreakPlacement) (obj))))
        {
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.TIMELINE_UPDATED));
        }
        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ADBREAK_REMOVAL_COMPLETED));
    }

    private void removeByVirtualTime(TimelineOperation timelineoperation)
    {
        AdBreak adbreak;
        int i;
        int j;
        boolean flag1;
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), "Starting to remove the AdBreak by virtual time");
        adbreak = ((AdBreakRemoval)timelineoperation).getAdBreak();
        i = adbreak.getFirstAd().getId();
        j = adbreak.getLastAd().getId();
        flag1 = false;
        Object obj;
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), (new StringBuilder()).append("Seekable range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getSeekableRange().toString()).toString());
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), (new StringBuilder()).append("Playback range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getPlaybackRange().toString()).toString());
        timelineoperation = getPeriod(i);
        obj = getPeriod(j);
        boolean flag;
        flag = flag1;
        if (timelineoperation == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        flag = flag1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        flag = removeContentByVirtualTime(timelineoperation.getVirtualTime(), ((Period) (obj)).getVirtualTime() + ((Period) (obj)).getDuration());
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), (new StringBuilder()).append("Removed Ads content from [").append(String.valueOf(timelineoperation.getVirtualTime())).append("] to [").append(String.valueOf(((Period) (obj)).getVirtualTime() + ((Period) (obj)).getDuration())).append("] from timeline.").toString());
_L6:
        if (!flag) goto _L2; else goto _L1
_L1:
        List list = _adBreakPlacements;
        list;
        JVM INSTR monitorenter ;
        timelineoperation = null;
        Iterator iterator = _adBreakPlacements.iterator();
_L5:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        long l;
        long l1;
        obj = (AdBreakPlacement)iterator.next();
        l = adbreak.getTime();
        l1 = ((AdBreakPlacement) (obj)).getAdBreak().getTime();
        if (l == l1)
        {
            timelineoperation = ((TimelineOperation) (obj));
        }
          goto _L5
        timelineoperation;
        flag = false;
_L8:
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), "Removing AdBreak from timeline failed");
        timelineoperation.printStackTrace();
          goto _L6
_L4:
        if (timelineoperation == null)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime - updateAdBreakPlacement").toString(), (new StringBuilder()).append("Removing ad break from ad timeline : ").append(timelineoperation.getAdBreak().toString()).toString());
        _adBreakPlacements.remove(timelineoperation);
        timelineoperation = _adBreakPlacements.iterator();
_L7:
        if (!timelineoperation.hasNext())
        {
            break MISSING_BLOCK_LABEL_644;
        }
        obj = (AdBreakPlacement)timelineoperation.next();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        if (((AdBreakPlacement) (obj)).getAdBreak() != null)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime - updateAdBreakPlacement").toString(), "Unable to retrieve valid Ad Break.");
          goto _L7
        timelineoperation;
        list;
        JVM INSTR monitorexit ;
        throw timelineoperation;
        adjusAdBreakPlacementPosition(((AdBreakPlacement) (obj)), ((AdBreakPlacement) (obj)).getAdBreak().getFirstAd());
          goto _L7
        VideoEngineException videoengineexception;
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime - updateAdBreakPlacement").toString(), "A VideoEngineException occured while accessing the timeline", videoengineexception);
          goto _L7
        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.TIMELINE_UPDATED));
        list;
        JVM INSTR monitorexit ;
        _videoEngineAdapter.getPlaybackMetrics().update();
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), (new StringBuilder()).append("Seekable range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getSeekableRange().toString()).toString());
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), (new StringBuilder()).append("Playback range is  = ").append(_videoEngineAdapter.getPlaybackMetrics().getPlaybackRange().toString()).toString());
        try
        {
            printTimeline(_videoEngineAdapter.getRawTimeline());
        }
        // Misplaced declaration of an exception variable
        catch (TimelineOperation timelineoperation)
        {
            _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), "Unable to retrieve thet timeline in order to print the timeline");
        }
        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ADBREAK_REMOVAL_COMPLETED));
_L2:
        return;
        timelineoperation;
          goto _L8
    }

    private void removeContent(TimelineOperation timelineoperation)
    {
        long l = timelineoperation.getPlacement().getTime();
        long l1 = timelineoperation.getPlacement().getDuration() + l;
        if (!isWithinBounds(l, l1))
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#removeContent").toString(), (new StringBuilder()).append("Invalid TimeRange [").append(l).append(", ").append(l1).append("], 'begin' or 'end' value is out of bounds of stream").toString());
        }
        if (!removeContentByLocalTime(timelineoperation.getPlacement().getTime(), timelineoperation.getPlacement().getTime() + timelineoperation.getPlacement().getDuration()))
        {
            timelineoperation = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.GENERIC_WARNING, "Failed to remove content from timeline");
            _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(timelineoperation));
            return;
        } else
        {
            _videoEngineAdapter.getPlaybackMetrics().update();
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ADBREAK_REMOVAL_COMPLETED));
            return;
        }
    }

    private boolean removeContent(int i, boolean flag)
    {
        Period period;
        long l;
        long l1;
        long l2;
        try
        {
            period = getPeriod(i);
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#removeContent").toString(), (new StringBuilder()).append("Exception raised while removing content. {").append(videoengineexception.getErrorCode()).append(",").append(videoengineexception.getDetailMessage()).append("}").toString());
            return false;
        }
        if (period != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        _logger.w(LOG_TAG, (new StringBuilder()).append("Unable to remove content with id [").append(i).append("]").toString());
        return false;
        l2 = period.getLocalStartTime();
        l1 = period.getLocalEndTime();
        l = l1;
        if (l2 == l1)
        {
            l = l1 + 1L;
        }
        _videoEngineAdapter.getRawTimeline().eraseByLocalTime(period.getPeriodIndex(), l2, l, flag);
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeContent").toString(), (new StringBuilder()).append("Removed content [").append(i).append("] from timeline.").toString());
        return true;
    }

    private boolean removeContentByLocalTime(long l, long l1)
    {
        try
        {
            Timeline timeline = _videoEngineAdapter.getRawTimeline();
            int i = timeline.lastPeriodIndex;
            timeline.eraseByLocalTime(i, l, l1, false);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeContentByLocalTime").toString(), (new StringBuilder()).append("Removed content [").append(l).append(", ").append(l1).append("] from timeline. Period index: ").append(i).toString());
        }
        catch (VideoEngineException videoengineexception)
        {
            return false;
        }
        return true;
    }

    private boolean removeContentByVirtualTime(long l, long l1)
    {
        try
        {
            _videoEngineAdapter.getRawTimeline().eraseByVirtualTime(l, l1);
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.d((new StringBuilder()).append(LOG_TAG).append("#removeByVirtualTime").toString(), "Removing AdBreak from timeline failed");
            videoengineexception.printStackTrace();
            return false;
        }
        return true;
    }

    private boolean removeOldAdBreaks(long l)
    {
        if (_adBreaksPlacementToRemove.size() > 0 && _videoEngineAdapter.getBufferControlParameters() != null) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        long l1 = _videoEngineAdapter.getBufferControlParameters().getPlayBufferTime();
        Iterator iterator = _adBreaksPlacementToRemove.entrySet().iterator();
        boolean flag = false;
        do
        {
            flag1 = flag;
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            AdBreakPlacement adbreakplacement = (AdBreakPlacement)entry.getKey();
            long l2 = l - ((Long)entry.getValue()).longValue();
            if (l2 >= l1)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeOldAdBreaks").toString(), (new StringBuilder()).append("Removing ad break from ad timeline after [").append(l2).append("] ms of waiting. [").append(adbreakplacement).append("].").toString());
                synchronized (_adBreakPlacements)
                {
                    _adBreakPlacements.remove(adbreakplacement);
                }
                iterator.remove();
                flag = true;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private long retrieveTotalDuration(List list)
    {
        list = list.iterator();
        long l;
        for (l = 0L; list.hasNext(); l = ((Ad)list.next()).getDuration() + l) { }
        return l;
    }

    private TimeMapping seekableTimeEquivalentOfTime(TimeMapping timemapping)
    {
        Object obj;
        TimeRange atimerange[];
        atimerange = getNonSeekableRanges();
        obj = timemapping;
        if (atimerange == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        obj = timemapping;
        if (i >= atimerange.length) goto _L2; else goto _L3
_L3:
        obj = atimerange[i];
        if (!((TimeRange) (obj)).contains(timemapping.getTime())) goto _L5; else goto _L4
_L4:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#seekableTimeEquivalentOfTime").toString(), (new StringBuilder()).append("[Warning] >> desired postion ").append(String.valueOf(timemapping)).append(" falls into nonSeekable range [").append(((TimeRange) (obj)).getBegin()).append(", ").append(((TimeRange) (obj)).getEnd()).append("].").toString());
        timemapping = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.INVALID_SEEK_WARNING, "Attempt to seek into nonSeekableRanges.");
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(timemapping));
        }
        obj = TimeMapping.create(-1, ((TimeRange) (obj)).getEnd());
_L2:
        return ((TimeMapping) (obj));
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean updateAdBreakPlacement(List list, List list1, AdBreakPlacement adbreakplacement)
    {
        if (list1.isEmpty() || adbreakplacement == null)
        {
            return false;
        }
        list1 = _adBreakPlacements;
        list1;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (list.isEmpty())
        {
            break MISSING_BLOCK_LABEL_285;
        }
        iterator = list.iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj = (Ad)iterator.next();
        if (getPeriod(((Ad) (obj)).getId()) != null) goto _L2; else goto _L1
_L1:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), (new StringBuilder()).append("Readjusting ad break : Ad ").append(((Ad) (obj)).getId()).append(" does not exist on AVE timeline.").toString());
        if (!list.remove(obj))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), (new StringBuilder()).append("Readjusting ad break : Ad ").append(((Ad) (obj)).getId()).append(" removed from AdBreakPlacement").toString());
          goto _L2
        obj;
        ((VideoEngineException) (obj)).printStackTrace();
          goto _L2
        list;
        list1;
        JVM INSTR monitorexit ;
        throw list;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), (new StringBuilder()).append("Readjusting ad break : Ad ").append(((Ad) (obj)).getId()).append(" could not be removed from AdBreakPlacement").toString());
          goto _L2
        if (!list.isEmpty()) goto _L4; else goto _L3
_L3:
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), (new StringBuilder()).append("Removing ad break from ad timeline : ").append(adbreakplacement.getAdBreak().toString()).toString());
        _adBreakPlacements.remove(adbreakplacement);
_L12:
        list = _adBreakPlacements.iterator();
_L10:
        if (!list.hasNext()) goto _L6; else goto _L5
_L5:
        adbreakplacement = (AdBreakPlacement)list.next();
        if (adbreakplacement == null) goto _L8; else goto _L7
_L7:
        if (adbreakplacement.getAdBreak() != null) goto _L9; else goto _L8
_L8:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), "Unable to retrieve valid Ad Break.");
          goto _L10
_L4:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), (new StringBuilder()).append("Readjusting ad break : ").append(adbreakplacement.getAdBreak().toString()).toString());
        int i = _adBreakPlacements.indexOf(adbreakplacement);
        long l = getVirtualTimeFor((Ad)list.get(0)).longValue();
        long l1 = retrieveTotalDuration(list);
        list = new AdBreakPlacement(AdBreak.createAdBreak(list, l, 0L, adbreakplacement.getAdBreak().getTag()), new PlacementInformation(adbreakplacement.getPlacement().getType(), l, l1));
        _adBreakPlacements.add(i, list);
        continue; /* Loop/switch isn't completed */
_L9:
        adjusAdBreakPlacementPosition(adbreakplacement, adbreakplacement.getAdBreak().getFirstAd());
          goto _L10
        adbreakplacement;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#updateAdBreakPlacement").toString(), "A VideoEngineException occured while accessing the timeline", adbreakplacement);
          goto _L10
_L6:
        list1;
        JVM INSTR monitorexit ;
        return true;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public TimeMapping adjustSeekPosition(TimeMapping timemapping, long l, AdPolicyMode adpolicymode)
    {
        timemapping = seekableTimeEquivalentOfTime(timemapping);
        _mediaPlayerClient.getAdPolicyProxy().registerSeekOrTrickPlayToTime(timemapping, l, adpolicymode);
        return timemapping;
    }

    public void clear()
    {
        synchronized (_adBreakPlacements)
        {
            _adBreakPlacements.clear();
        }
        _contentLoader.releaseHandles();
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.AD_BREAK_MANIFEST_LOAD_COMPLETE, _onAdBreakCompleteLoadListener);
        _handler = null;
        _executor = null;
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean containsMarkerForTime(long l)
    {
        return _contentMarkerCache != null && _contentMarkerCache.containsMarkerFor(l);
    }

    public long convertToLocalTime(long l)
    {
        return _videoEngineAdapter.convertToLocalTime(l);
    }

    public void execute(TimelineOperation timelineoperation)
    {
        if (timelineoperation instanceof AdBreakPlacement)
        {
            place(timelineoperation);
        } else
        {
            if (timelineoperation instanceof AdBreakRemoval)
            {
                remove(timelineoperation);
                return;
            }
            if (timelineoperation instanceof ContentRemoval)
            {
                removeContent(timelineoperation);
                return;
            }
        }
    }

    public List getAdBreakPlacements()
    {
        return _adBreakPlacements;
    }

    public AdSignalingMode getAdSignalingMode()
    {
        AdSignalingMode adsignalingmode = AdSignalingMode.DEFAULT;
        if (_mediaPlayerClient != null)
        {
            adsignalingmode = _mediaPlayerClient.getAdSignalingMode();
        }
        return adsignalingmode;
    }

    public PlacementInformation getPlacementFor(AdBreak adbreak)
    {
label0:
        {
            synchronized (_adBreakPlacements)
            {
                Iterator iterator = _adBreakPlacements.iterator();
                AdBreakPlacement adbreakplacement;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    adbreakplacement = (AdBreakPlacement)iterator.next();
                } while (!adbreakplacement.getAdBreak().equals(adbreak));
                adbreak = adbreakplacement.getPlacement();
            }
            return adbreak;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        adbreak;
        list;
        JVM INSTR monitorexit ;
        throw adbreak;
    }

    public Timeline getRawTimeline()
    {
        Timeline timeline;
        try
        {
            timeline = _videoEngineAdapter.getRawTimeline();
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.e(LOG_TAG, "Unable to retrieve timeline.");
            return null;
        }
        return timeline;
    }

    public void place(TimelineOperation timelineoperation)
    {
        if (_processingAdBreakPlacement != null)
        {
            throw new IllegalStateException("You need to wait for previous place command to finish before issuing a new one. You can use AdBreakPlacementCompletedListener or AdBreakPlacementFailedListener for this.");
        }
        if (timelineoperation instanceof AdBreakPlacement)
        {
            _processingAdBreakPlacement = (AdBreakPlacement)timelineoperation;
            _acceptedAds = new ArrayList();
            if (!processCustomMarkers())
            {
                loadAds();
            }
            return;
        } else
        {
            throw new IllegalArgumentException("Place operation must receive only AdBreakPlacementOperation as a parameter.");
        }
    }

    protected boolean placeContentMarker(TimeMapping timemapping, int i, long l)
    {
        if (_contentMarkerCache == null)
        {
            _contentMarkerCache = new VideoEngineContentMarkerCache(_videoEngineDispatcher, _mainContentId);
        }
        _contentMarkerCache.addMarker(timemapping, i, l);
        return true;
    }

    public void remove(TimelineOperation timelineoperation)
    {
        if (!(timelineoperation instanceof AdBreakRemoval))
        {
            throw new IllegalArgumentException("In order to execute remove videoEngineTimeline must receive a  AdBreakRemoval as a TimelineOperation.");
        }
        if (((AdBreakRemoval)timelineoperation).getAdBreak().getReplaceDuration() > 0L)
        {
            removeByLocalTime(timelineoperation);
            return;
        } else
        {
            removeByVirtualTime(timelineoperation);
            return;
        }
    }

    public void removeAdsOnSourceTimeline()
    {
        generateInsertedAds();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeAdsOnSourceTimeline").toString(), "Remove ads after entering trickplay mode");
        int i = 0;
        long l3 = 0L;
        long l1 = 0L;
        int j = -1;
        while (i < _insertedAds.size()) 
        {
            InsertedAd insertedad = (InsertedAd)_insertedAds.get(i);
            long l = l3;
            long l2 = l1;
            int k = j;
            if (insertedad != null)
            {
                if (j != insertedad.getIndex())
                {
                    if (j != -1)
                    {
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeAdsOnSourceTimeline").toString(), (new StringBuilder()).append("Remove ad: [virtual begin, virtual end] = [").append(String.valueOf(l1)).append(", ").append(String.valueOf(l1 + l3)).append("].").toString());
                        if (!removeContentByVirtualTime(l1, l1 + l3))
                        {
                            _logger.e((new StringBuilder()).append(LOG_TAG).append("#removeAdsOnSourceTimeline").toString(), (new StringBuilder()).append("Could not remove the content. From=").append(l1).append(" duration=").append(l3).toString());
                        }
                    }
                    k = insertedad.getIndex();
                    l2 = getVirtualTimeFor(insertedad.getAd()).longValue();
                    l = insertedad.getAdHandle().getDuration();
                } else
                {
                    l = l3 + insertedad.getAdHandle().getDuration();
                    l2 = l1;
                    k = j;
                }
            }
            i++;
            l3 = l;
            l1 = l2;
            j = k;
        }
        if (_insertedAds.size() > 0 && l3 != 0L)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#removeAdsOnSourceTimeline").toString(), (new StringBuilder()).append("Remove ad: [virtual begin, virtual end] = [").append(String.valueOf(l1)).append(", ").append(String.valueOf(l1 + l3)).append("].").toString());
            if (!removeContentByVirtualTime(l1, l1 + l3))
            {
                _logger.e((new StringBuilder()).append(LOG_TAG).append("#removeAdsOnSourceTimeline").toString(), (new StringBuilder()).append("Could not remove the content. From=").append(l1).append(" duration=").append(l3).toString());
            }
        }
    }

    public void restoreAdsOnSourceTimeline()
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#restoreAdsOnSourceTimeline").toString(), "Restore ads after exiting trickplay");
        for (int i = 0; i < _insertedAds.size(); i++)
        {
            InsertedAd insertedad = (InsertedAd)_insertedAds.get(i);
            if (insertedad == null || insertedad.getAd() == null)
            {
                continue;
            }
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#restoreAdsOnSourceTimeline").toString(), (new StringBuilder()).append("Attemp to restore ad on the timeline: ").append(insertedad.getAd().toString()).toString());
            if (placeContent(insertedad.getTimeMapping(), insertedad.getAdHandle().getHandle(), insertedad.getAd().getId(), insertedad.getReplaceDuration()) == -1)
            {
                _logger.e((new StringBuilder()).append(LOG_TAG).append("#restoreAdsOnSourceTimeline").toString(), "Failed to restore ad on the timeline");
            }
        }

        _insertedAds = null;
    }

    public void setInitialTimeMapping(TimeMapping timemapping)
    {
        _initialTimeMapping = timemapping;
    }

    public void setMediaPlayerClient(MediaPlayerClient mediaplayerclient)
    {
        _mediaPlayerClient = mediaplayerclient;
    }

    public boolean shouldTriggerSubscribedTagEvent(long l)
    {
label0:
        {
            if (_adBreakPlacements == null)
            {
                break label0;
            }
            boolean flag = isLive();
            AdSignalingMode adsignalingmode = getAdSignalingMode();
            Iterator iterator = _adBreakPlacements.iterator();
            AdBreakPlacement adbreakplacement;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                adbreakplacement = (AdBreakPlacement)iterator.next();
            } while (!flag && adsignalingmode != AdSignalingMode.MANIFEST_CUES || adbreakplacement == null || adbreakplacement.getTime() > l || l >= adbreakplacement.getTime() + adbreakplacement.getDuration() || adbreakplacement.getAdBreak().getRestoreId() == null);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#shouldTriggerSubscribedTagEvent").toString(), (new StringBuilder()).append("Local time: ").append(l).append(" ; inside moved ad break: ").append(adbreakplacement.getAdBreak()).append(" with placementinfo: ").append(adbreakplacement.getPlacement()).toString());
            return false;
        }
        return true;
    }

    public void update(long l)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "Syncing AdTimeline with AVE timeline.");
        List list = _adBreakPlacements;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator;
        boolean flag1;
        flag1 = removeOldAdBreaks(l);
        iterator = _adBreakPlacements.iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        AdBreakPlacement adbreakplacement = (AdBreakPlacement)iterator.next();
        if (adbreakplacement == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (adbreakplacement.getAdBreak() != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "Unable to retrieve valid Ad Break.");
          goto _L3
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        Ad ad;
        Ad ad1;
        ad = adbreakplacement.getAdBreak().getFirstAd();
        ad1 = adbreakplacement.getAdBreak().getLastAd();
        if (ad != null && ad1 != null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#update").toString(), (new StringBuilder()).append("Unable to retrieve valid Ad from Ad Break: ").append(adbreakplacement).toString());
          goto _L3
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        break MISSING_BLOCK_LABEL_225;
_L4:
        boolean flag;
        flag1 = flag;
        i = ad1.getId();
        flag1 = flag;
        if (getPeriod(i) != null)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        flag1 = flag;
        if (_adBreaksPlacementToRemove.containsKey(adbreakplacement))
        {
            break MISSING_BLOCK_LABEL_372;
        }
        flag1 = flag;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), (new StringBuilder()).append("Marking ad break for removal, from the ad timeline, after a delay period. Last commercial ID [").append(i).append("] is no longer found in the AVE timeline. [").append(adbreakplacement).append("].").toString());
        flag1 = flag;
        _adBreaksPlacementToRemove.put(adbreakplacement, Long.valueOf(l));
_L5:
        flag1 = flag;
          goto _L3
        int i;
        if (adjusAdBreakPlacementPosition(adbreakplacement, ad))
        {
            break MISSING_BLOCK_LABEL_485;
        }
        flag = false;
          goto _L4
        VideoEngineException videoengineexception;
        videoengineexception;
        flag = flag1;
        _logger.e((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "Unable to retrieve period information from the AVE timeline.");
          goto _L5
_L2:
        list;
        JVM INSTR monitorexit ;
        if (flag1)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "Ad timeline has updated.");
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.TIMELINE_UPDATED));
        }
        return;
        flag = true;
          goto _L4
    }

    public void updateTimelineMarkers(long l)
    {
        if (_contentMarkerCache == null)
        {
            return;
        } else
        {
            _contentMarkerCache.dispatchEvents(l);
            return;
        }
    }

    public boolean willAccept(TimelineOperation timelineoperation)
    {
        if (timelineoperation == null)
        {
            throw new IllegalArgumentException("The timelineOperation parameter passed in must be not null.");
        }
        if (!(timelineoperation instanceof AdBreakPlacement))
        {
            return true;
        }
        if (_adBreakPlacements.isEmpty())
        {
            return true;
        }
        long l = timelineoperation.getPlacement().getTime();
        for (Iterator iterator = _adBreakPlacements.iterator(); iterator.hasNext();)
        {
            AdBreakPlacement adbreakplacement = (AdBreakPlacement)iterator.next();
            long l1 = adbreakplacement.getTime();
            if (adbreakplacement.getAdBreak().getReplaceDuration() == 0L)
            {
                com.adobe.mediacore.timeline.advertising.PlacementInformation.Type type = timelineoperation.getPlacement().getType();
                if (adbreakplacement.getTime() == l && type != com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL && type != com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.POST_ROLL)
                {
                    return false;
                }
            } else
            {
                long l2 = adbreakplacement.getAdBreak().getReplaceDuration();
                if (l1 <= l && l < l2 + l1)
                {
                    return false;
                }
            }
        }

        return true;
    }








}
