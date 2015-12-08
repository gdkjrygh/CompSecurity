// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.fragments;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.util.viewuri.Verified;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.fragments:
//            CollectionEpisodesFragment

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.esFragment._cls2
{

    private CollectionEpisodesFragment a;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        boolean flag1 = false;
        if (playerstate.track() != null && TextUtils.equals(CollectionEpisodesFragment.k(a).toString(), playerstate.entityUri()))
        {
            EpisodeAdapter episodeadapter = CollectionEpisodesFragment.a(a);
            String s = playerstate.track().uri();
            boolean flag = flag1;
            if (playerstate.isPlaying())
            {
                flag = flag1;
                if (!playerstate.isPaused())
                {
                    flag = true;
                }
            }
            episodeadapter.a(s, flag);
            return;
        } else
        {
            CollectionEpisodesFragment.a(a).a(null, false);
            return;
        }
    }

    (CollectionEpisodesFragment collectionepisodesfragment)
    {
        a = collectionepisodesfragment;
        super();
    }
}
