// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.playback.PlaybackProtocol;

// Referenced classes of package com.soundcloud.android.events:
//            ConnectionType

public class PlaybackErrorEvent
{

    public static final String BITRATE_128 = "128";
    public static final String FORMAT_MP3 = "mp3";
    private final String bitrate;
    private final String category;
    private final String cdnHost;
    private final ConnectionType connectionType;
    private final String format;
    private final PlaybackProtocol protocol;
    private final long timestamp;

    public PlaybackErrorEvent(String s, PlaybackProtocol playbackprotocol, String s1, ConnectionType connectiontype)
    {
        this(s, playbackprotocol, s1, "128", "mp3", connectiontype);
    }

    public PlaybackErrorEvent(String s, PlaybackProtocol playbackprotocol, String s1, String s2, String s3, ConnectionType connectiontype)
    {
        category = s;
        protocol = playbackprotocol;
        cdnHost = s1;
        bitrate = s2;
        format = s3;
        connectionType = connectiontype;
        timestamp = System.currentTimeMillis();
    }

    public String getBitrate()
    {
        return bitrate;
    }

    public String getCategory()
    {
        return category;
    }

    public String getCdnHost()
    {
        return cdnHost;
    }

    public ConnectionType getConnectionType()
    {
        return connectionType;
    }

    public String getFormat()
    {
        return format;
    }

    public PlaybackProtocol getProtocol()
    {
        return protocol;
    }

    public long getTimestamp()
    {
        return timestamp;
    }
}
