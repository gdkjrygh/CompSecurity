// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView, Utils, MMLog

static class scaleFactor
{
    static final class PlayerState extends Enum
    {

        private static final PlayerState $VALUES[];
        public static final PlayerState DEFAULT;
        public static final PlayerState PAUSE;
        public static final PlayerState PLAY;
        public static final PlayerState RESUME;
        public static final PlayerState STOP;

        public static PlayerState valueOf(String s)
        {
            return (PlayerState)Enum.valueOf(com/millennialmedia/android/InlineVideoView$InlineParams$PlayerState, s);
        }

        public static PlayerState[] values()
        {
            return (PlayerState[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new PlayerState("DEFAULT", 0);
            STOP = new PlayerState("STOP", 1);
            PLAY = new PlayerState("PLAY", 2);
            PAUSE = new PlayerState("PAUSE", 3);
            RESUME = new PlayerState("RESUME", 4);
            $VALUES = (new PlayerState[] {
                DEFAULT, STOP, PLAY, PAUSE, RESUME
            });
        }

        private PlayerState(String s, int i)
        {
            super(s, i);
        }
    }

    static final class VideoState extends Enum
    {

        private static final VideoState $VALUES[];
        public static final VideoState DEFAULT;
        public static final VideoState PREPARED;
        public static final VideoState PREPARING;

        public static VideoState valueOf(String s)
        {
            return (VideoState)Enum.valueOf(com/millennialmedia/android/InlineVideoView$InlineParams$VideoState, s);
        }

        public static VideoState[] values()
        {
            return (VideoState[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new VideoState("DEFAULT", 0);
            PREPARING = new VideoState("PREPARING", 1);
            PREPARED = new VideoState("PREPARED", 2);
            $VALUES = (new VideoState[] {
                DEFAULT, PREPARING, PREPARED
            });
        }

        private VideoState(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String autoPlayKey = "autoPlay";
    public static final String bodyHeightKey = "bodyHeight";
    public static final String bodyWidthKey = "bodyWidth";
    public static final String cachedVideoIDKey = "cachedVideoID";
    public static final String cachedVideoURIKey = "cachedVideoURI";
    public static final String currentPositionKey = "currentPosition";
    public static final String expandedKey = "expanded";
    public static final String heightKey = "height";
    public static final String playerStateKey = "playerState";
    public static final String scaleFactorKey = "scaleFactor";
    public static final String showControlsKey = "showControls";
    public static final String streamVideoURIKey = "streamVideoURI";
    public static final String touchCallBackKey = "touchCallBack";
    public static final String videoStateKey = "videoState";
    public static final String widthKey = "width";
    public static final String xKey = "x";
    public static final String yKey = "y";
    boolean autoPlay;
    int bodyHeight;
    int bodyWidth;
    String cachedVideoID;
    String cachedVideoURI;
    int currentPosition;
    boolean expanded;
    int height;
    PlayerState playerState;
    float scaleFactor;
    boolean showControls;
    String streamVideoURI;
    String touchCallBack;
    VideoState videoState;
    int width;
    int x;
    int y;

    public String toJsonString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            ((JSONObject) (obj)).put("x", x);
            ((JSONObject) (obj)).put("expanded", expanded);
            ((JSONObject) (obj)).put("y", y);
            ((JSONObject) (obj)).put("bodyWidth", bodyWidth);
            ((JSONObject) (obj)).put("bodyHeight", bodyHeight);
            ((JSONObject) (obj)).put("width", width);
            ((JSONObject) (obj)).put("height", height);
            ((JSONObject) (obj)).put("currentPosition", currentPosition);
            ((JSONObject) (obj)).put("playerState", playerState.ordinal());
            ((JSONObject) (obj)).put("videoState", videoState.ordinal());
            ((JSONObject) (obj)).put("streamVideoURI", streamVideoURI);
            ((JSONObject) (obj)).put("cachedVideoURI", cachedVideoURI);
            ((JSONObject) (obj)).put("cachedVideoID", cachedVideoID);
            ((JSONObject) (obj)).put("touchCallBack", touchCallBack);
            ((JSONObject) (obj)).put("autoPlay", autoPlay);
            ((JSONObject) (obj)).put("showControls", showControls);
            ((JSONObject) (obj)).put("scaleFactor", scaleFactor);
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            MMLog.e("InlineVideoView", "Error converting InlineParams to json string", jsonexception);
            return null;
        }
        return ((String) (obj));
    }

    public String toString()
    {
        return String.format(Locale.ENGLISH, "cached video id: %s, x: %d, y: %d, body width: %d, body height: %d, current position: %d, auto play: %b, player state: %d, video state: %d", new Object[] {
            cachedVideoID, Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(bodyWidth), Integer.valueOf(bodyHeight), Integer.valueOf(currentPosition), Boolean.valueOf(autoPlay), Integer.valueOf(playerState.ordinal()), Integer.valueOf(videoState.ordinal())
        });
    }

    public VideoState(String s)
    {
        playerState = PlayerState.DEFAULT;
        videoState = VideoState.DEFAULT;
        try
        {
            s = new JSONObject(s);
            x = Utils.getJSONInt(s, "x", 0);
            y = Utils.getJSONInt(s, "y", 0);
            bodyWidth = Utils.getJSONInt(s, "bodyWidth", 0);
            bodyHeight = Utils.getJSONInt(s, "bodyHeight", 0);
            width = Utils.getJSONInt(s, "width", 0);
            height = Utils.getJSONInt(s, "height", 0);
            expanded = Utils.getJSONBoolean(s, "expanded", false);
            currentPosition = Utils.getJSONInt(s, "currentPosition", 0);
            int i = Utils.getJSONInt(s, "playerState", 0);
            playerState = PlayerState.values()[i];
            i = Utils.getJSONInt(s, "videoState", 0);
            videoState = VideoState.values()[i];
            streamVideoURI = Utils.getJSONString(s, "streamVideoURI", "");
            cachedVideoURI = Utils.getJSONString(s, "cachedVideoURI", "");
            cachedVideoID = Utils.getJSONString(s, "cachedVideoID", "");
            touchCallBack = Utils.getJSONString(s, "touchCallBack", "");
            autoPlay = Utils.getJSONBoolean(s, "autoPlay", false);
            showControls = Utils.getJSONBoolean(s, "showControls", false);
            scaleFactor = (float)Utils.getJSONDouble(s, "scaleFactor", 0.0D);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MMLog.e("InlineVideoView", "Error creating inline param object", s);
        }
    }

    scaleFactor(Map map, Context context)
    {
        playerState = PlayerState.DEFAULT;
        videoState = VideoState.DEFAULT;
        if (map.get("x") != null)
        {
            x = (int)Float.parseFloat((String)map.get("x"));
        }
        if (map.get("y") != null)
        {
            y = (int)Float.parseFloat((String)map.get("y"));
        }
        if (map.get("width") != null)
        {
            width = (int)Float.parseFloat((String)map.get("width"));
        }
        if (map.get("height") != null)
        {
            height = (int)Float.parseFloat((String)map.get("height"));
        }
        streamVideoURI = (String)map.get("streamVideoURI");
        cachedVideoURI = (String)map.get("cachedVideoURI");
        cachedVideoID = (String)map.get("cachedVideoID");
        if (map.get("autoPlay") != null)
        {
            autoPlay = Boolean.parseBoolean((String)map.get("autoPlay"));
        }
        if (map.get("showControls") != null)
        {
            showControls = Boolean.parseBoolean((String)map.get("showControls"));
        }
        if (map.get("bodyWidth") != null)
        {
            bodyWidth = (int)Float.parseFloat((String)map.get("bodyWidth"));
        }
        if (map.get("bodyHeight") != null)
        {
            bodyHeight = (int)Float.parseFloat((String)map.get("bodyHeight"));
        }
        touchCallBack = (String)map.get("touchCallback");
        scaleFactor = context.getResources().getDisplayMetrics().density;
    }
}
