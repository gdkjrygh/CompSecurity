// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import com.spotify.mobile.android.orbit.OrbitServiceInterface;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a
    implements Runnable
{

    private SpotifyService a;

    public final void run()
    {
        SpotifyService.m(a).crash();
    }

    e(SpotifyService spotifyservice)
    {
        a = spotifyservice;
        super();
    }
}
