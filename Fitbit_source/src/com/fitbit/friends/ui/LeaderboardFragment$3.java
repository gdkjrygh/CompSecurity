// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.support.v4.app.LoaderManager;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.friends.ui:
//            LeaderboardFragment

class a
    implements 
{

    final LeaderboardFragment a;

    public void a()
    {
        LeaderboardFragment.a(a, true);
        a.getLoaderManager().restartLoader(141, null, a);
    }

    public void b()
    {
    }

    public void c()
    {
        s.a(a.getActivity(), 0x7f080568, 0).i();
    }

    (LeaderboardFragment leaderboardfragment)
    {
        a = leaderboardfragment;
        super();
    }
}
