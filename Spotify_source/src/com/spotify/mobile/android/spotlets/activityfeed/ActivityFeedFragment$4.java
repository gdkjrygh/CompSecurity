// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter;
import edg;
import edo;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed:
//            ActivityFeedFragment

final class a
    implements com.spotify.mobile.android.cosmos.player.v2.ver
{

    private String a;
    private boolean b;
    private PlayerTrack c;
    private ActivityFeedFragment d;

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        boolean flag;
        if (!playerstate.entityUri().equals(a) || b != playerstate.isPaused() || !PlayerTrackUtil.areUidsEqual(c, playerstate.track()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a = playerstate.entityUri();
            b = playerstate.isPaused();
            c = playerstate.track();
            ActivityFeedFragment.a(d, playerstate);
            d.Y.notifyDataSetChanged();
        }
        if (ActivityFeedFragment.b(d, playerstate))
        {
            ActivityFeedFragment.a(d).a(ActivityFeedFragment.b(d), new edg());
        }
    }

    ryAdapter(ActivityFeedFragment activityfeedfragment)
    {
        d = activityfeedfragment;
        super();
        a = "";
    }
}
