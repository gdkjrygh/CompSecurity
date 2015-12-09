// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.model.Artist;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.viewuri.ViewUri;

final class ang.Object
    implements fuj
{

    private emq a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        obj = (Artist)obj;
        obj = fve.a(emq.b(a)).c(((Artist) (obj)).e, ((Artist) (obj)).d).a(ViewUri.bn);
        boolean flag;
        if (!eom.c(emq.a(a)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((fuy) (obj)).a(flag).a(emq.a(a)).a(spotifycontextmenu);
    }

    (emq emq1)
    {
        a = emq1;
        super();
    }
}
