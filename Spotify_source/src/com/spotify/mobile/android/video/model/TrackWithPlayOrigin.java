// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

public class TrackWithPlayOrigin
    implements JacksonModel
{

    public String entityURI;
    public PlayOrigin playOrigin;
    public String playbackId;
    public PlayerTrack track;

    public TrackWithPlayOrigin()
    {
    }

    public TrackWithPlayOrigin(PlayerTrack playertrack, PlayOrigin playorigin, String s)
    {
        track = playertrack;
        playbackId = s;
    }
}
