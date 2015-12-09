// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

public class PreparePlayParameters
    implements JacksonModel
{

    public PlayerContext context;
    public PlayOptions options;
    public PlayOrigin playOrigin;

    public PreparePlayParameters(PlayerContext playercontext, PlayOptions playoptions, PlayOrigin playorigin)
    {
        context = playercontext;
        options = playoptions;
        playOrigin = playorigin;
    }
}
