// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.internal:
//            LoggingParameters

public class SkipToTrackParameters
    implements JacksonModel
{

    public final LoggingParameters loggingParams = LoggingParameters.createWithCurrentTimestamp();
    public boolean overrideRestrictions;
    public PlayerTrack track;

    public SkipToTrackParameters()
    {
    }
}
