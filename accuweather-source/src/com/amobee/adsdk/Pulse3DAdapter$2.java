// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import com.amobee.pulse3d.Pulse3DView;

// Referenced classes of package com.amobee.adsdk:
//            Pulse3DAdapter

class val.view
    implements Runnable
{

    final Pulse3DAdapter this$0;
    private final Pulse3DView val$view;

    public void run()
    {
        val$view.setVisibility(4);
        fireAdFailed(networkName, false);
    }

    ()
    {
        this$0 = final_pulse3dadapter;
        val$view = Pulse3DView.this;
        super();
    }
}
