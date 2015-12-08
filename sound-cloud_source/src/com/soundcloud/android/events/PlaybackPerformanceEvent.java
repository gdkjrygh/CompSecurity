// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackProtocol;

// Referenced classes of package com.soundcloud.android.events:
//            ConnectionType, PlayerType

public final class PlaybackPerformanceEvent
{

    public static final int METRIC_CACHE_USAGE_PERCENT = 6;
    public static final int METRIC_FRAGMENT_DOWNLOAD_RATE = 4;
    public static final int METRIC_TIME_TO_BUFFER = 2;
    public static final int METRIC_TIME_TO_LOAD = 5;
    public static final int METRIC_TIME_TO_PLAY = 0;
    public static final int METRIC_TIME_TO_PLAYLIST = 1;
    public static final int METRIC_TIME_TO_SEEK = 3;
    public static final int METRIC_UNINTERRUPTED_PLAYTIME_MS = 7;
    private final String cdnHost;
    private final ConnectionType connectionType;
    private final int metric;
    private final long metricValue;
    private final PlayerType playerType;
    private final PlaybackProtocol protocol;
    private final long timestamp = System.currentTimeMillis();
    private final Urn urn;

    private PlaybackPerformanceEvent(int i, long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, 
            Urn urn1)
    {
        metric = i;
        metricValue = l;
        protocol = playbackprotocol;
        playerType = playertype;
        cdnHost = s;
        connectionType = connectiontype;
        urn = urn1;
    }

    public static PlaybackPerformanceEvent cacheUsagePercent(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s)
    {
        return new PlaybackPerformanceEvent(6, l, playbackprotocol, playertype, connectiontype, s, Urn.NOT_SET);
    }

    public static PlaybackPerformanceEvent fragmentDownloadRate(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, Urn urn1)
    {
        return new PlaybackPerformanceEvent(4, l, playbackprotocol, playertype, connectiontype, s, urn1);
    }

    public static PlaybackPerformanceEvent timeToBuffer(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, Urn urn1)
    {
        return new PlaybackPerformanceEvent(2, l, playbackprotocol, playertype, connectiontype, s, urn1);
    }

    public static PlaybackPerformanceEvent timeToLoad(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, Urn urn1)
    {
        return new PlaybackPerformanceEvent(5, l, playbackprotocol, playertype, connectiontype, s, urn1);
    }

    public static PlaybackPerformanceEvent timeToPlay(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, Urn urn1)
    {
        return new PlaybackPerformanceEvent(0, l, playbackprotocol, playertype, connectiontype, s, urn1);
    }

    public static PlaybackPerformanceEvent timeToPlaylist(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, Urn urn1)
    {
        return new PlaybackPerformanceEvent(1, l, playbackprotocol, playertype, connectiontype, s, urn1);
    }

    public static PlaybackPerformanceEvent timeToSeek(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s, Urn urn1)
    {
        return new PlaybackPerformanceEvent(3, l, playbackprotocol, playertype, connectiontype, s, urn1);
    }

    public static PlaybackPerformanceEvent uninterruptedPlaytimeMs(long l, PlaybackProtocol playbackprotocol, PlayerType playertype, ConnectionType connectiontype, String s)
    {
        return new PlaybackPerformanceEvent(7, l, playbackprotocol, playertype, connectiontype, s, Urn.NOT_SET);
    }

    public final String getCdnHost()
    {
        return cdnHost;
    }

    public final ConnectionType getConnectionType()
    {
        return connectionType;
    }

    public final int getMetric()
    {
        return metric;
    }

    public final long getMetricValue()
    {
        return metricValue;
    }

    public final PlayerType getPlayerType()
    {
        return playerType;
    }

    public final PlaybackProtocol getProtocol()
    {
        return protocol;
    }

    public final long getTimestamp()
    {
        return timestamp;
    }

    public final Urn getUserUrn()
    {
        return urn;
    }
}
