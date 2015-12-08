// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;


// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, PlayerQosOverlayView

class er extends AbstractPresenterListener
{

    final PlayerQosOverlayView this$0;

    public void onHideChrome()
    {
        super.onHideChrome();
        setVisibility(8);
    }

    public void onToggleQos()
    {
        super.onToggleQos();
        toggleQoS();
    }

    er()
    {
        this$0 = PlayerQosOverlayView.this;
        super();
    }
}
