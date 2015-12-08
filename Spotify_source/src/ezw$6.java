// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.Map;

final class ang.Object
    implements fuj
{

    final ezw a;
    private u b;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (PlayerTrack)obj;
        Object obj1 = (new SpotifyLink(((PlayerTrack) (obj)).uri())).c;
        String s = (String)((PlayerTrack) (obj)).metadata().get("title");
        fxe fxe = new fxe() {

            private ezw._cls6 b;

            public final void a(com.spotify.mobile.android.util.ClientEvent.Event event)
            {
                if (event == com.spotify.mobile.android.util.ClientEvent.Event.K)
                {
                    ezw.c(b.a).a(Boolean.valueOf(true));
                } else
                {
                    if (event == com.spotify.mobile.android.util.ClientEvent.Event.M)
                    {
                        ezw.c(b.a).a(Boolean.valueOf(false));
                        return;
                    }
                    if (event == com.spotify.mobile.android.util.ClientEvent.Event.L)
                    {
                        ezw.c(b.a).a(null);
                        return;
                    }
                }
            }

            
            {
                b = ezw._cls6.this;
                super();
            }
        };
        if (obj1 == com.spotify.mobile.android.util.yLink.LinkType.P)
        {
            fve.a(b).e(((PlayerTrack) (obj)).uri(), s).a("video".equals(((PlayerTrack) (obj)).metadata().get("media.type"))).a(ViewUri.K).b(true).d(fiy.a(ezw.f(a))).e(fiy.d(ezw.f(a))).f(false).a(ezw.f(a)).a(fxe).a(spotifycontextmenu);
            return;
        }
        obj1 = fve.a(b).a(((PlayerTrack) (obj)).uri(), s).a(ViewUri.K);
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
        ((fwx) (obj1)).a(flag).a(true).a(false, null).a(ezw.f(a)).a(fxe).a(spotifycontextmenu);
    }

    (ezw ezw1, u u)
    {
        a = ezw1;
        b = u;
        super();
    }
}
