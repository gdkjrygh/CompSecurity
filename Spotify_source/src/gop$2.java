// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;

final class ang.Object
    implements fuj
{

    private gop a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        int j = 0;
        obj = (RadioStationsModel)obj;
        spotifycontextmenu.a();
        spotifycontextmenu.a(a.b(0x7f08018a));
        String s = a.b(0x7f080189);
        spotifycontextmenu.a.c = s;
        obj = ((RadioStationsModel) (obj)).clusterStations;
        int k = obj.length;
        for (int i = 0; j < k; i++)
        {
            Object obj1 = obj[j];
            fxp fxp1 = spotifycontextmenu.a(i, ((RadioStationModel) (obj1)).title);
            fxp1.d = gop.c(a);
            fxp1.f = obj1;
            j++;
        }

    }

    (gop gop1)
    {
        a = gop1;
        super();
    }
}
