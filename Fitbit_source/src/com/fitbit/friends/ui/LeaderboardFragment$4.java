// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.widget.ListView;
import com.fitbit.util.ap;

// Referenced classes of package com.fitbit.friends.ui:
//            LeaderboardFragment

class b
    implements Runnable
{

    final Context a;
    final c b;
    final LeaderboardFragment c;

    public void run()
    {
        int i = ap.a(a, 53.3F);
        LeaderboardFragment.c(c).setSelectionFromTop(b(b), Math.round((float)(LeaderboardFragment.c(c).getHeight() - i) / 2.0F));
    }

    (LeaderboardFragment leaderboardfragment, Context context,  )
    {
        c = leaderboardfragment;
        a = context;
        b = ;
        super();
    }
}
