// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;

final class ang.Object
    implements fuj
{

    private don a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        Object obj1 = (Pair)obj;
        obj = a;
        dom dom1 = (dom)((Pair) (obj1)).first;
        obj1 = (dpy)((Pair) (obj1)).second;
        Verified verified = (Verified)ctz.a(((don) (obj)).c.v_());
        Flags flags = (Flags)ctz.a(((don) (obj)).d.a());
        ((dpy) (obj1)).a(spotifycontextmenu, fve.a(((don) (obj)).e), dom1.a, verified, flags, fxg.a(dom1, ((don) (obj)).f));
    }

    (don don1)
    {
        a = don1;
        super();
    }
}
