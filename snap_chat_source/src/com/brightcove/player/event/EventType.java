// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;


public final class EventType
{

    public static final String ACCOUNT = "account";
    public static final String ACTIVITY_CREATED = "activityCreated";
    public static final String ACTIVITY_DESTROYED = "activityDestroyed";
    public static final String ACTIVITY_PAUSED = "activityPaused";
    public static final String ACTIVITY_RESTARTED = "activityRestarted";
    public static final String ACTIVITY_RESUMED = "activityResumed";
    public static final String ACTIVITY_SAVE_INSTANCE_STATE = "activitySaveInstanceState";
    public static final String ACTIVITY_STARTED = "activityStarted";
    public static final String ACTIVITY_STOPPED = "activityStopped";
    public static final String ADD_ANALYTICS_BASE_PARAMS = "addAnalyticsBaseParams";
    public static final String AD_PROGRESS = "adProgress";
    public static final String ANALYTICS_CATALOG_REQUEST = "analyticsCatalogRequest";
    public static final String ANALYTICS_CATALOG_RESPONSE = "analyticsCatalogResponse";
    public static final String ANALYTICS_VIDEO_ENGAGEMENT = "analyticsVideoEngagement";
    public static final String ANY = "*";
    public static final String BUFFERED_UPDATE = "bufferedUpdate";
    public static final String BUFFERING_COMPLETED = "bufferingCompleted";
    public static final String BUFFERING_STARTED = "bufferingStarted";
    public static final String CAPTION = "caption";
    public static final String CAPTIONS_AVAILABLE = "captionsAvailable";
    public static final String CAPTIONS_DIALOG_OK = "captionsDialogOk";
    public static final String CAPTIONS_DIALOG_SETTINGS = "captionsDialogSettings";
    public static final String CLOSED_CAPTIONING_ERROR = "closedCaptioningError";
    public static final String COMPLETED = "completed";
    public static final String CONFIGURATION_CHANGED = "configurationChanged";
    public static final String CUE_POINT = "cuePoint";
    public static final String DEBUG = "debug";
    public static final String DID_CHANGE_LIST = "didChangeList";
    public static final String DID_ENTER_FULL_SCREEN = "didEnterFullScreen";
    public static final String DID_EXIT_FULL_SCREEN = "didExitFullScreen";
    public static final String DID_GO_LIVE = "didGoLive";
    public static final String DID_INTERRUPT_CONTENT = "didInterruptContent";
    public static final String DID_LOAD_CLOSED_CAPTIONS = "didLoadClosedCaptions";
    public static final String DID_PAUSE = "didPause";
    public static final String DID_PLAY = "didPlay";
    public static final String DID_RESUME_CONTENT = "didResumeContent";
    public static final String DID_REWIND = "didRewind";
    public static final String DID_SEEK_TO = "didSeekTo";
    public static final String DID_SELECT_SOURCE = "didSelectSource";
    public static final String DID_SET_ANALYTICS_BASE_PARAMS = "didSetAnalyticsBaseParams";
    public static final String DID_SET_SOURCE = "didSetSource";
    public static final String DID_SET_VIDEO = "didSetVideo";
    public static final String DID_SET_VIDEO_STILL = "didSetVideoStill";
    public static final String DID_STOP = "didStop";
    public static final String ENTER_FULL_SCREEN = "enterFullScreen";
    public static final String ERROR = "error";
    public static final String EXIT_FULL_SCREEN = "exitFullScreen";
    public static final String FIND_PLAYLIST = "findPlaylist";
    public static final String FIND_VIDEO = "findVideo";
    public static final String FRAGMENT_ACTIVITY_CREATED = "fragmentActivityCreated";
    public static final String FRAGMENT_CREATED_VIEW = "fragmentCreatedView";
    public static final String FRAGMENT_DESTROYED = "fragmentDestroyed";
    public static final String FRAGMENT_DESTROYED_VIEW = "fragmentDestroyedView";
    public static final String FRAGMENT_DETACHED = "fragmentDetached";
    public static final String FRAGMENT_PAUSED = "fragmentPaused";
    public static final String FRAGMENT_RESUMED = "fragmentResumed";
    public static final String FRAGMENT_SAVE_INSTANCE_STATE = "fragmentSaveInstanceState";
    public static final String FRAGMENT_STARTED = "fragmentStarted";
    public static final String FRAGMENT_STOPPED = "fragmentStopped";
    public static final String FRAGMENT_VIEW_STATE_RESTORED = "fragmentViewStateRestored";
    public static final String GO_LIVE = "goLive";
    public static final String HIDE_SEEK_CONTROLS = "hideSeekControls";
    public static final String PAUSE = "pause";
    public static final String PLAY = "play";
    public static final String PREBUFFER_NEXT_VIDEO = "prebufferNextVideo";
    public static final String PROGRESS = "progress";
    public static final String READY_TO_PLAY = "readyToPlay";
    public static final String REGISTER_PLUGIN = "registerPlugin";
    public static final String REMOVE_CUE_POINT = "removeCuePoint";
    public static final String RESPONSE = "response";
    public static final String REWIND = "rewind";
    public static final String SEEK_TO = "seekTo";
    public static final String SELECT_SOURCE = "selectSource";
    public static final String SET_ANALYTICS_BASE_PARAMS = "setAnalyticsBaseParams";
    public static final String SET_CAPTIONS_STATE = "setCaptionsState";
    public static final String SET_CUE_POINT = "setCuePoint";
    public static final String SET_CUE_POINTS = "setCuePoints";
    public static final String SET_SOURCE = "setSource";
    public static final String SET_VIDEO = "setVideo";
    public static final String SET_VIDEO_STILL = "setVideoStill";
    public static final String SET_VOLUME = "setVolume";
    public static final String SHOW_SEEK_CONTROLS = "showSeekControls";
    public static final String SOURCE_NOT_FOUND = "sourceNotFound";
    public static final String SOURCE_NOT_PLAYABLE = "sourceNotPlayable";
    public static final String STOP = "stop";
    public static final String TEST = "test";
    public static final String TOGGLE_CLOSED_CAPTIONS = "toggleClosedCaptions";
    public static final String VERSION = "version";
    public static final String VIDEO_DURATION_CHANGED = "videoDurationChanged";
    public static final String VIDEO_SIZE_KNOWN = "videoSizeKnown";
    public static final String WILL_CHANGE_VIDEO = "willChangeVideo";
    public static final String WILL_INTERRUPT_CONTENT = "willInterruptContent";
    public static final String WILL_RESUME_CONTENT = "willResumeContent";

    public EventType()
    {
    }
}
