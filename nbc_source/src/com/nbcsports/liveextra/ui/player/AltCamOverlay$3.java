// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import android.widget.TextView;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamOverlay

class ntListenerStub extends PlaybackEventListenerStub
{

    final AltCamOverlay this$0;

    public void onPlayStart()
    {
        super.onPlayStart();
        showIndicator(true);
        container.setVisibility(8);
        camsAvailable.setVisibility(8);
        scrollView.setVisibility(8);
        AltCamOverlay.access$102(AltCamOverlay.this, true);
    }

    ntListenerStub()
    {
        this$0 = AltCamOverlay.this;
        super();
    }
}
