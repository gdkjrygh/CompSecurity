// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import gjz;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.video.model:
//            TrackWithPlayOrigin

public class VideoPlayerError
    implements JacksonModel
{

    public static final String CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY = "playback_id";
    public static final String CONTEXT_PLAYER_ERROR_REASON_KEY = "reasons";
    public static final String CONTEXT_PLAYER_ERROR_TRACK_URI_KEY = "track_uri";
    public static final String ERROR_GEORESTRICTED = "video_georestricted";
    public static final String ERROR_IN_OFFLINE_MODE = "track_unavailable_offline";
    public static final String ERROR_MANIFEST_DELETED = "video_manifest_deleted";
    public static final String ERROR_PLAYBACK = "video_playback_error";
    public static final String ERROR_UNSUPPORTED_CLIENT_VERSION = "video_unsupported_client_version";
    public static final String ERROR_UNSUPPORTED_PLATFORM_VERSION = "video_unsopported_platform_version";
    public final Map data;
    public final String type;

    public VideoPlayerError(String s, gjz gjz1)
    {
        HashMap hashmap = new HashMap();
        if (gjz1 != null && gjz1.b != null && gjz1.b.track != null)
        {
            hashmap.put("track_uri", gjz1.b.track.uri());
            hashmap.put("playback_id", gjz1.a);
        }
        type = s;
        data = hashmap;
    }

    public VideoPlayerError(String s, Map map)
    {
        type = s;
        data = map;
    }
}
