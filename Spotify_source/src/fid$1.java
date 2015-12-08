// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private fid a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (Show)obj;
        fve.a(fid.a(a)).f(((Show) (obj)).b(), ((Show) (obj)).a()).a(((HeaderableAdapter) (a)).b).a().a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
    }

    (fid fid1)
    {
        a = fid1;
        super();
    }
}
