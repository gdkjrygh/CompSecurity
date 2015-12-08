// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.album.model.AlbumTrack;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private eft a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (AlbumTrack)obj;
        fve.a(eft.c(a)).a(((AlbumTrack) (obj)).uri, ((AlbumTrack) (obj)).name).a(eft.b(a)).a(false).a(true).a(true).a(false, null).a(eft.a(a)).a(spotifycontextmenu);
    }

    (eft eft1)
    {
        a = eft1;
        super();
    }
}
