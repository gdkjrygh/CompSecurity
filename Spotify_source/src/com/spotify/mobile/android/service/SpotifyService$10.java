// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import com.spotify.mobile.android.connect.ConnectManager;
import dll;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a
    implements dll
{

    private SpotifyService a;

    public final void a()
    {
        SpotifyService.e(a).g();
    }

    public final void a(float f)
    {
        SpotifyService.e(a).a(f);
    }

    public final void a(String s)
    {
        SpotifyService.e(a).c(s);
    }

    public final void a(boolean flag)
    {
        SpotifyService.e(a).a(flag);
    }

    public final com.spotify.mobile.android.connect.nectState b()
    {
        return SpotifyService.e(a).c();
    }

    public final void c()
    {
        SpotifyService.e(a).h();
    }

    nectState(SpotifyService spotifyservice)
    {
        a = spotifyservice;
        super();
    }
}
