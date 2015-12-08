// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements fuj
{

    private fjd a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (TrackModel)obj;
        Object obj1 = fve.a(a.k()).a(((TrackModel) (obj)).getTrackUri(), ((TrackModel) (obj)).getTrackName()).a(ViewUri.o).a(true).a(true).a(true).a(false, null).a(fjd.a(a));
        obj1.j = Optional.b(((TrackModel) (obj)).getInfluencers());
        obj1 = new fxb(((fwv) (obj1)), (byte)0);
        int i = ((TrackModel) (obj)).getRank();
        ((fxb) (obj1)).a.k = i - 1;
        ((fxb) (obj1)).a.a(spotifycontextmenu);
    }

    (fjd fjd1)
    {
        a = fjd1;
        super();
    }
}
