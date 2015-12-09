// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.adapter;

import android.view.View;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.offline.service.OfflineService;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import dmz;
import fio;
import fop;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.adapter:
//            EpisodeAdapter

final class b
    implements android.view.ner
{

    private fio a;
    private boolean b;
    private EpisodeAdapter c;

    public final void onClick(View view)
    {
        OfflineService.a(c.a, a.b(), b);
        EpisodeAdapter.b(c);
        fop.a(c.a, EpisodeAdapter.a(c), new ClientEvent(com.spotify.mobile.android.util..O, com.spotify.mobile.android.util.ent.dq));
        if (b)
        {
            CollectionService.a(c.a, a.o().b(), EpisodeAdapter.a(c).toString(), EpisodeAdapter.c(c), com.spotify.mobile.android.spotlets.collection.service..Messaging.a);
            dmz.a(fop);
            fop.a(c.a, EpisodeAdapter.a(c), ClientEventFactory.a("edit-mode", com.spotify.mobile.android.util.ent.bH, null, null));
        }
    }

    ervice(EpisodeAdapter episodeadapter, fio fio1, boolean flag)
    {
        c = episodeadapter;
        a = fio1;
        b = flag;
        super();
    }
}
