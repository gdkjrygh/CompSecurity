// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.album.model.AlbumRelease;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private efs a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (AlbumRelease)obj;
        fve.a(efs.c(a)).b(((AlbumRelease) (obj)).uri, ((AlbumRelease) (obj)).name).a(efs.b(a)).a(true).a().b(false).a(efs.a(a)).a(spotifycontextmenu);
    }

    (efs efs1)
    {
        a = efs1;
        super();
    }
}
