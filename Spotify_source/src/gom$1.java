// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import java.util.Map;

final class ang.Object
    implements fuj
{

    private gom a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (PlayerTrack)obj;
        Object obj1 = fve.a(a.getContext()).a(((PlayerTrack) (obj)).uri(), (String)((PlayerTrack) (obj)).metadata().get("title")).a(gom.b(a));
        boolean flag;
        if (!TextUtils.isEmpty((CharSequence)((PlayerTrack) (obj)).metadata().get("album_uri")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = ((fww) (obj1)).a(flag);
        if (!TextUtils.isEmpty((CharSequence)((PlayerTrack) (obj)).metadata().get("artist_uri")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((fwx) (obj1)).a(flag).a(true).a(false, null).a(gom.a(a)).a(spotifycontextmenu);
    }

    (gom gom1)
    {
        a = gom1;
        super();
    }
}
