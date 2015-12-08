// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

final class ang.Object
    implements fuj
{

    private gol a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (RadioStationModel)obj;
        fuk fuk1 = new fuk(a.c, a.f, a.g, spotifycontextmenu);
        fuk1.a(((RadioStationModel) (obj)).title, a.h, new String[] {
            ((RadioStationModel) (obj)).seeds[0]
        });
        fuk1.a(((RadioStationModel) (obj)).uri);
        spotifycontextmenu.b(((RadioStationModel) (obj)).imageUri);
        spotifycontextmenu.a.a = ((RadioStationModel) (obj)).title;
        spotifycontextmenu.a.b = ((RadioStationModel) (obj)).subtitle;
    }

    (gol gol1)
    {
        a = gol1;
        super();
    }
}
