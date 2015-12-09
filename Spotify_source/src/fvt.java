// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanRemovePlaylist;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fvt
{

    fxr a;
    Verified b;
    CanDownload c;
    CanRemovePlaylist d;
    Flags e;
    private Context f;
    private Optional g;

    private fvt()
    {
        g = Optional.e();
    }

    public static fvx a(Context context)
    {
        fvt fvt1 = new fvt();
        fvt1.f = context;
        return new fvx(fvt1, (byte)0);
    }

    public final fvt a(fxe fxe1)
    {
        g = Optional.b(fxe1);
        return this;
    }

    public final void a(SpotifyContextMenu spotifycontextmenu)
    {
        (new fws((Context)ctz.a(f), (Verified)ctz.a(b), (SpotifyContextMenu)ctz.a(spotifycontextmenu), (CanDownload)ctz.a(c), (CanRemovePlaylist)ctz.a(d), (Flags)ctz.a(e), (fxe)g.a(fxe.a))).a(a);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fvt)obj;
            if (c != ((fvt) (obj)).c)
            {
                return false;
            }
            if (d != ((fvt) (obj)).d)
            {
                return false;
            }
            if (!f.equals(((fvt) (obj)).f))
            {
                return false;
            }
            if (!a.equals(((fvt) (obj)).a))
            {
                return false;
            }
            if (!b.equals(((fvt) (obj)).b))
            {
                return false;
            }
            if (!e.equals(((fvt) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((f.hashCode() * 31 + a.hashCode()) * 31 + b.hashCode()) * 31 + c.hashCode()) * 31 + d.hashCode();
    }
}
