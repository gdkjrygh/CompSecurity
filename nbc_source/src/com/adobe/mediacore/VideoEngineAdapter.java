// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.Context;
import com.adobe.ave.ABRParameters;
import com.adobe.ave.ContainerType;
import com.adobe.ave.DataType;
import com.adobe.ave.Dictionary;
import com.adobe.ave.ListenerType;
import com.adobe.ave.MediaErrorCode;
import com.adobe.ave.NetworkingParameters;
import com.adobe.ave.PeriodInfo;
import com.adobe.ave.PlayState;
import com.adobe.ave.StreamMetadata;
import com.adobe.ave.SwitchInfo;
import com.adobe.ave.Timeline;
import com.adobe.ave.UpdateType;
import com.adobe.ave.VideoEngine;
import com.adobe.ave.VideoEngineException;
import com.adobe.ave.VideoEngineListener;
import com.adobe.ave.VideoEngineView;
import com.adobe.ave.drm.DRMError;
import com.adobe.ave.drm.DRMManager;
import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.qos.LoadInfo;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.system.NetworkConfiguration;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdBreakPlacement;
import com.adobe.mediacore.utils.NumberUtils;
import com.adobe.mediacore.utils.StringUtils;
import com.adobe.mediacore.utils.TimeRange;
import java.io.File;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.adobe.mediacore:
//            DRMMetadataCache, BufferControlParameters, MediaPlayerEvent, VideoEngineDispatcher, 
//            MediaPlayerNotification, ErrorEvent, MediaResource, VideoEngineItem, 
//            AudioTrackEvent, VideoEngineTimeline, VideoEngineTimelineProxy, TrickPlayOperation, 
//            OperationFailedEvent, LoadOperation, PlayerOperation, PSDKConfig, 
//            PlayOperation, PauseOperation, ResetOperation, SeekOperation, 
//            SeekEvent, ABRControlParameters, TextFormat, BackgroundVideoEngineItem, 
//            BlackoutEvent, DRMMetadataInfo, DRMMetadataEvent, ContentMarkerEvent, 
//            TimedMetadataAddedEvent, LoadInfoEvent, AdManifestLoadEvent, MediaPlayerState, 
//            VideoStateChangedEvent, ContentChangedEvent, VideoSizeChangedEvent, ProfileChangedEvent

final class VideoEngineAdapter
{
    protected class VideoEnginePlaybackMetrics extends PlaybackMetrics
    {

        private static final int DEFAULT_TARGET_DURATION = 10000;
        private static final long READ_HEAD_DELTA = 0L;
        private long _clientLivePoint;
        private boolean _dispatchedBufferFull;
        private long _readHead;
        private long _savedBufferLength;
        final VideoEngineAdapter this$0;

        private void checkAndDispatchBufferFullEvent()
        {
            if (_dispatchedBufferFull && !hasAllDataBuffered() && _bufferLength <= _desiredBufferControlParameters.getPlayBufferTime() && _savedBufferLength != _bufferLength)
            {
                _dispatchedBufferFull = false;
            }
            if (!_dispatchedBufferFull)
            {
                _dispatchedBufferFull = false;
                _savedBufferLength = _bufferLength;
                if (isBufferFull())
                {
                    _dispatchedBufferFull = true;
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.BUFFERING_FULL));
                        return;
                    }
                }
            }
        }

        protected void doUpdate()
        {
            Object obj;
            try
            {
                if (_videoEngine == null)
                {
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#doUpdate").toString(), "Unable to update metrics.", ((Exception) (obj)));
                Object obj1 = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.GET_QOS_DATA_ERROR, "An error has occurred while attempting to retrieve the QOS information.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("DESCRIPTION", ((VideoEngineException) (obj)).getErrorCode().name());
                ((MediaPlayerNotification.Error) (obj1)).setMetadata(metadatanode);
                long l3;
                long l6;
                if (_videoEngineDispatcher != null)
                {
                    _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(((MediaPlayerNotification.Error) (obj1))));
                    return;
                } else
                {
                    return;
                }
            }
            if (!_isSeeking || _desiredSeekPositon == null || _desiredSeekPositon.getTime() == -3L) goto _L2; else goto _L1
_L1:
            if (_desiredSeekPositon.getPeriod() != -1) goto _L4; else goto _L3
_L3:
            _time = _desiredSeekPositon.getTime();
_L9:
            _timeLocal = getLocalTime();
            _bufferLength = _videoEngine.getBufferLength();
            _readHead = _time + _bufferLength + 0L;
            _bufferTime = _desiredBufferControlParameters.getPlayBufferTime();
            obj = _videoEngine.getTimeline();
            if (obj == null) goto _L6; else goto _L5
_L5:
            long l = Math.min(_time, ((Timeline) (obj)).virtualStartTime);
            _playbackRange = TimeRange.createRange(l, (((Timeline) (obj)).virtualStartTime - l) + ((Timeline) (obj)).virtualDuration);
            if (((Timeline) (obj)).complete != 0) goto _L8; else goto _L7
_L7:
            _clientLivePoint = _videoEngine.getClientLivePoint();
            if (_clientLivePoint >= ((Timeline) (obj)).virtualDuration + ((Timeline) (obj)).virtualStartTime)
            {
                VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#DEBUG").toString(), (new StringBuilder()).append("Client live point = ").append(_clientLivePoint).append(" virtual start time = ").append(((Timeline) (obj)).virtualStartTime).append(" virtual end time  = ").append(((Timeline) (obj)).virtualStartTime + ((Timeline) (obj)).virtualDuration).toString());
            }
            long l1 = _clientLivePoint;
            long l4 = ((Timeline) (obj)).virtualStartTime;
            _seekableRange = TimeRange.createRange(((Timeline) (obj)).virtualStartTime, l1 - l4);
_L10:
            long l2 = _videoEngine.getTime();
            long l5 = _bufferLength;
            long l7 = ((Timeline) (obj)).virtualStartTime;
            _bufferedRange = TimeRange.createRange(l2, Math.min(l5, (((Timeline) (obj)).virtualDuration + l7) - _videoEngine.getTime()));
_L6:
            _frameRate = _videoEngine.getQosFrameRate();
            _droppedFramesCount = _videoEngine.getQosDroppedFrameCount();
            _bitrate = _lastKnownProfile;
            checkAndDispatchBufferFullEvent();
            return;
_L4:
            _time = extractVirtualTime();
              goto _L9
_L2:
            _time = _videoEngine.getTime();
              goto _L9
_L8:
            l6 = ((Timeline) (obj)).virtualDuration;
            obj1 = ((Timeline) (obj)).getPeriodInfo(((Timeline) (obj)).lastPeriodIndex);
            l3 = l6;
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_615;
            }
            l3 = l6;
            if (((Timeline) (obj)).virtualStartTime + l6 > ((PeriodInfo) (obj1)).virtualStartTime + ((PeriodInfo) (obj1)).duration)
            {
                l3 = (((PeriodInfo) (obj1)).virtualStartTime + ((PeriodInfo) (obj1)).duration) - ((Timeline) (obj)).virtualStartTime;
            }
            _seekableRange = TimeRange.createRange(((Timeline) (obj)).virtualStartTime, l3);
              goto _L10
        }

        public long getReadHead()
        {
            return _readHead;
        }

        protected VideoEnginePlaybackMetrics()
        {
            this$0 = VideoEngineAdapter.this;
            super();
        }
    }


    private static final String AUDIO = "AUDIO";
    private static final String DICTIONARY_TYPE = "_dictionaryType";
    private static final String ID3 = "ID3";
    private static final long INITIAL_BUFFER_TIME = 2000L;
    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/VideoEngineAdapter.getSimpleName()).toString();
    private static final long PLAY_BUFFER_TIME = 30000L;
    private static final int UNKNOWN_CONTENT_ID = -1;
    private static final int UNKNOWN_PERIOD_INDEX = -1;
    private static final Logger _logger = Log.getLogger(LOG_TAG);
    private List _adTags;
    private boolean _alreadyReleased;
    private MediaResource _backgroundMediaResource;
    private BackgroundVideoEngineItem _backgroundVideoEngineItem;
    private int _contentId;
    private Context _context;
    private ABRControlParameters _desiredABRControlParameters;
    private BufferControlParameters _desiredBufferControlParameters;
    private TextFormat _desiredCaptionsControlParameters;
    private MediaPlayer.Visibility _desiredCaptionsVisibility;
    private VideoEngineTimeline.TimeMapping _desiredSeekPositon;
    private int _desiredVolume;
    private DRMManager _drmManager;
    private DRMMetadataCache _drmMetadataCache;
    private boolean _hasSurface;
    private boolean _isBuffering;
    private boolean _isInitialised;
    private boolean _isProtected;
    private boolean _isSeeking;
    private boolean _isTempBuffer;
    private int _lastKnownContentId;
    private long _lastKnownProfile;
    private long _lastKnownTime;
    private MediaResource _mediaResource;
    private final List _pendingOperations = new CopyOnWriteArrayList();
    private PlayState _playerState;
    private VideoEngineTimelineProxy _timelineProxy;
    private VideoEngine _videoEngine;
    private VideoEngineDispatcher _videoEngineDispatcher;
    private VideoEngineItem _videoEngineItem;
    private VideoEngineListener _videoEngineListener;
    private VideoEnginePlaybackMetrics _videoEnginePlaybackMetrics;
    private VideoEngineTimeline _videoEngineTimeline;

    public VideoEngineAdapter(Context context, VideoEngineDispatcher videoenginedispatcher)
    {
        _backgroundMediaResource = null;
        _desiredBufferControlParameters = getDefaultBufferingParameters();
        _isTempBuffer = false;
        _hasSurface = false;
        if (context == null)
        {
            throw new IllegalArgumentException("Video engine context parameter must not be null.");
        }
        if (videoenginedispatcher == null)
        {
            throw new IllegalArgumentException("Video engine dispatcher parameter must not be null.");
        } else
        {
            _context = context;
            _videoEngineDispatcher = videoenginedispatcher;
            _drmMetadataCache = new DRMMetadataCache();
            resetState();
            return;
        }
    }

    private long calculateVirtualTime(VideoEngineTimeline.TimeMapping timemapping)
    {
        long l1 = timemapping.getTime();
        Object obj;
        long l;
        long l2;
        long l3;
        try
        {
            obj = _videoEngine.getTimeline();
        }
        // Misplaced declaration of an exception variable
        catch (VideoEngineTimeline.TimeMapping timemapping)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#calculateVirtualTime").toString(), (new StringBuilder()).append("Exception raised while accessing the timeline { code = ").append(timemapping.getErrorCode()).append(", description = ").append(timemapping.getDetailMessage()).append(" }").toString());
            return l1;
        }
        l = l1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = ((Timeline) (obj)).getPeriodInfo(timemapping.getPeriod());
        l = l1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        l = timemapping.getTime();
        l2 = ((PeriodInfo) (obj)).localStartTime;
        l3 = ((PeriodInfo) (obj)).virtualStartTime;
        l = l3 + (l - l2);
        return l;
    }

    private void checkAndDispatchBufferingComplete()
    {
        if (_isBuffering && !_isSeeking)
        {
            _isBuffering = false;
            if (_isTempBuffer)
            {
                setBufferTime(_desiredBufferControlParameters.getPlayBufferTime());
                _isTempBuffer = false;
            }
            if (_videoEngineDispatcher != null)
            {
                _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.BUFFERING_COMPLETED));
                return;
            }
        }
    }

    private String convertOpacity(int i)
    {
        if (i == -1)
        {
            return "default";
        } else
        {
            return String.valueOf(i);
        }
    }

    private ContainerType convertType(MediaResource.Type type)
    {
        if (type == MediaResource.Type.HDS)
        {
            return ContainerType.F4M;
        }
        if (type == MediaResource.Type.HLS)
        {
            return ContainerType.HLS;
        } else
        {
            return ContainerType.UNDEFINED;
        }
    }

    private VideoEngineListener createEngineListener()
    {
        return new VideoEngineListener() {

            final VideoEngineAdapter this$0;

            private long getTimestamp(long l)
            {
                _videoEnginePlaybackMetrics.update();
                long l1 = _videoEnginePlaybackMetrics.getTime();
                l /= 0xf4240L;
                if (Math.abs(l - l1) >= 1000L)
                {
                    return l1;
                } else
                {
                    return l;
                }
            }

            public void onBackgroundManifestError(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
            {
                if (videoengine == _videoEngine)
                {
                    VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onBackgroundManifestError").toString(), (new StringBuilder()).append("[Error] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
                    videoengine = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.BACKGROUND_MANIFEST_WARNING, "Native error received in background manifest.");
                    MetadataNode metadatanode = new MetadataNode();
                    metadatanode.setValue("BACKGROUND_MANIFEST_WARNING_CODE", (new StringBuilder()).append(mediaerrorcode.getValue()).append("").toString());
                    metadatanode.setValue("BACKGROUND_MANIFEST_WARNING_NAME", mediaerrorcode.name());
                    metadatanode.setValue("DESCRIPTION", s);
                    videoengine.setMetadata(metadatanode);
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(videoengine));
                        return;
                    }
                }
            }

            public void onBackgroundManifestWarning(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
            {
                if (videoengine == _videoEngine)
                {
                    videoengine = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.BACKGROUND_MANIFEST_WARNING, "Native warning received in background manifest.");
                    MetadataNode metadatanode = new MetadataNode();
                    metadatanode.setValue("BACKGROUND_MANIFEST_WARNING_CODE", (new StringBuilder()).append(mediaerrorcode.getValue()).append("").toString());
                    metadatanode.setValue("BACKGROUND_MANIFEST_WARNING_NAME", mediaerrorcode.name());
                    metadatanode.setValue("DESCRIPTION", s);
                    videoengine.setMetadata(metadatanode);
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(videoengine));
                        if (mediaerrorcode == MediaErrorCode.CANNOT_LOAD_PLAYLIST)
                        {
                            _videoEngineDispatcher.dispatch(BlackoutEvent.createBlackoutEvent());
                            return;
                        }
                    }
                }
            }

            public void onDRMError(VideoEngine videoengine, DRMError drmerror)
            {
                if (videoengine == _videoEngine)
                {
                    videoengine = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.NATIVE_ERROR, "Native error received.");
                    MetadataNode metadatanode = new MetadataNode();
                    metadatanode.setValue("NATIVE_ERROR_CODE", (new StringBuilder()).append(drmerror.getMajorError()).append("").toString());
                    metadatanode.setValue("DESCRIPTION", "");
                    metadatanode.setValue("NATIVE_SUBERROR_CODE", (new StringBuilder()).append(drmerror.getMinorError()).append("").toString());
                    metadatanode.setValue("DRM_ERROR_STRING", drmerror.getServerErrorString());
                    videoengine.setMetadata(metadatanode);
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(videoengine));
                        return;
                    }
                }
            }

            public void onDRMMetadata(VideoEngine videoengine, byte abyte0[], int i, long l)
            {
                if (videoengine == _videoEngine)
                {
                    _isProtected = true;
                    VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onDRMMetadata").toString(), (new StringBuilder()).append("DRM metadata event received for time [").append(l).append("]").toString());
                    boolean flag1 = false;
                    boolean flag = flag1;
                    if (_videoEnginePlaybackMetrics != null)
                    {
                        flag = flag1;
                        if (_videoEnginePlaybackMetrics.getPlaybackRange() != null)
                        {
                            flag = _videoEnginePlaybackMetrics.getPlaybackRange().contains(l);
                        }
                    }
                    videoengine = DRMMetadataInfo.createDRMMetadataInfo(getDRMManager(), abyte0, i, l, flag);
                    if (videoengine == null)
                    {
                        VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onDRMMetadata").toString(), "Unable to convert bytes to DRMMetadataInfo.");
                        return;
                    }
                    flag = _drmMetadataCache.addDRMMetadata(videoengine);
                    if (_videoEngineDispatcher != null && flag)
                    {
                        _videoEngineDispatcher.dispatch(DRMMetadataEvent.createDRMMetadataEvent(videoengine));
                        return;
                    }
                }
            }

            public void onData(VideoEngine videoengine, long l, DataType datatype, byte abyte0[], int i)
            {
                if (videoengine == _videoEngine)
                {
                    l = getTimestamp(l);
                    videoengine = MetadataNode.fromByteArray(abyte0);
                    if (videoengine == null)
                    {
                        VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onData").toString(), "Unable to deserialize data.");
                        return;
                    }
                    VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onData").toString(), (new StringBuilder()).append("Data event received at time [").append(l).append("] ").append(videoengine).toString());
                    if (videoengine.containsKey(DefaultMetadataKeys.MARKER_KEY.getValue()))
                    {
                        try
                        {
                            i = Integer.parseInt(videoengine.getValue(DefaultMetadataKeys.MARKER_CONTENT_ID_KEY.getValue()));
                            if (_videoEngineDispatcher != null)
                            {
                                _videoEngineDispatcher.dispatch(ContentMarkerEvent.createContentMarkerEvent(i, l));
                                return;
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (VideoEngine videoengine)
                        {
                            VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onData").toString(), "Unable to parse content id.");
                            return;
                        }
                    }
                }
            }

            public void onDictionaryData(VideoEngine videoengine, Dictionary dictionary, long l)
            {
                if (videoengine == _videoEngine) goto _L2; else goto _L1
_L1:
                return;
_L2:
                VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onDictionaryData").toString(), "Dictionary data event received");
                if (dictionary == null)
                {
                    VideoEngineAdapter._logger.w((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onDictionaryData").toString(), "Dictionary received is null");
                    return;
                }
                if (!isID3Dictionary(dictionary)) goto _L1; else goto _L3
_L3:
                String s;
                String s1;
                byte abyte0[];
                int i;
                int j;
                try
                {
                    j = dictionary.getCount();
                    videoengine = new MetadataNode();
                }
                // Misplaced declaration of an exception variable
                catch (VideoEngine videoengine)
                {
                    VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onDictionaryData").toString(), "Video engine exception raised while accesing the dictionary", videoengine);
                    return;
                }
                for (i = 0; i >= j; i++)
                {
                    continue; /* Loop/switch isn't completed */
                }

                s = dictionary.getKeyByIndex(i);
                if (StringUtils.isEmpty(s) || s.equals("_dictionaryType"))
                {
                    break MISSING_BLOCK_LABEL_263;
                }
                s1 = dictionary.getValueByKey(s);
                if (!StringUtils.isEmpty(s1))
                {
                    videoengine.setValue(s, s1);
                }
                abyte0 = dictionary.getByteArrayByKey(s);
                if (abyte0.length > 0)
                {
                    videoengine.setByteArray(s, abyte0);
                }
                break MISSING_BLOCK_LABEL_263;
                if (_videoEngineDispatcher == null) goto _L1; else goto _L4
_L4:
                _videoEngineDispatcher.dispatch(TimedMetadataAddedEvent.createAddedID3Event(videoengine, l));
                return;
            }

            public void onError(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
            {
_L2:
                return;
                if (videoengine != _videoEngine || mediaerrorcode.getValue() > MediaErrorCode.AAXS_InvalidVoucher.getValue()) goto _L2; else goto _L1
_L1:
                VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onError").toString(), (new StringBuilder()).append("[Error] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
                videoengine = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.NATIVE_ERROR, "Native error received.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("NATIVE_ERROR_CODE", (new StringBuilder()).append(mediaerrorcode.getValue()).append("").toString());
                metadatanode.setValue("NATIVE_ERROR_NAME", mediaerrorcode.name());
                metadatanode.setValue("DESCRIPTION", s);
                videoengine.setMetadata(metadatanode);
                mediaerrorcode = VideoEngineAdapter.createLoadInformationFrom(s);
                if (mediaerrorcode == null || mediaerrorcode.getType() != com.adobe.mediacore.qos.LoadInfo.Type.MANIFEST)
                {
                    continue; /* Loop/switch isn't completed */
                }
                videoengine.setInnerNotification(getFileLoadErrorNotification(mediaerrorcode));
_L5:
                if (_videoEngineDispatcher == null) goto _L2; else goto _L3
_L3:
                _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(videoengine));
                return;
                if (handleAudioTrackError(mediaerrorcode)) goto _L2; else goto _L4
_L4:
                if (mediaerrorcode != null)
                {
                    VideoEngineAdapter._logger.e((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onError").toString(), "Unexpected event. Fragment error received as error instead of warning.");
                }
                  goto _L5
            }

            public void onLoadInfo(VideoEngine videoengine, String s)
            {
                if (videoengine == _videoEngine)
                {
                    VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onLoadInfo").toString(), (new StringBuilder()).append("Description: ").append(s).toString());
                    videoengine = VideoEngineAdapter.createLoadInformationFrom(s);
                    if (_videoEngineDispatcher != null && videoengine != null && videoengine.getType() == com.adobe.mediacore.qos.LoadInfo.Type.FRAGMENT)
                    {
                        _videoEngineDispatcher.dispatch(LoadInfoEvent.createLoadInfoEvent(videoengine));
                        return;
                    }
                }
            }

            public void onManifestLoad(VideoEngine videoengine, MediaErrorCode mediaerrorcode, int i, int j, long l)
            {
                if (videoengine == _videoEngine)
                {
                    VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onManifestLoad").toString(), (new StringBuilder()).append("Manifest load event received with code ").append(mediaerrorcode.toString()).append(" for content ").append(i).toString());
                    if (_videoEngineDispatcher != null)
                    {
                        if (mediaerrorcode == MediaErrorCode.SUCCESS)
                        {
                            _videoEngineDispatcher.dispatch(AdManifestLoadEvent.createAdManifestLoadCompletedEvent(i, j, l));
                            return;
                        } else
                        {
                            _videoEngineDispatcher.dispatch(AdManifestLoadEvent.createAdManifestLoadFailedEvent(i));
                            return;
                        }
                    }
                }
            }

            public void onPlayState(VideoEngine videoengine, PlayState playstate)
            {
                if (videoengine == _videoEngine) goto _L2; else goto _L1
_L1:
                return;
_L2:
                VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onPlayState").toString(), (new StringBuilder()).append("PlayState event: ").append(playstate).toString());
                _playerState = playstate;
                if (_videoEngineDispatcher == null) goto _L1; else goto _L3
_L3:
                static class _cls2
                {

                    static final int $SwitchMap$com$adobe$ave$PlayState[];
                    static final int $SwitchMap$com$adobe$ave$UpdateType[];
                    static final int $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[];
                    static final int $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy = new int[ABRControlParameters.ABRPolicy.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[ABRControlParameters.ABRPolicy.ABR_AGGRESSIVE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror15) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[ABRControlParameters.ABRPolicy.ABR_MODERATE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror14) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$ABRControlParameters$ABRPolicy[ABRControlParameters.ABRPolicy.ABR_CONSERVATIVE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror13) { }
                        $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type = new int[com.adobe.mediacore.qos.LoadInfo.Type.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type[com.adobe.mediacore.qos.LoadInfo.Type.MANIFEST.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror12) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$qos$LoadInfo$Type[com.adobe.mediacore.qos.LoadInfo.Type.FRAGMENT.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror11) { }
                        $SwitchMap$com$adobe$ave$UpdateType = new int[UpdateType.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.INITIAL.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror10) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.LIVE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror9) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.CAPTION_ACTIVITY.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$UpdateType[UpdateType.BACKGROUND.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        $SwitchMap$com$adobe$ave$PlayState = new int[PlayState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.READY.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.EOF.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.BUFFERING.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.BUFFERFULL.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.PLAYING.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.PAUSED.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$ave$PlayState[PlayState.SUSPENDED.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls2..SwitchMap.com.adobe.ave.PlayState[playstate.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    _videoEnginePlaybackMetrics.update();
                    _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ITEM_READY));
                    return;

                case 2: // '\002'
                    _videoEnginePlaybackMetrics.update();
                    _videoEngineDispatcher.dispatch(VideoStateChangedEvent.createChangedEvent(MediaPlayerState.COMPLETE, null));
                    return;

                case 3: // '\003'
                    _videoEnginePlaybackMetrics.update();
                    _isBuffering = true;
                    setBufferTime(_desiredBufferControlParameters.getInitialBufferTime());
                    _isTempBuffer = true;
                    _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.BUFFERING_STARTED));
                    return;

                case 4: // '\004'
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.BUFFERING_COMPLETED));
                        return;
                    }
                    break;

                case 5: // '\005'
                    checkAndDispatchBufferingComplete();
                    _videoEnginePlaybackMetrics.update();
                    _videoEngineDispatcher.dispatch(VideoStateChangedEvent.createChangedEvent(MediaPlayerState.PLAY, null));
                    if (_lastKnownContentId == -1)
                    {
                        long l = _videoEnginePlaybackMetrics.getTime();
                        int i = getContentIdByTime(l);
                        if (i != -1)
                        {
                            if (_videoEngineTimeline.containsMarkerForTime(l))
                            {
                                _videoEngineTimeline.updateTimelineMarkers(l);
                                return;
                            } else
                            {
                                _lastKnownContentId = i;
                                VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onPlayState").toString(), (new StringBuilder()).append("Detected period-change at time [").append(String.valueOf(l)).append("].").toString());
                                _videoEngineDispatcher.dispatch(ContentChangedEvent.createChangeEvent(_lastKnownContentId, l));
                                return;
                            }
                        }
                    }
                    break;

                case 6: // '\006'
                    checkAndDispatchBufferingComplete();
                    _videoEngineDispatcher.dispatch(VideoStateChangedEvent.createChangedEvent(MediaPlayerState.PAUSE, null));
                    return;

                case 7: // '\007'
                    _videoEngineDispatcher.dispatch(VideoStateChangedEvent.createChangedEvent(MediaPlayerState.SUSPENDED, null));
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            public void onSeekComplete(VideoEngine videoengine, MediaErrorCode mediaerrorcode)
            {
                if (videoengine == _videoEngine) goto _L2; else goto _L1
_L1:
                return;
_L2:
                VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onSeekComplete").toString(), "Seek complete event received.");
                _isInitialised = true;
                _videoEnginePlaybackMetrics.update();
                if (_videoEngineDispatcher != null && _isBuffering)
                {
                    _isBuffering = false;
                    _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.BUFFERING_COMPLETED));
                }
                _isSeeking = false;
                checkAndDispatchBufferingComplete();
                if (_isTempBuffer)
                {
                    setBufferTime(_desiredBufferControlParameters.getPlayBufferTime());
                    _isTempBuffer = false;
                }
                if (mediaerrorcode != MediaErrorCode.SUCCESS)
                {
                    break; /* Loop/switch isn't completed */
                }
                long l = _desiredSeekPositon.getTime();
                if (_desiredSeekPositon.getPeriod() != -1)
                {
                    l = calculateVirtualTime(_desiredSeekPositon);
                }
                if (_videoEngineDispatcher != null)
                {
                    _videoEngineDispatcher.dispatch(SeekEvent.createSeekCompleted(l));
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                videoengine = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SEEK_ERROR, "Seeking operation has failed.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("NATIVE_ERROR_CODE", mediaerrorcode.name());
                metadatanode.setValue("DESIRED_SEEK_PERIOD", (new StringBuilder()).append(_desiredSeekPositon.getPeriod()).append("").toString());
                metadatanode.setValue("DESIRED_SEEK_POSITION", (new StringBuilder()).append(_desiredSeekPositon.getTime()).append("").toString());
                videoengine.setMetadata(metadatanode);
                if (_videoEngineDispatcher != null)
                {
                    _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(videoengine));
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            public void onStreamMetadata(VideoEngine videoengine, StreamMetadata streammetadata)
            {
                if (videoengine == _videoEngine)
                {
                    videoengine = null;
                    if (streammetadata != null)
                    {
                        videoengine = new StringBuilder();
                        videoengine.append("Width: ").append(streammetadata.outputWidth).append(" | ");
                        videoengine.append("Height: ").append(streammetadata.outputHeight).append(" | ");
                        videoengine.append("Frame rate: ").append(streammetadata.frameRate).append(" | ");
                        videoengine.append("Profile: ").append(streammetadata.profile).append(" | ");
                        videoengine.append("Level: ").append(streammetadata.level).append(".");
                        videoengine = videoengine.toString();
                    }
                    VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onStreamMetadata").toString(), (new StringBuilder()).append("StreamMetadata event received - ").append(videoengine).toString());
                    if (_videoEngineDispatcher != null && streammetadata != null && streammetadata.outputWidth != 0 && streammetadata.outputHeight != 0)
                    {
                        int i = streammetadata.outputWidth;
                        int j = streammetadata.outputHeight;
                        _videoEngineDispatcher.dispatch(VideoSizeChangedEvent.createChangedEvent(j, i));
                        return;
                    }
                }
            }

            public void onStreamSwitch(VideoEngine videoengine, long l, SwitchInfo switchinfo, int i, int j)
            {
                if (videoengine == _videoEngine)
                {
                    VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onStreamSwitch").toString(), (new StringBuilder()).append("Switch detected at time [").append(String.valueOf(l)).append("].").toString());
                    boolean flag;
                    if (_lastKnownContentId != j)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (_videoEngineDispatcher != null && flag)
                    {
                        if (_videoEngineTimeline.containsMarkerForTime(l))
                        {
                            _videoEngineTimeline.updateTimelineMarkers(l);
                        } else
                        {
                            VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onStreamSwitch").toString(), (new StringBuilder()).append("Detected period change contentId [").append(String.valueOf(j)).append("] at time [").append(String.valueOf(l)).append("].").toString());
                            _lastKnownContentId = j;
                            _videoEngineDispatcher.dispatch(ContentChangedEvent.createChangeEvent(_lastKnownContentId, l));
                        }
                    }
                    if (_videoEngineDispatcher != null && _lastKnownProfile != (long)i)
                    {
                        VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onStreamSwitch").toString(), (new StringBuilder()).append("Detected bit rate change [").append(String.valueOf(i)).append(" at time [").append(String.valueOf(l)).append("].").toString());
                        _lastKnownProfile = (long)i;
                        _videoEngineDispatcher.dispatch(ProfileChangedEvent.createProfileChangeEvent(_lastKnownProfile, l));
                        return;
                    }
                }
            }

            public void onTimeline(VideoEngine videoengine, UpdateType updatetype)
            {
                if (videoengine == _videoEngine) goto _L2; else goto _L1
_L1:
                return;
_L2:
                VideoEngineAdapter._logger.i((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onTimeline").toString(), (new StringBuilder()).append("Timeline event received. Update type: ").append(updatetype).toString());
                if (!isAveTimelineValid())
                {
                    VideoEngineAdapter._logger.w((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onTimeline").toString(), "AVE timeline is invalid. Ignoring event.");
                    return;
                }
                switch (_cls2..SwitchMap.com.adobe.ave.UpdateType[updatetype.ordinal()])
                {
                default:
                    return;

                case 4: // '\004'
                    continue; /* Loop/switch isn't completed */

                case 1: // '\001'
                    _alreadyReleased = false;
                    _videoEnginePlaybackMetrics.update();
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.RESOURCE_LOADED));
                    }
                    _videoEngineDispatcher.createNotificationHistory();
                    _videoEngineItem = new VideoEngineItem(_videoEngineDispatcher, _mediaResource, _contentId, _drmMetadataCache, _adTags);
                    _videoEngineItem.update(_videoEngine);
                    _videoEngineItem.setIsProtected(_isProtected);
                    if (_backgroundMediaResource != null)
                    {
                        _backgroundVideoEngineItem = new BackgroundVideoEngineItem(_videoEngineDispatcher, _backgroundMediaResource, _drmMetadataCache, _adTags);
                        _backgroundVideoEngineItem.update(_videoEngine);
                    }
                    _videoEngineTimeline = new VideoEngineTimeline(_videoEngineDispatcher, VideoEngineAdapter.this, _mediaResource, _contentId, shouldUseContentCache(_mediaResource.getMetadata()));
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ITEM_CREATED));
                        return;
                    }
                    break;

                case 2: // '\002'
                    _videoEnginePlaybackMetrics.update();
                    _videoEngineItem.update(_videoEngine);
                    _videoEngineTimeline.update(_videoEnginePlaybackMetrics.getTime());
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ITEM_UPDATED));
                        return;
                    }
                    break;

                case 3: // '\003'
                    _videoEngineItem.refreshClosedCaptionsTracks(_videoEngine);
                    if (_videoEngineDispatcher != null)
                    {
                        _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.ITEM_UPDATED));
                        return;
                    }
                    break;
                }
                continue; /* Loop/switch isn't completed */
                if (_backgroundVideoEngineItem == null) goto _L1; else goto _L3
_L3:
                _backgroundVideoEngineItem.update(_videoEngine);
                return;
                if (true) goto _L1; else goto _L4
_L4:
            }

            public void onWarning(VideoEngine videoengine, MediaErrorCode mediaerrorcode, String s)
            {
                if (videoengine == _videoEngine) goto _L2; else goto _L1
_L1:
                return;
_L2:
                VideoEngineAdapter._logger.w((new StringBuilder()).append(VideoEngineAdapter.LOG_TAG).append("#onWarning").toString(), (new StringBuilder()).append("[Warning] >> ").append(String.valueOf(mediaerrorcode)).append(" - ").append(s).toString());
                if (mediaerrorcode == MediaErrorCode.PERIOD_HOLD && _timelineProxy != null)
                {
                    VideoEngineAdapter._logger.e(VideoEngineAdapter.LOG_TAG, (new StringBuilder()).append("Current hold position is: ").append(_timelineProxy.getCurrentHoldTime()).append(". Current time is: ").append(getCurrentTime()).toString());
                }
                if (mediaerrorcode == MediaErrorCode.LIVE_HOLD)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (mediaerrorcode != MediaErrorCode.RENDITION_M3U8_ERROR && mediaerrorcode != MediaErrorCode.FILE_NOT_FOUND && mediaerrorcode != MediaErrorCode.SEGMENT_SKIPPED_ON_FAILURE)
                {
                    break; /* Loop/switch isn't completed */
                }
                videoengine = VideoEngineAdapter.createLoadInformationFrom(s);
                if (handleAudioTrackError(videoengine))
                {
                    continue; /* Loop/switch isn't completed */
                }
                videoengine = getFileLoadErrorNotification(videoengine);
                if (_videoEngineDispatcher != null && videoengine != null)
                {
                    _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(videoengine));
                    return;
                }
                break; /* Loop/switch isn't completed */
                if (true) goto _L1; else goto _L3
_L3:
                videoengine = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.NATIVE_WARNING, "Native warning received.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("NATIVE_ERROR_CODE", (new StringBuilder()).append(mediaerrorcode.getValue()).append("").toString());
                metadatanode.setValue("NATIVE_ERROR_NAME", mediaerrorcode.name());
                metadatanode.setValue("DESCRIPTION", s);
                videoengine.setMetadata(metadatanode);
                if (_videoEngineDispatcher != null)
                {
                    _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(videoengine));
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                this$0 = VideoEngineAdapter.this;
                super();
            }
        };
    }

    private static LoadInfo createLoadInformationFrom(String s)
    {
        String s1;
        int i;
        int j;
        long l;
        long l1;
        long l2;
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        s = (MetadataNode)StringUtils.extractFromString(s.replace("rendition url", "url"), ",", "::=");
        if (!s.containsKey("url"))
        {
            return null;
        }
        s1 = s.getValue("url");
        if (!s.containsKey("sizeBytes") && !s.containsKey("downloadTime(ms)") && !s.containsKey("trackType"))
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#getFileLoadInfo").toString(), (new StringBuilder()).append("Manifest load info parsed for url [").append(s1).append("]").toString());
            return LoadInfo.createManifestLoadInformation(s1);
        }
        l = NumberUtils.parseLong(s.getValue("sizeBytes"), 0L);
        l1 = NumberUtils.parseLong(s.getValue("downloadTime(ms)"), 0L);
        l2 = NumberUtils.parseLong(s.getValue("mediaDuration(ms)"), 0L);
        j = (int)NumberUtils.parseLong(s.getValue("periodIndex"), 0L);
        if (!s.containsKey("trackName"))
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#getFileLoadInfo").toString(), (new StringBuilder()).append("Video load info parsed for url [").append(s1).append("]").toString());
            return LoadInfo.createFragmentLoadInformation(s1, j, l, l2, l1);
        }
        i = 0;
        long l3 = NumberUtils.parseNumber(s.getValue("trackIndex"), 0L);
        i = (int)l3;
_L2:
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#getFileLoadInfo").toString(), (new StringBuilder()).append("Audio load info parsed for url [").append(s1).append("]").toString());
        return LoadInfo.createTrackLoadInformation(s1, j, l, l2, l1, s.getValue("trackName"), s.getValue("trackType"), i);
        NumberFormatException numberformatexception;
        numberformatexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String encodeToHTTPHeader(Metadata metadata)
    {
        String s = "";
        String s1 = s;
        if (metadata != null)
        {
            s1 = s;
            if (!metadata.isEmpty())
            {
                Iterator iterator = metadata.keySet().iterator();
                do
                {
                    s1 = s;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    s1 = (String)iterator.next();
                    String s2 = metadata.getValue(s1);
                    if (!StringUtils.isEmpty(s1) && !StringUtils.isEmpty(s2))
                    {
                        s = (new StringBuilder()).append(s).append(s1).append("=").append(s2).append("; ").toString();
                    }
                } while (true);
            }
        }
        return s1;
    }

    private long extractVirtualTime()
        throws VideoEngineException
    {
        Object obj = _videoEngine.getTimeline();
        if (obj != null)
        {
            obj = ((Timeline) (obj)).getPeriodInfo(_desiredSeekPositon.getPeriod());
            if (obj != null)
            {
                return ((PeriodInfo) (obj)).virtualStartTime;
            }
        }
        return _desiredSeekPositon.getTime();
    }

    private int getContentIdByTime(long l)
    {
        Timeline timeline = _videoEngine.getTimeline();
        if (timeline == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = timeline.firstPeriodIndex;
        j = timeline.lastPeriodIndex;
_L3:
        if (i >= j + 1)
        {
            break; /* Loop/switch isn't completed */
        }
        PeriodInfo periodinfo = timeline.getPeriodInfo(i);
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        long l1;
        long l2;
        l1 = periodinfo.virtualStartTime;
        l2 = periodinfo.duration;
        if (l1 > l || l > l2 + l1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        i = periodinfo.userData;
        return i;
        i++;
        if (true) goto _L3; else goto _L2
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.PERIOD_INFO_ERROR, "Get period info operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
        }
_L2:
        return -1;
    }

    static BufferControlParameters getDefaultBufferingParameters()
    {
        return BufferControlParameters.createDual(2000L, 30000L);
    }

    private MediaPlayerNotification.Error getFileLoadErrorNotification(LoadInfo loadinfo)
    {
        Object obj;
        MediaPlayerNotification.Error error;
        obj = null;
        error = null;
        if (loadinfo != null) goto _L2; else goto _L1
_L1:
        obj = error;
_L4:
        return ((MediaPlayerNotification.Error) (obj));
_L2:
        error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.DOWNLOAD_ERROR, "An error has occurred while attempting to download data.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("URL", loadinfo.getUrl());
        error.setMetadata(metadatanode);
        switch (_cls2..SwitchMap.com.adobe.mediacore.qos.LoadInfo.Type[loadinfo.getType().ordinal()])
        {
        default:
            loadinfo = ((LoadInfo) (obj));
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_112;
        }
_L5:
        obj = loadinfo;
        if (loadinfo != null)
        {
            loadinfo.setInnerNotification(error);
            return loadinfo;
        }
        if (true) goto _L4; else goto _L3
_L3:
        loadinfo = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.MANIFEST_ERROR, "An error has occurred while downloading a manifest.");
          goto _L5
        loadinfo = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.CONTENT_ERROR, "An error has occurred while downloading a fragment.");
          goto _L5
    }

    private PeriodInfo getPeriodById(int i)
    {
        Timeline timeline = _videoEngine.getTimeline();
        if (timeline == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        j = timeline.firstPeriodIndex;
        k = timeline.lastPeriodIndex;
_L3:
        if (j >= k + 1)
        {
            break; /* Loop/switch isn't completed */
        }
        PeriodInfo periodinfo = timeline.getPeriodInfo(j);
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        int l = periodinfo.userData;
        if (l == i)
        {
            return periodinfo;
        }
        j++;
        if (true) goto _L3; else goto _L2
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.PERIOD_INFO_ERROR, "Get period info operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
        }
_L2:
        return null;
    }

    private String getUrl(MediaResource mediaresource)
    {
        Object obj = null;
        String s = obj;
        if (mediaresource != null)
        {
            s = obj;
            if (mediaresource.getUrl() != null)
            {
                s = mediaresource.getUrl();
            }
        }
        return s;
    }

    private boolean handleAudioTrackError(LoadInfo loadinfo)
    {
        Iterator iterator;
        while (loadinfo == null || loadinfo.getType() != com.adobe.mediacore.qos.LoadInfo.Type.TRACK || !"AUDIO".equalsIgnoreCase(loadinfo.getTrackType())) 
        {
            return false;
        }
        iterator = _videoEngineItem.getAudioTracks().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        AudioTrack audiotrack = (AudioTrack)iterator.next();
        if (!audiotrack.getName().equals(loadinfo.getTrackName())) goto _L4; else goto _L3
_L3:
        loadinfo = audiotrack;
_L6:
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(AudioTrackEvent.createAudioTrackFailedEvent(loadinfo));
        }
        return true;
_L2:
        loadinfo = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean isAdPeriod(PeriodInfo periodinfo)
    {
        int i;
        i = periodinfo.userData;
        if (_videoEngineTimeline == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        periodinfo = _videoEngineTimeline.getAdBreakPlacements().iterator();
_L2:
        Iterator iterator;
        if (!periodinfo.hasNext())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        iterator = ((AdBreakPlacement)periodinfo.next()).getAdBreak().adsIterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (((Ad)iterator.next()).getId() != i) goto _L4; else goto _L3
_L3:
        return true;
        return false;
    }

    private boolean isAveTimelineValid()
    {
        Object obj;
        try
        {
            obj = _videoEngine.getTimeline();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#onTimeline").toString(), "Exception while trying to read VideoEngine timeline.", ((Exception) (obj)));
            return false;
        }
        if (obj == null)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#onTimeline").toString(), "VideoEngine timeline is null. Ignoring event.");
            return false;
        } else
        {
            showDebuggingInformation(((Timeline) (obj)));
            return true;
        }
    }

    private boolean isID3Dictionary(Dictionary dictionary)
    {
        boolean flag1 = false;
        boolean flag;
        boolean flag2;
        try
        {
            dictionary = dictionary.getValueByKey("_dictionaryType");
        }
        // Misplaced declaration of an exception variable
        catch (Dictionary dictionary)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#isID3Dictionary").toString(), "Video engine exception raised while accesing the dictionary", dictionary);
            return false;
        }
        flag = flag1;
        if (dictionary == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        flag2 = dictionary.equals("ID3");
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        return flag;
    }

    private boolean preventSeekAtClientLivePoint(VideoEngineTimeline.TimeMapping timemapping)
    {
        long l;
        try
        {
            l = _videoEngine.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (VideoEngineTimeline.TimeMapping timemapping)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#preventSeekAtClientLivePoint").toString(), "Unable to retrive current time from video engine");
            return false;
        }
        if (!_isInitialised && getCurrentItem().isLive() && timemapping.getTime() == l)
        {
            _isInitialised = true;
            return true;
        } else
        {
            return false;
        }
    }

    static void printLivePlaybackWindowState(VideoEnginePlaybackMetrics videoengineplaybackmetrics)
    {
        if (videoengineplaybackmetrics != null)
        {
            videoengineplaybackmetrics.update();
            TimeRange timerange = videoengineplaybackmetrics.getPlaybackRange();
            long l = videoengineplaybackmetrics.getTime();
            long l1 = videoengineplaybackmetrics.getReadHead();
            if (timerange != null)
            {
                _logger.i((new StringBuilder()).append(LOG_TAG).append("#printLivePlaybackWindowState").toString(), (new StringBuilder()).append("PlaybackRange = ").append(timerange.toString()).toString());
            } else
            {
                _logger.w((new StringBuilder()).append(LOG_TAG).append("#printLivePlaybackWindowState").toString(), "Cannot print playback range");
            }
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#printLivePlaybackWindowState").toString(), (new StringBuilder()).append("Current time = ").append(l).append("; read head = ").append(l1).toString());
            return;
        } else
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#printLivePlaybackWindowState").toString(), "Cannot print playback metrics");
            return;
        }
    }

    private void resetState()
    {
        _mediaResource = null;
        _videoEngineItem = null;
        _isBuffering = false;
        _isSeeking = false;
        _isInitialised = false;
        _isProtected = false;
        _desiredSeekPositon = VideoEngineTimeline.TimeMapping.createInvalid();
        _drmMetadataCache.reset();
        _lastKnownContentId = -1;
        _lastKnownTime = 0L;
        _alreadyReleased = true;
    }

    private void setBufferTime(long l)
    {
        _videoEngine.setBufferTime(l);
_L1:
        return;
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SET_BUFFER_TIME_ERROR, "Set buffer time operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        metadatanode.setValue("PLAY_BUFFER_TIME", (new StringBuilder()).append(l).append("").toString());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    private boolean shouldUseContentCache(Metadata metadata)
    {
        return metadata == null || !metadata.containsKey(DefaultMetadataKeys.DISABLE_CONTENT_CACHING.getValue()) || !metadata.getValue(DefaultMetadataKeys.DISABLE_CONTENT_CACHING.getValue()).equalsIgnoreCase("true");
    }

    private void showDebuggingInformation(Timeline timeline)
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#showDebuggingInformation").toString(), "Displaying debug information.");
        VideoEngineTimeline.printTimeline(timeline);
        printLivePlaybackWindowState(_videoEnginePlaybackMetrics);
    }

    public long convertToLocalTime(long l)
    {
        Object obj;
        obj = AdSignalingMode.DEFAULT;
        if (_videoEngineTimeline != null)
        {
            obj = _videoEngineTimeline.getAdSignalingMode();
        }
        if (getCurrentItem() == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        long l1 = l;
        if (getCurrentItem().isLive())
        {
            break MISSING_BLOCK_LABEL_252;
        }
        if (obj == AdSignalingMode.MANIFEST_CUES)
        {
            return l;
        }
        Timeline timeline = _videoEngine.getTimeline();
        obj = null;
        if (timeline == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        int i = timeline.firstPeriodIndex;
_L1:
        PeriodInfo periodinfo1;
        if (i > timeline.lastPeriodIndex)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        periodinfo1 = timeline.getPeriodInfo(i);
        PeriodInfo periodinfo;
        periodinfo = ((PeriodInfo) (obj));
        if (periodinfo1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        periodinfo = ((PeriodInfo) (obj));
        if (!isAdPeriod(periodinfo1))
        {
            periodinfo = periodinfo1;
        }
        if (periodinfo1 == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        long l2;
        l1 = periodinfo1.virtualStartTime;
        l2 = periodinfo1.duration;
        if (l1 > l || l > l2 + l1)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        if (!isAdPeriod(periodinfo1))
        {
            return periodinfo1.localStartTime + (l - l1);
        }
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        l = periodinfo.localStartTime;
        l1 = periodinfo.duration;
        return l + l1;
        if (periodinfo == null)
        {
            return 0L;
        }
        i++;
        obj = periodinfo;
          goto _L1
        VideoEngineException videoengineexception;
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#convertToLocalTime").toString(), "Exception raised while trying to access the timeline ", videoengineexception);
        l1 = -1L;
        return l1;
    }

    protected VideoEngineTimelineProxy createVideoEngineTimelineProxy()
    {
        Timeline timeline = null;
        Timeline timeline1 = _videoEngine.getTimeline();
        timeline = timeline1;
_L2:
        _timelineProxy = new VideoEngineTimelineProxy(timeline, _videoEnginePlaybackMetrics);
        return _timelineProxy;
        VideoEngineException videoengineexception;
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#createVideoEngineTimelineProxy").toString(), "VideoException raised while accesing the timeline", videoengineexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void enableTrickPlay(float f, boolean flag)
    {
        if (_hasSurface) goto _L2; else goto _L1
_L1:
        TrickPlayOperation trickplayoperation = new TrickPlayOperation(f, flag);
        trickplayoperation.setVideoEngineAdapter(this);
        _pendingOperations.add(trickplayoperation);
_L4:
        return;
_L2:
        if (_videoEngine.getPlayState() == PlayState.SUSPENDED)
        {
            play();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        _videoEngineTimeline.removeAdsOnSourceTimeline();
        if (f <= 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#enableTrickPlay").toString(), "transitioning to fast forward");
            _videoEngine.fastForward(f);
            return;
        }
        catch (VideoEngineException videoengineexception)
        {
            MediaPlayerNotification.Warning warning = MediaPlayerNotification.createWarningNotification(MediaPlayerNotification.WarningCode.TRICKPLAY_RATE_CHANGE_FAIL, "Playback rate change failed.");
            MetadataNode metadatanode = new MetadataNode();
            metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
            warning.setMetadata(metadatanode);
            if (_videoEngineDispatcher != null)
            {
                _videoEngineDispatcher.dispatch(OperationFailedEvent.createEvent(warning));
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (f >= -1F)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#enableTrickPlay").toString(), "transitioning to fast rewind");
        _videoEngine.rewind(-1F * f);
        return;
        throw new IllegalArgumentException(String.format("Rate [{0}] is not allowed in this version.}", new Object[] {
            Float.valueOf(f)
        }));
    }

    public ABRControlParameters getABRControlParameters()
    {
        return _desiredABRControlParameters;
    }

    public BufferControlParameters getBufferControlParameters()
    {
        return _desiredBufferControlParameters;
    }

    public TextFormat getCaptionsControlParameters()
    {
        return _desiredCaptionsControlParameters;
    }

    public MediaPlayer.Visibility getCaptionsVisibility()
    {
        return _desiredCaptionsVisibility;
    }

    public VideoEngineItem getCurrentItem()
    {
        return _videoEngineItem;
    }

    public long getCurrentTime()
    {
        long l = 0L;
        try
        {
            if (_videoEngine != null)
            {
                l = _videoEngine.getTime();
            }
        }
        catch (VideoEngineException videoengineexception)
        {
            MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.RETRIEVE_TIME_ERROR, "Get client live point operation has failed.");
            MetadataNode metadatanode = new MetadataNode();
            metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
            error.setMetadata(metadatanode);
            if (_videoEngineDispatcher != null)
            {
                _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            }
            return _lastKnownTime;
        }
        return l;
    }

    public DRMManager getDRMManager()
    {
        return _drmManager;
    }

    public long getLocalTime()
    {
        long l;
        try
        {
            l = convertToLocalTime(_videoEngine.getTime());
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#getLocalTime").toString(), "Exception raised while trying to access the timeline ", videoengineexception);
            return 0L;
        }
        return l;
    }

    public PlaybackMetrics getPlaybackMetrics()
    {
        return _videoEnginePlaybackMetrics;
    }

    protected PlayState getPlayerState()
    {
        return _playerState;
    }

    Timeline getRawTimeline()
        throws VideoEngineException
    {
        return _videoEngine.getTimeline();
    }

    public VideoEngineTimeline getTimeline()
    {
        return _videoEngineTimeline;
    }

    public long getVirtualTimeForLocalTime(long l)
    {
        if (getCurrentItem() != null && getCurrentItem().isLive())
        {
            return l;
        }
        Timeline timeline = _videoEngine.getTimeline();
        if (timeline == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        int i = timeline.firstPeriodIndex;
_L1:
        PeriodInfo periodinfo;
        if (i > timeline.lastPeriodIndex)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        periodinfo = timeline.getPeriodInfo(i);
        if (periodinfo == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        long l1;
        long l2;
        l1 = periodinfo.localStartTime;
        l2 = periodinfo.duration;
        if (l1 > l || l > l2 + l1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (isAdPeriod(periodinfo))
        {
            break MISSING_BLOCK_LABEL_114;
        }
        l2 = periodinfo.virtualStartTime;
        return l2 + (l - l1);
        i++;
          goto _L1
        VideoEngineException videoengineexception;
        videoengineexception;
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#getVirtualTimeForLocalTime").toString(), "Unable to get virtual time for this local time. ", videoengineexception);
        return 0L;
    }

    public int getVolume()
    {
        return _desiredVolume;
    }

    boolean hasAllDataBuffered()
    {
        if (_videoEnginePlaybackMetrics != null && _videoEngineItem != null)
        {
            VideoEnginePlaybackMetrics videoengineplaybackmetrics = _videoEnginePlaybackMetrics;
            if (!_videoEngineItem.isLive() && videoengineplaybackmetrics.getTime() + videoengineplaybackmetrics.getBufferLength() >= videoengineplaybackmetrics.getPlaybackRange().getDuration() && videoengineplaybackmetrics.getBufferLength() > 0L)
            {
                return true;
            }
        }
        return false;
    }

    public void initialize()
    {
        _videoEngine = new VideoEngine();
        _videoEngineListener = createEngineListener();
        Object obj = EnumSet.of(ListenerType.ERROR, new ListenerType[] {
            ListenerType.PLAY_STATE, ListenerType.STREAM_SWITCH, ListenerType.STREAM_METADATA, ListenerType.DRM_METADATA, ListenerType.TIMELINE, ListenerType.DATA, ListenerType.MANIFEST_LOAD, ListenerType.LOAD_INFO, ListenerType.SEEK_COMPLETE, ListenerType.WARNING, 
            ListenerType.DICTIONARY_DATA, ListenerType.DRM_ERROR, ListenerType.BACKGROUND_MANIFEST_ERROR, ListenerType.BACKGROUND_MANIFEST_WARNING
        });
        _videoEngine.addListener(((Set) (obj)), _videoEngineListener);
        _drmManager = DRMManager.getSharedManager(_context);
        _videoEngine.setDRMManager(_drmManager);
        obj = _context.getFilesDir().getAbsolutePath();
        _videoEngine.setLocalStoragePath(((String) (obj)));
        _videoEnginePlaybackMetrics = new VideoEnginePlaybackMetrics();
_L1:
        return;
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.ENGINE_CREATION_ERROR, "Unexpected error while creating the video engine.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public void injectData(VideoEngineTimeline.TimeMapping timemapping, byte abyte0[])
        throws VideoEngineException
    {
        if (abyte0 == null)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#injectData").toString(), "Input data object is null.");
            return;
        } else
        {
            long l = calculateVirtualTime(timemapping);
            _videoEngine.injectData(DataType.DT_AMF, l, abyte0, abyte0.length);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#injectData").toString(), (new StringBuilder()).append("Injected data at virtual time [").append(l).append("]").toString());
            return;
        }
    }

    protected boolean isBufferFull()
    {
        while (_videoEnginePlaybackMetrics == null || _videoEngineItem == null || _desiredBufferControlParameters == null || _videoEnginePlaybackMetrics.getBufferLength() < _desiredBufferControlParameters.getPlayBufferTime() && !hasAllDataBuffered()) 
        {
            return false;
        }
        return true;
    }

    public boolean isInitialised()
    {
        return _isInitialised;
    }

    public void load(MediaResource mediaresource, int i)
    {
        if (_hasSurface) goto _L2; else goto _L1
_L1:
        mediaresource = new LoadOperation(mediaresource, i);
        mediaresource.setVideoEngineAdapter(this);
        _pendingOperations.add(mediaresource);
_L4:
        return;
_L2:
        resetState();
        Object obj;
        Object obj1;
        Object obj2;
        String as1[];
        _mediaResource = mediaresource;
        _contentId = i;
        obj1 = _mediaResource.getUrl();
        obj2 = convertType(_mediaResource.getType());
        String as[] = PSDKConfig.getAdTagsWithDefault();
        _videoEngine.setCuePointTags(as, as.length);
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#load").toString(), (new StringBuilder()).append("Setting ad cues: ").append(Arrays.toString(as)).append(".").toString());
        as1 = StringUtils.getReunion(as, PSDKConfig.getSubscribedTags());
        _videoEngine.setSubscribedTags(as1, as1.length);
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#load").toString(), (new StringBuilder()).append("Setting subscribed cues: ").append(Arrays.toString(as1)).append(".").toString());
        _adTags = Arrays.asList(as);
        setBufferControlParameters(_desiredBufferControlParameters);
        obj = _mediaResource.getMetadata();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_629;
        }
        NetworkConfiguration networkconfiguration;
        if (!(obj instanceof MetadataNode) || !((MetadataNode)obj).containsNode(DefaultMetadataKeys.NETWORK_CONFIGURATION.getValue()))
        {
            break MISSING_BLOCK_LABEL_629;
        }
        networkconfiguration = (NetworkConfiguration)((MetadataNode)obj).getNode(DefaultMetadataKeys.NETWORK_CONFIGURATION.getValue());
        obj = "";
        HashMap hashmap;
        int j;
        if (networkconfiguration.getCookieHeaders() != null)
        {
            obj = encodeToHTTPHeader(networkconfiguration.getCookieHeaders());
        }
        boolean flag = networkconfiguration.getUseCookieHeadersForAllRequests();
        boolean flag1 = networkconfiguration.getUseRedirectedUrl();
        hashmap = networkconfiguration.getCustomHeaders();
        j = networkconfiguration.getMasterUpdateInterval();
        obj = new NetworkingParameters(((String) (obj)), flag);
        _videoEngine.setNetworkingParameters(((NetworkingParameters) (obj)));
        useRedirectedUrl(flag1);
        if (hashmap == null)
        {
            break MISSING_BLOCK_LABEL_523;
        }
        try
        {
            String s;
            String as2[];
            for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext(); _videoEngine.addCustomHeader(s, as2, as2.length))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                s = (String)entry.getKey();
                as2 = (String[])entry.getValue();
            }

            break MISSING_BLOCK_LABEL_523;
        }
        catch (VideoEngineException videoengineexception)
        {
            obj1 = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.RESOURCE_LOAD_ERROR, "Video engine load-resource operation has failed.");
            obj2 = new MetadataNode();
            ((Metadata) (obj2)).setValue("DESCRIPTION", videoengineexception.getMessage());
            ((Metadata) (obj2)).setValue("RESOURCE", mediaresource.toString());
            ((MediaPlayerNotification.Error) (obj1)).setMetadata(((Metadata) (obj2)));
        }
        if (_videoEngineDispatcher == null) goto _L4; else goto _L3
_L3:
        _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(((MediaPlayerNotification.Error) (obj1))));
        return;
        masterUpdateInterval(j);
_L6:
        if (_backgroundMediaResource != null)
        {
            _videoEngine.setSubscribedTagsForBackgroundManifest(as1, as1.length);
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#load").toString(), (new StringBuilder()).append("Setting subscribed cues on background stream: ").append(Arrays.toString(as1)).append(".").toString());
            _videoEngine.loadWithBackgroundManifest(((String) (obj1)), ((ContainerType) (obj2)), i, getUrl(_backgroundMediaResource));
            return;
        }
        break MISSING_BLOCK_LABEL_642;
        useRedirectedUrl(true);
        masterUpdateInterval(-1);
        if (true) goto _L6; else goto _L5
_L5:
        _videoEngine.load(((String) (obj1)), ((ContainerType) (obj2)), i);
        return;
    }

    public void masterUpdateInterval(int i)
    {
        try
        {
            _videoEngine.setMasterUpdateInterval(i);
            return;
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#masterUpdateInterval").toString(), "Not successful", videoengineexception);
        }
    }

    public void pause()
    {
        if (!_hasSurface)
        {
            PlayOperation playoperation = new PlayOperation();
            PauseOperation pauseoperation = new PauseOperation();
            pauseoperation.setVideoEngineAdapter(this);
            playoperation.setVideoEngineAdapter(this);
            _pendingOperations.add(playoperation);
            _pendingOperations.add(pauseoperation);
        } else
        {
            MediaPlayerNotification.Error error;
            try
            {
                if (_videoEngine.getPlayState() == PlayState.SUSPENDED)
                {
                    play();
                }
                _videoEngine.setScreenOnWhilePlaying(false);
                _videoEngine.pause();
                return;
            }
            catch (VideoEngineException videoengineexception)
            {
                error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.PAUSE_ERROR, "Pause operation has failed.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
                error.setMetadata(metadatanode);
            }
            if (_videoEngineDispatcher != null)
            {
                _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
                return;
            }
        }
    }

    public void play()
    {
        if (!_hasSurface)
        {
            PlayOperation playoperation = new PlayOperation();
            playoperation.setVideoEngineAdapter(this);
            _pendingOperations.add(playoperation);
        } else
        {
            try
            {
                if (getCurrentItem() != null && !getCurrentItem().isLive())
                {
                    _isInitialised = true;
                }
                _videoEngine.setScreenOnWhilePlaying(true);
                _videoEngine.play();
                return;
            }
            catch (VideoEngineException videoengineexception)
            {
                MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.PLAYBACK_ERROR, "Play operation has failed.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
                error.setMetadata(metadatanode);
                if (_videoEngineDispatcher != null)
                {
                    _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
                    return;
                }
            }
        }
    }

    public void prepareBuffer()
    {
        _videoEngine.prepareBuffer();
_L1:
        return;
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.RESOURCE_LOAD_ERROR, "Video engine prepare buffer operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        if (_mediaResource != null)
        {
            metadatanode.setValue("RESOURCE", _mediaResource.getUrl());
        }
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public void release()
    {
        reset();
        _videoEngine.removeListener(_videoEngineListener);
        _videoEngine.release();
        _drmManager = null;
        _videoEngineListener = null;
        _videoEngine = null;
        _videoEngineItem = null;
        _mediaResource = null;
        _videoEngineDispatcher = null;
        _context = null;
        return;
        Object obj;
        obj;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.ENGINE_RELEASE_ERROR, "Video engine release operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", ((VideoEngineException) (obj)).getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
        }
        _drmManager = null;
        _videoEngineListener = null;
        _videoEngine = null;
        _videoEngineItem = null;
        _mediaResource = null;
        _videoEngineDispatcher = null;
        _context = null;
        return;
        obj;
        _drmManager = null;
        _videoEngineListener = null;
        _videoEngine = null;
        _videoEngineItem = null;
        _mediaResource = null;
        _videoEngineDispatcher = null;
        _context = null;
        throw obj;
    }

    public void releaseResources()
    {
        if (!_alreadyReleased)
        {
            _videoEngine.releaseGPUResources();
        }
_L1:
        return;
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.ENGINE_RESOURCES_RELEASE_ERROR, "Video engine release-resources operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public void reset()
    {
        if (!_hasSurface)
        {
            ResetOperation resetoperation = new ResetOperation();
            resetoperation.setVideoEngineAdapter(this);
            _pendingOperations.add(resetoperation);
        } else
        {
            resetState();
            _desiredABRControlParameters = null;
            _desiredBufferControlParameters = getDefaultBufferingParameters();
            try
            {
                _videoEnginePlaybackMetrics.reset();
                _videoEngine.setScreenOnWhilePlaying(false);
                _videoEngine.reset();
                _videoEngineDispatcher.destroyNotificationHistory();
                return;
            }
            catch (VideoEngineException videoengineexception)
            {
                MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.ENGINE_RESET_ERROR, "Video engine reset operation has failed.");
                MetadataNode metadatanode = new MetadataNode();
                metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
                error.setMetadata(metadatanode);
                if (_videoEngineDispatcher != null)
                {
                    _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
                    return;
                }
            }
        }
    }

    protected void restorePlayer(MediaPlayer.PlayerState playerstate)
    {
        if (_hasSurface)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#suspendPlayer").toString(), (new StringBuilder()).append("Player is already restored. Current state [").append(getPlayerState()).append("].").toString());
        } else
        {
            _hasSurface = true;
            if (_videoEngine != null)
            {
                if (!_pendingOperations.isEmpty())
                {
                    _logger.i((new StringBuilder()).append(LOG_TAG).append("#restorePlayer").toString(), (new StringBuilder()).append("Executing [").append(_pendingOperations.size()).append("] pending operation(s).").toString());
                    PlayerOperation playeroperation;
                    for (playerstate = _pendingOperations.iterator(); playerstate.hasNext(); playeroperation.execute())
                    {
                        playeroperation = (PlayerOperation)playerstate.next();
                        _logger.i((new StringBuilder()).append(LOG_TAG).append("#restorePlayer").toString(), (new StringBuilder()).append("Executing operation: ").append(playeroperation.getClass()).append(".").toString());
                    }

                    _pendingOperations.clear();
                    return;
                }
                if (isInitialised() && playerstate != null && playerstate != MediaPlayer.PlayerState.COMPLETE)
                {
                    _logger.i((new StringBuilder()).append(LOG_TAG).append("#restorePlayer").toString(), (new StringBuilder()).append("Restoring video engine to state [").append(playerstate).append("].").toString());
                    play();
                    if (playerstate == MediaPlayer.PlayerState.PAUSED || playerstate == MediaPlayer.PlayerState.SUSPENDED)
                    {
                        pause();
                        return;
                    }
                }
            }
        }
    }

    public void returnFromTrickPlay()
    {
        _videoEngineTimeline.restoreAdsOnSourceTimeline();
    }

    public void seek(VideoEngineTimeline.TimeMapping timemapping)
    {
        seek(timemapping, false);
    }

    public void seek(VideoEngineTimeline.TimeMapping timemapping, boolean flag)
    {
        boolean flag1 = true;
        if (timemapping != null && !timemapping.isInvalid()) goto _L2; else goto _L1
_L1:
        _logger.w((new StringBuilder()).append(LOG_TAG).append("#seek").toString(), "Ignoring seek to invalid position.");
_L4:
        return;
_L2:
        if (!_hasSurface)
        {
            PlayOperation playoperation = new PlayOperation();
            playoperation.setVideoEngineAdapter(this);
            _pendingOperations.add(playoperation);
            timemapping = new SeekOperation(timemapping);
            timemapping.setVideoEngineAdapter(this);
            _pendingOperations.add(timemapping);
            return;
        }
        if (preventSeekAtClientLivePoint(timemapping)) goto _L4; else goto _L3
_L3:
        _videoEnginePlaybackMetrics.update();
        if (timemapping.getTime() != -2L) goto _L6; else goto _L5
_L5:
        long l = _videoEnginePlaybackMetrics.getSeekableRange().getEnd();
        _desiredSeekPositon = VideoEngineTimeline.TimeMapping.create(timemapping.getPeriod(), l);
_L8:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        _isSeeking = true;
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(SeekEvent.createSeekStarted(_desiredSeekPositon.getTime()));
        }
        _isBuffering = true;
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(new MediaPlayerEvent(MediaPlayerEvent.Type.BUFFERING_STARTED));
        }
        if (_videoEngine.getPlayState() == PlayState.SUSPENDED)
        {
            play();
        }
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#seek").toString(), (new StringBuilder()).append("Seeking to position ").append(timemapping.toString()).toString());
        if (timemapping.getPeriod() != -1)
        {
            _videoEngine.seekToLocalTime(timemapping.getPeriod(), timemapping.getTime());
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        try
        {
            _desiredSeekPositon = timemapping;
        }
        // Misplaced declaration of an exception variable
        catch (VideoEngineTimeline.TimeMapping timemapping)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#seek").toString(), (new StringBuilder()).append("Seek has failed to position ").append(_desiredSeekPositon.toString()).toString());
            _videoEngineListener.onSeekComplete(_videoEngine, MediaErrorCode.SEEK_FAILED);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (timemapping.getTime() == -2L)
        {
            _videoEngine.seekToLivePoint();
            return;
        }
        long l1;
        long l2;
        long l3;
        l1 = _videoEngine.getTime();
        l2 = _videoEngine.getBufferLength();
        l3 = timemapping.getTime();
        if (l1 <= l3 && l3 <= l2 + l1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        _videoEngine.seek(timemapping.getTime(), flag);
        return;
    }

    public void setABRControlParameters(ABRControlParameters abrcontrolparameters)
    {
        _desiredABRControlParameters = abrcontrolparameters;
        Object obj;
        obj = new ABRParameters();
        obj.startBitsPerSecond = abrcontrolparameters.getInitialBitRate();
        obj.minBitsPerSecond = abrcontrolparameters.getMinBitRate();
        obj.maxBitsPerSecond = abrcontrolparameters.getMaxBitRate();
        _cls2..SwitchMap.com.adobe.mediacore.ABRControlParameters.ABRPolicy[abrcontrolparameters.getABRPolicy().ordinal()];
        JVM INSTR tableswitch 1 3: default 171
    //                   1 85
    //                   2 151
    //                   3 161;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_161;
_L5:
        _videoEngine.setABRParameters(((ABRParameters) (obj)));
        return;
_L2:
        try
        {
            obj.policy = com.adobe.ave.ABRParameters.ABRPolicy.ABR_AGGRESSIVE;
        }
        // Misplaced declaration of an exception variable
        catch (ABRControlParameters abrcontrolparameters)
        {
            obj = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SET_ABR_PARAMETERS_ERROR, "Set ABR params operation has failed.");
            MetadataNode metadatanode = new MetadataNode();
            metadatanode.setValue("DESCRIPTION", abrcontrolparameters.getMessage());
            ((MediaPlayerNotification.Error) (obj)).setMetadata(metadatanode);
            if (_videoEngineDispatcher != null)
            {
                _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(((MediaPlayerNotification.Error) (obj))));
                return;
            } else
            {
                return;
            }
        }
          goto _L5
_L3:
        obj.policy = com.adobe.ave.ABRParameters.ABRPolicy.ABR_MODERATE;
          goto _L5
        obj.policy = com.adobe.ave.ABRParameters.ABRPolicy.ABR_CONSERVATIVE;
          goto _L5
    }

    public void setBackgroundMediaResource(MediaResource mediaresource)
    {
        _backgroundMediaResource = mediaresource;
    }

    public void setBufferControlParameters(BufferControlParameters buffercontrolparameters)
    {
        _desiredBufferControlParameters = buffercontrolparameters;
        _videoEngine.setInitialBufferTime(buffercontrolparameters.getInitialBufferTime());
        _videoEngine.setBufferTime(buffercontrolparameters.getPlayBufferTime());
_L1:
        return;
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SET_BUFFER_PARAMETERS_ERROR, "Set buffer control parameters operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        metadatanode.setValue("INITIAL_BUFFER_TIME", (new StringBuilder()).append(buffercontrolparameters.getInitialBufferTime()).append("").toString());
        metadatanode.setValue("PLAY_BUFFER_TIME", (new StringBuilder()).append(buffercontrolparameters.getPlayBufferTime()).append("").toString());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public void setCaptionsControlParameters(TextFormat textformat)
    {
        _desiredCaptionsControlParameters = textformat;
        MediaPlayerNotification.Error error;
        try
        {
            textformat = _desiredCaptionsControlParameters.getFont().getValue();
            String s = _desiredCaptionsControlParameters.getFontColor().getValue();
            String s1 = _desiredCaptionsControlParameters.getFontEdge().getValue();
            String s2 = _desiredCaptionsControlParameters.getBackgroundColor().getValue();
            String s3 = _desiredCaptionsControlParameters.getFillColor().getValue();
            String s4 = _desiredCaptionsControlParameters.getEdgeColor().getValue();
            String s5 = _desiredCaptionsControlParameters.getSize().getValue();
            String s6 = convertOpacity(_desiredCaptionsControlParameters.getFontOpacity());
            String s7 = convertOpacity(_desiredCaptionsControlParameters.getBackgroundOpacity());
            String s8 = convertOpacity(_desiredCaptionsControlParameters.getFillOpacity());
            String s9 = _desiredCaptionsControlParameters.getBottomInset();
            _videoEngine.setCaptionStyle(new String[] {
                "font", "font_color", "font_edge", "background_color", "fill_color", "edge_color", "size", "font_opacity", "background_opacity", "fill_opacity", 
                "bottom_inset"
            }, new String[] {
                textformat, s, s1, s2, s3, s4, s5, s6, s7, s8, 
                s9
            }, 11);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TextFormat textformat)
        {
            error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SET_CC_STYLING_ERROR, "Set CC-styling operation has failed.");
        }
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", textformat.getMessage());
        error.setMetadata(metadatanode);
        _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
    }

    public void setCaptionsVisibility(MediaPlayer.Visibility visibility)
    {
        if (_desiredCaptionsVisibility == visibility)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        _desiredCaptionsVisibility = visibility;
        VideoEngine videoengine = _videoEngine;
        boolean flag;
        if (visibility == MediaPlayer.Visibility.VISIBLE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        videoengine.enableCaptions(flag);
_L1:
        return;
        visibility;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SET_CC_VISIBILITY_ERROR, "Set CC visibility operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", visibility.getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public void setCustomConfiguration(String s)
    {
        try
        {
            _videoEngine.setCustomConfiguration(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setView(VideoEngineView videoengineview)
    {
        _videoEngine.setView(videoengineview);
_L1:
        return;
        videoengineview;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.ENGINE_SET_VIEW_ERROR, "Set view operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineview.getMessage());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public void setVolume(int i)
    {
        _desiredVolume = i;
        _videoEngine.setVolume(_desiredVolume);
_L1:
        return;
        VideoEngineException videoengineexception;
        videoengineexception;
        MediaPlayerNotification.Error error = MediaPlayerNotification.createErrorNotification(MediaPlayerNotification.ErrorCode.SET_VOLUME_ERROR, "Set volume operation has failed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("DESCRIPTION", videoengineexception.getMessage());
        metadatanode.setValue("VOLUME", (new StringBuilder()).append(i).append("").toString());
        error.setMetadata(metadatanode);
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.dispatch(ErrorEvent.createVideoErrorEvent(error));
            return;
        }
          goto _L1
    }

    public boolean shouldTriggerSubscribedTagEvent(long l)
    {
        if (_videoEngineTimeline != null)
        {
            return _videoEngineTimeline.shouldTriggerSubscribedTagEvent(l);
        } else
        {
            return true;
        }
    }

    protected void suspendPlayer()
    {
        if (!_hasSurface)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#suspendPlayer").toString(), "Player is already suspended.");
            return;
        } else
        {
            _logger.i((new StringBuilder()).append(LOG_TAG).append("#suspendPlayer").toString(), "Releasing GPU resources and suspending video engine.");
            _hasSurface = false;
            releaseResources();
            return;
        }
    }

    public void useRedirectedUrl(boolean flag)
    {
        try
        {
            _videoEngine.useRedirectedUrl(flag);
            return;
        }
        catch (VideoEngineException videoengineexception)
        {
            _logger.e((new StringBuilder()).append(LOG_TAG).append("#useRedirectedUrl").toString(), "Not successful", videoengineexception);
        }
    }






/*
    static boolean access$1002(VideoEngineAdapter videoengineadapter, boolean flag)
    {
        videoengineadapter._isBuffering = flag;
        return flag;
    }

*/





/*
    static boolean access$1302(VideoEngineAdapter videoengineadapter, boolean flag)
    {
        videoengineadapter._isTempBuffer = flag;
        return flag;
    }

*/




/*
    static int access$1502(VideoEngineAdapter videoengineadapter, int i)
    {
        videoengineadapter._lastKnownContentId = i;
        return i;
    }

*/




/*
    static VideoEngineTimeline access$1702(VideoEngineAdapter videoengineadapter, VideoEngineTimeline videoenginetimeline)
    {
        videoengineadapter._videoEngineTimeline = videoenginetimeline;
        return videoenginetimeline;
    }

*/



/*
    static long access$1802(VideoEngineAdapter videoengineadapter, long l)
    {
        videoengineadapter._lastKnownProfile = l;
        return l;
    }

*/



/*
    static boolean access$1902(VideoEngineAdapter videoengineadapter, boolean flag)
    {
        videoengineadapter._isProtected = flag;
        return flag;
    }

*/





/*
    static boolean access$2202(VideoEngineAdapter videoengineadapter, boolean flag)
    {
        videoengineadapter._alreadyReleased = flag;
        return flag;
    }

*/



/*
    static VideoEngineItem access$2302(VideoEngineAdapter videoengineadapter, VideoEngineItem videoengineitem)
    {
        videoengineadapter._videoEngineItem = videoengineitem;
        return videoengineitem;
    }

*/







/*
    static BackgroundVideoEngineItem access$2802(VideoEngineAdapter videoengineadapter, BackgroundVideoEngineItem backgroundvideoengineitem)
    {
        videoengineadapter._backgroundVideoEngineItem = backgroundvideoengineitem;
        return backgroundvideoengineitem;
    }

*/




/*
    static boolean access$3002(VideoEngineAdapter videoengineadapter, boolean flag)
    {
        videoengineadapter._isInitialised = flag;
        return flag;
    }

*/



/*
    static boolean access$3102(VideoEngineAdapter videoengineadapter, boolean flag)
    {
        videoengineadapter._isSeeking = flag;
        return flag;
    }

*/










/*
    static PlayState access$802(VideoEngineAdapter videoengineadapter, PlayState playstate)
    {
        videoengineadapter._playerState = playstate;
        return playstate;
    }

*/

}
