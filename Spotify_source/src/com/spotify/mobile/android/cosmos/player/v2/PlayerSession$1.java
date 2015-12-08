// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import java.util.List;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            PlayerSession

class this._cls0
    implements ack
{

    final PlayerSession this$0;

    public void onPlayForbidden(List list)
    {
    }

    public void onPlaySuccess()
    {
        PlayerSession.access$002(PlayerSession.this, null);
    }

    ack()
    {
        this$0 = PlayerSession.this;
        super();
    }
}
