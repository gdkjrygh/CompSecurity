// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.adapter;

import android.view.View;
import com.spotify.mobile.android.spotlets.show.service.PlayedStateService;
import com.spotify.mobile.android.util.ClientEvent;
import fio;
import fop;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.adapter:
//            EpisodeAdapter

final class a
    implements android.view.ner
{

    private fio a;
    private EpisodeAdapter b;

    public final void onClick(View view)
    {
        PlayedStateService.a(b.a, a.b());
        EpisodeAdapter.b(b);
        fop.a(b.a, EpisodeAdapter.a(b), new ClientEvent(com.spotify.mobile.android.util..O, com.spotify.mobile.android.util.ent.dr));
    }

    e(EpisodeAdapter episodeadapter, fio fio1)
    {
        b = episodeadapter;
        a = fio1;
        super();
    }
}
