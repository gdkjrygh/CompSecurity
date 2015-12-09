// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.spotlets.activityfeed.adapter.ActivityFeedStoryAdapter;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StreamsModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.UserModel;
import com.spotify.mobile.android.spotlets.activityfeed.util.ActivityFeedClientEventLogger;
import gms;
import u;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed:
//            ActivityFeedFragment

final class a
    implements android.widget.Listener
{

    private ActivityFeedFragment a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (a.Y.getCount() != 0)
        {
            ActivityFeedFragment.a(a, a.Y.a(i));
            ActivityFeedFragment.a(a, (int)l);
            adapterview = a.Y.b(i);
            switch (a[adapterview.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                a.k().startActivity(gms.a(a.k(), ActivityFeedFragment.f(a).getAuthor().getUri()).a);
                ActivityFeedFragment.d(a).a(com.spotify.mobile.android.spotlets.activityfeed.util.Logger.StoryAction.a, ActivityFeedFragment.f(a), i);
                return;

            case 2: // '\002'
                ActivityFeedFragment.a(a, ActivityFeedFragment.f(a), i);
                ActivityFeedFragment.d(a).a(com.spotify.mobile.android.spotlets.activityfeed.util.Logger.StoryAction.b, ActivityFeedFragment.f(a), i);
                return;

            case 3: // '\003'
                break;
            }
            if (ActivityFeedFragment.f(a).getStreams().getCount() > 0)
            {
                adapterview = new Bundle();
                adapterview.putString("spotify:internal:social-feed:reactors:story_id", ActivityFeedFragment.f(a).getId());
                a.k().startActivity(gms.a(a.k(), "spotify:internal:social-feed:reactors").a(adapterview).a);
                ActivityFeedFragment.d(a).a(com.spotify.mobile.android.spotlets.activityfeed.util.Logger.StoryAction.c, ActivityFeedFragment.f(a), i);
                return;
            }
        }
    }

    EventLogger(ActivityFeedFragment activityfeedfragment)
    {
        a = activityfeedfragment;
        super();
    }
}
