// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.SpotifyLink;

final class ang.Object
    implements fuj
{

    private ffo a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        fge fge1 = (fge)obj;
        ffo ffo1 = a;
        fve fve1 = fve.a(ffo1.b);
        obj = ((PorcelainNavigationLink)fge1.a).getTargetTitle();
        if (obj == null)
        {
            obj = "";
        }
        obj = (String)obj;
        switch (a[(new SpotifyLink(((PorcelainNavigationLink)fge1.a).getUri())).c.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            fve1.b(((PorcelainNavigationLink)fge1.a).getUri(), ((String) (obj))).a(ffo1.d.v_()).a(true).a().b(false).a(ffo1.c.a()).a(fxg.a(fge1, ffo1.e)).a(spotifycontextmenu);
            return;

        case 2: // '\002'
            fve1.c(((PorcelainNavigationLink)fge1.a).getUri(), ((String) (obj))).a(ffo1.d.v_()).a(false).a(ffo1.c.a()).a(fxg.a(fge1, ffo1.e)).a(spotifycontextmenu);
            return;

        case 3: // '\003'
            fve1.d(((PorcelainNavigationLink)fge1.a).getUri(), ((String) (obj))).a(ffo1.d.v_()).a(false).a(false).a(ffo1.c.a()).a(fxg.a(fge1, ffo1.e)).a(spotifycontextmenu);
            return;

        case 4: // '\004'
            fve1.a(((PorcelainNavigationLink)fge1.a).getUri(), ((String) (obj))).a(ffo1.d.v_()).a(true).a(true).a(true).a(false, null).a(ffo1.c.a()).a(fxg.a(fge1, ffo1.e)).a(spotifycontextmenu);
            return;

        case 5: // '\005'
            fve1.e(((PorcelainNavigationLink)fge1.a).getUri(), ((String) (obj))).a(false).a(ffo1.d.v_()).b(false).d(true).e(false).f(false).a(ffo1.c.a()).a(fxg.a(fge1, ffo1.e)).a(spotifycontextmenu);
            return;

        case 6: // '\006'
            fve1.f(((PorcelainNavigationLink)fge1.a).getUri(), ((String) (obj))).a(ffo1.d.v_()).a().a(ffo1.c.a()).a(fxg.a(fge1, ffo1.e)).a(spotifycontextmenu);
            break;
        }
    }

    (ffo ffo1)
    {
        a = ffo1;
        super();
    }
}
