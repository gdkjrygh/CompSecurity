// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import gdf;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.video.model:
//            TrackWithPlayOrigin

public class VideoPlayerCommand
    implements JacksonModel
{

    private static final gdf TYPE_PARSER = gdf.a(com/spotify/mobile/android/video/model/VideoPlayerCommand$Type);
    public TrackWithPlayOrigin futureTrackWithPlayOrigins[];
    public boolean initiallyPaused;
    public LoggingParameters loggingParameters;
    public PlayerTrack prefetchTracks[];
    public long seekToInMs;
    public String startReason;
    public boolean systemInitiated;
    public TrackWithPlayOrigin trackWithPlayOrigin;
    public Type type;

    VideoPlayerCommand(Type type1, long l, TrackWithPlayOrigin trackwithplayorigin, TrackWithPlayOrigin atrackwithplayorigin[], boolean flag, boolean flag1, 
            String s, LoggingParameters loggingparameters, PlayerTrack aplayertrack[])
    {
        type = type1;
        seekToInMs = l;
        trackWithPlayOrigin = trackwithplayorigin;
        futureTrackWithPlayOrigins = atrackwithplayorigin;
        initiallyPaused = flag;
        systemInitiated = flag1;
        if (s == null)
        {
            s = "unknown";
        }
        startReason = s;
        loggingParameters = loggingparameters;
        prefetchTracks = aplayertrack;
    }

    VideoPlayerCommand(String s, long l, TrackWithPlayOrigin trackwithplayorigin, TrackWithPlayOrigin atrackwithplayorigin[], boolean flag, boolean flag1, 
            String s1, LoggingParameters loggingparameters, PlayerTrack aplayertrack[], Long long1)
    {
        s = (Type)TYPE_PARSER.b(s).a(Type.g);
        if (long1 != null)
        {
            l = long1.longValue();
        }
        this(((Type) (s)), l, trackwithplayorigin, atrackwithplayorigin, flag, flag1, s1, loggingparameters, aplayertrack);
    }

    public static VideoPlayerCommand createEmptyCommand(Type type1)
    {
        return new VideoPlayerCommand(type1, 0L, null, null, false, false, null, null, null);
    }

    public static VideoPlayerCommand createSeekCommand(long l)
    {
        return new VideoPlayerCommand(Type.e, l, null, null, false, false, null, null, null);
    }

    public static VideoPlayerCommand createStartCommand(long l, TrackWithPlayOrigin trackwithplayorigin, TrackWithPlayOrigin atrackwithplayorigin[], boolean flag, boolean flag1, String s, LoggingParameters loggingparameters)
    {
        return new VideoPlayerCommand(Type.a, l, trackwithplayorigin, atrackwithplayorigin, flag, flag1, s, loggingparameters, null);
    }

    public boolean testIsEqualTo(VideoPlayerCommand videoplayercommand)
    {
        return Arrays.equals(JacksonSerializer.toBytes(this), JacksonSerializer.toBytes(videoplayercommand));
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        private static Type h;
        private static final Type i[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/video/model/VideoPlayerCommand$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])i.clone();
        }

        static 
        {
            h = new Type("SUBSCRIBED", 0);
            a = new Type("START", 1);
            b = new Type("STOP", 2);
            c = new Type("PAUSE", 3);
            d = new Type("RESUME", 4);
            e = new Type("SEEK_TO", 5);
            f = new Type("PREFETCH_TRACKS", 6);
            g = new Type("UNKNOWN", 7);
            i = (new Type[] {
                h, a, b, c, d, e, f, g
            });
        }

        private Type(String s, int j)
        {
            super(s, j);
        }
    }

}
