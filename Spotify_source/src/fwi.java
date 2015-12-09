// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.CanDownload;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

final class fwi
    implements fwj, fwk, fwl, fwm, fwn, fwo
{

    private Context a;
    private fxr b;
    private Verified c;
    private CanDownload d;
    private Flags e;
    private Optional f;

    public fwi(Context context)
    {
        f = Optional.e();
        a = context;
    }

    public final fwj a(Verified verified)
    {
        c = verified;
        return this;
    }

    public final fwk a(Flags flags)
    {
        e = flags;
        return this;
    }

    public final fwl a(fxe fxe1)
    {
        f = Optional.b(fxe1);
        return this;
    }

    public final fwm a()
    {
        d = CanDownload.b;
        return this;
    }

    public final fwo a(String s, String s1)
    {
        b = fxr.a(s, s1);
        return this;
    }

    public final void a(SpotifyContextMenu spotifycontextmenu)
    {
        (new fwt((Context)ctz.a(a), (Verified)ctz.a(c), (SpotifyContextMenu)ctz.a(spotifycontextmenu), (CanDownload)ctz.a(d), (Flags)ctz.a(e), (fxe)f.a(fxe.a))).a(b);
    }
}
