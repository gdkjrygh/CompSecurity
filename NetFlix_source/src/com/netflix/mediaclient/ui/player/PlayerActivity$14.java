// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.media.JPlayer.SecondSurface;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity

class this._cls0
    implements Runnable
{

    final PlayerActivity this$0;

    public void run()
    {
        SecondSurface secondsurface = PlayerActivity.access$2200(PlayerActivity.this);
        if (secondsurface != null)
        {
            secondsurface.setSurfaceVisible();
        }
    }

    _cls9()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
