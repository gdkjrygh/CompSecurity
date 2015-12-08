// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.session.NotificationHistory;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.adobe.mediacore:
//            ResourceLoadedListener, ItemCreatedListener, ItemUpdatedListener, ItemReadyListener, 
//            AdBreakPlacementCompletedListener, AdBreakPlacementFailedListener, AdBreakRemovalCompletedListener, ContentPlacementCompletedListener, 
//            AdManifestLoadCompleteListener, AdManifestLoadFailedListener, AdBreakManifestLoadCompleteListener, ContentChangedListener, 
//            ContentMarkerListener, ProfileChangedListener, SeekStartedListener, SeekCompletedListener, 
//            SeekAdjustCompletedListener, BufferingStartedListener, BufferingCompletedListener, BufferingFullListener, 
//            AudioTrackFailedListener, LoadInfoListener, DRMMetadataListener, VideoStateChangedListener, 
//            VideoErrorListener, ViewClickListener, OpportunityHandledListener, MediaPlayerEvent, 
//            AdBreakPlacementEvent, AdManifestLoadEvent, ContentChangedEvent, ContentMarkerEvent, 
//            ProfileChangedEvent, SeekEvent, AudioTrackEvent, LoadInfoEvent, 
//            DRMMetadataEvent, ErrorEvent, OperationFailedEvent, StateChangedEvent, 
//            VideoStateChangedEvent, VideoSizeChangedEvent, TimedMetadataAddedEvent, AdBreakPlaybackEvent, 
//            AdPlaybackEvent, AdClickEvent, OpportunityHandledEvent, PlaybackRateEvent

final class VideoEngineDispatcher
{

    private final List _adBreakManifestLoadCompleteListeners = new CopyOnWriteArrayList();
    private final List _adBreakPlacementCompletedListeners = new CopyOnWriteArrayList();
    private final List _adBreakPlacementFailedListeners = new CopyOnWriteArrayList();
    private final List _adBreakRemovalCompletedListeners = new CopyOnWriteArrayList();
    private final List _adManifestLoadCompleteListeners = new CopyOnWriteArrayList();
    private final List _adManifestLoadFailedListeners = new CopyOnWriteArrayList();
    private final List _adPlaybackEventListeners = new CopyOnWriteArrayList();
    private final List _audioTrackFailedListeners = new CopyOnWriteArrayList();
    private final List _blackoutsEventListeners = new CopyOnWriteArrayList();
    private final List _bufferingCompletedListeners = new CopyOnWriteArrayList();
    private final List _bufferingFullListeners = new CopyOnWriteArrayList();
    private final List _bufferingStartedListeners = new CopyOnWriteArrayList();
    private final List _clickListeners = new CopyOnWriteArrayList();
    private final List _contentChangedListeners = new CopyOnWriteArrayList();
    private final List _contentMarkerListeners = new CopyOnWriteArrayList();
    private final List _contentPlacementCompleteListeners = new CopyOnWriteArrayList();
    private final List _drmEventListeners = new CopyOnWriteArrayList();
    private final List _drmMetadataListeners = new CopyOnWriteArrayList();
    private final List _errorListeners = new CopyOnWriteArrayList();
    private final List _itemCreatedListeners = new CopyOnWriteArrayList();
    private final List _itemReadyListeners = new CopyOnWriteArrayList();
    private final List _itemUpdatedListeners = new CopyOnWriteArrayList();
    private final List _loadInfoListeners = new CopyOnWriteArrayList();
    private NotificationHistory _notificationHistory;
    private final List _opportunityFailedListeners = new CopyOnWriteArrayList();
    private final List _opportunityHandledListeners = new CopyOnWriteArrayList();
    private final List _playbackEventListeners = new CopyOnWriteArrayList();
    private final List _profileChangedListeners = new CopyOnWriteArrayList();
    private final List _qosEventListeners = new CopyOnWriteArrayList();
    private final List _resourceLoadedListeners = new CopyOnWriteArrayList();
    private final List _seekAdjustCompletedListeners = new CopyOnWriteArrayList();
    private final List _seekCompletedListeners = new CopyOnWriteArrayList();
    private final List _seekStartedListeners = new CopyOnWriteArrayList();
    private final List _stateChangedListeners = new CopyOnWriteArrayList();

    VideoEngineDispatcher()
    {
    }

    public void addEventListener(MediaPlayer.Event event, MediaPlayer.EventListener eventlistener)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$Event[];
            static final int $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[];

            static 
            {
                $SwitchMap$com$adobe$mediacore$MediaPlayer$Event = new int[MediaPlayer.Event.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$Event[MediaPlayer.Event.QOS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror53) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$Event[MediaPlayer.Event.DRM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror52) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$Event[MediaPlayer.Event.AD_PLAYBACK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror51) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$Event[MediaPlayer.Event.PLAYBACK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror50) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$Event[MediaPlayer.Event.BLACKOUTS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror49) { }
                $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type = new int[MediaPlayerEvent.Type.values().length];
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.RESOURCE_LOADED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror48) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ITEM_CREATED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror47) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ITEM_UPDATED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror46) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ITEM_READY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror45) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ADBREAK_PLACEMENT_COMPLETED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror44) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ADBREAK_PLACEMENT_FAILED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror43) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ADBREAK_REMOVAL_COMPLETED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror42) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.CONTENT_PLACEMENT_COMPLETE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror41) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_MANIFEST_LOAD_COMPLETE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror40) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_MANIFEST_LOAD_FAILED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror39) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_BREAK_MANIFEST_LOAD_COMPLETE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.CONTENT_CHANGED.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.CONTENT_MARKER.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.PROFILE_CHANGED.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.SEEK_STARTED.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.SEEK_COMPLETED.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.SEEK_ADJUST_COMPLETED.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.BUFFERING_STARTED.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.BUFFERING_COMPLETED.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.BUFFERING_FULL.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AUDIO_TRACK_FAILED.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.LOAD_INFO.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.DRM_METADATA.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.VIDEO_STATE_CHANGED.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.VIDEO_ERROR.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.VIEW_CLICKED.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.OPPORTUNITY_COMPLETED.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.OPPORTUNITY_FAILED.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.ITEM_REPLACED.ordinal()] = 29;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.OPERATION_FAILED.ordinal()] = 30;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.PREPARED.ordinal()] = 31;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.UPDATED.ordinal()] = 32;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.TIMELINE_UPDATED.ordinal()] = 33;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.PLAY_START.ordinal()] = 34;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.PLAY_COMPLETE.ordinal()] = 35;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.STATE_CHANGED.ordinal()] = 36;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.SIZE_CHANGED.ordinal()] = 37;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.TIMED_METADATA_ADDED.ordinal()] = 38;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.TIMED_METADATA_ADDED_IN_BACKGROUND.ordinal()] = 39;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_BREAK_START.ordinal()] = 40;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_BREAK_COMPLETE.ordinal()] = 41;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_BREAK_SKIPPED.ordinal()] = 42;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_START.ordinal()] = 43;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_PROGRESS.ordinal()] = 44;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_COMPLETE.ordinal()] = 45;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.AD_CLICK.ordinal()] = 46;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.RATE_SELECTED.ordinal()] = 47;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.RATE_PLAYING.ordinal()] = 48;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayerEvent$Type[MediaPlayerEvent.Type.BACKGROUND_MANIFEST_FAILED.ordinal()] = 49;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.adobe.mediacore.MediaPlayer.Event[event.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported event type.[").append(event).append("]").toString());

        case 1: // '\001'
            _qosEventListeners.add((MediaPlayer.QOSEventListener)eventlistener);
            return;

        case 2: // '\002'
            _drmEventListeners.add((MediaPlayer.DRMEventListener)eventlistener);
            return;

        case 3: // '\003'
            _adPlaybackEventListeners.add((MediaPlayer.AdPlaybackEventListener)eventlistener);
            return;

        case 4: // '\004'
            _playbackEventListeners.add((MediaPlayer.PlaybackEventListener)eventlistener);
            return;

        case 5: // '\005'
            _blackoutsEventListeners.add((MediaPlayer.BlackoutsEventListener)eventlistener);
            break;
        }
    }

    public void addEventListener(MediaPlayerEvent.Type type, MediaPlayer.EventListener eventlistener)
    {
        switch (_cls1..SwitchMap.com.adobe.mediacore.MediaPlayerEvent.Type[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported event type.[").append(type).append("]").toString());

        case 1: // '\001'
            _resourceLoadedListeners.add((ResourceLoadedListener)eventlistener);
            return;

        case 2: // '\002'
            _itemCreatedListeners.add((ItemCreatedListener)eventlistener);
            return;

        case 3: // '\003'
            _itemUpdatedListeners.add((ItemUpdatedListener)eventlistener);
            return;

        case 4: // '\004'
            _itemReadyListeners.add((ItemReadyListener)eventlistener);
            return;

        case 5: // '\005'
            _adBreakPlacementCompletedListeners.add((AdBreakPlacementCompletedListener)eventlistener);
            return;

        case 6: // '\006'
            _adBreakPlacementFailedListeners.add((AdBreakPlacementFailedListener)eventlistener);
            return;

        case 7: // '\007'
            _adBreakRemovalCompletedListeners.add((AdBreakRemovalCompletedListener)eventlistener);
            return;

        case 8: // '\b'
            _contentPlacementCompleteListeners.add((ContentPlacementCompletedListener)eventlistener);
            return;

        case 9: // '\t'
            _adManifestLoadCompleteListeners.add((AdManifestLoadCompleteListener)eventlistener);
            return;

        case 10: // '\n'
            _adManifestLoadFailedListeners.add((AdManifestLoadFailedListener)eventlistener);
            return;

        case 11: // '\013'
            _adBreakManifestLoadCompleteListeners.add((AdBreakManifestLoadCompleteListener)eventlistener);
            return;

        case 12: // '\f'
            _contentChangedListeners.add((ContentChangedListener)eventlistener);
            return;

        case 13: // '\r'
            _contentMarkerListeners.add((ContentMarkerListener)eventlistener);
            return;

        case 14: // '\016'
            _profileChangedListeners.add((ProfileChangedListener)eventlistener);
            return;

        case 15: // '\017'
            _seekStartedListeners.add((SeekStartedListener)eventlistener);
            return;

        case 16: // '\020'
            _seekCompletedListeners.add((SeekCompletedListener)eventlistener);
            return;

        case 17: // '\021'
            _seekAdjustCompletedListeners.add((SeekAdjustCompletedListener)eventlistener);
            return;

        case 18: // '\022'
            _bufferingStartedListeners.add((BufferingStartedListener)eventlistener);
            return;

        case 19: // '\023'
            _bufferingCompletedListeners.add((BufferingCompletedListener)eventlistener);
            return;

        case 20: // '\024'
            _bufferingFullListeners.add((BufferingFullListener)eventlistener);
            return;

        case 21: // '\025'
            _audioTrackFailedListeners.add((AudioTrackFailedListener)eventlistener);
            return;

        case 22: // '\026'
            _loadInfoListeners.add((LoadInfoListener)eventlistener);
            return;

        case 23: // '\027'
            _drmMetadataListeners.add((DRMMetadataListener)eventlistener);
            return;

        case 24: // '\030'
            _stateChangedListeners.add((VideoStateChangedListener)eventlistener);
            return;

        case 25: // '\031'
            _errorListeners.add((VideoErrorListener)eventlistener);
            return;

        case 26: // '\032'
            _clickListeners.add((ViewClickListener)eventlistener);
            return;

        case 27: // '\033'
            _opportunityHandledListeners.add((OpportunityHandledListener)eventlistener);
            return;

        case 28: // '\034'
            _opportunityFailedListeners.add((OpportunityHandledListener)eventlistener);
            break;
        }
    }

    public void clear()
    {
        _resourceLoadedListeners.clear();
        _itemCreatedListeners.clear();
        _itemUpdatedListeners.clear();
        _itemReadyListeners.clear();
        _adBreakPlacementCompletedListeners.clear();
        _adBreakPlacementFailedListeners.clear();
        _contentPlacementCompleteListeners.clear();
        _adManifestLoadCompleteListeners.clear();
        _adManifestLoadFailedListeners.clear();
        _adBreakManifestLoadCompleteListeners.clear();
        _contentChangedListeners.clear();
        _contentMarkerListeners.clear();
        _profileChangedListeners.clear();
        _seekStartedListeners.clear();
        _seekCompletedListeners.clear();
        _seekAdjustCompletedListeners.clear();
        _bufferingStartedListeners.clear();
        _bufferingCompletedListeners.clear();
        _bufferingFullListeners.clear();
        _loadInfoListeners.clear();
        _drmMetadataListeners.clear();
        _stateChangedListeners.clear();
        _errorListeners.clear();
        _audioTrackFailedListeners.clear();
        _clickListeners.clear();
        _opportunityHandledListeners.clear();
        _opportunityFailedListeners.clear();
        _adBreakRemovalCompletedListeners.clear();
        _qosEventListeners.clear();
        _drmEventListeners.clear();
        _adPlaybackEventListeners.clear();
        _playbackEventListeners.clear();
        _blackoutsEventListeners.clear();
    }

    public void createNotificationHistory()
    {
        if (_notificationHistory == null)
        {
            _notificationHistory = new NotificationHistory();
        }
    }

    public void destroyNotificationHistory()
    {
        _notificationHistory = null;
    }

    public void dispatch(MediaPlayerEvent mediaplayerevent)
    {
        if (_notificationHistory != null)
        {
            MediaPlayerNotification mediaplayernotification = mediaplayerevent.getNotification();
            if (mediaplayernotification != null)
            {
                _notificationHistory.addNotification(mediaplayernotification);
            }
        }
        switch (_cls1..SwitchMap.com.adobe.mediacore.MediaPlayerEvent.Type[mediaplayerevent.getType().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported event type.[").append(mediaplayerevent.getType()).append("]").toString());

        case 1: // '\001'
            for (mediaplayerevent = _resourceLoadedListeners.iterator(); mediaplayerevent.hasNext(); ((ResourceLoadedListener)mediaplayerevent.next()).onLoaded()) { }
            break;

        case 2: // '\002'
            for (mediaplayerevent = _itemCreatedListeners.iterator(); mediaplayerevent.hasNext(); ((ItemCreatedListener)mediaplayerevent.next()).onCreated()) { }
            break;

        case 3: // '\003'
            for (mediaplayerevent = _itemUpdatedListeners.iterator(); mediaplayerevent.hasNext(); ((ItemUpdatedListener)mediaplayerevent.next()).onUpdated()) { }
            break;

        case 29: // '\035'
            for (mediaplayerevent = _playbackEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.PlaybackEventListener)mediaplayerevent.next()).onReplaceMediaPlayerItem()) { }
            break;

        case 4: // '\004'
            for (mediaplayerevent = _itemReadyListeners.iterator(); mediaplayerevent.hasNext(); ((ItemReadyListener)mediaplayerevent.next()).onReady()) { }
            break;

        case 5: // '\005'
            mediaplayerevent = (AdBreakPlacementEvent)mediaplayerevent;
            for (Iterator iterator = _adBreakPlacementCompletedListeners.iterator(); iterator.hasNext(); ((AdBreakPlacementCompletedListener)iterator.next()).onCompleted(mediaplayerevent.getProposedAdBreak(), mediaplayerevent.getAcceptedAdBreak())) { }
            break;

        case 6: // '\006'
            mediaplayerevent = (AdBreakPlacementEvent)mediaplayerevent;
            for (Iterator iterator1 = _adBreakPlacementFailedListeners.iterator(); iterator1.hasNext(); ((AdBreakPlacementFailedListener)iterator1.next()).onFailed(mediaplayerevent.getProposedAdBreak())) { }
            break;

        case 7: // '\007'
            for (mediaplayerevent = _adBreakRemovalCompletedListeners.iterator(); mediaplayerevent.hasNext(); ((AdBreakRemovalCompletedListener)mediaplayerevent.next()).onCompleted()) { }
            break;

        case 8: // '\b'
            for (mediaplayerevent = _contentPlacementCompleteListeners.iterator(); mediaplayerevent.hasNext(); ((ContentPlacementCompletedListener)mediaplayerevent.next()).onCompleted()) { }
            break;

        case 9: // '\t'
            mediaplayerevent = (AdManifestLoadEvent)mediaplayerevent;
            for (Iterator iterator2 = _adManifestLoadCompleteListeners.iterator(); iterator2.hasNext(); ((AdManifestLoadCompleteListener)iterator2.next()).onCompleted(mediaplayerevent.getContentId(), mediaplayerevent.getHandle(), mediaplayerevent.getDuration())) { }
            break;

        case 10: // '\n'
            mediaplayerevent = (AdManifestLoadEvent)mediaplayerevent;
            for (Iterator iterator3 = _adManifestLoadFailedListeners.iterator(); iterator3.hasNext(); ((AdManifestLoadFailedListener)iterator3.next()).onError(mediaplayerevent.getContentId())) { }
            break;

        case 11: // '\013'
            for (mediaplayerevent = _adBreakManifestLoadCompleteListeners.iterator(); mediaplayerevent.hasNext(); ((AdBreakManifestLoadCompleteListener)mediaplayerevent.next()).onComplete()) { }
            break;

        case 12: // '\f'
            mediaplayerevent = (ContentChangedEvent)mediaplayerevent;
            for (Iterator iterator4 = _contentChangedListeners.iterator(); iterator4.hasNext(); ((ContentChangedListener)iterator4.next()).onChanged(mediaplayerevent.getContentId(), mediaplayerevent.getPosition())) { }
            break;

        case 13: // '\r'
            mediaplayerevent = (ContentMarkerEvent)mediaplayerevent;
            for (Iterator iterator5 = _contentMarkerListeners.iterator(); iterator5.hasNext(); ((ContentMarkerListener)iterator5.next()).onContentMarker(mediaplayerevent.getContentId(), mediaplayerevent.getPosition())) { }
            break;

        case 14: // '\016'
            mediaplayerevent = (ProfileChangedEvent)mediaplayerevent;
            for (Iterator iterator6 = _profileChangedListeners.iterator(); iterator6.hasNext(); ((ProfileChangedListener)iterator6.next()).onChanged(mediaplayerevent.getProfile(), mediaplayerevent.getPosition())) { }
            for (Iterator iterator7 = _playbackEventListeners.iterator(); iterator7.hasNext(); ((MediaPlayer.PlaybackEventListener)iterator7.next()).onProfileChanged(mediaplayerevent.getProfile(), mediaplayerevent.getPosition())) { }
            break;

        case 15: // '\017'
            mediaplayerevent = (SeekEvent)mediaplayerevent;
            for (Iterator iterator8 = _seekStartedListeners.iterator(); iterator8.hasNext(); ((SeekStartedListener)iterator8.next()).onStarted(mediaplayerevent.getPosition())) { }
            for (mediaplayerevent = _qosEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.QOSEventListener)mediaplayerevent.next()).onSeekStart()) { }
            break;

        case 16: // '\020'
            mediaplayerevent = (SeekEvent)mediaplayerevent;
            for (Iterator iterator9 = _seekCompletedListeners.iterator(); iterator9.hasNext(); ((SeekCompletedListener)iterator9.next()).onCompleted(mediaplayerevent.getPosition())) { }
            for (Iterator iterator10 = _qosEventListeners.iterator(); iterator10.hasNext(); ((MediaPlayer.QOSEventListener)iterator10.next()).onSeekComplete(mediaplayerevent.getPosition())) { }
            break;

        case 17: // '\021'
            mediaplayerevent = (SeekEvent)mediaplayerevent;
            for (Iterator iterator11 = _seekAdjustCompletedListeners.iterator(); iterator11.hasNext(); ((SeekAdjustCompletedListener)iterator11.next()).onAdjustCompleted(mediaplayerevent.getPosition())) { }
            break;

        case 18: // '\022'
            for (mediaplayerevent = _bufferingStartedListeners.iterator(); mediaplayerevent.hasNext(); ((BufferingStartedListener)mediaplayerevent.next()).onStarted()) { }
            for (mediaplayerevent = _qosEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.QOSEventListener)mediaplayerevent.next()).onBufferStart()) { }
            break;

        case 19: // '\023'
            for (mediaplayerevent = _bufferingCompletedListeners.iterator(); mediaplayerevent.hasNext(); ((BufferingCompletedListener)mediaplayerevent.next()).onCompleted()) { }
            for (mediaplayerevent = _qosEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.QOSEventListener)mediaplayerevent.next()).onBufferComplete()) { }
            break;

        case 20: // '\024'
            for (mediaplayerevent = _bufferingFullListeners.iterator(); mediaplayerevent.hasNext(); ((BufferingFullListener)mediaplayerevent.next()).onFull()) { }
            break;

        case 21: // '\025'
            AudioTrackEvent audiotrackevent = (AudioTrackEvent)mediaplayerevent;
            for (Iterator iterator34 = _audioTrackFailedListeners.iterator(); iterator34.hasNext(); ((AudioTrackFailedListener)iterator34.next()).onFailed(audiotrackevent.getAudioTrack(), (MediaPlayerNotification.Error)mediaplayerevent.getNotification())) { }
            break;

        case 22: // '\026'
            mediaplayerevent = (LoadInfoEvent)mediaplayerevent;
            for (Iterator iterator12 = _loadInfoListeners.iterator(); iterator12.hasNext(); ((LoadInfoListener)iterator12.next()).onInfo(mediaplayerevent.getLoadInfo())) { }
            for (Iterator iterator13 = _qosEventListeners.iterator(); iterator13.hasNext(); ((MediaPlayer.QOSEventListener)iterator13.next()).onLoadInfo(mediaplayerevent.getLoadInfo())) { }
            break;

        case 23: // '\027'
            mediaplayerevent = (DRMMetadataEvent)mediaplayerevent;
            for (Iterator iterator14 = _drmMetadataListeners.iterator(); iterator14.hasNext(); ((DRMMetadataListener)iterator14.next()).onDRMMetadata(mediaplayerevent.getDrmMetadataInfo())) { }
            for (Iterator iterator15 = _drmEventListeners.iterator(); iterator15.hasNext(); ((MediaPlayer.DRMEventListener)iterator15.next()).onDRMMetadata(mediaplayerevent.getDrmMetadataInfo())) { }
            break;

        case 25: // '\031'
            mediaplayerevent = (ErrorEvent)mediaplayerevent;
            for (Iterator iterator16 = _errorListeners.iterator(); iterator16.hasNext(); ((VideoErrorListener)iterator16.next()).onError((MediaPlayerNotification.Error)mediaplayerevent.getNotification())) { }
            break;

        case 30: // '\036'
            mediaplayerevent = (OperationFailedEvent)mediaplayerevent;
            for (Iterator iterator17 = _qosEventListeners.iterator(); iterator17.hasNext(); ((MediaPlayer.QOSEventListener)iterator17.next()).onOperationFailed((MediaPlayerNotification.Warning)mediaplayerevent.getNotification())) { }
            break;

        case 31: // '\037'
            for (mediaplayerevent = _playbackEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.PlaybackEventListener)mediaplayerevent.next()).onPrepared()) { }
            break;

        case 32: // ' '
            for (mediaplayerevent = _playbackEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.PlaybackEventListener)mediaplayerevent.next()).onUpdated()) { }
            break;

        case 33: // '!'
            for (mediaplayerevent = _playbackEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.PlaybackEventListener)mediaplayerevent.next()).onTimelineUpdated()) { }
            break;

        case 34: // '"'
            for (mediaplayerevent = _playbackEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.PlaybackEventListener)mediaplayerevent.next()).onPlayStart()) { }
            break;

        case 35: // '#'
            for (mediaplayerevent = _playbackEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.PlaybackEventListener)mediaplayerevent.next()).onPlayComplete()) { }
            break;

        case 36: // '$'
            mediaplayerevent = (StateChangedEvent)mediaplayerevent;
            for (Iterator iterator18 = _playbackEventListeners.iterator(); iterator18.hasNext(); ((MediaPlayer.PlaybackEventListener)iterator18.next()).onStateChanged(mediaplayerevent.getCurrentState(), mediaplayerevent.getNotification())) { }
            break;

        case 24: // '\030'
            mediaplayerevent = (VideoStateChangedEvent)mediaplayerevent;
            for (Iterator iterator19 = _stateChangedListeners.iterator(); iterator19.hasNext(); ((VideoStateChangedListener)iterator19.next()).onStateChanged(mediaplayerevent.getPlayerState(), mediaplayerevent.getNotification())) { }
            break;

        case 37: // '%'
            mediaplayerevent = (VideoSizeChangedEvent)mediaplayerevent;
            for (Iterator iterator20 = _playbackEventListeners.iterator(); iterator20.hasNext(); ((MediaPlayer.PlaybackEventListener)iterator20.next()).onSizeAvailable(mediaplayerevent.getHeight(), mediaplayerevent.getWidth())) { }
            break;

        case 38: // '&'
            mediaplayerevent = (TimedMetadataAddedEvent)mediaplayerevent;
            for (Iterator iterator21 = _playbackEventListeners.iterator(); iterator21.hasNext(); ((MediaPlayer.PlaybackEventListener)iterator21.next()).onTimedMetadata(mediaplayerevent.getTimedMetadata())) { }
            break;

        case 39: // '\''
            mediaplayerevent = (TimedMetadataAddedEvent)mediaplayerevent;
            for (Iterator iterator22 = _blackoutsEventListeners.iterator(); iterator22.hasNext(); ((MediaPlayer.BlackoutsEventListener)iterator22.next()).onTimedMetadataInBackgroundItem(mediaplayerevent.getTimedMetadata())) { }
            break;

        case 40: // '('
            mediaplayerevent = (AdBreakPlaybackEvent)mediaplayerevent;
            for (Iterator iterator23 = _adPlaybackEventListeners.iterator(); iterator23.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator23.next()).onAdBreakStart(mediaplayerevent.getAdBreak())) { }
            break;

        case 41: // ')'
            mediaplayerevent = (AdBreakPlaybackEvent)mediaplayerevent;
            for (Iterator iterator24 = _adPlaybackEventListeners.iterator(); iterator24.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator24.next()).onAdBreakComplete(mediaplayerevent.getAdBreak())) { }
            break;

        case 42: // '*'
            mediaplayerevent = (AdBreakPlaybackEvent)mediaplayerevent;
            for (Iterator iterator25 = _adPlaybackEventListeners.iterator(); iterator25.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator25.next()).onAdBreakSkipped(mediaplayerevent.getAdBreak())) { }
            break;

        case 43: // '+'
            mediaplayerevent = (AdPlaybackEvent)mediaplayerevent;
            for (Iterator iterator26 = _adPlaybackEventListeners.iterator(); iterator26.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator26.next()).onAdStart(mediaplayerevent.getAdBreak(), mediaplayerevent.getAd())) { }
            break;

        case 44: // ','
            mediaplayerevent = (AdPlaybackEvent)mediaplayerevent;
            for (Iterator iterator27 = _adPlaybackEventListeners.iterator(); iterator27.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator27.next()).onAdProgress(mediaplayerevent.getAdBreak(), mediaplayerevent.getAd(), mediaplayerevent.getProgress())) { }
            break;

        case 45: // '-'
            mediaplayerevent = (AdPlaybackEvent)mediaplayerevent;
            for (Iterator iterator28 = _adPlaybackEventListeners.iterator(); iterator28.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator28.next()).onAdComplete(mediaplayerevent.getAdBreak(), mediaplayerevent.getAd())) { }
            break;

        case 46: // '.'
            mediaplayerevent = (AdClickEvent)mediaplayerevent;
            for (Iterator iterator29 = _adPlaybackEventListeners.iterator(); iterator29.hasNext(); ((MediaPlayer.AdPlaybackEventListener)iterator29.next()).onAdClick(mediaplayerevent.getAdBreak(), mediaplayerevent.getAd(), mediaplayerevent.getAdClick())) { }
            break;

        case 26: // '\032'
            for (mediaplayerevent = _clickListeners.iterator(); mediaplayerevent.hasNext(); ((ViewClickListener)mediaplayerevent.next()).onClick()) { }
            break;

        case 27: // '\033'
            for (Iterator iterator30 = _opportunityHandledListeners.iterator(); iterator30.hasNext(); ((OpportunityHandledListener)iterator30.next()).onOpportunityHandled(((OpportunityHandledEvent)mediaplayerevent).getTime())) { }
            break;

        case 28: // '\034'
            for (Iterator iterator31 = _opportunityHandledListeners.iterator(); iterator31.hasNext(); ((OpportunityHandledListener)iterator31.next()).onOpportunityHandled(((OpportunityHandledEvent)mediaplayerevent).getTime())) { }
            break;

        case 47: // '/'
            mediaplayerevent = (PlaybackRateEvent)mediaplayerevent;
            for (Iterator iterator32 = _playbackEventListeners.iterator(); iterator32.hasNext(); ((MediaPlayer.PlaybackEventListener)iterator32.next()).onRateSelected(mediaplayerevent.getRate())) { }
            break;

        case 48: // '0'
            mediaplayerevent = (PlaybackRateEvent)mediaplayerevent;
            for (Iterator iterator33 = _playbackEventListeners.iterator(); iterator33.hasNext(); ((MediaPlayer.PlaybackEventListener)iterator33.next()).onRatePlaying(mediaplayerevent.getRate())) { }
            break;

        case 49: // '1'
            for (mediaplayerevent = _blackoutsEventListeners.iterator(); mediaplayerevent.hasNext(); ((MediaPlayer.BlackoutsEventListener)mediaplayerevent.next()).onBackgroundManifestFailed()) { }
            break;
        }
    }

    public NotificationHistory getNotificationHistory()
    {
        return _notificationHistory;
    }

    public void removeEventListener(MediaPlayer.Event event, MediaPlayer.EventListener eventlistener)
    {
        switch (_cls1..SwitchMap.com.adobe.mediacore.MediaPlayer.Event[event.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            _qosEventListeners.remove((MediaPlayer.QOSEventListener)eventlistener);
            return;

        case 2: // '\002'
            _drmEventListeners.remove((MediaPlayer.DRMEventListener)eventlistener);
            return;

        case 3: // '\003'
            _adPlaybackEventListeners.remove((MediaPlayer.AdPlaybackEventListener)eventlistener);
            return;

        case 4: // '\004'
            _playbackEventListeners.remove((MediaPlayer.PlaybackEventListener)eventlistener);
            return;

        case 5: // '\005'
            _playbackEventListeners.remove((MediaPlayer.BlackoutsEventListener)eventlistener);
            break;
        }
    }

    public void removeEventListener(MediaPlayerEvent.Type type, MediaPlayer.EventListener eventlistener)
    {
        switch (_cls1..SwitchMap.com.adobe.mediacore.MediaPlayerEvent.Type[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported event type.[").append(type).append("]").toString());

        case 1: // '\001'
            _resourceLoadedListeners.remove((ResourceLoadedListener)eventlistener);
            return;

        case 2: // '\002'
            _itemCreatedListeners.remove((ItemCreatedListener)eventlistener);
            return;

        case 3: // '\003'
            _itemUpdatedListeners.remove((ItemUpdatedListener)eventlistener);
            return;

        case 4: // '\004'
            _itemReadyListeners.remove((ItemReadyListener)eventlistener);
            return;

        case 5: // '\005'
            _adBreakPlacementCompletedListeners.remove((AdBreakPlacementCompletedListener)eventlistener);
            return;

        case 6: // '\006'
            _adBreakPlacementFailedListeners.remove((AdBreakPlacementFailedListener)eventlistener);
            return;

        case 7: // '\007'
            _adBreakRemovalCompletedListeners.remove((AdBreakRemovalCompletedListener)eventlistener);
            return;

        case 8: // '\b'
            _contentPlacementCompleteListeners.remove((ContentPlacementCompletedListener)eventlistener);
            return;

        case 9: // '\t'
            _adManifestLoadCompleteListeners.remove((AdManifestLoadCompleteListener)eventlistener);
            return;

        case 10: // '\n'
            _adManifestLoadFailedListeners.remove((AdManifestLoadFailedListener)eventlistener);
            return;

        case 11: // '\013'
            _adBreakManifestLoadCompleteListeners.remove((AdBreakManifestLoadCompleteListener)eventlistener);
            return;

        case 12: // '\f'
            _contentChangedListeners.remove((ContentChangedListener)eventlistener);
            return;

        case 13: // '\r'
            _contentMarkerListeners.remove((ContentMarkerListener)eventlistener);
            return;

        case 14: // '\016'
            _profileChangedListeners.remove((ProfileChangedListener)eventlistener);
            return;

        case 15: // '\017'
            _seekStartedListeners.remove((SeekStartedListener)eventlistener);
            return;

        case 16: // '\020'
            _seekCompletedListeners.remove((SeekCompletedListener)eventlistener);
            return;

        case 17: // '\021'
            _seekAdjustCompletedListeners.remove((SeekAdjustCompletedListener)eventlistener);
            return;

        case 18: // '\022'
            _bufferingStartedListeners.remove((BufferingStartedListener)eventlistener);
            return;

        case 19: // '\023'
            _bufferingCompletedListeners.remove((BufferingCompletedListener)eventlistener);
            return;

        case 20: // '\024'
            _bufferingFullListeners.remove((BufferingFullListener)eventlistener);
            return;

        case 21: // '\025'
            _audioTrackFailedListeners.remove((AudioTrackFailedListener)eventlistener);
            return;

        case 22: // '\026'
            _loadInfoListeners.remove((LoadInfoListener)eventlistener);
            return;

        case 23: // '\027'
            _drmMetadataListeners.remove((DRMMetadataListener)eventlistener);
            return;

        case 24: // '\030'
            _stateChangedListeners.remove((VideoStateChangedListener)eventlistener);
            return;

        case 25: // '\031'
            _errorListeners.remove((VideoErrorListener)eventlistener);
            return;

        case 26: // '\032'
            _clickListeners.remove((ViewClickListener)eventlistener);
            return;

        case 27: // '\033'
            _opportunityHandledListeners.remove((OpportunityHandledListener)eventlistener);
            return;

        case 28: // '\034'
            _opportunityFailedListeners.remove((OpportunityHandledListener)eventlistener);
            break;
        }
    }
}
