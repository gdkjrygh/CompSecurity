// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.androidauto;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import ctv;
import gei;

// Referenced classes of package com.spotify.mobile.android.spotlets.androidauto:
//            SpotifyMediaBrowserService

final class a
    implements ctv
{

    private SpotifyMediaBrowserService a;

    public final Object a(Object obj)
    {
        obj = (MediaBrowserItem)obj;
        android.media.MediaDescription mediadescription = (new android.media.t>()).ediaId(((MediaBrowserItem) (obj)).a).itle(gei.a(((MediaBrowserItem) (obj)).c, SpotifyMediaBrowserService.a(a).getResources().getConfiguration().locale)).ubtitle(((MediaBrowserItem) (obj)).d).conUri(((MediaBrowserItem) (obj)).e).d();
        int i;
        if (com.spotify.mobile.android.service.media.browser..quals(((MediaBrowserItem) (obj)).b))
        {
            i = 1;
        } else
        {
            i = 2;
        }
        return new android.media.browse.(mediadescription, i);
    }

    (SpotifyMediaBrowserService spotifymediabrowserservice)
    {
        a = spotifymediabrowserservice;
        super();
    }
}
