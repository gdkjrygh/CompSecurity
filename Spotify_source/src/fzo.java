// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.porcelain.json.PorcelainJsonPage;
import com.spotify.mobile.android.porcelain.json.PorcelainJsonSpace;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonCellItem;
import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

abstract class fzo extends doq
    implements NavigationItem
{

    fzo()
    {
    }

    protected static PorcelainJsonPage a(ImmutableList immutablelist)
    {
        return new PorcelainJsonPage(null, new PorcelainJsonSpace(dpa.b(null, immutablelist), Boolean.valueOf(false), null, null), null, "");
    }

    protected static PorcelainJsonCellItem a(String s, String s1, PorcelainIcon porcelainicon)
    {
        dpe dpe1 = new dpe();
        dpe1.a = (new dpn()).a(s1).a();
        s = dpa.a(s);
        s.b = s1;
        dpe1.c = s.a();
        dpe1.d = dpa.a(dpa.a(porcelainicon)).a();
        s = (dpe)dpe1.a(new dpj());
        s.f = (com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize)ctz.a(com.spotify.mobile.android.porcelain.item.PorcelainCellItem.CellSize.a);
        s.g = true;
        return (PorcelainJsonCellItem)s.b();
    }

    protected final SpotifyIcon G()
    {
        return SpotifyIcon.g;
    }

    protected final Request H()
    {
        return new Request();
    }

    final void b(Flags flags)
    {
        if (g() == null)
        {
            f(new Bundle());
        }
        fyw.a(this, flags);
    }
}
