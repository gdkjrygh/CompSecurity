// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

final class ang.Object
    implements fuj
{

    private emp a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (ent)obj;
        obj = fve.a(a.a).c(((ent) (obj)).getUri(), ((ent) (obj)).getName()).a(((HeaderableAdapter) (a)).b);
        boolean flag;
        if (!eom.c(((HeaderableAdapter) (a)).c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((fuy) (obj)).a(flag).a(((HeaderableAdapter) (a)).c).a(spotifycontextmenu);
    }

    (emp emp1)
    {
        a = emp1;
        super();
    }
}
