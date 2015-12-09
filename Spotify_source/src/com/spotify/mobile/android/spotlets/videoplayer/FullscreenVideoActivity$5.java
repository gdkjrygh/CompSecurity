// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import fiy;
import fuj;
import fve;
import fvh;
import fvi;
import fvk;
import fvl;
import fvn;
import fvq;
import fvr;
import fvs;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity

final class a
    implements fuj
{

    private FullscreenVideoActivity a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (PlayerTrack)obj;
        fve.a(a).e(((PlayerTrack) (obj)).uri(), (String)((PlayerTrack) (obj)).metadata().get("title")).a("video".equals(((PlayerTrack) (obj)).metadata().get("media.type"))).a(ViewUri.K).b(true).d(fiy.a(FullscreenVideoActivity.d(a))).e(fiy.d(FullscreenVideoActivity.d(a))).f(false).a(FullscreenVideoActivity.d(a)).a(spotifycontextmenu);
    }

    (FullscreenVideoActivity fullscreenvideoactivity)
    {
        a = fullscreenvideoactivity;
        super();
    }
}
