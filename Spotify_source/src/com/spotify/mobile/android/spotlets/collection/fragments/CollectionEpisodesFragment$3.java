// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.fragments;

import android.view.View;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import fpe;
import ftg;
import fzs;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.fragments:
//            CollectionEpisodesFragment

final class a
    implements fzs
{

    private CollectionEpisodesFragment a;

    public final void a()
    {
        boolean flag = true;
        if (CollectionEpisodesFragment.i(a))
        {
            return;
        }
        CollectionEpisodesFragment.a(a, true);
        CollectionEpisodesFragment.a(a).a(CollectionEpisodesFragment.i(a));
        EpisodeAdapter episodeadapter = CollectionEpisodesFragment.a(a);
        if (!CollectionEpisodesFragment.i(a) || !CollectionEpisodesFragment.l(a))
        {
            flag = false;
        }
        episodeadapter.b(flag);
        CollectionEpisodesFragment.m(a).setVisibility(8);
        if (CollectionEpisodesFragment.n(a))
        {
            CollectionEpisodesFragment.h(a).b(new int[] {
                0, 1, 2
            });
        }
        ((fpe)a.k()).P_();
    }

    (CollectionEpisodesFragment collectionepisodesfragment)
    {
        a = collectionepisodesfragment;
        super();
    }
}
