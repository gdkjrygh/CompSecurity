// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed;

import com.spotify.android.paste.widget.EmptyView;
import gab;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed:
//            ActivityFeedFragment

final class a
    implements gab
{

    private ActivityFeedFragment a;

    public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.entState entstate)
    {
        if (entstate == com.spotify.mobile.android.ui.stuff.entState.d)
        {
            emptyview.a(ActivityFeedFragment.e(a));
            return;
        } else
        {
            emptyview.a(null);
            return;
        }
    }

    (ActivityFeedFragment activityfeedfragment)
    {
        a = activityfeedfragment;
        super();
    }
}
