// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseArtist;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class fwp extends fvd
{

    private final Context a;
    private final Verified b;
    private final Flags c;
    private final com.spotify.mobile.android.util.viewuri.ViewUri.SubView d;
    private final CanBrowseArtist e;
    private final CanRemoveFromCollection f;
    private final CanDownload g;
    private final SpotifyContextMenu h;
    private fuk i;

    fwp(Context context, Verified verified, SpotifyContextMenu spotifycontextmenu, CanBrowseArtist canbrowseartist, CanRemoveFromCollection canremovefromcollection, CanDownload candownload, Flags flags, 
            fxe fxe1)
    {
        super(spotifycontextmenu);
        a = context;
        b = verified;
        c = flags;
        d = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
        e = (CanBrowseArtist)ctz.a(canbrowseartist);
        f = (CanRemoveFromCollection)ctz.a(canremovefromcollection);
        g = (CanDownload)ctz.a(candownload);
        h = spotifycontextmenu;
        i = new fuk(context, b, d, spotifycontextmenu, (fxe)ctz.a(fxe1));
    }

    private boolean a()
    {
        return b.equals(ViewUri.bo);
    }

    private boolean b()
    {
        return (new SpotifyLink(b.toString())).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.x;
    }

    protected final fui a(String s, fxu fxu)
    {
        return new fxi(a, s, fxu);
    }

    protected final fxn a(String s)
    {
        return new fxn(s, "", "", SpotifyIcon.b, false);
    }

    protected final void b(fxr fxr1)
    {
        ctz.a(fxr1.a());
        h.a();
        enr enr1 = (enr)fxr1.b();
        fuk fuk1;
        boolean flag;
        boolean flag1;
        if (enr1.getCovers() != null)
        {
            fxr1 = enr1.getCovers().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.a);
        } else
        {
            fxr1 = "";
        }
        h.a = new fxn(enr1.getName(), enr1.getArtist().getName(), fxr1, SpotifyIcon.b, false);
        fxr1 = CollectionState.a(c, enr1.getNumTracksInCollection(), enr1.isSavedToCollection());
        fuk1 = i;
        if (f == CanRemoveFromCollection.a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        fuk1.a(fxr1, flag1, false, enr1.getUri(), c);
        if (g == CanDownload.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i.a(dti.c(enr1.getCollectionUri()), (new SpotifyLink(enr1.getCollectionUri())).c, enr1.getOfflineState(), enr1.getSyncProgress());
        }
        i.a(enr1.getUri(), gei.b(enr1.getArtist().getName(), enr1.getName()), c);
        if (enr1.isAnyTrackPlayable() && !((Boolean)c.a(fys.j)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((a() || b()) && flag)
        {
            i.a(enr1.getCollectionUri(), c);
        } else
        if (flag)
        {
            i.a(enr1.getUri(), c);
        }
        if (a() || b())
        {
            i.a(enr1.getUri(), enr1.getName(), 0x7f08020c);
        }
        if (e == CanBrowseArtist.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !gbx.a(enr1.getArtist().getName()))
        {
            i.b(enr1.getArtist().getUri(), enr1.getArtist().getName());
        }
        i.a(enr1.getName(), a.getString(0x7f0804d4, new Object[] {
            enr1.getArtist().getName()
        }), enr1.getUri());
        i.a(enr1.getName(), c, new String[] {
            enr1.getUri()
        });
        if (b == ViewUri.bj)
        {
            i.b(enr1.getUri());
        }
    }
}
