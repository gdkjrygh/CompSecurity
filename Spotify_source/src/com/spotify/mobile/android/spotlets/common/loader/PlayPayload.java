// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.loader;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

public class PlayPayload
    implements JacksonModel
{

    private final PlayOptions mPlayOptions;
    private final PlayOrigin mPlayOrigin;

    public PlayPayload(PlayOptions playoptions, PlayOrigin playorigin)
    {
        mPlayOptions = playoptions;
        mPlayOrigin = playorigin;
    }

    public PlayOptions getPlayOptions()
    {
        return mPlayOptions;
    }

    public PlayOrigin getPlayOrigin()
    {
        return mPlayOrigin;
    }
}
