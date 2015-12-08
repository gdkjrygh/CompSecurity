// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamOverlay

class this._cls0
    implements Runnable
{

    final AltCamOverlay this$0;

    public void run()
    {
        setVisibility(0);
        container.setVisibility(8);
        showCamList(false);
        showIndicator(true);
    }

    ()
    {
        this$0 = AltCamOverlay.this;
        super();
    }
}
