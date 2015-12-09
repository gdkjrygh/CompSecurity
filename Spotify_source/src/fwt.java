// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fwt extends fvd
{

    private final Context a;
    private final Verified b;
    private final SpotifyContextMenu c;
    private final CanDownload d;
    private final Flags e;
    private fuk f;

    public fwt(Context context, Verified verified, SpotifyContextMenu spotifycontextmenu, CanDownload candownload, Flags flags, fxe fxe1)
    {
        super(spotifycontextmenu);
        a = context;
        b = verified;
        c = spotifycontextmenu;
        d = (CanDownload)ctz.a(candownload);
        f = new fuk(context, b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, spotifycontextmenu, (fxe)ctz.a(fxe1));
        e = flags;
    }

    protected final fui a(String s, fxu fxu)
    {
        return new fxl(a, s, fxu);
    }

    protected final fxn a(String s)
    {
        return new fxn(s, "", "", SpotifyIcon.aX, false);
    }

    protected final void b(fxr fxr1)
    {
        ctz.a(fxr1.a());
        Show show = (Show)fxr1.b();
        c.a();
        int i;
        boolean flag;
        if (show.c() != null)
        {
            fxr1 = show.c().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            fxr1 = "";
        }
        fxr1 = new fxn(show.a(), show.d(), fxr1, SpotifyIcon.aX, false);
        fxr1.c = fiw.a(show.f());
        c.a = fxr1;
        fxr1 = c;
        i = a.getResources().getInteger(0x7f0e0019);
        ((SpotifyContextMenu) (fxr1)).a.h = i;
        if (fiy.a(e))
        {
            f.a(show.g(), true, false, show.b(), e);
        }
        if (d == CanDownload.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f.a(show.b(), com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ, 0, 0);
        }
        if (b == ViewUri.bj)
        {
            f.b(show.b());
        }
        if (fiy.d(e))
        {
            f.a(show.a(), "", show.b());
        }
    }
}
