// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements fuj
{

    private gok a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        RadioStationModel radiostationmodel = (RadioStationModel)obj;
        obj = new fuk(a.getContext(), gok.a(a), gok.b(a), spotifycontextmenu);
        ((fuk) (obj)).a(radiostationmodel.title, gok.c(a), new String[] {
            radiostationmodel.seeds[0]
        });
        ((fuk) (obj)).a(radiostationmodel.uri);
        obj = radiostationmodel.imageUri;
        if (obj == null)
        {
            obj = "";
        }
        spotifycontextmenu.b((String)obj);
        spotifycontextmenu.a.a = radiostationmodel.title;
        spotifycontextmenu.a.b = radiostationmodel.subtitle;
    }

    (gok gok1)
    {
        a = gok1;
        super();
    }
}
