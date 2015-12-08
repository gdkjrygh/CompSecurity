// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItem;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements fuj
{

    private fdp a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        boolean flag = true;
        obj = (RecentlyPlayedItem)obj;
        switch (a[((RecentlyPlayedItem) (obj)).type.ordinal()])
        {
        default:
            Assertion.a((new StringBuilder("Unknown type with link: ")).append(((RecentlyPlayedItem) (obj)).link).toString());
            // fall through

        case 5: // '\005'
            return;

        case 1: // '\001'
            fve.a(fdp.c(a)).d(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a)).a(true).a(false).a(fdp.a(a)).a(spotifycontextmenu);
            return;

        case 2: // '\002'
            fve.a(fdp.c(a)).b(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a)).a(true).a().b(((RecentlyPlayedItem) (obj)).inCollection).a(fdp.a(a)).a(spotifycontextmenu);
            return;

        case 3: // '\003'
            fuy fuy1 = fve.a(fdp.c(a)).c(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a));
            if (((RecentlyPlayedItem) (obj)).tracksInCollectionCount <= 0)
            {
                flag = false;
            }
            fuy1.a(flag).a(fdp.a(a)).a(spotifycontextmenu);
            return;

        case 4: // '\004'
            fve.a(fdp.c(a)).f(((RecentlyPlayedItem) (obj)).link, ((RecentlyPlayedItem) (obj)).name).a(fdp.b(a)).a().a(fdp.a(a)).a(spotifycontextmenu);
            return;
        }
    }

    (fdp fdp1)
    {
        a = fdp1;
        super();
    }
}
