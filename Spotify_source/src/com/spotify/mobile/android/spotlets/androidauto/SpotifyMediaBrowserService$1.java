// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.androidauto;

import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dwx;
import dxc;
import ebe;
import ebf;
import ebi;
import efv;

// Referenced classes of package com.spotify.mobile.android.spotlets.androidauto:
//            SpotifyMediaBrowserService

final class a
    implements dwx
{

    private SpotifyMediaBrowserService a;

    public final void a(Flags flags)
    {
        flags = new ebe(a, "spotify_media_browser_root");
        SpotifyMediaBrowserService.a(a).a.a(new ebi[] {
            flags
        });
        a.notifyChildrenChanged("spotify_media_browser_root");
        SpotifyMediaBrowserService.a(a).a(SpotifyMediaBrowserService.a());
        SpotifyMediaBrowserService.b(a);
        SpotifyMediaBrowserService.c(a).b(this);
        SpotifyMediaBrowserService.d(a).a(true);
    }

    (SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        a = spotifymediabrowserservice;
        super();
    }
}
