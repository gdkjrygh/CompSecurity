// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseAlbum;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanBrowseArtist;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemoveTrack;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.ShowRemoveFromQueue;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fwv
{

    Context a;
    fxr b;
    Verified c;
    CanBrowseAlbum d;
    CanBrowseArtist e;
    CanRemoveFromCollection f;
    CanRemoveTrack g;
    public boolean h;
    Flags i;
    public Optional j;
    public int k;
    public ShowRemoveFromQueue l;
    public Optional m;
    private Optional n;
    private Optional o;

    fwv()
    {
        n = Optional.e();
        o = Optional.e();
        j = Optional.e();
        l = ShowRemoveFromQueue.b;
        m = Optional.e();
    }

    public final fwv a(fxe fxe1)
    {
        o = Optional.b(fxe1);
        return this;
    }

    public final fwv a(String s)
    {
        n = Optional.b(s);
        return this;
    }

    public final void a(SpotifyContextMenu spotifycontextmenu)
    {
        (new fwu((Context)ctz.a(a), (Verified)ctz.a(c), (SpotifyContextMenu)ctz.a(spotifycontextmenu), (CanBrowseAlbum)ctz.a(d), (CanBrowseArtist)ctz.a(e), (CanRemoveFromCollection)ctz.a(f), (CanRemoveTrack)ctz.a(g), n, i, h, (fxe)o.a(fxe.a), (InfluencerModel[])j.a(new InfluencerModel[0]), k, l, m)).a(b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fwv)obj;
            if (d != ((fwv) (obj)).d)
            {
                return false;
            }
            if (e != ((fwv) (obj)).e)
            {
                return false;
            }
            if (f != ((fwv) (obj)).f)
            {
                return false;
            }
            if (g != ((fwv) (obj)).g)
            {
                return false;
            }
            if (!a.equals(((fwv) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((fwv) (obj)).b))
            {
                return false;
            }
            if (!n.equals(((fwv) (obj)).n))
            {
                return false;
            }
            if (!c.equals(((fwv) (obj)).c))
            {
                return false;
            }
            if (l != ((fwv) (obj)).l)
            {
                return false;
            }
            if (m == null && ((fwv) (obj)).m != null)
            {
                return false;
            }
            if (m != null && !m.equals(((fwv) (obj)).m))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j1 = a.hashCode();
        int k1 = b.hashCode();
        int l1 = c.hashCode();
        int i2 = d.hashCode();
        int j2 = e.hashCode();
        int k2 = f.hashCode();
        int l2 = g.hashCode();
        int i3 = n.hashCode();
        int i1;
        if (h)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return ((i1 + (((((((j1 * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 * 31) * 31 + l.hashCode()) * 31 + m.hashCode();
    }
}
