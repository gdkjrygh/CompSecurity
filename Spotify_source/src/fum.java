// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseArtist;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

final class fum
    implements fun, fuo, fup, fuq, fur, fus, fut, fuu
{

    private Context a;
    private fxr b;
    private Verified c;
    private CanBrowseArtist d;
    private CanRemoveFromCollection e;
    private CanDownload f;
    private Flags g;
    private Optional h;

    fum(Context context)
    {
        h = Optional.e();
        a = context;
    }

    public final fuo a(Verified verified)
    {
        c = verified;
        return this;
    }

    public final fup a()
    {
        e = CanRemoveFromCollection.a;
        return this;
    }

    public final fuq a(boolean flag)
    {
        CanBrowseArtist canbrowseartist;
        if (flag)
        {
            canbrowseartist = CanBrowseArtist.a;
        } else
        {
            canbrowseartist = CanBrowseArtist.b;
        }
        d = canbrowseartist;
        return this;
    }

    public final fur a(Flags flags)
    {
        g = flags;
        return this;
    }

    public final fus a(fxe fxe1)
    {
        h = Optional.b(fxe1);
        return this;
    }

    public final fuu a(String s, String s1)
    {
        b = fxr.a(s, s1);
        return this;
    }

    public final void a(SpotifyContextMenu spotifycontextmenu)
    {
        (new fwp((Context)ctz.a(a), (Verified)ctz.a(c), (SpotifyContextMenu)ctz.a(spotifycontextmenu), (CanBrowseArtist)ctz.a(d), (CanRemoveFromCollection)ctz.a(e), (CanDownload)ctz.a(f), (Flags)ctz.a(g), (fxe)h.a(fxe.a))).a(b);
    }

    public final fut b(boolean flag)
    {
        CanDownload candownload;
        if (flag)
        {
            candownload = CanDownload.a;
        } else
        {
            candownload = CanDownload.b;
        }
        f = candownload;
        return this;
    }
}
