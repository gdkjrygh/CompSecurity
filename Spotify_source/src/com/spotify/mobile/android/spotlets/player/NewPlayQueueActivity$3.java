// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.view.View;
import android.widget.AdapterView;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import ezz;
import faa;
import fab;

// Referenced classes of package com.spotify.mobile.android.spotlets.player:
//            NewPlayQueueActivity

final class a
    implements android.widget.Listener
{

    private NewPlayQueueActivity a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = NewPlayQueueActivity.a(a);
        if (i != 0)
        {
            view = ((faa) (adapterview)).b.a(i);
            boolean flag = ((faa) (adapterview)).b.b(i);
            ((faa) (adapterview)).c.skipToFutureTrack(view);
            if (flag)
            {
                ((faa) (adapterview)).a.h();
            }
        }
    }

    (NewPlayQueueActivity newplayqueueactivity)
    {
        a = newplayqueueactivity;
        super();
    }
}
