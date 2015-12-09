// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public class Event
{

    public static final String ACTIVITY = "activity";
    public static final String BOOLEAN = "boolean";
    public static final String BUILD_VERSION = "buildVersion";
    public static final String CAPTIONS_STATE = "captionsState";
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
    public static final String FRAGMENT = "fragment";
    public static final String FROM_SEEK_POSITION = "fromSeekPosition";
    public static final String INDEX = "index";
    public static final String INSTANCE_STATE = "instanceState";
    public static final String LEFT_VOLUME = "leftVolume";
    public static final String LIST = "list";
    public static final String LOCALE_CODE = "localeCode";
    public static final String MAX_POSITION = "maxPosition";
    public static final String MIN_POSITION = "minPosition";
    public static final String NEXT_VIDEO = "nextVideo";
    public static final String ORIGINAL_EVENT = "original";
    public static final String ORIGINAL_PLAYHEAD_POSITION = "originalPlayheadPosition";
    public static final String PERCENT_COMPLETE = "percentComplete";
    public static final String PLAYHEAD_POSITION = "playheadPosition";
    public static final String PLAYLIST = "playlist";
    public static final String PLUGIN_NAME = "pluginName";
    public static final String REQUEST_TOKEN = "requestToken";
    public static final String RIGHT_VOLUME = "rightVolume";
    public static final String SEEK_CONTROLS_VISIBILITY = "seekControlsVisibility";
    public static final String SEEK_POSITION = "seekPosition";
    public static final String SKIP_CUE_POINTS = "skipCuePoints";
    public static final String SOURCE = "source";
    public static final String START_TIME = "startTime";
    public static final String TTML_DOCUMENT = "ttmlDocument";
    public static final String UUID = "uuid";
    public static final String VALUE = "value";
    public static final String VIDEO = "video";
    public static final String VIDEO_DURATION = "duration";
    public static final String VIDEO_HEIGHT = "height";
    public static final String VIDEO_STILL = "video_still";
    public static final String VIDEO_WIDTH = "width";
    public static final String WEBVTT_DOCUMENT = "webvttDocument";
    private static final String a = com/brightcove/player/event/Event.getName();
    private final String b;
    private boolean c;
    private boolean d;
    public final Map properties = new HashMap();

    public Event(String s)
    {
        b = s;
        d = false;
        c = false;
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
                Log.e(a, (new StringBuilder()).append("Error converting value of <").append(properties.get(s)).append("> for key '").append(s).append("'").toString());
                return -1;
            }
            return i;
        } else
        {
            Log.w(a, (new StringBuilder()).append("Could not find property with name '").append(s).append("'").toString());
            return -1;
        }
    }

    public String getType()
    {
        return b;
    }

    public boolean isPrevented()
    {
        return d;
    }

    public boolean isStopped()
    {
        return c;
    }

    public void preventDefault()
    {
        d = true;
    }

    public void stopPropagation()
    {
        c = true;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Event{").append(b).append(properties).append("}").toString();
    }

}
