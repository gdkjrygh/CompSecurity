// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.party.adapter;

import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import fuj;
import fve;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;

// Referenced classes of package com.spotify.mobile.android.spotlets.party.adapter:
//            PartyTracksAdapter

final class a
    implements fuj
{

    private PartyTracksAdapter a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (TrackJacksonModel)obj;
        fve.a(PartyTracksAdapter.c(a)).a(((TrackJacksonModel) (obj)).uri, ((TrackJacksonModel) (obj)).name).a(PartyTracksAdapter.b(a)).a(true).a(true).a(true).a(false, null).a(PartyTracksAdapter.a(a)).a(spotifycontextmenu);
    }

    (PartyTracksAdapter partytracksadapter)
    {
        a = partytracksadapter;
        super();
    }
}
