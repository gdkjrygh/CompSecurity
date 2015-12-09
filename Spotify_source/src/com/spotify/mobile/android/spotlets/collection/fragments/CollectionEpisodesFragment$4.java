// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.fragments;

import android.view.View;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import fiy;
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
        if (!CollectionEpisodesFragment.i(a))
        {
            return;
        }
        CollectionEpisodesFragment.a(a, false);
        CollectionEpisodesFragment.a(a).a(CollectionEpisodesFragment.i(a));
        CollectionEpisodesFragment.a(a).b(CollectionEpisodesFragment.i(a));
        if (CollectionEpisodesFragment.l(a) && fiy.c(CollectionEpisodesFragment.o(a)))
        {
            CollectionEpisodesFragment.m(a).setVisibility(0);
        }
        if (CollectionEpisodesFragment.n(a))
        {
            CollectionEpisodesFragment.h(a).a(new int[] {
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
