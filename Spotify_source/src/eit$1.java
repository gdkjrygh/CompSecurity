// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements fuj
{

    private eit a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (com.spotify.mobile.android.spotlets.artist.model.Model.Release)obj;
        fve.a(a.a).b(((com.spotify.mobile.android.spotlets.artist.model.Model.Release) (obj)).uri, ((com.spotify.mobile.android.spotlets.artist.model.Model.Release) (obj)).name).a(ViewUri.an.a(eit.b(a))).a(false).a().b(false).a(eit.a(a)).a(spotifycontextmenu);
    }

    (eit eit1)
    {
        a = eit1;
        super();
    }
}
