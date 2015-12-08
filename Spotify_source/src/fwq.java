// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fwq extends fvd
{

    private final Context a;
    private final Verified b;
    private final SpotifyContextMenu c;
    private final CanDownload d;
    private final Flags e;
    private fuk f;

    public fwq(Context context, Verified verified, SpotifyContextMenu spotifycontextmenu, CanDownload candownload, Flags flags, fxe fxe1)
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
        return new fxj(a, s, fxu);
    }

    protected final fxn a(String s)
    {
        return new fxn(s, "", "", SpotifyIcon.d, true);
    }

    protected final void b(fxr fxr1)
    {
        ctz.a(fxr1.a());
        ent ent1 = (ent)fxr1.b();
        c.a();
        boolean flag;
        if (ent1.getCovers() != null)
        {
            fxr1 = ent1.getCovers().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            fxr1 = "";
        }
        c.a = new fxn(ent1.getName(), "", fxr1, SpotifyIcon.d, true);
        if (eom.c(e) || ent1.getNumTracksInCollection() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d == CanDownload.a && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f.a(dti.a(ent1.getCollectionUri()), (new SpotifyLink(ent1.getCollectionUri())).c, ent1.getOfflineState(), ent1.getSyncProgress());
        }
        if (b.equals(ViewUri.bn))
        {
            if (ent1.isFollowed())
            {
                f.b(ent1.getUri(), ent1.getName());
            } else
            {
                f.b(ent1.getUri(), ent1.getName(), 0x7f08020b);
            }
        }
        f.a(ent1.getName(), "", ent1.getUri());
        f.a(ent1.getName(), e, new String[] {
            ent1.getUri()
        });
        if (b == ViewUri.bj)
        {
            f.b(ent1.getUri());
        }
    }
}
