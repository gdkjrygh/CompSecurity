// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import dnz;
import dob;
import fuj;
import fve;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements fuj
{

    private PlaylistFragment a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (dnz)obj;
        obj = fve.a(a.k()).a(((dnz) (obj)).e, ((dnz) (obj)).b).a(PlaylistFragment.c(a)).a(true).a(true).a(true).a(PlaylistFragment.a(a).A(), Integer.valueOf(((dnz) (obj)).h)).a(PlaylistFragment.b(a)).a(PlaylistFragment.a(a).a());
        obj.h = PlaylistFragment.a(a).n();
        ((fwv) (obj)).a(spotifycontextmenu);
    }

    (PlaylistFragment playlistfragment)
    {
        a = playlistfragment;
        super();
    }
}
