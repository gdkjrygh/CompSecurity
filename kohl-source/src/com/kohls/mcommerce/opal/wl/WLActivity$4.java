// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl;


// Referenced classes of package com.kohls.mcommerce.opal.wl:
//            WLActivity, HybridScreen

class val.screen
    implements Runnable
{

    final WLActivity this$0;
    final HybridScreen val$screen;

    public void run()
    {
        WLActivity.access$102(WLActivity.this, val$screen.getScreenTitle());
        setActionBarTitle(WLActivity.access$100(WLActivity.this));
        .SwitchMap.com.kohls.mcommerce.opal.wl.HybridScreen[val$screen.ordinal()];
        JVM INSTR tableswitch 1 10: default 96
    //                   1 121
    //                   2 121
    //                   3 133
    //                   4 133
    //                   5 133
    //                   6 133
    //                   7 133
    //                   8 133
    //                   9 133
    //                   10 133;
           goto _L1 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L3
_L1:
        WLActivity.access$202(WLActivity.this, 8);
_L5:
        WLActivity.access$300(WLActivity.this, WLActivity.access$200(WLActivity.this));
        return;
_L2:
        WLActivity.access$202(WLActivity.this, 0);
        continue; /* Loop/switch isn't completed */
_L3:
        WLActivity.access$202(WLActivity.this, 8);
        startIdleTimer();
        if (true) goto _L5; else goto _L4
_L4:
    }

    ()
    {
        this$0 = final_wlactivity;
        val$screen = HybridScreen.this;
        super();
    }
}
