// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class dpz
{

    public static final ImmutableMap a;

    static 
    {
        a = ImmutableMap.i().a(com.spotify.mobile.android.util.SpotifyLink.LinkType.g, new dpy() {

            public final void a(SpotifyContextMenu spotifycontextmenu, fve fve1, PorcelainNavigationLink porcelainnavigationlink, Verified verified, Flags flags, fxe fxe)
            {
                fve1.c(porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle()).a(verified).a(false).a(flags).a(fxe).a(spotifycontextmenu);
            }

        }).a(com.spotify.mobile.android.util.SpotifyLink.LinkType.c, new dpy() {

            public final void a(SpotifyContextMenu spotifycontextmenu, fve fve1, PorcelainNavigationLink porcelainnavigationlink, Verified verified, Flags flags, fxe fxe)
            {
                fve1.b(porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle()).a(verified).a(true).a().b(true).a(flags).a(fxe).a(spotifycontextmenu);
            }

        }).a(com.spotify.mobile.android.util.SpotifyLink.LinkType.an, new dpy() {

            public final void a(SpotifyContextMenu spotifycontextmenu, fve fve1, PorcelainNavigationLink porcelainnavigationlink, Verified verified, Flags flags, fxe fxe)
            {
                fve1.d(porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle()).a(verified).a(true).a(true).a(flags).a(fxe).a(spotifycontextmenu);
            }

        }).a(com.spotify.mobile.android.util.SpotifyLink.LinkType.aT, new dpy() {

            public final void a(SpotifyContextMenu spotifycontextmenu, fve fve1, PorcelainNavigationLink porcelainnavigationlink, Verified verified, Flags flags, fxe fxe)
            {
                fve1.a(porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle()).a(verified).a(true).a(true).a(true).a(false, null).a(flags).a(fxe).a(spotifycontextmenu);
            }

        }).a(com.spotify.mobile.android.util.SpotifyLink.LinkType.P, new dpy() {

            public final void a(SpotifyContextMenu spotifycontextmenu, fve fve1, PorcelainNavigationLink porcelainnavigationlink, Verified verified, Flags flags, fxe fxe)
            {
                fve1.e(porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle()).a(true).a(verified).b(false).d(true).e(false).f(false).a(flags).a(fxe).a(spotifycontextmenu);
            }

        }).a(com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ, new dpy() {

            public final void a(SpotifyContextMenu spotifycontextmenu, fve fve1, PorcelainNavigationLink porcelainnavigationlink, Verified verified, Flags flags, fxe fxe)
            {
                fve1.f(porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle()).a(verified).a().a(flags).a(fxe).a(spotifycontextmenu);
            }

        }).a();
    }
}
