// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private ems a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (enw)obj;
        fve.a(a.a).a(((enw) (obj)).getUri(), ((enw) (obj)).getName()).a(((HeaderableAdapter) (a)).b).a(true).a(true).a(true).a(false, null).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
    }

    (ems ems1)
    {
        a = ems1;
        super();
    }
}
