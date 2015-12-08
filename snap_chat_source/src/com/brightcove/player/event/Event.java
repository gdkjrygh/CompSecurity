// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import java.util.HashMap;
import java.util.Map;

public class Event
{

    public static final String ACTIVITY = "activity";
    public static final String ALIGNMENT = "alignment";
    public static final String BOOLEAN = "boolean";
    public static final String BUILD_VERSION = "buildVersion";
    public static final String CAPTIONS_STATE = "captionsState";
    public static final String CATALOG_URL = "catalogUrl";
    public static final String CONFIGURATION = "configuration";
    public static final String CUE_POINT = "cue_point";
    public static final String CUE_POINTS = "cue_points";
    public static final String CURRENT_VIDEO = "currentVideo";
    public static final String DEBUG = "debug";
    public static final String EMITTER = "emitter";
    public static final String END_TIME = "endTime";
    public static final String ERROR = "error";
    public static final String ERRORS = "errors";
    public static final String ERROR_CODE = "errorCode";
    public static final String ERROR_EXTRA = "errorExtra";
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String FORWARD_BUFFER_SECONDS = "forwardBufferSeconds";
    public static final String FRAGMENT = "fragment";
    public static final String FROM_SEEK_POSITION = "fromSeekPosition";
    public static final String INDEX = "index";
    public static final String INSTANCE_STATE = "instanceState";
    public static final String LEFT_VOLUME = "leftVolume";
    public static final String LINE = "line";
    public static final String LIST = "list";
    public static final String LOCALE_CODE = "localeCode";
    public static final String MAX_POSITION = "maxPosition";
    public static final String MEASURED_BPS = "measuredBps";
    public static final String MIN_POSITION = "minPosition";
    public static final String NEXT_VIDEO = "nextVideo";
    public static final String ORIGINAL_EVENT = "original";
    public static final String ORIGINAL_PLAYHEAD_POSITION = "originalPlayheadPosition";
    public static final String PERCENT_COMPLETE = "percentComplete";
    public static final String PLAYHEAD_POSITION = "playheadPosition";
    public static final String PLAYLIST = "playlist";
    public static final String PLUGIN_NAME = "pluginName";
    public static final String POSITION = "position";
    public static final String RENDITION_HEIGHT = "renditionHeight";
    public static final String RENDITION_INDICATED_BPS = "renditionIndicatedBps";
    public static final String RENDITION_MIME_TYPE = "renditionMimeType";
    public static final String RENDITION_URL = "renditionUrl";
    public static final String RENDITION_WIDTH = "renditionWidth";
    public static final String REQUEST_TOKEN = "requestToken";
    public static final String RESPONSE_TIME_MS = "responseTimeMs";
    public static final String RIGHT_VOLUME = "rightVolume";
    public static final String SEEK_CONTROLS_VISIBILITY = "seekControlsVisibility";
    public static final String SEEK_POSITION = "seekPosition";
    public static final String SEGMENT_DURATION = "segmentDuration";
    public static final String SIZE = "size";
    public static final String SKIP_CUE_POINTS = "skipCuePoints";
    public static final String SOURCE = "source";
    public static final String START_TIME = "startTime";
    public static final String TEXT = "text";
    public static final String TTML_DOCUMENT = "ttmlDocument";
    public static final String UUID = "uuid";
    public static final String VALUE = "value";
    public static final String VIDEO = "video";
    public static final String VIDEO_DURATION = "duration";
    public static final String VIDEO_HEIGHT = "height";
    public static final String VIDEO_STILL = "video_still";
    public static final String VIDEO_WIDTH = "width";
    public static final String VOLUME = "volume";
    public static final String WEBVTT_DOCUMENT = "webvttDocument";
    private final String a;
    private boolean b;
    private boolean c;
    public final Map properties = new HashMap();

    public Event(String s)
    {
        a = s;
        c = false;
        b = false;
    }

    public int getIntegerProperty(String s)
    {
        if (properties.containsKey(s))
        {
            int i;
            try
            {
                i = Integer.parseInt(properties.get(s).toString());
            }
            catch (NumberFormatException numberformatexception)
            {
                (new StringBuilder("Error converting value of <")).append(properties.get(s)).append("> for key '").append(s).append("'");
                return -1;
            }
            return i;
        } else
        {
            (new StringBuilder("Could not find property with name '")).append(s).append("'");
            return -1;
        }
    }

    public String getType()
    {
        return a;
    }

    public boolean isPrevented()
    {
        return c;
    }

    public boolean isStopped()
    {
        return b;
    }

    public void preventDefault()
    {
        c = true;
    }

    public void stopPropagation()
    {
        b = true;
    }

    public String toString()
    {
        return (new StringBuilder("Event{")).append(a).append(properties).append("}").toString();
    }

    static 
    {
        com/brightcove/player/event/Event.getName();
    }
}
