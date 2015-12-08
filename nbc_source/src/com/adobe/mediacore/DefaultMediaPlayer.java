// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.Context;
import android.os.Handler;
import com.adobe.ave.MediaErrorCode;
import com.adobe.ave.PlayState;
import com.adobe.ave.drm.DRMManager;
import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.AdvertisingMetadata;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.session.NotificationHistory;
import com.adobe.mediacore.timeline.Timeline;
import com.adobe.mediacore.timeline.advertising.AdPolicyMode;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import com.adobe.mediacore.timeline.advertising.customadmarkers.CustomRangeHelper;
import com.adobe.mediacore.utils.TimeRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer, VideoEngineDispatcher, VideoEngineAdapter, MediaPlayerView, 
//            MediaPlayerItem, SeekEvent, TimelineMonitor, MediaResource, 
//            MediaPlayerNotification, OperationFailedEvent, AdTimeline, DefaultAdvertisingFactory, 
//            MediaPlayerClient, TrickPlayManager, MediaPlayerEvent, VideoEngineTimeline, 
//            TextFormatBuilder, ABRControlParameters, BufferControlParameters, StateChangedEvent, 
//            AdClientFactory, TextFormat, SeekAdjustCompletedListener, AudioTrackFailedListener, 
//            VideoErrorListener, VideoStateChangedListener, MediaPlayerState, ResourceLoadedListener, 
//            ContentPlacementCompletedListener, ItemCreatedListener, ErrorEvent, ItemUpdatedListener, 
//            ItemReadyListener, BufferingFullListener, ViewClickListener

public final class DefaultMediaPlayer
    implements MediaPlayer
{

    private static final int DEFAULT_CONTENT_ID = 0;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/DefaultMediaPlayer.getSimpleName()).toString();
    private final long INTERNAL_TIMER_PERIOD = 250L;
    private AdClientFactory _adClientFactory;
    private AdSignalingMode _adSignalingMode;
    private AdTimeline _adTimeline;
    private TimelineMonitor _adTimelineMonitor;
    private MediaPlayerItem _backgroundItem;
    private MediaResource _backgroundResource;
    private TextFormat _closedCaptionsTextFormat;
    private Context _context;
    private boolean _cuesResolved;
    private MediaPlayer.PlayerState _currentStatus;
    private Handler _handler;
    private VideoEngineTimeline.TimeMapping _initialTime;
    private Runnable _internalTimer;
    private boolean _internalTimerRunning;
    private boolean _isPrepared;
    private MediaPlayerItem _item;
    private final Logger _logger;
    private MediaPlayerClient _mediaPlayerClient;
    private MediaPlayerView _mediaPlayerView;
    private PlaybackMetrics _playbackMetrics;
    private boolean _preparePending;
    private MediaResource _resource;
    private final SeekAdjustCompletedListener _seekAdjustCompletedListener = new SeekAdjustCompletedListener() {

        final DefaultMediaPlayer this$0;

        public void onAdjustCompleted(long l)
        {
            if (_seekAdjustCompletedListener != null)
            {
                _videoEngineDispatcher.removeEventListener(MediaPlayerEvent.Type.SEEK_ADJUST_COMPLETED, _seekAdjustCompletedListener);
            }
            _videoEngineAdapter.seek(VideoEngineTimeline.TimeMapping.create(-1, l));
            if (MediaPlayer.PlayerState.PAUSED != getStatus() && MediaPlayer.PlayerState.SUSPENDED != getStatus())
            {
                _videoEngineAdapter.play();
            }
            if (_item.isLive() && _mediaPlayerClient != null)
            {
                _mediaPlayerClient.update(_playbackMetrics.getTime(), _playbackMetrics.getPlaybackRange());
            }
            if (!_internalTimerRunning)
            {
                startInternalTimer();
            }
        }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
    };
    private boolean _seekNeeded;
    private boolean _shouldStopInternalTimer;
    private long _startPosition;
    private TrickPlayManager _trickPlayManager;
    private VideoEngineAdapter _videoEngineAdapter;
    private VideoEngineDispatcher _videoEngineDispatcher;

    DefaultMediaPlayer(Context context)
    {
        _logger = Log.getLogger(LOG_TAG);
        _initialTime = VideoEngineTimeline.TimeMapping.createInvalid();
        _isPrepared = false;
        _seekNeeded = false;
        _preparePending = false;
        _closedCaptionsTextFormat = null;
        _currentStatus = MediaPlayer.PlayerState.IDLE;
        _context = context;
        _handler = new Handler();
        _internalTimer = new Runnable() {

            final DefaultMediaPlayer this$0;

            public void run()
            {
                if (_videoEngineAdapter != null)
                {
                    _playbackMetrics.update();
                    long l = getCurrentTime();
                    if (_adTimeline != null)
                    {
                        _adTimeline.update(l);
                    }
                    if (_adTimelineMonitor != null)
                    {
                        _adTimelineMonitor.update(l);
                    }
                    if (_trickPlayManager != null)
                    {
                        _trickPlayManager.update(l);
                    }
                }
                if (!_shouldStopInternalTimer)
                {
                    _handler.postDelayed(_internalTimer, 250L);
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        };
        _videoEngineDispatcher = new VideoEngineDispatcher();
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.RESOURCE_LOADED, new ResourceLoadedListener() {

            final DefaultMediaPlayer this$0;

            public void onLoaded()
            {
                _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#endLoadResource").toString(), (new StringBuilder()).append("Loading of media resource is complete. [").append(_resource).append("].").toString());
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.CONTENT_PLACEMENT_COMPLETE, new ContentPlacementCompletedListener() {

            final DefaultMediaPlayer this$0;

            public void onCompleted()
            {
                if (_mediaPlayerClient != null && _mediaPlayerClient.doneInitialResolving())
                {
                    endAdResolving();
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ITEM_CREATED, new ItemCreatedListener() {

            final DefaultMediaPlayer this$0;

            public void onCreated()
            {
                if (_currentStatus == MediaPlayer.PlayerState.ERROR)
                {
                    _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemAvailable").toString(), "Ignore event as media player is in ERROR state.");
                } else
                {
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemAvailable").toString(), "Media player item available.");
                    _item = _videoEngineAdapter.getCurrentItem();
                    if (_item.isLive() && _item.getResource().getMetadata() != null && _item.getResource().getMetadata().containsKey(DefaultMetadataKeys.CUSTOM_AD_MARKERS_METADATA_KEY.getValue()))
                    {
                        _logger.e((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemAvailable").toString(), "Cannot place custom ad-markers on LIVE content.");
                        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.RESOURCE_LOAD_ERROR, "Resource loading failed due to invalid media-resource metadata.");
                        MetadataNode metadatanode = new MetadataNode();
                        metadatanode.setValue("DESCRIPTION", "Cannot place custom ad-markers on LIVE content.");
                        error.setMetadata(metadatanode);
                        _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
                        return;
                    }
                    setStatus(MediaPlayer.PlayerState.INITIALIZED, null);
                    if (_preparePending)
                    {
                        prepareToPlay(_startPosition);
                        return;
                    }
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ITEM_UPDATED, new ItemUpdatedListener() {

            final DefaultMediaPlayer this$0;

            public void onUpdated()
            {
                if (_currentStatus == MediaPlayer.PlayerState.ERROR)
                {
                    _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemRefreshed").toString(), "Ignore event as media player is in ERROR state.");
                    return;
                }
                if (_currentStatus == MediaPlayer.PlayerState.INITIALIZED || _currentStatus == MediaPlayer.PlayerState.INITIALIZING || _currentStatus == MediaPlayer.PlayerState.PREPARING && !_cuesResolved)
                {
                    _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemRefreshed").toString(), "Ignore event as media player is in PREPARING state.");
                    return;
                } else
                {
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemRefreshed").toString(), "Media player item refreshed.");
                    resolveCues();
                    _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.UPDATED));
                    return;
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.ITEM_READY, new ItemReadyListener() {

            final DefaultMediaPlayer this$0;

            public void onReady()
            {
                _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerItemReady").toString(), "Media item ready for further processing.");
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.BUFFERING_FULL, new BufferingFullListener() {

            final DefaultMediaPlayer this$0;

            public void onFull()
            {
                if (_currentStatus == MediaPlayer.PlayerState.ERROR)
                {
                    _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerBufferFull").toString(), "Ignore event as media player is in ERROR state.");
                } else
                {
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerBufferFull").toString(), (new StringBuilder()).append("Buffer full: ").append(_playbackMetrics.getBufferLength()).append(".").toString());
                    if (getStatus() == MediaPlayer.PlayerState.PAUSED)
                    {
                        stopInternalTimer();
                        return;
                    }
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.VIEW_CLICKED, new ViewClickListener() {

            final DefaultMediaPlayer this$0;

            public void onClick()
            {
                if (_adTimelineMonitor != null)
                {
                    _adTimelineMonitor.processAdClick();
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.AUDIO_TRACK_FAILED, new AudioTrackFailedListener() {

            final DefaultMediaPlayer this$0;

            public void onFailed(AudioTrack audiotrack, MediaPlayerNotification.Error error)
            {
                _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("::AudioTrackFailedListener#onFailed").toString(), (new StringBuilder()).append("Audio track failed: [").append(audiotrack).append("].").toString());
                audiotrack = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.PLAYBACK_OPERATION_FAIL, "Failed to load audio track. Please select another track.");
                audiotrack.setInnerNotification(error);
                _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(audiotrack));
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.VIDEO_ERROR, new VideoErrorListener() {

            final DefaultMediaPlayer this$0;

            public void onError(MediaPlayerNotification.Error error)
            {
                if (isErrorRecoverable(error))
                {
                    _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerError").toString(), (new StringBuilder()).append("A recoverable error occurred.[").append(error.getDescription()).append("]").toString());
                    MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.PLAYBACK_OPERATION_FAIL, "A recoverable error has occured.");
                    warning.setInnerNotification(error);
                    _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(warning));
                    return;
                } else
                {
                    _logger.e((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayerError").toString(), (new StringBuilder()).append("An error occurred. [").append(error).append("]").toString());
                    setStatus(MediaPlayer.PlayerState.ERROR, error);
                    stopInternalTimer();
                    return;
                }
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.VIDEO_STATE_CHANGED, new VideoStateChangedListener() {

            final DefaultMediaPlayer this$0;

            public void onStateChanged(MediaPlayerState mediaplayerstate, MediaPlayerNotification mediaplayernotification)
            {
                if (_currentStatus != MediaPlayer.PlayerState.ERROR) goto _L2; else goto _L1
_L1:
                _logger.w((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onStateChanged").toString(), "Ignore event as media player is in ERROR state.");
_L4:
                return;
_L2:
                static class _cls13
                {

                    static final int $SwitchMap$com$adobe$ave$MediaErrorCode[];
                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayerState = new int[MediaPlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.PAUSE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.PLAY.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.COMPLETE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayerState[MediaPlayerState.SUSPENDED.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        $SwitchMap$com$adobe$ave$MediaErrorCode = new int[MediaErrorCode.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.PARSE_ERROR.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.FRAGMENT_READ_ERROR.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.ASYNC_OPERATION_IN_PROGRESS.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$MediaErrorCode[MediaErrorCode.FILE_NOT_FOUND.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls13..SwitchMap.com.adobe.mediacore.MediaPlayerState[mediaplayerstate.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayPaused").toString(), "Playback paused.");
                    return;

                case 2: // '\002'
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlayStart").toString(), "Playback started.");
                    if (!_internalTimerRunning)
                    {
                        startInternalTimer();
                    }
                    _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.PLAY_START));
                    if (getStatus() == MediaPlayer.PlayerState.COMPLETE)
                    {
                        setStatus(MediaPlayer.PlayerState.PLAYING, null);
                        return;
                    }
                    break;

                case 3: // '\003'
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onPlaybackComplete").toString(), "Playback completed.");
                    if (_adTimelineMonitor != null)
                    {
                        _adTimelineMonitor.updateCurrentAdInfo(null);
                    }
                    stopInternalTimer();
                    setStatus(MediaPlayer.PlayerState.COMPLETE, null);
                    _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.PLAY_COMPLETE));
                    return;

                case 4: // '\004'
                    _logger.i((new StringBuilder()).append(DefaultMediaPlayer.LOG_TAG).append("#onStateChanged").toString(), "Playback suspended");
                    setStatus(MediaPlayer.PlayerState.SUSPENDED, null);
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = DefaultMediaPlayer.this;
                super();
            }
        });
        _videoEngineAdapter = new VideoEngineAdapter(_context, _videoEngineDispatcher);
        _videoEngineAdapter.initialize();
        _mediaPlayerView = new MediaPlayerView(_context, _videoEngineAdapter, _videoEngineDispatcher);
        _videoEngineAdapter.setView(_mediaPlayerView.getVideoEngineView());
        _playbackMetrics = _videoEngineAdapter.getPlaybackMetrics();
    }

    private void adjustDesiredSeekPosition(long l)
    {
        if (l != -2L) goto _L2; else goto _L1
_L1:
        VideoEngineTimeline.TimeMapping timemapping;
        long l1;
        if (_item.isLive())
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#adjustDesiredSeekPosition").toString(), "Seeking starting at client live point ");
            _videoEngineDispatcher.dispatch(SeekEvent.createSeekAdjustCompleted(VideoEngineTimeline.TimeMapping.createLivePoint().getTime()));
            l1 = l;
        } else
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#seek").toString(), "Invalid parameter. Seeking to the client live point is not allowed for video on demand content. Will use default value.");
            l1 = _playbackMetrics.getSeekableRange().getBegin();
        }
_L4:
        timemapping = VideoEngineTimeline.TimeMapping.create(-1, l1);
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#adjustDesiredSeekPosition").toString(), (new StringBuilder()).append("Seeking starting [").append(timemapping.toString()).append("].").toString());
        if (_adTimelineMonitor != null && _playbackMetrics != null)
        {
            _videoEngineAdapter.pause();
            if (_seekAdjustCompletedListener != null)
            {
                _videoEngineDispatcher.addEventListener(MediaPlayerEvent.Type.SEEK_ADJUST_COMPLETED, _seekAdjustCompletedListener);
            }
            timemapping = _adTimelineMonitor.adjustSeekPosition(timemapping, _playbackMetrics.getTime(), AdPolicyMode.SEEK);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#adjustDesiredSeekPosition").toString(), (new StringBuilder()).append("Adjusted seek position is [").append(timemapping.toString()).append("].").toString());
        }
        return;
_L2:
        l1 = l;
        if (!_playbackMetrics.getSeekableRange().contains(l))
        {
            if (l > _playbackMetrics.getSeekableRange().getEnd())
            {
                l = _playbackMetrics.getSeekableRange().getEnd();
            } else
            {
                l = _playbackMetrics.getSeekableRange().getBegin();
            }
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#seek").toString(), (new StringBuilder()).append("Desired seek position is not included in the seekble range. Will use default value ").append(l).toString());
            l1 = l;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private VideoEngineTimeline.TimeMapping adjustDesiredStartPosition(long l)
    {
        if (l == -2L)
        {
            return getInitialTimeForLive();
        }
        if (!_playbackMetrics.getSeekableRange().contains(l))
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#adjustDesiredStartPosition").toString(), "Desired start position is not included in the seekble range. Will used default values.");
            if (_item.isLive())
            {
                return getInitialTimeForLive();
            } else
            {
                return VideoEngineTimeline.TimeMapping.create(-1, _playbackMetrics.getSeekableRange().getBegin());
            }
        } else
        {
            return VideoEngineTimeline.TimeMapping.create(-1, l);
        }
    }

    private void beginLoadResource()
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#beginLoadResource").toString(), (new StringBuilder()).append("Loading of media resource is starting. [").append(_resource).append("].").toString());
        _isPrepared = false;
        _videoEngineAdapter.load(_resource, 0);
        _videoEngineAdapter.setView(_mediaPlayerView.getVideoEngineView());
    }

    private void checkAndThrowIfError()
        throws IllegalStateException
    {
        if (_currentStatus == MediaPlayer.PlayerState.ERROR)
        {
            throw new IllegalStateException("The media player is in ERROR state. You'll need to reset it before further use.");
        } else
        {
            return;
        }
    }

    private void checkAndThrowIfReleased()
        throws IllegalStateException
    {
        if (_currentStatus == MediaPlayer.PlayerState.RELEASED)
        {
            throw new IllegalStateException("The media player has been released. No method can be invoked anymore.");
        } else
        {
            return;
        }
    }

    public static MediaPlayer create(Context context)
    {
        return new DefaultMediaPlayer(context);
    }

    private static List createInitialPlacementInformations(MediaPlayerItem mediaplayeritem, AdSignalingMode adsignalingmode, VideoEngineTimeline.TimeMapping timemapping)
    {
        ArrayList arraylist;
        if (adsignalingmode == AdSignalingMode.DEFAULT)
        {
            throw new IllegalArgumentException("adSignalingMode should not be set to DEFAULT. The adSignalingMode should be already adjusted to the actual value (MANIFEST_CUES or SERVER_MAP) based on the media player item type.");
        }
        arraylist = new ArrayList();
        mediaplayeritem = new CustomRangeHelper(mediaplayeritem.getResource().getMetadata());
        if (mediaplayeritem.hasRanges() != null) goto _L2; else goto _L1
_L1:
        if (adsignalingmode != AdSignalingMode.SERVER_MAP) goto _L4; else goto _L3
_L3:
        arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.SERVER_MAP, -1L, 0L));
_L6:
        return arraylist;
_L4:
        if (adsignalingmode != AdSignalingMode.MANIFEST_CUES) goto _L6; else goto _L5
_L5:
        arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL, timemapping.getTime(), -1L));
        return arraylist;
_L2:
        if (mediaplayeritem.hasRanges() == "mark")
        {
            arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.MARK, -1L, 0L));
            return arraylist;
        }
        if (mediaplayeritem.hasRanges() != "delete")
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.DELETE, -1L, 0L));
        if (adsignalingmode == AdSignalingMode.SERVER_MAP)
        {
            arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.SERVER_MAP, -1L, 0L));
            return arraylist;
        }
        if (adsignalingmode != AdSignalingMode.MANIFEST_CUES) goto _L6; else goto _L7
_L7:
        arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.PRE_ROLL, timemapping.getTime(), -1L));
        return arraylist;
        if (mediaplayeritem.hasRanges() != "replace") goto _L6; else goto _L8
_L8:
        arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.DELETE, -1L, 0L));
        arraylist.add(new PlacementInformation(com.adobe.mediacore.timeline.advertising.PlacementInformation.Type.CUSTOM_TIME_RANGES, com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.REPLACE, -1L, 0L));
        return arraylist;
    }

    private AdSignalingMode extractAdSignalingMode(MediaPlayerItem mediaplayeritem)
    {
        Object obj;
        AdSignalingMode adsignalingmode1;
        CustomRangeHelper customrangehelper;
        MetadataNode metadatanode;
        adsignalingmode1 = AdSignalingMode.DEFAULT;
        obj = mediaplayeritem.getResource().getMetadata();
        metadatanode = (MetadataNode)obj;
        customrangehelper = new CustomRangeHelper(((Metadata) (obj)));
        if (obj == null || !(obj instanceof MetadataNode)) goto _L2; else goto _L1
_L1:
        AdvertisingMetadata advertisingmetadata;
        obj = null;
        if (metadatanode.containsNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue()))
        {
            obj = (AdvertisingMetadata)metadatanode.getNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue());
        }
        advertisingmetadata = ((AdvertisingMetadata) (obj));
        if (metadatanode.containsKey(DefaultMetadataKeys.ADVERTISING_METADATA.getValue()))
        {
            advertisingmetadata = (AdvertisingMetadata)metadatanode.getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
        }
        if (advertisingmetadata == null) goto _L2; else goto _L3
_L3:
        obj = advertisingmetadata.getSignalingMode();
        if (customrangehelper.hasRanges() == "replace" || customrangehelper.hasRanges() == "mark")
        {
            obj = AdSignalingMode.CUSTOM_TIME_RANGES;
            advertisingmetadata.setSignalingMode(AdSignalingMode.CUSTOM_TIME_RANGES);
        }
_L5:
label0:
        {
            if (obj == AdSignalingMode.CUSTOM_TIME_RANGES && customrangehelper.hasRanges() != "replace")
            {
                MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.UNDEFINED_TIME_RANGES, "Ad signaling mode is CUSTOM TIME RANGES but there are no replace time ranges.");
                _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(warning));
            }
            AdSignalingMode adsignalingmode = ((AdSignalingMode) (obj));
            if (obj == AdSignalingMode.DEFAULT)
            {
                if (!mediaplayeritem.isLive())
                {
                    break label0;
                }
                adsignalingmode = AdSignalingMode.MANIFEST_CUES;
            }
            return adsignalingmode;
        }
        if (customrangehelper.hasRanges() == "replace" || customrangehelper.hasRanges() == "mark")
        {
            return AdSignalingMode.CUSTOM_TIME_RANGES;
        } else
        {
            return AdSignalingMode.SERVER_MAP;
        }
_L2:
        obj = adsignalingmode1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean extractEnableLivePreroll(MediaPlayerItem mediaplayeritem)
    {
        mediaplayeritem = mediaplayeritem.getResource().getMetadata();
        MetadataNode metadatanode = (MetadataNode)mediaplayeritem;
        if (mediaplayeritem != null && (mediaplayeritem instanceof MetadataNode))
        {
            mediaplayeritem = null;
            if (metadatanode.containsNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue()))
            {
                mediaplayeritem = (AdvertisingMetadata)metadatanode.getNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue());
            }
            if (metadatanode.containsKey(DefaultMetadataKeys.ADVERTISING_METADATA.getValue()))
            {
                mediaplayeritem = (AdvertisingMetadata)metadatanode.getNode(DefaultMetadataKeys.ADVERTISING_METADATA.getValue());
            }
            if (mediaplayeritem != null && mediaplayeritem.getEnableLivePreroll() != null)
            {
                return Boolean.valueOf(mediaplayeritem.getEnableLivePreroll()).booleanValue();
            }
        }
        return true;
    }

    private VideoEngineTimeline.TimeMapping getInitialTimeForLive()
    {
        return VideoEngineTimeline.TimeMapping.create(-1, _videoEngineAdapter.getCurrentTime());
    }

    private boolean isErrorRecoverable(MediaPlayerNotification.Error error)
    {
        if (error.getCode() != MediaPlayerNotification.ErrorCode.CONTENT_ERROR && error.getCode() != MediaPlayerNotification.ErrorCode.MANIFEST_ERROR) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (error.getCode() == MediaPlayerNotification.ErrorCode.SEEK_ERROR)
        {
            _videoEngineAdapter.play();
            return true;
        }
        MediaErrorCode mediaerrorcode;
        try
        {
            int i = Integer.parseInt(error.getMetadata().getValue("NATIVE_ERROR_CODE"));
            mediaerrorcode = MediaErrorCode.values()[i];
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayerNotification.Error error)
        {
            return false;
        }
        switch (_cls13..SwitchMap.com.adobe.ave.MediaErrorCode[mediaerrorcode.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            break;

        case 4: // '\004'
            error = error.getMetadata().getValue("DESCRIPTION");
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (error == null)
        {
            return false;
        }
        error = error.split(",");
        if (error.length == 0)
        {
            return false;
        }
        error = error[0].split("::=");
        if (error.length != 2)
        {
            return false;
        }
        if (!error[0].equals("url") && !error[0].equals("rendition url"))
        {
            return false;
        }
        if (!error[1].endsWith(".ts"))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void loadAdComponents(MediaPlayerItem mediaplayeritem)
    {
        _adTimeline = new AdTimeline(_videoEngineAdapter.getTimeline());
        _adTimelineMonitor = new TimelineMonitor(_videoEngineDispatcher, _adTimeline);
        _adSignalingMode = extractAdSignalingMode(mediaplayeritem);
        boolean flag;
        if (_adSignalingMode != AdSignalingMode.MANIFEST_CUES)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _cuesResolved = flag;
        if (_adClientFactory == null)
        {
            _adClientFactory = new DefaultAdvertisingFactory(_adSignalingMode, _context);
        }
        _mediaPlayerClient = new MediaPlayerClient(_videoEngineDispatcher, _item, _videoEngineAdapter, _adClientFactory, _adSignalingMode);
        _mediaPlayerClient.initialize(_initialTime, _adTimelineMonitor);
        _trickPlayManager = new TrickPlayManager(this, mediaplayeritem, _videoEngineAdapter, _adTimelineMonitor, _videoEngineDispatcher);
    }

    private void playerIsPrepared()
    {
        if (_isPrepared)
        {
            return;
        } else
        {
            _isPrepared = true;
            setStatus(MediaPlayer.PlayerState.PREPARED, null);
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.PREPARED));
            return;
        }
    }

    private void resetInternalComponents()
    {
        _shouldStopInternalTimer = true;
        stopInternalTimer();
        _item = null;
        _initialTime = VideoEngineTimeline.TimeMapping.createInvalid();
        _resource = null;
    }

    private void resolveCues()
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#resolveCues").toString(), "Entering in-stream cue resolving.");
        if (_item != null && _resource != null && _mediaPlayerClient != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("resolveCues").toString(), "Starting in-stream cue resolving.");
            _mediaPlayerClient.update(_playbackMetrics.getTime(), _playbackMetrics.getPlaybackRange());
            return;
        } else
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#resolveCues").toString(), "Unable to resolve cues.");
            endAdResolving();
            return;
        }
    }

    private void startInternalTimer()
    {
        if (!_internalTimerRunning)
        {
            _shouldStopInternalTimer = false;
            _internalTimerRunning = true;
            if (_handler != null)
            {
                _handler.postDelayed(_internalTimer, 250L);
                return;
            }
        }
    }

    private void stopInternalTimer()
    {
        _shouldStopInternalTimer = true;
        _internalTimerRunning = false;
        if (_handler != null)
        {
            _handler.removeCallbacks(_internalTimer);
        }
    }

    private void unloadAdComponents()
    {
        if (_adTimelineMonitor != null)
        {
            _adTimelineMonitor.clear();
        }
        if (_videoEngineAdapter != null && _videoEngineAdapter.getTimeline() != null)
        {
            _videoEngineAdapter.getTimeline().clear();
        }
        if (_mediaPlayerClient != null)
        {
            _mediaPlayerClient.unload();
        }
        _mediaPlayerClient = null;
        _adTimelineMonitor = null;
        _adTimeline = null;
    }

    private void updateVideoEngineAdapter()
    {
        checkAndThrowIfReleased();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateVideoEngineAdapter").toString(), "Releasing the media player associated resources.");
        unloadAdComponents();
        resetInternalComponents();
        if (_videoEngineAdapter != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#updateVideoEngineAdapter()").toString(), "Destroying the media player instance.");
            _videoEngineAdapter.release();
            _videoEngineAdapter = null;
        }
        setStatus(MediaPlayer.PlayerState.IDLE, null);
        _videoEngineAdapter = new VideoEngineAdapter(_context, _videoEngineDispatcher);
        _videoEngineAdapter.initialize();
        _videoEngineAdapter.setBackgroundMediaResource(_backgroundResource);
        _mediaPlayerView.updateVideoEngine(_context, _videoEngineAdapter);
        _videoEngineAdapter.setView(_mediaPlayerView.getVideoEngineView());
        _playbackMetrics = _videoEngineAdapter.getPlaybackMetrics();
    }

    public void addEventListener(MediaPlayer.Event event, MediaPlayer.EventListener eventlistener)
    {
        checkAndThrowIfReleased();
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.addEventListener(event, eventlistener);
        }
    }

    public long convertToLocalTime(long l)
        throws IllegalStateException
    {
label0:
        {
            checkAndThrowIfReleased();
            if (_videoEngineDispatcher != null)
            {
                l = _videoEngineAdapter.convertToLocalTime(l);
                if (l != -1L)
                {
                    break label0;
                }
            }
            return 0L;
        }
        return l;
    }

    void endAdResolving()
    {
        if (_currentStatus == MediaPlayer.PlayerState.ERROR)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#endAdResolving").toString(), "Ignore event as media player is in ERROR state.");
            return;
        }
        if (!_cuesResolved)
        {
            _cuesResolved = true;
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#endAdResolving").toString(), "Revisiting manifest cues.");
            resolveCues();
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#endAdResolving").toString(), "Ad resolving and placement process is complete.");
        if (_playbackMetrics != null)
        {
            _playbackMetrics.update();
        }
        playerIsPrepared();
    }

    public BufferControlParameters getBufferControlParameters()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        return _videoEngineAdapter.getBufferControlParameters();
    }

    public TimeRange getBufferedRange()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _playbackMetrics.getBufferedRange();
    }

    public TextFormat getCCStyle()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (_closedCaptionsTextFormat != null)
        {
            return _closedCaptionsTextFormat;
        } else
        {
            _closedCaptionsTextFormat = (new TextFormatBuilder(TextFormat.Font.DEFAULT, TextFormat.Size.DEFAULT, TextFormat.FontEdge.DEFAULT, TextFormat.Color.DEFAULT, TextFormat.Color.DEFAULT, TextFormat.Color.DEFAULT, TextFormat.Color.DEFAULT, -1, -1, -1, "default")).toTextFormat();
            return _closedCaptionsTextFormat;
        }
    }

    public MediaPlayer.Visibility getCCVisibility()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        return _videoEngineAdapter.getCaptionsVisibility();
    }

    public MediaPlayerItem getCurrentItem()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _item;
    }

    public long getCurrentTime()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        if (_videoEngineAdapter == null || !_videoEngineAdapter.isInitialised())
        {
            if (_initialTime.getTime() == -3L)
            {
                return 0L;
            } else
            {
                return _initialTime.getTime();
            }
        }
        long l = _playbackMetrics.getTime();
        if (_adTimelineMonitor.skippingAdBreaks())
        {
            int i;
            if (_trickPlayManager.getCurrentPlaybackRate() > 0.0F)
            {
                i = 1;
            } else
            {
                i = -1;
            }
            return (long)i * _adTimelineMonitor.skippedDuration() + l;
        } else
        {
            return l;
        }
    }

    public DRMManager getDRMManager()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _videoEngineAdapter.getDRMManager();
    }

    public long getLocalTime()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        if (_videoEngineAdapter == null || !_videoEngineAdapter.isInitialised())
        {
            return 0L;
        } else
        {
            return _playbackMetrics.getTimeLocal();
        }
    }

    public NotificationHistory getNotificationHistory()
    {
        if (_videoEngineDispatcher != null)
        {
            return _videoEngineDispatcher.getNotificationHistory();
        } else
        {
            return null;
        }
    }

    public PlaybackMetrics getPlaybackMetrics()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _playbackMetrics;
    }

    public TimeRange getPlaybackRange()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _playbackMetrics.getPlaybackRange();
    }

    public float getRate()
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        return _trickPlayManager.getCurrentPlaybackRate();
    }

    public TimeRange getSeekableRange()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _playbackMetrics.getSeekableRange();
    }

    public MediaPlayer.PlayerState getStatus()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _currentStatus;
    }

    public Timeline getTimeline()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        return _adTimeline;
    }

    public MediaPlayerView getView()
    {
        checkAndThrowIfReleased();
        return _mediaPlayerView;
    }

    public void pause()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (_trickPlayManager == null) goto _L2; else goto _L1
_L1:
        if (!_trickPlayManager.trickPlayEnabled()) goto _L4; else goto _L3
_L3:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#pause").toString(), "MediaPlayer.pause() is called during trick-play - changing rate to 0.0 ");
        _trickPlayManager.changePlaybackRate(0.0F);
_L6:
        return;
_L4:
        _trickPlayManager.updatePlaybackRate(0.0F);
_L2:
        HashSet hashset = new HashSet();
        hashset.add(MediaPlayer.PlayerState.PREPARED);
        hashset.add(MediaPlayer.PlayerState.READY);
        hashset.add(MediaPlayer.PlayerState.PLAYING);
        hashset.add(MediaPlayer.PlayerState.PAUSED);
        hashset.add(MediaPlayer.PlayerState.COMPLETE);
        hashset.add(MediaPlayer.PlayerState.SUSPENDED);
        MediaPlayer.PlayerState playerstate = getStatus();
        if (!hashset.contains(playerstate))
        {
            throw new IllegalStateException((new StringBuilder()).append("Invalid player status [ ").append(playerstate.toString()).append("] for operation [play].").toString());
        }
        if (playerstate == MediaPlayer.PlayerState.PAUSED)
        {
            if (_trickPlayManager.isReturningFromTrickPlay())
            {
                _videoEngineAdapter.pause();
                return;
            } else
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#pause").toString(), "Playback already paused.");
                return;
            }
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#play").toString(), "Playback pausing.");
        _videoEngineAdapter.pause();
        setStatus(MediaPlayer.PlayerState.PAUSED, null);
        if (_videoEngineAdapter.isBufferFull())
        {
            stopInternalTimer();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void play()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (_trickPlayManager != null)
        {
            if (_trickPlayManager.trickPlayEnabled())
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#play").toString(), "MediaPlayer.play() is called during trick-play - changing rate to 1.0");
                _trickPlayManager.changePlaybackRate(1.0F);
                return;
            }
            _trickPlayManager.updatePlaybackRate(1.0F);
        }
        HashSet hashset = new HashSet();
        hashset.add(MediaPlayer.PlayerState.PREPARED);
        hashset.add(MediaPlayer.PlayerState.READY);
        hashset.add(MediaPlayer.PlayerState.PLAYING);
        hashset.add(MediaPlayer.PlayerState.PAUSED);
        hashset.add(MediaPlayer.PlayerState.SUSPENDED);
        MediaPlayer.PlayerState playerstate = getStatus();
        if (!hashset.contains(playerstate) && (_trickPlayManager == null || !_trickPlayManager.isReturningFromTrickPlay()))
        {
            throw new IllegalStateException((new StringBuilder()).append("Invalid player status [ ").append(playerstate.toString()).append("] for operation [play].").toString());
        }
        if (playerstate == MediaPlayer.PlayerState.PLAYING)
        {
            if (_videoEngineAdapter.getPlayerState() == PlayState.SUSPENDED || _trickPlayManager.isReturningFromTrickPlay() || _videoEngineAdapter.getPlayerState() == PlayState.TRICK_PLAY)
            {
                _videoEngineAdapter.play();
                return;
            } else
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#play").toString(), "Playback already in progress.");
                return;
            }
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#play").toString(), "Playback starting.");
        _videoEngineAdapter.play();
        if (_seekNeeded)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#play").toString(), (new StringBuilder()).append("Performing initial seek at position [").append(_initialTime.toString()).append("].").toString());
            _seekNeeded = false;
            seek(_initialTime.getTime());
        }
        setStatus(MediaPlayer.PlayerState.PLAYING, null);
    }

    public void prepareBuffer()
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        MediaPlayer.PlayerState playerstate = getStatus();
        if (playerstate == MediaPlayer.PlayerState.PREPARED)
        {
            if (_seekNeeded)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#play").toString(), (new StringBuilder()).append("Performing initial seek at position [").append(_initialTime.toString()).append("].").toString());
                _seekNeeded = false;
                _videoEngineAdapter.seek(_initialTime, true);
            }
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#prepareBuffer").toString(), "Prepare buffer.");
            _videoEngineAdapter.prepareBuffer();
            return;
        } else
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#prepareBuffer").toString(), (new StringBuilder()).append("Invalid player status [").append(playerstate.toString()).append("] for operation [prepareBuffer].").toString());
            return;
        }
    }

    public void prepareToPlay()
        throws IllegalStateException
    {
        prepareToPlay(-2L);
    }

    public void prepareToPlay(long l)
        throws IllegalStateException
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        obj = getStatus();
        if (obj != MediaPlayer.PlayerState.PREPARING) goto _L2; else goto _L1
_L1:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#prepareToPlay").toString(), "Initialization is already in progress, we will ignore any additional requests until completion.");
_L4:
        return;
_L2:
        if (_resource == null)
        {
            throw new IllegalStateException("Invalid current playback item (the item must not be null).Before calling prepareToPlay(), indicate the playback item through replaceCurrentItem() method.");
        }
        if (obj == MediaPlayer.PlayerState.INITIALIZING && !_preparePending)
        {
            _startPosition = l;
            _preparePending = true;
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#prepareToPlay").toString(), "Resource loading is already in progress. This operation will be called automatically after the loading has completed");
            return;
        }
        if (obj != MediaPlayer.PlayerState.INITIALIZED)
        {
            throw new IllegalStateException("Invalid player state. prepareToPlay method must be called only once after replaceCurrentItem method.");
        }
        setStatus(MediaPlayer.PlayerState.PREPARING, null);
        if (_item == null)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#prepareToPlay").toString(), (new StringBuilder()).append("MediaPlayerItem is null. Unable to proceed with preparing resource: [").append(_resource).append("].").toString());
            return;
        }
        _initialTime = adjustDesiredStartPosition(l);
        boolean flag = flag1;
        if (!_item.isLive())
        {
            if (_playbackMetrics != null && _playbackMetrics.getSeekableRange() != null && _initialTime.getTime() != _playbackMetrics.getSeekableRange().getBegin())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        _seekNeeded = flag;
        loadAdComponents(_item);
        obj = createInitialPlacementInformations(_item, _adSignalingMode, _initialTime);
        if (((List) (obj)).isEmpty() || getCurrentItem().isLive() && !extractEnableLivePreroll(_item))
        {
            endAdResolving();
            return;
        }
        if (obj != null)
        {
            _mediaPlayerClient.registerPlacement(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                PlacementInformation placementinformation = (PlacementInformation)((Iterator) (obj)).next();
                _mediaPlayerClient.beginResolveAds(placementinformation);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void registerAdClientFactory(AdClientFactory adclientfactory)
    {
        if (adclientfactory == null)
        {
            throw new IllegalArgumentException("adClientFactory parameter can not be null. If you  need to reset the advertising factory to the default one, then provide a new DefaultAdvertisingFactory instance.");
        } else
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#registerAdvertisingFactory").toString(), "Registering custom ad client factory.");
            _adClientFactory = adclientfactory;
            return;
        }
    }

    public void registerCurrentItemAsBackgroundItem()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _logger.d((new StringBuilder()).append(LOG_TAG).append("#registerCurrentItemAsBackgroundItem").toString(), "Register current item as background item.");
        if (_item != null)
        {
            _backgroundResource = _resource;
            _backgroundItem = _item;
            _logger.d((new StringBuilder()).append(LOG_TAG).append("#registerCurrentItemAsBackgroundItem").toString(), (new StringBuilder()).append("Background rsource url: ").append(_resource.getUrl()).toString());
        }
    }

    public void release()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#release").toString(), "Releasing the media player associated resources.");
        unloadAdComponents();
        resetInternalComponents();
        _internalTimer = null;
        _handler = null;
        if (_videoEngineAdapter != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#release()").toString(), "Destroying the media player instance.");
            _videoEngineAdapter.release();
        }
        if (_mediaPlayerView != null)
        {
            _mediaPlayerView.detachView();
            _mediaPlayerView = null;
        }
        setStatus(MediaPlayer.PlayerState.RELEASED, null);
    }

    public void removeEventListener(MediaPlayer.Event event, MediaPlayer.EventListener eventlistener)
    {
        checkAndThrowIfReleased();
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.removeEventListener(event, eventlistener);
        }
    }

    public void replaceCurrentItem(MediaResource mediaresource)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (_resource != mediaresource)
        {
            if (getStatus() != MediaPlayer.PlayerState.IDLE)
            {
                updateVideoEngineAdapter();
            }
            _resource = mediaresource;
            setStatus(MediaPlayer.PlayerState.INITIALIZING, null);
            beginLoadResource();
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ITEM_REPLACED));
            return;
        } else
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#replaceCurrentItem").toString(), "Ignoring command as the same media resource is provided. If you want to force the reloading of the same media resource, call method reset first.");
            return;
        }
    }

    public void reset()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#reset").toString(), "Reseting the media player associated resources.");
        unloadAdComponents();
        resetInternalComponents();
        if (_videoEngineAdapter != null)
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#reset()").toString(), "Reseting the media player instance");
            _videoEngineAdapter.reset();
            _mediaPlayerView.resetView();
        }
        setStatus(MediaPlayer.PlayerState.IDLE, null);
    }

    public void seek(long l)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (_trickPlayManager != null && _trickPlayManager.trickPlayEnabled())
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#seek").toString(), "MediaPlayer.seek() is not allowed during trick-play.");
            return;
        }
        HashSet hashset = new HashSet();
        hashset.add(MediaPlayer.PlayerState.PREPARED);
        hashset.add(MediaPlayer.PlayerState.READY);
        hashset.add(MediaPlayer.PlayerState.PLAYING);
        hashset.add(MediaPlayer.PlayerState.PAUSED);
        hashset.add(MediaPlayer.PlayerState.COMPLETE);
        hashset.add(MediaPlayer.PlayerState.SUSPENDED);
        MediaPlayer.PlayerState playerstate = getStatus();
        if (!hashset.contains(playerstate))
        {
            throw new IllegalStateException((new StringBuilder()).append("Invalid player status [ ").append(playerstate.toString()).append("] for operation [play].").toString());
        } else
        {
            adjustDesiredSeekPosition(l);
            return;
        }
    }

    public void seekToLocalTime(long l)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        if (_videoEngineAdapter != null)
        {
            seek(_videoEngineAdapter.getVirtualTimeForLocalTime(l));
        }
    }

    public void setABRControlParameters(ABRControlParameters abrcontrolparameters)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#setABRControlParameters").toString(), (new StringBuilder()).append("Setting ABR control params: ").append(abrcontrolparameters.toString()).toString());
        _videoEngineAdapter.setABRControlParameters(abrcontrolparameters);
    }

    public void setBufferControlParameters(BufferControlParameters buffercontrolparameters)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (buffercontrolparameters == null)
        {
            throw new IllegalArgumentException("BufferControlParameters parameter must not be null.");
        } else
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#setBufferControlParameters").toString(), (new StringBuilder()).append("Setting buffer control params: ").append(buffercontrolparameters.toString()).toString());
            _videoEngineAdapter.setBufferControlParameters(buffercontrolparameters);
            return;
        }
    }

    public void setCCStyle(TextFormat textformat)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _closedCaptionsTextFormat = textformat;
        _videoEngineAdapter.setCaptionsControlParameters(textformat);
    }

    public void setCCVisibility(MediaPlayer.Visibility visibility)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _videoEngineAdapter.setCaptionsVisibility(visibility);
    }

    public void setCustomConfiguration(String s)
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#setCustomConfiguration").toString(), (new StringBuilder()).append("Setting custom configuration: ").append(s).toString());
        _videoEngineAdapter.setCustomConfiguration(s);
    }

    public void setRate(float f)
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#setRate").toString(), (new StringBuilder()).append("Setting playback rate: ").append(f).toString());
        _trickPlayManager.changePlaybackRate(f);
    }

    protected void setStatus(MediaPlayer.PlayerState playerstate, MediaPlayerNotification.Error error)
    {
        this;
        JVM INSTR monitorenter ;
        checkAndThrowIfReleased();
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#setStatus").toString(), (new StringBuilder()).append("Set player state to: ").append(playerstate.toString()).append(".").toString());
        _currentStatus = playerstate;
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(StateChangedEvent.createChangedEvent(_currentStatus, error));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        playerstate;
        throw playerstate;
    }

    public void setVolume(int i)
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        _videoEngineAdapter.setVolume(i);
    }

    public boolean shouldTriggerSubscribedTagEvent()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        if (_videoEngineAdapter != null)
        {
            return _videoEngineAdapter.shouldTriggerSubscribedTagEvent(getCurrentTime());
        } else
        {
            return true;
        }
    }

    public void unregisterCurrentBackgroundItem()
        throws IllegalStateException
    {
        checkAndThrowIfReleased();
        checkAndThrowIfError();
        if (_backgroundResource != null)
        {
            _backgroundResource = null;
        }
        if (_backgroundItem != null)
        {
            _backgroundItem = null;
        }
    }





















/*
    static MediaPlayerItem access$302(DefaultMediaPlayer defaultmediaplayer, MediaPlayerItem mediaplayeritem)
    {
        defaultmediaplayer._item = mediaplayeritem;
        return mediaplayeritem;
    }

*/






}
