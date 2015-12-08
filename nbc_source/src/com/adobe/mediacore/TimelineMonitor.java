// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdBreakAsWatched;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdAsset;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.timeline.advertising.AdBreakPolicy;
import com.adobe.mediacore.timeline.advertising.AdBreakRemoval;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import com.adobe.mediacore.timeline.advertising.ContentTracker;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.utils.StringUtils;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineDispatcher, AdPolicyProxy, AdTimeline, AdBreakPlaybackEvent, 
//            AdPlaybackEvent, AdClickEvent, ContentChangedListener, ContentMarkerListener

class TimelineMonitor
{

    private static final int INVALID_TIME = -1;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/TimelineMonitor.getSimpleName()).toString();
    private AdPolicyProxy _adPolicyProxy;
    private final AdTimeline _adTimeline;
    private long _contentId;
    private long _contentStartTime;
    private AdTimeline.Info _currentInfo;
    private Vector _deleteOnAdBreakExit;
    private Vector _detectedAdBreaks;
    private AdTimeline.AdInformation _lastAdInfo;
    private long _lastProcessedTime;
    private AdBreak _lastSkippedAdBreak;
    private final Logger _logger;
    private ContentChangedListener _onContentChangedListener;
    private ContentMarkerListener _onContentMarkerListener;
    private Vector _setAdBreakForRestore;
    private boolean _skipAdBreaks;
    private long _skippedDuration;
    private VideoEngineDispatcher _videoEngineDispatcher;

    public TimelineMonitor(VideoEngineDispatcher videoenginedispatcher, AdTimeline adtimeline)
    {
        _logger = Log.getLogger(LOG_TAG);
        _contentStartTime = 0L;
        _contentId = 0L;
        _lastProcessedTime = -1L;
        _currentInfo = null;
        _onContentChangedListener = new ContentChangedListener() {

            final TimelineMonitor this$0;

            public void onChanged(int i, long l)
            {
                contentChanged(i, l);
            }

            
            {
                this$0 = TimelineMonitor.this;
                super();
            }
        };
        _onContentMarkerListener = new ContentMarkerListener() {

            final TimelineMonitor this$0;

            public void onContentMarker(int i, long l)
            {
                contentChanged(i, l);
            }

            
            {
                this$0 = TimelineMonitor.this;
                super();
            }
        };
        _videoEngineDispatcher = videoenginedispatcher;
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.CONTENT_CHANGED, _onContentChangedListener);
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.CONTENT_MARKER, _onContentMarkerListener);
        _adTimeline = adtimeline;
        _skipAdBreaks = false;
        _lastSkippedAdBreak = null;
        _skippedDuration = 0L;
    }

    private void contentChanged(int i, long l)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#contentChanged").toString(), (new StringBuilder()).append("Content changed to [").append(i).append("] at time [").append(l).append("]").toString());
        _contentStartTime = l;
        _contentId = i;
        this;
        JVM INSTR monitorenter ;
        _lastAdInfo = null;
        this;
        JVM INSTR monitorexit ;
        _lastProcessedTime = -1L;
        update(i, l);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void deleteAdBreak(AdBreak adbreak, boolean flag)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#deleteAdBreak").toString(), (new StringBuilder()).append("Deleting Ad Break: ").append(adbreak.getFirstAd().getId()).toString());
        if (!flag)
        {
            _adPolicyProxy.seekThroughAdBreak(adbreak);
        }
        if (_setAdBreakForRestore.contains(adbreak))
        {
            _setAdBreakForRestore.remove(adbreak);
            _adPolicyProxy.removeOldAdBreakPlacementForAdBreak(adbreak);
        }
        adbreak = _adPolicyProxy.createAdBreakPlacement(adbreak, null);
        if (adbreak != null)
        {
            adbreak = new AdBreakRemoval(adbreak);
            if (adbreak != null)
            {
                _adPolicyProxy.placeTimelineLineOperation(adbreak);
            }
        }
    }

    private boolean isUpdateNeeded(AdTimeline.Info info)
    {
        if (_currentInfo != null) goto _L2; else goto _L1
_L1:
        if (info == null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (_currentInfo.equals(info))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void notifyOnSkippedAdBreaks(long l)
    {
        Iterator iterator = _adTimeline.timelineMarkers();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (AdBreakPlacement)iterator.next();
            PlacementInformation placementinformation = ((AdBreakPlacement) (obj)).getPlacement();
            obj = ((AdBreakPlacement) (obj)).getAdBreak();
            if (l >= placementinformation.getTime() && l <= placementinformation.getTime() + ((AdBreak) (obj)).getDuration() && obj != _lastSkippedAdBreak)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#update").toString(), "Ad break skipped.");
                _videoEngineDispatcher.dispatch(AdBreakPlaybackEvent.createSkippedEvent(((AdBreak) (obj))));
                _lastSkippedAdBreak = ((AdBreak) (obj));
                _skippedDuration = _skippedDuration + ((AdBreak) (obj)).getDuration();
            }
        } while (true);
    }

    private void onAdBreakComplete(AdBreak adbreak)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdBreakComplete").toString(), (new StringBuilder()).append("Ad Break Completed: ").append(adbreak.getFirstAd().getId()).toString());
        _adPolicyProxy.setAdBreakAsWatched(adbreak, AdBreakAsWatched.AD_BREAK_AS_WATCHED_ON_END);
        if (adbreak != null && adbreak.getLastAd() != null && adbreak.getLastAd().getContentTracker() != null)
        {
            adbreak.getLastAd().getContentTracker().onAdBreakComplete(adbreak);
        }
        if (!_deleteOnAdBreakExit.contains(adbreak) && _setAdBreakForRestore.contains(adbreak))
        {
            AdBreakPlacement adbreakplacement = _adPolicyProxy.createAdBreakPlacement(adbreak, null);
            _adPolicyProxy.placeTimelineLineOperation(new AdBreakRemoval(adbreakplacement));
            _setAdBreakForRestore.remove(adbreak);
            _adPolicyProxy.restoreAdBreak(adbreak);
        } else
        if (_deleteOnAdBreakExit.contains(adbreak))
        {
            _deleteOnAdBreakExit.remove(adbreak);
            deleteAdBreak(adbreak, true);
            return;
        }
    }

    private void onAdBreakDetected(AdBreak adbreak)
    {
        if (_adPolicyProxy == null) goto _L2; else goto _L1
_L1:
        AdBreakPolicy adbreakpolicy;
        adbreakpolicy = _adPolicyProxy.getAdBreakPolicyFor(adbreak);
        if (adbreak.getRestoreId() != null)
        {
            _setAdBreakForRestore.add(adbreak);
        }
        if (adbreakpolicy == null) goto _L4; else goto _L3
_L3:
        static class _cls3
        {

            static final int $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[];

            static 
            {
                $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy = new int[AdBreakPolicy.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.PLAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.SKIP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.REMOVE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$timeline$advertising$AdBreakPolicy[AdBreakPolicy.REMOVE_AFTER_PLAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.adobe.mediacore.timeline.advertising.AdBreakPolicy[adbreakpolicy.ordinal()];
        JVM INSTR tableswitch 1 4: default 76
    //                   1 76
    //                   2 77
    //                   3 83
    //                   4 90;
           goto _L4 _L4 _L5 _L6 _L7
_L4:
        return;
_L5:
        skipAdBreak(adbreak);
        return;
_L6:
        deleteAdBreak(adbreak, false);
        return;
_L7:
        _deleteOnAdBreakExit.add(adbreak);
        return;
_L2:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#onAdBreakDetected").toString(), "No ad policy proxy available.");
        return;
    }

    private void onAdBreakStart(AdBreak adbreak)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#onAdBreakStart").toString(), (new StringBuilder()).append("Ad Break started: ").append(adbreak.getFirstAd().getId()).toString());
        if (_detectedAdBreaks.indexOf(adbreak) == -1)
        {
            _detectedAdBreaks.add(adbreak);
            onAdBreakDetected(adbreak);
        }
        if (adbreak != null && adbreak.getLastAd() != null && adbreak.getLastAd().getContentTracker() != null)
        {
            adbreak.getLastAd().getContentTracker().onAdBreakStart(adbreak);
        }
        _adPolicyProxy.setAdBreakAsWatched(adbreak, AdBreakAsWatched.AD_BREAK_AS_WATCHED_ON_BEGIN);
    }

    private void skipAdBreak(AdBreak adbreak)
    {
        _adPolicyProxy.seekThroughAdBreak(adbreak);
    }

    private void update(long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        l = _lastProcessedTime;
        if (l != l1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        _lastProcessedTime = l1;
        if (!_skipAdBreaks)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        notifyOnSkippedAdBreaks(l1);
          goto _L1
        Exception exception;
        exception;
        throw exception;
        AdTimeline.Info info;
label0:
        {
            info = _adTimeline.getInfoForContentId(_contentId);
            if (!isUpdateNeeded(info))
            {
                break label0;
            }
            updateCurrentAdInfo(info);
        }
          goto _L1
        updateAdProgress(info, l1);
          goto _L1
    }

    private void updateAdProgress(AdTimeline.Info info, long l)
    {
        AdBreak adbreak;
        AdTimeline.AdInformation adinformation;
label0:
        {
            if (info != null)
            {
                adbreak = info.getAdBreak();
                info = info.getAd();
                if (adbreak != null && info != null)
                {
                    long l1 = l - _contentStartTime;
                    adinformation = new AdTimeline.AdInformation(info, (int)((100L * l1) / info.getDuration()));
                    _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateAdProgress").toString(), (new StringBuilder()).append("Updating ad progress for contentId [").append(_contentId).append("] ad duration: ").append(adinformation.getAd().getDuration()).append(", ad start time: ").append(_contentStartTime).append(", current time: ").append(l).append(", time difference: ").append(l1).append(", progress: ").append(adinformation.getProgress()).append("%").toString());
                    if (adinformation.getProgress() >= 0 && adinformation.getProgress() <= 100)
                    {
                        break label0;
                    }
                    _logger.w((new StringBuilder()).append(LOG_TAG).append("#updateAdProgress").toString(), "Ad progress value is not valid.");
                }
            }
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (_lastAdInfo == null || !_lastAdInfo.getAd().equals(adinformation.getAd()) || adinformation.getProgress() > _lastAdInfo.getProgress())
        {
            break MISSING_BLOCK_LABEL_282;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        info;
        this;
        JVM INSTR monitorexit ;
        throw info;
        this;
        JVM INSTR monitorexit ;
        _lastAdInfo = adinformation;
        if (info.getContentTracker() != null)
        {
            info.getContentTracker().onAdProgress(adinformation.getAd(), adinformation.getProgress());
        }
        _videoEngineDispatcher.dispatch(AdPlaybackEvent.createProgressEvent(adbreak, adinformation.getAd(), adinformation.getProgress()));
        return;
    }

    public VideoEngineTimeline.TimeMapping adjustSeekPosition(VideoEngineTimeline.TimeMapping timemapping, long l, AdPolicyMode adpolicymode)
    {
        return _adTimeline.getAdjustedPosition(timemapping, l, adpolicymode);
    }

    public void clear()
    {
        _currentInfo = null;
        _contentId = 0L;
        _contentStartTime = 0L;
        _lastProcessedTime = -1L;
        _lastAdInfo = null;
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.CONTENT_CHANGED, _onContentChangedListener);
        _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.CONTENT_MARKER, _onContentMarkerListener);
    }

    public void enableAdBreaks()
    {
        _skipAdBreaks = false;
        _skippedDuration = 0L;
    }

    public void initialize(AdPolicyProxy adpolicyproxy)
    {
        _adPolicyProxy = adpolicyproxy;
        _detectedAdBreaks = new Vector();
        _deleteOnAdBreakExit = new Vector();
        _setAdBreakForRestore = new Vector();
    }

    public boolean isPlayingAdBreak()
    {
        return _currentInfo != null;
    }

    public void processAdClick()
    {
        AdTimeline.Info info = _adTimeline.getInfoForContentId(_contentId);
        if (info != null)
        {
            Ad ad = info.getAd();
            if (ad != null)
            {
                AdClick adclick = ad.getPrimaryAsset().getAdClick();
                if (adclick != null && !StringUtils.isEmpty(adclick.getUrl()))
                {
                    if (ad.getContentTracker() != null)
                    {
                        ad.getContentTracker().onAdClick(ad);
                    }
                    _videoEngineDispatcher.dispatch(AdClickEvent.createAdClickEvent(info.getAdBreak(), info.getAd(), adclick));
                }
            }
        }
    }

    public void skipAdBreaks()
    {
        _skippedDuration = 0L;
        _skipAdBreaks = true;
    }

    public long skippedDuration()
    {
        return _skippedDuration;
    }

    public boolean skippingAdBreaks()
    {
        return _skipAdBreaks;
    }

    public void update(long l)
    {
        update(_contentId, l);
    }

    public void updateCurrentAdInfo(AdTimeline.Info info)
    {
        Ad ad = null;
        this;
        JVM INSTR monitorenter ;
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateCurrentAdInfo").toString(), "Updating current ad info.");
        if (_currentInfo == null) goto _L2; else goto _L1
_L1:
        AdBreak adbreak1;
        Ad ad1;
        adbreak1 = _currentInfo.getAdBreak();
        ad1 = _currentInfo.getAd();
        if (info == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (ad1.equals(info.getAd()))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateCurrentAdInfo").toString(), "Ad complete.");
        _videoEngineDispatcher.dispatch(AdPlaybackEvent.createCompleteEvent(adbreak1, ad1));
        if (ad1.getContentTracker() != null)
        {
            ad1.getContentTracker().onAdComplete(ad1);
        }
        AdBreak adbreak;
        if (info == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        ad = ad1;
        adbreak = adbreak1;
        if (adbreak1.equals(info.getAdBreak()))
        {
            break MISSING_BLOCK_LABEL_227;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateCurrentAdInfo").toString(), "Ad break complete.");
        _videoEngineDispatcher.dispatch(AdBreakPlaybackEvent.createCompleteEvent(adbreak1));
        onAdBreakComplete(adbreak1);
        adbreak = adbreak1;
        ad = ad1;
_L4:
        _currentInfo = info;
        if (info == null)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        if (!info.getAdBreak().equals(adbreak))
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateCurrentAdInfo").toString(), "Ad break start.");
            _videoEngineDispatcher.dispatch(AdBreakPlaybackEvent.createStartEvent(info.getAdBreak()));
            onAdBreakStart(info.getAdBreak());
        }
        if (!info.getAd().equals(ad))
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateCurrentAdInfo").toString(), "Ad start.");
            _videoEngineDispatcher.dispatch(AdPlaybackEvent.createStartEvent(info.getAdBreak(), info.getAd()));
            if (info.getAd().getContentTracker() != null)
            {
                info.getAd().getContentTracker().onAdStart(info.getAd());
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        info;
        throw info;
_L2:
        adbreak = null;
        if (true) goto _L4; else goto _L3
_L3:
    }


}
