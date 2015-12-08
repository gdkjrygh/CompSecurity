// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class this._cls0
    implements Runnable
{

    final PlayerControlBar this$0;

    public void run()
    {
        if (!PlayerControlBar.access$100(PlayerControlBar.this) && playBar != null && playBar.getVisibility() != 0)
        {
            playBar.setVisibility(0);
        }
    }

    ()
    {
        this$0 = PlayerControlBar.this;
        super();
    }
}
