// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanAddToCollection;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseShow;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanChangePlayedState;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.IsVideo;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.ShowRemoveFromQueue;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

final class fvg
    implements fvh, fvi, fvj, fvk, fvl, fvm, fvn, fvo, fvp, fvq, fvr, fvs
{

    private Context a;
    private fxr b;
    private Verified c;
    private IsVideo d;
    private CanDownload e;
    private CanBrowseShow f;
    private CanAddToCollection g;
    private CanChangePlayedState h;
    private ShowRemoveFromQueue i;
    private Integer j;
    private boolean k;
    private Flags l;
    private Optional m;

    public fvg(Context context)
    {
        i = ShowRemoveFromQueue.b;
        m = Optional.e();
        a = context;
    }

    public final fvl a(Verified verified)
    {
        c = verified;
        return this;
    }

    public final fvn a(Flags flags)
    {
        l = flags;
        return this;
    }

    public final fvo a(fxe fxe1)
    {
        m = Optional.b(fxe1);
        return this;
    }

    public final fvp a(boolean flag, Integer integer)
    {
        ShowRemoveFromQueue showremovefromqueue;
        if (flag)
        {
            showremovefromqueue = ShowRemoveFromQueue.a;
        } else
        {
            showremovefromqueue = ShowRemoveFromQueue.b;
        }
        i = showremovefromqueue;
        j = integer;
        return this;
    }

    public final fvq a(String s, String s1)
    {
        b = fxr.a(s, s1);
        return this;
    }

    public final fvs a(boolean flag)
    {
        IsVideo isvideo;
        if (flag)
        {
            isvideo = IsVideo.a;
        } else
        {
            isvideo = IsVideo.b;
        }
        d = isvideo;
        return this;
    }

    public final void a(SpotifyContextMenu spotifycontextmenu)
    {
        com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu.HeaderViewType headerviewtype;
        if (d == IsVideo.a)
        {
            headerviewtype = com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu.HeaderViewType.b;
        } else
        {
            headerviewtype = com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu.HeaderViewType.a;
        }
        spotifycontextmenu.c = headerviewtype;
        (new fwr((Context)ctz.a(a), (Verified)ctz.a(c), (SpotifyContextMenu)ctz.a(spotifycontextmenu), (CanDownload)ctz.a(e), (CanBrowseShow)ctz.a(f), (CanAddToCollection)ctz.a(g), (CanChangePlayedState)ctz.a(h), (ShowRemoveFromQueue)ctz.a(i), j, (Flags)ctz.a(l), (fxe)m.a(fxe.a), k)).a(b);
    }

    public final fvi b(boolean flag)
    {
        CanDownload candownload;
        if (flag)
        {
            candownload = CanDownload.a;
        } else
        {
            candownload = CanDownload.b;
        }
        e = candownload;
        return this;
    }

    public final fvj c(boolean flag)
    {
        k = flag;
        return this;
    }

    public final fvh d(boolean flag)
    {
        CanBrowseShow canbrowseshow;
        if (flag)
        {
            canbrowseshow = CanBrowseShow.a;
        } else
        {
            canbrowseshow = CanBrowseShow.b;
        }
        f = canbrowseshow;
        return this;
    }

    public final fvk e(boolean flag)
    {
        CanAddToCollection canaddtocollection;
        if (flag)
        {
            canaddtocollection = CanAddToCollection.a;
        } else
        {
            canaddtocollection = CanAddToCollection.b;
        }
        g = canaddtocollection;
        return this;
    }

    public final fvr f(boolean flag)
    {
        CanChangePlayedState canchangeplayedstate;
        if (flag)
        {
            canchangeplayedstate = CanChangePlayedState.a;
        } else
        {
            canchangeplayedstate = CanChangePlayedState.b;
        }
        h = canchangeplayedstate;
        return this;
    }
}
