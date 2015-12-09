// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class fug
{

    static final Set a;
    final fud b;
    boolean c;
    ddv d;

    public fug(fud fud)
    {
        b = fud;
        c = false;
    }

    static fud a(fug fug1)
    {
        return fug1.b;
    }

    final void a(SpotifyContextMenu spotifycontextmenu, boolean flag)
    {
        if (!c)
        {
            return;
        } else
        {
            d.a(b(spotifycontextmenu, flag));
            return;
        }
    }

    final deh b(SpotifyContextMenu spotifycontextmenu, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        fxp fxp1;
        for (Iterator iterator = spotifycontextmenu.d.iterator(); iterator.hasNext(); arraylist.add(new dei(fxp1.a, fxp1.b, fxp1.c, fxp1.e, new fuh(this, fxp1, (byte)0))))
        {
            fxp1 = (fxp)iterator.next();
        }

        String s = spotifycontextmenu.a.a;
        int i = spotifycontextmenu.a.h;
        String s1 = spotifycontextmenu.b;
        String s2 = spotifycontextmenu.a.b;
        android.net.Uri uri = dto.a(spotifycontextmenu.a.e);
        boolean flag2 = spotifycontextmenu.a.g;
        com.spotify.android.paste.graphics.SpotifyIcon spotifyicon = spotifycontextmenu.a.f;
        boolean flag1;
        if (spotifycontextmenu.c == com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu.HeaderViewType.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return new deh(s, i, s1, s2, uri, flag2, spotifyicon, flag1, spotifycontextmenu.a.c, spotifycontextmenu.a.d, arraylist, spotifycontextmenu.c(), flag);
    }

    static 
    {
        HashSet hashset = new HashSet();
        a = hashset;
        hashset.add(Integer.valueOf(0x7f11002b));
        a.add(Integer.valueOf(0x7f11002a));
        a.add(Integer.valueOf(0x7f110027));
        a.add(Integer.valueOf(0x7f1100b2));
    }
}
