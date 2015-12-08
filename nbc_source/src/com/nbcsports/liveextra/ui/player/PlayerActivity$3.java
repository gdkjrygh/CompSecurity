// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.squareup.okhttp.Call;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

class this._cls0
    implements Runnable
{

    final PlayerActivity this$0;

    public void run()
    {
        if (PlayerActivity.access$100(PlayerActivity.this) != null)
        {
            PlayerActivity.access$100(PlayerActivity.this).cancel();
        }
    }

    ()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
