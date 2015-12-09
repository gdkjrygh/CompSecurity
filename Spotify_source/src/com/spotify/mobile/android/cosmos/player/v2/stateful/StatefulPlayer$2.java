// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import com.spotify.mobile.android.cosmos.player.v2.Player;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayer

class this._cls0
    implements Runnable
{

    final StatefulPlayer this$0;

    public void run()
    {
        StatefulPlayer.access$100(StatefulPlayer.this).resume();
    }

    ()
    {
        this$0 = StatefulPlayer.this;
        super();
    }
}
