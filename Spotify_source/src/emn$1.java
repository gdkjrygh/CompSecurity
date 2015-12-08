// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private emn a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (enr)obj;
        fve.a(a.a).b(((enr) (obj)).getUri(), ((enr) (obj)).getName()).a(((HeaderableAdapter) (a)).b).a(true).a().b(true).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
    }

    (emn emn1)
    {
        a = emn1;
        super();
    }
}
