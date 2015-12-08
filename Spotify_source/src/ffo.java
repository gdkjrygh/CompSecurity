// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.SpotifyLink;

public final class ffo
{

    public final fuj a = new fuj() {

        private ffo a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            fge fge1 = (fge)obj;
            ffo ffo1 = a;
            fve fve1 = fve.a(ffo1.b);
            obj = ((PorcelainNavigationLink)fge1.a).getTargetTitle();
            final class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.g.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.P.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            if (obj == null)
            {
                obj = "";
            }
            obj = (String)obj;
            switch (_cls2.a[(new SpotifyLink(((PorcelainNavigationLink)fge1.a).getUri())).c.ordinal()])
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

            
            {
                a = ffo.this;
                super();
            }
    };
    public final Context b;
    final fyx c;
    final gjn d;
    final fxf e;

    public ffo(Context context, fyx fyx1, gjn gjn1, fxf fxf1)
    {
        b = (Context)ctz.a(context);
        c = (fyx)ctz.a(fyx1);
        d = (gjn)ctz.a(gjn1);
        e = (fxf)ctz.a(fxf1);
    }
}
