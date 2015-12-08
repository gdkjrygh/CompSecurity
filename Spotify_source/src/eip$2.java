// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private eip a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (com.spotify.mobile.android.spotlets.artist.model.Model.Playlist)obj;
        fve.a(eip.c(a)).d(((com.spotify.mobile.android.spotlets.artist.model.Model.Playlist) (obj)).uri, ((com.spotify.mobile.android.spotlets.artist.model.Model.Playlist) (obj)).name).a(eip.b(a)).a(false).a(false).a(eip.a(a)).a(spotifycontextmenu);
    }

    (eip eip1)
    {
        a = eip1;
        super();
    }
}
