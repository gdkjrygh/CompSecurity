// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.adapter;

import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import fio;
import fiy;
import fuj;
import fve;
import fvh;
import fvi;
import fvj;
import fvk;
import fvl;
import fvn;
import fvq;
import fvr;
import fvs;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.adapter:
//            EpisodeAdapter

final class a
    implements fuj
{

    private EpisodeAdapter a;

    public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
    {
        boolean flag1 = true;
        obj = (fio)obj;
        fvq fvq1 = fve.a(a.a).e(((fio) (obj)).b(), ((fio) (obj)).a());
        boolean flag;
        if (((fio) (obj)).s() == com.spotify.mobile.android.spotlets.show.model.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = fvq1.a(flag).a(EpisodeAdapter.a(a)).b(true).c(EpisodeAdapter.e(a));
        if (!EpisodeAdapter.d(a))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((fvj) (obj)).d(flag).e(fiy.d(EpisodeAdapter.c(a))).f(fiy.d(EpisodeAdapter.c(a))).a(EpisodeAdapter.c(a)).a(spotifycontextmenu);
    }

    tMenu(EpisodeAdapter episodeadapter)
    {
        a = episodeadapter;
        super();
    }
}
