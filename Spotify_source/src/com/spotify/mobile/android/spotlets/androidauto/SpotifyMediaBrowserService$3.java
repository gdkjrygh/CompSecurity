// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.androidauto;

import ebg;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.androidauto:
//            SpotifyMediaBrowserService

final class a
    implements ebg
{

    private android.service.media.tifyMediaBrowserService.b a;
    private SpotifyMediaBrowserService b;

    public final void a(Throwable throwable)
    {
        a.ndResult(SpotifyMediaBrowserService.b());
    }

    public final void a(List list)
    {
        if (list.size() > 0)
        {
            a.ndResult(SpotifyMediaBrowserService.a(b, list));
            return;
        } else
        {
            a.ndResult(SpotifyMediaBrowserService.b());
            return;
        }
    }

    (SpotifyMediaBrowserService spotifymediabrowserservice, android.service.media.tifyMediaBrowserService tifymediabrowserservice)
    {
        b = spotifymediabrowserservice;
        a = tifymediabrowserservice;
        super();
    }
}
